/*
 * XML Type:  CT_PPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPPrChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange
{
    
    public CTPPrChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase)get_store().add_element_user(PPR$0);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase)get_store().add_element_user(PPR$0);
            return target;
        }
    }
}
