package br.com.tpa.soc_teste.ws;

import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

public class TesteExameClient {
	
	public static void main(String[] args) {
		ExameServer exameServer;
		Exame exame = new Exame();
		try {
			exameServer = new ExameServerImplServiceLocator().getExameServerImplPort();
			exame.setNome("Exame");
			exame.setDescricao("Descrição");
			exameServer.inserir(exame);
			System.out.println("Lista: " + Arrays.toString(exameServer.listar()));
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
	}

}
