/*
 * XML Type:  CT_PivotSelection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotSelection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotSelectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection
{
    
    public CTPivotSelectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTAREA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotArea");
    private static final javax.xml.namespace.QName PANE$2 = 
        new javax.xml.namespace.QName("", "pane");
    private static final javax.xml.namespace.QName SHOWHEADER$4 = 
        new javax.xml.namespace.QName("", "showHeader");
    private static final javax.xml.namespace.QName LABEL$6 = 
        new javax.xml.namespace.QName("", "label");
    private static final javax.xml.namespace.QName DATA$8 = 
        new javax.xml.namespace.QName("", "data");
    private static final javax.xml.namespace.QName EXTENDABLE$10 = 
        new javax.xml.namespace.QName("", "extendable");
    private static final javax.xml.namespace.QName COUNT$12 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName AXIS$14 = 
        new javax.xml.namespace.QName("", "axis");
    private static final javax.xml.namespace.QName DIMENSION$16 = 
        new javax.xml.namespace.QName("", "dimension");
    private static final javax.xml.namespace.QName START$18 = 
        new javax.xml.namespace.QName("", "start");
    private static final javax.xml.namespace.QName MIN$20 = 
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MAX$22 = 
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName ACTIVEROW$24 = 
        new javax.xml.namespace.QName("", "activeRow");
    private static final javax.xml.namespace.QName ACTIVECOL$26 = 
        new javax.xml.namespace.QName("", "activeCol");
    private static final javax.xml.namespace.QName PREVIOUSROW$28 = 
        new javax.xml.namespace.QName("", "previousRow");
    private static final javax.xml.namespace.QName PREVIOUSCOL$30 = 
        new javax.xml.namespace.QName("", "previousCol");
    private static final javax.xml.namespace.QName CLICK$32 = 
        new javax.xml.namespace.QName("", "click");
    private static final javax.xml.namespace.QName ID$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    
    
    /**
     * Gets the "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotArea" element
     */
    public void setPivotArea(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            }
            target.set(pivotArea);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            return target;
        }
    }
    
    /**
     * Gets the "pane" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum getPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PANE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pane" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane xgetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(PANE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_default_attribute_value(PANE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "pane" attribute
     */
    public boolean isSetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PANE$2) != null;
        }
    }
    
    /**
     * Sets the "pane" attribute
     */
    public void setPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum pane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PANE$2);
            }
            target.setEnumValue(pane);
        }
    }
    
    /**
     * Sets (as xml) the "pane" attribute
     */
    public void xsetPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane pane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(PANE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().add_attribute_user(PANE$2);
            }
            target.set(pane);
        }
    }
    
    /**
     * Unsets the "pane" attribute
     */
    public void unsetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PANE$2);
        }
    }
    
    /**
     * Gets the "showHeader" attribute
     */
    public boolean getShowHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHEADER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWHEADER$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHeader" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHEADER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWHEADER$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "showHeader" attribute
     */
    public boolean isSetShowHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWHEADER$4) != null;
        }
    }
    
    /**
     * Sets the "showHeader" attribute
     */
    public void setShowHeader(boolean showHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHEADER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWHEADER$4);
            }
            target.setBooleanValue(showHeader);
        }
    }
    
    /**
     * Sets (as xml) the "showHeader" attribute
     */
    public void xsetShowHeader(org.apache.xmlbeans.XmlBoolean showHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHEADER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWHEADER$4);
            }
            target.set(showHeader);
        }
    }
    
    /**
     * Unsets the "showHeader" attribute
     */
    public void unsetShowHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWHEADER$4);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public boolean getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LABEL$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LABEL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$6) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(boolean label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$6);
            }
            target.setBooleanValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlBoolean label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LABEL$6);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$6);
        }
    }
    
    /**
     * Gets the "data" attribute
     */
    public boolean getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATA$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATA$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "data" attribute
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATA$8) != null;
        }
    }
    
    /**
     * Sets the "data" attribute
     */
    public void setData(boolean data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATA$8);
            }
            target.setBooleanValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" attribute
     */
    public void xsetData(org.apache.xmlbeans.XmlBoolean data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATA$8);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "data" attribute
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATA$8);
        }
    }
    
    /**
     * Gets the "extendable" attribute
     */
    public boolean getExtendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTENDABLE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "extendable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExtendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTENDABLE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "extendable" attribute
     */
    public boolean isSetExtendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTENDABLE$10) != null;
        }
    }
    
    /**
     * Sets the "extendable" attribute
     */
    public void setExtendable(boolean extendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDABLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDABLE$10);
            }
            target.setBooleanValue(extendable);
        }
    }
    
    /**
     * Sets (as xml) the "extendable" attribute
     */
    public void xsetExtendable(org.apache.xmlbeans.XmlBoolean extendable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTENDABLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTENDABLE$10);
            }
            target.set(extendable);
        }
    }
    
    /**
     * Unsets the "extendable" attribute
     */
    public void unsetExtendable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTENDABLE$10);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$12);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$12) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$12);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$12);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$12);
        }
    }
    
    /**
     * Gets the "axis" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum getAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis xgetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$14);
            return target;
        }
    }
    
    /**
     * True if has "axis" attribute
     */
    public boolean isSetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXIS$14) != null;
        }
    }
    
    /**
     * Sets the "axis" attribute
     */
    public void setAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXIS$14);
            }
            target.setEnumValue(axis);
        }
    }
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    public void xsetAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().add_attribute_user(AXIS$14);
            }
            target.set(axis);
        }
    }
    
    /**
     * Unsets the "axis" attribute
     */
    public void unsetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXIS$14);
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public long getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIMENSION$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DIMENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(DIMENSION$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "dimension" attribute
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSION$16) != null;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    public void setDimension(long dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$16);
            }
            target.setLongValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlUnsignedInt dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DIMENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DIMENSION$16);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Unsets the "dimension" attribute
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSION$16);
        }
    }
    
    /**
     * Gets the "start" attribute
     */
    public long getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(START$18);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(START$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(START$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "start" attribute
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(START$18) != null;
        }
    }
    
    /**
     * Sets the "start" attribute
     */
    public void setStart(long start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$18);
            }
            target.setLongValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" attribute
     */
    public void xsetStart(org.apache.xmlbeans.XmlUnsignedInt start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(START$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(START$18);
            }
            target.set(start);
        }
    }
    
    /**
     * Unsets the "start" attribute
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(START$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MIN$20);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MIN$20);
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
            return get_store().find_attribute_user(MIN$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$20);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MIN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MIN$20);
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
            get_store().remove_attribute(MIN$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAX$22);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(MAX$22);
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
            return get_store().find_attribute_user(MAX$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$22);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAX$22);
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
            get_store().remove_attribute(MAX$22);
        }
    }
    
    /**
     * Gets the "activeRow" attribute
     */
    public long getActiveRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTIVEROW$24);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVEROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ACTIVEROW$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "activeRow" attribute
     */
    public boolean isSetActiveRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVEROW$24) != null;
        }
    }
    
    /**
     * Sets the "activeRow" attribute
     */
    public void setActiveRow(long activeRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVEROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVEROW$24);
            }
            target.setLongValue(activeRow);
        }
    }
    
    /**
     * Sets (as xml) the "activeRow" attribute
     */
    public void xsetActiveRow(org.apache.xmlbeans.XmlUnsignedInt activeRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVEROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ACTIVEROW$24);
            }
            target.set(activeRow);
        }
    }
    
    /**
     * Unsets the "activeRow" attribute
     */
    public void unsetActiveRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVEROW$24);
        }
    }
    
    /**
     * Gets the "activeCol" attribute
     */
    public long getActiveCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTIVECOL$26);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeCol" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVECOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ACTIVECOL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "activeCol" attribute
     */
    public boolean isSetActiveCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVECOL$26) != null;
        }
    }
    
    /**
     * Sets the "activeCol" attribute
     */
    public void setActiveCol(long activeCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVECOL$26);
            }
            target.setLongValue(activeCol);
        }
    }
    
    /**
     * Sets (as xml) the "activeCol" attribute
     */
    public void xsetActiveCol(org.apache.xmlbeans.XmlUnsignedInt activeCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVECOL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ACTIVECOL$26);
            }
            target.set(activeCol);
        }
    }
    
    /**
     * Unsets the "activeCol" attribute
     */
    public void unsetActiveCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVECOL$26);
        }
    }
    
    /**
     * Gets the "previousRow" attribute
     */
    public long getPreviousRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIOUSROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREVIOUSROW$28);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "previousRow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPreviousRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PREVIOUSROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(PREVIOUSROW$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "previousRow" attribute
     */
    public boolean isSetPreviousRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREVIOUSROW$28) != null;
        }
    }
    
    /**
     * Sets the "previousRow" attribute
     */
    public void setPreviousRow(long previousRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIOUSROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREVIOUSROW$28);
            }
            target.setLongValue(previousRow);
        }
    }
    
    /**
     * Sets (as xml) the "previousRow" attribute
     */
    public void xsetPreviousRow(org.apache.xmlbeans.XmlUnsignedInt previousRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PREVIOUSROW$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PREVIOUSROW$28);
            }
            target.set(previousRow);
        }
    }
    
    /**
     * Unsets the "previousRow" attribute
     */
    public void unsetPreviousRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREVIOUSROW$28);
        }
    }
    
    /**
     * Gets the "previousCol" attribute
     */
    public long getPreviousCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIOUSCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREVIOUSCOL$30);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "previousCol" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPreviousCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PREVIOUSCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(PREVIOUSCOL$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "previousCol" attribute
     */
    public boolean isSetPreviousCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREVIOUSCOL$30) != null;
        }
    }
    
    /**
     * Sets the "previousCol" attribute
     */
    public void setPreviousCol(long previousCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVIOUSCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREVIOUSCOL$30);
            }
            target.setLongValue(previousCol);
        }
    }
    
    /**
     * Sets (as xml) the "previousCol" attribute
     */
    public void xsetPreviousCol(org.apache.xmlbeans.XmlUnsignedInt previousCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PREVIOUSCOL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PREVIOUSCOL$30);
            }
            target.set(previousCol);
        }
    }
    
    /**
     * Unsets the "previousCol" attribute
     */
    public void unsetPreviousCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREVIOUSCOL$30);
        }
    }
    
    /**
     * Gets the "click" attribute
     */
    public long getClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLICK$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLICK$32);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "click" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CLICK$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(CLICK$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "click" attribute
     */
    public boolean isSetClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLICK$32) != null;
        }
    }
    
    /**
     * Sets the "click" attribute
     */
    public void setClick(long click)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLICK$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLICK$32);
            }
            target.setLongValue(click);
        }
    }
    
    /**
     * Sets (as xml) the "click" attribute
     */
    public void xsetClick(org.apache.xmlbeans.XmlUnsignedInt click)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CLICK$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CLICK$32);
            }
            target.set(click);
        }
    }
    
    /**
     * Unsets the "click" attribute
     */
    public void unsetClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLICK$32);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$34);
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
            return get_store().find_attribute_user(ID$34) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$34);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$34);
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
            get_store().remove_attribute(ID$34);
        }
    }
}
