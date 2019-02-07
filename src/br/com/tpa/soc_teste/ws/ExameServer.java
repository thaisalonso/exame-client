/**
 * ExameServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tpa.soc_teste.ws;

public interface ExameServer extends java.rmi.Remote {
    public void inserir(br.com.tpa.soc_teste.ws.Exame arg0) throws java.rmi.RemoteException;
    public void atualizar(br.com.tpa.soc_teste.ws.Exame arg0) throws java.rmi.RemoteException;
    public void excluir(long arg0) throws java.rmi.RemoteException;
    public br.com.tpa.soc_teste.ws.Exame[] listar() throws java.rmi.RemoteException;
    public br.com.tpa.soc_teste.ws.Exame buscarExame(long arg0) throws java.rmi.RemoteException;
}
