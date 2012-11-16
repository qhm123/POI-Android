/*
 * XML Type:  CT_TblGrid
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblGrid(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblGridImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblGridBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid
{
    
    public CTTblGridImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLGRIDCHANGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblGridChange");
    
    
    /**
     * Gets the "tblGridChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange getTblGridChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange)get_store().find_element_user(TBLGRIDCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblGridChange" element
     */
    public boolean isSetTblGridChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLGRIDCHANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "tblGridChange" element
     */
    public void setTblGridChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange tblGridChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange)get_store().find_element_user(TBLGRIDCHANGE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange)get_store().add_element_user(TBLGRIDCHANGE$0);
            }
            target.set(tblGridChange);
        }
    }
    
    /**
     * Appends and returns a new empty "tblGridChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange addNewTblGridChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange)get_store().add_element_user(TBLGRIDCHANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblGridChange" element
     */
    public void unsetTblGridChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLGRIDCHANGE$0, 0);
        }
    }
}
