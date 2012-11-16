/*
 * XML Type:  CT_TLAnimateScaleBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimateScaleBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimateScaleBehaviorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior
{
    
    public CTTLAnimateScaleBehaviorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CBHVR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cBhvr");
    private static final javax.xml.namespace.QName BY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "by");
    private static final javax.xml.namespace.QName FROM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "from");
    private static final javax.xml.namespace.QName TO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "to");
    private static final javax.xml.namespace.QName ZOOMCONTENTS$8 = 
        new javax.xml.namespace.QName("", "zoomContents");
    
    
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
     * Gets the "by" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(BY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "by" element
     */
    public boolean isSetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BY$2) != 0;
        }
    }
    
    /**
     * Sets the "by" element
     */
    public void setBy(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(BY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(BY$2);
            }
            target.set(by);
        }
    }
    
    /**
     * Appends and returns a new empty "by" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(BY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "by" element
     */
    public void unsetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BY$2, 0);
        }
    }
    
    /**
     * Gets the "from" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(FROM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "from" element
     */
    public boolean isSetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROM$4) != 0;
        }
    }
    
    /**
     * Sets the "from" element
     */
    public void setFrom(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(FROM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(FROM$4);
            }
            target.set(from);
        }
    }
    
    /**
     * Appends and returns a new empty "from" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(FROM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "from" element
     */
    public void unsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROM$4, 0);
        }
    }
    
    /**
     * Gets the "to" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(TO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "to" element
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TO$6) != 0;
        }
    }
    
    /**
     * Sets the "to" element
     */
    public void setTo(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(TO$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(TO$6);
            }
            target.set(to);
        }
    }
    
    /**
     * Appends and returns a new empty "to" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(TO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "to" element
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TO$6, 0);
        }
    }
    
    /**
     * Gets the "zoomContents" attribute
     */
    public boolean getZoomContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMCONTENTS$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "zoomContents" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetZoomContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMCONTENTS$8);
            return target;
        }
    }
    
    /**
     * True if has "zoomContents" attribute
     */
    public boolean isSetZoomContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZOOMCONTENTS$8) != null;
        }
    }
    
    /**
     * Sets the "zoomContents" attribute
     */
    public void setZoomContents(boolean zoomContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZOOMCONTENTS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZOOMCONTENTS$8);
            }
            target.setBooleanValue(zoomContents);
        }
    }
    
    /**
     * Sets (as xml) the "zoomContents" attribute
     */
    public void xsetZoomContents(org.apache.xmlbeans.XmlBoolean zoomContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZOOMCONTENTS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ZOOMCONTENTS$8);
            }
            target.set(zoomContents);
        }
    }
    
    /**
     * Unsets the "zoomContents" attribute
     */
    public void unsetZoomContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZOOMCONTENTS$8);
        }
    }
}
