/*
 * XML Type:  CT_I
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_I(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTI extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cti85c8type");
    
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
     * Gets the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum getT();
    
    /**
     * Gets (as xml) the "t" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType xgetT();
    
    /**
     * True if has "t" attribute
     */
    boolean isSetT();
    
    /**
     * Sets the "t" attribute
     */
    void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum t);
    
    /**
     * Sets (as xml) the "t" attribute
     */
    void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType t);
    
    /**
     * Unsets the "t" attribute
     */
    void unsetT();
    
    /**
     * Gets the "r" attribute
     */
    long getR();
    
    /**
     * Gets (as xml) the "r" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetR();
    
    /**
     * True if has "r" attribute
     */
    boolean isSetR();
    
    /**
     * Sets the "r" attribute
     */
    void setR(long r);
    
    /**
     * Sets (as xml) the "r" attribute
     */
    void xsetR(org.apache.xmlbeans.XmlUnsignedInt r);
    
    /**
     * Unsets the "r" attribute
     */
    void unsetR();
    
    /**
     * Gets the "i" attribute
     */
    long getI();
    
    /**
     * Gets (as xml) the "i" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetI();
    
    /**
     * True if has "i" attribute
     */
    boolean isSetI();
    
    /**
     * Sets the "i" attribute
     */
    void setI(long iValue);
    
    /**
     * Sets (as xml) the "i" attribute
     */
    void xsetI(org.apache.xmlbeans.XmlUnsignedInt iValue);
    
    /**
     * Unsets the "i" attribute
     */
    void unsetI();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
