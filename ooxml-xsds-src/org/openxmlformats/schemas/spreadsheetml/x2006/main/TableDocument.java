/*
 * An XML document type.
 * Localname: table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface TableDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("table0b99doctype");
    
    /**
     * Gets the "table" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable getTable();
    
    /**
     * Sets the "table" element
     */
    void setTable(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable table);
    
    /**
     * Appends and returns a new empty "table" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable addNewTable();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
