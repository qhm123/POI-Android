/*
 * XML Type:  CT_Break
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Break(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBreakImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak
{
    
    public CTBreakImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName MIN$2 = 
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MAX$4 = 
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName MAN$6 = 
        new javax.xml.namespace.QName("", "man");
    private static final javax.xml.namespace.QName PT$8 = 
        new javax.xml.namespace.QName("", "pt");
    
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ID$0);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ID$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "min" attribute
     */
    public long getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MIN$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "min" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MIN$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "min" attribute
     */
    public boolean isSetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIN$2) != null;
        }
    }
    
    /**
     * Sets the "min" attribute
     */
    public void setMin(long min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$2);
            }
            target.setLongValue(min);
        }
    }
    
    /**
     * Sets (as xml) the "min" attribute
     */
    public void xsetMin(org.apache.xmlbeans.XmlUnsignedInt min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MIN$2);
            }
            target.set(min);
        }
    }
    
    /**
     * Unsets the "min" attribute
     */
    public void unsetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIN$2);
        }
    }
    
    /**
     * Gets the "max" attribute
     */
    public long getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAX$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MAX$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "max" attribute
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAX$4) != null;
        }
    }
    
    /**
     * Sets the "max" attribute
     */
    public void setMax(long max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$4);
            }
            target.setLongValue(max);
        }
    }
    
    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlUnsignedInt max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAX$4);
            }
            target.set(max);
        }
    }
    
    /**
     * Unsets the "max" attribute
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAX$4);
        }
    }
    
    /**
     * Gets the "man" attribute
     */
    public boolean getMan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAN$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "man" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MAN$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "man" attribute
     */
    public boolean isSetMan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAN$6) != null;
        }
    }
    
    /**
     * Sets the "man" attribute
     */
    public void setMan(boolean man)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAN$6);
            }
            target.setBooleanValue(man);
        }
    }
    
    /**
     * Sets (as xml) the "man" attribute
     */
    public void xsetMan(org.apache.xmlbeans.XmlBoolean man)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MAN$6);
            }
            target.set(man);
        }
    }
    
    /**
     * Unsets the "man" attribute
     */
    public void unsetMan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAN$6);
        }
    }
    
    /**
     * Gets the "pt" attribute
     */
    public boolean getPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pt" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "pt" attribute
     */
    public boolean isSetPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PT$8) != null;
        }
    }
    
    /**
     * Sets the "pt" attribute
     */
    public void setPt(boolean pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PT$8);
            }
            target.setBooleanValue(pt);
        }
    }
    
    /**
     * Sets (as xml) the "pt" attribute
     */
    public void xsetPt(org.apache.xmlbeans.XmlBoolean pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PT$8);
            }
            target.set(pt);
        }
    }
    
    /**
     * Unsets the "pt" attribute
     */
    public void unsetPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PT$8);
        }
    }
}
