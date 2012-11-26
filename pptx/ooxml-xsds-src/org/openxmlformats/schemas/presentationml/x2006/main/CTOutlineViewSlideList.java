/*
 * XML Type:  CT_OutlineViewSlideList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_OutlineViewSlideList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOutlineViewSlideList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOutlineViewSlideList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoutlineviewslideliste67dtype");
    
    /**
     * Gets a List of "sld" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry> getSldList();
    
    /**
     * Gets array of all "sld" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[] getSldArray();
    
    /**
     * Gets ith "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry getSldArray(int i);
    
    /**
     * Returns number of "sld" element
     */
    int sizeOfSldArray();
    
    /**
     * Sets array of all "sld" element
     */
    void setSldArray(org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[] sldArray);
    
    /**
     * Sets ith "sld" element
     */
    void setSldArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry sld);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry insertNewSld(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry addNewSld();
    
    /**
     * Removes the ith "sld" element
     */
    void removeSld(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
