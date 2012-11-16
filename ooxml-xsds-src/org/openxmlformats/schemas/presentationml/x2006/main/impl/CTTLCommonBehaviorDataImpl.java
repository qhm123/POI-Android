/*
 * XML Type:  CT_TLCommonBehaviorData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLCommonBehaviorData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLCommonBehaviorDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData
{
    
    public CTTLCommonBehaviorDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cTn");
    private static final javax.xml.namespace.QName TGTEL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tgtEl");
    private static final javax.xml.namespace.QName ATTRNAMELST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "attrNameLst");
    private static final javax.xml.namespace.QName ADDITIVE$6 = 
        new javax.xml.namespace.QName("", "additive");
    private static final javax.xml.namespace.QName ACCUMULATE$8 = 
        new javax.xml.namespace.QName("", "accumulate");
    private static final javax.xml.namespace.QName XFRMTYPE$10 = 
        new javax.xml.namespace.QName("", "xfrmType");
    private static final javax.xml.namespace.QName FROM$12 = 
        new javax.xml.namespace.QName("", "from");
    private static final javax.xml.namespace.QName TO$14 = 
        new javax.xml.namespace.QName("", "to");
    private static final javax.xml.namespace.QName BY$16 = 
        new javax.xml.namespace.QName("", "by");
    private static final javax.xml.namespace.QName RCTX$18 = 
        new javax.xml.namespace.QName("", "rctx");
    private static final javax.xml.namespace.QName OVERRIDE$20 = 
        new javax.xml.namespace.QName("", "override");
    
    
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
     * Gets the "attrNameLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList getAttrNameLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList)get_store().find_element_user(ATTRNAMELST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attrNameLst" element
     */
    public boolean isSetAttrNameLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRNAMELST$4) != 0;
        }
    }
    
    /**
     * Sets the "attrNameLst" element
     */
    public void setAttrNameLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList attrNameLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList)get_store().find_element_user(ATTRNAMELST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList)get_store().add_element_user(ATTRNAMELST$4);
            }
            target.set(attrNameLst);
        }
    }
    
    /**
     * Appends and returns a new empty "attrNameLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList addNewAttrNameLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList)get_store().add_element_user(ATTRNAMELST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "attrNameLst" element
     */
    public void unsetAttrNameLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRNAMELST$4, 0);
        }
    }
    
    /**
     * Gets the "additive" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType.Enum getAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVE$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "additive" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType xgetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType)get_store().find_attribute_user(ADDITIVE$6);
            return target;
        }
    }
    
    /**
     * True if has "additive" attribute
     */
    public boolean isSetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDITIVE$6) != null;
        }
    }
    
    /**
     * Sets the "additive" attribute
     */
    public void setAdditive(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType.Enum additive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDITIVE$6);
            }
            target.setEnumValue(additive);
        }
    }
    
    /**
     * Sets (as xml) the "additive" attribute
     */
    public void xsetAdditive(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType additive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType)get_store().find_attribute_user(ADDITIVE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAdditiveType)get_store().add_attribute_user(ADDITIVE$6);
            }
            target.set(additive);
        }
    }
    
    /**
     * Unsets the "additive" attribute
     */
    public void unsetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDITIVE$6);
        }
    }
    
    /**
     * Gets the "accumulate" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType.Enum getAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCUMULATE$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accumulate" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType xgetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType)get_store().find_attribute_user(ACCUMULATE$8);
            return target;
        }
    }
    
    /**
     * True if has "accumulate" attribute
     */
    public boolean isSetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCUMULATE$8) != null;
        }
    }
    
    /**
     * Sets the "accumulate" attribute
     */
    public void setAccumulate(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType.Enum accumulate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCUMULATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCUMULATE$8);
            }
            target.setEnumValue(accumulate);
        }
    }
    
    /**
     * Sets (as xml) the "accumulate" attribute
     */
    public void xsetAccumulate(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType accumulate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType)get_store().find_attribute_user(ACCUMULATE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorAccumulateType)get_store().add_attribute_user(ACCUMULATE$8);
            }
            target.set(accumulate);
        }
    }
    
    /**
     * Unsets the "accumulate" attribute
     */
    public void unsetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCUMULATE$8);
        }
    }
    
    /**
     * Gets the "xfrmType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType.Enum getXfrmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFRMTYPE$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "xfrmType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType xgetXfrmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType)get_store().find_attribute_user(XFRMTYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "xfrmType" attribute
     */
    public boolean isSetXfrmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XFRMTYPE$10) != null;
        }
    }
    
    /**
     * Sets the "xfrmType" attribute
     */
    public void setXfrmType(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType.Enum xfrmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFRMTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XFRMTYPE$10);
            }
            target.setEnumValue(xfrmType);
        }
    }
    
    /**
     * Sets (as xml) the "xfrmType" attribute
     */
    public void xsetXfrmType(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType xfrmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType)get_store().find_attribute_user(XFRMTYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorTransformType)get_store().add_attribute_user(XFRMTYPE$10);
            }
            target.set(xfrmType);
        }
    }
    
    /**
     * Unsets the "xfrmType" attribute
     */
    public void unsetXfrmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XFRMTYPE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$12);
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
            return get_store().find_attribute_user(FROM$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$12);
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
            get_store().remove_attribute(FROM$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$14);
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
            return get_store().find_attribute_user(TO$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$14);
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
            get_store().remove_attribute(TO$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$16);
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
            return get_store().find_attribute_user(BY$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BY$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BY$16);
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
            get_store().remove_attribute(BY$16);
        }
    }
    
    /**
     * Gets the "rctx" attribute
     */
    public java.lang.String getRctx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCTX$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rctx" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRctx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RCTX$18);
            return target;
        }
    }
    
    /**
     * True if has "rctx" attribute
     */
    public boolean isSetRctx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RCTX$18) != null;
        }
    }
    
    /**
     * Sets the "rctx" attribute
     */
    public void setRctx(java.lang.String rctx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCTX$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCTX$18);
            }
            target.setStringValue(rctx);
        }
    }
    
    /**
     * Sets (as xml) the "rctx" attribute
     */
    public void xsetRctx(org.apache.xmlbeans.XmlString rctx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RCTX$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RCTX$18);
            }
            target.set(rctx);
        }
    }
    
    /**
     * Unsets the "rctx" attribute
     */
    public void unsetRctx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RCTX$18);
        }
    }
    
    /**
     * Gets the "override" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType.Enum getOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDE$20);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "override" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType xgetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType)get_store().find_attribute_user(OVERRIDE$20);
            return target;
        }
    }
    
    /**
     * True if has "override" attribute
     */
    public boolean isSetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OVERRIDE$20) != null;
        }
    }
    
    /**
     * Sets the "override" attribute
     */
    public void setOverride(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType.Enum override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERRIDE$20);
            }
            target.setEnumValue(override);
        }
    }
    
    /**
     * Sets (as xml) the "override" attribute
     */
    public void xsetOverride(org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType)get_store().find_attribute_user(OVERRIDE$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLBehaviorOverrideType)get_store().add_attribute_user(OVERRIDE$20);
            }
            target.set(override);
        }
    }
    
    /**
     * Unsets the "override" attribute
     */
    public void unsetOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OVERRIDE$20);
        }
    }
}
