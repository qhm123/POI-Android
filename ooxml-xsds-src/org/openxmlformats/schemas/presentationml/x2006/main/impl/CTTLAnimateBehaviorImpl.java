/*
 * XML Type:  CT_TLAnimateBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimateBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimateBehaviorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior
{
    
    public CTTLAnimateBehaviorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CBHVR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cBhvr");
    private static final javax.xml.namespace.QName TAVLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tavLst");
    private static final javax.xml.namespace.QName BY$4 = 
        new javax.xml.namespace.QName("", "by");
    private static final javax.xml.namespace.QName FROM$6 = 
        new javax.xml.namespace.QName("", "from");
    private static final javax.xml.namespace.QName TO$8 = 
        new javax.xml.namespace.QName("", "to");
    private static final javax.xml.namespace.QName CALCMODE$10 = 
        new javax.xml.namespace.QName("", "calcmode");
    private static final javax.xml.namespace.QName VALUETYPE$12 = 
        new javax.xml.namespace.QName("", "valueType");
    
    
    /**
     * Gets the "cBhvr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData getCBhvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().find_element_user(CBHVR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cBhvr" element
     */
    public void setCBhvr(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData cBhvr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().find_element_user(CBHVR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().add_element_user(CBHVR$0);
            }
            target.set(cBhvr);
        }
    }
    
    /**
     * Appends and returns a new empty "cBhvr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData addNewCBhvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().add_element_user(CBHVR$0);
            return target;
        }
    }
    
    /**
     * Gets the "tavLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList getTavLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList)get_store().find_element_user(TAVLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tavLst" element
     */
    public boolean isSetTavLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAVLST$2) != 0;
        }
    }
    
    /**
     * Sets the "tavLst" element
     */
    public void setTavLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList tavLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList)get_store().find_element_user(TAVLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList)get_store().add_element_user(TAVLST$2);
            }
            target.set(tavLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tavLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList addNewTavLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeAnimateValueList)get_store().add_element_user(TAVLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tavLst" element
     */
    public void unsetTavLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAVLST$2, 0);
        }
    }
    
    /**
     * Gets the "by" attribute
     */
    public java.lang.String getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "by" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$4);
            return target;
        }
    }
    
    /**
     * True if has "by" attribute
     */
    public boolean isSetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BY$4) != null;
        }
    }
    
    /**
     * Sets the "by" attribute
     */
    public void setBy(java.lang.String by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BY$4);
            }
            target.setStringValue(by);
        }
    }
    
    /**
     * Sets (as xml) the "by" attribute
     */
    public void xsetBy(org.apache.xmlbeans.XmlString by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BY$4);
            }
            target.set(by);
        }
    }
    
    /**
     * Unsets the "by" attribute
     */
    public void unsetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BY$4);
        }
    }
    
    /**
     * Gets the "from" attribute
     */
    public java.lang.String getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "from" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$6);
            return target;
        }
    }
    
    /**
     * True if has "from" attribute
     */
    public boolean isSetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FROM$6) != null;
        }
    }
    
    /**
     * Sets the "from" attribute
     */
    public void setFrom(java.lang.String from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$6);
            }
            target.setStringValue(from);
        }
    }
    
    /**
     * Sets (as xml) the "from" attribute
     */
    public void xsetFrom(org.apache.xmlbeans.XmlString from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$6);
            }
            target.set(from);
        }
    }
    
    /**
     * Unsets the "from" attribute
     */
    public void unsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FROM$6);
        }
    }
    
    /**
     * Gets the "to" attribute
     */
    public java.lang.String getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "to" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$8);
            return target;
        }
    }
    
    /**
     * True if has "to" attribute
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TO$8) != null;
        }
    }
    
    /**
     * Sets the "to" attribute
     */
    public void setTo(java.lang.String to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$8);
            }
            target.setStringValue(to);
        }
    }
    
    /**
     * Sets (as xml) the "to" attribute
     */
    public void xsetTo(org.apache.xmlbeans.XmlString to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$8);
            }
            target.set(to);
        }
    }
    
    /**
     * Unsets the "to" attribute
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TO$8);
        }
    }
    
    /**
     * Gets the "calcmode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode.Enum getCalcmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "calcmode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode xgetCalcmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode)get_store().find_attribute_user(CALCMODE$10);
            return target;
        }
    }
    
    /**
     * True if has "calcmode" attribute
     */
    public boolean isSetCalcmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCMODE$10) != null;
        }
    }
    
    /**
     * Sets the "calcmode" attribute
     */
    public void setCalcmode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode.Enum calcmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCMODE$10);
            }
            target.setEnumValue(calcmode);
        }
    }
    
    /**
     * Sets (as xml) the "calcmode" attribute
     */
    public void xsetCalcmode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode calcmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode)get_store().find_attribute_user(CALCMODE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorCalcMode)get_store().add_attribute_user(CALCMODE$10);
            }
            target.set(calcmode);
        }
    }
    
    /**
     * Unsets the "calcmode" attribute
     */
    public void unsetCalcmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCMODE$10);
        }
    }
    
    /**
     * Gets the "valueType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType.Enum getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType xgetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType)get_store().find_attribute_user(VALUETYPE$12);
            return target;
        }
    }
    
    /**
     * True if has "valueType" attribute
     */
    public boolean isSetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUETYPE$12) != null;
        }
    }
    
    /**
     * Sets the "valueType" attribute
     */
    public void setValueType(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType.Enum valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$12);
            }
            target.setEnumValue(valueType);
        }
    }
    
    /**
     * Sets (as xml) the "valueType" attribute
     */
    public void xsetValueType(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType valueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType)get_store().find_attribute_user(VALUETYPE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateBehaviorValueType)get_store().add_attribute_user(VALUETYPE$12);
            }
            target.set(valueType);
        }
    }
    
    /**
     * Unsets the "valueType" attribute
     */
    public void unsetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUETYPE$12);
        }
    }
}
