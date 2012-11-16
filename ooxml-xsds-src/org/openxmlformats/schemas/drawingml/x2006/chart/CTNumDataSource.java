/*
 * XML Type:  CT_NumDataSource
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_NumDataSource(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTNumDataSource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNumDataSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnumdatasourcef0bbtype");
    
    /**
     * Gets the "numRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef getNumRef();
    
    /**
     * True if has "numRef" element
     */
    boolean isSetNumRef();
    
    /**
     * Sets the "numRef" element
     */
    void setNumRef(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef numRef);
    
    /**
     * Appends and returns a new empty "numRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef addNewNumRef();
    
    /**
     * Unsets the "numRef" element
     */
    void unsetNumRef();
    
    /**
     * Gets the "numLit" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData getNumLit();
    
    /**
     * True if has "numLit" element
     */
    boolean isSetNumLit();
    
    /**
     * Sets the "numLit" element
     */
    void setNumLit(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData numLit);
    
    /**
     * Appends and returns a new empty "numLit" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData addNewNumLit();
    
    /**
     * Unsets the "numLit" element
     */
    void unsetNumLit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
