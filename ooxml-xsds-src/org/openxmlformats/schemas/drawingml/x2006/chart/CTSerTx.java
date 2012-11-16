/*
 * XML Type:  CT_SerTx
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_SerTx(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTSerTx extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSerTx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsertxd722type");
    
    /**
     * Gets the "strRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef getStrRef();
    
    /**
     * True if has "strRef" element
     */
    boolean isSetStrRef();
    
    /**
     * Sets the "strRef" element
     */
    void setStrRef(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef strRef);
    
    /**
     * Appends and returns a new empty "strRef" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef addNewStrRef();
    
    /**
     * Unsets the "strRef" element
     */
    void unsetStrRef();
    
    /**
     * Gets the "v" element
     */
    java.lang.String getV();
    
    /**
     * Gets (as xml) the "v" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetV();
    
    /**
     * True if has "v" element
     */
    boolean isSetV();
    
    /**
     * Sets the "v" element
     */
    void setV(java.lang.String v);
    
    /**
     * Sets (as xml) the "v" element
     */
    void xsetV(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring v);
    
    /**
     * Unsets the "v" element
     */
    void unsetV();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
