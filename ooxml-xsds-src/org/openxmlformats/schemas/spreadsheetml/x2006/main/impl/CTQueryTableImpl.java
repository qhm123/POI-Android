/*
 * XML Type:  CT_QueryTable
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_QueryTable(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTable
{
    
    public CTQueryTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTABLEREFRESH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryTableRefresh");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName HEADERS$6 = 
        new javax.xml.namespace.QName("", "headers");
    private static final javax.xml.namespace.QName ROWNUMBERS$8 = 
        new javax.xml.namespace.QName("", "rowNumbers");
    private static final javax.xml.namespace.QName DISABLEREFRESH$10 = 
        new javax.xml.namespace.QName("", "disableRefresh");
    private static final javax.xml.namespace.QName BACKGROUNDREFRESH$12 = 
        new javax.xml.namespace.QName("", "backgroundRefresh");
    private static final javax.xml.namespace.QName FIRSTBACKGROUNDREFRESH$14 = 
        new javax.xml.namespace.QName("", "firstBackgroundRefresh");
    private static final javax.xml.namespace.QName REFRESHONLOAD$16 = 
        new javax.xml.namespace.QName("", "refreshOnLoad");
    private static final javax.xml.namespace.QName GROWSHRINKTYPE$18 = 
        new javax.xml.namespace.QName("", "growShrinkType");
    private static final javax.xml.namespace.QName FILLFORMULAS$20 = 
        new javax.xml.namespace.QName("", "fillFormulas");
    private static final javax.xml.namespace.QName REMOVEDATAONSAVE$22 = 
        new javax.xml.namespace.QName("", "removeDataOnSave");
    private static final javax.xml.namespace.QName DISABLEEDIT$24 = 
        new javax.xml.namespace.QName("", "disableEdit");
    private static final javax.xml.namespace.QName PRESERVEFORMATTING$26 = 
        new javax.xml.namespace.QName("", "preserveFormatting");
    private static final javax.xml.namespace.QName ADJUSTCOLUMNWIDTH$28 = 
        new javax.xml.namespace.QName("", "adjustColumnWidth");
    private static final javax.xml.namespace.QName INTERMEDIATE$30 = 
        new javax.xml.namespace.QName("", "intermediate");
    private static final javax.xml.namespace.QName CONNECTIONID$32 = 
        new javax.xml.namespace.QName("", "connectionId");
    private static final javax.xml.namespace.QName AUTOFORMATID$34 = 
        new javax.xml.namespace.QName("", "autoFormatId");
    private static final javax.xml.namespace.QName APPLYNUMBERFORMATS$36 = 
        new javax.xml.namespace.QName("", "applyNumberFormats");
    private static final javax.xml.namespace.QName APPLYBORDERFORMATS$38 = 
        new javax.xml.namespace.QName("", "applyBorderFormats");
    private static final javax.xml.namespace.QName APPLYFONTFORMATS$40 = 
        new javax.xml.namespace.QName("", "applyFontFormats");
    private static final javax.xml.namespace.QName APPLYPATTERNFORMATS$42 = 
        new javax.xml.namespace.QName("", "applyPatternFormats");
    private static final javax.xml.namespace.QName APPLYALIGNMENTFORMATS$44 = 
        new javax.xml.namespace.QName("", "applyAlignmentFormats");
    private static final javax.xml.namespace.QName APPLYWIDTHHEIGHTFORMATS$46 = 
        new javax.xml.namespace.QName("", "applyWidthHeightFormats");
    
    
    /**
     * Gets the "queryTableRefresh" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh getQueryTableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh)get_store().find_element_user(QUERYTABLEREFRESH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queryTableRefresh" element
     */
    public boolean isSetQueryTableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYTABLEREFRESH$0) != 0;
        }
    }
    
    /**
     * Sets the "queryTableRefresh" element
     */
    public void setQueryTableRefresh(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh queryTableRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh)get_store().find_element_user(QUERYTABLEREFRESH$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh)get_store().add_element_user(QUERYTABLEREFRESH$0);
            }
            target.set(queryTableRefresh);
        }
    }
    
    /**
     * Appends and returns a new empty "queryTableRefresh" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh addNewQueryTableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh)get_store().add_element_user(QUERYTABLEREFRESH$0);
            return target;
        }
    }
    
    /**
     * Unsets the "queryTableRefresh" element
     */
    public void unsetQueryTableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYTABLEREFRESH$0, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "headers" attribute
     */
    public boolean getHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HEADERS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "headers" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADERS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HEADERS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "headers" attribute
     */
    public boolean isSetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERS$6) != null;
        }
    }
    
    /**
     * Sets the "headers" attribute
     */
    public void setHeaders(boolean headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERS$6);
            }
            target.setBooleanValue(headers);
        }
    }
    
    /**
     * Sets (as xml) the "headers" attribute
     */
    public void xsetHeaders(org.apache.xmlbeans.XmlBoolean headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADERS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HEADERS$6);
            }
            target.set(headers);
        }
    }
    
    /**
     * Unsets the "headers" attribute
     */
    public void unsetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERS$6);
        }
    }
    
    /**
     * Gets the "rowNumbers" attribute
     */
    public boolean getRowNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWNUMBERS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWNUMBERS$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowNumbers" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRowNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWNUMBERS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ROWNUMBERS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowNumbers" attribute
     */
    public boolean isSetRowNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWNUMBERS$8) != null;
        }
    }
    
    /**
     * Sets the "rowNumbers" attribute
     */
    public void setRowNumbers(boolean rowNumbers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWNUMBERS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWNUMBERS$8);
            }
            target.setBooleanValue(rowNumbers);
        }
    }
    
    /**
     * Sets (as xml) the "rowNumbers" attribute
     */
    public void xsetRowNumbers(org.apache.xmlbeans.XmlBoolean rowNumbers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWNUMBERS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROWNUMBERS$8);
            }
            target.set(rowNumbers);
        }
    }
    
    /**
     * Unsets the "rowNumbers" attribute
     */
    public void unsetRowNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWNUMBERS$8);
        }
    }
    
    /**
     * Gets the "disableRefresh" attribute
     */
    public boolean getDisableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEREFRESH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISABLEREFRESH$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disableRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEREFRESH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DISABLEREFRESH$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "disableRefresh" attribute
     */
    public boolean isSetDisableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLEREFRESH$10) != null;
        }
    }
    
    /**
     * Sets the "disableRefresh" attribute
     */
    public void setDisableRefresh(boolean disableRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEREFRESH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEREFRESH$10);
            }
            target.setBooleanValue(disableRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "disableRefresh" attribute
     */
    public void xsetDisableRefresh(org.apache.xmlbeans.XmlBoolean disableRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEREFRESH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLEREFRESH$10);
            }
            target.set(disableRefresh);
        }
    }
    
    /**
     * Unsets the "disableRefresh" attribute
     */
    public void unsetDisableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLEREFRESH$10);
        }
    }
    
    /**
     * Gets the "backgroundRefresh" attribute
     */
    public boolean getBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUNDREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BACKGROUNDREFRESH$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "backgroundRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUNDREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BACKGROUNDREFRESH$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "backgroundRefresh" attribute
     */
    public boolean isSetBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKGROUNDREFRESH$12) != null;
        }
    }
    
    /**
     * Sets the "backgroundRefresh" attribute
     */
    public void setBackgroundRefresh(boolean backgroundRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUNDREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKGROUNDREFRESH$12);
            }
            target.setBooleanValue(backgroundRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "backgroundRefresh" attribute
     */
    public void xsetBackgroundRefresh(org.apache.xmlbeans.XmlBoolean backgroundRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUNDREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BACKGROUNDREFRESH$12);
            }
            target.set(backgroundRefresh);
        }
    }
    
    /**
     * Unsets the "backgroundRefresh" attribute
     */
    public void unsetBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKGROUNDREFRESH$12);
        }
    }
    
    /**
     * Gets the "firstBackgroundRefresh" attribute
     */
    public boolean getFirstBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTBACKGROUNDREFRESH$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstBackgroundRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFirstBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIRSTBACKGROUNDREFRESH$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstBackgroundRefresh" attribute
     */
    public boolean isSetFirstBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTBACKGROUNDREFRESH$14) != null;
        }
    }
    
    /**
     * Sets the "firstBackgroundRefresh" attribute
     */
    public void setFirstBackgroundRefresh(boolean firstBackgroundRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            }
            target.setBooleanValue(firstBackgroundRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "firstBackgroundRefresh" attribute
     */
    public void xsetFirstBackgroundRefresh(org.apache.xmlbeans.XmlBoolean firstBackgroundRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIRSTBACKGROUNDREFRESH$14);
            }
            target.set(firstBackgroundRefresh);
        }
    }
    
    /**
     * Unsets the "firstBackgroundRefresh" attribute
     */
    public void unsetFirstBackgroundRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTBACKGROUNDREFRESH$14);
        }
    }
    
    /**
     * Gets the "refreshOnLoad" attribute
     */
    public boolean getRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHONLOAD$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshOnLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHONLOAD$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshOnLoad" attribute
     */
    public boolean isSetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHONLOAD$16) != null;
        }
    }
    
    /**
     * Sets the "refreshOnLoad" attribute
     */
    public void setRefreshOnLoad(boolean refreshOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHONLOAD$16);
            }
            target.setBooleanValue(refreshOnLoad);
        }
    }
    
    /**
     * Sets (as xml) the "refreshOnLoad" attribute
     */
    public void xsetRefreshOnLoad(org.apache.xmlbeans.XmlBoolean refreshOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHONLOAD$16);
            }
            target.set(refreshOnLoad);
        }
    }
    
    /**
     * Unsets the "refreshOnLoad" attribute
     */
    public void unsetRefreshOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHONLOAD$16);
        }
    }
    
    /**
     * Gets the "growShrinkType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType.Enum getGrowShrinkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROWSHRINKTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROWSHRINKTYPE$18);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "growShrinkType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType xgetGrowShrinkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType)get_store().find_attribute_user(GROWSHRINKTYPE$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType)get_default_attribute_value(GROWSHRINKTYPE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "growShrinkType" attribute
     */
    public boolean isSetGrowShrinkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROWSHRINKTYPE$18) != null;
        }
    }
    
    /**
     * Sets the "growShrinkType" attribute
     */
    public void setGrowShrinkType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType.Enum growShrinkType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROWSHRINKTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROWSHRINKTYPE$18);
            }
            target.setEnumValue(growShrinkType);
        }
    }
    
    /**
     * Sets (as xml) the "growShrinkType" attribute
     */
    public void xsetGrowShrinkType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType growShrinkType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType)get_store().find_attribute_user(GROWSHRINKTYPE$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGrowShrinkType)get_store().add_attribute_user(GROWSHRINKTYPE$18);
            }
            target.set(growShrinkType);
        }
    }
    
    /**
     * Unsets the "growShrinkType" attribute
     */
    public void unsetGrowShrinkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROWSHRINKTYPE$18);
        }
    }
    
    /**
     * Gets the "fillFormulas" attribute
     */
    public boolean getFillFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLFORMULAS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILLFORMULAS$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillFormulas" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFillFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILLFORMULAS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FILLFORMULAS$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "fillFormulas" attribute
     */
    public boolean isSetFillFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLFORMULAS$20) != null;
        }
    }
    
    /**
     * Sets the "fillFormulas" attribute
     */
    public void setFillFormulas(boolean fillFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLFORMULAS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLFORMULAS$20);
            }
            target.setBooleanValue(fillFormulas);
        }
    }
    
    /**
     * Sets (as xml) the "fillFormulas" attribute
     */
    public void xsetFillFormulas(org.apache.xmlbeans.XmlBoolean fillFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILLFORMULAS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILLFORMULAS$20);
            }
            target.set(fillFormulas);
        }
    }
    
    /**
     * Unsets the "fillFormulas" attribute
     */
    public void unsetFillFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLFORMULAS$20);
        }
    }
    
    /**
     * Gets the "removeDataOnSave" attribute
     */
    public boolean getRemoveDataOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVEDATAONSAVE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REMOVEDATAONSAVE$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "removeDataOnSave" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRemoveDataOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVEDATAONSAVE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REMOVEDATAONSAVE$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "removeDataOnSave" attribute
     */
    public boolean isSetRemoveDataOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOVEDATAONSAVE$22) != null;
        }
    }
    
    /**
     * Sets the "removeDataOnSave" attribute
     */
    public void setRemoveDataOnSave(boolean removeDataOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVEDATAONSAVE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOVEDATAONSAVE$22);
            }
            target.setBooleanValue(removeDataOnSave);
        }
    }
    
    /**
     * Sets (as xml) the "removeDataOnSave" attribute
     */
    public void xsetRemoveDataOnSave(org.apache.xmlbeans.XmlBoolean removeDataOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVEDATAONSAVE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REMOVEDATAONSAVE$22);
            }
            target.set(removeDataOnSave);
        }
    }
    
    /**
     * Unsets the "removeDataOnSave" attribute
     */
    public void unsetRemoveDataOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOVEDATAONSAVE$22);
        }
    }
    
    /**
     * Gets the "disableEdit" attribute
     */
    public boolean getDisableEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEEDIT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISABLEEDIT$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disableEdit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisableEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEEDIT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DISABLEEDIT$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "disableEdit" attribute
     */
    public boolean isSetDisableEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLEEDIT$24) != null;
        }
    }
    
    /**
     * Sets the "disableEdit" attribute
     */
    public void setDisableEdit(boolean disableEdit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEEDIT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEEDIT$24);
            }
            target.setBooleanValue(disableEdit);
        }
    }
    
    /**
     * Sets (as xml) the "disableEdit" attribute
     */
    public void xsetDisableEdit(org.apache.xmlbeans.XmlBoolean disableEdit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEEDIT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLEEDIT$24);
            }
            target.set(disableEdit);
        }
    }
    
    /**
     * Unsets the "disableEdit" attribute
     */
    public void unsetDisableEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLEEDIT$24);
        }
    }
    
    /**
     * Gets the "preserveFormatting" attribute
     */
    public boolean getPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMATTING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVEFORMATTING$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preserveFormatting" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMATTING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRESERVEFORMATTING$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "preserveFormatting" attribute
     */
    public boolean isSetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESERVEFORMATTING$26) != null;
        }
    }
    
    /**
     * Sets the "preserveFormatting" attribute
     */
    public void setPreserveFormatting(boolean preserveFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMATTING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVEFORMATTING$26);
            }
            target.setBooleanValue(preserveFormatting);
        }
    }
    
    /**
     * Sets (as xml) the "preserveFormatting" attribute
     */
    public void xsetPreserveFormatting(org.apache.xmlbeans.XmlBoolean preserveFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMATTING$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVEFORMATTING$26);
            }
            target.set(preserveFormatting);
        }
    }
    
    /**
     * Unsets the "preserveFormatting" attribute
     */
    public void unsetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESERVEFORMATTING$26);
        }
    }
    
    /**
     * Gets the "adjustColumnWidth" attribute
     */
    public boolean getAdjustColumnWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUSTCOLUMNWIDTH$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADJUSTCOLUMNWIDTH$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "adjustColumnWidth" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAdjustColumnWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADJUSTCOLUMNWIDTH$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ADJUSTCOLUMNWIDTH$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "adjustColumnWidth" attribute
     */
    public boolean isSetAdjustColumnWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADJUSTCOLUMNWIDTH$28) != null;
        }
    }
    
    /**
     * Sets the "adjustColumnWidth" attribute
     */
    public void setAdjustColumnWidth(boolean adjustColumnWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUSTCOLUMNWIDTH$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADJUSTCOLUMNWIDTH$28);
            }
            target.setBooleanValue(adjustColumnWidth);
        }
    }
    
    /**
     * Sets (as xml) the "adjustColumnWidth" attribute
     */
    public void xsetAdjustColumnWidth(org.apache.xmlbeans.XmlBoolean adjustColumnWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ADJUSTCOLUMNWIDTH$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ADJUSTCOLUMNWIDTH$28);
            }
            target.set(adjustColumnWidth);
        }
    }
    
    /**
     * Unsets the "adjustColumnWidth" attribute
     */
    public void unsetAdjustColumnWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADJUSTCOLUMNWIDTH$28);
        }
    }
    
    /**
     * Gets the "intermediate" attribute
     */
    public boolean getIntermediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERMEDIATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERMEDIATE$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "intermediate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIntermediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERMEDIATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INTERMEDIATE$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "intermediate" attribute
     */
    public boolean isSetIntermediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERMEDIATE$30) != null;
        }
    }
    
    /**
     * Sets the "intermediate" attribute
     */
    public void setIntermediate(boolean intermediate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERMEDIATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERMEDIATE$30);
            }
            target.setBooleanValue(intermediate);
        }
    }
    
    /**
     * Sets (as xml) the "intermediate" attribute
     */
    public void xsetIntermediate(org.apache.xmlbeans.XmlBoolean intermediate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTERMEDIATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INTERMEDIATE$30);
            }
            target.set(intermediate);
        }
    }
    
    /**
     * Unsets the "intermediate" attribute
     */
    public void unsetIntermediate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERMEDIATE$30);
        }
    }
    
    /**
     * Gets the "connectionId" attribute
     */
    public long getConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$32);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectionId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$32);
            return target;
        }
    }
    
    /**
     * Sets the "connectionId" attribute
     */
    public void setConnectionId(long connectionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONID$32);
            }
            target.setLongValue(connectionId);
        }
    }
    
    /**
     * Sets (as xml) the "connectionId" attribute
     */
    public void xsetConnectionId(org.apache.xmlbeans.XmlUnsignedInt connectionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CONNECTIONID$32);
            }
            target.set(connectionId);
        }
    }
    
    /**
     * Gets the "autoFormatId" attribute
     */
    public long getAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$34);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoFormatId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$34);
            return target;
        }
    }
    
    /**
     * True if has "autoFormatId" attribute
     */
    public boolean isSetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFORMATID$34) != null;
        }
    }
    
    /**
     * Sets the "autoFormatId" attribute
     */
    public void setAutoFormatId(long autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFORMATID$34);
            }
            target.setLongValue(autoFormatId);
        }
    }
    
    /**
     * Sets (as xml) the "autoFormatId" attribute
     */
    public void xsetAutoFormatId(org.apache.xmlbeans.XmlUnsignedInt autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(AUTOFORMATID$34);
            }
            target.set(autoFormatId);
        }
    }
    
    /**
     * Unsets the "autoFormatId" attribute
     */
    public void unsetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFORMATID$34);
        }
    }
    
    /**
     * Gets the "applyNumberFormats" attribute
     */
    public boolean getApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$36);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyNumberFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$36);
            return target;
        }
    }
    
    /**
     * True if has "applyNumberFormats" attribute
     */
    public boolean isSetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYNUMBERFORMATS$36) != null;
        }
    }
    
    /**
     * Sets the "applyNumberFormats" attribute
     */
    public void setApplyNumberFormats(boolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYNUMBERFORMATS$36);
            }
            target.setBooleanValue(applyNumberFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyNumberFormats" attribute
     */
    public void xsetApplyNumberFormats(org.apache.xmlbeans.XmlBoolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYNUMBERFORMATS$36);
            }
            target.set(applyNumberFormats);
        }
    }
    
    /**
     * Unsets the "applyNumberFormats" attribute
     */
    public void unsetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYNUMBERFORMATS$36);
        }
    }
    
    /**
     * Gets the "applyBorderFormats" attribute
     */
    public boolean getApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$38);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyBorderFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$38);
            return target;
        }
    }
    
    /**
     * True if has "applyBorderFormats" attribute
     */
    public boolean isSetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYBORDERFORMATS$38) != null;
        }
    }
    
    /**
     * Sets the "applyBorderFormats" attribute
     */
    public void setApplyBorderFormats(boolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYBORDERFORMATS$38);
            }
            target.setBooleanValue(applyBorderFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyBorderFormats" attribute
     */
    public void xsetApplyBorderFormats(org.apache.xmlbeans.XmlBoolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYBORDERFORMATS$38);
            }
            target.set(applyBorderFormats);
        }
    }
    
    /**
     * Unsets the "applyBorderFormats" attribute
     */
    public void unsetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYBORDERFORMATS$38);
        }
    }
    
    /**
     * Gets the "applyFontFormats" attribute
     */
    public boolean getApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$40);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyFontFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$40);
            return target;
        }
    }
    
    /**
     * True if has "applyFontFormats" attribute
     */
    public boolean isSetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFONTFORMATS$40) != null;
        }
    }
    
    /**
     * Sets the "applyFontFormats" attribute
     */
    public void setApplyFontFormats(boolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFONTFORMATS$40);
            }
            target.setBooleanValue(applyFontFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyFontFormats" attribute
     */
    public void xsetApplyFontFormats(org.apache.xmlbeans.XmlBoolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFONTFORMATS$40);
            }
            target.set(applyFontFormats);
        }
    }
    
    /**
     * Unsets the "applyFontFormats" attribute
     */
    public void unsetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFONTFORMATS$40);
        }
    }
    
    /**
     * Gets the "applyPatternFormats" attribute
     */
    public boolean getApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyPatternFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$42);
            return target;
        }
    }
    
    /**
     * True if has "applyPatternFormats" attribute
     */
    public boolean isSetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYPATTERNFORMATS$42) != null;
        }
    }
    
    /**
     * Sets the "applyPatternFormats" attribute
     */
    public void setApplyPatternFormats(boolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYPATTERNFORMATS$42);
            }
            target.setBooleanValue(applyPatternFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyPatternFormats" attribute
     */
    public void xsetApplyPatternFormats(org.apache.xmlbeans.XmlBoolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYPATTERNFORMATS$42);
            }
            target.set(applyPatternFormats);
        }
    }
    
    /**
     * Unsets the "applyPatternFormats" attribute
     */
    public void unsetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYPATTERNFORMATS$42);
        }
    }
    
    /**
     * Gets the "applyAlignmentFormats" attribute
     */
    public boolean getApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$44);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyAlignmentFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$44);
            return target;
        }
    }
    
    /**
     * True if has "applyAlignmentFormats" attribute
     */
    public boolean isSetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYALIGNMENTFORMATS$44) != null;
        }
    }
    
    /**
     * Sets the "applyAlignmentFormats" attribute
     */
    public void setApplyAlignmentFormats(boolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$44);
            }
            target.setBooleanValue(applyAlignmentFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyAlignmentFormats" attribute
     */
    public void xsetApplyAlignmentFormats(org.apache.xmlbeans.XmlBoolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$44);
            }
            target.set(applyAlignmentFormats);
        }
    }
    
    /**
     * Unsets the "applyAlignmentFormats" attribute
     */
    public void unsetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYALIGNMENTFORMATS$44);
        }
    }
    
    /**
     * Gets the "applyWidthHeightFormats" attribute
     */
    public boolean getApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyWidthHeightFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            return target;
        }
    }
    
    /**
     * True if has "applyWidthHeightFormats" attribute
     */
    public boolean isSetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$46) != null;
        }
    }
    
    /**
     * Sets the "applyWidthHeightFormats" attribute
     */
    public void setApplyWidthHeightFormats(boolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            }
            target.setBooleanValue(applyWidthHeightFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyWidthHeightFormats" attribute
     */
    public void xsetApplyWidthHeightFormats(org.apache.xmlbeans.XmlBoolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$46);
            }
            target.set(applyWidthHeightFormats);
        }
    }
    
    /**
     * Unsets the "applyWidthHeightFormats" attribute
     */
    public void unsetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYWIDTHHEIGHTFORMATS$46);
        }
    }
}
