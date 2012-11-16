/*
 * An XML document type.
 * Localname: pic
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/picture
 * Java type: org.openxmlformats.schemas.drawingml.x2006.picture.PicDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.picture;


/**
 * A document containing one pic(@http://schemas.openxmlformats.org/drawingml/2006/picture) element.
 *
 * This is a complex type.
 */
public interface PicDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PicDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("pic8010doctype");
    
    /**
     * Gets the "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture getPic();
    
    /**
     * Sets the "pic" element
     */
    void setPic(org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture pic);
    
    /**
     * Appends and returns a new empty "pic" element
     */
    org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture addNewPic();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
