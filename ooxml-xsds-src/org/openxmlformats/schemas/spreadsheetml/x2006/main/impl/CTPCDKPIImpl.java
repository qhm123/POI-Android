/*
 * XML Type:  CT_PCDKPI
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PCDKPI(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPCDKPIImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI
{
    
    public CTPCDKPIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUENAME$0 = 
        new javax.xml.namespace.QName("", "uniqueName");
    private static final javax.xml.namespace.QName CAPTION$2 = 
        new javax.xml.namespace.QName("", "caption");
    private static final javax.xml.namespace.QName DISPLAYFOLDER$4 = 
        new javax.xml.namespace.QName("", "displayFolder");
    private static final javax.xml.namespace.QName MEASUREGROUP$6 = 
        new javax.xml.namespace.QName("", "measureGroup");
    private static final javax.xml.namespace.QName PARENT$8 = 
        new javax.xml.namespace.QName("", "parent");
    private static final javax.xml.namespace.QName VALUE$10 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName GOAL$12 = 
        new javax.xml.namespace.QName("", "goal");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName TREND$16 = 
        new javax.xml.namespace.QName("", "trend");
    private static final javax.xml.namespace.QName WEIGHT$18 = 
        new javax.xml.namespace.QName("", "weight");
    private static final javax.xml.namespace.QName TIME$20 = 
        new javax.xml.namespace.QName("", "time");
    
    
    /**
     * Gets the "uniqueName" attribute
     */
    public java.lang.String getUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "uniqueName" attribute
     */
    public void setUniqueName(java.lang.String uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUENAME$0);
            }
            target.setStringValue(uniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    public void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(UNIQUENAME$0);
            }
            target.set(uniqueName);
        }
    }
    
    /**
     * Gets the "caption" attribute
     */
    public java.lang.String getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$2);
            return target;
        }
    }
    
    /**
     * True if has "caption" attribute
     */
    public boolean isSetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAPTION$2) != null;
        }
    }
    
    /**
     * Sets the "caption" attribute
     */
    public void setCaption(java.lang.String caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTION$2);
            }
            target.setStringValue(caption);
        }
    }
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    public void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CAPTION$2);
            }
            target.set(caption);
        }
    }
    
    /**
     * Unsets the "caption" attribute
     */
    public void unsetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAPTION$2);
        }
    }
    
    /**
     * Gets the "displayFolder" attribute
     */
    public java.lang.String getDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFOLDER$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayFolder" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYFOLDER$4);
            return target;
        }
    }
    
    /**
     * True if has "displayFolder" attribute
     */
    public boolean isSetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYFOLDER$4) != null;
        }
    }
    
    /**
     * Sets the "displayFolder" attribute
     */
    public void setDisplayFolder(java.lang.String displayFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFOLDER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYFOLDER$4);
            }
            target.setStringValue(displayFolder);
        }
    }
    
    /**
     * Sets (as xml) the "displayFolder" attribute
     */
    public void xsetDisplayFolder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring displayFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYFOLDER$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DISPLAYFOLDER$4);
            }
            target.set(displayFolder);
        }
    }
    
    /**
     * Unsets the "displayFolder" attribute
     */
    public void unsetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYFOLDER$4);
        }
    }
    
    /**
     * Gets the "measureGroup" attribute
     */
    public java.lang.String getMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "measureGroup" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEASUREGROUP$6);
            return target;
        }
    }
    
    /**
     * True if has "measureGroup" attribute
     */
    public boolean isSetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUREGROUP$6) != null;
        }
    }
    
    /**
     * Sets the "measureGroup" attribute
     */
    public void setMeasureGroup(java.lang.String measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUREGROUP$6);
            }
            target.setStringValue(measureGroup);
        }
    }
    
    /**
     * Sets (as xml) the "measureGroup" attribute
     */
    public void xsetMeasureGroup(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEASUREGROUP$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MEASUREGROUP$6);
            }
            target.set(measureGroup);
        }
    }
    
    /**
     * Unsets the "measureGroup" attribute
     */
    public void unsetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUREGROUP$6);
        }
    }
    
    /**
     * Gets the "parent" attribute
     */
    public java.lang.String getParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parent" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PARENT$8);
            return target;
        }
    }
    
    /**
     * True if has "parent" attribute
     */
    public boolean isSetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARENT$8) != null;
        }
    }
    
    /**
     * Sets the "parent" attribute
     */
    public void setParent(java.lang.String parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$8);
            }
            target.setStringValue(parent);
        }
    }
    
    /**
     * Sets (as xml) the "parent" attribute
     */
    public void xsetParent(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PARENT$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PARENT$8);
            }
            target.set(parent);
        }
    }
    
    /**
     * Unsets the "parent" attribute
     */
    public void unsetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARENT$8);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VALUE$10);
            return target;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$10);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VALUE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(VALUE$10);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "goal" attribute
     */
    public java.lang.String getGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GOAL$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "goal" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(GOAL$12);
            return target;
        }
    }
    
    /**
     * True if has "goal" attribute
     */
    public boolean isSetGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GOAL$12) != null;
        }
    }
    
    /**
     * Sets the "goal" attribute
     */
    public void setGoal(java.lang.String goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GOAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GOAL$12);
            }
            target.setStringValue(goal);
        }
    }
    
    /**
     * Sets (as xml) the "goal" attribute
     */
    public void xsetGoal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(GOAL$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(GOAL$12);
            }
            target.set(goal);
        }
    }
    
    /**
     * Unsets the "goal" attribute
     */
    public void unsetGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GOAL$12);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUS$14);
            return target;
        }
    }
    
    /**
     * True if has "status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$14) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$14);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUS$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STATUS$14);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$14);
        }
    }
    
    /**
     * Gets the "trend" attribute
     */
    public java.lang.String getTrend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TREND$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "trend" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTrend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TREND$16);
            return target;
        }
    }
    
    /**
     * True if has "trend" attribute
     */
    public boolean isSetTrend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TREND$16) != null;
        }
    }
    
    /**
     * Sets the "trend" attribute
     */
    public void setTrend(java.lang.String trend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TREND$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TREND$16);
            }
            target.setStringValue(trend);
        }
    }
    
    /**
     * Sets (as xml) the "trend" attribute
     */
    public void xsetTrend(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring trend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TREND$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TREND$16);
            }
            target.set(trend);
        }
    }
    
    /**
     * Unsets the "trend" attribute
     */
    public void unsetTrend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TREND$16);
        }
    }
    
    /**
     * Gets the "weight" attribute
     */
    public java.lang.String getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(WEIGHT$18);
            return target;
        }
    }
    
    /**
     * True if has "weight" attribute
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WEIGHT$18) != null;
        }
    }
    
    /**
     * Sets the "weight" attribute
     */
    public void setWeight(java.lang.String weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$18);
            }
            target.setStringValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" attribute
     */
    public void xsetWeight(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(WEIGHT$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(WEIGHT$18);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "weight" attribute
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WEIGHT$18);
        }
    }
    
    /**
     * Gets the "time" attribute
     */
    public java.lang.String getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TIME$20);
            return target;
        }
    }
    
    /**
     * True if has "time" attribute
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIME$20) != null;
        }
    }
    
    /**
     * Sets the "time" attribute
     */
    public void setTime(java.lang.String time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$20);
            }
            target.setStringValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" attribute
     */
    public void xsetTime(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TIME$20);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "time" attribute
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIME$20);
        }
    }
}
