/*
 * XML Type:  CT_Set
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Set(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSet
{
    
    public CTSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TPLS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tpls");
    private static final javax.xml.namespace.QName SORTBYTUPLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortByTuple");
    private static final javax.xml.namespace.QName COUNT$4 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName MAXRANK$6 = 
        new javax.xml.namespace.QName("", "maxRank");
    private static final javax.xml.namespace.QName SETDEFINITION$8 = 
        new javax.xml.namespace.QName("", "setDefinition");
    private static final javax.xml.namespace.QName SORTTYPE$10 = 
        new javax.xml.namespace.QName("", "sortType");
    private static final javax.xml.namespace.QName QUERYFAILED$12 = 
        new javax.xml.namespace.QName("", "queryFailed");
    
    
    /**
     * Gets a List of "tpls" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples> getTplsList()
    {
        final class TplsList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples get(int i)
                { return CTSetImpl.this.getTplsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples old = CTSetImpl.this.getTplsArray(i);
                CTSetImpl.this.setTplsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples o)
                { CTSetImpl.this.insertNewTpls(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples old = CTSetImpl.this.getTplsArray(i);
                CTSetImpl.this.removeTpls(i);
                return old;
            }
            
            public int size()
                { return CTSetImpl.this.sizeOfTplsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TplsList();
        }
    }
    
    /**
     * Gets array of all "tpls" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] getTplsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TPLS$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTplsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tpls" element
     */
    public int sizeOfTplsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TPLS$0);
        }
    }
    
    /**
     * Sets array of all "tpls" element
     */
    public void setTplsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples[] tplsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tplsArray, TPLS$0);
        }
    }
    
    /**
     * Sets ith "tpls" element
     */
    public void setTplsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tpls);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples insertNewTpls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().insert_element_user(TPLS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(TPLS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tpls" element
     */
    public void removeTpls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TPLS$0, i);
        }
    }
    
    /**
     * Gets the "sortByTuple" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getSortByTuple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(SORTBYTUPLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sortByTuple" element
     */
    public boolean isSetSortByTuple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTBYTUPLE$2) != 0;
        }
    }
    
    /**
     * Sets the "sortByTuple" element
     */
    public void setSortByTuple(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples sortByTuple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(SORTBYTUPLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(SORTBYTUPLE$2);
            }
            target.set(sortByTuple);
        }
    }
    
    /**
     * Appends and returns a new empty "sortByTuple" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewSortByTuple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(SORTBYTUPLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sortByTuple" element
     */
    public void unsetSortByTuple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTBYTUPLE$2, 0);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$4) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$4);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$4);
        }
    }
    
    /**
     * Gets the "maxRank" attribute
     */
    public int getMaxRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRANK$6);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxRank" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetMaxRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXRANK$6);
            return target;
        }
    }
    
    /**
     * Sets the "maxRank" attribute
     */
    public void setMaxRank(int maxRank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXRANK$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXRANK$6);
            }
            target.setIntValue(maxRank);
        }
    }
    
    /**
     * Sets (as xml) the "maxRank" attribute
     */
    public void xsetMaxRank(org.apache.xmlbeans.XmlInt maxRank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MAXRANK$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(MAXRANK$6);
            }
            target.set(maxRank);
        }
    }
    
    /**
     * Gets the "setDefinition" attribute
     */
    public java.lang.String getSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETDEFINITION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "setDefinition" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SETDEFINITION$8);
            return target;
        }
    }
    
    /**
     * Sets the "setDefinition" attribute
     */
    public void setSetDefinition(java.lang.String setDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETDEFINITION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETDEFINITION$8);
            }
            target.setStringValue(setDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "setDefinition" attribute
     */
    public void xsetSetDefinition(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring setDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SETDEFINITION$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SETDEFINITION$8);
            }
            target.set(setDefinition);
        }
    }
    
    /**
     * Gets the "sortType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType.Enum getSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTTYPE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType xgetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType)get_store().find_attribute_user(SORTTYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType)get_default_attribute_value(SORTTYPE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "sortType" attribute
     */
    public boolean isSetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTTYPE$10) != null;
        }
    }
    
    /**
     * Sets the "sortType" attribute
     */
    public void setSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType.Enum sortType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTTYPE$10);
            }
            target.setEnumValue(sortType);
        }
    }
    
    /**
     * Sets (as xml) the "sortType" attribute
     */
    public void xsetSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType sortType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType)get_store().find_attribute_user(SORTTYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortType)get_store().add_attribute_user(SORTTYPE$10);
            }
            target.set(sortType);
        }
    }
    
    /**
     * Unsets the "sortType" attribute
     */
    public void unsetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTTYPE$10);
        }
    }
    
    /**
     * Gets the "queryFailed" attribute
     */
    public boolean getQueryFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYFAILED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(QUERYFAILED$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryFailed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetQueryFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUERYFAILED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(QUERYFAILED$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "queryFailed" attribute
     */
    public boolean isSetQueryFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUERYFAILED$12) != null;
        }
    }
    
    /**
     * Sets the "queryFailed" attribute
     */
    public void setQueryFailed(boolean queryFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYFAILED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYFAILED$12);
            }
            target.setBooleanValue(queryFailed);
        }
    }
    
    /**
     * Sets (as xml) the "queryFailed" attribute
     */
    public void xsetQueryFailed(org.apache.xmlbeans.XmlBoolean queryFailed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUERYFAILED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(QUERYFAILED$12);
            }
            target.set(queryFailed);
        }
    }
    
    /**
     * Unsets the "queryFailed" attribute
     */
    public void unsetQueryFailed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUERYFAILED$12);
        }
    }
}
