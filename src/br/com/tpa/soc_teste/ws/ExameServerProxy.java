package br.com.tpa.soc_teste.ws;

public class ExameServerProxy implements br.com.tpa.soc_teste.ws.ExameServer {
  private String _endpoint = null;
  private br.com.tpa.soc_teste.ws.ExameServer exameServer = null;
  
  public ExameServerProxy() {
    _initExameServerProxy();
  }
  
  public ExameServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initExameServerProxy();
  }
  
  private void _initExameServerProxy() {
    try {
      exameServer = (new br.com.tpa.soc_teste.ws.ExameServerImplServiceLocator()).getExameServerImplPort();
      if (exameServer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)exameServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)exameServer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (exameServer != null)
      ((javax.xml.rpc.Stub)exameServer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.tpa.soc_teste.ws.ExameServer getExameServer() {
    if (exameServer == null)
      _initExameServerProxy();
    return exameServer;
  }
  
  public void inserir(br.com.tpa.soc_teste.ws.Exame arg0) throws java.rmi.RemoteException{
    if (exameServer == null)
      _initExameServerProxy();
    exameServer.inserir(arg0);
  }
  
  public void atualizar(br.com.tpa.soc_teste.ws.Exame arg0) throws java.rmi.RemoteException{
    if (exameServer == null)
      _initExameServerProxy();
    exameServer.atualizar(arg0);
  }
  
  public void excluir(long arg0) throws java.rmi.RemoteException{
    if (exameServer == null)
      _initExameServerProxy();
    exameServer.excluir(arg0);
  }
  
  public br.com.tpa.soc_teste.ws.Exame[] listar() throws java.rmi.RemoteException{
    if (exameServer == null)
      _initExameServerProxy();
    return exameServer.listar();
  }
  
  public br.com.tpa.soc_teste.ws.Exame buscarExame(long arg0) throws java.rmi.RemoteException{
    if (exameServer == null)
      _initExameServerProxy();
    return exameServer.buscarExame(arg0);
  }
  
  
}