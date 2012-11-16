/*
 * XML Type:  CT_TLAnimateEffectBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimateEffectBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimateEffectBehaviorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior
{
    
    public CTTLAnimateEffectBehaviorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CBHVR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cBhvr");
    private static final javax.xml.namespace.QName PROGRESS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "progress");
    private static final javax.xml.namespace.QName TRANSITION$4 = 
        new javax.xml.namespace.QName("", "transition");
    private static final javax.xml.namespace.QName FILTER$6 = 
        new javax.xml.namespace.QName("", "filter");
    private static final javax.xml.namespace.QName PRLST$8 = 
        new javax.xml.namespace.QName("", "prLst");
    
    
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
     * Gets the "progress" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant getProgress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().find_element_user(PROGRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "progress" element
     */
    public boolean isSetProgress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROGRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "progress" element
     */
    public void setProgress(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant progress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().find_element_user(PROGRESS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().add_element_user(PROGRESS$2);
            }
            target.set(progress);
        }
    }
    
    /**
     * Appends and returns a new empty "progress" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant addNewProgress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant)get_store().add_element_user(PROGRESS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "progress" element
     */
    public void unsetProgress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROGRESS$2, 0);
        }
    }
    
    /**
     * Gets the "transition" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition.Enum getTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITION$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "transition" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition xgetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition)get_store().find_attribute_user(TRANSITION$4);
            return target;
        }
    }
    
    /**
     * True if has "transition" attribute
     */
    public boolean isSetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSITION$4) != null;
        }
    }
    
    /**
     * Sets the "transition" attribute
     */
    public void setTransition(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition.Enum transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSITION$4);
            }
            target.setEnumValue(transition);
        }
    }
    
    /**
     * Sets (as xml) the "transition" attribute
     */
    public void xsetTransition(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition)get_store().find_attribute_user(TRANSITION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateEffectTransition)get_store().add_attribute_user(TRANSITION$4);
            }
            target.set(transition);
        }
    }
    
    /**
     * Unsets the "transition" attribute
     */
    public void unsetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSITION$4);
        }
    }
    
    /**
     * Gets the "filter" attribute
     */
    public java.lang.String getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILTER$6);
            return target;
        }
    }
    
    /**
     * True if has "filter" attribute
     */
    public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTER$6) != null;
        }
    }
    
    /**
     * Sets the "filter" attribute
     */
    public void setFilter(java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTER$6);
            }
            target.setStringValue(filter);
        }
    }
    
    /**
     * Sets (as xml) the "filter" attribute
     */
    public void xsetFilter(org.apache.xmlbeans.XmlString filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILTER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILTER$6);
            }
            target.set(filter);
        }
    }
    
    /**
     * Unsets the "filter" attribute
     */
    public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTER$6);
        }
    }
    
    /**
     * Gets the "prLst" attribute
     */
    public java.lang.String getPrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRLST$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prLst" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRLST$8);
            return target;
        }
    }
    
    /**
     * True if has "prLst" attribute
     */
    public boolean isSetPrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRLST$8) != null;
        }
    }
    
    /**
     * Sets the "prLst" attribute
     */
    public void setPrLst(java.lang.String prLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRLST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRLST$8);
            }
            target.setStringValue(prLst);
        }
    }
    
    /**
     * Sets (as xml) the "prLst" attribute
     */
    public void xsetPrLst(org.apache.xmlbeans.XmlString prLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRLST$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRLST$8);
            }
            target.set(prLst);
        }
    }
    
    /**
     * Unsets the "prLst" attribute
     */
    public void unsetPrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRLST$8);
        }
    }
}
