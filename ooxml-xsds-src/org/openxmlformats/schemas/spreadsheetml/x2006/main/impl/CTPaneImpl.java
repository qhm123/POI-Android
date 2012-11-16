/*
 * XML Type:  CT_Pane
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Pane(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPaneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane
{
    
    public CTPaneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XSPLIT$0 = 
        new javax.xml.namespace.QName("", "xSplit");
    private static final javax.xml.namespace.QName YSPLIT$2 = 
        new javax.xml.namespace.QName("", "ySplit");
    private static final javax.xml.namespace.QName TOPLEFTCELL$4 = 
        new javax.xml.namespace.QName("", "topLeftCell");
    private static final javax.xml.namespace.QName ACTIVEPANE$6 = 
        new javax.xml.namespace.QName("", "activePane");
    private static final javax.xml.namespace.QName STATE$8 = 
        new javax.xml.namespace.QName("", "state");
    
    
    /**
     * Gets the "xSplit" attribute
     */
    public double getXSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XSPLIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XSPLIT$0);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "xSplit" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetXSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(XSPLIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(XSPLIT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "xSplit" attribute
     */
    public boolean isSetXSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XSPLIT$0) != null;
        }
    }
    
    /**
     * Sets the "xSplit" attribute
     */
    public void setXSplit(double xSplit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XSPLIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XSPLIT$0);
            }
            target.setDoubleValue(xSplit);
        }
    }
    
    /**
     * Sets (as xml) the "xSplit" attribute
     */
    public void xsetXSplit(org.apache.xmlbeans.XmlDouble xSplit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(XSPLIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(XSPLIT$0);
            }
            target.set(xSplit);
        }
    }
    
    /**
     * Unsets the "xSplit" attribute
     */
    public void unsetXSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XSPLIT$0);
        }
    }
    
    /**
     * Gets the "ySplit" attribute
     */
    public double getYSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YSPLIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(YSPLIT$2);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "ySplit" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetYSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(YSPLIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(YSPLIT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "ySplit" attribute
     */
    public boolean isSetYSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YSPLIT$2) != null;
        }
    }
    
    /**
     * Sets the "ySplit" attribute
     */
    public void setYSplit(double ySplit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YSPLIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YSPLIT$2);
            }
            target.setDoubleValue(ySplit);
        }
    }
    
    /**
     * Sets (as xml) the "ySplit" attribute
     */
    public void xsetYSplit(org.apache.xmlbeans.XmlDouble ySplit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(YSPLIT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(YSPLIT$2);
            }
            target.set(ySplit);
        }
    }
    
    /**
     * Unsets the "ySplit" attribute
     */
    public void unsetYSplit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YSPLIT$2);
        }
    }
    
    /**
     * Gets the "topLeftCell" attribute
     */
    public java.lang.String getTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topLeftCell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$4);
            return target;
        }
    }
    
    /**
     * True if has "topLeftCell" attribute
     */
    public boolean isSetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPLEFTCELL$4) != null;
        }
    }
    
    /**
     * Sets the "topLeftCell" attribute
     */
    public void setTopLeftCell(java.lang.String topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPLEFTCELL$4);
            }
            target.setStringValue(topLeftCell);
        }
    }
    
    /**
     * Sets (as xml) the "topLeftCell" attribute
     */
    public void xsetTopLeftCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(TOPLEFTCELL$4);
            }
            target.set(topLeftCell);
        }
    }
    
    /**
     * Unsets the "topLeftCell" attribute
     */
    public void unsetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPLEFTCELL$4);
        }
    }
    
    /**
     * Gets the "activePane" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum getActivePane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEPANE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTIVEPANE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "activePane" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane xgetActivePane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(ACTIVEPANE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_default_attribute_value(ACTIVEPANE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "activePane" attribute
     */
    public boolean isSetActivePane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVEPANE$6) != null;
        }
    }
    
    /**
     * Sets the "activePane" attribute
     */
    public void setActivePane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum activePane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEPANE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVEPANE$6);
            }
            target.setEnumValue(activePane);
        }
    }
    
    /**
     * Sets (as xml) the "activePane" attribute
     */
    public void xsetActivePane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane activePane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(ACTIVEPANE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().add_attribute_user(ACTIVEPANE$6);
            }
            target.set(activePane);
        }
    }
    
    /**
     * Unsets the "activePane" attribute
     */
    public void unsetActivePane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVEPANE$6);
        }
    }
    
    /**
     * Gets the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState)get_store().find_attribute_user(STATE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState)get_default_attribute_value(STATE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "state" attribute
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATE$8) != null;
        }
    }
    
    /**
     * Sets the "state" attribute
     */
    public void setState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$8);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" attribute
     */
    public void xsetState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState)get_store().find_attribute_user(STATE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState)get_store().add_attribute_user(STATE$8);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "state" attribute
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATE$8);
        }
    }
}
