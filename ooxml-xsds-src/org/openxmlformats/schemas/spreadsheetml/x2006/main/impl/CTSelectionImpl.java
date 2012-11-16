/*
 * XML Type:  CT_Selection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Selection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSelectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection
{
    
    public CTSelectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PANE$0 = 
        new javax.xml.namespace.QName("", "pane");
    private static final javax.xml.namespace.QName ACTIVECELL$2 = 
        new javax.xml.namespace.QName("", "activeCell");
    private static final javax.xml.namespace.QName ACTIVECELLID$4 = 
        new javax.xml.namespace.QName("", "activeCellId");
    private static final javax.xml.namespace.QName SQREF$6 = 
        new javax.xml.namespace.QName("", "sqref");
    
    
    /**
     * Gets the "pane" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum getPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PANE$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(PANE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_default_attribute_value(PANE$0);
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
            return get_store().find_attribute_user(PANE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PANE$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().find_attribute_user(PANE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane)get_store().add_attribute_user(PANE$0);
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
            get_store().remove_attribute(PANE$0);
        }
    }
    
    /**
     * Gets the "activeCell" attribute
     */
    public java.lang.String getActiveCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECELL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeCell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetActiveCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(ACTIVECELL$2);
            return target;
        }
    }
    
    /**
     * True if has "activeCell" attribute
     */
    public boolean isSetActiveCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVECELL$2) != null;
        }
    }
    
    /**
     * Sets the "activeCell" attribute
     */
    public void setActiveCell(java.lang.String activeCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECELL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVECELL$2);
            }
            target.setStringValue(activeCell);
        }
    }
    
    /**
     * Sets (as xml) the "activeCell" attribute
     */
    public void xsetActiveCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef activeCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(ACTIVECELL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(ACTIVECELL$2);
            }
            target.set(activeCell);
        }
    }
    
    /**
     * Unsets the "activeCell" attribute
     */
    public void unsetActiveCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVECELL$2);
        }
    }
    
    /**
     * Gets the "activeCellId" attribute
     */
    public long getActiveCellId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECELLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTIVECELLID$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeCellId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveCellId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVECELLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ACTIVECELLID$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "activeCellId" attribute
     */
    public boolean isSetActiveCellId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVECELLID$4) != null;
        }
    }
    
    /**
     * Sets the "activeCellId" attribute
     */
    public void setActiveCellId(long activeCellId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVECELLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVECELLID$4);
            }
            target.setLongValue(activeCellId);
        }
    }
    
    /**
     * Sets (as xml) the "activeCellId" attribute
     */
    public void xsetActiveCellId(org.apache.xmlbeans.XmlUnsignedInt activeCellId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVECELLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ACTIVECELLID$4);
            }
            target.set(activeCellId);
        }
    }
    
    /**
     * Unsets the "activeCellId" attribute
     */
    public void unsetActiveCellId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVECELLID$4);
        }
    }
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SQREF$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_default_attribute_value(SQREF$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "sqref" attribute
     */
    public boolean isSetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SQREF$6) != null;
        }
    }
    
    /**
     * Sets the "sqref" attribute
     */
    public void setSqref(java.util.List sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$6);
            }
            target.setListValue(sqref);
        }
    }
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    public void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$6);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Unsets the "sqref" attribute
     */
    public void unsetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SQREF$6);
        }
    }
}
