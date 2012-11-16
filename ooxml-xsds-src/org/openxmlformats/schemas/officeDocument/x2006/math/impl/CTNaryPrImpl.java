/*
 * XML Type:  CT_NaryPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_NaryPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTNaryPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr
{
    
    public CTNaryPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "chr");
    private static final javax.xml.namespace.QName LIMLOC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "limLoc");
    private static final javax.xml.namespace.QName GROW$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "grow");
    private static final javax.xml.namespace.QName SUBHIDE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "subHide");
    private static final javax.xml.namespace.QName SUPHIDE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "supHide");
    private static final javax.xml.namespace.QName CTRLPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "chr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar getChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(CHR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chr" element
     */
    public boolean isSetChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHR$0) != 0;
        }
    }
    
    /**
     * Sets the "chr" element
     */
    public void setChr(org.openxmlformats.schemas.officeDocument.x2006.math.CTChar chr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(CHR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(CHR$0);
            }
            target.set(chr);
        }
    }
    
    /**
     * Appends and returns a new empty "chr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar addNewChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(CHR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "chr" element
     */
    public void unsetChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHR$0, 0);
        }
    }
    
    /**
     * Gets the "limLoc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc getLimLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(LIMLOC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "limLoc" element
     */
    public boolean isSetLimLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIMLOC$2) != 0;
        }
    }
    
    /**
     * Sets the "limLoc" element
     */
    public void setLimLoc(org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc limLoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(LIMLOC$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(LIMLOC$2);
            }
            target.set(limLoc);
        }
    }
    
    /**
     * Appends and returns a new empty "limLoc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc addNewLimLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(LIMLOC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "limLoc" element
     */
    public void unsetLimLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIMLOC$2, 0);
        }
    }
    
    /**
     * Gets the "grow" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(GROW$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grow" element
     */
    public boolean isSetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROW$4) != 0;
        }
    }
    
    /**
     * Sets the "grow" element
     */
    public void setGrow(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff grow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(GROW$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(GROW$4);
            }
            target.set(grow);
        }
    }
    
    /**
     * Appends and returns a new empty "grow" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(GROW$4);
            return target;
        }
    }
    
    /**
     * Unsets the "grow" element
     */
    public void unsetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROW$4, 0);
        }
    }
    
    /**
     * Gets the "subHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getSubHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SUBHIDE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subHide" element
     */
    public boolean isSetSubHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBHIDE$6) != 0;
        }
    }
    
    /**
     * Sets the "subHide" element
     */
    public void setSubHide(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff subHide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SUBHIDE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SUBHIDE$6);
            }
            target.set(subHide);
        }
    }
    
    /**
     * Appends and returns a new empty "subHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewSubHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SUBHIDE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "subHide" element
     */
    public void unsetSubHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBHIDE$6, 0);
        }
    }
    
    /**
     * Gets the "supHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getSupHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SUPHIDE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supHide" element
     */
    public boolean isSetSupHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPHIDE$8) != 0;
        }
    }
    
    /**
     * Sets the "supHide" element
     */
    public void setSupHide(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff supHide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SUPHIDE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SUPHIDE$8);
            }
            target.set(supHide);
        }
    }
    
    /**
     * Appends and returns a new empty "supHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewSupHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SUPHIDE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "supHide" element
     */
    public void unsetSupHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPHIDE$8, 0);
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
