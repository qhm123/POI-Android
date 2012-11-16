/*
 * XML Type:  CT_DataBinding
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataBinding(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataBindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding
{
    
    public CTDataBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABINDINGNAME$0 = 
        new javax.xml.namespace.QName("", "DataBindingName");
    private static final javax.xml.namespace.QName FILEBINDING$2 = 
        new javax.xml.namespace.QName("", "FileBinding");
    private static final javax.xml.namespace.QName CONNECTIONID$4 = 
        new javax.xml.namespace.QName("", "ConnectionID");
    private static final javax.xml.namespace.QName FILEBINDINGNAME$6 = 
        new javax.xml.namespace.QName("", "FileBindingName");
    private static final javax.xml.namespace.QName DATABINDINGLOADMODE$8 = 
        new javax.xml.namespace.QName("", "DataBindingLoadMode");
    
    
    /**
     * Gets the "DataBindingName" attribute
     */
    public java.lang.String getDataBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABINDINGNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataBindingName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDataBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATABINDINGNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "DataBindingName" attribute
     */
    public boolean isSetDataBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATABINDINGNAME$0) != null;
        }
    }
    
    /**
     * Sets the "DataBindingName" attribute
     */
    public void setDataBindingName(java.lang.String dataBindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABINDINGNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABINDINGNAME$0);
            }
            target.setStringValue(dataBindingName);
        }
    }
    
    /**
     * Sets (as xml) the "DataBindingName" attribute
     */
    public void xsetDataBindingName(org.apache.xmlbeans.XmlString dataBindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATABINDINGNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATABINDINGNAME$0);
            }
            target.set(dataBindingName);
        }
    }
    
    /**
     * Unsets the "DataBindingName" attribute
     */
    public void unsetDataBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATABINDINGNAME$0);
        }
    }
    
    /**
     * Gets the "FileBinding" attribute
     */
    public boolean getFileBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEBINDING$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileBinding" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFileBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILEBINDING$2);
            return target;
        }
    }
    
    /**
     * True if has "FileBinding" attribute
     */
    public boolean isSetFileBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILEBINDING$2) != null;
        }
    }
    
    /**
     * Sets the "FileBinding" attribute
     */
    public void setFileBinding(boolean fileBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEBINDING$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILEBINDING$2);
            }
            target.setBooleanValue(fileBinding);
        }
    }
    
    /**
     * Sets (as xml) the "FileBinding" attribute
     */
    public void xsetFileBinding(org.apache.xmlbeans.XmlBoolean fileBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILEBINDING$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILEBINDING$2);
            }
            target.set(fileBinding);
        }
    }
    
    /**
     * Unsets the "FileBinding" attribute
     */
    public void unsetFileBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILEBINDING$2);
        }
    }
    
    /**
     * Gets the "ConnectionID" attribute
     */
    public long getConnectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConnectionID" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetConnectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$4);
            return target;
        }
    }
    
    /**
     * True if has "ConnectionID" attribute
     */
    public boolean isSetConnectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTIONID$4) != null;
        }
    }
    
    /**
     * Sets the "ConnectionID" attribute
     */
    public void setConnectionID(long connectionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONID$4);
            }
            target.setLongValue(connectionID);
        }
    }
    
    /**
     * Sets (as xml) the "ConnectionID" attribute
     */
    public void xsetConnectionID(org.apache.xmlbeans.XmlUnsignedInt connectionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CONNECTIONID$4);
            }
            target.set(connectionID);
        }
    }
    
    /**
     * Unsets the "ConnectionID" attribute
     */
    public void unsetConnectionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTIONID$4);
        }
    }
    
    /**
     * Gets the "FileBindingName" attribute
     */
    public java.lang.String getFileBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEBINDINGNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileBindingName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFileBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILEBINDINGNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "FileBindingName" attribute
     */
    public boolean isSetFileBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILEBINDINGNAME$6) != null;
        }
    }
    
    /**
     * Sets the "FileBindingName" attribute
     */
    public void setFileBindingName(java.lang.String fileBindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILEBINDINGNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILEBINDINGNAME$6);
            }
            target.setStringValue(fileBindingName);
        }
    }
    
    /**
     * Sets (as xml) the "FileBindingName" attribute
     */
    public void xsetFileBindingName(org.apache.xmlbeans.XmlString fileBindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILEBINDINGNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILEBINDINGNAME$6);
            }
            target.set(fileBindingName);
        }
    }
    
    /**
     * Unsets the "FileBindingName" attribute
     */
    public void unsetFileBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILEBINDINGNAME$6);
        }
    }
    
    /**
     * Gets the "DataBindingLoadMode" attribute
     */
    public long getDataBindingLoadMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABINDINGLOADMODE$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataBindingLoadMode" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDataBindingLoadMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DATABINDINGLOADMODE$8);
            return target;
        }
    }
    
    /**
     * Sets the "DataBindingLoadMode" attribute
     */
    public void setDataBindingLoadMode(long dataBindingLoadMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABINDINGLOADMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABINDINGLOADMODE$8);
            }
            target.setLongValue(dataBindingLoadMode);
        }
    }
    
    /**
     * Sets (as xml) the "DataBindingLoadMode" attribute
     */
    public void xsetDataBindingLoadMode(org.apache.xmlbeans.XmlUnsignedInt dataBindingLoadMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DATABINDINGLOADMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DATABINDINGLOADMODE$8);
            }
            target.set(dataBindingLoadMode);
        }
    }
}
