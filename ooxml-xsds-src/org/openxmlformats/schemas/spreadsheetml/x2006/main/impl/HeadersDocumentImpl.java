/*
 * An XML document type.
 * Localname: headers
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.HeadersDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one headers(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class HeadersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.HeadersDocument
{
    
    public HeadersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headers");
    
    
    /**
     * Gets the "headers" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders getHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders)get_store().find_element_user(HEADERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "headers" element
     */
    public void setHeaders(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders)get_store().find_element_user(HEADERS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders)get_store().add_element_user(HEADERS$0);
            }
            target.set(headers);
        }
    }
    
    /**
     * Appends and returns a new empty "headers" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders addNewHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders)get_store().add_element_user(HEADERS$0);
            return target;
        }
    }
}
