/*
 * XML Type:  CT_Path2DQuadBezierTo
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Path2DQuadBezierTo(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPath2DQuadBezierTo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPath2DQuadBezierTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpath2dquadbezierto3f53type");
    
    /**
     * Gets a List of "pt" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D> getPtList();
    
    /**
     * Gets array of all "pt" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[] getPtArray();
    
    /**
     * Gets ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPtArray(int i);
    
    /**
     * Returns number of "pt" element
     */
    int sizeOfPtArray();
    
    /**
     * Sets array of all "pt" element
     */
    void setPtArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[] ptArray);
    
    /**
     * Sets ith "pt" element
     */
    void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D insertNewPt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPt();
    
    /**
     * Removes the ith "pt" element
     */
    void removePt(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
