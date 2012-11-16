/*
 * XML Type:  CT_WrapTopBottom
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;


/**
 * An XML CT_WrapTopBottom(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public interface CTWrapTopBottom extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTWrapTopBottom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctwraptopbottom5e13type");
    
    /**
     * Gets the "effectExtent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent getEffectExtent();
    
    /**
     * True if has "effectExtent" element
     */
    boolean isSetEffectExtent();
    
    /**
     * Sets the "effectExtent" element
     */
    void setEffectExtent(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent effectExtent);
    
    /**
     * Appends and returns a new empty "effectExtent" element
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent addNewEffectExtent();
    
    /**
     * Unsets the "effectExtent" element
     */
    void unsetEffectExtent();
    
    /**
     * Gets the "distT" attribute
     */
    long getDistT();
    
    /**
     * Gets (as xml) the "distT" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistT();
    
    /**
     * True if has "distT" attribute
     */
    boolean isSetDistT();
    
    /**
     * Sets the "distT" attribute
     */
    void setDistT(long distT);
    
    /**
     * Sets (as xml) the "distT" attribute
     */
    void xsetDistT(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distT);
    
    /**
     * Unsets the "distT" attribute
     */
    void unsetDistT();
    
    /**
     * Gets the "distB" attribute
     */
    long getDistB();
    
    /**
     * Gets (as xml) the "distB" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance xgetDistB();
    
    /**
     * True if has "distB" attribute
     */
    boolean isSetDistB();
    
    /**
     * Sets the "distB" attribute
     */
    void setDistB(long distB);
    
    /**
     * Sets (as xml) the "distB" attribute
     */
    void xsetDistB(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance distB);
    
    /**
     * Unsets the "distB" attribute
     */
    void unsetDistB();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
