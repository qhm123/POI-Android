/*
 * An XML document type.
 * Localname: tbl
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.TblDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * A document containing one tbl(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public class TblDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.TblDocument
{
    
    public TblDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tbl");
    
    
    /**
     * Gets the "tbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTable getTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTable)get_store().find_element_user(TBL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tbl" element
     */
    public void setTbl(org.openxmlformats.schemas.drawingml.x2006.main.CTTable tbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTable)get_store().find_element_user(TBL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTable)get_store().add_element_user(TBL$0);
            }
            target.set(tbl);
        }
    }
    
    /**
     * Appends and returns a new empty "tbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTable addNewTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTable target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTable)get_store().add_element_user(TBL$0);
            return target;
        }
    }
}
