/*
 * XML Type:  CT_ExternalDefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ExternalDefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalDefinedName extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTExternalDefinedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctexternaldefinedname9408type");
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Gets the "refersTo" attribute
     */
    java.lang.String getRefersTo();
    
    /**
     * Gets (as xml) the "refersTo" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetRefersTo();
    
    /**
     * True if has "refersTo" attribute
     */
    boolean isSetRefersTo();
    
    /**
     * Sets the "refersTo" attribute
     */
    void setRefersTo(java.lang.String refersTo);
    
    /**
     * Sets (as xml) the "refersTo" attribute
     */
    void xsetRefersTo(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring refersTo);
    
    /**
     * Unsets the "refersTo" attribute
     */
    void unsetRefersTo();
    
    /**
     * Gets the "sheetId" attribute
     */
    long getSheetId();
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSheetId();
    
    /**
     * True if has "sheetId" attribute
     */
    boolean isSetSheetId();
    
    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId);
    
    /**
     * Unsets the "sheetId" attribute
     */
    void unsetSheetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
