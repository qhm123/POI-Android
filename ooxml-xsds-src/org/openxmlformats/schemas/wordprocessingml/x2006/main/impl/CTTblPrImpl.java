/*
 * XML Type:  CT_TblPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblPrBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr
{
    
    public CTTblPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLPRCHANGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPrChange");
    
    
    /**
     * Gets the "tblPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange getTblPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange)get_store().find_element_user(TBLPRCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblPrChange" element
     */
    public boolean isSetTblPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPRCHANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "tblPrChange" element
     */
    public void setTblPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange tblPrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange)get_store().find_element_user(TBLPRCHANGE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange)get_store().add_element_user(TBLPRCHANGE$0);
            }
            target.set(tblPrChange);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange addNewTblPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange)get_store().add_element_user(TBLPRCHANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblPrChange" element
     */
    public void unsetTblPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPRCHANGE$0, 0);
        }
    }
}
