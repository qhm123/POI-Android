/*
 * XML Type:  CT_Top10
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Top10(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTop10Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTop10
{
    
    public CTTop10Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOP$0 = 
        new javax.xml.namespace.QName("", "top");
    private static final javax.xml.namespace.QName PERCENT$2 = 
        new javax.xml.namespace.QName("", "percent");
    private static final javax.xml.namespace.QName VAL$4 = 
        new javax.xml.namespace.QName("", "val");
    private static final javax.xml.namespace.QName FILTERVAL$6 = 
        new javax.xml.namespace.QName("", "filterVal");
    
    
    /**
     * Gets the "top" attribute
     */
    public boolean getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOP$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "top" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TOP$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "top" attribute
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOP$0) != null;
        }
    }
    
    /**
     * Sets the "top" attribute
     */
    public void setTop(boolean top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOP$0);
            }
            target.setBooleanValue(top);
        }
    }
    
    /**
     * Sets (as xml) the "top" attribute
     */
    public void xsetTop(org.apache.xmlbeans.XmlBoolean top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TOP$0);
            }
            target.set(top);
        }
    }
    
    /**
     * Unsets the "top" attribute
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOP$0);
        }
    }
    
    /**
     * Gets the "percent" attribute
     */
    public boolean getPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERCENT$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "percent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PERCENT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "percent" attribute
     */
    public boolean isSetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERCENT$2) != null;
        }
    }
    
    /**
     * Sets the "percent" attribute
     */
    public void setPercent(boolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERCENT$2);
            }
            target.setBooleanValue(percent);
        }
    }
    
    /**
     * Sets (as xml) the "percent" attribute
     */
    public void xsetPercent(org.apache.xmlbeans.XmlBoolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PERCENT$2);
            }
            target.set(percent);
        }
    }
    
    /**
     * Unsets the "percent" attribute
     */
    public void unsetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERCENT$2);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public double getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$4);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(double val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$4);
            }
            target.setDoubleValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.apache.xmlbeans.XmlDouble val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VAL$4);
            }
            target.set(val);
        }
    }
    
    /**
     * Gets the "filterVal" attribute
     */
    public double getFilterVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERVAL$6);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "filterVal" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetFilterVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FILTERVAL$6);
            return target;
        }
    }
    
    /**
     * True if has "filterVal" attribute
     */
    public boolean isSetFilterVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTERVAL$6) != null;
        }
    }
    
    /**
     * Sets the "filterVal" attribute
     */
    public void setFilterVal(double filterVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERVAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERVAL$6);
            }
            target.setDoubleValue(filterVal);
        }
    }
    
    /**
     * Sets (as xml) the "filterVal" attribute
     */
    public void xsetFilterVal(org.apache.xmlbeans.XmlDouble filterVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FILTERVAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FILTERVAL$6);
            }
            target.set(filterVal);
        }
    }
    
    /**
     * Unsets the "filterVal" attribute
     */
    public void unsetFilterVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTERVAL$6);
        }
    }
}
