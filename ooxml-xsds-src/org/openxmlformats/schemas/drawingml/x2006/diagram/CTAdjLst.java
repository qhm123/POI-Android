/*
 * XML Type:  CT_AdjLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_AdjLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTAdjLst extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAdjLst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctadjlstfe8btype");
    
    /**
     * Gets a List of "adj" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj> getAdjList();
    
    /**
     * Gets array of all "adj" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[] getAdjArray();
    
    /**
     * Gets ith "adj" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj getAdjArray(int i);
    
    /**
     * Returns number of "adj" element
     */
    int sizeOfAdjArray();
    
    /**
     * Sets array of all "adj" element
     */
    void setAdjArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[] adjArray);
    
    /**
     * Sets ith "adj" element
     */
    void setAdjArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj adj);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adj" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj insertNewAdj(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adj" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj addNewAdj();
    
    /**
     * Removes the ith "adj" element
     */
    void removeAdj(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
