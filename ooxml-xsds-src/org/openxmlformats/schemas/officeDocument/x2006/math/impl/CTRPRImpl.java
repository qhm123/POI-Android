/*
 * XML Type:  CT_RPR
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_RPR(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTRPRImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTRPR
{
    
    public CTRPRImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "lit");
    private static final javax.xml.namespace.QName NOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "nor");
    private static final javax.xml.namespace.QName SCR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "scr");
    private static final javax.xml.namespace.QName STY$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sty");
    private static final javax.xml.namespace.QName BRK$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "brk");
    private static final javax.xml.namespace.QName ALN$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "aln");
    
    
    /**
     * Gets the "lit" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(LIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lit" element
     */
    public boolean isSetLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIT$0) != 0;
        }
    }
    
    /**
     * Sets the "lit" element
     */
    public void setLit(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff lit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(LIT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(LIT$0);
            }
            target.set(lit);
        }
    }
    
    /**
     * Appends and returns a new empty "lit" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(LIT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "lit" element
     */
    public void unsetLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIT$0, 0);
        }
    }
    
    /**
     * Gets the "nor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getNor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(NOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nor" element
     */
    public boolean isSetNor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOR$2) != 0;
        }
    }
    
    /**
     * Sets the "nor" element
     */
    public void setNor(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff nor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(NOR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(NOR$2);
            }
            target.set(nor);
        }
    }
    
    /**
     * Appends and returns a new empty "nor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewNor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(NOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "nor" element
     */
    public void unsetNor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOR$2, 0);
        }
    }
    
    /**
     * Gets the "scr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTScript getScr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTScript target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTScript)get_store().find_element_user(SCR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scr" element
     */
    public boolean isSetScr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCR$4) != 0;
        }
    }
    
    /**
     * Sets the "scr" element
     */
    public void setScr(org.openxmlformats.schemas.officeDocument.x2006.math.CTScript scr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTScript target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTScript)get_store().find_element_user(SCR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTScript)get_store().add_element_user(SCR$4);
            }
            target.set(scr);
        }
    }
    
    /**
     * Appends and returns a new empty "scr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTScript addNewScr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTScript target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTScript)get_store().add_element_user(SCR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "scr" element
     */
    public void unsetScr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCR$4, 0);
        }
    }
    
    /**
     * Gets the "sty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle getSty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle)get_store().find_element_user(STY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sty" element
     */
    public boolean isSetSty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STY$6) != 0;
        }
    }
    
    /**
     * Sets the "sty" element
     */
    public void setSty(org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle sty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle)get_store().find_element_user(STY$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle)get_store().add_element_user(STY$6);
            }
            target.set(sty);
        }
    }
    
    /**
     * Appends and returns a new empty "sty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle addNewSty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTStyle)get_store().add_element_user(STY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sty" element
     */
    public void unsetSty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STY$6, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().find_element_user(BRK$8, 0);
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
            return get_store().count_elements(BRK$8) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().find_element_user(BRK$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().add_element_user(BRK$8);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak)get_store().add_element_user(BRK$8);
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
            get_store().remove_element(BRK$8, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ALN$10, 0);
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
            return get_store().count_elements(ALN$10) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ALN$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ALN$10);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ALN$10);
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
            get_store().remove_element(ALN$10, 0);
        }
    }
}
