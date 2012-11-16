/*
 * XML Type:  CT_NumFmt
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_NumFmt(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTNumFmt extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNumFmt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnumfmtc0f5type");
    
    /**
     * Gets the "formatCode" attribute
     */
    java.lang.String getFormatCode();
    
    /**
     * Gets (as xml) the "formatCode" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.STXstring xgetFormatCode();
    
    /**
     * Sets the "formatCode" attribute
     */
    void setFormatCode(java.lang.String formatCode);
    
    /**
     * Sets (as xml) the "formatCode" attribute
     */
    void xsetFormatCode(org.openxmlformats.schemas.drawingml.x2006.chart.STXstring formatCode);
    
    /**
     * Gets the "sourceLinked" attribute
     */
    boolean getSourceLinked();
    
    /**
     * Gets (as xml) the "sourceLinked" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSourceLinked();
    
    /**
     * True if has "sourceLinked" attribute
     */
    boolean isSetSourceLinked();
    
    /**
     * Sets the "sourceLinked" attribute
     */
    void setSourceLinked(boolean sourceLinked);
    
    /**
     * Sets (as xml) the "sourceLinked" attribute
     */
    void xsetSourceLinked(org.apache.xmlbeans.XmlBoolean sourceLinked);
    
    /**
     * Unsets the "sourceLinked" attribute
     */
    void unsetSourceLinked();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
