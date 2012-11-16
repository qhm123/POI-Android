/*
 * XML Type:  CT_BorderBox
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_BorderBox(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTBorderBoxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBox
{
    
    public CTBorderBoxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERBOXPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "borderBoxPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "borderBoxPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr getBorderBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr)get_store().find_element_user(BORDERBOXPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "borderBoxPr" element
     */
    public boolean isSetBorderBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERBOXPR$0) != 0;
        }
    }
    
    /**
     * Sets the "borderBoxPr" element
     */
    public void setBorderBoxPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr borderBoxPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr)get_store().find_element_user(BORDERBOXPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr)get_store().add_element_user(BORDERBOXPR$0);
            }
            target.set(borderBoxPr);
        }
    }
    
    /**
     * Appends and returns a new empty "borderBoxPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr addNewBorderBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr)get_store().add_element_user(BORDERBOXPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "borderBoxPr" element
     */
    public void unsetBorderBoxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERBOXPR$0, 0);
        }
    }
    
    /**
     * Gets the "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "e" element
     */
    public void setE(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(E$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$2);
            }
            target.set(e);
        }
    }
    
    /**
     * Appends and returns a new empty "e" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(E$2);
            return target;
        }
    }
}
