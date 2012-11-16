/*
 * XML Type:  CT_Marker
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart;


/**
 * An XML CT_Marker(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public interface CTMarker extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMarker.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmarkera682type");
    
    /**
     * Gets the "symbol" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle getSymbol();
    
    /**
     * True if has "symbol" element
     */
    boolean isSetSymbol();
    
    /**
     * Sets the "symbol" element
     */
    void setSymbol(org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle symbol);
    
    /**
     * Appends and returns a new empty "symbol" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle addNewSymbol();
    
    /**
     * Unsets the "symbol" element
     */
    void unsetSymbol();
    
    /**
     * Gets the "size" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerSize getSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerSize size);
    
    /**
     * Appends and returns a new empty "size" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerSize addNewSize();
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();
    
    /**
     * True if has "spPr" element
     */
    boolean isSetSpPr();
    
    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();
    
    /**
     * Unsets the "spPr" element
     */
    void unsetSpPr();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
