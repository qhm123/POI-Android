/*
 * XML Type:  CT_Property
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties;


/**
 * An XML CT_Property(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties).
 *
 * This is a complex type.
 */
public interface CTProperty extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctproperty5ffatype");
    
    /**
     * Gets the "vector" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector getVector();
    
    /**
     * True if has "vector" element
     */
    boolean isSetVector();
    
    /**
     * Sets the "vector" element
     */
    void setVector(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector vector);
    
    /**
     * Appends and returns a new empty "vector" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector addNewVector();
    
    /**
     * Unsets the "vector" element
     */
    void unsetVector();
    
    /**
     * Gets the "array" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray getArray();
    
    /**
     * True if has "array" element
     */
    boolean isSetArray();
    
    /**
     * Sets the "array" element
     */
    void setArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray array);
    
    /**
     * Appends and returns a new empty "array" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray addNewArray();
    
    /**
     * Unsets the "array" element
     */
    void unsetArray();
    
    /**
     * Gets the "blob" element
     */
    byte[] getBlob();
    
    /**
     * Gets (as xml) the "blob" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetBlob();
    
    /**
     * True if has "blob" element
     */
    boolean isSetBlob();
    
    /**
     * Sets the "blob" element
     */
    void setBlob(byte[] blob);
    
    /**
     * Sets (as xml) the "blob" element
     */
    void xsetBlob(org.apache.xmlbeans.XmlBase64Binary blob);
    
    /**
     * Unsets the "blob" element
     */
    void unsetBlob();
    
    /**
     * Gets the "oblob" element
     */
    byte[] getOblob();
    
    /**
     * Gets (as xml) the "oblob" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOblob();
    
    /**
     * True if has "oblob" element
     */
    boolean isSetOblob();
    
    /**
     * Sets the "oblob" element
     */
    void setOblob(byte[] oblob);
    
    /**
     * Sets (as xml) the "oblob" element
     */
    void xsetOblob(org.apache.xmlbeans.XmlBase64Binary oblob);
    
    /**
     * Unsets the "oblob" element
     */
    void unsetOblob();
    
    /**
     * Gets the "empty" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty getEmpty();
    
    /**
     * True if has "empty" element
     */
    boolean isSetEmpty();
    
    /**
     * Sets the "empty" element
     */
    void setEmpty(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty empty);
    
    /**
     * Appends and returns a new empty "empty" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty addNewEmpty();
    
    /**
     * Unsets the "empty" element
     */
    void unsetEmpty();
    
    /**
     * Gets the "null" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull getNull();
    
    /**
     * True if has "null" element
     */
    boolean isSetNull();
    
    /**
     * Sets the "null" element
     */
    void setNull(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull xnull);
    
    /**
     * Appends and returns a new empty "null" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull addNewNull();
    
    /**
     * Unsets the "null" element
     */
    void unsetNull();
    
    /**
     * Gets the "i1" element
     */
    byte getI1();
    
    /**
     * Gets (as xml) the "i1" element
     */
    org.apache.xmlbeans.XmlByte xgetI1();
    
    /**
     * True if has "i1" element
     */
    boolean isSetI1();
    
    /**
     * Sets the "i1" element
     */
    void setI1(byte i1);
    
    /**
     * Sets (as xml) the "i1" element
     */
    void xsetI1(org.apache.xmlbeans.XmlByte i1);
    
    /**
     * Unsets the "i1" element
     */
    void unsetI1();
    
    /**
     * Gets the "i2" element
     */
    short getI2();
    
    /**
     * Gets (as xml) the "i2" element
     */
    org.apache.xmlbeans.XmlShort xgetI2();
    
    /**
     * True if has "i2" element
     */
    boolean isSetI2();
    
    /**
     * Sets the "i2" element
     */
    void setI2(short i2);
    
    /**
     * Sets (as xml) the "i2" element
     */
    void xsetI2(org.apache.xmlbeans.XmlShort i2);
    
    /**
     * Unsets the "i2" element
     */
    void unsetI2();
    
    /**
     * Gets the "i4" element
     */
    int getI4();
    
    /**
     * Gets (as xml) the "i4" element
     */
    org.apache.xmlbeans.XmlInt xgetI4();
    
    /**
     * True if has "i4" element
     */
    boolean isSetI4();
    
    /**
     * Sets the "i4" element
     */
    void setI4(int i4);
    
    /**
     * Sets (as xml) the "i4" element
     */
    void xsetI4(org.apache.xmlbeans.XmlInt i4);
    
    /**
     * Unsets the "i4" element
     */
    void unsetI4();
    
    /**
     * Gets the "i8" element
     */
    long getI8();
    
    /**
     * Gets (as xml) the "i8" element
     */
    org.apache.xmlbeans.XmlLong xgetI8();
    
    /**
     * True if has "i8" element
     */
    boolean isSetI8();
    
    /**
     * Sets the "i8" element
     */
    void setI8(long i8);
    
    /**
     * Sets (as xml) the "i8" element
     */
    void xsetI8(org.apache.xmlbeans.XmlLong i8);
    
    /**
     * Unsets the "i8" element
     */
    void unsetI8();
    
    /**
     * Gets the "int" element
     */
    int getInt();
    
    /**
     * Gets (as xml) the "int" element
     */
    org.apache.xmlbeans.XmlInt xgetInt();
    
    /**
     * True if has "int" element
     */
    boolean isSetInt();
    
    /**
     * Sets the "int" element
     */
    void setInt(int xint);
    
    /**
     * Sets (as xml) the "int" element
     */
    void xsetInt(org.apache.xmlbeans.XmlInt xint);
    
    /**
     * Unsets the "int" element
     */
    void unsetInt();
    
    /**
     * Gets the "ui1" element
     */
    short getUi1();
    
    /**
     * Gets (as xml) the "ui1" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetUi1();
    
    /**
     * True if has "ui1" element
     */
    boolean isSetUi1();
    
    /**
     * Sets the "ui1" element
     */
    void setUi1(short ui1);
    
    /**
     * Sets (as xml) the "ui1" element
     */
    void xsetUi1(org.apache.xmlbeans.XmlUnsignedByte ui1);
    
    /**
     * Unsets the "ui1" element
     */
    void unsetUi1();
    
    /**
     * Gets the "ui2" element
     */
    int getUi2();
    
    /**
     * Gets (as xml) the "ui2" element
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetUi2();
    
    /**
     * True if has "ui2" element
     */
    boolean isSetUi2();
    
    /**
     * Sets the "ui2" element
     */
    void setUi2(int ui2);
    
    /**
     * Sets (as xml) the "ui2" element
     */
    void xsetUi2(org.apache.xmlbeans.XmlUnsignedShort ui2);
    
    /**
     * Unsets the "ui2" element
     */
    void unsetUi2();
    
    /**
     * Gets the "ui4" element
     */
    long getUi4();
    
    /**
     * Gets (as xml) the "ui4" element
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetUi4();
    
    /**
     * True if has "ui4" element
     */
    boolean isSetUi4();
    
    /**
     * Sets the "ui4" element
     */
    void setUi4(long ui4);
    
    /**
     * Sets (as xml) the "ui4" element
     */
    void xsetUi4(org.apache.xmlbeans.XmlUnsignedInt ui4);
    
    /**
     * Unsets the "ui4" element
     */
    void unsetUi4();
    
    /**
     * Gets the "ui8" element
     */
    java.math.BigInteger getUi8();
    
    /**
     * Gets (as xml) the "ui8" element
     */
    org.apache.xmlbeans.XmlUnsignedLong xgetUi8();
    
    /**
     * True if has "ui8" element
     */
    boolean isSetUi8();
    
    /**
     * Sets the "ui8" element
     */
    void setUi8(java.math.BigInteger ui8);
    
    /**
     * Sets (as xml) the "ui8" element
     */
    void xsetUi8(org.apache.xmlbeans.XmlUnsignedLong ui8);
    
    /**
     * Unsets the "ui8" element
     */
    void unsetUi8();
    
    /**
     * Gets the "uint" element
     */
    long getUint();
    
    /**
     * Gets (as xml) the "uint" element
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetUint();
    
    /**
     * True if has "uint" element
     */
    boolean isSetUint();
    
    /**
     * Sets the "uint" element
     */
    void setUint(long uint);
    
    /**
     * Sets (as xml) the "uint" element
     */
    void xsetUint(org.apache.xmlbeans.XmlUnsignedInt uint);
    
    /**
     * Unsets the "uint" element
     */
    void unsetUint();
    
    /**
     * Gets the "r4" element
     */
    float getR4();
    
    /**
     * Gets (as xml) the "r4" element
     */
    org.apache.xmlbeans.XmlFloat xgetR4();
    
    /**
     * True if has "r4" element
     */
    boolean isSetR4();
    
    /**
     * Sets the "r4" element
     */
    void setR4(float r4);
    
    /**
     * Sets (as xml) the "r4" element
     */
    void xsetR4(org.apache.xmlbeans.XmlFloat r4);
    
    /**
     * Unsets the "r4" element
     */
    void unsetR4();
    
    /**
     * Gets the "r8" element
     */
    double getR8();
    
    /**
     * Gets (as xml) the "r8" element
     */
    org.apache.xmlbeans.XmlDouble xgetR8();
    
    /**
     * True if has "r8" element
     */
    boolean isSetR8();
    
    /**
     * Sets the "r8" element
     */
    void setR8(double r8);
    
    /**
     * Sets (as xml) the "r8" element
     */
    void xsetR8(org.apache.xmlbeans.XmlDouble r8);
    
    /**
     * Unsets the "r8" element
     */
    void unsetR8();
    
    /**
     * Gets the "decimal" element
     */
    java.math.BigDecimal getDecimal();
    
    /**
     * Gets (as xml) the "decimal" element
     */
    org.apache.xmlbeans.XmlDecimal xgetDecimal();
    
    /**
     * True if has "decimal" element
     */
    boolean isSetDecimal();
    
    /**
     * Sets the "decimal" element
     */
    void setDecimal(java.math.BigDecimal decimal);
    
    /**
     * Sets (as xml) the "decimal" element
     */
    void xsetDecimal(org.apache.xmlbeans.XmlDecimal decimal);
    
    /**
     * Unsets the "decimal" element
     */
    void unsetDecimal();
    
    /**
     * Gets the "lpstr" element
     */
    java.lang.String getLpstr();
    
    /**
     * Gets (as xml) the "lpstr" element
     */
    org.apache.xmlbeans.XmlString xgetLpstr();
    
    /**
     * True if has "lpstr" element
     */
    boolean isSetLpstr();
    
    /**
     * Sets the "lpstr" element
     */
    void setLpstr(java.lang.String lpstr);
    
    /**
     * Sets (as xml) the "lpstr" element
     */
    void xsetLpstr(org.apache.xmlbeans.XmlString lpstr);
    
    /**
     * Unsets the "lpstr" element
     */
    void unsetLpstr();
    
    /**
     * Gets the "lpwstr" element
     */
    java.lang.String getLpwstr();
    
    /**
     * Gets (as xml) the "lpwstr" element
     */
    org.apache.xmlbeans.XmlString xgetLpwstr();
    
    /**
     * True if has "lpwstr" element
     */
    boolean isSetLpwstr();
    
    /**
     * Sets the "lpwstr" element
     */
    void setLpwstr(java.lang.String lpwstr);
    
    /**
     * Sets (as xml) the "lpwstr" element
     */
    void xsetLpwstr(org.apache.xmlbeans.XmlString lpwstr);
    
    /**
     * Unsets the "lpwstr" element
     */
    void unsetLpwstr();
    
    /**
     * Gets the "bstr" element
     */
    java.lang.String getBstr();
    
    /**
     * Gets (as xml) the "bstr" element
     */
    org.apache.xmlbeans.XmlString xgetBstr();
    
    /**
     * True if has "bstr" element
     */
    boolean isSetBstr();
    
    /**
     * Sets the "bstr" element
     */
    void setBstr(java.lang.String bstr);
    
    /**
     * Sets (as xml) the "bstr" element
     */
    void xsetBstr(org.apache.xmlbeans.XmlString bstr);
    
    /**
     * Unsets the "bstr" element
     */
    void unsetBstr();
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDate();
    
    /**
     * True if has "date" element
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlDateTime date);
    
    /**
     * Unsets the "date" element
     */
    void unsetDate();
    
    /**
     * Gets the "filetime" element
     */
    java.util.Calendar getFiletime();
    
    /**
     * Gets (as xml) the "filetime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetFiletime();
    
    /**
     * True if has "filetime" element
     */
    boolean isSetFiletime();
    
    /**
     * Sets the "filetime" element
     */
    void setFiletime(java.util.Calendar filetime);
    
    /**
     * Sets (as xml) the "filetime" element
     */
    void xsetFiletime(org.apache.xmlbeans.XmlDateTime filetime);
    
    /**
     * Unsets the "filetime" element
     */
    void unsetFiletime();
    
    /**
     * Gets the "bool" element
     */
    boolean getBool();
    
    /**
     * Gets (as xml) the "bool" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBool();
    
    /**
     * True if has "bool" element
     */
    boolean isSetBool();
    
    /**
     * Sets the "bool" element
     */
    void setBool(boolean bool);
    
    /**
     * Sets (as xml) the "bool" element
     */
    void xsetBool(org.apache.xmlbeans.XmlBoolean bool);
    
    /**
     * Unsets the "bool" element
     */
    void unsetBool();
    
    /**
     * Gets the "cy" element
     */
    java.lang.String getCy();
    
    /**
     * Gets (as xml) the "cy" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy xgetCy();
    
    /**
     * True if has "cy" element
     */
    boolean isSetCy();
    
    /**
     * Sets the "cy" element
     */
    void setCy(java.lang.String cy);
    
    /**
     * Sets (as xml) the "cy" element
     */
    void xsetCy(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy cy);
    
    /**
     * Unsets the "cy" element
     */
    void unsetCy();
    
    /**
     * Gets the "error" element
     */
    java.lang.String getError();
    
    /**
     * Gets (as xml) the "error" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetError();
    
    /**
     * True if has "error" element
     */
    boolean isSetError();
    
    /**
     * Sets the "error" element
     */
    void setError(java.lang.String error);
    
    /**
     * Sets (as xml) the "error" element
     */
    void xsetError(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error);
    
    /**
     * Unsets the "error" element
     */
    void unsetError();
    
    /**
     * Gets the "stream" element
     */
    byte[] getStream();
    
    /**
     * Gets (as xml) the "stream" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetStream();
    
    /**
     * True if has "stream" element
     */
    boolean isSetStream();
    
    /**
     * Sets the "stream" element
     */
    void setStream(byte[] stream);
    
    /**
     * Sets (as xml) the "stream" element
     */
    void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream);
    
    /**
     * Unsets the "stream" element
     */
    void unsetStream();
    
    /**
     * Gets the "ostream" element
     */
    byte[] getOstream();
    
    /**
     * Gets (as xml) the "ostream" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOstream();
    
    /**
     * True if has "ostream" element
     */
    boolean isSetOstream();
    
    /**
     * Sets the "ostream" element
     */
    void setOstream(byte[] ostream);
    
    /**
     * Sets (as xml) the "ostream" element
     */
    void xsetOstream(org.apache.xmlbeans.XmlBase64Binary ostream);
    
    /**
     * Unsets the "ostream" element
     */
    void unsetOstream();
    
    /**
     * Gets the "storage" element
     */
    byte[] getStorage();
    
    /**
     * Gets (as xml) the "storage" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetStorage();
    
    /**
     * True if has "storage" element
     */
    boolean isSetStorage();
    
    /**
     * Sets the "storage" element
     */
    void setStorage(byte[] storage);
    
    /**
     * Sets (as xml) the "storage" element
     */
    void xsetStorage(org.apache.xmlbeans.XmlBase64Binary storage);
    
    /**
     * Unsets the "storage" element
     */
    void unsetStorage();
    
    /**
     * Gets the "ostorage" element
     */
    byte[] getOstorage();
    
    /**
     * Gets (as xml) the "ostorage" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetOstorage();
    
    /**
     * True if has "ostorage" element
     */
    boolean isSetOstorage();
    
    /**
     * Sets the "ostorage" element
     */
    void setOstorage(byte[] ostorage);
    
    /**
     * Sets (as xml) the "ostorage" element
     */
    void xsetOstorage(org.apache.xmlbeans.XmlBase64Binary ostorage);
    
    /**
     * Unsets the "ostorage" element
     */
    void unsetOstorage();
    
    /**
     * Gets the "vstream" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream getVstream();
    
    /**
     * True if has "vstream" element
     */
    boolean isSetVstream();
    
    /**
     * Sets the "vstream" element
     */
    void setVstream(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream vstream);
    
    /**
     * Appends and returns a new empty "vstream" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream addNewVstream();
    
    /**
     * Unsets the "vstream" element
     */
    void unsetVstream();
    
    /**
     * Gets the "clsid" element
     */
    java.lang.String getClsid();
    
    /**
     * Gets (as xml) the "clsid" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetClsid();
    
    /**
     * True if has "clsid" element
     */
    boolean isSetClsid();
    
    /**
     * Sets the "clsid" element
     */
    void setClsid(java.lang.String clsid);
    
    /**
     * Sets (as xml) the "clsid" element
     */
    void xsetClsid(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid clsid);
    
    /**
     * Unsets the "clsid" element
     */
    void unsetClsid();
    
    /**
     * Gets the "cf" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf getCf();
    
    /**
     * True if has "cf" element
     */
    boolean isSetCf();
    
    /**
     * Sets the "cf" element
     */
    void setCf(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf cf);
    
    /**
     * Appends and returns a new empty "cf" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf addNewCf();
    
    /**
     * Unsets the "cf" element
     */
    void unsetCf();
    
    /**
     * Gets the "fmtid" attribute
     */
    java.lang.String getFmtid();
    
    /**
     * Gets (as xml) the "fmtid" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetFmtid();
    
    /**
     * Sets the "fmtid" attribute
     */
    void setFmtid(java.lang.String fmtid);
    
    /**
     * Sets (as xml) the "fmtid" attribute
     */
    void xsetFmtid(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid fmtid);
    
    /**
     * Gets the "pid" attribute
     */
    int getPid();
    
    /**
     * Gets (as xml) the "pid" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPid();
    
    /**
     * Sets the "pid" attribute
     */
    void setPid(int pid);
    
    /**
     * Sets (as xml) the "pid" attribute
     */
    void xsetPid(org.apache.xmlbeans.XmlInt pid);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "linkTarget" attribute
     */
    java.lang.String getLinkTarget();
    
    /**
     * Gets (as xml) the "linkTarget" attribute
     */
    org.apache.xmlbeans.XmlString xgetLinkTarget();
    
    /**
     * True if has "linkTarget" attribute
     */
    boolean isSetLinkTarget();
    
    /**
     * Sets the "linkTarget" attribute
     */
    void setLinkTarget(java.lang.String linkTarget);
    
    /**
     * Sets (as xml) the "linkTarget" attribute
     */
    void xsetLinkTarget(org.apache.xmlbeans.XmlString linkTarget);
    
    /**
     * Unsets the "linkTarget" attribute
     */
    void unsetLinkTarget();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
