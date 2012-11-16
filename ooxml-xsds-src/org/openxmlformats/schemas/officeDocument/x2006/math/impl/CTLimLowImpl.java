/*
 * XML Type:  CT_LimLow
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_LimLow(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTLimLowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLow
{
    
    public CTLimLowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMLOWPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "limLowPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    private static final javax.xml.namespace.QName LIM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "lim");
    
    
    /**
     * Gets the "limLowPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr getLimLowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr)get_store().find_element_user(LIMLOWPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "limLowPr" element
     */
    public boolean isSetLimLowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIMLOWPR$0) != 0;
        }
    }
    
    /**
     * Sets the "limLowPr" element
     */
    public void setLimLowPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr limLowPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr)get_store().find_element_user(LIMLOWPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr)get_store().add_element_user(LIMLOWPR$0);
            }
            target.set(limLowPr);
        }
    }
    
    /**
     * Appends and returns a new empty "limLowPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr addNewLimLowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLowPr)get_store().add_element_user(LIMLOWPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "limLowPr" element
     */
    public void unsetLimLowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIMLOWPR$0, 0);
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
    
    /**
     * Gets the "lim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(LIM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lim" element
     */
    public void setLim(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg lim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().find_element_user(LIM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(LIM$4);
            }
            target.set(lim);
        }
    }
    
    /**
     * Appends and returns a new empty "lim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg)get_store().add_element_user(LIM$4);
            return target;
        }
    }
}
