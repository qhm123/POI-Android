/*
 * XML Type:  CT_FuncPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_FuncPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTFuncPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTFuncPr
{
    
    public CTFuncPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTRLPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr getCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$0, 0);
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
            return get_store().count_elements(CTRLPR$0) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$0);
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
            get_store().remove_element(CTRLPR$0, 0);
        }
    }
}
