/*
 * XML Type:  CT_Tx
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTTx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Tx(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTTx extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttx9678type");
    
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
     * Gets the "rich" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getRich();
    
    /**
     * True if has "rich" element
     */
    boolean isSetRich();
    
    /**
     * Sets the "rich" element
     */
    void setRich(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody rich);
    
    /**
     * Appends and returns a new empty "rich" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewRich();
    
    /**
     * Unsets the "rich" element
     */
    void unsetRich();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
