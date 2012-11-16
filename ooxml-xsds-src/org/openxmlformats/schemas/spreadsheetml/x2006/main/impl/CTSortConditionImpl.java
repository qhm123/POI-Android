/*
 * XML Type:  CT_SortCondition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SortCondition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSortConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition
{
    
    public CTSortConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCENDING$0 = 
        new javax.xml.namespace.QName("", "descending");
    private static final javax.xml.namespace.QName SORTBY$2 = 
        new javax.xml.namespace.QName("", "sortBy");
    private static final javax.xml.namespace.QName REF$4 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName CUSTOMLIST$6 = 
        new javax.xml.namespace.QName("", "customList");
    private static final javax.xml.namespace.QName DXFID$8 = 
        new javax.xml.namespace.QName("", "dxfId");
    private static final javax.xml.namespace.QName ICONSET$10 = 
        new javax.xml.namespace.QName("", "iconSet");
    private static final javax.xml.namespace.QName ICONID$12 = 
        new javax.xml.namespace.QName("", "iconId");
    
    
    /**
     * Gets the "descending" attribute
     */
    public boolean getDescending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCENDING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DESCENDING$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "descending" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDescending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DESCENDING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DESCENDING$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "descending" attribute
     */
    public boolean isSetDescending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCENDING$0) != null;
        }
    }
    
    /**
     * Sets the "descending" attribute
     */
    public void setDescending(boolean descending)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCENDING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCENDING$0);
            }
            target.setBooleanValue(descending);
        }
    }
    
    /**
     * Sets (as xml) the "descending" attribute
     */
    public void xsetDescending(org.apache.xmlbeans.XmlBoolean descending)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DESCENDING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DESCENDING$0);
            }
            target.set(descending);
        }
    }
    
    /**
     * Unsets the "descending" attribute
     */
    public void unsetDescending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCENDING$0);
        }
    }
    
    /**
     * Gets the "sortBy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy.Enum getSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTBY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTBY$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortBy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy xgetSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy)get_store().find_attribute_user(SORTBY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy)get_default_attribute_value(SORTBY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sortBy" attribute
     */
    public boolean isSetSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTBY$2) != null;
        }
    }
    
    /**
     * Sets the "sortBy" attribute
     */
    public void setSortBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy.Enum sortBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTBY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTBY$2);
            }
            target.setEnumValue(sortBy);
        }
    }
    
    /**
     * Sets (as xml) the "sortBy" attribute
     */
    public void xsetSortBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy sortBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy)get_store().find_attribute_user(SORTBY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy)get_store().add_attribute_user(SORTBY$2);
            }
            target.set(sortBy);
        }
    }
    
    /**
     * Unsets the "sortBy" attribute
     */
    public void unsetSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTBY$2);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$4);
            return target;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$4);
            }
            target.set(ref);
        }
    }
    
    /**
     * Gets the "customList" attribute
     */
    public java.lang.String getCustomList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMLIST$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "customList" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCustomList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMLIST$6);
            return target;
        }
    }
    
    /**
     * True if has "customList" attribute
     */
    public boolean isSetCustomList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMLIST$6) != null;
        }
    }
    
    /**
     * Sets the "customList" attribute
     */
    public void setCustomList(java.lang.String customList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMLIST$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMLIST$6);
            }
            target.setStringValue(customList);
        }
    }
    
    /**
     * Sets (as xml) the "customList" attribute
     */
    public void xsetCustomList(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring customList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CUSTOMLIST$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CUSTOMLIST$6);
            }
            target.set(customList);
        }
    }
    
    /**
     * Unsets the "customList" attribute
     */
    public void unsetCustomList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMLIST$6);
        }
    }
    
    /**
     * Gets the "dxfId" attribute
     */
    public long getDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$8);
            return target;
        }
    }
    
    /**
     * True if has "dxfId" attribute
     */
    public boolean isSetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXFID$8) != null;
        }
    }
    
    /**
     * Sets the "dxfId" attribute
     */
    public void setDxfId(long dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXFID$8);
            }
            target.setLongValue(dxfId);
        }
    }
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    public void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DXFID$8);
            }
            target.set(dxfId);
        }
    }
    
    /**
     * Unsets the "dxfId" attribute
     */
    public void unsetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXFID$8);
        }
    }
    
    /**
     * Gets the "iconSet" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ICONSET$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "iconSet" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType xgetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().find_attribute_user(ICONSET$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_default_attribute_value(ICONSET$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "iconSet" attribute
     */
    public boolean isSetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICONSET$10) != null;
        }
    }
    
    /**
     * Sets the "iconSet" attribute
     */
    public void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICONSET$10);
            }
            target.setEnumValue(iconSet);
        }
    }
    
    /**
     * Sets (as xml) the "iconSet" attribute
     */
    public void xsetIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().find_attribute_user(ICONSET$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType)get_store().add_attribute_user(ICONSET$10);
            }
            target.set(iconSet);
        }
    }
    
    /**
     * Unsets the "iconSet" attribute
     */
    public void unsetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICONSET$10);
        }
    }
    
    /**
     * Gets the "iconId" attribute
     */
    public long getIconId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iconId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIconId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ICONID$12);
            return target;
        }
    }
    
    /**
     * True if has "iconId" attribute
     */
    public boolean isSetIconId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICONID$12) != null;
        }
    }
    
    /**
     * Sets the "iconId" attribute
     */
    public void setIconId(long iconId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICONID$12);
            }
            target.setLongValue(iconId);
        }
    }
    
    /**
     * Sets (as xml) the "iconId" attribute
     */
    public void xsetIconId(org.apache.xmlbeans.XmlUnsignedInt iconId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ICONID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ICONID$12);
            }
            target.set(iconId);
        }
    }
    
    /**
     * Unsets the "iconId" attribute
     */
    public void unsetIconId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICONID$12);
        }
    }
}
