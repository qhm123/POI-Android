/*
 * XML Type:  CT_AutoFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_AutoFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTAutoFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter
{
    
    public CTAutoFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERCOLUMN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filterColumn");
    private static final javax.xml.namespace.QName SORTSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName REF$6 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets a List of "filterColumn" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn> getFilterColumnList()
    {
        final class FilterColumnList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn get(int i)
                { return CTAutoFilterImpl.this.getFilterColumnArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn old = CTAutoFilterImpl.this.getFilterColumnArray(i);
                CTAutoFilterImpl.this.setFilterColumnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn o)
                { CTAutoFilterImpl.this.insertNewFilterColumn(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn old = CTAutoFilterImpl.this.getFilterColumnArray(i);
                CTAutoFilterImpl.this.removeFilterColumn(i);
                return old;
            }
            
            public int size()
                { return CTAutoFilterImpl.this.sizeOfFilterColumnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterColumnList();
        }
    }
    
    /**
     * Gets array of all "filterColumn" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[] getFilterColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTERCOLUMN$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filterColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn getFilterColumnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn)get_store().find_element_user(FILTERCOLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filterColumn" element
     */
    public int sizeOfFilterColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERCOLUMN$0);
        }
    }
    
    /**
     * Sets array of all "filterColumn" element
     */
    public void setFilterColumnArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn[] filterColumnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterColumnArray, FILTERCOLUMN$0);
        }
    }
    
    /**
     * Sets ith "filterColumn" element
     */
    public void setFilterColumnArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn filterColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn)get_store().find_element_user(FILTERCOLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filterColumn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filterColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn insertNewFilterColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn)get_store().insert_element_user(FILTERCOLUMN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filterColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn addNewFilterColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn)get_store().add_element_user(FILTERCOLUMN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filterColumn" element
     */
    public void removeFilterColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERCOLUMN$0, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$2, 0);
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
            return get_store().count_elements(SORTSTATE$2) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$2);
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
            get_store().remove_element(SORTSTATE$2, 0);
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
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$6);
            return target;
        }
    }
    
    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REF$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$6);
            }
            target.set(ref);
        }
    }
    
    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REF$6);
        }
    }
}
