/*
 * XML Type:  CT_GvmlPicture
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPicture
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GvmlPicture(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGvmlPicture extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGvmlPicture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgvmlpictureac01type");
    
    /**
     * Gets the "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPictureNonVisual getNvPicPr();
    
    /**
     * Sets the "nvPicPr" element
     */
    void setNvPicPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPictureNonVisual nvPicPr);
    
    /**
     * Appends and returns a new empty "nvPicPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlPictureNonVisual addNewNvPicPr();
    
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
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
