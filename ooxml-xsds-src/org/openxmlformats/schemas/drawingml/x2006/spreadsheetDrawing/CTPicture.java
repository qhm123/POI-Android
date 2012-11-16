/*
 * XML Type:  CT_Picture
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;


/**
 * An XML CT_Picture(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public interface CTPicture extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPicture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpicturee028type");
    
    /**
     * Gets the "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPictureNonVisual getNvPicPr();
    
    /**
     * Sets the "nvPicPr" element
     */
    void setNvPicPr(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPictureNonVisual nvPicPr);
    
    /**
     * Appends and returns a new empty "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPictureNonVisual addNewNvPicPr();
    
    /**
     * Gets the "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties getBlipFill();
    
    /**
     * Sets the "blipFill" element
     */
    void setBlipFill(org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties blipFill);
    
    /**
     * Appends and returns a new empty "blipFill" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties addNewBlipFill();
    
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
