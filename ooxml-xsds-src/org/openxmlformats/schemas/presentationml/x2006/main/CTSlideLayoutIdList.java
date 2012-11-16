/*
 * XML Type:  CT_SlideLayoutIdList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_SlideLayoutIdList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSlideLayoutIdList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSlideLayoutIdList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctslidelayoutidlist939btype");
    
    /**
     * Gets a List of "sldLayoutId" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry> getSldLayoutIdList();
    
    /**
     * Gets array of all "sldLayoutId" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[] getSldLayoutIdArray();
    
    /**
     * Gets ith "sldLayoutId" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry getSldLayoutIdArray(int i);
    
    /**
     * Returns number of "sldLayoutId" element
     */
    int sizeOfSldLayoutIdArray();
    
    /**
     * Sets array of all "sldLayoutId" element
     */
    void setSldLayoutIdArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry[] sldLayoutIdArray);
    
    /**
     * Sets ith "sldLayoutId" element
     */
    void setSldLayoutIdArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry sldLayoutId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sldLayoutId" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry insertNewSldLayoutId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sldLayoutId" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdListEntry addNewSldLayoutId();
    
    /**
     * Removes the ith "sldLayoutId" element
     */
    void removeSldLayoutId(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
