/*
 * XML Type:  CT_ShowProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ShowProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTShowPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties
{
    
    public CTShowPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRESENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "present");
    private static final javax.xml.namespace.QName BROWSE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "browse");
    private static final javax.xml.namespace.QName KIOSK$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "kiosk");
    private static final javax.xml.namespace.QName SLDALL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldAll");
    private static final javax.xml.namespace.QName SLDRG$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldRg");
    private static final javax.xml.namespace.QName CUSTSHOW$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custShow");
    private static final javax.xml.namespace.QName PENCLR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "penClr");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName LOOP$16 = 
        new javax.xml.namespace.QName("", "loop");
    private static final javax.xml.namespace.QName SHOWNARRATION$18 = 
        new javax.xml.namespace.QName("", "showNarration");
    private static final javax.xml.namespace.QName SHOWANIMATION$20 = 
        new javax.xml.namespace.QName("", "showAnimation");
    private static final javax.xml.namespace.QName USETIMINGS$22 = 
        new javax.xml.namespace.QName("", "useTimings");
    
    
    /**
     * Gets the "present" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getPresent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(PRESENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "present" element
     */
    public boolean isSetPresent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENT$0) != 0;
        }
    }
    
    /**
     * Sets the "present" element
     */
    public void setPresent(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty present)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(PRESENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(PRESENT$0);
            }
            target.set(present);
        }
    }
    
    /**
     * Appends and returns a new empty "present" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewPresent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(PRESENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "present" element
     */
    public void unsetPresent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENT$0, 0);
        }
    }
    
    /**
     * Gets the "browse" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse getBrowse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse)get_store().find_element_user(BROWSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "browse" element
     */
    public boolean isSetBrowse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BROWSE$2) != 0;
        }
    }
    
    /**
     * Sets the "browse" element
     */
    public void setBrowse(org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse browse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse)get_store().find_element_user(BROWSE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse)get_store().add_element_user(BROWSE$2);
            }
            target.set(browse);
        }
    }
    
    /**
     * Appends and returns a new empty "browse" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse addNewBrowse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoBrowse)get_store().add_element_user(BROWSE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "browse" element
     */
    public void unsetBrowse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BROWSE$2, 0);
        }
    }
    
    /**
     * Gets the "kiosk" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk getKiosk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk)get_store().find_element_user(KIOSK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kiosk" element
     */
    public boolean isSetKiosk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KIOSK$4) != 0;
        }
    }
    
    /**
     * Sets the "kiosk" element
     */
    public void setKiosk(org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk kiosk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk)get_store().find_element_user(KIOSK$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk)get_store().add_element_user(KIOSK$4);
            }
            target.set(kiosk);
        }
    }
    
    /**
     * Appends and returns a new empty "kiosk" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk addNewKiosk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowInfoKiosk)get_store().add_element_user(KIOSK$4);
            return target;
        }
    }
    
    /**
     * Unsets the "kiosk" element
     */
    public void unsetKiosk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KIOSK$4, 0);
        }
    }
    
    /**
     * Gets the "sldAll" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDALL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldAll" element
     */
    public boolean isSetSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDALL$6) != 0;
        }
    }
    
    /**
     * Sets the "sldAll" element
     */
    public void setSldAll(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty sldAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(SLDALL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDALL$6);
            }
            target.set(sldAll);
        }
    }
    
    /**
     * Appends and returns a new empty "sldAll" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(SLDALL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sldAll" element
     */
    public void unsetSldAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDALL$6, 0);
        }
    }
    
    /**
     * Gets the "sldRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange getSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(SLDRG$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldRg" element
     */
    public boolean isSetSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDRG$8) != 0;
        }
    }
    
    /**
     * Sets the "sldRg" element
     */
    public void setSldRg(org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange sldRg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(SLDRG$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(SLDRG$8);
            }
            target.set(sldRg);
        }
    }
    
    /**
     * Appends and returns a new empty "sldRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange addNewSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(SLDRG$8);
            return target;
        }
    }
    
    /**
     * Unsets the "sldRg" element
     */
    public void unsetSldRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDRG$8, 0);
        }
    }
    
    /**
     * Gets the "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId getCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().find_element_user(CUSTSHOW$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custShow" element
     */
    public boolean isSetCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTSHOW$10) != 0;
        }
    }
    
    /**
     * Sets the "custShow" element
     */
    public void setCustShow(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId custShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().find_element_user(CUSTSHOW$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().add_element_user(CUSTSHOW$10);
            }
            target.set(custShow);
        }
    }
    
    /**
     * Appends and returns a new empty "custShow" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId addNewCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowId)get_store().add_element_user(CUSTSHOW$10);
            return target;
        }
    }
    
    /**
     * Unsets the "custShow" element
     */
    public void unsetCustShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTSHOW$10, 0);
        }
    }
    
    /**
     * Gets the "penClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getPenClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(PENCLR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "penClr" element
     */
    public boolean isSetPenClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PENCLR$12) != 0;
        }
    }
    
    /**
     * Sets the "penClr" element
     */
    public void setPenClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor penClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(PENCLR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(PENCLR$12);
            }
            target.set(penClr);
        }
    }
    
    /**
     * Appends and returns a new empty "penClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewPenClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(PENCLR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "penClr" element
     */
    public void unsetPenClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PENCLR$12, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
            return get_store().count_elements(EXTLST$14) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            get_store().remove_element(EXTLST$14, 0);
        }
    }
    
    /**
     * Gets the "loop" attribute
     */
    public boolean getLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOOP$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "loop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOOP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOOP$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "loop" attribute
     */
    public boolean isSetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOOP$16) != null;
        }
    }
    
    /**
     * Sets the "loop" attribute
     */
    public void setLoop(boolean loop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOOP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOOP$16);
            }
            target.setBooleanValue(loop);
        }
    }
    
    /**
     * Sets (as xml) the "loop" attribute
     */
    public void xsetLoop(org.apache.xmlbeans.XmlBoolean loop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOOP$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOOP$16);
            }
            target.set(loop);
        }
    }
    
    /**
     * Unsets the "loop" attribute
     */
    public void unsetLoop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOOP$16);
        }
    }
    
    /**
     * Gets the "showNarration" attribute
     */
    public boolean getShowNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWNARRATION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWNARRATION$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showNarration" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWNARRATION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWNARRATION$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "showNarration" attribute
     */
    public boolean isSetShowNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWNARRATION$18) != null;
        }
    }
    
    /**
     * Sets the "showNarration" attribute
     */
    public void setShowNarration(boolean showNarration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWNARRATION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWNARRATION$18);
            }
            target.setBooleanValue(showNarration);
        }
    }
    
    /**
     * Sets (as xml) the "showNarration" attribute
     */
    public void xsetShowNarration(org.apache.xmlbeans.XmlBoolean showNarration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWNARRATION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWNARRATION$18);
            }
            target.set(showNarration);
        }
    }
    
    /**
     * Unsets the "showNarration" attribute
     */
    public void unsetShowNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWNARRATION$18);
        }
    }
    
    /**
     * Gets the "showAnimation" attribute
     */
    public boolean getShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWANIMATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWANIMATION$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAnimation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWANIMATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWANIMATION$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAnimation" attribute
     */
    public boolean isSetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWANIMATION$20) != null;
        }
    }
    
    /**
     * Sets the "showAnimation" attribute
     */
    public void setShowAnimation(boolean showAnimation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWANIMATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWANIMATION$20);
            }
            target.setBooleanValue(showAnimation);
        }
    }
    
    /**
     * Sets (as xml) the "showAnimation" attribute
     */
    public void xsetShowAnimation(org.apache.xmlbeans.XmlBoolean showAnimation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWANIMATION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWANIMATION$20);
            }
            target.set(showAnimation);
        }
    }
    
    /**
     * Unsets the "showAnimation" attribute
     */
    public void unsetShowAnimation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWANIMATION$20);
        }
    }
    
    /**
     * Gets the "useTimings" attribute
     */
    public boolean getUseTimings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETIMINGS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USETIMINGS$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useTimings" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseTimings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USETIMINGS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USETIMINGS$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "useTimings" attribute
     */
    public boolean isSetUseTimings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USETIMINGS$22) != null;
        }
    }
    
    /**
     * Sets the "useTimings" attribute
     */
    public void setUseTimings(boolean useTimings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETIMINGS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USETIMINGS$22);
            }
            target.setBooleanValue(useTimings);
        }
    }
    
    /**
     * Sets (as xml) the "useTimings" attribute
     */
    public void xsetUseTimings(org.apache.xmlbeans.XmlBoolean useTimings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USETIMINGS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USETIMINGS$22);
            }
            target.set(useTimings);
        }
    }
    
    /**
     * Unsets the "useTimings" attribute
     */
    public void unsetUseTimings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USETIMINGS$22);
        }
    }
}
