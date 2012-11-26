/*
 * XML Type:  CT_PresetGeometry2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_PresetGeometry2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPresetGeometry2D extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPresetGeometry2D.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpresetgeometry2db1detype");
    
    /**
     * Gets the "avLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList getAvLst();
    
    /**
     * True if has "avLst" element
     */
    boolean isSetAvLst();
    
    /**
     * Sets the "avLst" element
     */
    void setAvLst(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList avLst);
    
    /**
     * Appends and returns a new empty "avLst" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList addNewAvLst();
    
    /**
     * Unsets the "avLst" element
     */
    void unsetAvLst();
    
    /**
     * Gets the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.Enum getPrst();
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STShapeType xgetPrst();
    
    /**
     * Sets the "prst" attribute
     */
    void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.Enum prst);
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STShapeType prst);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
