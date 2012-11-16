/*
 * An XML document type.
 * Localname: connections
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ConnectionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one connections(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface ConnectionsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConnectionsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("connectionsbd20doctype");
    
    /**
     * Gets the "connections" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections getConnections();
    
    /**
     * Sets the "connections" element
     */
    void setConnections(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections connections);
    
    /**
     * Appends and returns a new empty "connections" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections addNewConnections();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
