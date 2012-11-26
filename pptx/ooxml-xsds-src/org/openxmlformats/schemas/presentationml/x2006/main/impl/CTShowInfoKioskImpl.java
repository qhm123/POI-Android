/*
 * XML Type:  CT_ShowInfoKiosk
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ShowInfoKiosk(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTShowInfoKioskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk
{
    
    public CTShowInfoKioskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTART$0 = 
        new javax.xml.namespace.QName("", "restart");
    
    
    /**
     * Gets the "restart" attribute
     */
    public long getRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESTART$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "restart" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RESTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(RESTART$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "restart" attribute
     */
    public boolean isSetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTART$0) != null;
        }
    }
    
    /**
     * Sets the "restart" attribute
     */
    public void setRestart(long restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTART$0);
            }
            target.setLongValue(restart);
        }
    }
    
    /**
     * Sets (as xml) the "restart" attribute
     */
    public void xsetRestart(org.apache.xmlbeans.XmlUnsignedInt restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RESTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RESTART$0);
            }
            target.set(restart);
        }
    }
    
    /**
     * Unsets the "restart" attribute
     */
    public void unsetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTART$0);
        }
    }
}
