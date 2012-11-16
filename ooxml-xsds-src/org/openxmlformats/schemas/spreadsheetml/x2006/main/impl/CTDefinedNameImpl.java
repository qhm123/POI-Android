/*
 * XML Type:  CT_DefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName.
 */
public class CTDefinedNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName
{
    
    public CTDefinedNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CTDefinedNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName COMMENT$2 = 
        new javax.xml.namespace.QName("", "comment");
    private static final javax.xml.namespace.QName CUSTOMMENU$4 = 
        new javax.xml.namespace.QName("", "customMenu");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName HELP$8 = 
        new javax.xml.namespace.QName("", "help");
    private static final javax.xml.namespace.QName STATUSBAR$10 = 
        new javax.xml.namespace.QName("", "statusBar");
    private static final javax.xml.namespace.QName LOCALSHEETID$12 = 
        new javax.xml.namespace.QName("", "localSheetId");
    private static final javax.xml.namespace.QName HIDDEN$14 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName FUNCTION$16 = 
        new javax.xml.namespace.QName("", "function");
    private static final javax.xml.namespace.QName VBPROCEDURE$18 = 
        new javax.xml.namespace.QName("", "vbProcedure");
    private static final javax.xml.namespace.QName XLM$20 = 
        new javax.xml.namespace.QName("", "xlm");
    private static final javax.xml.namespace.QName FUNCTIONGROUPID$22 = 
        new javax.xml.namespace.QName("", "functionGroupId");
    private static final javax.xml.namespace.QName SHORTCUTKEY$24 = 
        new javax.xml.namespace.QName("", "shortcutKey");
    private static final javax.xml.namespace.QName PUBLISHTOSERVER$26 = 
        new javax.xml.namespace.QName("", "publishToServer");
    private static final javax.xml.namespace.QName WORKBOOKPARAMETER$28 = 
        new javax.xml.namespace.QName("", "workbookParameter");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$2);
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
            return get_store().find_attribute_user(COMMENT$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENT$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COMMENT$2);
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
            get_store().remove_attribute(COMMENT$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMMENU$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMMENU$4);
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
            return get_store().find_attribute_user(CUSTOMMENU$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMMENU$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMMENU$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMMENU$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CUSTOMMENU$4);
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
            get_store().remove_attribute(CUSTOMMENU$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$6);
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
            return get_store().find_attribute_user(DESCRIPTION$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DESCRIPTION$6);
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
            get_store().remove_attribute(DESCRIPTION$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HELP$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HELP$8);
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
            return get_store().find_attribute_user(HELP$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HELP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HELP$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HELP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(HELP$8);
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
            get_store().remove_attribute(HELP$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSBAR$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUSBAR$10);
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
            return get_store().find_attribute_user(STATUSBAR$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSBAR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUSBAR$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STATUSBAR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STATUSBAR$10);
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
            get_store().remove_attribute(STATUSBAR$10);
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
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$14);
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
            return get_store().find_attribute_user(HIDDEN$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$14);
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
            get_store().remove_attribute(HIDDEN$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FUNCTION$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FUNCTION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FUNCTION$16);
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
            return get_store().find_attribute_user(FUNCTION$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTION$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FUNCTION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FUNCTION$16);
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
            get_store().remove_attribute(FUNCTION$16);
        }
    }
    
    /**
     * Gets the "vbProcedure" attribute
     */
    public boolean getVbProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VBPROCEDURE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VBPROCEDURE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "vbProcedure" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVbProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VBPROCEDURE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VBPROCEDURE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "vbProcedure" attribute
     */
    public boolean isSetVbProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VBPROCEDURE$18) != null;
        }
    }
    
    /**
     * Sets the "vbProcedure" attribute
     */
    public void setVbProcedure(boolean vbProcedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VBPROCEDURE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VBPROCEDURE$18);
            }
            target.setBooleanValue(vbProcedure);
        }
    }
    
    /**
     * Sets (as xml) the "vbProcedure" attribute
     */
    public void xsetVbProcedure(org.apache.xmlbeans.XmlBoolean vbProcedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VBPROCEDURE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VBPROCEDURE$18);
            }
            target.set(vbProcedure);
        }
    }
    
    /**
     * Unsets the "vbProcedure" attribute
     */
    public void unsetVbProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VBPROCEDURE$18);
        }
    }
    
    /**
     * Gets the "xlm" attribute
     */
    public boolean getXlm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XLM$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XLM$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xlm" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXlm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XLM$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XLM$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "xlm" attribute
     */
    public boolean isSetXlm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XLM$20) != null;
        }
    }
    
    /**
     * Sets the "xlm" attribute
     */
    public void setXlm(boolean xlm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XLM$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XLM$20);
            }
            target.setBooleanValue(xlm);
        }
    }
    
    /**
     * Sets (as xml) the "xlm" attribute
     */
    public void xsetXlm(org.apache.xmlbeans.XmlBoolean xlm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XLM$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XLM$20);
            }
            target.set(xlm);
        }
    }
    
    /**
     * Unsets the "xlm" attribute
     */
    public void unsetXlm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XLM$20);
        }
    }
    
    /**
     * Gets the "functionGroupId" attribute
     */
    public long getFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "functionGroupId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFunctionGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FUNCTIONGROUPID$22);
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
    public void setFunctionGroupId(long functionGroupId)
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
            target.setLongValue(functionGroupId);
        }
    }
    
    /**
     * Sets (as xml) the "functionGroupId" attribute
     */
    public void xsetFunctionGroupId(org.apache.xmlbeans.XmlUnsignedInt functionGroupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FUNCTIONGROUPID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FUNCTIONGROUPID$22);
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
     * Gets the "shortcutKey" attribute
     */
    public java.lang.String getShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTCUTKEY$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shortcutKey" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetShortcutKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SHORTCUTKEY$24);
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
            return get_store().find_attribute_user(SHORTCUTKEY$24) != null;
        }
    }
    
    /**
     * Sets the "shortcutKey" attribute
     */
    public void setShortcutKey(java.lang.String shortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTCUTKEY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTCUTKEY$24);
            }
            target.setStringValue(shortcutKey);
        }
    }
    
    /**
     * Sets (as xml) the "shortcutKey" attribute
     */
    public void xsetShortcutKey(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring shortcutKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SHORTCUTKEY$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SHORTCUTKEY$24);
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
            get_store().remove_attribute(SHORTCUTKEY$24);
        }
    }
    
    /**
     * Gets the "publishToServer" attribute
     */
    public boolean getPublishToServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHTOSERVER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHTOSERVER$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "publishToServer" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublishToServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHTOSERVER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHTOSERVER$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "publishToServer" attribute
     */
    public boolean isSetPublishToServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHTOSERVER$26) != null;
        }
    }
    
    /**
     * Sets the "publishToServer" attribute
     */
    public void setPublishToServer(boolean publishToServer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHTOSERVER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHTOSERVER$26);
            }
            target.setBooleanValue(publishToServer);
        }
    }
    
    /**
     * Sets (as xml) the "publishToServer" attribute
     */
    public void xsetPublishToServer(org.apache.xmlbeans.XmlBoolean publishToServer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHTOSERVER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHTOSERVER$26);
            }
            target.set(publishToServer);
        }
    }
    
    /**
     * Unsets the "publishToServer" attribute
     */
    public void unsetPublishToServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHTOSERVER$26);
        }
    }
    
    /**
     * Gets the "workbookParameter" attribute
     */
    public boolean getWorkbookParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKPARAMETER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(WORKBOOKPARAMETER$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "workbookParameter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWorkbookParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WORKBOOKPARAMETER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(WORKBOOKPARAMETER$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "workbookParameter" attribute
     */
    public boolean isSetWorkbookParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WORKBOOKPARAMETER$28) != null;
        }
    }
    
    /**
     * Sets the "workbookParameter" attribute
     */
    public void setWorkbookParameter(boolean workbookParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKPARAMETER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WORKBOOKPARAMETER$28);
            }
            target.setBooleanValue(workbookParameter);
        }
    }
    
    /**
     * Sets (as xml) the "workbookParameter" attribute
     */
    public void xsetWorkbookParameter(org.apache.xmlbeans.XmlBoolean workbookParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WORKBOOKPARAMETER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WORKBOOKPARAMETER$28);
            }
            target.set(workbookParameter);
        }
    }
    
    /**
     * Unsets the "workbookParameter" attribute
     */
    public void unsetWorkbookParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WORKBOOKPARAMETER$28);
        }
    }
}
