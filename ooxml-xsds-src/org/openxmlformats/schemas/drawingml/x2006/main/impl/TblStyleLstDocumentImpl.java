/*
 * An XML document type.
 * Localname: tblStyleLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.TblStyleLstDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * A document containing one tblStyleLst(@http://schemas.openxmlformats.org/drawingml/2006/main) element.
 *
 * This is a complex type.
 */
public class TblStyleLstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.TblStyleLstDocument
{
    
    public TblStyleLstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLSTYLELST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblStyleLst");
    
    
    /**
     * Gets the "tblStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList getTblStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList)get_store().find_element_user(TBLSTYLELST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblStyleLst" element
     */
    public void setTblStyleLst(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList tblStyleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList)get_store().find_element_user(TBLSTYLELST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList)get_store().add_element_user(TBLSTYLELST$0);
            }
            target.set(tblStyleLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tblStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList addNewTblStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList)get_store().add_element_user(TBLSTYLELST$0);
            return target;
        }
    }
}
