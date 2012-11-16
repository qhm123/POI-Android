/*
 * XML Type:  CT_GvmlShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GvmlShape(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGvmlShape extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGvmlShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgvmlshape55a4type");
    
    /**
     * Gets the "nvSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShapeNonVisual getNvSpPr();
    
    /**
     * Sets the "nvSpPr" element
     */
    void setNvSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShapeNonVisual nvSpPr);
    
    /**
     * Appends and returns a new empty "nvSpPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlShapeNonVisual addNewNvSpPr();
    
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
     * Gets the "txSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape getTxSp();
    
    /**
     * True if has "txSp" element
     */
    boolean isSetTxSp();
    
    /**
     * Sets the "txSp" element
     */
    void setTxSp(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape txSp);
    
    /**
     * Appends and returns a new empty "txSp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape addNewTxSp();
    
    /**
     * Unsets the "txSp" element
     */
    void unsetTxSp();
    
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
