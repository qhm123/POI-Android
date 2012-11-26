/*
 * XML Type:  CT_WheelTransition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_WheelTransition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTWheelTransitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTWheelTransition
{
    
    public CTWheelTransitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPOKES$0 = 
        new javax.xml.namespace.QName("", "spokes");
    
    
    /**
     * Gets the "spokes" attribute
     */
    public long getSpokes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPOKES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPOKES$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "spokes" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSpokes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SPOKES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(SPOKES$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "spokes" attribute
     */
    public boolean isSetSpokes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPOKES$0) != null;
        }
    }
    
    /**
     * Sets the "spokes" attribute
     */
    public void setSpokes(long spokes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPOKES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPOKES$0);
            }
            target.setLongValue(spokes);
        }
    }
    
    /**
     * Sets (as xml) the "spokes" attribute
     */
    public void xsetSpokes(org.apache.xmlbeans.XmlUnsignedInt spokes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SPOKES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SPOKES$0);
            }
            target.set(spokes);
        }
    }
    
    /**
     * Unsets the "spokes" attribute
     */
    public void unsetSpokes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPOKES$0);
        }
    }
}
