/*
 * XML Type:  CT_CustomWorkbookView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomWorkbookView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomWorkbookViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookView
{
    
    public CTCustomWorkbookViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName GUID$4 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName AUTOUPDATE$6 = 
        new javax.xml.namespace.QName("", "autoUpdate");
    private static final javax.xml.namespace.QName MERGEINTERVAL$8 = 
        new javax.xml.namespace.QName("", "mergeInterval");
    private static final javax.xml.namespace.QName CHANGESSAVEDWIN$10 = 
        new javax.xml.namespace.QName("", "changesSavedWin");
    private static final javax.xml.namespace.QName ONLYSYNC$12 = 
        new javax.xml.namespace.QName("", "onlySync");
    private static final javax.xml.namespace.QName PERSONALVIEW$14 = 
        new javax.xml.namespace.QName("", "personalView");
    private static final javax.xml.namespace.QName INCLUDEPRINTSETTINGS$16 = 
        new javax.xml.namespace.QName("", "includePrintSettings");
    private static final javax.xml.namespace.QName INCLUDEHIDDENROWCOL$18 = 
        new javax.xml.namespace.QName("", "includeHiddenRowCol");
    private static final javax.xml.namespace.QName MAXIMIZED$20 = 
        new javax.xml.namespace.QName("", "maximized");
    private static final javax.xml.namespace.QName MINIMIZED$22 = 
        new javax.xml.namespace.QName("", "minimized");
    private static final javax.xml.namespace.QName SHOWHORIZONTALSCROLL$24 = 
        new javax.xml.namespace.QName("", "showHorizontalScroll");
    private static final javax.xml.namespace.QName SHOWVERTICALSCROLL$26 = 
        new javax.xml.namespace.QName("", "showVerticalScroll");
    private static final javax.xml.namespace.QName SHOWSHEETTABS$28 = 
        new javax.xml.namespace.QName("", "showSheetTabs");
    private static final javax.xml.namespace.QName XWINDOW$30 = 
        new javax.xml.namespace.QName("", "xWindow");
    private static final javax.xml.namespace.QName YWINDOW$32 = 
        new javax.xml.namespace.QName("", "yWindow");
    private static final javax.xml.namespace.QName WINDOWWIDTH$34 = 
        new javax.xml.namespace.QName("", "windowWidth");
    private static final javax.xml.namespace.QName WINDOWHEIGHT$36 = 
        new javax.xml.namespace.QName("", "windowHeight");
    private static final javax.xml.namespace.QName TABRATIO$38 = 
        new javax.xml.namespace.QName("", "tabRatio");
    private static final javax.xml.namespace.QName ACTIVESHEETID$40 = 
        new javax.xml.namespace.QName("", "activeSheetId");
    private static final javax.xml.namespace.QName SHOWFORMULABAR$42 = 
        new javax.xml.namespace.QName("", "showFormulaBar");
    private static final javax.xml.namespace.QName SHOWSTATUSBAR$44 = 
        new javax.xml.namespace.QName("", "showStatusbar");
    private static final javax.xml.namespace.QName SHOWCOMMENTS$46 = 
        new javax.xml.namespace.QName("", "showComments");
    private static final javax.xml.namespace.QName SHOWOBJECTS$48 = 
        new javax.xml.namespace.QName("", "showObjects");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$4);
            return target;
        }
    }
    
    /**
     * Sets the "guid" attribute
     */
    public void setGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$4);
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    public void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$4);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "autoUpdate" attribute
     */
    public boolean getAutoUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOUPDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOUPDATE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoUpdate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOUPDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOUPDATE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoUpdate" attribute
     */
    public boolean isSetAutoUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOUPDATE$6) != null;
        }
    }
    
    /**
     * Sets the "autoUpdate" attribute
     */
    public void setAutoUpdate(boolean autoUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOUPDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOUPDATE$6);
            }
            target.setBooleanValue(autoUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "autoUpdate" attribute
     */
    public void xsetAutoUpdate(org.apache.xmlbeans.XmlBoolean autoUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOUPDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOUPDATE$6);
            }
            target.set(autoUpdate);
        }
    }
    
    /**
     * Unsets the "autoUpdate" attribute
     */
    public void unsetAutoUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOUPDATE$6);
        }
    }
    
    /**
     * Gets the "mergeInterval" attribute
     */
    public long getMergeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGEINTERVAL$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "mergeInterval" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMergeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MERGEINTERVAL$8);
            return target;
        }
    }
    
    /**
     * True if has "mergeInterval" attribute
     */
    public boolean isSetMergeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MERGEINTERVAL$8) != null;
        }
    }
    
    /**
     * Sets the "mergeInterval" attribute
     */
    public void setMergeInterval(long mergeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGEINTERVAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERGEINTERVAL$8);
            }
            target.setLongValue(mergeInterval);
        }
    }
    
    /**
     * Sets (as xml) the "mergeInterval" attribute
     */
    public void xsetMergeInterval(org.apache.xmlbeans.XmlUnsignedInt mergeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MERGEINTERVAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MERGEINTERVAL$8);
            }
            target.set(mergeInterval);
        }
    }
    
    /**
     * Unsets the "mergeInterval" attribute
     */
    public void unsetMergeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MERGEINTERVAL$8);
        }
    }
    
    /**
     * Gets the "changesSavedWin" attribute
     */
    public boolean getChangesSavedWin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGESSAVEDWIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHANGESSAVEDWIN$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "changesSavedWin" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetChangesSavedWin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHANGESSAVEDWIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CHANGESSAVEDWIN$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "changesSavedWin" attribute
     */
    public boolean isSetChangesSavedWin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHANGESSAVEDWIN$10) != null;
        }
    }
    
    /**
     * Sets the "changesSavedWin" attribute
     */
    public void setChangesSavedWin(boolean changesSavedWin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHANGESSAVEDWIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHANGESSAVEDWIN$10);
            }
            target.setBooleanValue(changesSavedWin);
        }
    }
    
    /**
     * Sets (as xml) the "changesSavedWin" attribute
     */
    public void xsetChangesSavedWin(org.apache.xmlbeans.XmlBoolean changesSavedWin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHANGESSAVEDWIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CHANGESSAVEDWIN$10);
            }
            target.set(changesSavedWin);
        }
    }
    
    /**
     * Unsets the "changesSavedWin" attribute
     */
    public void unsetChangesSavedWin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHANGESSAVEDWIN$10);
        }
    }
    
    /**
     * Gets the "onlySync" attribute
     */
    public boolean getOnlySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONLYSYNC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ONLYSYNC$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "onlySync" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnlySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONLYSYNC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ONLYSYNC$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "onlySync" attribute
     */
    public boolean isSetOnlySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONLYSYNC$12) != null;
        }
    }
    
    /**
     * Sets the "onlySync" attribute
     */
    public void setOnlySync(boolean onlySync)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONLYSYNC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONLYSYNC$12);
            }
            target.setBooleanValue(onlySync);
        }
    }
    
    /**
     * Sets (as xml) the "onlySync" attribute
     */
    public void xsetOnlySync(org.apache.xmlbeans.XmlBoolean onlySync)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONLYSYNC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ONLYSYNC$12);
            }
            target.set(onlySync);
        }
    }
    
    /**
     * Unsets the "onlySync" attribute
     */
    public void unsetOnlySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONLYSYNC$12);
        }
    }
    
    /**
     * Gets the "personalView" attribute
     */
    public boolean getPersonalView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERSONALVIEW$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "personalView" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPersonalView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERSONALVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PERSONALVIEW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "personalView" attribute
     */
    public boolean isSetPersonalView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERSONALVIEW$14) != null;
        }
    }
    
    /**
     * Sets the "personalView" attribute
     */
    public void setPersonalView(boolean personalView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONALVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONALVIEW$14);
            }
            target.setBooleanValue(personalView);
        }
    }
    
    /**
     * Sets (as xml) the "personalView" attribute
     */
    public void xsetPersonalView(org.apache.xmlbeans.XmlBoolean personalView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERSONALVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PERSONALVIEW$14);
            }
            target.set(personalView);
        }
    }
    
    /**
     * Unsets the "personalView" attribute
     */
    public void unsetPersonalView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERSONALVIEW$14);
        }
    }
    
    /**
     * Gets the "includePrintSettings" attribute
     */
    public boolean getIncludePrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEPRINTSETTINGS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDEPRINTSETTINGS$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "includePrintSettings" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludePrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEPRINTSETTINGS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDEPRINTSETTINGS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "includePrintSettings" attribute
     */
    public boolean isSetIncludePrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDEPRINTSETTINGS$16) != null;
        }
    }
    
    /**
     * Sets the "includePrintSettings" attribute
     */
    public void setIncludePrintSettings(boolean includePrintSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEPRINTSETTINGS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEPRINTSETTINGS$16);
            }
            target.setBooleanValue(includePrintSettings);
        }
    }
    
    /**
     * Sets (as xml) the "includePrintSettings" attribute
     */
    public void xsetIncludePrintSettings(org.apache.xmlbeans.XmlBoolean includePrintSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEPRINTSETTINGS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDEPRINTSETTINGS$16);
            }
            target.set(includePrintSettings);
        }
    }
    
    /**
     * Unsets the "includePrintSettings" attribute
     */
    public void unsetIncludePrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDEPRINTSETTINGS$16);
        }
    }
    
    /**
     * Gets the "includeHiddenRowCol" attribute
     */
    public boolean getIncludeHiddenRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEHIDDENROWCOL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDEHIDDENROWCOL$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "includeHiddenRowCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeHiddenRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEHIDDENROWCOL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDEHIDDENROWCOL$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "includeHiddenRowCol" attribute
     */
    public boolean isSetIncludeHiddenRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDEHIDDENROWCOL$18) != null;
        }
    }
    
    /**
     * Sets the "includeHiddenRowCol" attribute
     */
    public void setIncludeHiddenRowCol(boolean includeHiddenRowCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEHIDDENROWCOL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEHIDDENROWCOL$18);
            }
            target.setBooleanValue(includeHiddenRowCol);
        }
    }
    
    /**
     * Sets (as xml) the "includeHiddenRowCol" attribute
     */
    public void xsetIncludeHiddenRowCol(org.apache.xmlbeans.XmlBoolean includeHiddenRowCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDEHIDDENROWCOL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDEHIDDENROWCOL$18);
            }
            target.set(includeHiddenRowCol);
        }
    }
    
    /**
     * Unsets the "includeHiddenRowCol" attribute
     */
    public void unsetIncludeHiddenRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDEHIDDENROWCOL$18);
        }
    }
    
    /**
     * Gets the "maximized" attribute
     */
    public boolean getMaximized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMIZED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXIMIZED$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximized" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMaximized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXIMIZED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MAXIMIZED$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "maximized" attribute
     */
    public boolean isSetMaximized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXIMIZED$20) != null;
        }
    }
    
    /**
     * Sets the "maximized" attribute
     */
    public void setMaximized(boolean maximized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXIMIZED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXIMIZED$20);
            }
            target.setBooleanValue(maximized);
        }
    }
    
    /**
     * Sets (as xml) the "maximized" attribute
     */
    public void xsetMaximized(org.apache.xmlbeans.XmlBoolean maximized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXIMIZED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MAXIMIZED$20);
            }
            target.set(maximized);
        }
    }
    
    /**
     * Unsets the "maximized" attribute
     */
    public void unsetMaximized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXIMIZED$20);
        }
    }
    
    /**
     * Gets the "minimized" attribute
     */
    public boolean getMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMIZED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINIMIZED$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimized" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINIMIZED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MINIMIZED$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "minimized" attribute
     */
    public boolean isSetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINIMIZED$22) != null;
        }
    }
    
    /**
     * Sets the "minimized" attribute
     */
    public void setMinimized(boolean minimized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMIZED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINIMIZED$22);
            }
            target.setBooleanValue(minimized);
        }
    }
    
    /**
     * Sets (as xml) the "minimized" attribute
     */
    public void xsetMinimized(org.apache.xmlbeans.XmlBoolean minimized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINIMIZED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MINIMIZED$22);
            }
            target.set(minimized);
        }
    }
    
    /**
     * Unsets the "minimized" attribute
     */
    public void unsetMinimized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINIMIZED$22);
        }
    }
    
    /**
     * Gets the "showHorizontalScroll" attribute
     */
    public boolean getShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWHORIZONTALSCROLL$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHorizontalScroll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWHORIZONTALSCROLL$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "showHorizontalScroll" attribute
     */
    public boolean isSetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWHORIZONTALSCROLL$24) != null;
        }
    }
    
    /**
     * Sets the "showHorizontalScroll" attribute
     */
    public void setShowHorizontalScroll(boolean showHorizontalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWHORIZONTALSCROLL$24);
            }
            target.setBooleanValue(showHorizontalScroll);
        }
    }
    
    /**
     * Sets (as xml) the "showHorizontalScroll" attribute
     */
    public void xsetShowHorizontalScroll(org.apache.xmlbeans.XmlBoolean showHorizontalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHORIZONTALSCROLL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWHORIZONTALSCROLL$24);
            }
            target.set(showHorizontalScroll);
        }
    }
    
    /**
     * Unsets the "showHorizontalScroll" attribute
     */
    public void unsetShowHorizontalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWHORIZONTALSCROLL$24);
        }
    }
    
    /**
     * Gets the "showVerticalScroll" attribute
     */
    public boolean getShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVERTICALSCROLL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWVERTICALSCROLL$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showVerticalScroll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVERTICALSCROLL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWVERTICALSCROLL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "showVerticalScroll" attribute
     */
    public boolean isSetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWVERTICALSCROLL$26) != null;
        }
    }
    
    /**
     * Sets the "showVerticalScroll" attribute
     */
    public void setShowVerticalScroll(boolean showVerticalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWVERTICALSCROLL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWVERTICALSCROLL$26);
            }
            target.setBooleanValue(showVerticalScroll);
        }
    }
    
    /**
     * Sets (as xml) the "showVerticalScroll" attribute
     */
    public void xsetShowVerticalScroll(org.apache.xmlbeans.XmlBoolean showVerticalScroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWVERTICALSCROLL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWVERTICALSCROLL$26);
            }
            target.set(showVerticalScroll);
        }
    }
    
    /**
     * Unsets the "showVerticalScroll" attribute
     */
    public void unsetShowVerticalScroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWVERTICALSCROLL$26);
        }
    }
    
    /**
     * Gets the "showSheetTabs" attribute
     */
    public boolean getShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSHEETTABS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSHEETTABS$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showSheetTabs" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSHEETTABS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSHEETTABS$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "showSheetTabs" attribute
     */
    public boolean isSetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSHEETTABS$28) != null;
        }
    }
    
    /**
     * Sets the "showSheetTabs" attribute
     */
    public void setShowSheetTabs(boolean showSheetTabs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSHEETTABS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSHEETTABS$28);
            }
            target.setBooleanValue(showSheetTabs);
        }
    }
    
    /**
     * Sets (as xml) the "showSheetTabs" attribute
     */
    public void xsetShowSheetTabs(org.apache.xmlbeans.XmlBoolean showSheetTabs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSHEETTABS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSHEETTABS$28);
            }
            target.set(showSheetTabs);
        }
    }
    
    /**
     * Unsets the "showSheetTabs" attribute
     */
    public void unsetShowSheetTabs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSHEETTABS$28);
        }
    }
    
    /**
     * Gets the "xWindow" attribute
     */
    public int getXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XWINDOW$30);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "xWindow" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(XWINDOW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(XWINDOW$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "xWindow" attribute
     */
    public boolean isSetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XWINDOW$30) != null;
        }
    }
    
    /**
     * Sets the "xWindow" attribute
     */
    public void setXWindow(int xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XWINDOW$30);
            }
            target.setIntValue(xWindow);
        }
    }
    
    /**
     * Sets (as xml) the "xWindow" attribute
     */
    public void xsetXWindow(org.apache.xmlbeans.XmlInt xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(XWINDOW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(XWINDOW$30);
            }
            target.set(xWindow);
        }
    }
    
    /**
     * Unsets the "xWindow" attribute
     */
    public void unsetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XWINDOW$30);
        }
    }
    
    /**
     * Gets the "yWindow" attribute
     */
    public int getYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(YWINDOW$32);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "yWindow" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(YWINDOW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(YWINDOW$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "yWindow" attribute
     */
    public boolean isSetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YWINDOW$32) != null;
        }
    }
    
    /**
     * Sets the "yWindow" attribute
     */
    public void setYWindow(int yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YWINDOW$32);
            }
            target.setIntValue(yWindow);
        }
    }
    
    /**
     * Sets (as xml) the "yWindow" attribute
     */
    public void xsetYWindow(org.apache.xmlbeans.XmlInt yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(YWINDOW$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(YWINDOW$32);
            }
            target.set(yWindow);
        }
    }
    
    /**
     * Unsets the "yWindow" attribute
     */
    public void unsetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YWINDOW$32);
        }
    }
    
    /**
     * Gets the "windowWidth" attribute
     */
    public long getWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWWIDTH$34);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowWidth" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWindowWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWWIDTH$34);
            return target;
        }
    }
    
    /**
     * Sets the "windowWidth" attribute
     */
    public void setWindowWidth(long windowWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWWIDTH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WINDOWWIDTH$34);
            }
            target.setLongValue(windowWidth);
        }
    }
    
    /**
     * Sets (as xml) the "windowWidth" attribute
     */
    public void xsetWindowWidth(org.apache.xmlbeans.XmlUnsignedInt windowWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWWIDTH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WINDOWWIDTH$34);
            }
            target.set(windowWidth);
        }
    }
    
    /**
     * Gets the "windowHeight" attribute
     */
    public long getWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWHEIGHT$36);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowHeight" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetWindowHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWHEIGHT$36);
            return target;
        }
    }
    
    /**
     * Sets the "windowHeight" attribute
     */
    public void setWindowHeight(long windowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WINDOWHEIGHT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WINDOWHEIGHT$36);
            }
            target.setLongValue(windowHeight);
        }
    }
    
    /**
     * Sets (as xml) the "windowHeight" attribute
     */
    public void xsetWindowHeight(org.apache.xmlbeans.XmlUnsignedInt windowHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(WINDOWHEIGHT$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(WINDOWHEIGHT$36);
            }
            target.set(windowHeight);
        }
    }
    
    /**
     * Gets the "tabRatio" attribute
     */
    public long getTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABRATIO$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABRATIO$38);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "tabRatio" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TABRATIO$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(TABRATIO$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "tabRatio" attribute
     */
    public boolean isSetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABRATIO$38) != null;
        }
    }
    
    /**
     * Sets the "tabRatio" attribute
     */
    public void setTabRatio(long tabRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABRATIO$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABRATIO$38);
            }
            target.setLongValue(tabRatio);
        }
    }
    
    /**
     * Sets (as xml) the "tabRatio" attribute
     */
    public void xsetTabRatio(org.apache.xmlbeans.XmlUnsignedInt tabRatio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TABRATIO$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TABRATIO$38);
            }
            target.set(tabRatio);
        }
    }
    
    /**
     * Unsets the "tabRatio" attribute
     */
    public void unsetTabRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABRATIO$38);
        }
    }
    
    /**
     * Gets the "activeSheetId" attribute
     */
    public long getActiveSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVESHEETID$40);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeSheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetActiveSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVESHEETID$40);
            return target;
        }
    }
    
    /**
     * Sets the "activeSheetId" attribute
     */
    public void setActiveSheetId(long activeSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVESHEETID$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVESHEETID$40);
            }
            target.setLongValue(activeSheetId);
        }
    }
    
    /**
     * Sets (as xml) the "activeSheetId" attribute
     */
    public void xsetActiveSheetId(org.apache.xmlbeans.XmlUnsignedInt activeSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ACTIVESHEETID$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ACTIVESHEETID$40);
            }
            target.set(activeSheetId);
        }
    }
    
    /**
     * Gets the "showFormulaBar" attribute
     */
    public boolean getShowFormulaBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULABAR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWFORMULABAR$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showFormulaBar" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowFormulaBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULABAR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWFORMULABAR$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "showFormulaBar" attribute
     */
    public boolean isSetShowFormulaBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWFORMULABAR$42) != null;
        }
    }
    
    /**
     * Sets the "showFormulaBar" attribute
     */
    public void setShowFormulaBar(boolean showFormulaBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULABAR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWFORMULABAR$42);
            }
            target.setBooleanValue(showFormulaBar);
        }
    }
    
    /**
     * Sets (as xml) the "showFormulaBar" attribute
     */
    public void xsetShowFormulaBar(org.apache.xmlbeans.XmlBoolean showFormulaBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULABAR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWFORMULABAR$42);
            }
            target.set(showFormulaBar);
        }
    }
    
    /**
     * Unsets the "showFormulaBar" attribute
     */
    public void unsetShowFormulaBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWFORMULABAR$42);
        }
    }
    
    /**
     * Gets the "showStatusbar" attribute
     */
    public boolean getShowStatusbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSTATUSBAR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSTATUSBAR$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showStatusbar" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowStatusbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSTATUSBAR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSTATUSBAR$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "showStatusbar" attribute
     */
    public boolean isSetShowStatusbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSTATUSBAR$44) != null;
        }
    }
    
    /**
     * Sets the "showStatusbar" attribute
     */
    public void setShowStatusbar(boolean showStatusbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSTATUSBAR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSTATUSBAR$44);
            }
            target.setBooleanValue(showStatusbar);
        }
    }
    
    /**
     * Sets (as xml) the "showStatusbar" attribute
     */
    public void xsetShowStatusbar(org.apache.xmlbeans.XmlBoolean showStatusbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSTATUSBAR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSTATUSBAR$44);
            }
            target.set(showStatusbar);
        }
    }
    
    /**
     * Unsets the "showStatusbar" attribute
     */
    public void unsetShowStatusbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSTATUSBAR$44);
        }
    }
    
    /**
     * Gets the "showComments" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments.Enum getShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWCOMMENTS$46);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "showComments" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments xgetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments)get_store().find_attribute_user(SHOWCOMMENTS$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments)get_default_attribute_value(SHOWCOMMENTS$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "showComments" attribute
     */
    public boolean isSetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCOMMENTS$46) != null;
        }
    }
    
    /**
     * Sets the "showComments" attribute
     */
    public void setShowComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments.Enum showComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOMMENTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCOMMENTS$46);
            }
            target.setEnumValue(showComments);
        }
    }
    
    /**
     * Sets (as xml) the "showComments" attribute
     */
    public void xsetShowComments(org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments showComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments)get_store().find_attribute_user(SHOWCOMMENTS$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STComments)get_store().add_attribute_user(SHOWCOMMENTS$46);
            }
            target.set(showComments);
        }
    }
    
    /**
     * Unsets the "showComments" attribute
     */
    public void unsetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCOMMENTS$46);
        }
    }
    
    /**
     * Gets the "showObjects" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects.Enum getShowObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOBJECTS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWOBJECTS$48);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "showObjects" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects xgetShowObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().find_attribute_user(SHOWOBJECTS$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_default_attribute_value(SHOWOBJECTS$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "showObjects" attribute
     */
    public boolean isSetShowObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWOBJECTS$48) != null;
        }
    }
    
    /**
     * Sets the "showObjects" attribute
     */
    public void setShowObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects.Enum showObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOBJECTS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWOBJECTS$48);
            }
            target.setEnumValue(showObjects);
        }
    }
    
    /**
     * Sets (as xml) the "showObjects" attribute
     */
    public void xsetShowObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects showObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().find_attribute_user(SHOWOBJECTS$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().add_attribute_user(SHOWOBJECTS$48);
            }
            target.set(showObjects);
        }
    }
    
    /**
     * Unsets the "showObjects" attribute
     */
    public void unsetShowObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWOBJECTS$48);
        }
    }
}
