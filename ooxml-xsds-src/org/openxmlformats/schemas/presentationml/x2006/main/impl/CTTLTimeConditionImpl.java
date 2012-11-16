/*
 * XML Type:  CT_TLTimeCondition
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeCondition(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition
{
    
    public CTTLTimeConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TGTEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tgtEl");
    private static final javax.xml.namespace.QName TN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tn");
    private static final javax.xml.namespace.QName RTN$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "rtn");
    private static final javax.xml.namespace.QName EVT$6 = 
        new javax.xml.namespace.QName("", "evt");
    private static final javax.xml.namespace.QName DELAY$8 = 
        new javax.xml.namespace.QName("", "delay");
    
    
    /**
     * Gets the "tgtEl" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement getTgtEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().find_element_user(TGTEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tgtEl" element
     */
    public boolean isSetTgtEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TGTEL$0) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().find_element_user(TGTEL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().add_element_user(TGTEL$0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement)get_store().add_element_user(TGTEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tgtEl" element
     */
    public void unsetTgtEl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TGTEL$0, 0);
        }
    }
    
    /**
     * Gets the "tn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID getTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID)get_store().find_element_user(TN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tn" element
     */
    public boolean isSetTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TN$2) != 0;
        }
    }
    
    /**
     * Sets the "tn" element
     */
    public void setTn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID tn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID)get_store().find_element_user(TN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID)get_store().add_element_user(TN$2);
            }
            target.set(tn);
        }
    }
    
    /**
     * Appends and returns a new empty "tn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID addNewTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerTimeNodeID)get_store().add_element_user(TN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tn" element
     */
    public void unsetTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TN$2, 0);
        }
    }
    
    /**
     * Gets the "rtn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode getRtn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode)get_store().find_element_user(RTN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rtn" element
     */
    public boolean isSetRtn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RTN$4) != 0;
        }
    }
    
    /**
     * Sets the "rtn" element
     */
    public void setRtn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode rtn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode)get_store().find_element_user(RTN$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode)get_store().add_element_user(RTN$4);
            }
            target.set(rtn);
        }
    }
    
    /**
     * Appends and returns a new empty "rtn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode addNewRtn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTriggerRuntimeNode)get_store().add_element_user(RTN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rtn" element
     */
    public void unsetRtn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RTN$4, 0);
        }
    }
    
    /**
     * Gets the "evt" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent.Enum getEvt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVT$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "evt" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent xgetEvt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent)get_store().find_attribute_user(EVT$6);
            return target;
        }
    }
    
    /**
     * True if has "evt" attribute
     */
    public boolean isSetEvt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVT$6) != null;
        }
    }
    
    /**
     * Sets the "evt" attribute
     */
    public void setEvt(org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent.Enum evt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVT$6);
            }
            target.setEnumValue(evt);
        }
    }
    
    /**
     * Sets (as xml) the "evt" attribute
     */
    public void xsetEvt(org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent evt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent)get_store().find_attribute_user(EVT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTriggerEvent)get_store().add_attribute_user(EVT$6);
            }
            target.set(evt);
        }
    }
    
    /**
     * Unsets the "evt" attribute
     */
    public void unsetEvt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVT$6);
        }
    }
    
    /**
     * Gets the "delay" attribute
     */
    public java.lang.Object getDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELAY$8);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "delay" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(DELAY$8);
            return target;
        }
    }
    
    /**
     * True if has "delay" attribute
     */
    public boolean isSetDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DELAY$8) != null;
        }
    }
    
    /**
     * Sets the "delay" attribute
     */
    public void setDelay(java.lang.Object delay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELAY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELAY$8);
            }
            target.setObjectValue(delay);
        }
    }
    
    /**
     * Sets (as xml) the "delay" attribute
     */
    public void xsetDelay(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime delay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(DELAY$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().add_attribute_user(DELAY$8);
            }
            target.set(delay);
        }
    }
    
    /**
     * Unsets the "delay" attribute
     */
    public void unsetDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DELAY$8);
        }
    }
}
