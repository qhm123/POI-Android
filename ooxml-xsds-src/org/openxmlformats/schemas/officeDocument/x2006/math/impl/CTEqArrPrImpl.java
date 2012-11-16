/*
 * XML Type:  CT_EqArrPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_EqArrPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTEqArrPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr
{
    
    public CTEqArrPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEJC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "baseJc");
    private static final javax.xml.namespace.QName MAXDIST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "maxDist");
    private static final javax.xml.namespace.QName OBJDIST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "objDist");
    private static final javax.xml.namespace.QName RSPRULE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rSpRule");
    private static final javax.xml.namespace.QName RSP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rSp");
    private static final javax.xml.namespace.QName CTRLPR$10 = 
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
     * Gets the "maxDist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getMaxDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(MAXDIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxDist" element
     */
    public boolean isSetMaxDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDIST$2) != 0;
        }
    }
    
    /**
     * Sets the "maxDist" element
     */
    public void setMaxDist(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff maxDist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(MAXDIST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(MAXDIST$2);
            }
            target.set(maxDist);
        }
    }
    
    /**
     * Appends and returns a new empty "maxDist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewMaxDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(MAXDIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "maxDist" element
     */
    public void unsetMaxDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDIST$2, 0);
        }
    }
    
    /**
     * Gets the "objDist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getObjDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(OBJDIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objDist" element
     */
    public boolean isSetObjDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJDIST$4) != 0;
        }
    }
    
    /**
     * Sets the "objDist" element
     */
    public void setObjDist(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff objDist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(OBJDIST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(OBJDIST$4);
            }
            target.set(objDist);
        }
    }
    
    /**
     * Appends and returns a new empty "objDist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewObjDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(OBJDIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "objDist" element
     */
    public void unsetObjDist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJDIST$4, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(RSPRULE$6, 0);
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
            return get_store().count_elements(RSPRULE$6) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().find_element_user(RSPRULE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(RSPRULE$6);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTSpacingRule)get_store().add_element_user(RSPRULE$6);
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
            get_store().remove_element(RSPRULE$6, 0);
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
