/*
 * XML Type:  CT_Guide
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTGuide
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_Guide(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGuide extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGuide.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctguide4f93type");
    
    /**
     * Gets the "orient" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum getOrient();
    
    /**
     * Gets (as xml) the "orient" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STDirection xgetOrient();
    
    /**
     * True if has "orient" attribute
     */
    boolean isSetOrient();
    
    /**
     * Sets the "orient" attribute
     */
    void setOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum orient);
    
    /**
     * Sets (as xml) the "orient" attribute
     */
    void xsetOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection orient);
    
    /**
     * Unsets the "orient" attribute
     */
    void unsetOrient();
    
    /**
     * Gets the "pos" attribute
     */
    int getPos();
    
    /**
     * Gets (as xml) the "pos" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetPos();
    
    /**
     * True if has "pos" attribute
     */
    boolean isSetPos();
    
    /**
     * Sets the "pos" attribute
     */
    void setPos(int pos);
    
    /**
     * Sets (as xml) the "pos" attribute
     */
    void xsetPos(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 pos);
    
    /**
     * Unsets the "pos" attribute
     */
    void unsetPos();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
