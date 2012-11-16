/*
 * XML Type:  CT_ShapeLocking
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ShapeLocking(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTShapeLockingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking
{
    
    public CTShapeLockingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NOGRP$2 = 
        new javax.xml.namespace.QName("", "noGrp");
    private static final javax.xml.namespace.QName NOSELECT$4 = 
        new javax.xml.namespace.QName("", "noSelect");
    private static final javax.xml.namespace.QName NOROT$6 = 
        new javax.xml.namespace.QName("", "noRot");
    private static final javax.xml.namespace.QName NOCHANGEASPECT$8 = 
        new javax.xml.namespace.QName("", "noChangeAspect");
    private static final javax.xml.namespace.QName NOMOVE$10 = 
        new javax.xml.namespace.QName("", "noMove");
    private static final javax.xml.namespace.QName NORESIZE$12 = 
        new javax.xml.namespace.QName("", "noResize");
    private static final javax.xml.namespace.QName NOEDITPOINTS$14 = 
        new javax.xml.namespace.QName("", "noEditPoints");
    private static final javax.xml.namespace.QName NOADJUSTHANDLES$16 = 
        new javax.xml.namespace.QName("", "noAdjustHandles");
    private static final javax.xml.namespace.QName NOCHANGEARROWHEADS$18 = 
        new javax.xml.namespace.QName("", "noChangeArrowheads");
    private static final javax.xml.namespace.QName NOCHANGESHAPETYPE$20 = 
        new javax.xml.namespace.QName("", "noChangeShapeType");
    private static final javax.xml.namespace.QName NOTEXTEDIT$22 = 
        new javax.xml.namespace.QName("", "noTextEdit");
    
    
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
     * Gets the "noSelect" attribute
     */
    public boolean getNoSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOSELECT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOSELECT$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOSELECT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOSELECT$4);
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
            return get_store().find_attribute_user(NOSELECT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOSELECT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOSELECT$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOSELECT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOSELECT$4);
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
            get_store().remove_attribute(NOSELECT$4);
        }
    }
    
    /**
     * Gets the "noRot" attribute
     */
    public boolean getNoRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOROT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOROT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noRot" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOROT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOROT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "noRot" attribute
     */
    public boolean isSetNoRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOROT$6) != null;
        }
    }
    
    /**
     * Sets the "noRot" attribute
     */
    public void setNoRot(boolean noRot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOROT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOROT$6);
            }
            target.setBooleanValue(noRot);
        }
    }
    
    /**
     * Sets (as xml) the "noRot" attribute
     */
    public void xsetNoRot(org.apache.xmlbeans.XmlBoolean noRot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOROT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOROT$6);
            }
            target.set(noRot);
        }
    }
    
    /**
     * Unsets the "noRot" attribute
     */
    public void unsetNoRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOROT$6);
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
    
    /**
     * Gets the "noEditPoints" attribute
     */
    public boolean getNoEditPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOEDITPOINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOEDITPOINTS$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noEditPoints" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoEditPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOEDITPOINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOEDITPOINTS$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "noEditPoints" attribute
     */
    public boolean isSetNoEditPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOEDITPOINTS$14) != null;
        }
    }
    
    /**
     * Sets the "noEditPoints" attribute
     */
    public void setNoEditPoints(boolean noEditPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOEDITPOINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOEDITPOINTS$14);
            }
            target.setBooleanValue(noEditPoints);
        }
    }
    
    /**
     * Sets (as xml) the "noEditPoints" attribute
     */
    public void xsetNoEditPoints(org.apache.xmlbeans.XmlBoolean noEditPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOEDITPOINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOEDITPOINTS$14);
            }
            target.set(noEditPoints);
        }
    }
    
    /**
     * Unsets the "noEditPoints" attribute
     */
    public void unsetNoEditPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOEDITPOINTS$14);
        }
    }
    
    /**
     * Gets the "noAdjustHandles" attribute
     */
    public boolean getNoAdjustHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOADJUSTHANDLES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOADJUSTHANDLES$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noAdjustHandles" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoAdjustHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOADJUSTHANDLES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOADJUSTHANDLES$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "noAdjustHandles" attribute
     */
    public boolean isSetNoAdjustHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOADJUSTHANDLES$16) != null;
        }
    }
    
    /**
     * Sets the "noAdjustHandles" attribute
     */
    public void setNoAdjustHandles(boolean noAdjustHandles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOADJUSTHANDLES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOADJUSTHANDLES$16);
            }
            target.setBooleanValue(noAdjustHandles);
        }
    }
    
    /**
     * Sets (as xml) the "noAdjustHandles" attribute
     */
    public void xsetNoAdjustHandles(org.apache.xmlbeans.XmlBoolean noAdjustHandles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOADJUSTHANDLES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOADJUSTHANDLES$16);
            }
            target.set(noAdjustHandles);
        }
    }
    
    /**
     * Unsets the "noAdjustHandles" attribute
     */
    public void unsetNoAdjustHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOADJUSTHANDLES$16);
        }
    }
    
    /**
     * Gets the "noChangeArrowheads" attribute
     */
    public boolean getNoChangeArrowheads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOCHANGEARROWHEADS$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noChangeArrowheads" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoChangeArrowheads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOCHANGEARROWHEADS$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "noChangeArrowheads" attribute
     */
    public boolean isSetNoChangeArrowheads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOCHANGEARROWHEADS$18) != null;
        }
    }
    
    /**
     * Sets the "noChangeArrowheads" attribute
     */
    public void setNoChangeArrowheads(boolean noChangeArrowheads)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOCHANGEARROWHEADS$18);
            }
            target.setBooleanValue(noChangeArrowheads);
        }
    }
    
    /**
     * Sets (as xml) the "noChangeArrowheads" attribute
     */
    public void xsetNoChangeArrowheads(org.apache.xmlbeans.XmlBoolean noChangeArrowheads)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOCHANGEARROWHEADS$18);
            }
            target.set(noChangeArrowheads);
        }
    }
    
    /**
     * Unsets the "noChangeArrowheads" attribute
     */
    public void unsetNoChangeArrowheads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOCHANGEARROWHEADS$18);
        }
    }
    
    /**
     * Gets the "noChangeShapeType" attribute
     */
    public boolean getNoChangeShapeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOCHANGESHAPETYPE$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noChangeShapeType" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoChangeShapeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOCHANGESHAPETYPE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "noChangeShapeType" attribute
     */
    public boolean isSetNoChangeShapeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOCHANGESHAPETYPE$20) != null;
        }
    }
    
    /**
     * Sets the "noChangeShapeType" attribute
     */
    public void setNoChangeShapeType(boolean noChangeShapeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOCHANGESHAPETYPE$20);
            }
            target.setBooleanValue(noChangeShapeType);
        }
    }
    
    /**
     * Sets (as xml) the "noChangeShapeType" attribute
     */
    public void xsetNoChangeShapeType(org.apache.xmlbeans.XmlBoolean noChangeShapeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOCHANGESHAPETYPE$20);
            }
            target.set(noChangeShapeType);
        }
    }
    
    /**
     * Unsets the "noChangeShapeType" attribute
     */
    public void unsetNoChangeShapeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOCHANGESHAPETYPE$20);
        }
    }
    
    /**
     * Gets the "noTextEdit" attribute
     */
    public boolean getNoTextEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTEXTEDIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOTEXTEDIT$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "noTextEdit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNoTextEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOTEXTEDIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NOTEXTEDIT$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "noTextEdit" attribute
     */
    public boolean isSetNoTextEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOTEXTEDIT$22) != null;
        }
    }
    
    /**
     * Sets the "noTextEdit" attribute
     */
    public void setNoTextEdit(boolean noTextEdit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTEXTEDIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOTEXTEDIT$22);
            }
            target.setBooleanValue(noTextEdit);
        }
    }
    
    /**
     * Sets (as xml) the "noTextEdit" attribute
     */
    public void xsetNoTextEdit(org.apache.xmlbeans.XmlBoolean noTextEdit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NOTEXTEDIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NOTEXTEDIT$22);
            }
            target.set(noTextEdit);
        }
    }
    
    /**
     * Unsets the "noTextEdit" attribute
     */
    public void unsetNoTextEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOTEXTEDIT$22);
        }
    }
}
