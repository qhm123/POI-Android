/*
 * XML Type:  CT_X
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_X(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTXImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX
{
    
    public CTXImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName V$0 = 
        new javax.xml.namespace.QName("", "v");
    
    
    /**
     * Gets the "v" attribute
     */
    public int getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(V$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(V$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(V$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "v" attribute
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(V$0) != null;
        }
    }
    
    /**
     * Sets the "v" attribute
     */
    public void setV(int v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(V$0);
            }
            target.setIntValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" attribute
     */
    public void xsetV(org.apache.xmlbeans.XmlInt v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(V$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(V$0);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" attribute
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(V$0);
        }
    }
}
