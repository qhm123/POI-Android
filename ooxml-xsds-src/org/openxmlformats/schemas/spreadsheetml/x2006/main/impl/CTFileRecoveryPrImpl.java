/*
 * XML Type:  CT_FileRecoveryPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FileRecoveryPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFileRecoveryPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr
{
    
    public CTFileRecoveryPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTORECOVER$0 = 
        new javax.xml.namespace.QName("", "autoRecover");
    private static final javax.xml.namespace.QName CRASHSAVE$2 = 
        new javax.xml.namespace.QName("", "crashSave");
    private static final javax.xml.namespace.QName DATAEXTRACTLOAD$4 = 
        new javax.xml.namespace.QName("", "dataExtractLoad");
    private static final javax.xml.namespace.QName REPAIRLOAD$6 = 
        new javax.xml.namespace.QName("", "repairLoad");
    
    
    /**
     * Gets the "autoRecover" attribute
     */
    public boolean getAutoRecover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTORECOVER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTORECOVER$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoRecover" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoRecover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTORECOVER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTORECOVER$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoRecover" attribute
     */
    public boolean isSetAutoRecover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTORECOVER$0) != null;
        }
    }
    
    /**
     * Sets the "autoRecover" attribute
     */
    public void setAutoRecover(boolean autoRecover)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTORECOVER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTORECOVER$0);
            }
            target.setBooleanValue(autoRecover);
        }
    }
    
    /**
     * Sets (as xml) the "autoRecover" attribute
     */
    public void xsetAutoRecover(org.apache.xmlbeans.XmlBoolean autoRecover)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTORECOVER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTORECOVER$0);
            }
            target.set(autoRecover);
        }
    }
    
    /**
     * Unsets the "autoRecover" attribute
     */
    public void unsetAutoRecover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTORECOVER$0);
        }
    }
    
    /**
     * Gets the "crashSave" attribute
     */
    public boolean getCrashSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHSAVE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CRASHSAVE$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "crashSave" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCrashSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CRASHSAVE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CRASHSAVE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "crashSave" attribute
     */
    public boolean isSetCrashSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRASHSAVE$2) != null;
        }
    }
    
    /**
     * Sets the "crashSave" attribute
     */
    public void setCrashSave(boolean crashSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHSAVE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRASHSAVE$2);
            }
            target.setBooleanValue(crashSave);
        }
    }
    
    /**
     * Sets (as xml) the "crashSave" attribute
     */
    public void xsetCrashSave(org.apache.xmlbeans.XmlBoolean crashSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CRASHSAVE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CRASHSAVE$2);
            }
            target.set(crashSave);
        }
    }
    
    /**
     * Unsets the "crashSave" attribute
     */
    public void unsetCrashSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRASHSAVE$2);
        }
    }
    
    /**
     * Gets the "dataExtractLoad" attribute
     */
    public boolean getDataExtractLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAEXTRACTLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATAEXTRACTLOAD$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataExtractLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataExtractLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAEXTRACTLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATAEXTRACTLOAD$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "dataExtractLoad" attribute
     */
    public boolean isSetDataExtractLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAEXTRACTLOAD$4) != null;
        }
    }
    
    /**
     * Sets the "dataExtractLoad" attribute
     */
    public void setDataExtractLoad(boolean dataExtractLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAEXTRACTLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAEXTRACTLOAD$4);
            }
            target.setBooleanValue(dataExtractLoad);
        }
    }
    
    /**
     * Sets (as xml) the "dataExtractLoad" attribute
     */
    public void xsetDataExtractLoad(org.apache.xmlbeans.XmlBoolean dataExtractLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAEXTRACTLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATAEXTRACTLOAD$4);
            }
            target.set(dataExtractLoad);
        }
    }
    
    /**
     * Unsets the "dataExtractLoad" attribute
     */
    public void unsetDataExtractLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAEXTRACTLOAD$4);
        }
    }
    
    /**
     * Gets the "repairLoad" attribute
     */
    public boolean getRepairLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPAIRLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPAIRLOAD$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "repairLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRepairLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPAIRLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REPAIRLOAD$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "repairLoad" attribute
     */
    public boolean isSetRepairLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPAIRLOAD$6) != null;
        }
    }
    
    /**
     * Sets the "repairLoad" attribute
     */
    public void setRepairLoad(boolean repairLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPAIRLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPAIRLOAD$6);
            }
            target.setBooleanValue(repairLoad);
        }
    }
    
    /**
     * Sets (as xml) the "repairLoad" attribute
     */
    public void xsetRepairLoad(org.apache.xmlbeans.XmlBoolean repairLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPAIRLOAD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REPAIRLOAD$6);
            }
            target.set(repairLoad);
        }
    }
    
    /**
     * Unsets the "repairLoad" attribute
     */
    public void unsetRepairLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPAIRLOAD$6);
        }
    }
}
