/*
 * XML Type:  CT_PtList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_PtList(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTPtList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPtList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctptlistf2eftype");
    
    /**
     * Gets a List of "pt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt> getPtList();
    
    /**
     * Gets array of all "pt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[] getPtArray();
    
    /**
     * Gets ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt getPtArray(int i);
    
    /**
     * Returns number of "pt" element
     */
    int sizeOfPtArray();
    
    /**
     * Sets array of all "pt" element
     */
    void setPtArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[] ptArray);
    
    /**
     * Sets ith "pt" element
     */
    void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt pt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt insertNewPt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt addNewPt();
    
    /**
     * Removes the ith "pt" element
     */
    void removePt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
