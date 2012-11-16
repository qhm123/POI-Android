/*
 * XML Type:  CT_CtrlPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_CtrlPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTCtrlPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr
{
    
    public CTCtrlPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName INS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    private static final javax.xml.namespace.QName DEL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
    
    
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
    
    /**
     * Gets the "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange getIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().find_element_user(INS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ins" element
     */
    public boolean isSetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INS$2) != 0;
        }
    }
    
    /**
     * Sets the "ins" element
     */
    public void setIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().find_element_user(INS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().add_element_user(INS$2);
            }
            target.set(ins);
        }
    }
    
    /**
     * Appends and returns a new empty "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().add_element_user(INS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ins" element
     */
    public void unsetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INS$2, 0);
        }
    }
    
    /**
     * Gets the "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange getDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().find_element_user(DEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "del" element
     */
    public boolean isSetDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEL$4) != 0;
        }
    }
    
    /**
     * Sets the "del" element
     */
    public void setDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange del)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().find_element_user(DEL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().add_element_user(DEL$4);
            }
            target.set(del);
        }
    }
    
    /**
     * Appends and returns a new empty "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange addNewDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrChange)get_store().add_element_user(DEL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "del" element
     */
    public void unsetDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEL$4, 0);
        }
    }
}
