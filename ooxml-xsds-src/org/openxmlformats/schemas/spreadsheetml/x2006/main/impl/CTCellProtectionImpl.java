/*
 * XML Type:  CT_CellProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellProtectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection
{
    
    public CTCellProtectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCKED$0 = 
        new javax.xml.namespace.QName("", "locked");
    private static final javax.xml.namespace.QName HIDDEN$2 = 
        new javax.xml.namespace.QName("", "hidden");
    
    
    /**
     * Gets the "locked" attribute
     */
    public boolean getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "locked" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$0);
            return target;
        }
    }
    
    /**
     * True if has "locked" attribute
     */
    public boolean isSetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKED$0) != null;
        }
    }
    
    /**
     * Sets the "locked" attribute
     */
    public void setLocked(boolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKED$0);
            }
            target.setBooleanValue(locked);
        }
    }
    
    /**
     * Sets (as xml) the "locked" attribute
     */
    public void xsetLocked(org.apache.xmlbeans.XmlBoolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKED$0);
            }
            target.set(locked);
        }
    }
    
    /**
     * Unsets the "locked" attribute
     */
    public void unsetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKED$0);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$2);
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$2) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$2);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$2);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$2);
        }
    }
}
