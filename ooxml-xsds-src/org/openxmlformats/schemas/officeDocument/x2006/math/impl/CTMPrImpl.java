/*
 * XML Type:  CT_MPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_MPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTMPr
{
    
    public CTMPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEJC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "baseJc");
    private static final javax.xml.namespace.QName PLCHIDE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "plcHide");
    private static final javax.xml.namespace.QName RSPRULE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rSpRule");
    private static final javax.xml.namespace.QName CGPRULE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "cGpRule");
    private static final javax.xml.namespace.QName RSP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rSp");
    private static final javax.xml.namespace.QName CSP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "cSp");
    private static final javax.xml.namespace.QName CGP$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "cGp");
    private static final javax.xml.namespace.QName MCS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mcs");
    private static final javax.xml.namespace.QName CTRLPR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "baseJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign getBaseJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign)get_store().find_element_user(BASEJC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "baseJc" element
     */
    public boolean isSetBaseJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEJC$0) != 0;
        }
    }
    
    /**
     * Sets the "baseJc" element
     */
    public void setBaseJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign baseJc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign)get_store().find_element_user(BASEJC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign)get_store().add_element_user(BASEJC$0);
            }
            target.set(baseJc);
        }
    }
    
    /**
     * Appends and returns a new empty "baseJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign addNewBaseJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTYAlign)get_store().add_element_user(BASEJC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "baseJc" element
     */
    public void unsetBaseJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEJC$0, 0);
        }
    }
    
    /**
     * Gets the "plcHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getPlcHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(PLCHIDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plcHide" element
     */
    public boolean isSetPlcHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLCHIDE$2) != 0;
        }
    }
    
    /**
     * Sets the "plcHide" element
     */
    public void setPlcHide(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff plcHide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(PLCHIDE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(PLCHIDE$2);
            }
            target.set(plcHide);
        }
    }
    
    /**
     * Appends and returns a new empty "plcHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewPlcHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(PLCHIDE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "plcHide" element
     */
    public void unsetPlcHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLCHIDE$2, 0);
        }
    }
    
    /**
     * Gets the "rSpRule" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule getRSpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(RSPRULE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rSpRule" element
     */
    public boolean isSetRSpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSPRULE$4) != 0;
        }
    }
    
    /**
     * Sets the "rSpRule" element
     */
    public void setRSpRule(org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule rSpRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(RSPRULE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(RSPRULE$4);
            }
            target.set(rSpRule);
        }
    }
    
    /**
     * Appends and returns a new empty "rSpRule" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule addNewRSpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(RSPRULE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rSpRule" element
     */
    public void unsetRSpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSPRULE$4, 0);
        }
    }
    
    /**
     * Gets the "cGpRule" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule getCGpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(CGPRULE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cGpRule" element
     */
    public boolean isSetCGpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CGPRULE$6) != 0;
        }
    }
    
    /**
     * Sets the "cGpRule" element
     */
    public void setCGpRule(org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule cGpRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(CGPRULE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(CGPRULE$6);
            }
            target.set(cGpRule);
        }
    }
    
    /**
     * Appends and returns a new empty "cGpRule" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule addNewCGpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(CGPRULE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "cGpRule" element
     */
    public void unsetCGpRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CGPRULE$6, 0);
        }
    }
    
    /**
     * Gets the "rSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger getRSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(RSP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rSp" element
     */
    public boolean isSetRSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSP$8) != 0;
        }
    }
    
    /**
     * Sets the "rSp" element
     */
    public void setRSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger rSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(RSP$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(RSP$8);
            }
            target.set(rSp);
        }
    }
    
    /**
     * Appends and returns a new empty "rSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger addNewRSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(RSP$8);
            return target;
        }
    }
    
    /**
     * Unsets the "rSp" element
     */
    public void unsetRSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSP$8, 0);
        }
    }
    
    /**
     * Gets the "cSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger getCSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(CSP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cSp" element
     */
    public boolean isSetCSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSP$10) != 0;
        }
    }
    
    /**
     * Sets the "cSp" element
     */
    public void setCSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger cSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(CSP$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(CSP$10);
            }
            target.set(cSp);
        }
    }
    
    /**
     * Appends and returns a new empty "cSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger addNewCSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(CSP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "cSp" element
     */
    public void unsetCSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSP$10, 0);
        }
    }
    
    /**
     * Gets the "cGp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger getCGp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(CGP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cGp" element
     */
    public boolean isSetCGp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CGP$12) != 0;
        }
    }
    
    /**
     * Sets the "cGp" element
     */
    public void setCGp(org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger cGp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().find_element_user(CGP$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(CGP$12);
            }
            target.set(cGp);
        }
    }
    
    /**
     * Appends and returns a new empty "cGp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger addNewCGp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTUnSignedInteger)get_store().add_element_user(CGP$12);
            return target;
        }
    }
    
    /**
     * Unsets the "cGp" element
     */
    public void unsetCGp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CGP$12, 0);
        }
    }
    
    /**
     * Gets the "mcs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS getMcs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS)get_store().find_element_user(MCS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mcs" element
     */
    public boolean isSetMcs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MCS$14) != 0;
        }
    }
    
    /**
     * Sets the "mcs" element
     */
    public void setMcs(org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS mcs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS)get_store().find_element_user(MCS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS)get_store().add_element_user(MCS$14);
            }
            target.set(mcs);
        }
    }
    
    /**
     * Appends and returns a new empty "mcs" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS addNewMcs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMCS)get_store().add_element_user(MCS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "mcs" element
     */
    public void unsetMcs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MCS$14, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$16, 0);
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
            return get_store().count_elements(CTRLPR$16) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$16);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$16);
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
            get_store().remove_element(CTRLPR$16, 0);
        }
    }
}
