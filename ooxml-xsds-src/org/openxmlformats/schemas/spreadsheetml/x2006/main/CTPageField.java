/*
 * XML Type:  CT_PageField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PageField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPageField extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPageField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpagefield338atype");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "fld" attribute
     */
    int getFld();
    
    /**
     * Gets (as xml) the "fld" attribute
     */
    org.apache.xmlbeans.XmlInt xgetFld();
    
    /**
     * Sets the "fld" attribute
     */
    void setFld(int fld);
    
    /**
     * Sets (as xml) the "fld" attribute
     */
    void xsetFld(org.apache.xmlbeans.XmlInt fld);
    
    /**
     * Gets the "item" attribute
     */
    long getItem();
    
    /**
     * Gets (as xml) the "item" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetItem();
    
    /**
     * True if has "item" attribute
     */
    boolean isSetItem();
    
    /**
     * Sets the "item" attribute
     */
    void setItem(long item);
    
    /**
     * Sets (as xml) the "item" attribute
     */
    void xsetItem(org.apache.xmlbeans.XmlUnsignedInt item);
    
    /**
     * Unsets the "item" attribute
     */
    void unsetItem();
    
    /**
     * Gets the "hier" attribute
     */
    int getHier();
    
    /**
     * Gets (as xml) the "hier" attribute
     */
    org.apache.xmlbeans.XmlInt xgetHier();
    
    /**
     * True if has "hier" attribute
     */
    boolean isSetHier();
    
    /**
     * Sets the "hier" attribute
     */
    void setHier(int hier);
    
    /**
     * Sets (as xml) the "hier" attribute
     */
    void xsetHier(org.apache.xmlbeans.XmlInt hier);
    
    /**
     * Unsets the "hier" attribute
     */
    void unsetHier();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
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
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "cap" attribute
     */
    java.lang.String getCap();
    
    /**
     * Gets (as xml) the "cap" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCap();
    
    /**
     * True if has "cap" attribute
     */
    boolean isSetCap();
    
    /**
     * Sets the "cap" attribute
     */
    void setCap(java.lang.String cap);
    
    /**
     * Sets (as xml) the "cap" attribute
     */
    void xsetCap(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring cap);
    
    /**
     * Unsets the "cap" attribute
     */
    void unsetCap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
