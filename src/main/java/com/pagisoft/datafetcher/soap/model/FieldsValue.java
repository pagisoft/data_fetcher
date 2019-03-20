/**
 * FieldsValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagisoft.datafetcher.soap.model;

public class FieldsValue  implements java.io.Serializable {
    private int fid;

    private java.lang.String fvalueString;

    private java.lang.Integer fvalueInt;

    private java.lang.Float fvalueFloat;

    private byte[] fvalueImage;

    private java.lang.Long fvalueDatetime;

    private java.lang.String fvalueDate;

    private com.pagisoft.datafetcher.soap.model.RangeIntValueStruct fvalueRangeInt;

    private com.pagisoft.datafetcher.soap.model.RangeFloatValueStruct fvalueRangeFloat;

    private com.pagisoft.datafetcher.soap.model.RangeDateValueStruct fvalueRangeDate;

    public FieldsValue() {
    }

    public FieldsValue(
           int fid,
           java.lang.String fvalueString,
           java.lang.Integer fvalueInt,
           java.lang.Float fvalueFloat,
           byte[] fvalueImage,
           java.lang.Long fvalueDatetime,
           java.lang.String fvalueDate,
           com.pagisoft.datafetcher.soap.model.RangeIntValueStruct fvalueRangeInt,
           com.pagisoft.datafetcher.soap.model.RangeFloatValueStruct fvalueRangeFloat,
           com.pagisoft.datafetcher.soap.model.RangeDateValueStruct fvalueRangeDate) {
           this.fid = fid;
           this.fvalueString = fvalueString;
           this.fvalueInt = fvalueInt;
           this.fvalueFloat = fvalueFloat;
           this.fvalueImage = fvalueImage;
           this.fvalueDatetime = fvalueDatetime;
           this.fvalueDate = fvalueDate;
           this.fvalueRangeInt = fvalueRangeInt;
           this.fvalueRangeFloat = fvalueRangeFloat;
           this.fvalueRangeDate = fvalueRangeDate;
    }


    /**
     * Gets the fid value for this FieldsValue.
     * 
     * @return fid
     */
    public int getFid() {
        return fid;
    }


    /**
     * Sets the fid value for this FieldsValue.
     * 
     * @param fid
     */
    public void setFid(int fid) {
        this.fid = fid;
    }


    /**
     * Gets the fvalueString value for this FieldsValue.
     * 
     * @return fvalueString
     */
    public java.lang.String getFvalueString() {
        return fvalueString;
    }


    /**
     * Sets the fvalueString value for this FieldsValue.
     * 
     * @param fvalueString
     */
    public void setFvalueString(java.lang.String fvalueString) {
        this.fvalueString = fvalueString;
    }


    /**
     * Gets the fvalueInt value for this FieldsValue.
     * 
     * @return fvalueInt
     */
    public java.lang.Integer getFvalueInt() {
        return fvalueInt;
    }


    /**
     * Sets the fvalueInt value for this FieldsValue.
     * 
     * @param fvalueInt
     */
    public void setFvalueInt(java.lang.Integer fvalueInt) {
        this.fvalueInt = fvalueInt;
    }


    /**
     * Gets the fvalueFloat value for this FieldsValue.
     * 
     * @return fvalueFloat
     */
    public java.lang.Float getFvalueFloat() {
        return fvalueFloat;
    }


    /**
     * Sets the fvalueFloat value for this FieldsValue.
     * 
     * @param fvalueFloat
     */
    public void setFvalueFloat(java.lang.Float fvalueFloat) {
        this.fvalueFloat = fvalueFloat;
    }


    /**
     * Gets the fvalueImage value for this FieldsValue.
     * 
     * @return fvalueImage
     */
    public byte[] getFvalueImage() {
        return fvalueImage;
    }


    /**
     * Sets the fvalueImage value for this FieldsValue.
     * 
     * @param fvalueImage
     */
    public void setFvalueImage(byte[] fvalueImage) {
        this.fvalueImage = fvalueImage;
    }


    /**
     * Gets the fvalueDatetime value for this FieldsValue.
     * 
     * @return fvalueDatetime
     */
    public java.lang.Long getFvalueDatetime() {
        return fvalueDatetime;
    }


    /**
     * Sets the fvalueDatetime value for this FieldsValue.
     * 
     * @param fvalueDatetime
     */
    public void setFvalueDatetime(java.lang.Long fvalueDatetime) {
        this.fvalueDatetime = fvalueDatetime;
    }


    /**
     * Gets the fvalueDate value for this FieldsValue.
     * 
     * @return fvalueDate
     */
    public java.lang.String getFvalueDate() {
        return fvalueDate;
    }


    /**
     * Sets the fvalueDate value for this FieldsValue.
     * 
     * @param fvalueDate
     */
    public void setFvalueDate(java.lang.String fvalueDate) {
        this.fvalueDate = fvalueDate;
    }


    /**
     * Gets the fvalueRangeInt value for this FieldsValue.
     * 
     * @return fvalueRangeInt
     */
    public com.pagisoft.datafetcher.soap.model.RangeIntValueStruct getFvalueRangeInt() {
        return fvalueRangeInt;
    }


    /**
     * Sets the fvalueRangeInt value for this FieldsValue.
     * 
     * @param fvalueRangeInt
     */
    public void setFvalueRangeInt(com.pagisoft.datafetcher.soap.model.RangeIntValueStruct fvalueRangeInt) {
        this.fvalueRangeInt = fvalueRangeInt;
    }


    /**
     * Gets the fvalueRangeFloat value for this FieldsValue.
     * 
     * @return fvalueRangeFloat
     */
    public com.pagisoft.datafetcher.soap.model.RangeFloatValueStruct getFvalueRangeFloat() {
        return fvalueRangeFloat;
    }


    /**
     * Sets the fvalueRangeFloat value for this FieldsValue.
     * 
     * @param fvalueRangeFloat
     */
    public void setFvalueRangeFloat(com.pagisoft.datafetcher.soap.model.RangeFloatValueStruct fvalueRangeFloat) {
        this.fvalueRangeFloat = fvalueRangeFloat;
    }


    /**
     * Gets the fvalueRangeDate value for this FieldsValue.
     * 
     * @return fvalueRangeDate
     */
    public com.pagisoft.datafetcher.soap.model.RangeDateValueStruct getFvalueRangeDate() {
        return fvalueRangeDate;
    }


    /**
     * Sets the fvalueRangeDate value for this FieldsValue.
     * 
     * @param fvalueRangeDate
     */
    public void setFvalueRangeDate(com.pagisoft.datafetcher.soap.model.RangeDateValueStruct fvalueRangeDate) {
        this.fvalueRangeDate = fvalueRangeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldsValue)) return false;
        FieldsValue other = (FieldsValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fid == other.getFid() &&
            ((this.fvalueString==null && other.getFvalueString()==null) || 
             (this.fvalueString!=null &&
              this.fvalueString.equals(other.getFvalueString()))) &&
            ((this.fvalueInt==null && other.getFvalueInt()==null) || 
             (this.fvalueInt!=null &&
              this.fvalueInt.equals(other.getFvalueInt()))) &&
            ((this.fvalueFloat==null && other.getFvalueFloat()==null) || 
             (this.fvalueFloat!=null &&
              this.fvalueFloat.equals(other.getFvalueFloat()))) &&
            ((this.fvalueImage==null && other.getFvalueImage()==null) || 
             (this.fvalueImage!=null &&
              java.util.Arrays.equals(this.fvalueImage, other.getFvalueImage()))) &&
            ((this.fvalueDatetime==null && other.getFvalueDatetime()==null) || 
             (this.fvalueDatetime!=null &&
              this.fvalueDatetime.equals(other.getFvalueDatetime()))) &&
            ((this.fvalueDate==null && other.getFvalueDate()==null) || 
             (this.fvalueDate!=null &&
              this.fvalueDate.equals(other.getFvalueDate()))) &&
            ((this.fvalueRangeInt==null && other.getFvalueRangeInt()==null) || 
             (this.fvalueRangeInt!=null &&
              this.fvalueRangeInt.equals(other.getFvalueRangeInt()))) &&
            ((this.fvalueRangeFloat==null && other.getFvalueRangeFloat()==null) || 
             (this.fvalueRangeFloat!=null &&
              this.fvalueRangeFloat.equals(other.getFvalueRangeFloat()))) &&
            ((this.fvalueRangeDate==null && other.getFvalueRangeDate()==null) || 
             (this.fvalueRangeDate!=null &&
              this.fvalueRangeDate.equals(other.getFvalueRangeDate())));
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
        _hashCode += getFid();
        if (getFvalueString() != null) {
            _hashCode += getFvalueString().hashCode();
        }
        if (getFvalueInt() != null) {
            _hashCode += getFvalueInt().hashCode();
        }
        if (getFvalueFloat() != null) {
            _hashCode += getFvalueFloat().hashCode();
        }
        if (getFvalueImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFvalueImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFvalueImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFvalueDatetime() != null) {
            _hashCode += getFvalueDatetime().hashCode();
        }
        if (getFvalueDate() != null) {
            _hashCode += getFvalueDate().hashCode();
        }
        if (getFvalueRangeInt() != null) {
            _hashCode += getFvalueRangeInt().hashCode();
        }
        if (getFvalueRangeFloat() != null) {
            _hashCode += getFvalueRangeFloat().hashCode();
        }
        if (getFvalueRangeDate() != null) {
            _hashCode += getFvalueRangeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldsValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueInt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueFloat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueFloat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueDatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueDatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeInt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeFloat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeFloat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fvalueRangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct"));
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