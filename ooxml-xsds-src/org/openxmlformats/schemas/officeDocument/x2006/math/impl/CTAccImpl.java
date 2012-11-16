/*
 * XML Type:  CT_Acc
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTAcc
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_Acc(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTAccImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTAcc
{
    
    public CTAccImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "accPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    
    
    /**
     * Gets the "accPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr getAccPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr)get_store().find_element_user(ACCPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accPr" element
     */
    public boolean isSetAccPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCPR$0) != 0;
        }
    }
    
    /**
     * Sets the "accPr" element
     */
    public void setAccPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr accPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr)get_store().find_element_user(ACCPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr)get_store().add_element_user(ACCPR$0);
            }
            target.set(accPr);
        }
    }
    
    /**
     * Appends and returns a new empty "accPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr addNewAccPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr)get_store().add_element_user(ACCPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "accPr" element
     */
    public void unsetAccPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCPR$0, 0);
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
