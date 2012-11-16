/*
 * XML Type:  CT_Picture
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/picture
 * Java type: org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.picture;


/**
 * An XML CT_Picture(@http://schemas.openxmlformats.org/drawingml/2006/picture).
 *
 * This is a complex type.
 */
public interface CTPicture extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPicture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpicture1d48type");
    
    /**
     * Gets the "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual getNvPicPr();
    
    /**
     * Sets the "nvPicPr" element
     */
    void setNvPicPr(org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual nvPicPr);
    
    /**
     * Appends and returns a new empty "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual addNewNvPicPr();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
