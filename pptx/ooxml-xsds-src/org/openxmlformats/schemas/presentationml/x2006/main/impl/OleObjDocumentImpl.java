/*
 * An XML document type.
 * Localname: oleObj
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.OleObjDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * A document containing one oleObj(@http://schemas.openxmlformats.org/presentationml/2006/main) element.
 *
 * This is a complex type.
 */
public class OleObjDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.OleObjDocument
{
    
    public OleObjDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEOBJ$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "oleObj");
    
    
    /**
     * Gets the "oleObj" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject getOleObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject)get_store().find_element_user(OLEOBJ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oleObj" element
     */
    public void setOleObj(org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject oleObj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject)get_store().find_element_user(OLEOBJ$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject)get_store().add_element_user(OLEOBJ$0);
            }
            target.set(oleObj);
        }
    }
    
    /**
     * Appends and returns a new empty "oleObj" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject addNewOleObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject)get_store().add_element_user(OLEOBJ$0);
            return target;
        }
    }
}
