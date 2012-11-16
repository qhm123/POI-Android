/*
 * XML Type:  CT_RPrDefault
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_RPrDefault(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRPrDefaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault
{
    
    public CTRPrDefaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$0) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$0, 0);
        }
    }
}
