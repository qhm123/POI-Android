/*
 * XML Type:  CT_TrPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TrPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTrPrChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange
{
    
    public CTTrPrChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPr");
    
    
    /**
     * Gets the "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase getTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase)get_store().find_element_user(TRPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "trPr" element
     */
    public void setTrPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase trPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase)get_store().find_element_user(TRPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase)get_store().add_element_user(TRPR$0);
            }
            target.set(trPr);
        }
    }
    
    /**
     * Appends and returns a new empty "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase addNewTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase)get_store().add_element_user(TRPR$0);
            return target;
        }
    }
}
