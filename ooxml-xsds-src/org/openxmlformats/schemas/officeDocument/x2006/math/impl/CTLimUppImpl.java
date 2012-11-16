/*
 * XML Type:  CT_LimUpp
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUpp
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_LimUpp(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTLimUppImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUpp
{
    
    public CTLimUppImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMUPPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "limUppPr");
    private static final javax.xml.namespace.QName E$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "e");
    private static final javax.xml.namespace.QName LIM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "lim");
    
    
    /**
     * Gets the "limUppPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr getLimUppPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr)get_store().find_element_user(LIMUPPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "limUppPr" element
     */
    public boolean isSetLimUppPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIMUPPPR$0) != 0;
        }
    }
    
    /**
     * Sets the "limUppPr" element
     */
    public void setLimUppPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr limUppPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr)get_store().find_element_user(LIMUPPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr)get_store().add_element_user(LIMUPPPR$0);
            }
            target.set(limUppPr);
        }
    }
    
    /**
     * Appends and returns a new empty "limUppPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr addNewLimUppPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimUppPr)get_store().add_element_user(LIMUPPPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "limUppPr" element
     */
    public void unsetLimUppPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIMUPPPR$0, 0);
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
