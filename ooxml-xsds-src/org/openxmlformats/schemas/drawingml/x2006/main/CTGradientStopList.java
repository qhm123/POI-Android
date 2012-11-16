/*
 * XML Type:  CT_GradientStopList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GradientStopList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGradientStopList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGradientStopList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgradientstoplist7eabtype");
    
    /**
     * Gets a List of "gs" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop> getGsList();
    
    /**
     * Gets array of all "gs" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[] getGsArray();
    
    /**
     * Gets ith "gs" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop getGsArray(int i);
    
    /**
     * Returns number of "gs" element
     */
    int sizeOfGsArray();
    
    /**
     * Sets array of all "gs" element
     */
    void setGsArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[] gsArray);
    
    /**
     * Sets ith "gs" element
     */
    void setGsArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop gs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gs" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop insertNewGs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gs" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop addNewGs();
    
    /**
     * Removes the ith "gs" element
     */
    void removeGs(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
