/*
 * XML Type:  CT_TLCommonTimeNodeData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLCommonTimeNodeData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLCommonTimeNodeDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData
{
    
    public CTTLCommonTimeNodeDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STCONDLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "stCondLst");
    private static final javax.xml.namespace.QName ENDCONDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "endCondLst");
    private static final javax.xml.namespace.QName ENDSYNC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "endSync");
    private static final javax.xml.namespace.QName ITERATE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "iterate");
    private static final javax.xml.namespace.QName CHILDTNLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "childTnLst");
    private static final javax.xml.namespace.QName SUBTNLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "subTnLst");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName PRESETID$14 = 
        new javax.xml.namespace.QName("", "presetID");
    private static final javax.xml.namespace.QName PRESETCLASS$16 = 
        new javax.xml.namespace.QName("", "presetClass");
    private static final javax.xml.namespace.QName PRESETSUBTYPE$18 = 
        new javax.xml.namespace.QName("", "presetSubtype");
    private static final javax.xml.namespace.QName DUR$20 = 
        new javax.xml.namespace.QName("", "dur");
    private static final javax.xml.namespace.QName REPEATCOUNT$22 = 
        new javax.xml.namespace.QName("", "repeatCount");
    private static final javax.xml.namespace.QName REPEATDUR$24 = 
        new javax.xml.namespace.QName("", "repeatDur");
    private static final javax.xml.namespace.QName SPD$26 = 
        new javax.xml.namespace.QName("", "spd");
    private static final javax.xml.namespace.QName ACCEL$28 = 
        new javax.xml.namespace.QName("", "accel");
    private static final javax.xml.namespace.QName DECEL$30 = 
        new javax.xml.namespace.QName("", "decel");
    private static final javax.xml.namespace.QName AUTOREV$32 = 
        new javax.xml.namespace.QName("", "autoRev");
    private static final javax.xml.namespace.QName RESTART$34 = 
        new javax.xml.namespace.QName("", "restart");
    private static final javax.xml.namespace.QName FILL$36 = 
        new javax.xml.namespace.QName("", "fill");
    private static final javax.xml.namespace.QName SYNCBEHAVIOR$38 = 
        new javax.xml.namespace.QName("", "syncBehavior");
    private static final javax.xml.namespace.QName TMFILTER$40 = 
        new javax.xml.namespace.QName("", "tmFilter");
    private static final javax.xml.namespace.QName EVTFILTER$42 = 
        new javax.xml.namespace.QName("", "evtFilter");
    private static final javax.xml.namespace.QName DISPLAY$44 = 
        new javax.xml.namespace.QName("", "display");
    private static final javax.xml.namespace.QName MASTERREL$46 = 
        new javax.xml.namespace.QName("", "masterRel");
    private static final javax.xml.namespace.QName BLDLVL$48 = 
        new javax.xml.namespace.QName("", "bldLvl");
    private static final javax.xml.namespace.QName GRPID$50 = 
        new javax.xml.namespace.QName("", "grpId");
    private static final javax.xml.namespace.QName AFTEREFFECT$52 = 
        new javax.xml.namespace.QName("", "afterEffect");
    private static final javax.xml.namespace.QName NODETYPE$54 = 
        new javax.xml.namespace.QName("", "nodeType");
    private static final javax.xml.namespace.QName NODEPH$56 = 
        new javax.xml.namespace.QName("", "nodePh");
    
    
    /**
     * Gets the "stCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getStCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(STCONDLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stCondLst" element
     */
    public boolean isSetStCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STCONDLST$0) != 0;
        }
    }
    
    /**
     * Sets the "stCondLst" element
     */
    public void setStCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList stCondLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(STCONDLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(STCONDLST$0);
            }
            target.set(stCondLst);
        }
    }
    
    /**
     * Appends and returns a new empty "stCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewStCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(STCONDLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "stCondLst" element
     */
    public void unsetStCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STCONDLST$0, 0);
        }
    }
    
    /**
     * Gets the "endCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getEndCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(ENDCONDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endCondLst" element
     */
    public boolean isSetEndCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDCONDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "endCondLst" element
     */
    public void setEndCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList endCondLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(ENDCONDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(ENDCONDLST$2);
            }
            target.set(endCondLst);
        }
    }
    
    /**
     * Appends and returns a new empty "endCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewEndCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(ENDCONDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "endCondLst" element
     */
    public void unsetEndCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDCONDLST$2, 0);
        }
    }
    
    /**
     * Gets the "endSync" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition getEndSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().find_element_user(ENDSYNC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endSync" element
     */
    public boolean isSetEndSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDSYNC$4) != 0;
        }
    }
    
    /**
     * Sets the "endSync" element
     */
    public void setEndSync(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition endSync)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().find_element_user(ENDSYNC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().add_element_user(ENDSYNC$4);
            }
            target.set(endSync);
        }
    }
    
    /**
     * Appends and returns a new empty "endSync" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition addNewEndSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeCondition)get_store().add_element_user(ENDSYNC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endSync" element
     */
    public void unsetEndSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDSYNC$4, 0);
        }
    }
    
    /**
     * Gets the "iterate" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData getIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData)get_store().find_element_user(ITERATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iterate" element
     */
    public boolean isSetIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITERATE$6) != 0;
        }
    }
    
    /**
     * Sets the "iterate" element
     */
    public void setIterate(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData iterate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData)get_store().find_element_user(ITERATE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData)get_store().add_element_user(ITERATE$6);
            }
            target.set(iterate);
        }
    }
    
    /**
     * Appends and returns a new empty "iterate" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData addNewIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData)get_store().add_element_user(ITERATE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "iterate" element
     */
    public void unsetIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITERATE$6, 0);
        }
    }
    
    /**
     * Gets the "childTnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getChildTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(CHILDTNLST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "childTnLst" element
     */
    public boolean isSetChildTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDTNLST$8) != 0;
        }
    }
    
    /**
     * Sets the "childTnLst" element
     */
    public void setChildTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList childTnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(CHILDTNLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(CHILDTNLST$8);
            }
            target.set(childTnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "childTnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewChildTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(CHILDTNLST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "childTnLst" element
     */
    public void unsetChildTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDTNLST$8, 0);
        }
    }
    
    /**
     * Gets the "subTnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getSubTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(SUBTNLST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subTnLst" element
     */
    public boolean isSetSubTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTNLST$10) != 0;
        }
    }
    
    /**
     * Sets the "subTnLst" element
     */
    public void setSubTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList subTnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(SUBTNLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(SUBTNLST$10);
            }
            target.set(subTnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "subTnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewSubTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(SUBTNLST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "subTnLst" element
     */
    public void unsetSubTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTNLST$10, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
    
    /**
     * Gets the "presetID" attribute
     */
    public int getPresetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETID$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "presetID" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPresetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESETID$14);
            return target;
        }
    }
    
    /**
     * True if has "presetID" attribute
     */
    public boolean isSetPresetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESETID$14) != null;
        }
    }
    
    /**
     * Sets the "presetID" attribute
     */
    public void setPresetID(int presetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESETID$14);
            }
            target.setIntValue(presetID);
        }
    }
    
    /**
     * Sets (as xml) the "presetID" attribute
     */
    public void xsetPresetID(org.apache.xmlbeans.XmlInt presetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESETID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRESETID$14);
            }
            target.set(presetID);
        }
    }
    
    /**
     * Unsets the "presetID" attribute
     */
    public void unsetPresetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESETID$14);
        }
    }
    
    /**
     * Gets the "presetClass" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType.Enum getPresetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETCLASS$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "presetClass" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType xgetPresetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType)get_store().find_attribute_user(PRESETCLASS$16);
            return target;
        }
    }
    
    /**
     * True if has "presetClass" attribute
     */
    public boolean isSetPresetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESETCLASS$16) != null;
        }
    }
    
    /**
     * Sets the "presetClass" attribute
     */
    public void setPresetClass(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType.Enum presetClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETCLASS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESETCLASS$16);
            }
            target.setEnumValue(presetClass);
        }
    }
    
    /**
     * Sets (as xml) the "presetClass" attribute
     */
    public void xsetPresetClass(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType presetClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType)get_store().find_attribute_user(PRESETCLASS$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodePresetClassType)get_store().add_attribute_user(PRESETCLASS$16);
            }
            target.set(presetClass);
        }
    }
    
    /**
     * Unsets the "presetClass" attribute
     */
    public void unsetPresetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESETCLASS$16);
        }
    }
    
    /**
     * Gets the "presetSubtype" attribute
     */
    public int getPresetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETSUBTYPE$18);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "presetSubtype" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPresetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESETSUBTYPE$18);
            return target;
        }
    }
    
    /**
     * True if has "presetSubtype" attribute
     */
    public boolean isSetPresetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESETSUBTYPE$18) != null;
        }
    }
    
    /**
     * Sets the "presetSubtype" attribute
     */
    public void setPresetSubtype(int presetSubtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESETSUBTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESETSUBTYPE$18);
            }
            target.setIntValue(presetSubtype);
        }
    }
    
    /**
     * Sets (as xml) the "presetSubtype" attribute
     */
    public void xsetPresetSubtype(org.apache.xmlbeans.XmlInt presetSubtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRESETSUBTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRESETSUBTYPE$18);
            }
            target.set(presetSubtype);
        }
    }
    
    /**
     * Unsets the "presetSubtype" attribute
     */
    public void unsetPresetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESETSUBTYPE$18);
        }
    }
    
    /**
     * Gets the "dur" attribute
     */
    public java.lang.Object getDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DUR$20);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "dur" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(DUR$20);
            return target;
        }
    }
    
    /**
     * True if has "dur" attribute
     */
    public boolean isSetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DUR$20) != null;
        }
    }
    
    /**
     * Sets the "dur" attribute
     */
    public void setDur(java.lang.Object dur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DUR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DUR$20);
            }
            target.setObjectValue(dur);
        }
    }
    
    /**
     * Sets (as xml) the "dur" attribute
     */
    public void xsetDur(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime dur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(DUR$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().add_attribute_user(DUR$20);
            }
            target.set(dur);
        }
    }
    
    /**
     * Unsets the "dur" attribute
     */
    public void unsetDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DUR$20);
        }
    }
    
    /**
     * Gets the "repeatCount" attribute
     */
    public java.lang.Object getRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPEATCOUNT$22);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "repeatCount" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(REPEATCOUNT$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_default_attribute_value(REPEATCOUNT$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "repeatCount" attribute
     */
    public boolean isSetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATCOUNT$22) != null;
        }
    }
    
    /**
     * Sets the "repeatCount" attribute
     */
    public void setRepeatCount(java.lang.Object repeatCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATCOUNT$22);
            }
            target.setObjectValue(repeatCount);
        }
    }
    
    /**
     * Sets (as xml) the "repeatCount" attribute
     */
    public void xsetRepeatCount(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime repeatCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(REPEATCOUNT$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().add_attribute_user(REPEATCOUNT$22);
            }
            target.set(repeatCount);
        }
    }
    
    /**
     * Unsets the "repeatCount" attribute
     */
    public void unsetRepeatCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATCOUNT$22);
        }
    }
    
    /**
     * Gets the "repeatDur" attribute
     */
    public java.lang.Object getRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATDUR$24);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "repeatDur" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(REPEATDUR$24);
            return target;
        }
    }
    
    /**
     * True if has "repeatDur" attribute
     */
    public boolean isSetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPEATDUR$24) != null;
        }
    }
    
    /**
     * Sets the "repeatDur" attribute
     */
    public void setRepeatDur(java.lang.Object repeatDur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPEATDUR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPEATDUR$24);
            }
            target.setObjectValue(repeatDur);
        }
    }
    
    /**
     * Sets (as xml) the "repeatDur" attribute
     */
    public void xsetRepeatDur(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime repeatDur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(REPEATDUR$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().add_attribute_user(REPEATDUR$24);
            }
            target.set(repeatDur);
        }
    }
    
    /**
     * Unsets the "repeatDur" attribute
     */
    public void unsetRepeatDur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPEATDUR$24);
        }
    }
    
    /**
     * Gets the "spd" attribute
     */
    public int getSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPD$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPD$26);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "spd" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SPD$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SPD$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "spd" attribute
     */
    public boolean isSetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPD$26) != null;
        }
    }
    
    /**
     * Sets the "spd" attribute
     */
    public void setSpd(int spd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPD$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPD$26);
            }
            target.setIntValue(spd);
        }
    }
    
    /**
     * Sets (as xml) the "spd" attribute
     */
    public void xsetSpd(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage spd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SPD$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SPD$26);
            }
            target.set(spd);
        }
    }
    
    /**
     * Unsets the "spd" attribute
     */
    public void unsetSpd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPD$26);
        }
    }
    
    /**
     * Gets the "accel" attribute
     */
    public int getAccel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACCEL$28);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "accel" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetAccel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ACCEL$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(ACCEL$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "accel" attribute
     */
    public boolean isSetAccel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCEL$28) != null;
        }
    }
    
    /**
     * Sets the "accel" attribute
     */
    public void setAccel(int accel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCEL$28);
            }
            target.setIntValue(accel);
        }
    }
    
    /**
     * Sets (as xml) the "accel" attribute
     */
    public void xsetAccel(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage accel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(ACCEL$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(ACCEL$28);
            }
            target.set(accel);
        }
    }
    
    /**
     * Unsets the "accel" attribute
     */
    public void unsetAccel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCEL$28);
        }
    }
    
    /**
     * Gets the "decel" attribute
     */
    public int getDecel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DECEL$30);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "decel" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetDecel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(DECEL$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_default_attribute_value(DECEL$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "decel" attribute
     */
    public boolean isSetDecel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECEL$30) != null;
        }
    }
    
    /**
     * Sets the "decel" attribute
     */
    public void setDecel(int decel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECEL$30);
            }
            target.setIntValue(decel);
        }
    }
    
    /**
     * Sets (as xml) the "decel" attribute
     */
    public void xsetDecel(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage decel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().find_attribute_user(DECEL$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage)get_store().add_attribute_user(DECEL$30);
            }
            target.set(decel);
        }
    }
    
    /**
     * Unsets the "decel" attribute
     */
    public void unsetDecel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECEL$30);
        }
    }
    
    /**
     * Gets the "autoRev" attribute
     */
    public boolean getAutoRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOREV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOREV$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoRev" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOREV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOREV$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoRev" attribute
     */
    public boolean isSetAutoRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOREV$32) != null;
        }
    }
    
    /**
     * Sets the "autoRev" attribute
     */
    public void setAutoRev(boolean autoRev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOREV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOREV$32);
            }
            target.setBooleanValue(autoRev);
        }
    }
    
    /**
     * Sets (as xml) the "autoRev" attribute
     */
    public void xsetAutoRev(org.apache.xmlbeans.XmlBoolean autoRev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOREV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOREV$32);
            }
            target.set(autoRev);
        }
    }
    
    /**
     * Unsets the "autoRev" attribute
     */
    public void unsetAutoRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOREV$32);
        }
    }
    
    /**
     * Gets the "restart" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType.Enum getRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "restart" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType xgetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType)get_store().find_attribute_user(RESTART$34);
            return target;
        }
    }
    
    /**
     * True if has "restart" attribute
     */
    public boolean isSetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESTART$34) != null;
        }
    }
    
    /**
     * Sets the "restart" attribute
     */
    public void setRestart(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType.Enum restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESTART$34);
            }
            target.setEnumValue(restart);
        }
    }
    
    /**
     * Sets (as xml) the "restart" attribute
     */
    public void xsetRestart(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType restart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType)get_store().find_attribute_user(RESTART$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeRestartType)get_store().add_attribute_user(RESTART$34);
            }
            target.set(restart);
        }
    }
    
    /**
     * Unsets the "restart" attribute
     */
    public void unsetRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESTART$34);
        }
    }
    
    /**
     * Gets the "fill" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType.Enum getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$36);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fill" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType xgetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType)get_store().find_attribute_user(FILL$36);
            return target;
        }
    }
    
    /**
     * True if has "fill" attribute
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILL$36) != null;
        }
    }
    
    /**
     * Sets the "fill" attribute
     */
    public void setFill(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType.Enum fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILL$36);
            }
            target.setEnumValue(fill);
        }
    }
    
    /**
     * Sets (as xml) the "fill" attribute
     */
    public void xsetFill(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType)get_store().find_attribute_user(FILL$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeFillType)get_store().add_attribute_user(FILL$36);
            }
            target.set(fill);
        }
    }
    
    /**
     * Unsets the "fill" attribute
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILL$36);
        }
    }
    
    /**
     * Gets the "syncBehavior" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType.Enum getSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIOR$38);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "syncBehavior" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType xgetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType)get_store().find_attribute_user(SYNCBEHAVIOR$38);
            return target;
        }
    }
    
    /**
     * True if has "syncBehavior" attribute
     */
    public boolean isSetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCBEHAVIOR$38) != null;
        }
    }
    
    /**
     * Sets the "syncBehavior" attribute
     */
    public void setSyncBehavior(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType.Enum syncBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCBEHAVIOR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCBEHAVIOR$38);
            }
            target.setEnumValue(syncBehavior);
        }
    }
    
    /**
     * Sets (as xml) the "syncBehavior" attribute
     */
    public void xsetSyncBehavior(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType syncBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType)get_store().find_attribute_user(SYNCBEHAVIOR$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeSyncType)get_store().add_attribute_user(SYNCBEHAVIOR$38);
            }
            target.set(syncBehavior);
        }
    }
    
    /**
     * Unsets the "syncBehavior" attribute
     */
    public void unsetSyncBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCBEHAVIOR$38);
        }
    }
    
    /**
     * Gets the "tmFilter" attribute
     */
    public java.lang.String getTmFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TMFILTER$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tmFilter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTmFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TMFILTER$40);
            return target;
        }
    }
    
    /**
     * True if has "tmFilter" attribute
     */
    public boolean isSetTmFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TMFILTER$40) != null;
        }
    }
    
    /**
     * Sets the "tmFilter" attribute
     */
    public void setTmFilter(java.lang.String tmFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TMFILTER$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TMFILTER$40);
            }
            target.setStringValue(tmFilter);
        }
    }
    
    /**
     * Sets (as xml) the "tmFilter" attribute
     */
    public void xsetTmFilter(org.apache.xmlbeans.XmlString tmFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TMFILTER$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TMFILTER$40);
            }
            target.set(tmFilter);
        }
    }
    
    /**
     * Unsets the "tmFilter" attribute
     */
    public void unsetTmFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TMFILTER$40);
        }
    }
    
    /**
     * Gets the "evtFilter" attribute
     */
    public java.lang.String getEvtFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVTFILTER$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "evtFilter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEvtFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVTFILTER$42);
            return target;
        }
    }
    
    /**
     * True if has "evtFilter" attribute
     */
    public boolean isSetEvtFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVTFILTER$42) != null;
        }
    }
    
    /**
     * Sets the "evtFilter" attribute
     */
    public void setEvtFilter(java.lang.String evtFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVTFILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVTFILTER$42);
            }
            target.setStringValue(evtFilter);
        }
    }
    
    /**
     * Sets (as xml) the "evtFilter" attribute
     */
    public void xsetEvtFilter(org.apache.xmlbeans.XmlString evtFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVTFILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVTFILTER$42);
            }
            target.set(evtFilter);
        }
    }
    
    /**
     * Unsets the "evtFilter" attribute
     */
    public void unsetEvtFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVTFILTER$42);
        }
    }
    
    /**
     * Gets the "display" attribute
     */
    public boolean getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$44);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "display" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISPLAY$44);
            return target;
        }
    }
    
    /**
     * True if has "display" attribute
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAY$44) != null;
        }
    }
    
    /**
     * Sets the "display" attribute
     */
    public void setDisplay(boolean display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAY$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAY$44);
            }
            target.setBooleanValue(display);
        }
    }
    
    /**
     * Sets (as xml) the "display" attribute
     */
    public void xsetDisplay(org.apache.xmlbeans.XmlBoolean display)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISPLAY$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISPLAY$44);
            }
            target.set(display);
        }
    }
    
    /**
     * Unsets the "display" attribute
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAY$44);
        }
    }
    
    /**
     * Gets the "masterRel" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation.Enum getMasterRel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASTERREL$46);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "masterRel" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation xgetMasterRel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation)get_store().find_attribute_user(MASTERREL$46);
            return target;
        }
    }
    
    /**
     * True if has "masterRel" attribute
     */
    public boolean isSetMasterRel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MASTERREL$46) != null;
        }
    }
    
    /**
     * Sets the "masterRel" attribute
     */
    public void setMasterRel(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation.Enum masterRel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASTERREL$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASTERREL$46);
            }
            target.setEnumValue(masterRel);
        }
    }
    
    /**
     * Sets (as xml) the "masterRel" attribute
     */
    public void xsetMasterRel(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation masterRel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation)get_store().find_attribute_user(MASTERREL$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeMasterRelation)get_store().add_attribute_user(MASTERREL$46);
            }
            target.set(masterRel);
        }
    }
    
    /**
     * Unsets the "masterRel" attribute
     */
    public void unsetMasterRel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MASTERREL$46);
        }
    }
    
    /**
     * Gets the "bldLvl" attribute
     */
    public int getBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDLVL$48);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "bldLvl" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BLDLVL$48);
            return target;
        }
    }
    
    /**
     * True if has "bldLvl" attribute
     */
    public boolean isSetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLDLVL$48) != null;
        }
    }
    
    /**
     * Sets the "bldLvl" attribute
     */
    public void setBldLvl(int bldLvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDLVL$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLDLVL$48);
            }
            target.setIntValue(bldLvl);
        }
    }
    
    /**
     * Sets (as xml) the "bldLvl" attribute
     */
    public void xsetBldLvl(org.apache.xmlbeans.XmlInt bldLvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BLDLVL$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(BLDLVL$48);
            }
            target.set(bldLvl);
        }
    }
    
    /**
     * Unsets the "bldLvl" attribute
     */
    public void unsetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLDLVL$48);
        }
    }
    
    /**
     * Gets the "grpId" attribute
     */
    public long getGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$50);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "grpId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$50);
            return target;
        }
    }
    
    /**
     * True if has "grpId" attribute
     */
    public boolean isSetGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRPID$50) != null;
        }
    }
    
    /**
     * Sets the "grpId" attribute
     */
    public void setGrpId(long grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRPID$50);
            }
            target.setLongValue(grpId);
        }
    }
    
    /**
     * Sets (as xml) the "grpId" attribute
     */
    public void xsetGrpId(org.apache.xmlbeans.XmlUnsignedInt grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(GRPID$50);
            }
            target.set(grpId);
        }
    }
    
    /**
     * Unsets the "grpId" attribute
     */
    public void unsetGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRPID$50);
        }
    }
    
    /**
     * Gets the "afterEffect" attribute
     */
    public boolean getAfterEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTEREFFECT$52);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "afterEffect" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAfterEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AFTEREFFECT$52);
            return target;
        }
    }
    
    /**
     * True if has "afterEffect" attribute
     */
    public boolean isSetAfterEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AFTEREFFECT$52) != null;
        }
    }
    
    /**
     * Sets the "afterEffect" attribute
     */
    public void setAfterEffect(boolean afterEffect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTEREFFECT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AFTEREFFECT$52);
            }
            target.setBooleanValue(afterEffect);
        }
    }
    
    /**
     * Sets (as xml) the "afterEffect" attribute
     */
    public void xsetAfterEffect(org.apache.xmlbeans.XmlBoolean afterEffect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AFTEREFFECT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AFTEREFFECT$52);
            }
            target.set(afterEffect);
        }
    }
    
    /**
     * Unsets the "afterEffect" attribute
     */
    public void unsetAfterEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AFTEREFFECT$52);
        }
    }
    
    /**
     * Gets the "nodeType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.Enum getNodeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$54);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nodeType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType xgetNodeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType)get_store().find_attribute_user(NODETYPE$54);
            return target;
        }
    }
    
    /**
     * True if has "nodeType" attribute
     */
    public boolean isSetNodeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NODETYPE$54) != null;
        }
    }
    
    /**
     * Sets the "nodeType" attribute
     */
    public void setNodeType(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType.Enum nodeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODETYPE$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODETYPE$54);
            }
            target.setEnumValue(nodeType);
        }
    }
    
    /**
     * Sets (as xml) the "nodeType" attribute
     */
    public void xsetNodeType(org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType nodeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType)get_store().find_attribute_user(NODETYPE$54);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTimeNodeType)get_store().add_attribute_user(NODETYPE$54);
            }
            target.set(nodeType);
        }
    }
    
    /**
     * Unsets the "nodeType" attribute
     */
    public void unsetNodeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NODETYPE$54);
        }
    }
    
    /**
     * Gets the "nodePh" attribute
     */
    public boolean getNodePh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODEPH$56);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nodePh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNodePh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NODEPH$56);
            return target;
        }
    }
    
    /**
     * True if has "nodePh" attribute
     */
    public boolean isSetNodePh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NODEPH$56) != null;
        }
    }
    
    /**
     * Sets the "nodePh" attribute
     */
    public void setNodePh(boolean nodePh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODEPH$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODEPH$56);
            }
            target.setBooleanValue(nodePh);
        }
    }
    
    /**
     * Sets (as xml) the "nodePh" attribute
     */
    public void xsetNodePh(org.apache.xmlbeans.XmlBoolean nodePh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NODEPH$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NODEPH$56);
            }
            target.set(nodePh);
        }
    }
    
    /**
     * Unsets the "nodePh" attribute
     */
    public void unsetNodePh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NODEPH$56);
        }
    }
}
