/*
 * XML Type:  CT_BoxPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_BoxPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTBoxPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr
{
    
    public CTBoxPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPEMU$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "opEmu");
    private static final javax.xml.namespace.QName NOBREAK$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "noBreak");
    private static final javax.xml.namespace.QName DIFF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "diff");
    private static final javax.xml.namespace.QName BRK$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "brk");
    private static final javax.xml.namespace.QName ALN$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "aln");
    private static final javax.xml.namespace.QName CTRLPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "opEmu" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getOpEmu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(OPEMU$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opEmu" element
     */
    public boolean isSetOpEmu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPEMU$0) != 0;
        }
    }
    
    /**
     * Sets the "opEmu" element
     */
    public void setOpEmu(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff opEmu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(OPEMU$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(OPEMU$0);
            }
            target.set(opEmu);
        }
    }
    
    /**
     * Appends and returns a new empty "opEmu" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewOpEmu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(OPEMU$0);
            return target;
        }
    }
    
    /**
     * Unsets the "opEmu" element
     */
    public void unsetOpEmu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPEMU$0, 0);
        }
    }
    
    /**
     * Gets the "noBreak" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getNoBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(NOBREAK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noBreak" element
     */
    public boolean isSetNoBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOBREAK$2) != 0;
        }
    }
    
    /**
     * Sets the "noBreak" element
     */
    public void setNoBreak(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff noBreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(NOBREAK$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(NOBREAK$2);
            }
            target.set(noBreak);
        }
    }
    
    /**
     * Appends and returns a new empty "noBreak" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewNoBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(NOBREAK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "noBreak" element
     */
    public void unsetNoBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOBREAK$2, 0);
        }
    }
    
    /**
     * Gets the "diff" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getDiff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DIFF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diff" element
     */
    public boolean isSetDiff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIFF$4) != 0;
        }
    }
    
    /**
     * Sets the "diff" element
     */
    public void setDiff(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff diff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DIFF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DIFF$4);
            }
            target.set(diff);
        }
    }
    
    /**
     * Appends and returns a new empty "diff" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewDiff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DIFF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "diff" element
     */
    public void unsetDiff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIFF$4, 0);
        }
    }
    
    /**
     * Gets the "brk" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak getBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().find_element_user(BRK$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "brk" element
     */
    public boolean isSetBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRK$6) != 0;
        }
    }
    
    /**
     * Sets the "brk" element
     */
    public void setBrk(org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak brk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().find_element_user(BRK$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().add_element_user(BRK$6);
            }
            target.set(brk);
        }
    }
    
    /**
     * Appends and returns a new empty "brk" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak addNewBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().add_element_user(BRK$6);
            return target;
        }
    }
    
    /**
     * Unsets the "brk" element
     */
    public void unsetBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRK$6, 0);
        }
    }
    
    /**
     * Gets the "aln" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getAln()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ALN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aln" element
     */
    public boolean isSetAln()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALN$8) != 0;
        }
    }
    
    /**
     * Sets the "aln" element
     */
    public void setAln(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff aln)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ALN$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ALN$8);
            }
            target.set(aln);
        }
    }
    
    /**
     * Appends and returns a new empty "aln" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewAln()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ALN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "aln" element
     */
    public void unsetAln()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALN$8, 0);
        }
    }
    
    /**
     * Gets the "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr getCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ctrlPr" element
     */
    public boolean isSetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTRLPR$10) != 0;
        }
    }
    
    /**
     * Sets the "ctrlPr" element
     */
    public void setCtrlPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr ctrlPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$10);
            }
            target.set(ctrlPr);
        }
    }
    
    /**
     * Appends and returns a new empty "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr addNewCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ctrlPr" element
     */
    public void unsetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTRLPR$10, 0);
        }
    }
}
