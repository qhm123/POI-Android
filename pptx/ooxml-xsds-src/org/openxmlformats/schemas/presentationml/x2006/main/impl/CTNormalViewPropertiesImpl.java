/*
 * XML Type:  CT_NormalViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_NormalViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTNormalViewPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties
{
    
    public CTNormalViewPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOREDLEFT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "restoredLeft");
    private static final javax.xml.namespace.QName RESTOREDTOP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "restoredTop");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHOWOUTLINEICONS$6 = 
        new javax.xml.namespace.QName("", "showOutlineIcons");
    private static final javax.xml.namespace.QName SNAPVERTSPLITTER$8 = 
        new javax.xml.namespace.QName("", "snapVertSplitter");
    private static final javax.xml.namespace.QName VERTBARSTATE$10 = 
        new javax.xml.namespace.QName("", "vertBarState");
    private static final javax.xml.namespace.QName HORZBARSTATE$12 = 
        new javax.xml.namespace.QName("", "horzBarState");
    private static final javax.xml.namespace.QName PREFERSINGLEVIEW$14 = 
        new javax.xml.namespace.QName("", "preferSingleView");
    
    
    /**
     * Gets the "restoredLeft" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion getRestoredLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().find_element_user(RESTOREDLEFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restoredLeft" element
     */
    public void setRestoredLeft(org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion restoredLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().find_element_user(RESTOREDLEFT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().add_element_user(RESTOREDLEFT$0);
            }
            target.set(restoredLeft);
        }
    }
    
    /**
     * Appends and returns a new empty "restoredLeft" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion addNewRestoredLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().add_element_user(RESTOREDLEFT$0);
            return target;
        }
    }
    
    /**
     * Gets the "restoredTop" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion getRestoredTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().find_element_user(RESTOREDTOP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restoredTop" element
     */
    public void setRestoredTop(org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion restoredTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().find_element_user(RESTOREDTOP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().add_element_user(RESTOREDTOP$2);
            }
            target.set(restoredTop);
        }
    }
    
    /**
     * Appends and returns a new empty "restoredTop" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion addNewRestoredTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewPortion)get_store().add_element_user(RESTOREDTOP$2);
            return target;
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "showOutlineIcons" attribute
     */
    public boolean getShowOutlineIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINEICONS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWOUTLINEICONS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showOutlineIcons" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowOutlineIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINEICONS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWOUTLINEICONS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "showOutlineIcons" attribute
     */
    public boolean isSetShowOutlineIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWOUTLINEICONS$6) != null;
        }
    }
    
    /**
     * Sets the "showOutlineIcons" attribute
     */
    public void setShowOutlineIcons(boolean showOutlineIcons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINEICONS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWOUTLINEICONS$6);
            }
            target.setBooleanValue(showOutlineIcons);
        }
    }
    
    /**
     * Sets (as xml) the "showOutlineIcons" attribute
     */
    public void xsetShowOutlineIcons(org.apache.xmlbeans.XmlBoolean showOutlineIcons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINEICONS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWOUTLINEICONS$6);
            }
            target.set(showOutlineIcons);
        }
    }
    
    /**
     * Unsets the "showOutlineIcons" attribute
     */
    public void unsetShowOutlineIcons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWOUTLINEICONS$6);
        }
    }
    
    /**
     * Gets the "snapVertSplitter" attribute
     */
    public boolean getSnapVertSplitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPVERTSPLITTER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SNAPVERTSPLITTER$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "snapVertSplitter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSnapVertSplitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPVERTSPLITTER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SNAPVERTSPLITTER$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "snapVertSplitter" attribute
     */
    public boolean isSetSnapVertSplitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SNAPVERTSPLITTER$8) != null;
        }
    }
    
    /**
     * Sets the "snapVertSplitter" attribute
     */
    public void setSnapVertSplitter(boolean snapVertSplitter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SNAPVERTSPLITTER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SNAPVERTSPLITTER$8);
            }
            target.setBooleanValue(snapVertSplitter);
        }
    }
    
    /**
     * Sets (as xml) the "snapVertSplitter" attribute
     */
    public void xsetSnapVertSplitter(org.apache.xmlbeans.XmlBoolean snapVertSplitter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SNAPVERTSPLITTER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SNAPVERTSPLITTER$8);
            }
            target.set(snapVertSplitter);
        }
    }
    
    /**
     * Unsets the "snapVertSplitter" attribute
     */
    public void unsetSnapVertSplitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SNAPVERTSPLITTER$8);
        }
    }
    
    /**
     * Gets the "vertBarState" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum getVertBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTBARSTATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERTBARSTATE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vertBarState" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState xgetVertBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().find_attribute_user(VERTBARSTATE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_default_attribute_value(VERTBARSTATE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "vertBarState" attribute
     */
    public boolean isSetVertBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTBARSTATE$10) != null;
        }
    }
    
    /**
     * Sets the "vertBarState" attribute
     */
    public void setVertBarState(org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum vertBarState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTBARSTATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTBARSTATE$10);
            }
            target.setEnumValue(vertBarState);
        }
    }
    
    /**
     * Sets (as xml) the "vertBarState" attribute
     */
    public void xsetVertBarState(org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState vertBarState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().find_attribute_user(VERTBARSTATE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().add_attribute_user(VERTBARSTATE$10);
            }
            target.set(vertBarState);
        }
    }
    
    /**
     * Unsets the "vertBarState" attribute
     */
    public void unsetVertBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTBARSTATE$10);
        }
    }
    
    /**
     * Gets the "horzBarState" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum getHorzBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZBARSTATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HORZBARSTATE$12);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horzBarState" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState xgetHorzBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().find_attribute_user(HORZBARSTATE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_default_attribute_value(HORZBARSTATE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "horzBarState" attribute
     */
    public boolean isSetHorzBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORZBARSTATE$12) != null;
        }
    }
    
    /**
     * Sets the "horzBarState" attribute
     */
    public void setHorzBarState(org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState.Enum horzBarState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZBARSTATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORZBARSTATE$12);
            }
            target.setEnumValue(horzBarState);
        }
    }
    
    /**
     * Sets (as xml) the "horzBarState" attribute
     */
    public void xsetHorzBarState(org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState horzBarState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().find_attribute_user(HORZBARSTATE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STSplitterBarState)get_store().add_attribute_user(HORZBARSTATE$12);
            }
            target.set(horzBarState);
        }
    }
    
    /**
     * Unsets the "horzBarState" attribute
     */
    public void unsetHorzBarState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORZBARSTATE$12);
        }
    }
    
    /**
     * Gets the "preferSingleView" attribute
     */
    public boolean getPreferSingleView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERSINGLEVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREFERSINGLEVIEW$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferSingleView" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreferSingleView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERSINGLEVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PREFERSINGLEVIEW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "preferSingleView" attribute
     */
    public boolean isSetPreferSingleView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERSINGLEVIEW$14) != null;
        }
    }
    
    /**
     * Sets the "preferSingleView" attribute
     */
    public void setPreferSingleView(boolean preferSingleView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERSINGLEVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERSINGLEVIEW$14);
            }
            target.setBooleanValue(preferSingleView);
        }
    }
    
    /**
     * Sets (as xml) the "preferSingleView" attribute
     */
    public void xsetPreferSingleView(org.apache.xmlbeans.XmlBoolean preferSingleView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERSINGLEVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PREFERSINGLEVIEW$14);
            }
            target.set(preferSingleView);
        }
    }
    
    /**
     * Unsets the "preferSingleView" attribute
     */
    public void unsetPreferSingleView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERSINGLEVIEW$14);
        }
    }
}
