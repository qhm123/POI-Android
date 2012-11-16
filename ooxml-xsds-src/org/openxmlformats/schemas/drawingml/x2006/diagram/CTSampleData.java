/*
 * XML Type:  CT_SampleData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML CT_SampleData(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public interface CTSampleData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSampleData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsampledata6dfdtype");
    
    /**
     * Gets the "dataModel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel getDataModel();
    
    /**
     * True if has "dataModel" element
     */
    boolean isSetDataModel();
    
    /**
     * Sets the "dataModel" element
     */
    void setDataModel(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel dataModel);
    
    /**
     * Appends and returns a new empty "dataModel" element
     */
    org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel addNewDataModel();
    
    /**
     * Unsets the "dataModel" element
     */
    void unsetDataModel();
    
    /**
     * Gets the "useDef" attribute
     */
    boolean getUseDef();
    
    /**
     * Gets (as xml) the "useDef" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseDef();
    
    /**
     * True if has "useDef" attribute
     */
    boolean isSetUseDef();
    
    /**
     * Sets the "useDef" attribute
     */
    void setUseDef(boolean useDef);
    
    /**
     * Sets (as xml) the "useDef" attribute
     */
    void xsetUseDef(org.apache.xmlbeans.XmlBoolean useDef);
    
    /**
     * Unsets the "useDef" attribute
     */
    void unsetUseDef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
