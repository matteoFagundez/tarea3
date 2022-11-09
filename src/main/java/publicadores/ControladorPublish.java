/**
 * ControladorPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorPublish extends java.rmi.Remote {
    public java.lang.String[] listarProfesoresInt(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarInstituciones() throws java.rmi.RemoteException;
    public java.lang.String[] listarClase(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public publicadores.DtActDeportiva elegirActividad(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String[] listarActividades(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtClase elegirClase(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public java.lang.String[] listarSocios() throws java.rmi.RemoteException;
    public publicadores.DtClase[] listarDatoClase(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.String[] listarUsuario() throws java.rmi.RemoteException;
    public publicadores.DtUsuario obtenerUsuario(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtClase[] listarDatoClasedeS(publicadores.DtSocio arg0) throws java.rmi.RemoteException;
    public publicadores.DtClase[] listarDatoClasedeP(publicadores.DtProfesor arg0) throws java.rmi.RemoteException;
    public publicadores.DtActDeportiva[] listarDatoActdepP(publicadores.DtProfesor arg0) throws java.rmi.RemoteException;
    public publicadores.DtActDeportiva[] obtenerActividadesDdeUnaInt(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] listarInstitucionesM() throws java.rmi.RemoteException;
    public publicadores.DtInstitucionD[] listadoDtIntiDtInstitucion() throws java.rmi.RemoteException;
    public publicadores.DtActDeportiva[] rankingDeActividadesD() throws java.rmi.RemoteException;
    public publicadores.DtClase[] rankingDeClases() throws java.rmi.RemoteException;
    public publicadores.DtUsuario[] listarDtUsuario() throws java.rmi.RemoteException;
    public publicadores.DtUsuario login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public publicadores.DtClase buscarclase(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtActDeportiva buscaractividad(java.lang.String arg0) throws java.rmi.RemoteException;
}
