package Server;

import com.mycompany.smarc.Programa;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends Thread {
	private String nome;
	private String multiCastAddress = "224.0.0.1";
	private static int porta;
	private static InetAddress enderecoGrupo = null;
	private static MulticastSocket soc = null;
	private static ObjectOutputStream saida = null;
	private static ObjectInputStream entrada = null;
	private final int tamanho = 1024 * 4; // tamanho máximo transferência objeto

	public Server(String nome) {
		this.nome = nome;
		try {
			porta = 52684;
			enderecoGrupo = InetAddress.getByName(multiCastAddress);
			soc = new MulticastSocket(porta);
			soc.joinGroup(enderecoGrupo);
		} catch (UnknownHostException e) {
			System.out.println("FALHA UnknownHostException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("FALHA IOException: " + e.getMessage());
		}
	}

	public String receive() {
		byte[] buffer = new byte[tamanho];
		String programa = null;

		try{
			soc.receive(new DatagramPacket(buffer, tamanho, enderecoGrupo, porta));

			ByteArrayInputStream bAEntrada = new ByteArrayInputStream(buffer);
			entrada = new ObjectInputStream(bAEntrada);

			Object objetoLido = entrada.readObject();

			if(objetoLido instanceof Programa) {
				programa = (String) objetoLido;
			}
		} catch (IOException e) {
			System.out.println("recebe( ) : Falha IOException; " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("recebe( ) : Falha ClassNotFoundException; " + e.getMessage());
		}

		return programa;
	}

	public void envia(String programa) {
		try {
			ByteArrayOutputStream bASaida = new ByteArrayOutputStream();
			saida = new ObjectOutputStream(bASaida);

			saida.writeObject(programa);

			byte[] data = bASaida.toByteArray();
			soc.send(new DatagramPacket(data, data.length, enderecoGrupo, porta));

		} catch (IOException e) {
			System.out.println("recebe( ) : Falha IOException; " + e.getMessage());
		}
	}

	@Override
	public void run() {
		int contador = 0;
		String p = null;

		try {
			Thread.sleep(10000);
		} catch (InterruptedException ex) {
			Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
		}

		while (contador < 7) {
			try {
				switch (contador) {
					/*
					case 0: p = new Programa(); break;
					case 1: p = new Programa(); break;
					case 2: p = new Programa(); break;
					case 3: p = new Programa(); break;
					case 4: p = new Programa(); break;
					case 5: p = new Programa(); break;
					case 6: p = new Programa(); break;
					 */
				}

				if (p != null) System.out.println("Enviando programa");

				envia(p);

				Thread.sleep(2000);

				p = receive();

				System.out.println(p);
			} catch (InterruptedException ex){
				Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		contador++;
	}
}
