/**
 * CreativePolicyViolation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public class CreativePolicyViolation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativePolicyViolation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MALWARE_IN_CREATIVE = "MALWARE_IN_CREATIVE";
    public static final java.lang.String _MALWARE_IN_LANDING_PAGE = "MALWARE_IN_LANDING_PAGE";
    public static final java.lang.String _LEGALLY_BLOCKED_REDIRECT_URL = "LEGALLY_BLOCKED_REDIRECT_URL";
    public static final java.lang.String _MISREPRESENTATION_OF_PRODUCT = "MISREPRESENTATION_OF_PRODUCT";
    public static final java.lang.String _SELF_CLICKING_CREATIVE = "SELF_CLICKING_CREATIVE";
    public static final java.lang.String _GAMING_GOOGLE_NETWORK = "GAMING_GOOGLE_NETWORK";
    public static final java.lang.String _DYNAMIC_DNS = "DYNAMIC_DNS";
    public static final java.lang.String _PHISHING = "PHISHING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CreativePolicyViolation MALWARE_IN_CREATIVE = new CreativePolicyViolation(_MALWARE_IN_CREATIVE);
    public static final CreativePolicyViolation MALWARE_IN_LANDING_PAGE = new CreativePolicyViolation(_MALWARE_IN_LANDING_PAGE);
    public static final CreativePolicyViolation LEGALLY_BLOCKED_REDIRECT_URL = new CreativePolicyViolation(_LEGALLY_BLOCKED_REDIRECT_URL);
    public static final CreativePolicyViolation MISREPRESENTATION_OF_PRODUCT = new CreativePolicyViolation(_MISREPRESENTATION_OF_PRODUCT);
    public static final CreativePolicyViolation SELF_CLICKING_CREATIVE = new CreativePolicyViolation(_SELF_CLICKING_CREATIVE);
    public static final CreativePolicyViolation GAMING_GOOGLE_NETWORK = new CreativePolicyViolation(_GAMING_GOOGLE_NETWORK);
    public static final CreativePolicyViolation DYNAMIC_DNS = new CreativePolicyViolation(_DYNAMIC_DNS);
    public static final CreativePolicyViolation PHISHING = new CreativePolicyViolation(_PHISHING);
    public static final CreativePolicyViolation UNKNOWN = new CreativePolicyViolation(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CreativePolicyViolation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativePolicyViolation enumeration = (CreativePolicyViolation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativePolicyViolation fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativePolicyViolation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "CreativePolicyViolation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
