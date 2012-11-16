/*
 * XML Type:  CT_RevisionDefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionDefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionDefinedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionDefinedName
{
    
    public CTRevisionDefinedNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula");
    private static final javax.xml.namespace.QName OLDFORMULA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oldFormula");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName RID$6 = 
        new javax.xml.namespace.QName("", "rId");
    private static final javax.xml.namespace.QName UA$8 = 
        new javax.xml.namespace.QName("", "ua");
    private static final javax.xml.namespace.QName RA$10 = 
        new javax.xml.namespace.QName("", "ra");
    private static final javax.xml.namespace.QName LOCALSHEETID$12 = 
        new javax.xml.namespace.QName("", "localSheetId");
    private static final javax.xml.namespace.QName CUSTOMVIEW$14 = 
        new javax.xml.namespace.QName("", "customView");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName FUNCTION$18 = 
        new javax.xml.namespace.QName("", "function");
    private static final javax.xml.namespace.QName OLDFUNCTION$20 = 
        new javax.xml.namespace.QName("", "oldFunction");
    private static final javax.xml.namespace.QName FUNCTIONGROUPID$22 = 
        new javax.xml.namespace.QName("", "functionGroupId");
    private static final javax.xml.namespace.QName OLDFUNCTIONGROUPID$24 = 
        new javax.xml.namespace.QName("", "oldFunctionGroupId");
    private static final javax.xml.namespace.QName SHORTCUTKEY$26 = 
        new javax.xml.namespace.QName("", "shortcutKey");
    private static final javax.xml.namespace.QName OLDSHORTCUTKEY$28 = 
        new javax.xml.namespace.QName("", "oldShortcutKey");
    private static final javax.xml.namespace.QName HIDDEN$30 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName OLDHIDDEN$32 = 
        new javax.xml.namespace.QName("", "oldHidden");
    private static final javax.xml.namespace.QName CUSTOMMENU$34 = 
        new javax.xml.namespace.QName("", "customMenu");
    private static final javax.xml.namespace.QName OLDCUSTOMMENU$36 = 
        new javax.xml.namespace.QName("", "oldCustomMenu");
    private static final javax.xml.namespace.QName DESCRIPTION$38 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName OLDDESCRIPTION$40 = 
        new javax.xml.namespace.QName("", "oldDescription");
    private static final javax.xml.namespace.QName HELP$42 = 
        new javax.xml.namespace.QName("", "help");
    private static final javax.xml.namespace.QName OLDHELP$44 = 
        new javax.xml.namespace.QName("", "oldHelp");
    private static final javax.xml.namespace.QName STATUSBAR$46 = 
        new javax.xml.namespace.QName("", "statusBar");
    private static final javax.xml.namespace.QName OLDSTATUSBAR$48 = 
        new javax.xml.namespace.QName("", "oldStatusBar");
    private static final javax.xml.namespace.QName COMMENT$50 = 
        new javax.xml.namespace.QName("", "comment");
    private static final javax.xml.namespace.QName OLDCOMMENT$52 = 
        new javax.xml.namespace.QName("", "oldComment");
    
    
    /**
     * Gets the "formula" element
     */
    public java.lang.String getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "formula" element
     */
    public boolean isSetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA$0) != 0;
        }
    }
    
    /**
     * Sets the "formula" element
     */
    public void setFormula(java.lang.String formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULA$0);
            }
            target.setStringValue(formula);
        }
    }
    
    /**
     * Sets (as xml) the "formula" element
     */
    public void xsetFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(FORMULA$0);
            }
            target.set(formula);
        }
    }
    
    /**
     * Unsets the "formula" element
     */
    public void unsetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA$0, 0);
        }
    }
    
    /**
     * Gets the "oldFormula" element
     */
    public java.lang.String getOldFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDFORMULA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldFormula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetOldFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(OLDFORMULA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "oldFormula" element
     */
    public boolean isSetOldFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDFORMULA$2) != 0;
        }
    }
    
    /**
     * Sets the "oldFormula" element
     */
    public void setOldFormula(java.lang.String oldFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDFORMULA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDFORMULA$2);
            }
            target.setStringValue(oldFormula);
        }
    }
    
    /**
     * Sets (as xml) the "oldFormula" element
     */
    public void xsetOldFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula oldFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(OLDFORMULA$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(OLDFORMULA$2);
            }
            target.set(oldFormula);
        }
    }
    
    /**
     * Unsets the "oldFormula" element
     */
    public void unsetOldFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDFORMULA$2, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "rId" attribute
     */
    public long getRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$6);
            return target;
        }
    }
    
    /**
     * Sets the "rId" attribute
     */
    public void setRId(long rId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RID$6);
            }
            target.setLongValue(rId);
        }
    }
    
    /**
     * Sets (as xml) the "rId" attribute
     */
    public void xsetRId(org.apache.xmlbeans.XmlUnsignedInt rId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RID$6);
            }
            target.set(rId);
        }
    }
    
    /**
     * Gets the "ua" attribute
     */
    public boolean getUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UA$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ua" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UA$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "ua" attribute
     */
    public boolean isSetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UA$8) != null;
        }
    }
    
    /**
     * Sets the "ua" attribute
     */
    public void setUa(boolean ua)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UA$8);
            }
            target.setBooleanValue(ua);
        }
    }
    
    /**
     * Sets (as xml) the "ua" attribute
     */
    public void xsetUa(org.apache.xmlbeans.XmlBoolean ua)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UA$8);
            }
            target.set(ua);
        }
    }
    
    /**
     * Unsets the "ua" attribute
     */
    public void unsetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UA$8);
        }
    }
    
    /**
     * Gets the "ra" attribute
     */
    public boolean getRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RA$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ra" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RA$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "ra" attribute
     */
    public boolean isSetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RA$10) != null;
        }
    }
    
    /**
     * Sets the "ra" attribute
     */
    public void setRa(boolean ra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RA$10);
            }
            target.setBooleanValue(ra);
        }
    }
    
    /**
     * Sets (as xml) the "ra" attribute
     */
    public void xsetRa(org.apache.xmlbeans.XmlBoolean ra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RA$10);
            }
            target.set(ra);
        }
    }
    
    /**
     * Unsets the "ra" attribute
     */
    public void unsetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RA$10);
        }
    }
    
    /**
     * Gets the "localSheetId" attribute
     */
    public long getLocalSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALSHEETID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "localSheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLocalSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LOCALSHEETID$12);
            return target;
        }
    }
    
    /**
     * True if has "localSheetId" attribute
     */
    public boolean isSetLocalSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCALSHEETID$12) != null;
        }
    }
    
    /**
     * Sets the "localSheetId" attribute
     */
    public void setLocalSheetId(long localSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALSHEETID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALSHEETID$12);
            }
            target.setLongValue(localSheetId);
        }
    }
    
    /**
     * Sets (as xml) the "localSheetId" attribute
     */
    public void xsetLocalSheetId(org.apache.xmlbeans.XmlUnsignedInt localSheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LOCALSHEETID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LOCALSHEETID$12);
            }
            target.set(localSheetId);
        }
    }
    
    /**
     * Unsets the "localSheetId" attribute
     */
    public void unsetLocalSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCALSHEETID$12);
        }
    }
    
    /**
     * Gets the "customView" attribute
     */
    public boolean getCustomView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMVIEW$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customView" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMVIEW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "customView" attribute
     */
    public boolean isSetCustomView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMVIEW$14) != null;
        }
    }
    
    /**
     * Sets the "customView" attribute
     */
    public void setCustomView(boolean customView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMVIEW$14);
            }
            target.setBooleanValue(customView);
        }
    }
    
    /**
     * Sets (as xml) the "customView" attribute
     */
    public void xsetCustomView(org.apache.xmlbeans.XmlBoolean customView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMVIEW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMVIEW$14);
            }
            target.set(customView);
        }
    }
    
    /**
     * Unsets the "customView" attribute
     */
    public void unsetCustomView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMVIEW$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$16);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "function" attribute
     */
    public boolean getFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FUNCTION$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "function" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FUNCTION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FUNCTION$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "function" attribute
     */
    public boolean isSetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FUNCTION$18) != null;
        }
    }
    
    /**
     * Sets the "function" attribute
     */
    public void setFunction(boolean function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTION$18);
            }
            target.setBooleanValue(function);
        }
    }
    
    /**
     * Sets (as xml) the "function" attribute
     */
    public void xsetFunction(org.apache.xmlbeans.XmlBoolean function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FUNCTION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FUNCTION$18);
            }
            target.set(function);
        }
    }
    
    /**
     * Unsets the "function" attribute
     */
    public void unsetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FUNCTION$18);
        }
    }
    
    /**
     * Gets the "oldFunction" attribute
     */
    public boolean getOldFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDFUNCTION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLDFUNCTION$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldFunction" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOldFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDFUNCTION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLDFUNCTION$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "oldFunction" attribute
     */
    public boolean isSetOldFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDFUNCTION$20) != null;
        }
    }
    
    /**
     * Sets the "oldFunction" attribute
     */
    public void setOldFunction(boolean oldFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDFUNCTION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDFUNCTION$20);
            }
            target.setBooleanValue(oldFunction);
        }
    }
    
    /**
     * Sets (as xml) the "oldFunction" attribute
     */
    public void xsetOldFunction(org.apache.xmlbeans.XmlBoolean oldFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDFUNCTION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLDFUNCTION$20);
            }
            target.set(oldFunction);
        }
    }
    
    /**
     * Unsets the "oldFunction" attribute
     */
    public void unsetOldFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDFUNCTION$20);
        }
    }
    
    /**
     * Gets the "functionGroupId" attribute
     */
    public short getFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "functionGroupId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            return target;
        }
    }
    
    /**
     * True if has "functionGroupId" attribute
     */
    public boolean isSetFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FUNCTIONGROUPID$22) != null;
        }
    }
    
    /**
     * Sets the "functionGroupId" attribute
     */
    public void setFunctionGroupId(short functionGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTIONGROUPID$22);
            }
            target.setShortValue(functionGroupId);
        }
    }
    
    /**
     * Sets (as xml) the "functionGroupId" attribute
     */
    public void xsetFunctionGroupId(org.apache.xmlbeans.XmlUnsignedByte functionGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(FUNCTIONGROUPID$22);
            }
            target.set(functionGroupId);
        }
    }
    
    /**
     * Unsets the "functionGroupId" attribute
     */
    public void unsetFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FUNCTIONGROUPID$22);
        }
    }
    
    /**
     * Gets the "oldFunctionGroupId" attribute
     */
    public short getOldFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDFUNCTIONGROUPID$24);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldFunctionGroupId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOldFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OLDFUNCTIONGROUPID$24);
            return target;
        }
    }
    
    /**
     * True if has "oldFunctionGroupId" attribute
     */
    public boolean isSetOldFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDFUNCTIONGROUPID$24) != null;
        }
    }
    
    /**
     * Sets the "oldFunctionGroupId" attribute
     */
    public void setOldFunctionGroupId(short oldFunctionGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDFUNCTIONGROUPID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDFUNCTIONGROUPID$24);
            }
            target.setShortValue(oldFunctionGroupId);
        }
    }
    
    /**
     * Sets (as xml) the "oldFunctionGroupId" attribute
     */
    public void xsetOldFunctionGroupId(org.apache.xmlbeans.XmlUnsignedByte oldFunctionGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OLDFUNCTIONGROUPID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OLDFUNCTIONGROUPID$24);
            }
            target.set(oldFunctionGroupId);
        }
    }
    
    /**
     * Unsets the "oldFunctionGroupId" attribute
     */
    public void unsetOldFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDFUNCTIONGROUPID$24);
        }
    }
    
    /**
     * Gets the "shortcutKey" attribute
     */
    public short getShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTCUTKEY$26);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "shortcutKey" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(SHORTCUTKEY$26);
            return target;
        }
    }
    
    /**
     * True if has "shortcutKey" attribute
     */
    public boolean isSetShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHORTCUTKEY$26) != null;
        }
    }
    
    /**
     * Sets the "shortcutKey" attribute
     */
    public void setShortcutKey(short shortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTCUTKEY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTCUTKEY$26);
            }
            target.setShortValue(shortcutKey);
        }
    }
    
    /**
     * Sets (as xml) the "shortcutKey" attribute
     */
    public void xsetShortcutKey(org.apache.xmlbeans.XmlUnsignedByte shortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(SHORTCUTKEY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(SHORTCUTKEY$26);
            }
            target.set(shortcutKey);
        }
    }
    
    /**
     * Unsets the "shortcutKey" attribute
     */
    public void unsetShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHORTCUTKEY$26);
        }
    }
    
    /**
     * Gets the "oldShortcutKey" attribute
     */
    public short getOldShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDSHORTCUTKEY$28);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldShortcutKey" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOldShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OLDSHORTCUTKEY$28);
            return target;
        }
    }
    
    /**
     * True if has "oldShortcutKey" attribute
     */
    public boolean isSetOldShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDSHORTCUTKEY$28) != null;
        }
    }
    
    /**
     * Sets the "oldShortcutKey" attribute
     */
    public void setOldShortcutKey(short oldShortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDSHORTCUTKEY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDSHORTCUTKEY$28);
            }
            target.setShortValue(oldShortcutKey);
        }
    }
    
    /**
     * Sets (as xml) the "oldShortcutKey" attribute
     */
    public void xsetOldShortcutKey(org.apache.xmlbeans.XmlUnsignedByte oldShortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OLDSHORTCUTKEY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OLDSHORTCUTKEY$28);
            }
            target.set(oldShortcutKey);
        }
    }
    
    /**
     * Unsets the "oldShortcutKey" attribute
     */
    public void unsetOldShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDSHORTCUTKEY$28);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$30) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$30);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$30);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$30);
        }
    }
    
    /**
     * Gets the "oldHidden" attribute
     */
    public boolean getOldHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDHIDDEN$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLDHIDDEN$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldHidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOldHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDHIDDEN$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLDHIDDEN$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "oldHidden" attribute
     */
    public boolean isSetOldHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDHIDDEN$32) != null;
        }
    }
    
    /**
     * Sets the "oldHidden" attribute
     */
    public void setOldHidden(boolean oldHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDHIDDEN$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDHIDDEN$32);
            }
            target.setBooleanValue(oldHidden);
        }
    }
    
    /**
     * Sets (as xml) the "oldHidden" attribute
     */
    public void xsetOldHidden(org.apache.xmlbeans.XmlBoolean oldHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDHIDDEN$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLDHIDDEN$32);
            }
            target.set(oldHidden);
        }
    }
    
    /**
     * Unsets the "oldHidden" attribute
     */
    public void unsetOldHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDHIDDEN$32);
        }
    }
    
    /**
     * Gets the "customMenu" attribute
     */
    public java.lang.String getCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMMENU$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "customMenu" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMMENU$34);
            return target;
        }
    }
    
    /**
     * True if has "customMenu" attribute
     */
    public boolean isSetCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMMENU$34) != null;
        }
    }
    
    /**
     * Sets the "customMenu" attribute
     */
    public void setCustomMenu(java.lang.String customMenu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMMENU$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMMENU$34);
            }
            target.setStringValue(customMenu);
        }
    }
    
    /**
     * Sets (as xml) the "customMenu" attribute
     */
    public void xsetCustomMenu(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring customMenu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMMENU$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CUSTOMMENU$34);
            }
            target.set(customMenu);
        }
    }
    
    /**
     * Unsets the "customMenu" attribute
     */
    public void unsetCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMMENU$34);
        }
    }
    
    /**
     * Gets the "oldCustomMenu" attribute
     */
    public java.lang.String getOldCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDCUSTOMMENU$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldCustomMenu" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOldCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDCUSTOMMENU$36);
            return target;
        }
    }
    
    /**
     * True if has "oldCustomMenu" attribute
     */
    public boolean isSetOldCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDCUSTOMMENU$36) != null;
        }
    }
    
    /**
     * Sets the "oldCustomMenu" attribute
     */
    public void setOldCustomMenu(java.lang.String oldCustomMenu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDCUSTOMMENU$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDCUSTOMMENU$36);
            }
            target.setStringValue(oldCustomMenu);
        }
    }
    
    /**
     * Sets (as xml) the "oldCustomMenu" attribute
     */
    public void xsetOldCustomMenu(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oldCustomMenu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDCUSTOMMENU$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(OLDCUSTOMMENU$36);
            }
            target.set(oldCustomMenu);
        }
    }
    
    /**
     * Unsets the "oldCustomMenu" attribute
     */
    public void unsetOldCustomMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDCUSTOMMENU$36);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$38);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$38) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$38);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DESCRIPTION$38);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$38);
        }
    }
    
    /**
     * Gets the "oldDescription" attribute
     */
    public java.lang.String getOldDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDDESCRIPTION$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldDescription" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOldDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDDESCRIPTION$40);
            return target;
        }
    }
    
    /**
     * True if has "oldDescription" attribute
     */
    public boolean isSetOldDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDDESCRIPTION$40) != null;
        }
    }
    
    /**
     * Sets the "oldDescription" attribute
     */
    public void setOldDescription(java.lang.String oldDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDDESCRIPTION$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDDESCRIPTION$40);
            }
            target.setStringValue(oldDescription);
        }
    }
    
    /**
     * Sets (as xml) the "oldDescription" attribute
     */
    public void xsetOldDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oldDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDDESCRIPTION$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(OLDDESCRIPTION$40);
            }
            target.set(oldDescription);
        }
    }
    
    /**
     * Unsets the "oldDescription" attribute
     */
    public void unsetOldDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDDESCRIPTION$40);
        }
    }
    
    /**
     * Gets the "help" attribute
     */
    public java.lang.String getHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HELP$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "help" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HELP$42);
            return target;
        }
    }
    
    /**
     * True if has "help" attribute
     */
    public boolean isSetHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HELP$42) != null;
        }
    }
    
    /**
     * Sets the "help" attribute
     */
    public void setHelp(java.lang.String help)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HELP$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HELP$42);
            }
            target.setStringValue(help);
        }
    }
    
    /**
     * Sets (as xml) the "help" attribute
     */
    public void xsetHelp(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring help)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HELP$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(HELP$42);
            }
            target.set(help);
        }
    }
    
    /**
     * Unsets the "help" attribute
     */
    public void unsetHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HELP$42);
        }
    }
    
    /**
     * Gets the "oldHelp" attribute
     */
    public java.lang.String getOldHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDHELP$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldHelp" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOldHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDHELP$44);
            return target;
        }
    }
    
    /**
     * True if has "oldHelp" attribute
     */
    public boolean isSetOldHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDHELP$44) != null;
        }
    }
    
    /**
     * Sets the "oldHelp" attribute
     */
    public void setOldHelp(java.lang.String oldHelp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDHELP$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDHELP$44);
            }
            target.setStringValue(oldHelp);
        }
    }
    
    /**
     * Sets (as xml) the "oldHelp" attribute
     */
    public void xsetOldHelp(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oldHelp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDHELP$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(OLDHELP$44);
            }
            target.set(oldHelp);
        }
    }
    
    /**
     * Unsets the "oldHelp" attribute
     */
    public void unsetOldHelp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDHELP$44);
        }
    }
    
    /**
     * Gets the "statusBar" attribute
     */
    public java.lang.String getStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSBAR$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusBar" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUSBAR$46);
            return target;
        }
    }
    
    /**
     * True if has "statusBar" attribute
     */
    public boolean isSetStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUSBAR$46) != null;
        }
    }
    
    /**
     * Sets the "statusBar" attribute
     */
    public void setStatusBar(java.lang.String statusBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSBAR$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUSBAR$46);
            }
            target.setStringValue(statusBar);
        }
    }
    
    /**
     * Sets (as xml) the "statusBar" attribute
     */
    public void xsetStatusBar(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring statusBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUSBAR$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STATUSBAR$46);
            }
            target.set(statusBar);
        }
    }
    
    /**
     * Unsets the "statusBar" attribute
     */
    public void unsetStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUSBAR$46);
        }
    }
    
    /**
     * Gets the "oldStatusBar" attribute
     */
    public java.lang.String getOldStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDSTATUSBAR$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldStatusBar" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOldStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDSTATUSBAR$48);
            return target;
        }
    }
    
    /**
     * True if has "oldStatusBar" attribute
     */
    public boolean isSetOldStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDSTATUSBAR$48) != null;
        }
    }
    
    /**
     * Sets the "oldStatusBar" attribute
     */
    public void setOldStatusBar(java.lang.String oldStatusBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDSTATUSBAR$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDSTATUSBAR$48);
            }
            target.setStringValue(oldStatusBar);
        }
    }
    
    /**
     * Sets (as xml) the "oldStatusBar" attribute
     */
    public void xsetOldStatusBar(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oldStatusBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDSTATUSBAR$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(OLDSTATUSBAR$48);
            }
            target.set(oldStatusBar);
        }
    }
    
    /**
     * Unsets the "oldStatusBar" attribute
     */
    public void unsetOldStatusBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDSTATUSBAR$48);
        }
    }
    
    /**
     * Gets the "comment" attribute
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "comment" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$50);
            return target;
        }
    }
    
    /**
     * True if has "comment" attribute
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMENT$50) != null;
        }
    }
    
    /**
     * Sets the "comment" attribute
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENT$50);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "comment" attribute
     */
    public void xsetComment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COMMENT$50);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "comment" attribute
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMENT$50);
        }
    }
    
    /**
     * Gets the "oldComment" attribute
     */
    public java.lang.String getOldComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDCOMMENT$52);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldComment" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOldComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDCOMMENT$52);
            return target;
        }
    }
    
    /**
     * True if has "oldComment" attribute
     */
    public boolean isSetOldComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDCOMMENT$52) != null;
        }
    }
    
    /**
     * Sets the "oldComment" attribute
     */
    public void setOldComment(java.lang.String oldComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDCOMMENT$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDCOMMENT$52);
            }
            target.setStringValue(oldComment);
        }
    }
    
    /**
     * Sets (as xml) the "oldComment" attribute
     */
    public void xsetOldComment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oldComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(OLDCOMMENT$52);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(OLDCOMMENT$52);
            }
            target.set(oldComment);
        }
    }
    
    /**
     * Unsets the "oldComment" attribute
     */
    public void unsetOldComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDCOMMENT$52);
        }
    }
}
