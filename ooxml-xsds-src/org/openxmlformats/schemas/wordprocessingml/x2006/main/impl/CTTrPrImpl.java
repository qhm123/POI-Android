/*
 * XML Type:  CT_TrPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TrPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTrPrImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr
{
    
    public CTTrPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    private static final javax.xml.namespace.QName DEL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
    private static final javax.xml.namespace.QName TRPRCHANGE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPrChange");
    
    
    /**
     * Gets the "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$0, 0);
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
            return get_store().count_elements(INS$0) != 0;
        }
    }
    
    /**
     * Sets the "ins" element
     */
    public void setIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$0);
            }
            target.set(ins);
        }
    }
    
    /**
     * Appends and returns a new empty "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$0);
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
            get_store().remove_element(INS$0, 0);
        }
    }
    
    /**
     * Gets the "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(DEL$2, 0);
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
            return get_store().count_elements(DEL$2) != 0;
        }
    }
    
    /**
     * Sets the "del" element
     */
    public void setDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange del)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(DEL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(DEL$2);
            }
            target.set(del);
        }
    }
    
    /**
     * Appends and returns a new empty "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(DEL$2);
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
            get_store().remove_element(DEL$2, 0);
        }
    }
    
    /**
     * Gets the "trPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange getTrPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange)get_store().find_element_user(TRPRCHANGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trPrChange" element
     */
    public boolean isSetTrPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRPRCHANGE$4) != 0;
        }
    }
    
    /**
     * Sets the "trPrChange" element
     */
    public void setTrPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange trPrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange)get_store().find_element_user(TRPRCHANGE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange)get_store().add_element_user(TRPRCHANGE$4);
            }
            target.set(trPrChange);
        }
    }
    
    /**
     * Appends and returns a new empty "trPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange addNewTrPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange)get_store().add_element_user(TRPRCHANGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "trPrChange" element
     */
    public void unsetTrPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRPRCHANGE$4, 0);
        }
    }
}
