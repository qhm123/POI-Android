/*
 * XML Type:  CT_RangePr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RangePr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRangePrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRangePr
{
    
    public CTRangePrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOSTART$0 = 
        new javax.xml.namespace.QName("", "autoStart");
    private static final javax.xml.namespace.QName AUTOEND$2 = 
        new javax.xml.namespace.QName("", "autoEnd");
    private static final javax.xml.namespace.QName GROUPBY$4 = 
        new javax.xml.namespace.QName("", "groupBy");
    private static final javax.xml.namespace.QName STARTNUM$6 = 
        new javax.xml.namespace.QName("", "startNum");
    private static final javax.xml.namespace.QName ENDNUM$8 = 
        new javax.xml.namespace.QName("", "endNum");
    private static final javax.xml.namespace.QName STARTDATE$10 = 
        new javax.xml.namespace.QName("", "startDate");
    private static final javax.xml.namespace.QName ENDDATE$12 = 
        new javax.xml.namespace.QName("", "endDate");
    private static final javax.xml.namespace.QName GROUPINTERVAL$14 = 
        new javax.xml.namespace.QName("", "groupInterval");
    
    
    /**
     * Gets the "autoStart" attribute
     */
    public boolean getAutoStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOSTART$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoStart" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOSTART$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoStart" attribute
     */
    public boolean isSetAutoStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOSTART$0) != null;
        }
    }
    
    /**
     * Sets the "autoStart" attribute
     */
    public void setAutoStart(boolean autoStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOSTART$0);
            }
            target.setBooleanValue(autoStart);
        }
    }
    
    /**
     * Sets (as xml) the "autoStart" attribute
     */
    public void xsetAutoStart(org.apache.xmlbeans.XmlBoolean autoStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSTART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOSTART$0);
            }
            target.set(autoStart);
        }
    }
    
    /**
     * Unsets the "autoStart" attribute
     */
    public void unsetAutoStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOSTART$0);
        }
    }
    
    /**
     * Gets the "autoEnd" attribute
     */
    public boolean getAutoEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOEND$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoEnd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOEND$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoEnd" attribute
     */
    public boolean isSetAutoEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOEND$2) != null;
        }
    }
    
    /**
     * Sets the "autoEnd" attribute
     */
    public void setAutoEnd(boolean autoEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOEND$2);
            }
            target.setBooleanValue(autoEnd);
        }
    }
    
    /**
     * Sets (as xml) the "autoEnd" attribute
     */
    public void xsetAutoEnd(org.apache.xmlbeans.XmlBoolean autoEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOEND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOEND$2);
            }
            target.set(autoEnd);
        }
    }
    
    /**
     * Unsets the "autoEnd" attribute
     */
    public void unsetAutoEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOEND$2);
        }
    }
    
    /**
     * Gets the "groupBy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy.Enum getGroupBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPBY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROUPBY$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupBy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy xgetGroupBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy)get_store().find_attribute_user(GROUPBY$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy)get_default_attribute_value(GROUPBY$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "groupBy" attribute
     */
    public boolean isSetGroupBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUPBY$4) != null;
        }
    }
    
    /**
     * Sets the "groupBy" attribute
     */
    public void setGroupBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy.Enum groupBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPBY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPBY$4);
            }
            target.setEnumValue(groupBy);
        }
    }
    
    /**
     * Sets (as xml) the "groupBy" attribute
     */
    public void xsetGroupBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy groupBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy)get_store().find_attribute_user(GROUPBY$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGroupBy)get_store().add_attribute_user(GROUPBY$4);
            }
            target.set(groupBy);
        }
    }
    
    /**
     * Unsets the "groupBy" attribute
     */
    public void unsetGroupBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUPBY$4);
        }
    }
    
    /**
     * Gets the "startNum" attribute
     */
    public double getStartNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTNUM$6);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "startNum" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetStartNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTNUM$6);
            return target;
        }
    }
    
    /**
     * True if has "startNum" attribute
     */
    public boolean isSetStartNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTNUM$6) != null;
        }
    }
    
    /**
     * Sets the "startNum" attribute
     */
    public void setStartNum(double startNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTNUM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTNUM$6);
            }
            target.setDoubleValue(startNum);
        }
    }
    
    /**
     * Sets (as xml) the "startNum" attribute
     */
    public void xsetStartNum(org.apache.xmlbeans.XmlDouble startNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTNUM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STARTNUM$6);
            }
            target.set(startNum);
        }
    }
    
    /**
     * Unsets the "startNum" attribute
     */
    public void unsetStartNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTNUM$6);
        }
    }
    
    /**
     * Gets the "endNum" attribute
     */
    public double getEndNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDNUM$8);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "endNum" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetEndNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDNUM$8);
            return target;
        }
    }
    
    /**
     * True if has "endNum" attribute
     */
    public boolean isSetEndNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDNUM$8) != null;
        }
    }
    
    /**
     * Sets the "endNum" attribute
     */
    public void setEndNum(double endNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDNUM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDNUM$8);
            }
            target.setDoubleValue(endNum);
        }
    }
    
    /**
     * Sets (as xml) the "endNum" attribute
     */
    public void xsetEndNum(org.apache.xmlbeans.XmlDouble endNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDNUM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ENDNUM$8);
            }
            target.set(endNum);
        }
    }
    
    /**
     * Unsets the "endNum" attribute
     */
    public void unsetEndNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDNUM$8);
        }
    }
    
    /**
     * Gets the "startDate" attribute
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$10);
            return target;
        }
    }
    
    /**
     * True if has "startDate" attribute
     */
    public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTDATE$10) != null;
        }
    }
    
    /**
     * Sets the "startDate" attribute
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$10);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "startDate" attribute
     */
    public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTDATE$10);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "startDate" attribute
     */
    public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTDATE$10);
        }
    }
    
    /**
     * Gets the "endDate" attribute
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$12);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$12);
            return target;
        }
    }
    
    /**
     * True if has "endDate" attribute
     */
    public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDDATE$12) != null;
        }
    }
    
    /**
     * Sets the "endDate" attribute
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$12);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" attribute
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDDATE$12);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "endDate" attribute
     */
    public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDDATE$12);
        }
    }
    
    /**
     * Gets the "groupInterval" attribute
     */
    public double getGroupInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROUPINTERVAL$14);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupInterval" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetGroupInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GROUPINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(GROUPINTERVAL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "groupInterval" attribute
     */
    public boolean isSetGroupInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUPINTERVAL$14) != null;
        }
    }
    
    /**
     * Sets the "groupInterval" attribute
     */
    public void setGroupInterval(double groupInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPINTERVAL$14);
            }
            target.setDoubleValue(groupInterval);
        }
    }
    
    /**
     * Sets (as xml) the "groupInterval" attribute
     */
    public void xsetGroupInterval(org.apache.xmlbeans.XmlDouble groupInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(GROUPINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(GROUPINTERVAL$14);
            }
            target.set(groupInterval);
        }
    }
    
    /**
     * Unsets the "groupInterval" attribute
     */
    public void unsetGroupInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUPINTERVAL$14);
        }
    }
}
