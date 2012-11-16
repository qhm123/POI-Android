/*
 * XML Type:  CT_TLTimeNodeSequence
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeNodeSequence(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeNodeSequenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence
{
    
    public CTTLTimeNodeSequenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cTn");
    private static final javax.xml.namespace.QName PREVCONDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "prevCondLst");
    private static final javax.xml.namespace.QName NEXTCONDLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nextCondLst");
    private static final javax.xml.namespace.QName CONCURRENT$6 = 
        new javax.xml.namespace.QName("", "concurrent");
    private static final javax.xml.namespace.QName PREVAC$8 = 
        new javax.xml.namespace.QName("", "prevAc");
    private static final javax.xml.namespace.QName NEXTAC$10 = 
        new javax.xml.namespace.QName("", "nextAc");
    
    
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
     * Gets the "prevCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getPrevCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(PREVCONDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prevCondLst" element
     */
    public boolean isSetPrevCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVCONDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "prevCondLst" element
     */
    public void setPrevCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList prevCondLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(PREVCONDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(PREVCONDLST$2);
            }
            target.set(prevCondLst);
        }
    }
    
    /**
     * Appends and returns a new empty "prevCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewPrevCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(PREVCONDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "prevCondLst" element
     */
    public void unsetPrevCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVCONDLST$2, 0);
        }
    }
    
    /**
     * Gets the "nextCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList getNextCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(NEXTCONDLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nextCondLst" element
     */
    public boolean isSetNextCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTCONDLST$4) != 0;
        }
    }
    
    /**
     * Sets the "nextCondLst" element
     */
    public void setNextCondLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList nextCondLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().find_element_user(NEXTCONDLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(NEXTCONDLST$4);
            }
            target.set(nextCondLst);
        }
    }
    
    /**
     * Appends and returns a new empty "nextCondLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList addNewNextCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeConditionList)get_store().add_element_user(NEXTCONDLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "nextCondLst" element
     */
    public void unsetNextCondLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTCONDLST$4, 0);
        }
    }
    
    /**
     * Gets the "concurrent" attribute
     */
    public boolean getConcurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENT$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "concurrent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetConcurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONCURRENT$6);
            return target;
        }
    }
    
    /**
     * True if has "concurrent" attribute
     */
    public boolean isSetConcurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCURRENT$6) != null;
        }
    }
    
    /**
     * Sets the "concurrent" attribute
     */
    public void setConcurrent(boolean concurrent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCURRENT$6);
            }
            target.setBooleanValue(concurrent);
        }
    }
    
    /**
     * Sets (as xml) the "concurrent" attribute
     */
    public void xsetConcurrent(org.apache.xmlbeans.XmlBoolean concurrent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONCURRENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONCURRENT$6);
            }
            target.set(concurrent);
        }
    }
    
    /**
     * Unsets the "concurrent" attribute
     */
    public void unsetConcurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCURRENT$6);
        }
    }
    
    /**
     * Gets the "prevAc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType.Enum getPrevAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVAC$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prevAc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType xgetPrevAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType)get_store().find_attribute_user(PREVAC$8);
            return target;
        }
    }
    
    /**
     * True if has "prevAc" attribute
     */
    public boolean isSetPrevAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREVAC$8) != null;
        }
    }
    
    /**
     * Sets the "prevAc" attribute
     */
    public void setPrevAc(org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType.Enum prevAc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVAC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREVAC$8);
            }
            target.setEnumValue(prevAc);
        }
    }
    
    /**
     * Sets (as xml) the "prevAc" attribute
     */
    public void xsetPrevAc(org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType prevAc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType)get_store().find_attribute_user(PREVAC$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLPreviousActionType)get_store().add_attribute_user(PREVAC$8);
            }
            target.set(prevAc);
        }
    }
    
    /**
     * Unsets the "prevAc" attribute
     */
    public void unsetPrevAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREVAC$8);
        }
    }
    
    /**
     * Gets the "nextAc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType.Enum getNextAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTAC$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nextAc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType xgetNextAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType)get_store().find_attribute_user(NEXTAC$10);
            return target;
        }
    }
    
    /**
     * True if has "nextAc" attribute
     */
    public boolean isSetNextAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEXTAC$10) != null;
        }
    }
    
    /**
     * Sets the "nextAc" attribute
     */
    public void setNextAc(org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType.Enum nextAc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTAC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEXTAC$10);
            }
            target.setEnumValue(nextAc);
        }
    }
    
    /**
     * Sets (as xml) the "nextAc" attribute
     */
    public void xsetNextAc(org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType nextAc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType)get_store().find_attribute_user(NEXTAC$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLNextActionType)get_store().add_attribute_user(NEXTAC$10);
            }
            target.set(nextAc);
        }
    }
    
    /**
     * Unsets the "nextAc" attribute
     */
    public void unsetNextAc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEXTAC$10);
        }
    }
}
