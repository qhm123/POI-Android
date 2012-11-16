/*
 * XML Type:  CT_GvmlTextShape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlTextShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_GvmlTextShape(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGvmlTextShape extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGvmlTextShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgvmltextshape09b7type");
    
    /**
     * Gets the "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody();
    
    /**
     * Sets the "txBody" element
     */
    void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody);
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody();
    
    /**
     * Gets the "useSpRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle getUseSpRect();
    
    /**
     * True if has "useSpRect" element
     */
    boolean isSetUseSpRect();
    
    /**
     * Sets the "useSpRect" element
     */
    void setUseSpRect(org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle useSpRect);
    
    /**
     * Appends and returns a new empty "useSpRect" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGvmlUseShapeRectangle addNewUseSpRect();
    
    /**
     * Unsets the "useSpRect" element
     */
    void unsetUseSpRect();
    
    /**
     * Gets the "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D getXfrm();
    
    /**
     * True if has "xfrm" element
     */
    boolean isSetXfrm();
    
    /**
     * Sets the "xfrm" element
     */
    void setXfrm(org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D xfrm);
    
    /**
     * Appends and returns a new empty "xfrm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D addNewXfrm();
    
    /**
     * Unsets the "xfrm" element
     */
    void unsetXfrm();
    
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
