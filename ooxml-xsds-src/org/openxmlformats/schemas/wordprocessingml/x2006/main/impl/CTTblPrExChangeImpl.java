/*
 * XML Type:  CT_TblPrExChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPrExChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrExChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange
{
    
    public CTTblPrExChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLPREX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPrEx");
    
    
    /**
     * Gets the "tblPrEx" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase getTblPrEx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase)get_store().find_element_user(TBLPREX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblPrEx" element
     */
    public void setTblPrEx(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase tblPrEx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase)get_store().find_element_user(TBLPREX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase)get_store().add_element_user(TBLPREX$0);
            }
            target.set(tblPrEx);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPrEx" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase addNewTblPrEx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase)get_store().add_element_user(TBLPREX$0);
            return target;
        }
    }
}
