package publicadores;

public class ControladorPublishProxy implements publicadores.ControladorPublish {
  private String _endpoint = null;
  private publicadores.ControladorPublish controladorPublish = null;
  
  public ControladorPublishProxy() {
    _initControladorPublishProxy();
  }
  
  public ControladorPublishProxy(String endpoint) {
    _endpoint = endpoint;
    _initControladorPublishProxy();
  }
  
  private void _initControladorPublishProxy() {
    try {
      controladorPublish = (new publicadores.ControladorPublishServiceLocator()).getControladorPublishPort();
      if (controladorPublish != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)controladorPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)controladorPublish)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (controladorPublish != null)
      ((javax.xml.rpc.Stub)controladorPublish)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publicadores.ControladorPublish getControladorPublish() {
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish;
  }
  
  public java.lang.String[] listarProfesoresInt(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarProfesoresInt(arg0);
  }
  
  public java.lang.String[] listarInstituciones() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarInstituciones();
  }
  
  public java.lang.String[] listarClase(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarClase(arg0, arg1);
  }
  
  public publicadores.DtActDeportiva elegirActividad(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.elegirActividad(arg0, arg1);
  }
  
  public java.lang.String[] listarActividades(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarActividades(arg0);
  }
  
  public publicadores.DtClase elegirClase(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.elegirClase(arg0, arg1, arg2);
  }
  
  public java.lang.String[] listarSocios() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarSocios();
  }
  
  public publicadores.DtClase[] listarDatoClase(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarDatoClase(arg0, arg1);
  }
  
  public java.lang.String[] listarUsuario() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarUsuario();
  }
  
  public publicadores.DtUsuario obtenerUsuario(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.obtenerUsuario(arg0);
  }
  
  public publicadores.DtClase[] listarDatoClasedeS(publicadores.DtSocio arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarDatoClasedeS(arg0);
  }
  
  public publicadores.DtClase[] listarDatoClasedeP(publicadores.DtProfesor arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarDatoClasedeP(arg0);
  }
  
  public publicadores.DtActDeportiva[] listarDatoActdepP(publicadores.DtProfesor arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarDatoActdepP(arg0);
  }
  
  public publicadores.DtActDeportiva[] obtenerActividadesDdeUnaInt(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.obtenerActividadesDdeUnaInt(arg0);
  }
  
  public java.lang.String[] listarInstitucionesM() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarInstitucionesM();
  }
  
  public publicadores.DtInstitucionD[] listadoDtIntiDtInstitucion() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listadoDtIntiDtInstitucion();
  }
  
  public publicadores.DtActDeportiva[] rankingDeActividadesD() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.rankingDeActividadesD();
  }
  
  public publicadores.DtClase[] rankingDeClases() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.rankingDeClases();
  }
  
  public publicadores.DtUsuario[] listarDtUsuario() throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.listarDtUsuario();
  }
  
  public publicadores.DtUsuario login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.login(arg0, arg1);
  }
  
  public publicadores.DtClase buscarclase(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.buscarclase(arg0);
  }
  
  public publicadores.DtActDeportiva buscaractividad(java.lang.String arg0) throws java.rmi.RemoteException{
    if (controladorPublish == null)
      _initControladorPublishProxy();
    return controladorPublish.buscaractividad(arg0);
  }
  
  
}