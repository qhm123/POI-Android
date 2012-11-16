/*
 * XML Type:  CT_SlideSyncProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSyncProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_SlideSyncProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSlideSyncProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSlideSyncProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctslidesyncproperties01b0type");
    
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
     * Gets the "serverSldId" attribute
     */
    java.lang.String getServerSldId();
    
    /**
     * Gets (as xml) the "serverSldId" attribute
     */
    org.apache.xmlbeans.XmlString xgetServerSldId();
    
    /**
     * Sets the "serverSldId" attribute
     */
    void setServerSldId(java.lang.String serverSldId);
    
    /**
     * Sets (as xml) the "serverSldId" attribute
     */
    void xsetServerSldId(org.apache.xmlbeans.XmlString serverSldId);
    
    /**
     * Gets the "serverSldModifiedTime" attribute
     */
    java.util.Calendar getServerSldModifiedTime();
    
    /**
     * Gets (as xml) the "serverSldModifiedTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetServerSldModifiedTime();
    
    /**
     * Sets the "serverSldModifiedTime" attribute
     */
    void setServerSldModifiedTime(java.util.Calendar serverSldModifiedTime);
    
    /**
     * Sets (as xml) the "serverSldModifiedTime" attribute
     */
    void xsetServerSldModifiedTime(org.apache.xmlbeans.XmlDateTime serverSldModifiedTime);
    
    /**
     * Gets the "clientInsertedTime" attribute
     */
    java.util.Calendar getClientInsertedTime();
    
    /**
     * Gets (as xml) the "clientInsertedTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetClientInsertedTime();
    
    /**
     * Sets the "clientInsertedTime" attribute
     */
    void setClientInsertedTime(java.util.Calendar clientInsertedTime);
    
    /**
     * Sets (as xml) the "clientInsertedTime" attribute
     */
    void xsetClientInsertedTime(org.apache.xmlbeans.XmlDateTime clientInsertedTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
