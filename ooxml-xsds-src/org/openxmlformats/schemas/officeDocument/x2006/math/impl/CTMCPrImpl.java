/*
 * XML Type:  CT_MCPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_MCPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMCPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTMCPr
{
    
    public CTMCPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "count");
    private static final javax.xml.namespace.QName MCJC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mcJc");
    
    
    /**
     * Gets the "count" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "count" element
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "count" element
     */
    public void setCount(org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255)get_store().find_element_user(COUNT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255)get_store().add_element_user(COUNT$0);
            }
            target.set(count);
        }
    }
    
    /**
     * Appends and returns a new empty "count" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 addNewCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTInteger255)get_store().add_element_user(COUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "count" element
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNT$0, 0);
        }
    }
    
    /**
     * Gets the "mcJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign getMcJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign)get_store().find_element_user(MCJC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mcJc" element
     */
    public boolean isSetMcJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MCJC$2) != 0;
        }
    }
    
    /**
     * Sets the "mcJc" element
     */
    public void setMcJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign mcJc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign)get_store().find_element_user(MCJC$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign)get_store().add_element_user(MCJC$2);
            }
            target.set(mcJc);
        }
    }
    
    /**
     * Appends and returns a new empty "mcJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign addNewMcJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTXAlign)get_store().add_element_user(MCJC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "mcJc" element
     */
    public void unsetMcJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MCJC$2, 0);
        }
    }
}
