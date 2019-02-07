/**
 * ExameServerImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.tpa.soc_teste.ws;

public class ExameServerImplServiceLocator extends org.apache.axis.client.Service implements br.com.tpa.soc_teste.ws.ExameServerImplService {

    public ExameServerImplServiceLocator() {
    }


    public ExameServerImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExameServerImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExameServerImplPort
    private java.lang.String ExameServerImplPort_address = "http://localhost:8081/br.com.tpa.soc_teste.ws";

    public java.lang.String getExameServerImplPortAddress() {
        return ExameServerImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExameServerImplPortWSDDServiceName = "ExameServerImplPort";

    public java.lang.String getExameServerImplPortWSDDServiceName() {
        return ExameServerImplPortWSDDServiceName;
    }

    public void setExameServerImplPortWSDDServiceName(java.lang.String name) {
        ExameServerImplPortWSDDServiceName = name;
    }

    public br.com.tpa.soc_teste.ws.ExameServer getExameServerImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExameServerImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExameServerImplPort(endpoint);
    }

    public br.com.tpa.soc_teste.ws.ExameServer getExameServerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.tpa.soc_teste.ws.ExameServerImplPortBindingStub _stub = new br.com.tpa.soc_teste.ws.ExameServerImplPortBindingStub(portAddress, this);
            _stub.setPortName(getExameServerImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExameServerImplPortEndpointAddress(java.lang.String address) {
        ExameServerImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.tpa.soc_teste.ws.ExameServer.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.tpa.soc_teste.ws.ExameServerImplPortBindingStub _stub = new br.com.tpa.soc_teste.ws.ExameServerImplPortBindingStub(new java.net.URL(ExameServerImplPort_address), this);
                _stub.setPortName(getExameServerImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExameServerImplPort".equals(inputPortName)) {
            return getExameServerImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.soc_teste.tpa.com.br/", "ExameServerImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.soc_teste.tpa.com.br/", "ExameServerImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExameServerImplPort".equals(portName)) {
            setExameServerImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
