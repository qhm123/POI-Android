/*
 * XML Type:  CT_DdeLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DdeLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDdeLink extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDdeLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctddelink931etype");
    
    /**
     * Gets the "ddeItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems getDdeItems();
    
    /**
     * True if has "ddeItems" element
     */
    boolean isSetDdeItems();
    
    /**
     * Sets the "ddeItems" element
     */
    void setDdeItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems ddeItems);
    
    /**
     * Appends and returns a new empty "ddeItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeItems addNewDdeItems();
    
    /**
     * Unsets the "ddeItems" element
     */
    void unsetDdeItems();
    
    /**
     * Gets the "ddeService" attribute
     */
    java.lang.String getDdeService();
    
    /**
     * Gets (as xml) the "ddeService" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDdeService();
    
    /**
     * Sets the "ddeService" attribute
     */
    void setDdeService(java.lang.String ddeService);
    
    /**
     * Sets (as xml) the "ddeService" attribute
     */
    void xsetDdeService(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ddeService);
    
    /**
     * Gets the "ddeTopic" attribute
     */
    java.lang.String getDdeTopic();
    
    /**
     * Gets (as xml) the "ddeTopic" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDdeTopic();
    
    /**
     * Sets the "ddeTopic" attribute
     */
    void setDdeTopic(java.lang.String ddeTopic);
    
    /**
     * Sets (as xml) the "ddeTopic" attribute
     */
    void xsetDdeTopic(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring ddeTopic);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
