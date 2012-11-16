/*
 * An XML document type.
 * Localname: pic
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/picture
 * Java type: org.openxmlformats.schemas.drawingml.x2006.picture.PicDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.picture.impl;
/**
 * A document containing one pic(@http://schemas.openxmlformats.org/drawingml/2006/picture) element.
 *
 * This is a complex type.
 */
public class PicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.picture.PicDocument
{
    
    public PicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/picture", "pic");
    
    
    /**
     * Gets the "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture getPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture)get_store().find_element_user(PIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pic" element
     */
    public void setPic(org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture pic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture)get_store().find_element_user(PIC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture)get_store().add_element_user(PIC$0);
            }
            target.set(pic);
        }
    }
    
    /**
     * Appends and returns a new empty "pic" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture addNewPic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture)get_store().add_element_user(PIC$0);
            return target;
        }
    }
}
