/*
 * XML Type:  CT_PhantPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_PhantPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTPhantPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr
{
    
    public CTPhantPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHOW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "show");
    private static final javax.xml.namespace.QName ZEROWID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "zeroWid");
    private static final javax.xml.namespace.QName ZEROASC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "zeroAsc");
    private static final javax.xml.namespace.QName ZERODESC$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "zeroDesc");
    private static final javax.xml.namespace.QName TRANSP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "transp");
    private static final javax.xml.namespace.QName CTRLPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "show" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SHOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "show" element
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOW$0) != 0;
        }
    }
    
    /**
     * Sets the "show" element
     */
    public void setShow(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SHOW$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SHOW$0);
            }
            target.set(show);
        }
    }
    
    /**
     * Appends and returns a new empty "show" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SHOW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "show" element
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOW$0, 0);
        }
    }
    
    /**
     * Gets the "zeroWid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getZeroWid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZEROWID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zeroWid" element
     */
    public boolean isSetZeroWid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZEROWID$2) != 0;
        }
    }
    
    /**
     * Sets the "zeroWid" element
     */
    public void setZeroWid(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff zeroWid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZEROWID$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZEROWID$2);
            }
            target.set(zeroWid);
        }
    }
    
    /**
     * Appends and returns a new empty "zeroWid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewZeroWid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZEROWID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "zeroWid" element
     */
    public void unsetZeroWid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZEROWID$2, 0);
        }
    }
    
    /**
     * Gets the "zeroAsc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getZeroAsc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZEROASC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zeroAsc" element
     */
    public boolean isSetZeroAsc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZEROASC$4) != 0;
        }
    }
    
    /**
     * Sets the "zeroAsc" element
     */
    public void setZeroAsc(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff zeroAsc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZEROASC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZEROASC$4);
            }
            target.set(zeroAsc);
        }
    }
    
    /**
     * Appends and returns a new empty "zeroAsc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewZeroAsc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZEROASC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "zeroAsc" element
     */
    public void unsetZeroAsc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZEROASC$4, 0);
        }
    }
    
    /**
     * Gets the "zeroDesc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getZeroDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZERODESC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zeroDesc" element
     */
    public boolean isSetZeroDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZERODESC$6) != 0;
        }
    }
    
    /**
     * Sets the "zeroDesc" element
     */
    public void setZeroDesc(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff zeroDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(ZERODESC$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZERODESC$6);
            }
            target.set(zeroDesc);
        }
    }
    
    /**
     * Appends and returns a new empty "zeroDesc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewZeroDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(ZERODESC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "zeroDesc" element
     */
    public void unsetZeroDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZERODESC$6, 0);
        }
    }
    
    /**
     * Gets the "transp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getTransp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(TRANSP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transp" element
     */
    public boolean isSetTransp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSP$8) != 0;
        }
    }
    
    /**
     * Sets the "transp" element
     */
    public void setTransp(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff transp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(TRANSP$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(TRANSP$8);
            }
            target.set(transp);
        }
    }
    
    /**
     * Appends and returns a new empty "transp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewTransp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(TRANSP$8);
            return target;
        }
    }
    
    /**
     * Unsets the "transp" element
     */
    public void unsetTransp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSP$8, 0);
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
