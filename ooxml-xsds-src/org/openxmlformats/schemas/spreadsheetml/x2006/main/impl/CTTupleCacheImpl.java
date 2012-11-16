/*
 * XML Type:  CT_TupleCache
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TupleCache(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTupleCacheImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache
{
    
    public CTTupleCacheImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRIES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "entries");
    private static final javax.xml.namespace.QName SETS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sets");
    private static final javax.xml.namespace.QName QUERYCACHE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryCache");
    private static final javax.xml.namespace.QName SERVERFORMATS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "serverFormats");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "entries" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries getEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "entries" element
     */
    public boolean isSetEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRIES$0) != 0;
        }
    }
    
    /**
     * Sets the "entries" element
     */
    public void setEntries(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries entries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries)get_store().find_element_user(ENTRIES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries)get_store().add_element_user(ENTRIES$0);
            }
            target.set(entries);
        }
    }
    
    /**
     * Appends and returns a new empty "entries" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries addNewEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDSDTCEntries)get_store().add_element_user(ENTRIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "entries" element
     */
    public void unsetEntries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRIES$0, 0);
        }
    }
    
    /**
     * Gets the "sets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets getSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets)get_store().find_element_user(SETS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sets" element
     */
    public boolean isSetSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETS$2) != 0;
        }
    }
    
    /**
     * Sets the "sets" element
     */
    public void setSets(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets sets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets)get_store().find_element_user(SETS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets)get_store().add_element_user(SETS$2);
            }
            target.set(sets);
        }
    }
    
    /**
     * Appends and returns a new empty "sets" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets addNewSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSets)get_store().add_element_user(SETS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sets" element
     */
    public void unsetSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETS$2, 0);
        }
    }
    
    /**
     * Gets the "queryCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache getQueryCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache)get_store().find_element_user(QUERYCACHE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queryCache" element
     */
    public boolean isSetQueryCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYCACHE$4) != 0;
        }
    }
    
    /**
     * Sets the "queryCache" element
     */
    public void setQueryCache(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache queryCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache)get_store().find_element_user(QUERYCACHE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache)get_store().add_element_user(QUERYCACHE$4);
            }
            target.set(queryCache);
        }
    }
    
    /**
     * Appends and returns a new empty "queryCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache addNewQueryCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryCache)get_store().add_element_user(QUERYCACHE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "queryCache" element
     */
    public void unsetQueryCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYCACHE$4, 0);
        }
    }
    
    /**
     * Gets the "serverFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats getServerFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats)get_store().find_element_user(SERVERFORMATS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serverFormats" element
     */
    public boolean isSetServerFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERFORMATS$6) != 0;
        }
    }
    
    /**
     * Sets the "serverFormats" element
     */
    public void setServerFormats(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats serverFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats)get_store().find_element_user(SERVERFORMATS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats)get_store().add_element_user(SERVERFORMATS$6);
            }
            target.set(serverFormats);
        }
    }
    
    /**
     * Appends and returns a new empty "serverFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats addNewServerFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats)get_store().add_element_user(SERVERFORMATS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "serverFormats" element
     */
    public void unsetServerFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERFORMATS$6, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}
