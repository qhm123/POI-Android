/*
 * XML Type:  CT_WorkbookPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WorkbookPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorkbookPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr
{
    
    public CTWorkbookPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE1904$0 = 
        new javax.xml.namespace.QName("", "date1904");
    private static final javax.xml.namespace.QName SHOWOBJECTS$2 = 
        new javax.xml.namespace.QName("", "showObjects");
    private static final javax.xml.namespace.QName SHOWBORDERUNSELECTEDTABLES$4 = 
        new javax.xml.namespace.QName("", "showBorderUnselectedTables");
    private static final javax.xml.namespace.QName FILTERPRIVACY$6 = 
        new javax.xml.namespace.QName("", "filterPrivacy");
    private static final javax.xml.namespace.QName PROMPTEDSOLUTIONS$8 = 
        new javax.xml.namespace.QName("", "promptedSolutions");
    private static final javax.xml.namespace.QName SHOWINKANNOTATION$10 = 
        new javax.xml.namespace.QName("", "showInkAnnotation");
    private static final javax.xml.namespace.QName BACKUPFILE$12 = 
        new javax.xml.namespace.QName("", "backupFile");
    private static final javax.xml.namespace.QName SAVEEXTERNALLINKVALUES$14 = 
        new javax.xml.namespace.QName("", "saveExternalLinkValues");
    private static final javax.xml.namespace.QName UPDATELINKS$16 = 
        new javax.xml.namespace.QName("", "updateLinks");
    private static final javax.xml.namespace.QName CODENAME$18 = 
        new javax.xml.namespace.QName("", "codeName");
    private static final javax.xml.namespace.QName HIDEPIVOTFIELDLIST$20 = 
        new javax.xml.namespace.QName("", "hidePivotFieldList");
    private static final javax.xml.namespace.QName SHOWPIVOTCHARTFILTER$22 = 
        new javax.xml.namespace.QName("", "showPivotChartFilter");
    private static final javax.xml.namespace.QName ALLOWREFRESHQUERY$24 = 
        new javax.xml.namespace.QName("", "allowRefreshQuery");
    private static final javax.xml.namespace.QName PUBLISHITEMS$26 = 
        new javax.xml.namespace.QName("", "publishItems");
    private static final javax.xml.namespace.QName CHECKCOMPATIBILITY$28 = 
        new javax.xml.namespace.QName("", "checkCompatibility");
    private static final javax.xml.namespace.QName AUTOCOMPRESSPICTURES$30 = 
        new javax.xml.namespace.QName("", "autoCompressPictures");
    private static final javax.xml.namespace.QName REFRESHALLCONNECTIONS$32 = 
        new javax.xml.namespace.QName("", "refreshAllConnections");
    private static final javax.xml.namespace.QName DEFAULTTHEMEVERSION$34 = 
        new javax.xml.namespace.QName("", "defaultThemeVersion");
    
    
    /**
     * Gets the "date1904" attribute
     */
    public boolean getDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE1904$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATE1904$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "date1904" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATE1904$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATE1904$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "date1904" attribute
     */
    public boolean isSetDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATE1904$0) != null;
        }
    }
    
    /**
     * Sets the "date1904" attribute
     */
    public void setDate1904(boolean date1904)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE1904$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE1904$0);
            }
            target.setBooleanValue(date1904);
        }
    }
    
    /**
     * Sets (as xml) the "date1904" attribute
     */
    public void xsetDate1904(org.apache.xmlbeans.XmlBoolean date1904)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATE1904$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATE1904$0);
            }
            target.set(date1904);
        }
    }
    
    /**
     * Unsets the "date1904" attribute
     */
    public void unsetDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATE1904$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOBJECTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWOBJECTS$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().find_attribute_user(SHOWOBJECTS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_default_attribute_value(SHOWOBJECTS$2);
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
            return get_store().find_attribute_user(SHOWOBJECTS$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOBJECTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWOBJECTS$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().find_attribute_user(SHOWOBJECTS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects)get_store().add_attribute_user(SHOWOBJECTS$2);
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
            get_store().remove_attribute(SHOWOBJECTS$2);
        }
    }
    
    /**
     * Gets the "showBorderUnselectedTables" attribute
     */
    public boolean getShowBorderUnselectedTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWBORDERUNSELECTEDTABLES$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showBorderUnselectedTables" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowBorderUnselectedTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWBORDERUNSELECTEDTABLES$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "showBorderUnselectedTables" attribute
     */
    public boolean isSetShowBorderUnselectedTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4) != null;
        }
    }
    
    /**
     * Sets the "showBorderUnselectedTables" attribute
     */
    public void setShowBorderUnselectedTables(boolean showBorderUnselectedTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            }
            target.setBooleanValue(showBorderUnselectedTables);
        }
    }
    
    /**
     * Sets (as xml) the "showBorderUnselectedTables" attribute
     */
    public void xsetShowBorderUnselectedTables(org.apache.xmlbeans.XmlBoolean showBorderUnselectedTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
            }
            target.set(showBorderUnselectedTables);
        }
    }
    
    /**
     * Unsets the "showBorderUnselectedTables" attribute
     */
    public void unsetShowBorderUnselectedTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWBORDERUNSELECTEDTABLES$4);
        }
    }
    
    /**
     * Gets the "filterPrivacy" attribute
     */
    public boolean getFilterPrivacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERPRIVACY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERPRIVACY$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "filterPrivacy" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFilterPrivacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERPRIVACY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FILTERPRIVACY$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "filterPrivacy" attribute
     */
    public boolean isSetFilterPrivacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTERPRIVACY$6) != null;
        }
    }
    
    /**
     * Sets the "filterPrivacy" attribute
     */
    public void setFilterPrivacy(boolean filterPrivacy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERPRIVACY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERPRIVACY$6);
            }
            target.setBooleanValue(filterPrivacy);
        }
    }
    
    /**
     * Sets (as xml) the "filterPrivacy" attribute
     */
    public void xsetFilterPrivacy(org.apache.xmlbeans.XmlBoolean filterPrivacy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERPRIVACY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILTERPRIVACY$6);
            }
            target.set(filterPrivacy);
        }
    }
    
    /**
     * Unsets the "filterPrivacy" attribute
     */
    public void unsetFilterPrivacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTERPRIVACY$6);
        }
    }
    
    /**
     * Gets the "promptedSolutions" attribute
     */
    public boolean getPromptedSolutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROMPTEDSOLUTIONS$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "promptedSolutions" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPromptedSolutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROMPTEDSOLUTIONS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "promptedSolutions" attribute
     */
    public boolean isSetPromptedSolutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROMPTEDSOLUTIONS$8) != null;
        }
    }
    
    /**
     * Sets the "promptedSolutions" attribute
     */
    public void setPromptedSolutions(boolean promptedSolutions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMPTEDSOLUTIONS$8);
            }
            target.setBooleanValue(promptedSolutions);
        }
    }
    
    /**
     * Sets (as xml) the "promptedSolutions" attribute
     */
    public void xsetPromptedSolutions(org.apache.xmlbeans.XmlBoolean promptedSolutions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROMPTEDSOLUTIONS$8);
            }
            target.set(promptedSolutions);
        }
    }
    
    /**
     * Unsets the "promptedSolutions" attribute
     */
    public void unsetPromptedSolutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROMPTEDSOLUTIONS$8);
        }
    }
    
    /**
     * Gets the "showInkAnnotation" attribute
     */
    public boolean getShowInkAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINKANNOTATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWINKANNOTATION$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showInkAnnotation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowInkAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINKANNOTATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWINKANNOTATION$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "showInkAnnotation" attribute
     */
    public boolean isSetShowInkAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWINKANNOTATION$10) != null;
        }
    }
    
    /**
     * Sets the "showInkAnnotation" attribute
     */
    public void setShowInkAnnotation(boolean showInkAnnotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINKANNOTATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWINKANNOTATION$10);
            }
            target.setBooleanValue(showInkAnnotation);
        }
    }
    
    /**
     * Sets (as xml) the "showInkAnnotation" attribute
     */
    public void xsetShowInkAnnotation(org.apache.xmlbeans.XmlBoolean showInkAnnotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINKANNOTATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWINKANNOTATION$10);
            }
            target.set(showInkAnnotation);
        }
    }
    
    /**
     * Unsets the "showInkAnnotation" attribute
     */
    public void unsetShowInkAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWINKANNOTATION$10);
        }
    }
    
    /**
     * Gets the "backupFile" attribute
     */
    public boolean getBackupFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKUPFILE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BACKUPFILE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "backupFile" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBackupFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKUPFILE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BACKUPFILE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "backupFile" attribute
     */
    public boolean isSetBackupFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKUPFILE$12) != null;
        }
    }
    
    /**
     * Sets the "backupFile" attribute
     */
    public void setBackupFile(boolean backupFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKUPFILE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKUPFILE$12);
            }
            target.setBooleanValue(backupFile);
        }
    }
    
    /**
     * Sets (as xml) the "backupFile" attribute
     */
    public void xsetBackupFile(org.apache.xmlbeans.XmlBoolean backupFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKUPFILE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BACKUPFILE$12);
            }
            target.set(backupFile);
        }
    }
    
    /**
     * Unsets the "backupFile" attribute
     */
    public void unsetBackupFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKUPFILE$12);
        }
    }
    
    /**
     * Gets the "saveExternalLinkValues" attribute
     */
    public boolean getSaveExternalLinkValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVEEXTERNALLINKVALUES$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "saveExternalLinkValues" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveExternalLinkValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SAVEEXTERNALLINKVALUES$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "saveExternalLinkValues" attribute
     */
    public boolean isSetSaveExternalLinkValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14) != null;
        }
    }
    
    /**
     * Sets the "saveExternalLinkValues" attribute
     */
    public void setSaveExternalLinkValues(boolean saveExternalLinkValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEEXTERNALLINKVALUES$14);
            }
            target.setBooleanValue(saveExternalLinkValues);
        }
    }
    
    /**
     * Sets (as xml) the "saveExternalLinkValues" attribute
     */
    public void xsetSaveExternalLinkValues(org.apache.xmlbeans.XmlBoolean saveExternalLinkValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVEEXTERNALLINKVALUES$14);
            }
            target.set(saveExternalLinkValues);
        }
    }
    
    /**
     * Unsets the "saveExternalLinkValues" attribute
     */
    public void unsetSaveExternalLinkValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVEEXTERNALLINKVALUES$14);
        }
    }
    
    /**
     * Gets the "updateLinks" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks.Enum getUpdateLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATELINKS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPDATELINKS$16);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateLinks" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks xgetUpdateLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks)get_store().find_attribute_user(UPDATELINKS$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks)get_default_attribute_value(UPDATELINKS$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "updateLinks" attribute
     */
    public boolean isSetUpdateLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPDATELINKS$16) != null;
        }
    }
    
    /**
     * Sets the "updateLinks" attribute
     */
    public void setUpdateLinks(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks.Enum updateLinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATELINKS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATELINKS$16);
            }
            target.setEnumValue(updateLinks);
        }
    }
    
    /**
     * Sets (as xml) the "updateLinks" attribute
     */
    public void xsetUpdateLinks(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks updateLinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks)get_store().find_attribute_user(UPDATELINKS$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks)get_store().add_attribute_user(UPDATELINKS$16);
            }
            target.set(updateLinks);
        }
    }
    
    /**
     * Unsets the "updateLinks" attribute
     */
    public void unsetUpdateLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPDATELINKS$16);
        }
    }
    
    /**
     * Gets the "codeName" attribute
     */
    public java.lang.String getCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$18);
            return target;
        }
    }
    
    /**
     * True if has "codeName" attribute
     */
    public boolean isSetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODENAME$18) != null;
        }
    }
    
    /**
     * Sets the "codeName" attribute
     */
    public void setCodeName(java.lang.String codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODENAME$18);
            }
            target.setStringValue(codeName);
        }
    }
    
    /**
     * Sets (as xml) the "codeName" attribute
     */
    public void xsetCodeName(org.apache.xmlbeans.XmlString codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODENAME$18);
            }
            target.set(codeName);
        }
    }
    
    /**
     * Unsets the "codeName" attribute
     */
    public void unsetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODENAME$18);
        }
    }
    
    /**
     * Gets the "hidePivotFieldList" attribute
     */
    public boolean getHidePivotFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDEPIVOTFIELDLIST$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidePivotFieldList" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidePivotFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDEPIVOTFIELDLIST$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidePivotFieldList" attribute
     */
    public boolean isSetHidePivotFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20) != null;
        }
    }
    
    /**
     * Sets the "hidePivotFieldList" attribute
     */
    public void setHidePivotFieldList(boolean hidePivotFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDEPIVOTFIELDLIST$20);
            }
            target.setBooleanValue(hidePivotFieldList);
        }
    }
    
    /**
     * Sets (as xml) the "hidePivotFieldList" attribute
     */
    public void xsetHidePivotFieldList(org.apache.xmlbeans.XmlBoolean hidePivotFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDEPIVOTFIELDLIST$20);
            }
            target.set(hidePivotFieldList);
        }
    }
    
    /**
     * Unsets the "hidePivotFieldList" attribute
     */
    public void unsetHidePivotFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDEPIVOTFIELDLIST$20);
        }
    }
    
    /**
     * Gets the "showPivotChartFilter" attribute
     */
    public boolean getShowPivotChartFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWPIVOTCHARTFILTER$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showPivotChartFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowPivotChartFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWPIVOTCHARTFILTER$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "showPivotChartFilter" attribute
     */
    public boolean isSetShowPivotChartFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22) != null;
        }
    }
    
    /**
     * Sets the "showPivotChartFilter" attribute
     */
    public void setShowPivotChartFilter(boolean showPivotChartFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWPIVOTCHARTFILTER$22);
            }
            target.setBooleanValue(showPivotChartFilter);
        }
    }
    
    /**
     * Sets (as xml) the "showPivotChartFilter" attribute
     */
    public void xsetShowPivotChartFilter(org.apache.xmlbeans.XmlBoolean showPivotChartFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWPIVOTCHARTFILTER$22);
            }
            target.set(showPivotChartFilter);
        }
    }
    
    /**
     * Unsets the "showPivotChartFilter" attribute
     */
    public void unsetShowPivotChartFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWPIVOTCHARTFILTER$22);
        }
    }
    
    /**
     * Gets the "allowRefreshQuery" attribute
     */
    public boolean getAllowRefreshQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLOWREFRESHQUERY$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowRefreshQuery" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowRefreshQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALLOWREFRESHQUERY$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "allowRefreshQuery" attribute
     */
    public boolean isSetAllowRefreshQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWREFRESHQUERY$24) != null;
        }
    }
    
    /**
     * Sets the "allowRefreshQuery" attribute
     */
    public void setAllowRefreshQuery(boolean allowRefreshQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWREFRESHQUERY$24);
            }
            target.setBooleanValue(allowRefreshQuery);
        }
    }
    
    /**
     * Sets (as xml) the "allowRefreshQuery" attribute
     */
    public void xsetAllowRefreshQuery(org.apache.xmlbeans.XmlBoolean allowRefreshQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWREFRESHQUERY$24);
            }
            target.set(allowRefreshQuery);
        }
    }
    
    /**
     * Unsets the "allowRefreshQuery" attribute
     */
    public void unsetAllowRefreshQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWREFRESHQUERY$24);
        }
    }
    
    /**
     * Gets the "publishItems" attribute
     */
    public boolean getPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHITEMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHITEMS$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "publishItems" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHITEMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHITEMS$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "publishItems" attribute
     */
    public boolean isSetPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHITEMS$26) != null;
        }
    }
    
    /**
     * Sets the "publishItems" attribute
     */
    public void setPublishItems(boolean publishItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHITEMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHITEMS$26);
            }
            target.setBooleanValue(publishItems);
        }
    }
    
    /**
     * Sets (as xml) the "publishItems" attribute
     */
    public void xsetPublishItems(org.apache.xmlbeans.XmlBoolean publishItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHITEMS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHITEMS$26);
            }
            target.set(publishItems);
        }
    }
    
    /**
     * Unsets the "publishItems" attribute
     */
    public void unsetPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHITEMS$26);
        }
    }
    
    /**
     * Gets the "checkCompatibility" attribute
     */
    public boolean getCheckCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHECKCOMPATIBILITY$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "checkCompatibility" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCheckCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CHECKCOMPATIBILITY$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "checkCompatibility" attribute
     */
    public boolean isSetCheckCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHECKCOMPATIBILITY$28) != null;
        }
    }
    
    /**
     * Sets the "checkCompatibility" attribute
     */
    public void setCheckCompatibility(boolean checkCompatibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKCOMPATIBILITY$28);
            }
            target.setBooleanValue(checkCompatibility);
        }
    }
    
    /**
     * Sets (as xml) the "checkCompatibility" attribute
     */
    public void xsetCheckCompatibility(org.apache.xmlbeans.XmlBoolean checkCompatibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CHECKCOMPATIBILITY$28);
            }
            target.set(checkCompatibility);
        }
    }
    
    /**
     * Unsets the "checkCompatibility" attribute
     */
    public void unsetCheckCompatibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHECKCOMPATIBILITY$28);
        }
    }
    
    /**
     * Gets the "autoCompressPictures" attribute
     */
    public boolean getAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOCOMPRESSPICTURES$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoCompressPictures" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOCOMPRESSPICTURES$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoCompressPictures" attribute
     */
    public boolean isSetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30) != null;
        }
    }
    
    /**
     * Sets the "autoCompressPictures" attribute
     */
    public void setAutoCompressPictures(boolean autoCompressPictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOCOMPRESSPICTURES$30);
            }
            target.setBooleanValue(autoCompressPictures);
        }
    }
    
    /**
     * Sets (as xml) the "autoCompressPictures" attribute
     */
    public void xsetAutoCompressPictures(org.apache.xmlbeans.XmlBoolean autoCompressPictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOCOMPRESSPICTURES$30);
            }
            target.set(autoCompressPictures);
        }
    }
    
    /**
     * Unsets the "autoCompressPictures" attribute
     */
    public void unsetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOCOMPRESSPICTURES$30);
        }
    }
    
    /**
     * Gets the "refreshAllConnections" attribute
     */
    public boolean getRefreshAllConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHALLCONNECTIONS$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshAllConnections" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefreshAllConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHALLCONNECTIONS$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshAllConnections" attribute
     */
    public boolean isSetRefreshAllConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHALLCONNECTIONS$32) != null;
        }
    }
    
    /**
     * Sets the "refreshAllConnections" attribute
     */
    public void setRefreshAllConnections(boolean refreshAllConnections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHALLCONNECTIONS$32);
            }
            target.setBooleanValue(refreshAllConnections);
        }
    }
    
    /**
     * Sets (as xml) the "refreshAllConnections" attribute
     */
    public void xsetRefreshAllConnections(org.apache.xmlbeans.XmlBoolean refreshAllConnections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHALLCONNECTIONS$32);
            }
            target.set(refreshAllConnections);
        }
    }
    
    /**
     * Unsets the "refreshAllConnections" attribute
     */
    public void unsetRefreshAllConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHALLCONNECTIONS$32);
        }
    }
    
    /**
     * Gets the "defaultThemeVersion" attribute
     */
    public long getDefaultThemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultThemeVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDefaultThemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
            return target;
        }
    }
    
    /**
     * True if has "defaultThemeVersion" attribute
     */
    public boolean isSetDefaultThemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTTHEMEVERSION$34) != null;
        }
    }
    
    /**
     * Sets the "defaultThemeVersion" attribute
     */
    public void setDefaultThemeVersion(long defaultThemeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTHEMEVERSION$34);
            }
            target.setLongValue(defaultThemeVersion);
        }
    }
    
    /**
     * Sets (as xml) the "defaultThemeVersion" attribute
     */
    public void xsetDefaultThemeVersion(org.apache.xmlbeans.XmlUnsignedInt defaultThemeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DEFAULTTHEMEVERSION$34);
            }
            target.set(defaultThemeVersion);
        }
    }
    
    /**
     * Unsets the "defaultThemeVersion" attribute
     */
    public void unsetDefaultThemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTTHEMEVERSION$34);
        }
    }
}
