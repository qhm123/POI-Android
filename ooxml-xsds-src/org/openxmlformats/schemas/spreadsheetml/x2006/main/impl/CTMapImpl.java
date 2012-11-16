/*
 * XML Type:  CT_Map
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Map(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap
{
    
    public CTMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABINDING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "DataBinding");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "Name");
    private static final javax.xml.namespace.QName ROOTELEMENT$6 = 
        new javax.xml.namespace.QName("", "RootElement");
    private static final javax.xml.namespace.QName SCHEMAID$8 = 
        new javax.xml.namespace.QName("", "SchemaID");
    private static final javax.xml.namespace.QName SHOWIMPORTEXPORTVALIDATIONERRORS$10 = 
        new javax.xml.namespace.QName("", "ShowImportExportValidationErrors");
    private static final javax.xml.namespace.QName AUTOFIT$12 = 
        new javax.xml.namespace.QName("", "AutoFit");
    private static final javax.xml.namespace.QName APPEND$14 = 
        new javax.xml.namespace.QName("", "Append");
    private static final javax.xml.namespace.QName PRESERVESORTAFLAYOUT$16 = 
        new javax.xml.namespace.QName("", "PreserveSortAFLayout");
    private static final javax.xml.namespace.QName PRESERVEFORMAT$18 = 
        new javax.xml.namespace.QName("", "PreserveFormat");
    
    
    /**
     * Gets the "DataBinding" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding getDataBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding)get_store().find_element_user(DATABINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataBinding" element
     */
    public boolean isSetDataBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABINDING$0) != 0;
        }
    }
    
    /**
     * Sets the "DataBinding" element
     */
    public void setDataBinding(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding dataBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding)get_store().find_element_user(DATABINDING$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding)get_store().add_element_user(DATABINDING$0);
            }
            target.set(dataBinding);
        }
    }
    
    /**
     * Appends and returns a new empty "DataBinding" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding addNewDataBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding)get_store().add_element_user(DATABINDING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataBinding" element
     */
    public void unsetDataBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABINDING$0, 0);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public long getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Name" attribute
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
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "Name" attribute
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
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "RootElement" attribute
     */
    public java.lang.String getRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTELEMENT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RootElement" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTELEMENT$6);
            return target;
        }
    }
    
    /**
     * Sets the "RootElement" attribute
     */
    public void setRootElement(java.lang.String rootElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTELEMENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTELEMENT$6);
            }
            target.setStringValue(rootElement);
        }
    }
    
    /**
     * Sets (as xml) the "RootElement" attribute
     */
    public void xsetRootElement(org.apache.xmlbeans.XmlString rootElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTELEMENT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTELEMENT$6);
            }
            target.set(rootElement);
        }
    }
    
    /**
     * Gets the "SchemaID" attribute
     */
    public java.lang.String getSchemaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchemaID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSchemaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMAID$8);
            return target;
        }
    }
    
    /**
     * Sets the "SchemaID" attribute
     */
    public void setSchemaID(java.lang.String schemaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAID$8);
            }
            target.setStringValue(schemaID);
        }
    }
    
    /**
     * Sets (as xml) the "SchemaID" attribute
     */
    public void xsetSchemaID(org.apache.xmlbeans.XmlString schemaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMAID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEMAID$8);
            }
            target.set(schemaID);
        }
    }
    
    /**
     * Gets the "ShowImportExportValidationErrors" attribute
     */
    public boolean getShowImportExportValidationErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShowImportExportValidationErrors" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowImportExportValidationErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            return target;
        }
    }
    
    /**
     * Sets the "ShowImportExportValidationErrors" attribute
     */
    public void setShowImportExportValidationErrors(boolean showImportExportValidationErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            }
            target.setBooleanValue(showImportExportValidationErrors);
        }
    }
    
    /**
     * Sets (as xml) the "ShowImportExportValidationErrors" attribute
     */
    public void xsetShowImportExportValidationErrors(org.apache.xmlbeans.XmlBoolean showImportExportValidationErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
            }
            target.set(showImportExportValidationErrors);
        }
    }
    
    /**
     * Gets the "AutoFit" attribute
     */
    public boolean getAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFIT$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoFit" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFIT$12);
            return target;
        }
    }
    
    /**
     * Sets the "AutoFit" attribute
     */
    public void setAutoFit(boolean autoFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFIT$12);
            }
            target.setBooleanValue(autoFit);
        }
    }
    
    /**
     * Sets (as xml) the "AutoFit" attribute
     */
    public void xsetAutoFit(org.apache.xmlbeans.XmlBoolean autoFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOFIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOFIT$12);
            }
            target.set(autoFit);
        }
    }
    
    /**
     * Gets the "Append" attribute
     */
    public boolean getAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEND$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Append" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPEND$14);
            return target;
        }
    }
    
    /**
     * Sets the "Append" attribute
     */
    public void setAppend(boolean append)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEND$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEND$14);
            }
            target.setBooleanValue(append);
        }
    }
    
    /**
     * Sets (as xml) the "Append" attribute
     */
    public void xsetAppend(org.apache.xmlbeans.XmlBoolean append)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPEND$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPEND$14);
            }
            target.set(append);
        }
    }
    
    /**
     * Gets the "PreserveSortAFLayout" attribute
     */
    public boolean getPreserveSortAFLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreserveSortAFLayout" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserveSortAFLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
            return target;
        }
    }
    
    /**
     * Sets the "PreserveSortAFLayout" attribute
     */
    public void setPreserveSortAFLayout(boolean preserveSortAFLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVESORTAFLAYOUT$16);
            }
            target.setBooleanValue(preserveSortAFLayout);
        }
    }
    
    /**
     * Sets (as xml) the "PreserveSortAFLayout" attribute
     */
    public void xsetPreserveSortAFLayout(org.apache.xmlbeans.XmlBoolean preserveSortAFLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVESORTAFLAYOUT$16);
            }
            target.set(preserveSortAFLayout);
        }
    }
    
    /**
     * Gets the "PreserveFormat" attribute
     */
    public boolean getPreserveFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMAT$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreserveFormat" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserveFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMAT$18);
            return target;
        }
    }
    
    /**
     * Sets the "PreserveFormat" attribute
     */
    public void setPreserveFormat(boolean preserveFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMAT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVEFORMAT$18);
            }
            target.setBooleanValue(preserveFormat);
        }
    }
    
    /**
     * Sets (as xml) the "PreserveFormat" attribute
     */
    public void xsetPreserveFormat(org.apache.xmlbeans.XmlBoolean preserveFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMAT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVEFORMAT$18);
            }
            target.set(preserveFormat);
        }
    }
}
