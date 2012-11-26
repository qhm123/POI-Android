/*
 * An XML document type.
 * Localname: tbl
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.TblDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * A document containing one tbl(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public interface TblDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TblDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("tbleb1bdoctype");
    
    /**
     * Gets the "tbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTable getTbl();
    
    /**
     * Sets the "tbl" element
     */
    void setTbl(org.openxmlformats.schemas.drawingml.x2006.main.CTTable tbl);
    
    /**
     * Appends and returns a new empty "tbl" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTable addNewTbl();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
