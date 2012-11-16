/*
 * XML Type:  CT_RevisionCustomView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCustomView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionCustomView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionCustomView extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionCustomView.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisioncustomview9d3atype");
    
    /**
     * Gets the "guid" attribute
     */
    java.lang.String getGuid();
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid();
    
    /**
     * Sets the "guid" attribute
     */
    void setGuid(java.lang.String guid);
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid);
    
    /**
     * Gets the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction xgetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRevisionAction action);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
