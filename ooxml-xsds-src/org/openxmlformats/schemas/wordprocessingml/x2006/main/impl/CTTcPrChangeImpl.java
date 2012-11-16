/*
 * XML Type:  CT_TcPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TcPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTcPrChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange
{
    
    public CTTcPrChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPr");
    
    
    /**
     * Gets the "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner getTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner)get_store().find_element_user(TCPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tcPr" element
     */
    public void setTcPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner tcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner)get_store().find_element_user(TCPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner)get_store().add_element_user(TCPR$0);
            }
            target.set(tcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner addNewTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrInner)get_store().add_element_user(TCPR$0);
            return target;
        }
    }
}
