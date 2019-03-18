/**
 * DoShowItemInfoExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagisoft.datafetcher.soap.model;

public class DoShowItemInfoExtResponse  implements java.io.Serializable {
    private com.pagisoft.datafetcher.soap.model.ItemInfoExt itemListInfoExt;

    private com.pagisoft.datafetcher.soap.model.ItemCatList[] itemCatPath;

    private com.pagisoft.datafetcher.soap.model.ItemImageList[] itemImgList;

    private com.pagisoft.datafetcher.soap.model.AttribStruct[] itemAttribList;

    private com.pagisoft.datafetcher.soap.model.PostageStruct[] itemPostageOptions;

    private com.pagisoft.datafetcher.soap.model.ItemPaymentOptions itemPaymentOptions;

    private com.pagisoft.datafetcher.soap.model.CompanyInfoStruct itemCompanyInfo;

    private com.pagisoft.datafetcher.soap.model.ProductStruct itemProductInfo;

    private java.lang.String itemVariants;

    private com.pagisoft.datafetcher.soap.model.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions;

    private java.lang.String itemAdditionalServicesGroup;

    public DoShowItemInfoExtResponse() {
    }

    public DoShowItemInfoExtResponse(
           com.pagisoft.datafetcher.soap.model.ItemInfoExt itemListInfoExt,
           com.pagisoft.datafetcher.soap.model.ItemCatList[] itemCatPath,
           com.pagisoft.datafetcher.soap.model.ItemImageList[] itemImgList,
           com.pagisoft.datafetcher.soap.model.AttribStruct[] itemAttribList,
           com.pagisoft.datafetcher.soap.model.PostageStruct[] itemPostageOptions,
           com.pagisoft.datafetcher.soap.model.ItemPaymentOptions itemPaymentOptions,
           com.pagisoft.datafetcher.soap.model.CompanyInfoStruct itemCompanyInfo,
           com.pagisoft.datafetcher.soap.model.ProductStruct itemProductInfo,
           java.lang.String itemVariants,
           com.pagisoft.datafetcher.soap.model.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions,
           java.lang.String itemAdditionalServicesGroup) {
           this.itemListInfoExt = itemListInfoExt;
           this.itemCatPath = itemCatPath;
           this.itemImgList = itemImgList;
           this.itemAttribList = itemAttribList;
           this.itemPostageOptions = itemPostageOptions;
           this.itemPaymentOptions = itemPaymentOptions;
           this.itemCompanyInfo = itemCompanyInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemVariants = itemVariants;
           this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
           this.itemAdditionalServicesGroup = itemAdditionalServicesGroup;
    }


    /**
     * Gets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @return itemListInfoExt
     */
    public com.pagisoft.datafetcher.soap.model.ItemInfoExt getItemListInfoExt() {
        return itemListInfoExt;
    }


    /**
     * Sets the itemListInfoExt value for this DoShowItemInfoExtResponse.
     * 
     * @param itemListInfoExt
     */
    public void setItemListInfoExt(com.pagisoft.datafetcher.soap.model.ItemInfoExt itemListInfoExt) {
        this.itemListInfoExt = itemListInfoExt;
    }


    /**
     * Gets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCatPath
     */
    public com.pagisoft.datafetcher.soap.model.ItemCatList[] getItemCatPath() {
        return itemCatPath;
    }


    /**
     * Sets the itemCatPath value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCatPath
     */
    public void setItemCatPath(com.pagisoft.datafetcher.soap.model.ItemCatList[] itemCatPath) {
        this.itemCatPath = itemCatPath;
    }


    /**
     * Gets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemImgList
     */
    public com.pagisoft.datafetcher.soap.model.ItemImageList[] getItemImgList() {
        return itemImgList;
    }


    /**
     * Sets the itemImgList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemImgList
     */
    public void setItemImgList(com.pagisoft.datafetcher.soap.model.ItemImageList[] itemImgList) {
        this.itemImgList = itemImgList;
    }


    /**
     * Gets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAttribList
     */
    public com.pagisoft.datafetcher.soap.model.AttribStruct[] getItemAttribList() {
        return itemAttribList;
    }


    /**
     * Sets the itemAttribList value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAttribList
     */
    public void setItemAttribList(com.pagisoft.datafetcher.soap.model.AttribStruct[] itemAttribList) {
        this.itemAttribList = itemAttribList;
    }


    /**
     * Gets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPostageOptions
     */
    public com.pagisoft.datafetcher.soap.model.PostageStruct[] getItemPostageOptions() {
        return itemPostageOptions;
    }


    /**
     * Sets the itemPostageOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPostageOptions
     */
    public void setItemPostageOptions(com.pagisoft.datafetcher.soap.model.PostageStruct[] itemPostageOptions) {
        this.itemPostageOptions = itemPostageOptions;
    }


    /**
     * Gets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemPaymentOptions
     */
    public com.pagisoft.datafetcher.soap.model.ItemPaymentOptions getItemPaymentOptions() {
        return itemPaymentOptions;
    }


    /**
     * Sets the itemPaymentOptions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemPaymentOptions
     */
    public void setItemPaymentOptions(com.pagisoft.datafetcher.soap.model.ItemPaymentOptions itemPaymentOptions) {
        this.itemPaymentOptions = itemPaymentOptions;
    }


    /**
     * Gets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemCompanyInfo
     */
    public com.pagisoft.datafetcher.soap.model.CompanyInfoStruct getItemCompanyInfo() {
        return itemCompanyInfo;
    }


    /**
     * Sets the itemCompanyInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemCompanyInfo
     */
    public void setItemCompanyInfo(com.pagisoft.datafetcher.soap.model.CompanyInfoStruct itemCompanyInfo) {
        this.itemCompanyInfo = itemCompanyInfo;
    }


    /**
     * Gets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @return itemProductInfo
     */
    public com.pagisoft.datafetcher.soap.model.ProductStruct getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this DoShowItemInfoExtResponse.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(com.pagisoft.datafetcher.soap.model.ProductStruct itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @return itemVariants
     */
    public java.lang.String getItemVariants() {
        return itemVariants;
    }


    /**
     * Sets the itemVariants value for this DoShowItemInfoExtResponse.
     * 
     * @param itemVariants
     */
    public void setItemVariants(java.lang.String itemVariants) {
        this.itemVariants = itemVariants;
    }


    /**
     * Gets the itemAfterSalesServiceConditions value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAfterSalesServiceConditions
     */
    public com.pagisoft.datafetcher.soap.model.AfterSalesServiceConditionsStruct getItemAfterSalesServiceConditions() {
        return itemAfterSalesServiceConditions;
    }


    /**
     * Sets the itemAfterSalesServiceConditions value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAfterSalesServiceConditions
     */
    public void setItemAfterSalesServiceConditions(com.pagisoft.datafetcher.soap.model.AfterSalesServiceConditionsStruct itemAfterSalesServiceConditions) {
        this.itemAfterSalesServiceConditions = itemAfterSalesServiceConditions;
    }


    /**
     * Gets the itemAdditionalServicesGroup value for this DoShowItemInfoExtResponse.
     * 
     * @return itemAdditionalServicesGroup
     */
    public java.lang.String getItemAdditionalServicesGroup() {
        return itemAdditionalServicesGroup;
    }


    /**
     * Sets the itemAdditionalServicesGroup value for this DoShowItemInfoExtResponse.
     * 
     * @param itemAdditionalServicesGroup
     */
    public void setItemAdditionalServicesGroup(java.lang.String itemAdditionalServicesGroup) {
        this.itemAdditionalServicesGroup = itemAdditionalServicesGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowItemInfoExtResponse)) return false;
        DoShowItemInfoExtResponse other = (DoShowItemInfoExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemListInfoExt==null && other.getItemListInfoExt()==null) || 
             (this.itemListInfoExt!=null &&
              this.itemListInfoExt.equals(other.getItemListInfoExt()))) &&
            ((this.itemCatPath==null && other.getItemCatPath()==null) || 
             (this.itemCatPath!=null &&
              java.util.Arrays.equals(this.itemCatPath, other.getItemCatPath()))) &&
            ((this.itemImgList==null && other.getItemImgList()==null) || 
             (this.itemImgList!=null &&
              java.util.Arrays.equals(this.itemImgList, other.getItemImgList()))) &&
            ((this.itemAttribList==null && other.getItemAttribList()==null) || 
             (this.itemAttribList!=null &&
              java.util.Arrays.equals(this.itemAttribList, other.getItemAttribList()))) &&
            ((this.itemPostageOptions==null && other.getItemPostageOptions()==null) || 
             (this.itemPostageOptions!=null &&
              java.util.Arrays.equals(this.itemPostageOptions, other.getItemPostageOptions()))) &&
            ((this.itemPaymentOptions==null && other.getItemPaymentOptions()==null) || 
             (this.itemPaymentOptions!=null &&
              this.itemPaymentOptions.equals(other.getItemPaymentOptions()))) &&
            ((this.itemCompanyInfo==null && other.getItemCompanyInfo()==null) || 
             (this.itemCompanyInfo!=null &&
              this.itemCompanyInfo.equals(other.getItemCompanyInfo()))) &&
            ((this.itemProductInfo==null && other.getItemProductInfo()==null) || 
             (this.itemProductInfo!=null &&
              this.itemProductInfo.equals(other.getItemProductInfo()))) &&
            ((this.itemVariants==null && other.getItemVariants()==null) || 
             (this.itemVariants!=null &&
              this.itemVariants.equals(other.getItemVariants()))) &&
            ((this.itemAfterSalesServiceConditions==null && other.getItemAfterSalesServiceConditions()==null) || 
             (this.itemAfterSalesServiceConditions!=null &&
              this.itemAfterSalesServiceConditions.equals(other.getItemAfterSalesServiceConditions()))) &&
            ((this.itemAdditionalServicesGroup==null && other.getItemAdditionalServicesGroup()==null) || 
             (this.itemAdditionalServicesGroup!=null &&
              this.itemAdditionalServicesGroup.equals(other.getItemAdditionalServicesGroup())));
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
        if (getItemListInfoExt() != null) {
            _hashCode += getItemListInfoExt().hashCode();
        }
        if (getItemCatPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCatPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCatPath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemImgList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemImgList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemImgList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemAttribList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAttribList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAttribList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPostageOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPostageOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPostageOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPaymentOptions() != null) {
            _hashCode += getItemPaymentOptions().hashCode();
        }
        if (getItemCompanyInfo() != null) {
            _hashCode += getItemCompanyInfo().hashCode();
        }
        if (getItemProductInfo() != null) {
            _hashCode += getItemProductInfo().hashCode();
        }
        if (getItemVariants() != null) {
            _hashCode += getItemVariants().hashCode();
        }
        if (getItemAfterSalesServiceConditions() != null) {
            _hashCode += getItemAfterSalesServiceConditions().hashCode();
        }
        if (getItemAdditionalServicesGroup() != null) {
            _hashCode += getItemAdditionalServicesGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowItemInfoExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemListInfoExt");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemListInfoExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCatPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCatPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImgList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemImgList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttribList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAttribList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPostageOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPostageOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPaymentOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemPaymentOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCompanyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemCompanyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemVariants");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemVariants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAfterSalesServiceConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAfterSalesServiceConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AfterSalesServiceConditionsStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAdditionalServicesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAdditionalServicesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
