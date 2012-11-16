/*
 * XML Type:  CT_Backdrop
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBackdrop
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Backdrop(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBackdrop extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBackdrop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbackdrop2471type");
    
    /**
     * Gets the "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D getAnchor();
    
    /**
     * Sets the "anchor" element
     */
    void setAnchor(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D anchor);
    
    /**
     * Appends and returns a new empty "anchor" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint3D addNewAnchor();
    
    /**
     * Gets the "norm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D getNorm();
    
    /**
     * Sets the "norm" element
     */
    void setNorm(org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D norm);
    
    /**
     * Appends and returns a new empty "norm" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D addNewNorm();
    
    /**
     * Gets the "up" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D getUp();
    
    /**
     * Sets the "up" element
     */
    void setUp(org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D up);
    
    /**
     * Appends and returns a new empty "up" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTVector3D addNewUp();
    
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
