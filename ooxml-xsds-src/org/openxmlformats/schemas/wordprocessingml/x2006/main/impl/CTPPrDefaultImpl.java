/*
 * XML Type:  CT_PPrDefault
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PPrDefault(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPPrDefaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault
{
    
    public CTPPrDefaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPr" element
     */
    public boolean isSetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPR$0) != 0;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pPr" element
     */
    public void unsetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPR$0, 0);
        }
    }
}
