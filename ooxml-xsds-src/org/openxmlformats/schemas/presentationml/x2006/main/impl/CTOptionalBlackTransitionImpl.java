/*
 * XML Type:  CT_OptionalBlackTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_OptionalBlackTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTOptionalBlackTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTOptionalBlackTransition
{
    
    public CTOptionalBlackTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THRUBLK$0 = 
        new javax.xml.namespace.QName("", "thruBlk");
    
    
    /**
     * Gets the "thruBlk" attribute
     */
    public boolean getThruBlk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRUBLK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THRUBLK$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thruBlk" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThruBlk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THRUBLK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THRUBLK$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "thruBlk" attribute
     */
    public boolean isSetThruBlk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THRUBLK$0) != null;
        }
    }
    
    /**
     * Sets the "thruBlk" attribute
     */
    public void setThruBlk(boolean thruBlk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRUBLK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THRUBLK$0);
            }
            target.setBooleanValue(thruBlk);
        }
    }
    
    /**
     * Sets (as xml) the "thruBlk" attribute
     */
    public void xsetThruBlk(org.apache.xmlbeans.XmlBoolean thruBlk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THRUBLK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THRUBLK$0);
            }
            target.set(thruBlk);
        }
    }
    
    /**
     * Unsets the "thruBlk" attribute
     */
    public void unsetThruBlk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THRUBLK$0);
        }
    }
}
