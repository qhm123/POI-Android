/*
 * XML Type:  CT_OleObjectLink
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_OleObjectLink(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOleObjectLink extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOleObjectLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoleobjectlinkd24etype");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "updateAutomatic" attribute
     */
    boolean getUpdateAutomatic();
    
    /**
     * Gets (as xml) the "updateAutomatic" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUpdateAutomatic();
    
    /**
     * True if has "updateAutomatic" attribute
     */
    boolean isSetUpdateAutomatic();
    
    /**
     * Sets the "updateAutomatic" attribute
     */
    void setUpdateAutomatic(boolean updateAutomatic);
    
    /**
     * Sets (as xml) the "updateAutomatic" attribute
     */
    void xsetUpdateAutomatic(org.apache.xmlbeans.XmlBoolean updateAutomatic);
    
    /**
     * Unsets the "updateAutomatic" attribute
     */
    void unsetUpdateAutomatic();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
