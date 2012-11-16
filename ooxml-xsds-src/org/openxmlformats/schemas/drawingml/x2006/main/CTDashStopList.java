/*
 * XML Type:  CT_DashStopList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_DashStopList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDashStopList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDashStopList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdashstoplist920dtype");
    
    /**
     * Gets a List of "ds" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop> getDsList();
    
    /**
     * Gets array of all "ds" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[] getDsArray();
    
    /**
     * Gets ith "ds" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop getDsArray(int i);
    
    /**
     * Returns number of "ds" element
     */
    int sizeOfDsArray();
    
    /**
     * Sets array of all "ds" element
     */
    void setDsArray(org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[] dsArray);
    
    /**
     * Sets ith "ds" element
     */
    void setDsArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop ds);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ds" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop insertNewDs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ds" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop addNewDs();
    
    /**
     * Removes the ith "ds" element
     */
    void removeDs(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
