/*
 * XML Type:  CT_TextAutonumberBullet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TextAutonumberBullet(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextAutonumberBullet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextAutonumberBullet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextautonumberbulletd602type");
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme type);
    
    /**
     * Gets the "startAt" attribute
     */
    int getStartAt();
    
    /**
     * Gets (as xml) the "startAt" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum xgetStartAt();
    
    /**
     * True if has "startAt" attribute
     */
    boolean isSetStartAt();
    
    /**
     * Sets the "startAt" attribute
     */
    void setStartAt(int startAt);
    
    /**
     * Sets (as xml) the "startAt" attribute
     */
    void xsetStartAt(org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum startAt);
    
    /**
     * Unsets the "startAt" attribute
     */
    void unsetStartAt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
