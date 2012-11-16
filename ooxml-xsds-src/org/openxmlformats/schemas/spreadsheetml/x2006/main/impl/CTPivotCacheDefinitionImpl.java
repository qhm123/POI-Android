/*
 * XML Type:  CT_PivotCacheDefinition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotCacheDefinition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotCacheDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition
{
    
    public CTPivotCacheDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CACHESOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheSource");
    private static final javax.xml.namespace.QName CACHEFIELDS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheFields");
    private static final javax.xml.namespace.QName CACHEHIERARCHIES$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheHierarchies");
    private static final javax.xml.namespace.QName KPIS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "kpis");
    private static final javax.xml.namespace.QName TUPLECACHE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tupleCache");
    private static final javax.xml.namespace.QName CALCULATEDITEMS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedItems");
    private static final javax.xml.namespace.QName CALCULATEDMEMBERS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedMembers");
    private static final javax.xml.namespace.QName DIMENSIONS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimensions");
    private static final javax.xml.namespace.QName MEASUREGROUPS$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "measureGroups");
    private static final javax.xml.namespace.QName MAPS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "maps");
    private static final javax.xml.namespace.QName EXTLST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName INVALID$24 = 
        new javax.xml.namespace.QName("", "invalid");
    private static final javax.xml.namespace.QName SAVEDATA$26 = 
        new javax.xml.namespace.QName("", "saveData");
    private static final javax.xml.namespace.QName REFRESHONLOAD$28 = 
        new javax.xml.namespace.QName("", "refreshOnLoad");
    private static final javax.xml.namespace.QName OPTIMIZEMEMORY$30 = 
        new javax.xml.namespace.QName("", "optimizeMemory");
    private static final javax.xml.namespace.QName ENABLEREFRESH$32 = 
        new javax.xml.namespace.QName("", "enableRefresh");
    private static final javax.xml.namespace.QName REFRESHEDBY$34 = 
        new javax.xml.namespace.QName("", "refreshedBy");
    private static final javax.xml.namespace.QName REFRESHEDDATE$36 = 
        new javax.xml.namespace.QName("", "refreshedDate");
    private static final javax.xml.namespace.QName BACKGROUNDQUERY$38 = 
        new javax.xml.namespace.QName("", "backgroundQuery");
    private static final javax.xml.namespace.QName MISSINGITEMSLIMIT$40 = 
        new javax.xml.namespace.QName("", "missingItemsLimit");
    private static final javax.xml.namespace.QName CREATEDVERSION$42 = 
        new javax.xml.namespace.QName("", "createdVersion");
    private static final javax.xml.namespace.QName REFRESHEDVERSION$44 = 
        new javax.xml.namespace.QName("", "refreshedVersion");
    private static final javax.xml.namespace.QName MINREFRESHABLEVERSION$46 = 
        new javax.xml.namespace.QName("", "minRefreshableVersion");
    private static final javax.xml.namespace.QName RECORDCOUNT$48 = 
        new javax.xml.namespace.QName("", "recordCount");
    private static final javax.xml.namespace.QName UPGRADEONREFRESH$50 = 
        new javax.xml.namespace.QName("", "upgradeOnRefresh");
    private static final javax.xml.namespace.QName TUPLECACHE2$52 = 
        new javax.xml.namespace.QName("", "tupleCache");
    private static final javax.xml.namespace.QName SUPPORTSUBQUERY$54 = 
        new javax.xml.namespace.QName("", "supportSubquery");
    private static final javax.xml.namespace.QName SUPPORTADVANCEDDRILL$56 = 
        new javax.xml.namespace.QName("", "supportAdvancedDrill");
    
    
    /**
     * Gets the "cacheSource" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource getCacheSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource)get_store().find_element_user(CACHESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cacheSource" element
     */
    public void setCacheSource(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource cacheSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource)get_store().find_element_user(CACHESOURCE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource)get_store().add_element_user(CACHESOURCE$0);
            }
            target.set(cacheSource);
        }
    }
    
    /**
     * Appends and returns a new empty "cacheSource" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource addNewCacheSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource)get_store().add_element_user(CACHESOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "cacheFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields getCacheFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields)get_store().find_element_user(CACHEFIELDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cacheFields" element
     */
    public void setCacheFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields cacheFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields)get_store().find_element_user(CACHEFIELDS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields)get_store().add_element_user(CACHEFIELDS$2);
            }
            target.set(cacheFields);
        }
    }
    
    /**
     * Appends and returns a new empty "cacheFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields addNewCacheFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields)get_store().add_element_user(CACHEFIELDS$2);
            return target;
        }
    }
    
    /**
     * Gets the "cacheHierarchies" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies getCacheHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies)get_store().find_element_user(CACHEHIERARCHIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cacheHierarchies" element
     */
    public boolean isSetCacheHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CACHEHIERARCHIES$4) != 0;
        }
    }
    
    /**
     * Sets the "cacheHierarchies" element
     */
    public void setCacheHierarchies(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies cacheHierarchies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies)get_store().find_element_user(CACHEHIERARCHIES$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies)get_store().add_element_user(CACHEHIERARCHIES$4);
            }
            target.set(cacheHierarchies);
        }
    }
    
    /**
     * Appends and returns a new empty "cacheHierarchies" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies addNewCacheHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies)get_store().add_element_user(CACHEHIERARCHIES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "cacheHierarchies" element
     */
    public void unsetCacheHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CACHEHIERARCHIES$4, 0);
        }
    }
    
    /**
     * Gets the "kpis" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs getKpis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs)get_store().find_element_user(KPIS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kpis" element
     */
    public boolean isSetKpis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KPIS$6) != 0;
        }
    }
    
    /**
     * Sets the "kpis" element
     */
    public void setKpis(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs kpis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs)get_store().find_element_user(KPIS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs)get_store().add_element_user(KPIS$6);
            }
            target.set(kpis);
        }
    }
    
    /**
     * Appends and returns a new empty "kpis" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs addNewKpis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs)get_store().add_element_user(KPIS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "kpis" element
     */
    public void unsetKpis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KPIS$6, 0);
        }
    }
    
    /**
     * Gets the "tupleCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache getTupleCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache)get_store().find_element_user(TUPLECACHE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tupleCache" element
     */
    public boolean isSetTupleCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TUPLECACHE$8) != 0;
        }
    }
    
    /**
     * Sets the "tupleCache" element
     */
    public void setTupleCache(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache tupleCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache)get_store().find_element_user(TUPLECACHE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache)get_store().add_element_user(TUPLECACHE$8);
            }
            target.set(tupleCache);
        }
    }
    
    /**
     * Appends and returns a new empty "tupleCache" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache addNewTupleCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache)get_store().add_element_user(TUPLECACHE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "tupleCache" element
     */
    public void unsetTupleCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TUPLECACHE$8, 0);
        }
    }
    
    /**
     * Gets the "calculatedItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems getCalculatedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems)get_store().find_element_user(CALCULATEDITEMS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calculatedItems" element
     */
    public boolean isSetCalculatedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATEDITEMS$10) != 0;
        }
    }
    
    /**
     * Sets the "calculatedItems" element
     */
    public void setCalculatedItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems calculatedItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems)get_store().find_element_user(CALCULATEDITEMS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems)get_store().add_element_user(CALCULATEDITEMS$10);
            }
            target.set(calculatedItems);
        }
    }
    
    /**
     * Appends and returns a new empty "calculatedItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems addNewCalculatedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems)get_store().add_element_user(CALCULATEDITEMS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "calculatedItems" element
     */
    public void unsetCalculatedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATEDITEMS$10, 0);
        }
    }
    
    /**
     * Gets the "calculatedMembers" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers getCalculatedMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers)get_store().find_element_user(CALCULATEDMEMBERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calculatedMembers" element
     */
    public boolean isSetCalculatedMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATEDMEMBERS$12) != 0;
        }
    }
    
    /**
     * Sets the "calculatedMembers" element
     */
    public void setCalculatedMembers(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers calculatedMembers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers)get_store().find_element_user(CALCULATEDMEMBERS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers)get_store().add_element_user(CALCULATEDMEMBERS$12);
            }
            target.set(calculatedMembers);
        }
    }
    
    /**
     * Appends and returns a new empty "calculatedMembers" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers addNewCalculatedMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers)get_store().add_element_user(CALCULATEDMEMBERS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "calculatedMembers" element
     */
    public void unsetCalculatedMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATEDMEMBERS$12, 0);
        }
    }
    
    /**
     * Gets the "dimensions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions getDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions)get_store().find_element_user(DIMENSIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dimensions" element
     */
    public boolean isSetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "dimensions" element
     */
    public void setDimensions(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions dimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions)get_store().find_element_user(DIMENSIONS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions)get_store().add_element_user(DIMENSIONS$14);
            }
            target.set(dimensions);
        }
    }
    
    /**
     * Appends and returns a new empty "dimensions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions addNewDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions)get_store().add_element_user(DIMENSIONS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "dimensions" element
     */
    public void unsetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONS$14, 0);
        }
    }
    
    /**
     * Gets the "measureGroups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups getMeasureGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups)get_store().find_element_user(MEASUREGROUPS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "measureGroups" element
     */
    public boolean isSetMeasureGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREGROUPS$16) != 0;
        }
    }
    
    /**
     * Sets the "measureGroups" element
     */
    public void setMeasureGroups(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups measureGroups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups)get_store().find_element_user(MEASUREGROUPS$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups)get_store().add_element_user(MEASUREGROUPS$16);
            }
            target.set(measureGroups);
        }
    }
    
    /**
     * Appends and returns a new empty "measureGroups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups addNewMeasureGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups)get_store().add_element_user(MEASUREGROUPS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "measureGroups" element
     */
    public void unsetMeasureGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREGROUPS$16, 0);
        }
    }
    
    /**
     * Gets the "maps" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps getMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps)get_store().find_element_user(MAPS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maps" element
     */
    public boolean isSetMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPS$18) != 0;
        }
    }
    
    /**
     * Sets the "maps" element
     */
    public void setMaps(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps maps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps)get_store().find_element_user(MAPS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps)get_store().add_element_user(MAPS$18);
            }
            target.set(maps);
        }
    }
    
    /**
     * Appends and returns a new empty "maps" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps addNewMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps)get_store().add_element_user(MAPS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "maps" element
     */
    public void unsetMaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPS$18, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
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
            return get_store().count_elements(EXTLST$20) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            get_store().remove_element(EXTLST$20, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$22);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$22) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$22);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$22);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$22);
        }
    }
    
    /**
     * Gets the "invalid" attribute
     */
    public boolean getInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVALID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INVALID$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "invalid" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INVALID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INVALID$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "invalid" attribute
     */
    public boolean isSetInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVALID$24) != null;
        }
    }
    
    /**
     * Sets the "invalid" attribute
     */
    public void setInvalid(boolean invalid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVALID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVALID$24);
            }
            target.setBooleanValue(invalid);
        }
    }
    
    /**
     * Sets (as xml) the "invalid" attribute
     */
    public void xsetInvalid(org.apache.xmlbeans.XmlBoolean invalid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INVALID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INVALID$24);
            }
            target.set(invalid);
        }
    }
    
    /**
     * Unsets the "invalid" attribute
     */
    public void unsetInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVALID$24);
        }
    }
    
    /**
     * Gets the "saveData" attribute
     */
    public boolean getSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEDATA$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVEDATA$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "saveData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEDATA$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SAVEDATA$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "saveData" attribute
     */
    public boolean isSetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVEDATA$26) != null;
        }
    }
    
    /**
     * Sets the "saveData" attribute
     */
    public void setSaveData(boolean saveData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEDATA$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEDATA$26);
            }
            target.setBooleanValue(saveData);
        }
    }
    
    /**
     * Sets (as xml) the "saveData" attribute
     */
    public void xsetSaveData(org.apache.xmlbeans.XmlBoolean saveData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVEDATA$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVEDATA$26);
            }
            target.set(saveData);
        }
    }
    
    /**
     * Unsets the "saveData" attribute
     */
    public void unsetSaveData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVEDATA$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHONLOAD$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHONLOAD$28);
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
            return get_store().find_attribute_user(REFRESHONLOAD$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONLOAD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHONLOAD$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONLOAD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHONLOAD$28);
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
            get_store().remove_attribute(REFRESHONLOAD$28);
        }
    }
    
    /**
     * Gets the "optimizeMemory" attribute
     */
    public boolean getOptimizeMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIMIZEMEMORY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPTIMIZEMEMORY$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "optimizeMemory" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOptimizeMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OPTIMIZEMEMORY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OPTIMIZEMEMORY$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "optimizeMemory" attribute
     */
    public boolean isSetOptimizeMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPTIMIZEMEMORY$30) != null;
        }
    }
    
    /**
     * Sets the "optimizeMemory" attribute
     */
    public void setOptimizeMemory(boolean optimizeMemory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIMIZEMEMORY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIMIZEMEMORY$30);
            }
            target.setBooleanValue(optimizeMemory);
        }
    }
    
    /**
     * Sets (as xml) the "optimizeMemory" attribute
     */
    public void xsetOptimizeMemory(org.apache.xmlbeans.XmlBoolean optimizeMemory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OPTIMIZEMEMORY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OPTIMIZEMEMORY$30);
            }
            target.set(optimizeMemory);
        }
    }
    
    /**
     * Unsets the "optimizeMemory" attribute
     */
    public void unsetOptimizeMemory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPTIMIZEMEMORY$30);
        }
    }
    
    /**
     * Gets the "enableRefresh" attribute
     */
    public boolean getEnableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEREFRESH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEREFRESH$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEREFRESH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENABLEREFRESH$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "enableRefresh" attribute
     */
    public boolean isSetEnableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLEREFRESH$32) != null;
        }
    }
    
    /**
     * Sets the "enableRefresh" attribute
     */
    public void setEnableRefresh(boolean enableRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEREFRESH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEREFRESH$32);
            }
            target.setBooleanValue(enableRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "enableRefresh" attribute
     */
    public void xsetEnableRefresh(org.apache.xmlbeans.XmlBoolean enableRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEREFRESH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLEREFRESH$32);
            }
            target.set(enableRefresh);
        }
    }
    
    /**
     * Unsets the "enableRefresh" attribute
     */
    public void unsetEnableRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLEREFRESH$32);
        }
    }
    
    /**
     * Gets the "refreshedBy" attribute
     */
    public java.lang.String getRefreshedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDBY$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshedBy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetRefreshedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(REFRESHEDBY$34);
            return target;
        }
    }
    
    /**
     * True if has "refreshedBy" attribute
     */
    public boolean isSetRefreshedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHEDBY$34) != null;
        }
    }
    
    /**
     * Sets the "refreshedBy" attribute
     */
    public void setRefreshedBy(java.lang.String refreshedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDBY$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHEDBY$34);
            }
            target.setStringValue(refreshedBy);
        }
    }
    
    /**
     * Sets (as xml) the "refreshedBy" attribute
     */
    public void xsetRefreshedBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring refreshedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(REFRESHEDBY$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(REFRESHEDBY$34);
            }
            target.set(refreshedBy);
        }
    }
    
    /**
     * Unsets the "refreshedBy" attribute
     */
    public void unsetRefreshedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHEDBY$34);
        }
    }
    
    /**
     * Gets the "refreshedDate" attribute
     */
    public double getRefreshedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDDATE$36);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshedDate" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetRefreshedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRESHEDDATE$36);
            return target;
        }
    }
    
    /**
     * True if has "refreshedDate" attribute
     */
    public boolean isSetRefreshedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHEDDATE$36) != null;
        }
    }
    
    /**
     * Sets the "refreshedDate" attribute
     */
    public void setRefreshedDate(double refreshedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHEDDATE$36);
            }
            target.setDoubleValue(refreshedDate);
        }
    }
    
    /**
     * Sets (as xml) the "refreshedDate" attribute
     */
    public void xsetRefreshedDate(org.apache.xmlbeans.XmlDouble refreshedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(REFRESHEDDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(REFRESHEDDATE$36);
            }
            target.set(refreshedDate);
        }
    }
    
    /**
     * Unsets the "refreshedDate" attribute
     */
    public void unsetRefreshedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHEDDATE$36);
        }
    }
    
    /**
     * Gets the "backgroundQuery" attribute
     */
    public boolean getBackgroundQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUNDQUERY$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BACKGROUNDQUERY$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "backgroundQuery" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBackgroundQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUNDQUERY$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BACKGROUNDQUERY$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "backgroundQuery" attribute
     */
    public boolean isSetBackgroundQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKGROUNDQUERY$38) != null;
        }
    }
    
    /**
     * Sets the "backgroundQuery" attribute
     */
    public void setBackgroundQuery(boolean backgroundQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKGROUNDQUERY$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKGROUNDQUERY$38);
            }
            target.setBooleanValue(backgroundQuery);
        }
    }
    
    /**
     * Sets (as xml) the "backgroundQuery" attribute
     */
    public void xsetBackgroundQuery(org.apache.xmlbeans.XmlBoolean backgroundQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BACKGROUNDQUERY$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BACKGROUNDQUERY$38);
            }
            target.set(backgroundQuery);
        }
    }
    
    /**
     * Unsets the "backgroundQuery" attribute
     */
    public void unsetBackgroundQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKGROUNDQUERY$38);
        }
    }
    
    /**
     * Gets the "missingItemsLimit" attribute
     */
    public long getMissingItemsLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "missingItemsLimit" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMissingItemsLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
            return target;
        }
    }
    
    /**
     * True if has "missingItemsLimit" attribute
     */
    public boolean isSetMissingItemsLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MISSINGITEMSLIMIT$40) != null;
        }
    }
    
    /**
     * Sets the "missingItemsLimit" attribute
     */
    public void setMissingItemsLimit(long missingItemsLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSINGITEMSLIMIT$40);
            }
            target.setLongValue(missingItemsLimit);
        }
    }
    
    /**
     * Sets (as xml) the "missingItemsLimit" attribute
     */
    public void xsetMissingItemsLimit(org.apache.xmlbeans.XmlUnsignedInt missingItemsLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MISSINGITEMSLIMIT$40);
            }
            target.set(missingItemsLimit);
        }
    }
    
    /**
     * Unsets the "missingItemsLimit" attribute
     */
    public void unsetMissingItemsLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MISSINGITEMSLIMIT$40);
        }
    }
    
    /**
     * Gets the "createdVersion" attribute
     */
    public short getCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDVERSION$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEDVERSION$42);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CREATEDVERSION$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(CREATEDVERSION$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "createdVersion" attribute
     */
    public boolean isSetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATEDVERSION$42) != null;
        }
    }
    
    /**
     * Sets the "createdVersion" attribute
     */
    public void setCreatedVersion(short createdVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDVERSION$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDVERSION$42);
            }
            target.setShortValue(createdVersion);
        }
    }
    
    /**
     * Sets (as xml) the "createdVersion" attribute
     */
    public void xsetCreatedVersion(org.apache.xmlbeans.XmlUnsignedByte createdVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CREATEDVERSION$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(CREATEDVERSION$42);
            }
            target.set(createdVersion);
        }
    }
    
    /**
     * Unsets the "createdVersion" attribute
     */
    public void unsetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATEDVERSION$42);
        }
    }
    
    /**
     * Gets the "refreshedVersion" attribute
     */
    public short getRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHEDVERSION$44);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshedVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(REFRESHEDVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(REFRESHEDVERSION$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshedVersion" attribute
     */
    public boolean isSetRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHEDVERSION$44) != null;
        }
    }
    
    /**
     * Sets the "refreshedVersion" attribute
     */
    public void setRefreshedVersion(short refreshedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHEDVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHEDVERSION$44);
            }
            target.setShortValue(refreshedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "refreshedVersion" attribute
     */
    public void xsetRefreshedVersion(org.apache.xmlbeans.XmlUnsignedByte refreshedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(REFRESHEDVERSION$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(REFRESHEDVERSION$44);
            }
            target.set(refreshedVersion);
        }
    }
    
    /**
     * Unsets the "refreshedVersion" attribute
     */
    public void unsetRefreshedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHEDVERSION$44);
        }
    }
    
    /**
     * Gets the "minRefreshableVersion" attribute
     */
    public short getMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINREFRESHABLEVERSION$46);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "minRefreshableVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(MINREFRESHABLEVERSION$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "minRefreshableVersion" attribute
     */
    public boolean isSetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINREFRESHABLEVERSION$46) != null;
        }
    }
    
    /**
     * Sets the "minRefreshableVersion" attribute
     */
    public void setMinRefreshableVersion(short minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINREFRESHABLEVERSION$46);
            }
            target.setShortValue(minRefreshableVersion);
        }
    }
    
    /**
     * Sets (as xml) the "minRefreshableVersion" attribute
     */
    public void xsetMinRefreshableVersion(org.apache.xmlbeans.XmlUnsignedByte minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(MINREFRESHABLEVERSION$46);
            }
            target.set(minRefreshableVersion);
        }
    }
    
    /**
     * Unsets the "minRefreshableVersion" attribute
     */
    public void unsetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINREFRESHABLEVERSION$46);
        }
    }
    
    /**
     * Gets the "recordCount" attribute
     */
    public long getRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDCOUNT$48);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "recordCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RECORDCOUNT$48);
            return target;
        }
    }
    
    /**
     * True if has "recordCount" attribute
     */
    public boolean isSetRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECORDCOUNT$48) != null;
        }
    }
    
    /**
     * Sets the "recordCount" attribute
     */
    public void setRecordCount(long recordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDCOUNT$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDCOUNT$48);
            }
            target.setLongValue(recordCount);
        }
    }
    
    /**
     * Sets (as xml) the "recordCount" attribute
     */
    public void xsetRecordCount(org.apache.xmlbeans.XmlUnsignedInt recordCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RECORDCOUNT$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RECORDCOUNT$48);
            }
            target.set(recordCount);
        }
    }
    
    /**
     * Unsets the "recordCount" attribute
     */
    public void unsetRecordCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECORDCOUNT$48);
        }
    }
    
    /**
     * Gets the "upgradeOnRefresh" attribute
     */
    public boolean getUpgradeOnRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPGRADEONREFRESH$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPGRADEONREFRESH$50);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "upgradeOnRefresh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpgradeOnRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UPGRADEONREFRESH$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UPGRADEONREFRESH$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "upgradeOnRefresh" attribute
     */
    public boolean isSetUpgradeOnRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPGRADEONREFRESH$50) != null;
        }
    }
    
    /**
     * Sets the "upgradeOnRefresh" attribute
     */
    public void setUpgradeOnRefresh(boolean upgradeOnRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPGRADEONREFRESH$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPGRADEONREFRESH$50);
            }
            target.setBooleanValue(upgradeOnRefresh);
        }
    }
    
    /**
     * Sets (as xml) the "upgradeOnRefresh" attribute
     */
    public void xsetUpgradeOnRefresh(org.apache.xmlbeans.XmlBoolean upgradeOnRefresh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UPGRADEONREFRESH$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UPGRADEONREFRESH$50);
            }
            target.set(upgradeOnRefresh);
        }
    }
    
    /**
     * Unsets the "upgradeOnRefresh" attribute
     */
    public void unsetUpgradeOnRefresh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPGRADEONREFRESH$50);
        }
    }
    
    /**
     * Gets the "tupleCache" attribute
     */
    public boolean getTupleCache2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TUPLECACHE2$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TUPLECACHE2$52);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tupleCache" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTupleCache2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TUPLECACHE2$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TUPLECACHE2$52);
            }
            return target;
        }
    }
    
    /**
     * True if has "tupleCache" attribute
     */
    public boolean isSetTupleCache2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TUPLECACHE2$52) != null;
        }
    }
    
    /**
     * Sets the "tupleCache" attribute
     */
    public void setTupleCache2(boolean tupleCache2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TUPLECACHE2$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TUPLECACHE2$52);
            }
            target.setBooleanValue(tupleCache2);
        }
    }
    
    /**
     * Sets (as xml) the "tupleCache" attribute
     */
    public void xsetTupleCache2(org.apache.xmlbeans.XmlBoolean tupleCache2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TUPLECACHE2$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TUPLECACHE2$52);
            }
            target.set(tupleCache2);
        }
    }
    
    /**
     * Unsets the "tupleCache" attribute
     */
    public void unsetTupleCache2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TUPLECACHE2$52);
        }
    }
    
    /**
     * Gets the "supportSubquery" attribute
     */
    public boolean getSupportSubquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSUBQUERY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTSUBQUERY$54);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "supportSubquery" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSupportSubquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSUBQUERY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTSUBQUERY$54);
            }
            return target;
        }
    }
    
    /**
     * True if has "supportSubquery" attribute
     */
    public boolean isSetSupportSubquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUPPORTSUBQUERY$54) != null;
        }
    }
    
    /**
     * Sets the "supportSubquery" attribute
     */
    public void setSupportSubquery(boolean supportSubquery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTSUBQUERY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTSUBQUERY$54);
            }
            target.setBooleanValue(supportSubquery);
        }
    }
    
    /**
     * Sets (as xml) the "supportSubquery" attribute
     */
    public void xsetSupportSubquery(org.apache.xmlbeans.XmlBoolean supportSubquery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTSUBQUERY$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTSUBQUERY$54);
            }
            target.set(supportSubquery);
        }
    }
    
    /**
     * Unsets the "supportSubquery" attribute
     */
    public void unsetSupportSubquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUPPORTSUBQUERY$54);
        }
    }
    
    /**
     * Gets the "supportAdvancedDrill" attribute
     */
    public boolean getSupportAdvancedDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUPPORTADVANCEDDRILL$56);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "supportAdvancedDrill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSupportAdvancedDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUPPORTADVANCEDDRILL$56);
            }
            return target;
        }
    }
    
    /**
     * True if has "supportAdvancedDrill" attribute
     */
    public boolean isSetSupportAdvancedDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56) != null;
        }
    }
    
    /**
     * Sets the "supportAdvancedDrill" attribute
     */
    public void setSupportAdvancedDrill(boolean supportAdvancedDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPORTADVANCEDDRILL$56);
            }
            target.setBooleanValue(supportAdvancedDrill);
        }
    }
    
    /**
     * Sets (as xml) the "supportAdvancedDrill" attribute
     */
    public void xsetSupportAdvancedDrill(org.apache.xmlbeans.XmlBoolean supportAdvancedDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUPPORTADVANCEDDRILL$56);
            }
            target.set(supportAdvancedDrill);
        }
    }
    
    /**
     * Unsets the "supportAdvancedDrill" attribute
     */
    public void unsetSupportAdvancedDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUPPORTADVANCEDDRILL$56);
        }
    }
}
