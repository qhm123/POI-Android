/*
 * XML Type:  CT_TblPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange
{
    
    public CTTblPrChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPr");
    
    
    /**
     * Gets the "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase getTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblPr" element
     */
    public void setTblPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase tblPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$0);
            }
            target.set(tblPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase addNewTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$0);
            return target;
        }
    }
}
