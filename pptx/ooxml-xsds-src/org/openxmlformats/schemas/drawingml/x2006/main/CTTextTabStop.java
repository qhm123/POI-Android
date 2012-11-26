/*
 * XML Type:  CT_TextTabStop
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TextTabStop(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextTabStop extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextTabStop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttexttabstopb57btype");
    
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
     * Gets the "algn" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType.Enum getAlgn();
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType xgetAlgn();
    
    /**
     * True if has "algn" attribute
     */
    boolean isSetAlgn();
    
    /**
     * Sets the "algn" attribute
     */
    void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType.Enum algn);
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType algn);
    
    /**
     * Unsets the "algn" attribute
     */
    void unsetAlgn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
