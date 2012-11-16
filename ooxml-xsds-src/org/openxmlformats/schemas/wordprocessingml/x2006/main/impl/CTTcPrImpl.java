/*
 * XML Type:  CT_TcPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TcPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTcPrImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTcPrInnerImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr
{
    
    public CTTcPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCPRCHANGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPrChange");
    
    
    /**
     * Gets the "tcPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange getTcPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange)get_store().find_element_user(TCPRCHANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcPrChange" element
     */
    public boolean isSetTcPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCPRCHANGE$0) != 0;
        }
    }
    
    /**
     * Sets the "tcPrChange" element
     */
    public void setTcPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange tcPrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange)get_store().find_element_user(TCPRCHANGE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange)get_store().add_element_user(TCPRCHANGE$0);
            }
            target.set(tcPrChange);
        }
    }
    
    /**
     * Appends and returns a new empty "tcPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange addNewTcPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange)get_store().add_element_user(TCPRCHANGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tcPrChange" element
     */
    public void unsetTcPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCPRCHANGE$0, 0);
        }
    }
}
