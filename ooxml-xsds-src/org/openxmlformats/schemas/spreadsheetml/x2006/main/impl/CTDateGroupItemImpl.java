/*
 * XML Type:  CT_DateGroupItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DateGroupItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDateGroupItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateGroupItem
{
    
    public CTDateGroupItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName YEAR$0 = 
        new javax.xml.namespace.QName("", "year");
    private static final javax.xml.namespace.QName MONTH$2 = 
        new javax.xml.namespace.QName("", "month");
    private static final javax.xml.namespace.QName DAY$4 = 
        new javax.xml.namespace.QName("", "day");
    private static final javax.xml.namespace.QName HOUR$6 = 
        new javax.xml.namespace.QName("", "hour");
    private static final javax.xml.namespace.QName MINUTE$8 = 
        new javax.xml.namespace.QName("", "minute");
    private static final javax.xml.namespace.QName SECOND$10 = 
        new javax.xml.namespace.QName("", "second");
    private static final javax.xml.namespace.QName DATETIMEGROUPING$12 = 
        new javax.xml.namespace.QName("", "dateTimeGrouping");
    
    
    /**
     * Gets the "year" attribute
     */
    public int getYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "year" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(YEAR$0);
            return target;
        }
    }
    
    /**
     * Sets the "year" attribute
     */
    public void setYear(int year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$0);
            }
            target.setIntValue(year);
        }
    }
    
    /**
     * Sets (as xml) the "year" attribute
     */
    public void xsetYear(org.apache.xmlbeans.XmlUnsignedShort year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(YEAR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(YEAR$0);
            }
            target.set(year);
        }
    }
    
    /**
     * Gets the "month" attribute
     */
    public int getMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONTH$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "month" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MONTH$2);
            return target;
        }
    }
    
    /**
     * True if has "month" attribute
     */
    public boolean isSetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MONTH$2) != null;
        }
    }
    
    /**
     * Sets the "month" attribute
     */
    public void setMonth(int month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MONTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MONTH$2);
            }
            target.setIntValue(month);
        }
    }
    
    /**
     * Sets (as xml) the "month" attribute
     */
    public void xsetMonth(org.apache.xmlbeans.XmlUnsignedShort month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MONTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(MONTH$2);
            }
            target.set(month);
        }
    }
    
    /**
     * Unsets the "month" attribute
     */
    public void unsetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MONTH$2);
        }
    }
    
    /**
     * Gets the "day" attribute
     */
    public int getDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DAY$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "day" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(DAY$4);
            return target;
        }
    }
    
    /**
     * True if has "day" attribute
     */
    public boolean isSetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DAY$4) != null;
        }
    }
    
    /**
     * Sets the "day" attribute
     */
    public void setDay(int day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DAY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DAY$4);
            }
            target.setIntValue(day);
        }
    }
    
    /**
     * Sets (as xml) the "day" attribute
     */
    public void xsetDay(org.apache.xmlbeans.XmlUnsignedShort day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(DAY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(DAY$4);
            }
            target.set(day);
        }
    }
    
    /**
     * Unsets the "day" attribute
     */
    public void unsetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DAY$4);
        }
    }
    
    /**
     * Gets the "hour" attribute
     */
    public int getHour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOUR$6);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hour" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetHour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(HOUR$6);
            return target;
        }
    }
    
    /**
     * True if has "hour" attribute
     */
    public boolean isSetHour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HOUR$6) != null;
        }
    }
    
    /**
     * Sets the "hour" attribute
     */
    public void setHour(int hour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOUR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOUR$6);
            }
            target.setIntValue(hour);
        }
    }
    
    /**
     * Sets (as xml) the "hour" attribute
     */
    public void xsetHour(org.apache.xmlbeans.XmlUnsignedShort hour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(HOUR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(HOUR$6);
            }
            target.set(hour);
        }
    }
    
    /**
     * Unsets the "hour" attribute
     */
    public void unsetHour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HOUR$6);
        }
    }
    
    /**
     * Gets the "minute" attribute
     */
    public int getMinute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTE$8);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minute" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetMinute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MINUTE$8);
            return target;
        }
    }
    
    /**
     * True if has "minute" attribute
     */
    public boolean isSetMinute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINUTE$8) != null;
        }
    }
    
    /**
     * Sets the "minute" attribute
     */
    public void setMinute(int minute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUTE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINUTE$8);
            }
            target.setIntValue(minute);
        }
    }
    
    /**
     * Sets (as xml) the "minute" attribute
     */
    public void xsetMinute(org.apache.xmlbeans.XmlUnsignedShort minute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MINUTE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(MINUTE$8);
            }
            target.set(minute);
        }
    }
    
    /**
     * Unsets the "minute" attribute
     */
    public void unsetMinute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINUTE$8);
        }
    }
    
    /**
     * Gets the "second" attribute
     */
    public int getSecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECOND$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "second" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetSecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(SECOND$10);
            return target;
        }
    }
    
    /**
     * True if has "second" attribute
     */
    public boolean isSetSecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SECOND$10) != null;
        }
    }
    
    /**
     * Sets the "second" attribute
     */
    public void setSecond(int second)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECOND$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECOND$10);
            }
            target.setIntValue(second);
        }
    }
    
    /**
     * Sets (as xml) the "second" attribute
     */
    public void xsetSecond(org.apache.xmlbeans.XmlUnsignedShort second)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(SECOND$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(SECOND$10);
            }
            target.set(second);
        }
    }
    
    /**
     * Unsets the "second" attribute
     */
    public void unsetSecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SECOND$10);
        }
    }
    
    /**
     * Gets the "dateTimeGrouping" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping.Enum getDateTimeGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIMEGROUPING$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateTimeGrouping" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping xgetDateTimeGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping)get_store().find_attribute_user(DATETIMEGROUPING$12);
            return target;
        }
    }
    
    /**
     * Sets the "dateTimeGrouping" attribute
     */
    public void setDateTimeGrouping(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping.Enum dateTimeGrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATETIMEGROUPING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATETIMEGROUPING$12);
            }
            target.setEnumValue(dateTimeGrouping);
        }
    }
    
    /**
     * Sets (as xml) the "dateTimeGrouping" attribute
     */
    public void xsetDateTimeGrouping(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping dateTimeGrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping)get_store().find_attribute_user(DATETIMEGROUPING$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDateTimeGrouping)get_store().add_attribute_user(DATETIMEGROUPING$12);
            }
            target.set(dateTimeGrouping);
        }
    }
}
