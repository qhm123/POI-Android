/*
 * XML Type:  CT_TblPrEx
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrEx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPrEx(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrExImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblPrExBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrEx
{
    
    public CTTblPrExImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLPREXCHANGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPrExChange");
    
    
    /**
     * Gets the "tblPrExChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange getTblPrExChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange)get_store().find_element_user(TBLPREXCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblPrExChange" element
     */
    public boolean isSetTblPrExChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPREXCHANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "tblPrExChange" element
     */
    public void setTblPrExChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange tblPrExChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange)get_store().find_element_user(TBLPREXCHANGE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange)get_store().add_element_user(TBLPREXCHANGE$0);
            }
            target.set(tblPrExChange);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPrExChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange addNewTblPrExChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange)get_store().add_element_user(TBLPREXCHANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblPrExChange" element
     */
    public void unsetTblPrExChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPREXCHANGE$0, 0);
        }
    }
}
