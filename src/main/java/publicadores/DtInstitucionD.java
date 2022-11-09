/**
 * DtInstitucionD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtInstitucionD  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String descripcion;

    private java.lang.String url;

    private publicadores.DtActDeportiva[] actividadesD;

    private publicadores.DtProfesor[] profesores;

    public DtInstitucionD() {
    }

    public DtInstitucionD(
           java.lang.String nombre,
           java.lang.String descripcion,
           java.lang.String url,
           publicadores.DtActDeportiva[] actividadesD,
           publicadores.DtProfesor[] profesores) {
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.url = url;
           this.actividadesD = actividadesD;
           this.profesores = profesores;
    }


    /**
     * Gets the nombre value for this DtInstitucionD.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtInstitucionD.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this DtInstitucionD.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtInstitucionD.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the url value for this DtInstitucionD.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DtInstitucionD.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the actividadesD value for this DtInstitucionD.
     * 
     * @return actividadesD
     */
    public publicadores.DtActDeportiva[] getActividadesD() {
        return actividadesD;
    }


    /**
     * Sets the actividadesD value for this DtInstitucionD.
     * 
     * @param actividadesD
     */
    public void setActividadesD(publicadores.DtActDeportiva[] actividadesD) {
        this.actividadesD = actividadesD;
    }

    public publicadores.DtActDeportiva getActividadesD(int i) {
        return this.actividadesD[i];
    }

    public void setActividadesD(int i, publicadores.DtActDeportiva _value) {
        this.actividadesD[i] = _value;
    }


    /**
     * Gets the profesores value for this DtInstitucionD.
     * 
     * @return profesores
     */
    public publicadores.DtProfesor[] getProfesores() {
        return profesores;
    }


    /**
     * Sets the profesores value for this DtInstitucionD.
     * 
     * @param profesores
     */
    public void setProfesores(publicadores.DtProfesor[] profesores) {
        this.profesores = profesores;
    }

    public publicadores.DtProfesor getProfesores(int i) {
        return this.profesores[i];
    }

    public void setProfesores(int i, publicadores.DtProfesor _value) {
        this.profesores[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtInstitucionD)) return false;
        DtInstitucionD other = (DtInstitucionD) obj;
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
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.actividadesD==null && other.getActividadesD()==null) || 
             (this.actividadesD!=null &&
              java.util.Arrays.equals(this.actividadesD, other.getActividadesD()))) &&
            ((this.profesores==null && other.getProfesores()==null) || 
             (this.profesores!=null &&
              java.util.Arrays.equals(this.profesores, other.getProfesores())));
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
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getActividadesD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActividadesD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActividadesD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfesores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfesores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfesores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtInstitucionD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtInstitucionD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("actividadesD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actividadesD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtActDeportiva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profesores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profesores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtProfesor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
