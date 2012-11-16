/*
 * XML Type:  CT_TextProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTTextProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_TextProps(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTTextProps extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextprops2c38type");
    
    /**
     * Gets the "sp3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D getSp3D();
    
    /**
     * True if has "sp3d" element
     */
    boolean isSetSp3D();
    
    /**
     * Sets the "sp3d" element
     */
    void setSp3D(org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D sp3D);
    
    /**
     * Appends and returns a new empty "sp3d" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D addNewSp3D();
    
    /**
     * Unsets the "sp3d" element
     */
    void unsetSp3D();
    
    /**
     * Gets the "flatTx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText getFlatTx();
    
    /**
     * True if has "flatTx" element
     */
    boolean isSetFlatTx();
    
    /**
     * Sets the "flatTx" element
     */
    void setFlatTx(org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText flatTx);
    
    /**
     * Appends and returns a new empty "flatTx" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText addNewFlatTx();
    
    /**
     * Unsets the "flatTx" element
     */
    void unsetFlatTx();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
