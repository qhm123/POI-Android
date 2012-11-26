/*
 * XML Type:  CT_Connection
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTConnection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_Connection(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTConnection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConnection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconnection7fb9type");
    
    /**
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId id);
    
    /**
     * Gets the "idx" attribute
     */
    long getIdx();
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIdx();
    
    /**
     * Sets the "idx" attribute
     */
    void setIdx(long idx);
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    void xsetIdx(org.apache.xmlbeans.XmlUnsignedInt idx);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
