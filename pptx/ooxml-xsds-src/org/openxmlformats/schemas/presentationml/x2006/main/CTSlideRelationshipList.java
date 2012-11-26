/*
 * XML Type:  CT_SlideRelationshipList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_SlideRelationshipList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSlideRelationshipList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSlideRelationshipList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsliderelationshiplist46e8type");
    
    /**
     * Gets a List of "sld" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry> getSldList();
    
    /**
     * Gets array of all "sld" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[] getSldArray();
    
    /**
     * Gets ith "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry getSldArray(int i);
    
    /**
     * Returns number of "sld" element
     */
    int sizeOfSldArray();
    
    /**
     * Sets array of all "sld" element
     */
    void setSldArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[] sldArray);
    
    /**
     * Sets ith "sld" element
     */
    void setSldArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry sld);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry insertNewSld(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sld" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry addNewSld();
    
    /**
     * Removes the ith "sld" element
     */
    void removeSld(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
