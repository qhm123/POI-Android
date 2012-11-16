/*
 * XML Type:  CT_ColorSchemeMapping
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_ColorSchemeMapping(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorSchemeMappingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping
{
    
    public CTColorSchemeMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BG1$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bg1");
    private static final javax.xml.namespace.QName T1$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "t1");
    private static final javax.xml.namespace.QName BG2$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bg2");
    private static final javax.xml.namespace.QName T2$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "t2");
    private static final javax.xml.namespace.QName ACCENT1$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent1");
    private static final javax.xml.namespace.QName ACCENT2$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent2");
    private static final javax.xml.namespace.QName ACCENT3$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent3");
    private static final javax.xml.namespace.QName ACCENT4$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent4");
    private static final javax.xml.namespace.QName ACCENT5$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent5");
    private static final javax.xml.namespace.QName ACCENT6$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "accent6");
    private static final javax.xml.namespace.QName HYPERLINK$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hyperlink");
    private static final javax.xml.namespace.QName FOLLOWEDHYPERLINK$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "followedHyperlink");
    
    
    /**
     * Gets the "bg1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG1$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bg1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG1$0);
            return target;
        }
    }
    
    /**
     * True if has "bg1" attribute
     */
    public boolean isSetBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BG1$0) != null;
        }
    }
    
    /**
     * Sets the "bg1" attribute
     */
    public void setBg1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum bg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BG1$0);
            }
            target.setEnumValue(bg1);
        }
    }
    
    /**
     * Sets (as xml) the "bg1" attribute
     */
    public void xsetBg1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex bg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG1$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(BG1$0);
            }
            target.set(bg1);
        }
    }
    
    /**
     * Unsets the "bg1" attribute
     */
    public void unsetBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BG1$0);
        }
    }
    
    /**
     * Gets the "t1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T1$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(T1$2);
            return target;
        }
    }
    
    /**
     * True if has "t1" attribute
     */
    public boolean isSetT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(T1$2) != null;
        }
    }
    
    /**
     * Sets the "t1" attribute
     */
    public void setT1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum t1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T1$2);
            }
            target.setEnumValue(t1);
        }
    }
    
    /**
     * Sets (as xml) the "t1" attribute
     */
    public void xsetT1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex t1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(T1$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(T1$2);
            }
            target.set(t1);
        }
    }
    
    /**
     * Unsets the "t1" attribute
     */
    public void unsetT1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(T1$2);
        }
    }
    
    /**
     * Gets the "bg2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG2$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bg2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG2$4);
            return target;
        }
    }
    
    /**
     * True if has "bg2" attribute
     */
    public boolean isSetBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BG2$4) != null;
        }
    }
    
    /**
     * Sets the "bg2" attribute
     */
    public void setBg2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum bg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG2$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BG2$4);
            }
            target.setEnumValue(bg2);
        }
    }
    
    /**
     * Sets (as xml) the "bg2" attribute
     */
    public void xsetBg2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex bg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG2$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(BG2$4);
            }
            target.set(bg2);
        }
    }
    
    /**
     * Unsets the "bg2" attribute
     */
    public void unsetBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BG2$4);
        }
    }
    
    /**
     * Gets the "t2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T2$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(T2$6);
            return target;
        }
    }
    
    /**
     * True if has "t2" attribute
     */
    public boolean isSetT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(T2$6) != null;
        }
    }
    
    /**
     * Sets the "t2" attribute
     */
    public void setT2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum t2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T2$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T2$6);
            }
            target.setEnumValue(t2);
        }
    }
    
    /**
     * Sets (as xml) the "t2" attribute
     */
    public void xsetT2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex t2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(T2$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(T2$6);
            }
            target.set(t2);
        }
    }
    
    /**
     * Unsets the "t2" attribute
     */
    public void unsetT2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(T2$6);
        }
    }
    
    /**
     * Gets the "accent1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT1$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent1" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT1$8);
            return target;
        }
    }
    
    /**
     * True if has "accent1" attribute
     */
    public boolean isSetAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT1$8) != null;
        }
    }
    
    /**
     * Sets the "accent1" attribute
     */
    public void setAccent1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT1$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT1$8);
            }
            target.setEnumValue(accent1);
        }
    }
    
    /**
     * Sets (as xml) the "accent1" attribute
     */
    public void xsetAccent1(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT1$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT1$8);
            }
            target.set(accent1);
        }
    }
    
    /**
     * Unsets the "accent1" attribute
     */
    public void unsetAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT1$8);
        }
    }
    
    /**
     * Gets the "accent2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT2$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent2" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT2$10);
            return target;
        }
    }
    
    /**
     * True if has "accent2" attribute
     */
    public boolean isSetAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT2$10) != null;
        }
    }
    
    /**
     * Sets the "accent2" attribute
     */
    public void setAccent2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT2$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT2$10);
            }
            target.setEnumValue(accent2);
        }
    }
    
    /**
     * Sets (as xml) the "accent2" attribute
     */
    public void xsetAccent2(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT2$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT2$10);
            }
            target.set(accent2);
        }
    }
    
    /**
     * Unsets the "accent2" attribute
     */
    public void unsetAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT2$10);
        }
    }
    
    /**
     * Gets the "accent3" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT3$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent3" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT3$12);
            return target;
        }
    }
    
    /**
     * True if has "accent3" attribute
     */
    public boolean isSetAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT3$12) != null;
        }
    }
    
    /**
     * Sets the "accent3" attribute
     */
    public void setAccent3(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT3$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT3$12);
            }
            target.setEnumValue(accent3);
        }
    }
    
    /**
     * Sets (as xml) the "accent3" attribute
     */
    public void xsetAccent3(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT3$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT3$12);
            }
            target.set(accent3);
        }
    }
    
    /**
     * Unsets the "accent3" attribute
     */
    public void unsetAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT3$12);
        }
    }
    
    /**
     * Gets the "accent4" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT4$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent4" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT4$14);
            return target;
        }
    }
    
    /**
     * True if has "accent4" attribute
     */
    public boolean isSetAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT4$14) != null;
        }
    }
    
    /**
     * Sets the "accent4" attribute
     */
    public void setAccent4(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT4$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT4$14);
            }
            target.setEnumValue(accent4);
        }
    }
    
    /**
     * Sets (as xml) the "accent4" attribute
     */
    public void xsetAccent4(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT4$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT4$14);
            }
            target.set(accent4);
        }
    }
    
    /**
     * Unsets the "accent4" attribute
     */
    public void unsetAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT4$14);
        }
    }
    
    /**
     * Gets the "accent5" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT5$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent5" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT5$16);
            return target;
        }
    }
    
    /**
     * True if has "accent5" attribute
     */
    public boolean isSetAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT5$16) != null;
        }
    }
    
    /**
     * Sets the "accent5" attribute
     */
    public void setAccent5(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT5$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT5$16);
            }
            target.setEnumValue(accent5);
        }
    }
    
    /**
     * Sets (as xml) the "accent5" attribute
     */
    public void xsetAccent5(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT5$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT5$16);
            }
            target.set(accent5);
        }
    }
    
    /**
     * Unsets the "accent5" attribute
     */
    public void unsetAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT5$16);
        }
    }
    
    /**
     * Gets the "accent6" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT6$18);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent6" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT6$18);
            return target;
        }
    }
    
    /**
     * True if has "accent6" attribute
     */
    public boolean isSetAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENT6$18) != null;
        }
    }
    
    /**
     * Sets the "accent6" attribute
     */
    public void setAccent6(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum accent6)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT6$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT6$18);
            }
            target.setEnumValue(accent6);
        }
    }
    
    /**
     * Sets (as xml) the "accent6" attribute
     */
    public void xsetAccent6(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex accent6)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT6$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT6$18);
            }
            target.set(accent6);
        }
    }
    
    /**
     * Unsets the "accent6" attribute
     */
    public void unsetAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENT6$18);
        }
    }
    
    /**
     * Gets the "hyperlink" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HYPERLINK$20);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hyperlink" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(HYPERLINK$20);
            return target;
        }
    }
    
    /**
     * True if has "hyperlink" attribute
     */
    public boolean isSetHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HYPERLINK$20) != null;
        }
    }
    
    /**
     * Sets the "hyperlink" attribute
     */
    public void setHyperlink(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum hyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HYPERLINK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HYPERLINK$20);
            }
            target.setEnumValue(hyperlink);
        }
    }
    
    /**
     * Sets (as xml) the "hyperlink" attribute
     */
    public void xsetHyperlink(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex hyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(HYPERLINK$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(HYPERLINK$20);
            }
            target.set(hyperlink);
        }
    }
    
    /**
     * Unsets the "hyperlink" attribute
     */
    public void unsetHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HYPERLINK$20);
        }
    }
    
    /**
     * Gets the "followedHyperlink" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum getFollowedHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLLOWEDHYPERLINK$22);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "followedHyperlink" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex xgetFollowedHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(FOLLOWEDHYPERLINK$22);
            return target;
        }
    }
    
    /**
     * True if has "followedHyperlink" attribute
     */
    public boolean isSetFollowedHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOLLOWEDHYPERLINK$22) != null;
        }
    }
    
    /**
     * Sets the "followedHyperlink" attribute
     */
    public void setFollowedHyperlink(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex.Enum followedHyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLLOWEDHYPERLINK$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOLLOWEDHYPERLINK$22);
            }
            target.setEnumValue(followedHyperlink);
        }
    }
    
    /**
     * Sets (as xml) the "followedHyperlink" attribute
     */
    public void xsetFollowedHyperlink(org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex followedHyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(FOLLOWEDHYPERLINK$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(FOLLOWEDHYPERLINK$22);
            }
            target.set(followedHyperlink);
        }
    }
    
    /**
     * Unsets the "followedHyperlink" attribute
     */
    public void unsetFollowedHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOLLOWEDHYPERLINK$22);
        }
    }
}
