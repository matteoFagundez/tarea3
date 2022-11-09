/**
 * DtActDeportiva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public class DtActDeportiva  implements java.io.Serializable {
    private java.lang.String nombre;

    private java.lang.String descripcion;

    private int duracion;

    private float costo;

    private java.util.Calendar fecha;

    private java.lang.String urlI;

    private byte[] imagen;

    public DtActDeportiva() {
    }

    public DtActDeportiva(
           java.lang.String nombre,
           java.lang.String descripcion,
           int duracion,
           float costo,
           java.util.Calendar fecha,
           java.lang.String urlI,
           byte[] imagen) {
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.duracion = duracion;
           this.costo = costo;
           this.fecha = fecha;
           this.urlI = urlI;
           this.imagen = imagen;
    }


    /**
     * Gets the nombre value for this DtActDeportiva.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DtActDeportiva.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this DtActDeportiva.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DtActDeportiva.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the duracion value for this DtActDeportiva.
     * 
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this DtActDeportiva.
     * 
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the costo value for this DtActDeportiva.
     * 
     * @return costo
     */
    public float getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this DtActDeportiva.
     * 
     * @param costo
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }


    /**
     * Gets the fecha value for this DtActDeportiva.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DtActDeportiva.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the urlI value for this DtActDeportiva.
     * 
     * @return urlI
     */
    public java.lang.String getUrlI() {
        return urlI;
    }


    /**
     * Sets the urlI value for this DtActDeportiva.
     * 
     * @param urlI
     */
    public void setUrlI(java.lang.String urlI) {
        this.urlI = urlI;
    }


    /**
     * Gets the imagen value for this DtActDeportiva.
     * 
     * @return imagen
     */
    public byte[] getImagen() {
        return imagen;
    }


    /**
     * Sets the imagen value for this DtActDeportiva.
     * 
     * @param imagen
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtActDeportiva)) return false;
        DtActDeportiva other = (DtActDeportiva) obj;
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
            this.duracion == other.getDuracion() &&
            this.costo == other.getCosto() &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.urlI==null && other.getUrlI()==null) || 
             (this.urlI!=null &&
              this.urlI.equals(other.getUrlI()))) &&
            ((this.imagen==null && other.getImagen()==null) || 
             (this.imagen!=null &&
              java.util.Arrays.equals(this.imagen, other.getImagen())));
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
        _hashCode += getDuracion();
        _hashCode += new Float(getCosto()).hashCode();
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtActDeportiva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://publicadores/", "dtActDeportiva"));
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
        elemField.setFieldName("duracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("urlI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UrlI"));
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
