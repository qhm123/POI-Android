/*
 * XML Type:  CT_GraphicalObjectFrameLocking
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GraphicalObjectFrameLocking(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGraphicalObjectFrameLockingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking
{
    
    public CTGraphicalObjectFrameLockingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NOGRP$2 = 
        new javax.xml.namespace.QName("", "noGrp");
    private static final javax.xml.namespace.QName NODRILLDOWN$4 = 
        new javax.xml.namespace.QName("", "noDrilldown");
    private static final javax.xml.namespace.QName NOSELECT$6 = 
        new javax.xml.namespace.QName("", "noSelect");
    private static final javax.xml.namespace.QName NOCHANGEASPECT$8 = 
        new javax.xml.namespace.QName("", "noChangeAspect");
    private static final javax.xml.namespace.QName NOMOVE$10 = 
        new javax.xml.namespace.QName("", "noMove");
    private static final javax.xml.namespace.QName NORESIZE$12 = 
        new javax.xml.namespace.QName("", "noResize");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "noGrp" attribute
     */
    public boolean getNoGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOGRP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOGRP$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noGrp" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOGRP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOGRP$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "noGrp" attribute
     */
    public boolean isSetNoGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOGRP$2) != null;
        }
    }
    
    /**
     * Sets the "noGrp" attribute
     */
    public void setNoGrp(boolean noGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOGRP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOGRP$2);
            }
            target.setBooleanValue(noGrp);
        }
    }
    
    /**
     * Sets (as xml) the "noGrp" attribute
     */
    public void xsetNoGrp(org.apache.xmlbeans.XmlBoolean noGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOGRP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOGRP$2);
            }
            target.set(noGrp);
        }
    }
    
    /**
     * Unsets the "noGrp" attribute
     */
    public void unsetNoGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOGRP$2);
        }
    }
    
    /**
     * Gets the "noDrilldown" attribute
     */
    public boolean getNoDrilldown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODRILLDOWN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NODRILLDOWN$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noDrilldown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoDrilldown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NODRILLDOWN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NODRILLDOWN$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "noDrilldown" attribute
     */
    public boolean isSetNoDrilldown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NODRILLDOWN$4) != null;
        }
    }
    
    /**
     * Sets the "noDrilldown" attribute
     */
    public void setNoDrilldown(boolean noDrilldown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODRILLDOWN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODRILLDOWN$4);
            }
            target.setBooleanValue(noDrilldown);
        }
    }
    
    /**
     * Sets (as xml) the "noDrilldown" attribute
     */
    public void xsetNoDrilldown(org.apache.xmlbeans.XmlBoolean noDrilldown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NODRILLDOWN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NODRILLDOWN$4);
            }
            target.set(noDrilldown);
        }
    }
    
    /**
     * Unsets the "noDrilldown" attribute
     */
    public void unsetNoDrilldown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NODRILLDOWN$4);
        }
    }
    
    /**
     * Gets the "noSelect" attribute
     */
    public boolean getNoSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOSELECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOSELECT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noSelect" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOSELECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOSELECT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "noSelect" attribute
     */
    public boolean isSetNoSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOSELECT$6) != null;
        }
    }
    
    /**
     * Sets the "noSelect" attribute
     */
    public void setNoSelect(boolean noSelect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOSELECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOSELECT$6);
            }
            target.setBooleanValue(noSelect);
        }
    }
    
    /**
     * Sets (as xml) the "noSelect" attribute
     */
    public void xsetNoSelect(org.apache.xmlbeans.XmlBoolean noSelect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOSELECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOSELECT$6);
            }
            target.set(noSelect);
        }
    }
    
    /**
     * Unsets the "noSelect" attribute
     */
    public void unsetNoSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOSELECT$6);
        }
    }
    
    /**
     * Gets the "noChangeAspect" attribute
     */
    public boolean getNoChangeAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGEASPECT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOCHANGEASPECT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noChangeAspect" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoChangeAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGEASPECT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOCHANGEASPECT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "noChangeAspect" attribute
     */
    public boolean isSetNoChangeAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOCHANGEASPECT$8) != null;
        }
    }
    
    /**
     * Sets the "noChangeAspect" attribute
     */
    public void setNoChangeAspect(boolean noChangeAspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGEASPECT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOCHANGEASPECT$8);
            }
            target.setBooleanValue(noChangeAspect);
        }
    }
    
    /**
     * Sets (as xml) the "noChangeAspect" attribute
     */
    public void xsetNoChangeAspect(org.apache.xmlbeans.XmlBoolean noChangeAspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGEASPECT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOCHANGEASPECT$8);
            }
            target.set(noChangeAspect);
        }
    }
    
    /**
     * Unsets the "noChangeAspect" attribute
     */
    public void unsetNoChangeAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOCHANGEASPECT$8);
        }
    }
    
    /**
     * Gets the "noMove" attribute
     */
    public boolean getNoMove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMOVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOMOVE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noMove" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoMove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOMOVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOMOVE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "noMove" attribute
     */
    public boolean isSetNoMove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOMOVE$10) != null;
        }
    }
    
    /**
     * Sets the "noMove" attribute
     */
    public void setNoMove(boolean noMove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMOVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOMOVE$10);
            }
            target.setBooleanValue(noMove);
        }
    }
    
    /**
     * Sets (as xml) the "noMove" attribute
     */
    public void xsetNoMove(org.apache.xmlbeans.XmlBoolean noMove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOMOVE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOMOVE$10);
            }
            target.set(noMove);
        }
    }
    
    /**
     * Unsets the "noMove" attribute
     */
    public void unsetNoMove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOMOVE$10);
        }
    }
    
    /**
     * Gets the "noResize" attribute
     */
    public boolean getNoResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NORESIZE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NORESIZE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noResize" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NORESIZE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NORESIZE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "noResize" attribute
     */
    public boolean isSetNoResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NORESIZE$12) != null;
        }
    }
    
    /**
     * Sets the "noResize" attribute
     */
    public void setNoResize(boolean noResize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NORESIZE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NORESIZE$12);
            }
            target.setBooleanValue(noResize);
        }
    }
    
    /**
     * Sets (as xml) the "noResize" attribute
     */
    public void xsetNoResize(org.apache.xmlbeans.XmlBoolean noResize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NORESIZE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NORESIZE$12);
            }
            target.set(noResize);
        }
    }
    
    /**
     * Unsets the "noResize" attribute
     */
    public void unsetNoResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NORESIZE$12);
        }
    }
}
