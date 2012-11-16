/*
 * XML Type:  CT_Marker
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML CT_Marker(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public interface CTMarker extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMarker.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmarkeree8etype");
    
    /**
     * Gets the "col" element
     */
    int getCol();
    
    /**
     * Gets (as xml) the "col" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID xgetCol();
    
    /**
     * Sets the "col" element
     */
    void setCol(int col);
    
    /**
     * Sets (as xml) the "col" element
     */
    void xsetCol(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STColID col);
    
    /**
     * Gets the "colOff" element
     */
    long getColOff();
    
    /**
     * Gets (as xml) the "colOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetColOff();
    
    /**
     * Sets the "colOff" element
     */
    void setColOff(long colOff);
    
    /**
     * Sets (as xml) the "colOff" element
     */
    void xsetColOff(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate colOff);
    
    /**
     * Gets the "row" element
     */
    int getRow();
    
    /**
     * Gets (as xml) the "row" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID xgetRow();
    
    /**
     * Sets the "row" element
     */
    void setRow(int row);
    
    /**
     * Sets (as xml) the "row" element
     */
    void xsetRow(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STRowID row);
    
    /**
     * Gets the "rowOff" element
     */
    long getRowOff();
    
    /**
     * Gets (as xml) the "rowOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetRowOff();
    
    /**
     * Sets the "rowOff" element
     */
    void setRowOff(long rowOff);
    
    /**
     * Sets (as xml) the "rowOff" element
     */
    void xsetRowOff(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate rowOff);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
