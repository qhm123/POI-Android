/*
 * XML Type:  CT_QueryTableRefresh
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_QueryTableRefresh(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryTableRefreshImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableRefresh
{
    
    public CTQueryTableRefreshImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTABLEFIELDS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryTableFields");
    private static final javax.xml.namespace.QName QUERYTABLEDELETEDFIELDS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryTableDeletedFields");
    private static final javax.xml.namespace.QName SORTSTATE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PRESERVESORTFILTERLAYOUT$8 = 
        new javax.xml.namespace.QName("", "preserveSortFilterLayout");
    private static final javax.xml.namespace.QName FIELDIDWRAPPED$10 = 
        new javax.xml.namespace.QName("", "fieldIdWrapped");
    private static final javax.xml.namespace.QName HEADERSINLASTREFRESH$12 = 
        new javax.xml.namespace.QName("", "headersInLastRefresh");
    private static final javax.xml.namespace.QName MINIMUMVERSION$14 = 
        new javax.xml.namespace.QName("", "minimumVersion");
    private static final javax.xml.namespace.QName NEXTID$16 = 
        new javax.xml.namespace.QName("", "nextId");
    private static final javax.xml.namespace.QName UNBOUNDCOLUMNSLEFT$18 = 
        new javax.xml.namespace.QName("", "unboundColumnsLeft");
    private static final javax.xml.namespace.QName UNBOUNDCOLUMNSRIGHT$20 = 
        new javax.xml.namespace.QName("", "unboundColumnsRight");
    
    
    /**
     * Gets the "queryTableFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields getQueryTableFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields)get_store().find_element_user(QUERYTABLEFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryTableFields" element
     */
    public void setQueryTableFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields queryTableFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields)get_store().find_element_user(QUERYTABLEFIELDS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields)get_store().add_element_user(QUERYTABLEFIELDS$0);
            }
            target.set(queryTableFields);
        }
    }
    
    /**
     * Appends and returns a new empty "queryTableFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields addNewQueryTableFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields)get_store().add_element_user(QUERYTABLEFIELDS$0);
            return target;
        }
    }
    
    /**
     * Gets the "queryTableDeletedFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields getQueryTableDeletedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields)get_store().find_element_user(QUERYTABLEDELETEDFIELDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queryTableDeletedFields" element
     */
    public boolean isSetQueryTableDeletedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYTABLEDELETEDFIELDS$2) != 0;
        }
    }
    
    /**
     * Sets the "queryTableDeletedFields" element
     */
    public void setQueryTableDeletedFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields queryTableDeletedFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields)get_store().find_element_user(QUERYTABLEDELETEDFIELDS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields)get_store().add_element_user(QUERYTABLEDELETEDFIELDS$2);
            }
            target.set(queryTableDeletedFields);
        }
    }
    
    /**
     * Appends and returns a new empty "queryTableDeletedFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields addNewQueryTableDeletedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields)get_store().add_element_user(QUERYTABLEDELETEDFIELDS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "queryTableDeletedFields" element
     */
    public void unsetQueryTableDeletedFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYTABLEDELETEDFIELDS$2, 0);
        }
    }
    
    /**
     * Gets the "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sortState" element
     */
    public boolean isSetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTSTATE$4) != 0;
        }
    }
    
    /**
     * Sets the "sortState" element
     */
    public void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$4);
            }
            target.set(sortState);
        }
    }
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sortState" element
     */
    public void unsetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTSTATE$4, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "preserveSortFilterLayout" attribute
     */
    public boolean getPreserveSortFilterLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVESORTFILTERLAYOUT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preserveSortFilterLayout" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserveSortFilterLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRESERVESORTFILTERLAYOUT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "preserveSortFilterLayout" attribute
     */
    public boolean isSetPreserveSortFilterLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESERVESORTFILTERLAYOUT$8) != null;
        }
    }
    
    /**
     * Sets the "preserveSortFilterLayout" attribute
     */
    public void setPreserveSortFilterLayout(boolean preserveSortFilterLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            }
            target.setBooleanValue(preserveSortFilterLayout);
        }
    }
    
    /**
     * Sets (as xml) the "preserveSortFilterLayout" attribute
     */
    public void xsetPreserveSortFilterLayout(org.apache.xmlbeans.XmlBoolean preserveSortFilterLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVESORTFILTERLAYOUT$8);
            }
            target.set(preserveSortFilterLayout);
        }
    }
    
    /**
     * Unsets the "preserveSortFilterLayout" attribute
     */
    public void unsetPreserveSortFilterLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESERVESORTFILTERLAYOUT$8);
        }
    }
    
    /**
     * Gets the "fieldIdWrapped" attribute
     */
    public boolean getFieldIdWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDIDWRAPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDIDWRAPPED$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldIdWrapped" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFieldIdWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDIDWRAPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIELDIDWRAPPED$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "fieldIdWrapped" attribute
     */
    public boolean isSetFieldIdWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDIDWRAPPED$10) != null;
        }
    }
    
    /**
     * Sets the "fieldIdWrapped" attribute
     */
    public void setFieldIdWrapped(boolean fieldIdWrapped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDIDWRAPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDIDWRAPPED$10);
            }
            target.setBooleanValue(fieldIdWrapped);
        }
    }
    
    /**
     * Sets (as xml) the "fieldIdWrapped" attribute
     */
    public void xsetFieldIdWrapped(org.apache.xmlbeans.XmlBoolean fieldIdWrapped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDIDWRAPPED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIELDIDWRAPPED$10);
            }
            target.set(fieldIdWrapped);
        }
    }
    
    /**
     * Unsets the "fieldIdWrapped" attribute
     */
    public void unsetFieldIdWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDIDWRAPPED$10);
        }
    }
    
    /**
     * Gets the "headersInLastRefresh" attribute
     */
    public boolean getHeadersInLastRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERSINLASTREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HEADERSINLASTREFRESH$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "headersInLastRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHeadersInLastRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADERSINLASTREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HEADERSINLASTREFRESH$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "headersInLastRefresh" attribute
     */
    public boolean isSetHeadersInLastRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERSINLASTREFRESH$12) != null;
        }
    }
    
    /**
     * Sets the "headersInLastRefresh" attribute
     */
    public void setHeadersInLastRefresh(boolean headersInLastRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERSINLASTREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERSINLASTREFRESH$12);
            }
            target.setBooleanValue(headersInLastRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "headersInLastRefresh" attribute
     */
    public void xsetHeadersInLastRefresh(org.apache.xmlbeans.XmlBoolean headersInLastRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HEADERSINLASTREFRESH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HEADERSINLASTREFRESH$12);
            }
            target.set(headersInLastRefresh);
        }
    }
    
    /**
     * Unsets the "headersInLastRefresh" attribute
     */
    public void unsetHeadersInLastRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERSINLASTREFRESH$12);
        }
    }
    
    /**
     * Gets the "minimumVersion" attribute
     */
    public short getMinimumVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMUMVERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINIMUMVERSION$14);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimumVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMinimumVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINIMUMVERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(MINIMUMVERSION$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "minimumVersion" attribute
     */
    public boolean isSetMinimumVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINIMUMVERSION$14) != null;
        }
    }
    
    /**
     * Sets the "minimumVersion" attribute
     */
    public void setMinimumVersion(short minimumVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINIMUMVERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINIMUMVERSION$14);
            }
            target.setShortValue(minimumVersion);
        }
    }
    
    /**
     * Sets (as xml) the "minimumVersion" attribute
     */
    public void xsetMinimumVersion(org.apache.xmlbeans.XmlUnsignedByte minimumVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINIMUMVERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(MINIMUMVERSION$14);
            }
            target.set(minimumVersion);
        }
    }
    
    /**
     * Unsets the "minimumVersion" attribute
     */
    public void unsetMinimumVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINIMUMVERSION$14);
        }
    }
    
    /**
     * Gets the "nextId" attribute
     */
    public long getNextId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NEXTID$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "nextId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNextId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NEXTID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(NEXTID$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "nextId" attribute
     */
    public boolean isSetNextId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEXTID$16) != null;
        }
    }
    
    /**
     * Sets the "nextId" attribute
     */
    public void setNextId(long nextId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEXTID$16);
            }
            target.setLongValue(nextId);
        }
    }
    
    /**
     * Sets (as xml) the "nextId" attribute
     */
    public void xsetNextId(org.apache.xmlbeans.XmlUnsignedInt nextId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NEXTID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NEXTID$16);
            }
            target.set(nextId);
        }
    }
    
    /**
     * Unsets the "nextId" attribute
     */
    public void unsetNextId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEXTID$16);
        }
    }
    
    /**
     * Gets the "unboundColumnsLeft" attribute
     */
    public long getUnboundColumnsLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNBOUNDCOLUMNSLEFT$18);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "unboundColumnsLeft" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUnboundColumnsLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(UNBOUNDCOLUMNSLEFT$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "unboundColumnsLeft" attribute
     */
    public boolean isSetUnboundColumnsLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNBOUNDCOLUMNSLEFT$18) != null;
        }
    }
    
    /**
     * Sets the "unboundColumnsLeft" attribute
     */
    public void setUnboundColumnsLeft(long unboundColumnsLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            }
            target.setLongValue(unboundColumnsLeft);
        }
    }
    
    /**
     * Sets (as xml) the "unboundColumnsLeft" attribute
     */
    public void xsetUnboundColumnsLeft(org.apache.xmlbeans.XmlUnsignedInt unboundColumnsLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(UNBOUNDCOLUMNSLEFT$18);
            }
            target.set(unboundColumnsLeft);
        }
    }
    
    /**
     * Unsets the "unboundColumnsLeft" attribute
     */
    public void unsetUnboundColumnsLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNBOUNDCOLUMNSLEFT$18);
        }
    }
    
    /**
     * Gets the "unboundColumnsRight" attribute
     */
    public long getUnboundColumnsRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNBOUNDCOLUMNSRIGHT$20);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "unboundColumnsRight" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUnboundColumnsRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(UNBOUNDCOLUMNSRIGHT$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "unboundColumnsRight" attribute
     */
    public boolean isSetUnboundColumnsRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNBOUNDCOLUMNSRIGHT$20) != null;
        }
    }
    
    /**
     * Sets the "unboundColumnsRight" attribute
     */
    public void setUnboundColumnsRight(long unboundColumnsRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            }
            target.setLongValue(unboundColumnsRight);
        }
    }
    
    /**
     * Sets (as xml) the "unboundColumnsRight" attribute
     */
    public void xsetUnboundColumnsRight(org.apache.xmlbeans.XmlUnsignedInt unboundColumnsRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(UNBOUNDCOLUMNSRIGHT$20);
            }
            target.set(unboundColumnsRight);
        }
    }
    
    /**
     * Unsets the "unboundColumnsRight" attribute
     */
    public void unsetUnboundColumnsRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNBOUNDCOLUMNSRIGHT$20);
        }
    }
}
