/*
 * XML Type:  CT_PresentationOf
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_PresentationOf(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTPresentationOfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTPresentationOf
{
    
    public CTPresentationOfImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName AXIS$2 = 
        new javax.xml.namespace.QName("", "axis");
    private static final javax.xml.namespace.QName PTTYPE$4 = 
        new javax.xml.namespace.QName("", "ptType");
    private static final javax.xml.namespace.QName HIDELASTTRANS$6 = 
        new javax.xml.namespace.QName("", "hideLastTrans");
    private static final javax.xml.namespace.QName ST$8 = 
        new javax.xml.namespace.QName("", "st");
    private static final javax.xml.namespace.QName CNT$10 = 
        new javax.xml.namespace.QName("", "cnt");
    private static final javax.xml.namespace.QName STEP$12 = 
        new javax.xml.namespace.QName("", "step");
    
    
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
     * Gets the "axis" attribute
     */
    public java.util.List getAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AXIS$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes xgetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes)get_store().find_attribute_user(AXIS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes)get_default_attribute_value(AXIS$2);
            }
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
            return get_store().find_attribute_user(AXIS$2) != null;
        }
    }
    
    /**
     * Sets the "axis" attribute
     */
    public void setAxis(java.util.List axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXIS$2);
            }
            target.setListValue(axis);
        }
    }
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    public void xsetAxis(org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes)get_store().find_attribute_user(AXIS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAxisTypes)get_store().add_attribute_user(AXIS$2);
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
            get_store().remove_attribute(AXIS$2);
        }
    }
    
    /**
     * Gets the "ptType" attribute
     */
    public java.util.List getPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PTTYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptType" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes xgetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes)get_store().find_attribute_user(PTTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes)get_default_attribute_value(PTTYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "ptType" attribute
     */
    public boolean isSetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PTTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "ptType" attribute
     */
    public void setPtType(java.util.List ptType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PTTYPE$4);
            }
            target.setListValue(ptType);
        }
    }
    
    /**
     * Sets (as xml) the "ptType" attribute
     */
    public void xsetPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes ptType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes)get_store().find_attribute_user(PTTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementTypes)get_store().add_attribute_user(PTTYPE$4);
            }
            target.set(ptType);
        }
    }
    
    /**
     * Unsets the "ptType" attribute
     */
    public void unsetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PTTYPE$4);
        }
    }
    
    /**
     * Gets the "hideLastTrans" attribute
     */
    public java.util.List getHideLastTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDELASTTRANS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDELASTTRANS$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "hideLastTrans" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans xgetHideLastTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans)get_store().find_attribute_user(HIDELASTTRANS$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans)get_default_attribute_value(HIDELASTTRANS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "hideLastTrans" attribute
     */
    public boolean isSetHideLastTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDELASTTRANS$6) != null;
        }
    }
    
    /**
     * Sets the "hideLastTrans" attribute
     */
    public void setHideLastTrans(java.util.List hideLastTrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDELASTTRANS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDELASTTRANS$6);
            }
            target.setListValue(hideLastTrans);
        }
    }
    
    /**
     * Sets (as xml) the "hideLastTrans" attribute
     */
    public void xsetHideLastTrans(org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans hideLastTrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans)get_store().find_attribute_user(HIDELASTTRANS$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STBooleans)get_store().add_attribute_user(HIDELASTTRANS$6);
            }
            target.set(hideLastTrans);
        }
    }
    
    /**
     * Unsets the "hideLastTrans" attribute
     */
    public void unsetHideLastTrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDELASTTRANS$6);
        }
    }
    
    /**
     * Gets the "st" attribute
     */
    public java.util.List getSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ST$8);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "st" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STInts xgetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().find_attribute_user(ST$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_default_attribute_value(ST$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "st" attribute
     */
    public boolean isSetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ST$8) != null;
        }
    }
    
    /**
     * Sets the "st" attribute
     */
    public void setSt(java.util.List st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ST$8);
            }
            target.setListValue(st);
        }
    }
    
    /**
     * Sets (as xml) the "st" attribute
     */
    public void xsetSt(org.openxmlformats.schemas.drawingml.x2006.diagram.STInts st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().find_attribute_user(ST$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().add_attribute_user(ST$8);
            }
            target.set(st);
        }
    }
    
    /**
     * Unsets the "st" attribute
     */
    public void unsetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ST$8);
        }
    }
    
    /**
     * Gets the "cnt" attribute
     */
    public java.util.List getCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CNT$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "cnt" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts xgetCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts)get_store().find_attribute_user(CNT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts)get_default_attribute_value(CNT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "cnt" attribute
     */
    public boolean isSetCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CNT$10) != null;
        }
    }
    
    /**
     * Sets the "cnt" attribute
     */
    public void setCnt(java.util.List cnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CNT$10);
            }
            target.setListValue(cnt);
        }
    }
    
    /**
     * Sets (as xml) the "cnt" attribute
     */
    public void xsetCnt(org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts cnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts)get_store().find_attribute_user(CNT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STUnsignedInts)get_store().add_attribute_user(CNT$10);
            }
            target.set(cnt);
        }
    }
    
    /**
     * Unsets the "cnt" attribute
     */
    public void unsetCnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CNT$10);
        }
    }
    
    /**
     * Gets the "step" attribute
     */
    public java.util.List getStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STEP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STEP$12);
            }
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "step" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STInts xgetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().find_attribute_user(STEP$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_default_attribute_value(STEP$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "step" attribute
     */
    public boolean isSetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STEP$12) != null;
        }
    }
    
    /**
     * Sets the "step" attribute
     */
    public void setStep(java.util.List step)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STEP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STEP$12);
            }
            target.setListValue(step);
        }
    }
    
    /**
     * Sets (as xml) the "step" attribute
     */
    public void xsetStep(org.openxmlformats.schemas.drawingml.x2006.diagram.STInts step)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STInts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().find_attribute_user(STEP$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STInts)get_store().add_attribute_user(STEP$12);
            }
            target.set(step);
        }
    }
    
    /**
     * Unsets the "step" attribute
     */
    public void unsetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STEP$12);
        }
    }
}
