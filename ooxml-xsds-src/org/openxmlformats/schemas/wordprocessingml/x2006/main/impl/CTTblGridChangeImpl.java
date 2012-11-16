/*
 * XML Type:  CT_TblGridChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblGridChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblGridChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTMarkupImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange
{
    
    public CTTblGridChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLGRID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblGrid");
    
    
    /**
     * Gets the "tblGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase getTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase)get_store().find_element_user(TBLGRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblGrid" element
     */
    public void setTblGrid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase tblGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase)get_store().find_element_user(TBLGRID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase)get_store().add_element_user(TBLGRID$0);
            }
            target.set(tblGrid);
        }
    }
    
    /**
     * Appends and returns a new empty "tblGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase addNewTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase)get_store().add_element_user(TBLGRID$0);
            return target;
        }
    }
}
