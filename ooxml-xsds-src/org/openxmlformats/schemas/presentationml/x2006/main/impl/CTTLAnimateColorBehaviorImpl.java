/*
 * XML Type:  CT_TLAnimateColorBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimateColorBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimateColorBehaviorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior
{
    
    public CTTLAnimateColorBehaviorImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CLRSPC$8 = 
        new javax.xml.namespace.QName("", "clrSpc");
    private static final javax.xml.namespace.QName DIR$10 = 
        new javax.xml.namespace.QName("", "dir");
    
    
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform)get_store().find_element_user(BY$2, 0);
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
    public void setBy(org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform)get_store().find_element_user(BY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform)get_store().add_element_user(BY$2);
            }
            target.set(by);
        }
    }
    
    /**
     * Appends and returns a new empty "by" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform addNewBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLByAnimateColorTransform)get_store().add_element_user(BY$2);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(FROM$4, 0);
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
    public void setFrom(org.openxmlformats.schemas.drawingml.x2006.main.CTColor from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(FROM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(FROM$4);
            }
            target.set(from);
        }
    }
    
    /**
     * Appends and returns a new empty "from" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(FROM$4);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(TO$6, 0);
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
    public void setTo(org.openxmlformats.schemas.drawingml.x2006.main.CTColor to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(TO$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(TO$6);
            }
            target.set(to);
        }
    }
    
    /**
     * Appends and returns a new empty "to" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(TO$6);
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
     * Gets the "clrSpc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace.Enum getClrSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLRSPC$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clrSpc" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace xgetClrSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace)get_store().find_attribute_user(CLRSPC$8);
            return target;
        }
    }
    
    /**
     * True if has "clrSpc" attribute
     */
    public boolean isSetClrSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLRSPC$8) != null;
        }
    }
    
    /**
     * Sets the "clrSpc" attribute
     */
    public void setClrSpc(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace.Enum clrSpc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLRSPC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLRSPC$8);
            }
            target.setEnumValue(clrSpc);
        }
    }
    
    /**
     * Sets (as xml) the "clrSpc" attribute
     */
    public void xsetClrSpc(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace clrSpc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace)get_store().find_attribute_user(CLRSPC$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorSpace)get_store().add_attribute_user(CLRSPC$8);
            }
            target.set(clrSpc);
        }
    }
    
    /**
     * Unsets the "clrSpc" attribute
     */
    public void unsetClrSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLRSPC$8);
        }
    }
    
    /**
     * Gets the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection.Enum getDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dir" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection xgetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection)get_store().find_attribute_user(DIR$10);
            return target;
        }
    }
    
    /**
     * True if has "dir" attribute
     */
    public boolean isSetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIR$10) != null;
        }
    }
    
    /**
     * Sets the "dir" attribute
     */
    public void setDir(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection.Enum dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$10);
            }
            target.setEnumValue(dir);
        }
    }
    
    /**
     * Sets (as xml) the "dir" attribute
     */
    public void xsetDir(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection dir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection)get_store().find_attribute_user(DIR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateColorDirection)get_store().add_attribute_user(DIR$10);
            }
            target.set(dir);
        }
    }
    
    /**
     * Unsets the "dir" attribute
     */
    public void unsetDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIR$10);
        }
    }
}
