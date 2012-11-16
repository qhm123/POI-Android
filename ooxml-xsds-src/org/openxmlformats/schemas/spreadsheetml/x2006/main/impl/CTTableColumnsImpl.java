/*
 * XML Type:  CT_TableColumns
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableColumns(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableColumnsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns
{
    
    public CTTableColumnsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLECOLUMN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableColumn");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "tableColumn" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn> getTableColumnList()
    {
        final class TableColumnList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn get(int i)
                { return CTTableColumnsImpl.this.getTableColumnArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn old = CTTableColumnsImpl.this.getTableColumnArray(i);
                CTTableColumnsImpl.this.setTableColumnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn o)
                { CTTableColumnsImpl.this.insertNewTableColumn(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn old = CTTableColumnsImpl.this.getTableColumnArray(i);
                CTTableColumnsImpl.this.removeTableColumn(i);
                return old;
            }
            
            public int size()
                { return CTTableColumnsImpl.this.sizeOfTableColumnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TableColumnList();
        }
    }
    
    /**
     * Gets array of all "tableColumn" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[] getTableColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLECOLUMN$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tableColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn getTableColumnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn)get_store().find_element_user(TABLECOLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tableColumn" element
     */
    public int sizeOfTableColumnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLECOLUMN$0);
        }
    }
    
    /**
     * Sets array of all "tableColumn" element
     */
    public void setTableColumnArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn[] tableColumnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableColumnArray, TABLECOLUMN$0);
        }
    }
    
    /**
     * Sets ith "tableColumn" element
     */
    public void setTableColumnArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn tableColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn)get_store().find_element_user(TABLECOLUMN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tableColumn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tableColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn insertNewTableColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn)get_store().insert_element_user(TABLECOLUMN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tableColumn" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn addNewTableColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn)get_store().add_element_user(TABLECOLUMN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tableColumn" element
     */
    public void removeTableColumn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLECOLUMN$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
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
            return get_store().find_attribute_user(COUNT$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
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
            get_store().remove_attribute(COUNT$2);
        }
    }
}
