/*
 * An XML document type.
 * Localname: table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class TableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument
{
    
    public TableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "table");
    
    
    /**
     * Gets the "table" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable getTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable)get_store().find_element_user(TABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "table" element
     */
    public void setTable(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable)get_store().find_element_user(TABLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable)get_store().add_element_user(TABLE$0);
            }
            target.set(table);
        }
    }
    
    /**
     * Appends and returns a new empty "table" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable)get_store().add_element_user(TABLE$0);
            return target;
        }
    }
}
