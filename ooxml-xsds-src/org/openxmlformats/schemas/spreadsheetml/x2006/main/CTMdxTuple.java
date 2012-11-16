/*
 * XML Type:  CT_MdxTuple
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_MdxTuple(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMdxTuple extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMdxTuple.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmdxtuplefa90type");
    
    /**
     * Gets a List of "n" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex> getNList();
    
    /**
     * Gets array of all "n" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] getNArray();
    
    /**
     * Gets ith "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex getNArray(int i);
    
    /**
     * Returns number of "n" element
     */
    int sizeOfNArray();
    
    /**
     * Sets array of all "n" element
     */
    void setNArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] nArray);
    
    /**
     * Sets ith "n" element
     */
    void setNArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex n);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex insertNewN(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "n" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex addNewN();
    
    /**
     * Removes the ith "n" element
     */
    void removeN(int i);
    
    /**
     * Gets the "c" attribute
     */
    long getC();
    
    /**
     * Gets (as xml) the "c" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetC();
    
    /**
     * True if has "c" attribute
     */
    boolean isSetC();
    
    /**
     * Sets the "c" attribute
     */
    void setC(long c);
    
    /**
     * Sets (as xml) the "c" attribute
     */
    void xsetC(org.apache.xmlbeans.XmlUnsignedInt c);
    
    /**
     * Unsets the "c" attribute
     */
    void unsetC();
    
    /**
     * Gets the "ct" attribute
     */
    java.lang.String getCt();
    
    /**
     * Gets (as xml) the "ct" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCt();
    
    /**
     * True if has "ct" attribute
     */
    boolean isSetCt();
    
    /**
     * Sets the "ct" attribute
     */
    void setCt(java.lang.String ct);
    
    /**
     * Sets (as xml) the "ct" attribute
     */
    void xsetCt(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ct);
    
    /**
     * Unsets the "ct" attribute
     */
    void unsetCt();
    
    /**
     * Gets the "si" attribute
     */
    long getSi();
    
    /**
     * Gets (as xml) the "si" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSi();
    
    /**
     * True if has "si" attribute
     */
    boolean isSetSi();
    
    /**
     * Sets the "si" attribute
     */
    void setSi(long si);
    
    /**
     * Sets (as xml) the "si" attribute
     */
    void xsetSi(org.apache.xmlbeans.XmlUnsignedInt si);
    
    /**
     * Unsets the "si" attribute
     */
    void unsetSi();
    
    /**
     * Gets the "fi" attribute
     */
    long getFi();
    
    /**
     * Gets (as xml) the "fi" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFi();
    
    /**
     * True if has "fi" attribute
     */
    boolean isSetFi();
    
    /**
     * Sets the "fi" attribute
     */
    void setFi(long fi);
    
    /**
     * Sets (as xml) the "fi" attribute
     */
    void xsetFi(org.apache.xmlbeans.XmlUnsignedInt fi);
    
    /**
     * Unsets the "fi" attribute
     */
    void unsetFi();
    
    /**
     * Gets the "bc" attribute
     */
    byte[] getBc();
    
    /**
     * Gets (as xml) the "bc" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetBc();
    
    /**
     * True if has "bc" attribute
     */
    boolean isSetBc();
    
    /**
     * Sets the "bc" attribute
     */
    void setBc(byte[] bc);
    
    /**
     * Sets (as xml) the "bc" attribute
     */
    void xsetBc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex bc);
    
    /**
     * Unsets the "bc" attribute
     */
    void unsetBc();
    
    /**
     * Gets the "fc" attribute
     */
    byte[] getFc();
    
    /**
     * Gets (as xml) the "fc" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetFc();
    
    /**
     * True if has "fc" attribute
     */
    boolean isSetFc();
    
    /**
     * Sets the "fc" attribute
     */
    void setFc(byte[] fc);
    
    /**
     * Sets (as xml) the "fc" attribute
     */
    void xsetFc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex fc);
    
    /**
     * Unsets the "fc" attribute
     */
    void unsetFc();
    
    /**
     * Gets the "i" attribute
     */
    boolean getI();
    
    /**
     * Gets (as xml) the "i" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetI();
    
    /**
     * True if has "i" attribute
     */
    boolean isSetI();
    
    /**
     * Sets the "i" attribute
     */
    void setI(boolean iValue);
    
    /**
     * Sets (as xml) the "i" attribute
     */
    void xsetI(org.apache.xmlbeans.XmlBoolean iValue);
    
    /**
     * Unsets the "i" attribute
     */
    void unsetI();
    
    /**
     * Gets the "u" attribute
     */
    boolean getU();
    
    /**
     * Gets (as xml) the "u" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetU();
    
    /**
     * True if has "u" attribute
     */
    boolean isSetU();
    
    /**
     * Sets the "u" attribute
     */
    void setU(boolean u);
    
    /**
     * Sets (as xml) the "u" attribute
     */
    void xsetU(org.apache.xmlbeans.XmlBoolean u);
    
    /**
     * Unsets the "u" attribute
     */
    void unsetU();
    
    /**
     * Gets the "st" attribute
     */
    boolean getSt();
    
    /**
     * Gets (as xml) the "st" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSt();
    
    /**
     * True if has "st" attribute
     */
    boolean isSetSt();
    
    /**
     * Sets the "st" attribute
     */
    void setSt(boolean st);
    
    /**
     * Sets (as xml) the "st" attribute
     */
    void xsetSt(org.apache.xmlbeans.XmlBoolean st);
    
    /**
     * Unsets the "st" attribute
     */
    void unsetSt();
    
    /**
     * Gets the "b" attribute
     */
    boolean getB();
    
    /**
     * Gets (as xml) the "b" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetB();
    
    /**
     * True if has "b" attribute
     */
    boolean isSetB();
    
    /**
     * Sets the "b" attribute
     */
    void setB(boolean b);
    
    /**
     * Sets (as xml) the "b" attribute
     */
    void xsetB(org.apache.xmlbeans.XmlBoolean b);
    
    /**
     * Unsets the "b" attribute
     */
    void unsetB();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
