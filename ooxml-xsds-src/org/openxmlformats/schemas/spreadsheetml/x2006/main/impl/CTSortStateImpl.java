/*
 * XML Type:  CT_SortState
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SortState(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSortStateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState
{
    
    public CTSortStateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTCONDITION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortCondition");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName COLUMNSORT$4 = 
        new javax.xml.namespace.QName("", "columnSort");
    private static final javax.xml.namespace.QName CASESENSITIVE$6 = 
        new javax.xml.namespace.QName("", "caseSensitive");
    private static final javax.xml.namespace.QName SORTMETHOD$8 = 
        new javax.xml.namespace.QName("", "sortMethod");
    private static final javax.xml.namespace.QName REF$10 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets a List of "sortCondition" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition> getSortConditionList()
    {
        final class SortConditionList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition get(int i)
                { return CTSortStateImpl.this.getSortConditionArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition old = CTSortStateImpl.this.getSortConditionArray(i);
                CTSortStateImpl.this.setSortConditionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition o)
                { CTSortStateImpl.this.insertNewSortCondition(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition old = CTSortStateImpl.this.getSortConditionArray(i);
                CTSortStateImpl.this.removeSortCondition(i);
                return old;
            }
            
            public int size()
                { return CTSortStateImpl.this.sizeOfSortConditionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SortConditionList();
        }
    }
    
    /**
     * Gets array of all "sortCondition" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[] getSortConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SORTCONDITION$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sortCondition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition getSortConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition)get_store().find_element_user(SORTCONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sortCondition" element
     */
    public int sizeOfSortConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTCONDITION$0);
        }
    }
    
    /**
     * Sets array of all "sortCondition" element
     */
    public void setSortConditionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition[] sortConditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sortConditionArray, SORTCONDITION$0);
        }
    }
    
    /**
     * Sets ith "sortCondition" element
     */
    public void setSortConditionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition sortCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition)get_store().find_element_user(SORTCONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sortCondition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sortCondition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition insertNewSortCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition)get_store().insert_element_user(SORTCONDITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sortCondition" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition addNewSortCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition)get_store().add_element_user(SORTCONDITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sortCondition" element
     */
    public void removeSortCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTCONDITION$0, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "columnSort" attribute
     */
    public boolean getColumnSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNSORT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLUMNSORT$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnSort" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetColumnSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLUMNSORT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COLUMNSORT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "columnSort" attribute
     */
    public boolean isSetColumnSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLUMNSORT$4) != null;
        }
    }
    
    /**
     * Sets the "columnSort" attribute
     */
    public void setColumnSort(boolean columnSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMNSORT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLUMNSORT$4);
            }
            target.setBooleanValue(columnSort);
        }
    }
    
    /**
     * Sets (as xml) the "columnSort" attribute
     */
    public void xsetColumnSort(org.apache.xmlbeans.XmlBoolean columnSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLUMNSORT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COLUMNSORT$4);
            }
            target.set(columnSort);
        }
    }
    
    /**
     * Unsets the "columnSort" attribute
     */
    public void unsetColumnSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLUMNSORT$4);
        }
    }
    
    /**
     * Gets the "caseSensitive" attribute
     */
    public boolean getCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASESENSITIVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CASESENSITIVE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseSensitive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASESENSITIVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CASESENSITIVE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "caseSensitive" attribute
     */
    public boolean isSetCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CASESENSITIVE$6) != null;
        }
    }
    
    /**
     * Sets the "caseSensitive" attribute
     */
    public void setCaseSensitive(boolean caseSensitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASESENSITIVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CASESENSITIVE$6);
            }
            target.setBooleanValue(caseSensitive);
        }
    }
    
    /**
     * Sets (as xml) the "caseSensitive" attribute
     */
    public void xsetCaseSensitive(org.apache.xmlbeans.XmlBoolean caseSensitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASESENSITIVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CASESENSITIVE$6);
            }
            target.set(caseSensitive);
        }
    }
    
    /**
     * Unsets the "caseSensitive" attribute
     */
    public void unsetCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CASESENSITIVE$6);
        }
    }
    
    /**
     * Gets the "sortMethod" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod.Enum getSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTMETHOD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTMETHOD$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortMethod" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod xgetSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod)get_store().find_attribute_user(SORTMETHOD$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod)get_default_attribute_value(SORTMETHOD$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "sortMethod" attribute
     */
    public boolean isSetSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTMETHOD$8) != null;
        }
    }
    
    /**
     * Sets the "sortMethod" attribute
     */
    public void setSortMethod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod.Enum sortMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTMETHOD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTMETHOD$8);
            }
            target.setEnumValue(sortMethod);
        }
    }
    
    /**
     * Sets (as xml) the "sortMethod" attribute
     */
    public void xsetSortMethod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod sortMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod)get_store().find_attribute_user(SORTMETHOD$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortMethod)get_store().add_attribute_user(SORTMETHOD$8);
            }
            target.set(sortMethod);
        }
    }
    
    /**
     * Unsets the "sortMethod" attribute
     */
    public void unsetSortMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTMETHOD$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$10);
            }
            target.set(ref);
        }
    }
}
