/**
 * LiveStreamEventActionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public class LiveStreamEventActionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LiveStreamEventActionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_STATUS_TRANSITION = "INVALID_STATUS_TRANSITION";
    public static final java.lang.String _IS_ARCHIVED = "IS_ARCHIVED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LiveStreamEventActionErrorReason INVALID_STATUS_TRANSITION = new LiveStreamEventActionErrorReason(_INVALID_STATUS_TRANSITION);
    public static final LiveStreamEventActionErrorReason IS_ARCHIVED = new LiveStreamEventActionErrorReason(_IS_ARCHIVED);
    public static final LiveStreamEventActionErrorReason UNKNOWN = new LiveStreamEventActionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LiveStreamEventActionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LiveStreamEventActionErrorReason enumeration = (LiveStreamEventActionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LiveStreamEventActionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LiveStreamEventActionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "LiveStreamEventActionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
