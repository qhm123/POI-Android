/*
 * XML Type:  CT_PrintOptions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PrintOptions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPrintOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions
{
    
    public CTPrintOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTALCENTERED$0 = 
        new javax.xml.namespace.QName("", "horizontalCentered");
    private static final javax.xml.namespace.QName VERTICALCENTERED$2 = 
        new javax.xml.namespace.QName("", "verticalCentered");
    private static final javax.xml.namespace.QName HEADINGS$4 = 
        new javax.xml.namespace.QName("", "headings");
    private static final javax.xml.namespace.QName GRIDLINES$6 = 
        new javax.xml.namespace.QName("", "gridLines");
    private static final javax.xml.namespace.QName GRIDLINESSET$8 = 
        new javax.xml.namespace.QName("", "gridLinesSet");
    
    
    /**
     * Gets the "horizontalCentered" attribute
     */
    public boolean getHorizontalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCENTERED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORIZONTALCENTERED$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "horizontalCentered" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHorizontalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HORIZONTALCENTERED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HORIZONTALCENTERED$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalCentered" attribute
     */
    public boolean isSetHorizontalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORIZONTALCENTERED$0) != null;
        }
    }
    
    /**
     * Sets the "horizontalCentered" attribute
     */
    public void setHorizontalCentered(boolean horizontalCentered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORIZONTALCENTERED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORIZONTALCENTERED$0);
            }
            target.setBooleanValue(horizontalCentered);
        }
    }
    
    /**
     * Sets (as xml) the "horizontalCentered" attribute
     */
    public void xsetHorizontalCentered(org.apache.xmlbeans.XmlBoolean horizontalCentered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HORIZONTALCENTERED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HORIZONTALCENTERED$0);
            }
            target.set(horizontalCentered);
        }
    }
    
    /**
     * Unsets the "horizontalCentered" attribute
     */
    public void unsetHorizontalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORIZONTALCENTERED$0);
        }
    }
    
    /**
     * Gets the "verticalCentered" attribute
     */
    public boolean getVerticalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCENTERED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTICALCENTERED$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticalCentered" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVerticalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VERTICALCENTERED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VERTICALCENTERED$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalCentered" attribute
     */
    public boolean isSetVerticalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICALCENTERED$2) != null;
        }
    }
    
    /**
     * Sets the "verticalCentered" attribute
     */
    public void setVerticalCentered(boolean verticalCentered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICALCENTERED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICALCENTERED$2);
            }
            target.setBooleanValue(verticalCentered);
        }
    }
    
    /**
     * Sets (as xml) the "verticalCentered" attribute
     */
    public void xsetVerticalCentered(org.apache.xmlbeans.XmlBoolean verticalCentered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VERTICALCENTERED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VERTICALCENTERED$2);
            }
            target.set(verticalCentered);
        }
    }
    
    /**
     * Unsets the "verticalCentered" attribute
     */
    public void unsetVerticalCentered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICALCENTERED$2);
        }
    }
    
    /**
     * Gets the "headings" attribute
     */
    public boolean getHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADINGS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HEADINGS$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "headings" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADINGS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HEADINGS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "headings" attribute
     */
    public boolean isSetHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADINGS$4) != null;
        }
    }
    
    /**
     * Sets the "headings" attribute
     */
    public void setHeadings(boolean headings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADINGS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADINGS$4);
            }
            target.setBooleanValue(headings);
        }
    }
    
    /**
     * Sets (as xml) the "headings" attribute
     */
    public void xsetHeadings(org.apache.xmlbeans.XmlBoolean headings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADINGS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HEADINGS$4);
            }
            target.set(headings);
        }
    }
    
    /**
     * Unsets the "headings" attribute
     */
    public void unsetHeadings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADINGS$4);
        }
    }
    
    /**
     * Gets the "gridLines" attribute
     */
    public boolean getGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDLINES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRIDLINES$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "gridLines" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDLINES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GRIDLINES$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "gridLines" attribute
     */
    public boolean isSetGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRIDLINES$6) != null;
        }
    }
    
    /**
     * Sets the "gridLines" attribute
     */
    public void setGridLines(boolean gridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDLINES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRIDLINES$6);
            }
            target.setBooleanValue(gridLines);
        }
    }
    
    /**
     * Sets (as xml) the "gridLines" attribute
     */
    public void xsetGridLines(org.apache.xmlbeans.XmlBoolean gridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDLINES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GRIDLINES$6);
            }
            target.set(gridLines);
        }
    }
    
    /**
     * Unsets the "gridLines" attribute
     */
    public void unsetGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRIDLINES$6);
        }
    }
    
    /**
     * Gets the "gridLinesSet" attribute
     */
    public boolean getGridLinesSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDLINESSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRIDLINESSET$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "gridLinesSet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGridLinesSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDLINESSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GRIDLINESSET$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "gridLinesSet" attribute
     */
    public boolean isSetGridLinesSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRIDLINESSET$8) != null;
        }
    }
    
    /**
     * Sets the "gridLinesSet" attribute
     */
    public void setGridLinesSet(boolean gridLinesSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDLINESSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRIDLINESSET$8);
            }
            target.setBooleanValue(gridLinesSet);
        }
    }
    
    /**
     * Sets (as xml) the "gridLinesSet" attribute
     */
    public void xsetGridLinesSet(org.apache.xmlbeans.XmlBoolean gridLinesSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDLINESSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GRIDLINESSET$8);
            }
            target.set(gridLinesSet);
        }
    }
    
    /**
     * Unsets the "gridLinesSet" attribute
     */
    public void unsetGridLinesSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRIDLINESSET$8);
        }
    }
}
