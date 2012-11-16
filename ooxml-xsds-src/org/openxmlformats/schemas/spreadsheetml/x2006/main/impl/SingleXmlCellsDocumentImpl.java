/*
 * An XML document type.
 * Localname: singleXmlCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.SingleXmlCellsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one singleXmlCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class SingleXmlCellsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.SingleXmlCellsDocument
{
    
    public SingleXmlCellsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEXMLCELLS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "singleXmlCells");
    
    
    /**
     * Gets the "singleXmlCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells getSingleXmlCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells)get_store().find_element_user(SINGLEXMLCELLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "singleXmlCells" element
     */
    public void setSingleXmlCells(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells singleXmlCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells)get_store().find_element_user(SINGLEXMLCELLS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells)get_store().add_element_user(SINGLEXMLCELLS$0);
            }
            target.set(singleXmlCells);
        }
    }
    
    /**
     * Appends and returns a new empty "singleXmlCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells addNewSingleXmlCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells)get_store().add_element_user(SINGLEXMLCELLS$0);
            return target;
        }
    }
}
