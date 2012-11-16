/*
 * An XML document type.
 * Localname: queryTable
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.QueryTableDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one queryTable(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class QueryTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.QueryTableDocument
{
    
    public QueryTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTABLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryTable");
    
    
    /**
     * Gets the "queryTable" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable getQueryTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable)get_store().find_element_user(QUERYTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryTable" element
     */
    public void setQueryTable(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable queryTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable)get_store().find_element_user(QUERYTABLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable)get_store().add_element_user(QUERYTABLE$0);
            }
            target.set(queryTable);
        }
    }
    
    /**
     * Appends and returns a new empty "queryTable" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable addNewQueryTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable)get_store().add_element_user(QUERYTABLE$0);
            return target;
        }
    }
}
