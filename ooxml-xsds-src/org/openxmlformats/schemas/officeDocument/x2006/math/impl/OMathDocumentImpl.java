/*
 * An XML document type.
 * Localname: oMath
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.OMathDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * A document containing one oMath(@http://schemas.openxmlformats.org/officeDocument/2006/math) element.
 *
 * This is a complex type.
 */
public class OMathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.OMathDocument
{
    
    public OMathDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMATH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");
    
    
    /**
     * Gets the "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath getOMath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oMath" element
     */
    public void setOMath(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath oMath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().add_element_user(OMATH$0);
            }
            target.set(oMath);
        }
    }
    
    /**
     * Appends and returns a new empty "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath addNewOMath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().add_element_user(OMATH$0);
            return target;
        }
    }
}
