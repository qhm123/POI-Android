/*
 * XML Type:  CT_NonVisualGroupDrawingShapeProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_NonVisualGroupDrawingShapeProps(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNonVisualGroupDrawingShapeProps extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNonVisualGroupDrawingShapeProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnonvisualgroupdrawingshapeprops610ctype");
    
    /**
     * Gets the "grpSpLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking getGrpSpLocks();
    
    /**
     * True if has "grpSpLocks" element
     */
    boolean isSetGrpSpLocks();
    
    /**
     * Sets the "grpSpLocks" element
     */
    void setGrpSpLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking grpSpLocks);
    
    /**
     * Appends and returns a new empty "grpSpLocks" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking addNewGrpSpLocks();
    
    /**
     * Unsets the "grpSpLocks" element
     */
    void unsetGrpSpLocks();
    
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
