/**
 * DtClase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtClase  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.util.Calendar fecha;

    private java.util.Calendar horaInicio;

    private java.lang.String url;

    private java.util.Calendar fechaReg;

    private java.lang.String urlI;

    private byte[] imagen;

    private publicadores.DtRegistro[] registros;

    private java.lang.String profe;

    private publicadores.DtActDeportiva act;

    public DtClase() {
    }

    public DtClase(
           java.lang.String nombre,
           java.util.Calendar fecha,
           java.util.Calendar horaInicio,
           java.lang.String url,
           java.util.Calendar fechaReg,
           java.lang.String urlI,
           byte[] imagen,
           publicadores.DtRegistro[] registros,
           java.lang.String profe,
           publicadores.DtActDeportiva act) {
           this.nombre = nombre;
           this.fecha = fecha;
           this.horaInicio = horaInicio;
           this.url = url;
           this.fechaReg = fechaReg;
           this.urlI = urlI;
           this.imagen = imagen;
           this.registros = registros;
           this.profe = profe;
           this.act = act;
    }


    /**
     * Gets the nombre value for this DtClase.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtClase.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fecha value for this DtClase.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DtClase.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the horaInicio value for this DtClase.
     * 
     * @return horaInicio
     */
    public java.util.Calendar getHoraInicio() {
        return horaInicio;
    }


    /**
     * Sets the horaInicio value for this DtClase.
     * 
     * @param horaInicio
     */
    public void setHoraInicio(java.util.Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }


    /**
     * Gets the url value for this DtClase.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DtClase.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the fechaReg value for this DtClase.
     * 
     * @return fechaReg
     */
    public java.util.Calendar getFechaReg() {
        return fechaReg;
    }


    /**
     * Sets the fechaReg value for this DtClase.
     * 
     * @param fechaReg
     */
    public void setFechaReg(java.util.Calendar fechaReg) {
        this.fechaReg = fechaReg;
    }


    /**
     * Gets the urlI value for this DtClase.
     * 
     * @return urlI
     */
    public java.lang.String getUrlI() {
        return urlI;
    }


    /**
     * Sets the urlI value for this DtClase.
     * 
     * @param urlI
     */
    public void setUrlI(java.lang.String urlI) {
        this.urlI = urlI;
    }


    /**
     * Gets the imagen value for this DtClase.
     * 
     * @return imagen
     */
    public byte[] getImagen() {
        return imagen;
    }


    /**
     * Sets the imagen value for this DtClase.
     * 
     * @param imagen
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }


    /**
     * Gets the registros value for this DtClase.
     * 
     * @return registros
     */
    public publicadores.DtRegistro[] getRegistros() {
        return registros;
    }


    /**
     * Sets the registros value for this DtClase.
     * 
     * @param registros
     */
    public void setRegistros(publicadores.DtRegistro[] registros) {
        this.registros = registros;
    }

    public publicadores.DtRegistro getRegistros(int i) {
        return this.registros[i];
    }

    public void setRegistros(int i, publicadores.DtRegistro _value) {
        this.registros[i] = _value;
    }


    /**
     * Gets the profe value for this DtClase.
     * 
     * @return profe
     */
    public java.lang.String getProfe() {
        return profe;
    }


    /**
     * Sets the profe value for this DtClase.
     * 
     * @param profe
     */
    public void setProfe(java.lang.String profe) {
        this.profe = profe;
    }


    /**
     * Gets the act value for this DtClase.
     * 
     * @return act
     */
    public publicadores.DtActDeportiva getAct() {
        return act;
    }


    /**
     * Sets the act value for this DtClase.
     * 
     * @param act
     */
    public void setAct(publicadores.DtActDeportiva act) {
        this.act = act;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtClase)) return false;
        DtClase other = (DtClase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.horaInicio==null && other.getHoraInicio()==null) || 
             (this.horaInicio!=null &&
              this.horaInicio.equals(other.getHoraInicio()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.fechaReg==null && other.getFechaReg()==null) || 
             (this.fechaReg!=null &&
              this.fechaReg.equals(other.getFechaReg()))) &&
            ((this.urlI==null && other.getUrlI()==null) || 
             (this.urlI!=null &&
              this.urlI.equals(other.getUrlI()))) &&
            ((this.imagen==null && other.getImagen()==null) || 
             (this.imagen!=null &&
              java.util.Arrays.equals(this.imagen, other.getImagen()))) &&
            ((this.registros==null && other.getRegistros()==null) || 
             (this.registros!=null &&
              java.util.Arrays.equals(this.registros, other.getRegistros()))) &&
            ((this.profe==null && other.getProfe()==null) || 
             (this.profe!=null &&
              this.profe.equals(other.getProfe()))) &&
            ((this.act==null && other.getAct()==null) || 
             (this.act!=null &&
              this.act.equals(other.getAct())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getHoraInicio() != null) {
            _hashCode += getHoraInicio().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getFechaReg() != null) {
            _hashCode += getFechaReg().hashCode();
        }
        if (getUrlI() != null) {
            _hashCode += getUrlI().hashCode();
        }
        if (getImagen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImagen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImagen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfe() != null) {
            _hashCode += getProfe().hashCode();
        }
        if (getAct() != null) {
            _hashCode += getAct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtClase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtClase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaReg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaReg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtRegistro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("act");
        elemField.setXmlName(new javax.xml.namespace.QName("", "act"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtActDeportiva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
