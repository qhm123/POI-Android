/*
 * XML Type:  CT_ColorMapping
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ColorMapping(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorMappingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping
{
    
    public CTColorMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName BG1$2 = 
        new javax.xml.namespace.QName("", "bg1");
    private static final javax.xml.namespace.QName TX1$4 = 
        new javax.xml.namespace.QName("", "tx1");
    private static final javax.xml.namespace.QName BG2$6 = 
        new javax.xml.namespace.QName("", "bg2");
    private static final javax.xml.namespace.QName TX2$8 = 
        new javax.xml.namespace.QName("", "tx2");
    private static final javax.xml.namespace.QName ACCENT1$10 = 
        new javax.xml.namespace.QName("", "accent1");
    private static final javax.xml.namespace.QName ACCENT2$12 = 
        new javax.xml.namespace.QName("", "accent2");
    private static final javax.xml.namespace.QName ACCENT3$14 = 
        new javax.xml.namespace.QName("", "accent3");
    private static final javax.xml.namespace.QName ACCENT4$16 = 
        new javax.xml.namespace.QName("", "accent4");
    private static final javax.xml.namespace.QName ACCENT5$18 = 
        new javax.xml.namespace.QName("", "accent5");
    private static final javax.xml.namespace.QName ACCENT6$20 = 
        new javax.xml.namespace.QName("", "accent6");
    private static final javax.xml.namespace.QName HLINK$22 = 
        new javax.xml.namespace.QName("", "hlink");
    private static final javax.xml.namespace.QName FOLHLINK$24 = 
        new javax.xml.namespace.QName("", "folHlink");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "bg1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG1$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bg1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetBg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG1$2);
            return target;
        }
    }
    
    /**
     * Sets the "bg1" attribute
     */
    public void setBg1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum bg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BG1$2);
            }
            target.setEnumValue(bg1);
        }
    }
    
    /**
     * Sets (as xml) the "bg1" attribute
     */
    public void xsetBg1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex bg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG1$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(BG1$2);
            }
            target.set(bg1);
        }
    }
    
    /**
     * Gets the "tx1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getTx1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX1$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tx1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetTx1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(TX1$4);
            return target;
        }
    }
    
    /**
     * Sets the "tx1" attribute
     */
    public void setTx1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum tx1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TX1$4);
            }
            target.setEnumValue(tx1);
        }
    }
    
    /**
     * Sets (as xml) the "tx1" attribute
     */
    public void xsetTx1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex tx1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(TX1$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(TX1$4);
            }
            target.set(tx1);
        }
    }
    
    /**
     * Gets the "bg2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG2$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bg2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetBg2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG2$6);
            return target;
        }
    }
    
    /**
     * Sets the "bg2" attribute
     */
    public void setBg2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum bg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BG2$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BG2$6);
            }
            target.setEnumValue(bg2);
        }
    }
    
    /**
     * Sets (as xml) the "bg2" attribute
     */
    public void xsetBg2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex bg2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(BG2$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(BG2$6);
            }
            target.set(bg2);
        }
    }
    
    /**
     * Gets the "tx2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getTx2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX2$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tx2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetTx2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(TX2$8);
            return target;
        }
    }
    
    /**
     * Sets the "tx2" attribute
     */
    public void setTx2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum tx2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX2$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TX2$8);
            }
            target.setEnumValue(tx2);
        }
    }
    
    /**
     * Sets (as xml) the "tx2" attribute
     */
    public void xsetTx2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex tx2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(TX2$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(TX2$8);
            }
            target.set(tx2);
        }
    }
    
    /**
     * Gets the "accent1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT1$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent1" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT1$10);
            return target;
        }
    }
    
    /**
     * Sets the "accent1" attribute
     */
    public void setAccent1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT1$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT1$10);
            }
            target.setEnumValue(accent1);
        }
    }
    
    /**
     * Sets (as xml) the "accent1" attribute
     */
    public void xsetAccent1(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT1$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT1$10);
            }
            target.set(accent1);
        }
    }
    
    /**
     * Gets the "accent2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT2$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent2" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT2$12);
            return target;
        }
    }
    
    /**
     * Sets the "accent2" attribute
     */
    public void setAccent2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT2$12);
            }
            target.setEnumValue(accent2);
        }
    }
    
    /**
     * Sets (as xml) the "accent2" attribute
     */
    public void xsetAccent2(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT2$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT2$12);
            }
            target.set(accent2);
        }
    }
    
    /**
     * Gets the "accent3" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT3$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent3" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT3$14);
            return target;
        }
    }
    
    /**
     * Sets the "accent3" attribute
     */
    public void setAccent3(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT3$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT3$14);
            }
            target.setEnumValue(accent3);
        }
    }
    
    /**
     * Sets (as xml) the "accent3" attribute
     */
    public void xsetAccent3(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT3$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT3$14);
            }
            target.set(accent3);
        }
    }
    
    /**
     * Gets the "accent4" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT4$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent4" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT4$16);
            return target;
        }
    }
    
    /**
     * Sets the "accent4" attribute
     */
    public void setAccent4(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT4$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT4$16);
            }
            target.setEnumValue(accent4);
        }
    }
    
    /**
     * Sets (as xml) the "accent4" attribute
     */
    public void xsetAccent4(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT4$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT4$16);
            }
            target.set(accent4);
        }
    }
    
    /**
     * Gets the "accent5" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT5$18);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent5" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT5$18);
            return target;
        }
    }
    
    /**
     * Sets the "accent5" attribute
     */
    public void setAccent5(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT5$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT5$18);
            }
            target.setEnumValue(accent5);
        }
    }
    
    /**
     * Sets (as xml) the "accent5" attribute
     */
    public void xsetAccent5(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent5)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT5$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT5$18);
            }
            target.set(accent5);
        }
    }
    
    /**
     * Gets the "accent6" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT6$20);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accent6" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetAccent6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT6$20);
            return target;
        }
    }
    
    /**
     * Sets the "accent6" attribute
     */
    public void setAccent6(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum accent6)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENT6$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENT6$20);
            }
            target.setEnumValue(accent6);
        }
    }
    
    /**
     * Sets (as xml) the "accent6" attribute
     */
    public void xsetAccent6(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex accent6)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(ACCENT6$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(ACCENT6$20);
            }
            target.set(accent6);
        }
    }
    
    /**
     * Gets the "hlink" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getHlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HLINK$22);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hlink" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetHlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(HLINK$22);
            return target;
        }
    }
    
    /**
     * Sets the "hlink" attribute
     */
    public void setHlink(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum hlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HLINK$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HLINK$22);
            }
            target.setEnumValue(hlink);
        }
    }
    
    /**
     * Sets (as xml) the "hlink" attribute
     */
    public void xsetHlink(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex hlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(HLINK$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(HLINK$22);
            }
            target.set(hlink);
        }
    }
    
    /**
     * Gets the "folHlink" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum getFolHlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLHLINK$24);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "folHlink" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex xgetFolHlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(FOLHLINK$24);
            return target;
        }
    }
    
    /**
     * Sets the "folHlink" attribute
     */
    public void setFolHlink(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum folHlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLHLINK$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOLHLINK$24);
            }
            target.setEnumValue(folHlink);
        }
    }
    
    /**
     * Sets (as xml) the "folHlink" attribute
     */
    public void xsetFolHlink(org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex folHlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().find_attribute_user(FOLHLINK$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex)get_store().add_attribute_user(FOLHLINK$24);
            }
            target.set(folHlink);
        }
    }
}
