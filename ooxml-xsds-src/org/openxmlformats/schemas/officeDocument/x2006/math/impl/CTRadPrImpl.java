/*
 * XML Type:  CT_RadPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_RadPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTRadPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTRadPr
{
    
    public CTRadPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGHIDE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "degHide");
    private static final javax.xml.namespace.QName CTRLPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "degHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getDegHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DEGHIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "degHide" element
     */
    public boolean isSetDegHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEGHIDE$0) != 0;
        }
    }
    
    /**
     * Sets the "degHide" element
     */
    public void setDegHide(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff degHide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DEGHIDE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DEGHIDE$0);
            }
            target.set(degHide);
        }
    }
    
    /**
     * Appends and returns a new empty "degHide" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewDegHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DEGHIDE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "degHide" element
     */
    public void unsetDegHide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEGHIDE$0, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$2, 0);
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
            return get_store().count_elements(CTRLPR$2) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$2);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$2);
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
            get_store().remove_element(CTRLPR$2, 0);
        }
    }
}
