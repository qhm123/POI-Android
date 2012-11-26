/*
 * XML Type:  CT_NonVisualGraphicFrameProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_NonVisualGraphicFrameProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNonVisualGraphicFrameProperties extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNonVisualGraphicFrameProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnonvisualgraphicframeproperties43b6type");
    
    /**
     * Gets the "graphicFrameLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking getGraphicFrameLocks();
    
    /**
     * True if has "graphicFrameLocks" element
     */
    boolean isSetGraphicFrameLocks();
    
    /**
     * Sets the "graphicFrameLocks" element
     */
    void setGraphicFrameLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking graphicFrameLocks);
    
    /**
     * Appends and returns a new empty "graphicFrameLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking addNewGraphicFrameLocks();
    
    /**
     * Unsets the "graphicFrameLocks" element
     */
    void unsetGraphicFrameLocks();
    
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
