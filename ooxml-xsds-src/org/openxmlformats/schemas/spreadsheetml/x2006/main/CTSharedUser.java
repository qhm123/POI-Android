/*
 * XML Type:  CT_SharedUser
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SharedUser(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSharedUser extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSharedUser.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsharedusera759type");
    
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
     * Gets the "id" attribute
     */
    int getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlInt xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(int id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlInt id);
    
    /**
     * Gets the "dateTime" attribute
     */
    java.util.Calendar getDateTime();
    
    /**
     * Gets (as xml) the "dateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTime();
    
    /**
     * Sets the "dateTime" attribute
     */
    void setDateTime(java.util.Calendar dateTime);
    
    /**
     * Sets (as xml) the "dateTime" attribute
     */
    void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
