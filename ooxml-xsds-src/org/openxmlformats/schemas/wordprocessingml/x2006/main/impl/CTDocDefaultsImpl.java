/*
 * XML Type:  CT_DocDefaults
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocDefaults(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocDefaultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults
{
    
    public CTDocDefaultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPRDEFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPrDefault");
    private static final javax.xml.namespace.QName PPRDEFAULT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPrDefault");
    
    
    /**
     * Gets the "rPrDefault" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault getRPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault)get_store().find_element_user(RPRDEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPrDefault" element
     */
    public boolean isSetRPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPRDEFAULT$0) != 0;
        }
    }
    
    /**
     * Sets the "rPrDefault" element
     */
    public void setRPrDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault rPrDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault)get_store().find_element_user(RPRDEFAULT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault)get_store().add_element_user(RPRDEFAULT$0);
            }
            target.set(rPrDefault);
        }
    }
    
    /**
     * Appends and returns a new empty "rPrDefault" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault addNewRPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault)get_store().add_element_user(RPRDEFAULT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rPrDefault" element
     */
    public void unsetRPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPRDEFAULT$0, 0);
        }
    }
    
    /**
     * Gets the "pPrDefault" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault getPPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault)get_store().find_element_user(PPRDEFAULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPrDefault" element
     */
    public boolean isSetPPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPRDEFAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "pPrDefault" element
     */
    public void setPPrDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault pPrDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault)get_store().find_element_user(PPRDEFAULT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault)get_store().add_element_user(PPRDEFAULT$2);
            }
            target.set(pPrDefault);
        }
    }
    
    /**
     * Appends and returns a new empty "pPrDefault" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault addNewPPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault)get_store().add_element_user(PPRDEFAULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pPrDefault" element
     */
    public void unsetPPrDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPRDEFAULT$2, 0);
        }
    }
}
