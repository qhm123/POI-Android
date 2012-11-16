/*
 * XML Type:  CT_AccPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_AccPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTAccPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr
{
    
    public CTAccPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "chr");
    private static final javax.xml.namespace.QName CTRLPR$2 = 
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
