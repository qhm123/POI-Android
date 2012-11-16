/*
 * XML Type:  CT_TLCommonMediaNodeData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLCommonMediaNodeData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLCommonMediaNodeDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData
{
    
    public CTTLCommonMediaNodeDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cTn");
    private static final javax.xml.namespace.QName TGTEL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tgtEl");
    private static final javax.xml.namespace.QName VOL$4 = 
        new javax.xml.namespace.QName("", "vol");
    private static final javax.xml.namespace.QName MUTE$6 = 
        new javax.xml.namespace.QName("", "mute");
    private static final javax.xml.namespace.QName NUMSLD$8 = 
        new javax.xml.namespace.QName("", "numSld");
    private static final javax.xml.namespace.QName SHOWWHENSTOPPED$10 = 
        new javax.xml.namespace.QName("", "showWhenStopped");
    
    
    /**
     * Gets the "cTn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData getCTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().find_element_user(CTN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cTn" element
     */
    public void setCTn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData cTn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().find_element_user(CTN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().add_element_user(CTN$0);
            }
            target.set(cTn);
        }
    }
    
    /**
     * Appends and returns a new empty "cTn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData addNewCTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().add_element_user(CTN$0);
            return target;
        }
    }
    
    /**
     * Gets the "tgtEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement getTgtEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().find_element_user(TGTEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tgtEl" element
     */
    public void setTgtEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement tgtEl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().find_element_user(TGTEL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().add_element_user(TGTEL$2);
            }
            target.set(tgtEl);
        }
    }
    
    /**
     * Appends and returns a new empty "tgtEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement addNewTgtEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().add_element_user(TGTEL$2);
            return target;
        }
    }
    
    /**
     * Gets the "vol" attribute
     */
    public int getVol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VOL$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "vol" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetVol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(VOL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(VOL$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "vol" attribute
     */
    public boolean isSetVol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VOL$4) != null;
        }
    }
    
    /**
     * Sets the "vol" attribute
     */
    public void setVol(int vol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOL$4);
            }
            target.setIntValue(vol);
        }
    }
    
    /**
     * Sets (as xml) the "vol" attribute
     */
    public void xsetVol(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage vol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(VOL$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(VOL$4);
            }
            target.set(vol);
        }
    }
    
    /**
     * Unsets the "vol" attribute
     */
    public void unsetVol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VOL$4);
        }
    }
    
    /**
     * Gets the "mute" attribute
     */
    public boolean getMute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MUTE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MUTE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "mute" attribute
     */
    public boolean isSetMute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUTE$6) != null;
        }
    }
    
    /**
     * Sets the "mute" attribute
     */
    public void setMute(boolean mute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUTE$6);
            }
            target.setBooleanValue(mute);
        }
    }
    
    /**
     * Sets (as xml) the "mute" attribute
     */
    public void xsetMute(org.apache.xmlbeans.XmlBoolean mute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MUTE$6);
            }
            target.set(mute);
        }
    }
    
    /**
     * Unsets the "mute" attribute
     */
    public void unsetMute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUTE$6);
        }
    }
    
    /**
     * Gets the "numSld" attribute
     */
    public long getNumSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMSLD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMSLD$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "numSld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNumSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NUMSLD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(NUMSLD$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "numSld" attribute
     */
    public boolean isSetNumSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMSLD$8) != null;
        }
    }
    
    /**
     * Sets the "numSld" attribute
     */
    public void setNumSld(long numSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMSLD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMSLD$8);
            }
            target.setLongValue(numSld);
        }
    }
    
    /**
     * Sets (as xml) the "numSld" attribute
     */
    public void xsetNumSld(org.apache.xmlbeans.XmlUnsignedInt numSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NUMSLD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NUMSLD$8);
            }
            target.set(numSld);
        }
    }
    
    /**
     * Unsets the "numSld" attribute
     */
    public void unsetNumSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMSLD$8);
        }
    }
    
    /**
     * Gets the "showWhenStopped" attribute
     */
    public boolean getShowWhenStopped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWWHENSTOPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWWHENSTOPPED$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showWhenStopped" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowWhenStopped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWWHENSTOPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWWHENSTOPPED$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "showWhenStopped" attribute
     */
    public boolean isSetShowWhenStopped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWWHENSTOPPED$10) != null;
        }
    }
    
    /**
     * Sets the "showWhenStopped" attribute
     */
    public void setShowWhenStopped(boolean showWhenStopped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWWHENSTOPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWWHENSTOPPED$10);
            }
            target.setBooleanValue(showWhenStopped);
        }
    }
    
    /**
     * Sets (as xml) the "showWhenStopped" attribute
     */
    public void xsetShowWhenStopped(org.apache.xmlbeans.XmlBoolean showWhenStopped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWWHENSTOPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWWHENSTOPPED$10);
            }
            target.set(showWhenStopped);
        }
    }
    
    /**
     * Unsets the "showWhenStopped" attribute
     */
    public void unsetShowWhenStopped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWWHENSTOPPED$10);
        }
    }
}
