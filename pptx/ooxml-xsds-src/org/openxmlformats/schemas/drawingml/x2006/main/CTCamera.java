/*
 * XML Type:  CT_Camera
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCamera
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Camera(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCamera extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCamera.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcamerac340type");
    
    /**
     * Gets the "rot" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords getRot();
    
    /**
     * True if has "rot" element
     */
    boolean isSetRot();
    
    /**
     * Sets the "rot" element
     */
    void setRot(org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords rot);
    
    /**
     * Appends and returns a new empty "rot" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTSphereCoords addNewRot();
    
    /**
     * Unsets the "rot" element
     */
    void unsetRot();
    
    /**
     * Gets the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.Enum getPrst();
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType xgetPrst();
    
    /**
     * Sets the "prst" attribute
     */
    void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.Enum prst);
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType prst);
    
    /**
     * Gets the "fov" attribute
     */
    int getFov();
    
    /**
     * Gets (as xml) the "fov" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle xgetFov();
    
    /**
     * True if has "fov" attribute
     */
    boolean isSetFov();
    
    /**
     * Sets the "fov" attribute
     */
    void setFov(int fov);
    
    /**
     * Sets (as xml) the "fov" attribute
     */
    void xsetFov(org.openxmlformats.schemas.drawingml.x2006.main.STFOVAngle fov);
    
    /**
     * Unsets the "fov" attribute
     */
    void unsetFov();
    
    /**
     * Gets the "zoom" attribute
     */
    int getZoom();
    
    /**
     * Gets (as xml) the "zoom" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage xgetZoom();
    
    /**
     * True if has "zoom" attribute
     */
    boolean isSetZoom();
    
    /**
     * Sets the "zoom" attribute
     */
    void setZoom(int zoom);
    
    /**
     * Sets (as xml) the "zoom" attribute
     */
    void xsetZoom(org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage zoom);
    
    /**
     * Unsets the "zoom" attribute
     */
    void unsetZoom();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
