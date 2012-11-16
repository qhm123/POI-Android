/*
 * XML Type:  CT_GuideList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGuideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_GuideList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGuideList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGuideList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctguidelist1f95type");
    
    /**
     * Gets a List of "guide" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTGuide> getGuideList();
    
    /**
     * Gets array of all "guide" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[] getGuideArray();
    
    /**
     * Gets ith "guide" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGuide getGuideArray(int i);
    
    /**
     * Returns number of "guide" element
     */
    int sizeOfGuideArray();
    
    /**
     * Sets array of all "guide" element
     */
    void setGuideArray(org.openxmlformats.schemas.presentationml.x2006.main.CTGuide[] guideArray);
    
    /**
     * Sets ith "guide" element
     */
    void setGuideArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTGuide guide);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guide" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGuide insertNewGuide(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guide" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTGuide addNewGuide();
    
    /**
     * Removes the ith "guide" element
     */
    void removeGuide(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
