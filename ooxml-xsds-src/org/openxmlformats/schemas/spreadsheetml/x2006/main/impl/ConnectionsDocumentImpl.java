/*
 * An XML document type.
 * Localname: connections
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ConnectionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one connections(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class ConnectionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.ConnectionsDocument
{
    
    public ConnectionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "connections");
    
    
    /**
     * Gets the "connections" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections getConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections)get_store().find_element_user(CONNECTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "connections" element
     */
    public void setConnections(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections connections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections)get_store().find_element_user(CONNECTIONS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections)get_store().add_element_user(CONNECTIONS$0);
            }
            target.set(connections);
        }
    }
    
    /**
     * Appends and returns a new empty "connections" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections addNewConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections)get_store().add_element_user(CONNECTIONS$0);
            return target;
        }
    }
}
