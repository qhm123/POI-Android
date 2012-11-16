/*
 * XML Type:  CT_Shape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML CT_Shape(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public interface CTShape extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctshapee40btype");
    
    /**
     * Gets the "nvSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual getNvSpPr();
    
    /**
     * Sets the "nvSpPr" element
     */
    void setNvSpPr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual nvSpPr);
    
    /**
     * Appends and returns a new empty "nvSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual addNewNvSpPr();
    
    /**
     * Gets the "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr();
    
    /**
     * Sets the "spPr" element
     */
    void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr);
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr();
    
    /**
     * Gets the "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle();
    
    /**
     * True if has "style" element
     */
    boolean isSetStyle();
    
    /**
     * Sets the "style" element
     */
    void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style);
    
    /**
     * Appends and returns a new empty "style" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle();
    
    /**
     * Unsets the "style" element
     */
    void unsetStyle();
    
    /**
     * Gets the "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody();
    
    /**
     * True if has "txBody" element
     */
    boolean isSetTxBody();
    
    /**
     * Sets the "txBody" element
     */
    void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody);
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody();
    
    /**
     * Unsets the "txBody" element
     */
    void unsetTxBody();
    
    /**
     * Gets the "macro" attribute
     */
    java.lang.String getMacro();
    
    /**
     * Gets (as xml) the "macro" attribute
     */
    org.apache.xmlbeans.XmlString xgetMacro();
    
    /**
     * True if has "macro" attribute
     */
    boolean isSetMacro();
    
    /**
     * Sets the "macro" attribute
     */
    void setMacro(java.lang.String macro);
    
    /**
     * Sets (as xml) the "macro" attribute
     */
    void xsetMacro(org.apache.xmlbeans.XmlString macro);
    
    /**
     * Unsets the "macro" attribute
     */
    void unsetMacro();
    
    /**
     * Gets the "textlink" attribute
     */
    java.lang.String getTextlink();
    
    /**
     * Gets (as xml) the "textlink" attribute
     */
    org.apache.xmlbeans.XmlString xgetTextlink();
    
    /**
     * True if has "textlink" attribute
     */
    boolean isSetTextlink();
    
    /**
     * Sets the "textlink" attribute
     */
    void setTextlink(java.lang.String textlink);
    
    /**
     * Sets (as xml) the "textlink" attribute
     */
    void xsetTextlink(org.apache.xmlbeans.XmlString textlink);
    
    /**
     * Unsets the "textlink" attribute
     */
    void unsetTextlink();
    
    /**
     * Gets the "fLocksText" attribute
     */
    boolean getFLocksText();
    
    /**
     * Gets (as xml) the "fLocksText" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFLocksText();
    
    /**
     * True if has "fLocksText" attribute
     */
    boolean isSetFLocksText();
    
    /**
     * Sets the "fLocksText" attribute
     */
    void setFLocksText(boolean fLocksText);
    
    /**
     * Sets (as xml) the "fLocksText" attribute
     */
    void xsetFLocksText(org.apache.xmlbeans.XmlBoolean fLocksText);
    
    /**
     * Unsets the "fLocksText" attribute
     */
    void unsetFLocksText();
    
    /**
     * Gets the "fPublished" attribute
     */
    boolean getFPublished();
    
    /**
     * Gets (as xml) the "fPublished" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFPublished();
    
    /**
     * True if has "fPublished" attribute
     */
    boolean isSetFPublished();
    
    /**
     * Sets the "fPublished" attribute
     */
    void setFPublished(boolean fPublished);
    
    /**
     * Sets (as xml) the "fPublished" attribute
     */
    void xsetFPublished(org.apache.xmlbeans.XmlBoolean fPublished);
    
    /**
     * Unsets the "fPublished" attribute
     */
    void unsetFPublished();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
