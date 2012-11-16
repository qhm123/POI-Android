/*
 * XML Type:  CT_PrintProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_PrintProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTPrintPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties
{
    
    public CTPrintPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PRNWHAT$2 = 
        new javax.xml.namespace.QName("", "prnWhat");
    private static final javax.xml.namespace.QName CLRMODE$4 = 
        new javax.xml.namespace.QName("", "clrMode");
    private static final javax.xml.namespace.QName HIDDENSLIDES$6 = 
        new javax.xml.namespace.QName("", "hiddenSlides");
    private static final javax.xml.namespace.QName SCALETOFITPAPER$8 = 
        new javax.xml.namespace.QName("", "scaleToFitPaper");
    private static final javax.xml.namespace.QName FRAMESLIDES$10 = 
        new javax.xml.namespace.QName("", "frameSlides");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
     * Gets the "prnWhat" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.Enum getPrnWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRNWHAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRNWHAT$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prnWhat" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat xgetPrnWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat)get_store().find_attribute_user(PRNWHAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat)get_default_attribute_value(PRNWHAT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "prnWhat" attribute
     */
    public boolean isSetPrnWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRNWHAT$2) != null;
        }
    }
    
    /**
     * Sets the "prnWhat" attribute
     */
    public void setPrnWhat(org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat.Enum prnWhat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRNWHAT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRNWHAT$2);
            }
            target.setEnumValue(prnWhat);
        }
    }
    
    /**
     * Sets (as xml) the "prnWhat" attribute
     */
    public void xsetPrnWhat(org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat prnWhat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat)get_store().find_attribute_user(PRNWHAT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintWhat)get_store().add_attribute_user(PRNWHAT$2);
            }
            target.set(prnWhat);
        }
    }
    
    /**
     * Unsets the "prnWhat" attribute
     */
    public void unsetPrnWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRNWHAT$2);
        }
    }
    
    /**
     * Gets the "clrMode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode.Enum getClrMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLRMODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLRMODE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clrMode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode xgetClrMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode)get_store().find_attribute_user(CLRMODE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode)get_default_attribute_value(CLRMODE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "clrMode" attribute
     */
    public boolean isSetClrMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLRMODE$4) != null;
        }
    }
    
    /**
     * Sets the "clrMode" attribute
     */
    public void setClrMode(org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode.Enum clrMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLRMODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLRMODE$4);
            }
            target.setEnumValue(clrMode);
        }
    }
    
    /**
     * Sets (as xml) the "clrMode" attribute
     */
    public void xsetClrMode(org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode clrMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode)get_store().find_attribute_user(CLRMODE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPrintColorMode)get_store().add_attribute_user(CLRMODE$4);
            }
            target.set(clrMode);
        }
    }
    
    /**
     * Unsets the "clrMode" attribute
     */
    public void unsetClrMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLRMODE$4);
        }
    }
    
    /**
     * Gets the "hiddenSlides" attribute
     */
    public boolean getHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENSLIDES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENSLIDES$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenSlides" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENSLIDES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENSLIDES$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenSlides" attribute
     */
    public boolean isSetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENSLIDES$6) != null;
        }
    }
    
    /**
     * Sets the "hiddenSlides" attribute
     */
    public void setHiddenSlides(boolean hiddenSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENSLIDES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENSLIDES$6);
            }
            target.setBooleanValue(hiddenSlides);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenSlides" attribute
     */
    public void xsetHiddenSlides(org.apache.xmlbeans.XmlBoolean hiddenSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENSLIDES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENSLIDES$6);
            }
            target.set(hiddenSlides);
        }
    }
    
    /**
     * Unsets the "hiddenSlides" attribute
     */
    public void unsetHiddenSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENSLIDES$6);
        }
    }
    
    /**
     * Gets the "scaleToFitPaper" attribute
     */
    public boolean getScaleToFitPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALETOFITPAPER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALETOFITPAPER$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaleToFitPaper" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetScaleToFitPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALETOFITPAPER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SCALETOFITPAPER$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "scaleToFitPaper" attribute
     */
    public boolean isSetScaleToFitPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALETOFITPAPER$8) != null;
        }
    }
    
    /**
     * Sets the "scaleToFitPaper" attribute
     */
    public void setScaleToFitPaper(boolean scaleToFitPaper)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALETOFITPAPER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALETOFITPAPER$8);
            }
            target.setBooleanValue(scaleToFitPaper);
        }
    }
    
    /**
     * Sets (as xml) the "scaleToFitPaper" attribute
     */
    public void xsetScaleToFitPaper(org.apache.xmlbeans.XmlBoolean scaleToFitPaper)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALETOFITPAPER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SCALETOFITPAPER$8);
            }
            target.set(scaleToFitPaper);
        }
    }
    
    /**
     * Unsets the "scaleToFitPaper" attribute
     */
    public void unsetScaleToFitPaper()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALETOFITPAPER$8);
        }
    }
    
    /**
     * Gets the "frameSlides" attribute
     */
    public boolean getFrameSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMESLIDES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAMESLIDES$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "frameSlides" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFrameSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FRAMESLIDES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FRAMESLIDES$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "frameSlides" attribute
     */
    public boolean isSetFrameSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAMESLIDES$10) != null;
        }
    }
    
    /**
     * Sets the "frameSlides" attribute
     */
    public void setFrameSlides(boolean frameSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMESLIDES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAMESLIDES$10);
            }
            target.setBooleanValue(frameSlides);
        }
    }
    
    /**
     * Sets (as xml) the "frameSlides" attribute
     */
    public void xsetFrameSlides(org.apache.xmlbeans.XmlBoolean frameSlides)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FRAMESLIDES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FRAMESLIDES$10);
            }
            target.set(frameSlides);
        }
    }
    
    /**
     * Unsets the "frameSlides" attribute
     */
    public void unsetFrameSlides()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAMESLIDES$10);
        }
    }
}
