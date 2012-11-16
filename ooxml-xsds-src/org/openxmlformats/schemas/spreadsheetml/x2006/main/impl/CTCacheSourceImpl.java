/*
 * XML Type:  CT_CacheSource
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CacheSource(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCacheSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource
{
    
    public CTCacheSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSHEETSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "worksheetSource");
    private static final javax.xml.namespace.QName CONSOLIDATION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "consolidation");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CONNECTIONID$8 = 
        new javax.xml.namespace.QName("", "connectionId");
    
    
    /**
     * Gets the "worksheetSource" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource getWorksheetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource)get_store().find_element_user(WORKSHEETSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "worksheetSource" element
     */
    public boolean isSetWorksheetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKSHEETSOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "worksheetSource" element
     */
    public void setWorksheetSource(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource worksheetSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource)get_store().find_element_user(WORKSHEETSOURCE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource)get_store().add_element_user(WORKSHEETSOURCE$0);
            }
            target.set(worksheetSource);
        }
    }
    
    /**
     * Appends and returns a new empty "worksheetSource" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource addNewWorksheetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource)get_store().add_element_user(WORKSHEETSOURCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "worksheetSource" element
     */
    public void unsetWorksheetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKSHEETSOURCE$0, 0);
        }
    }
    
    /**
     * Gets the "consolidation" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation getConsolidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation)get_store().find_element_user(CONSOLIDATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "consolidation" element
     */
    public boolean isSetConsolidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSOLIDATION$2) != 0;
        }
    }
    
    /**
     * Sets the "consolidation" element
     */
    public void setConsolidation(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation consolidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation)get_store().find_element_user(CONSOLIDATION$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation)get_store().add_element_user(CONSOLIDATION$2);
            }
            target.set(consolidation);
        }
    }
    
    /**
     * Appends and returns a new empty "consolidation" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation addNewConsolidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation)get_store().add_element_user(CONSOLIDATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "consolidation" element
     */
    public void unsetConsolidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSOLIDATION$2, 0);
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
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONNECTIONID$8);
            }
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(CONNECTIONID$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "connectionId" attribute
     */
    public boolean isSetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTIONID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONID$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CONNECTIONID$8);
            }
            target.set(connectionId);
        }
    }
    
    /**
     * Unsets the "connectionId" attribute
     */
    public void unsetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTIONID$8);
        }
    }
}
