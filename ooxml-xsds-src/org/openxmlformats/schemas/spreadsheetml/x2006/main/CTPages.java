/*
 * XML Type:  CT_Pages
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPages
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Pages(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPages extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpages27e3type");
    
    /**
     * Gets a List of "page" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage> getPageList();
    
    /**
     * Gets array of all "page" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[] getPageArray();
    
    /**
     * Gets ith "page" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage getPageArray(int i);
    
    /**
     * Returns number of "page" element
     */
    int sizeOfPageArray();
    
    /**
     * Sets array of all "page" element
     */
    void setPageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage[] pageArray);
    
    /**
     * Sets ith "page" element
     */
    void setPageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage page);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "page" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage insertNewPage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "page" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSCPage addNewPage();
    
    /**
     * Removes the ith "page" element
     */
    void removePage(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
