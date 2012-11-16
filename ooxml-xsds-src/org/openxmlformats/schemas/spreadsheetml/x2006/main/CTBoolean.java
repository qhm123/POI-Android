/*
 * XML Type:  CT_Boolean
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Boolean(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBoolean extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBoolean.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctboolean7c87type");
    
    /**
     * Gets a List of "x" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getXList();
    
    /**
     * Gets array of all "x" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] getXArray();
    
    /**
     * Gets ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX getXArray(int i);
    
    /**
     * Returns number of "x" element
     */
    int sizeOfXArray();
    
    /**
     * Sets array of all "x" element
     */
    void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] xArray);
    
    /**
     * Sets ith "x" element
     */
    void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX x);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX insertNewX(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX addNewX();
    
    /**
     * Removes the ith "x" element
     */
    void removeX(int i);
    
    /**
     * Gets the "v" attribute
     */
    boolean getV();
    
    /**
     * Gets (as xml) the "v" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetV();
    
    /**
     * Sets the "v" attribute
     */
    void setV(boolean v);
    
    /**
     * Sets (as xml) the "v" attribute
     */
    void xsetV(org.apache.xmlbeans.XmlBoolean v);
    
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
     * Gets the "f" attribute
     */
    boolean getF();
    
    /**
     * Gets (as xml) the "f" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetF();
    
    /**
     * True if has "f" attribute
     */
    boolean isSetF();
    
    /**
     * Sets the "f" attribute
     */
    void setF(boolean f);
    
    /**
     * Sets (as xml) the "f" attribute
     */
    void xsetF(org.apache.xmlbeans.XmlBoolean f);
    
    /**
     * Unsets the "f" attribute
     */
    void unsetF();
    
    /**
     * Gets the "c" attribute
     */
    java.lang.String getC();
    
    /**
     * Gets (as xml) the "c" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetC();
    
    /**
     * True if has "c" attribute
     */
    boolean isSetC();
    
    /**
     * Sets the "c" attribute
     */
    void setC(java.lang.String c);
    
    /**
     * Sets (as xml) the "c" attribute
     */
    void xsetC(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring c);
    
    /**
     * Unsets the "c" attribute
     */
    void unsetC();
    
    /**
     * Gets the "cp" attribute
     */
    long getCp();
    
    /**
     * Gets (as xml) the "cp" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCp();
    
    /**
     * True if has "cp" attribute
     */
    boolean isSetCp();
    
    /**
     * Sets the "cp" attribute
     */
    void setCp(long cp);
    
    /**
     * Sets (as xml) the "cp" attribute
     */
    void xsetCp(org.apache.xmlbeans.XmlUnsignedInt cp);
    
    /**
     * Unsets the "cp" attribute
     */
    void unsetCp();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
