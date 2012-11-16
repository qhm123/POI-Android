/*
 * XML Type:  CT_DdeValues
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DdeValues(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDdeValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValues
{
    
    public CTDdeValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "value");
    private static final javax.xml.namespace.QName ROWS$2 = 
        new javax.xml.namespace.QName("", "rows");
    private static final javax.xml.namespace.QName COLS$4 = 
        new javax.xml.namespace.QName("", "cols");
    
    
    /**
     * Gets a List of "value" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue> getValueList()
    {
        final class ValueList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue get(int i)
                { return CTDdeValuesImpl.this.getValueArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue old = CTDdeValuesImpl.this.getValueArray(i);
                CTDdeValuesImpl.this.setValueArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue o)
                { CTDdeValuesImpl.this.insertNewValue(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue old = CTDdeValuesImpl.this.getValueArray(i);
                CTDdeValuesImpl.this.removeValue(i);
                return old;
            }
            
            public int size()
                { return CTDdeValuesImpl.this.sizeOfValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValueList();
        }
    }
    
    /**
     * Gets array of all "value" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "value" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0);
        }
    }
    
    /**
     * Sets array of all "value" element
     */
    public void setValueArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets ith "value" element
     */
    public void setValueArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "value" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "value" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeValue)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, i);
        }
    }
    
    /**
     * Gets the "rows" attribute
     */
    public long getRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWS$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rows" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ROWS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "rows" attribute
     */
    public boolean isSetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWS$2) != null;
        }
    }
    
    /**
     * Sets the "rows" attribute
     */
    public void setRows(long rows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWS$2);
            }
            target.setLongValue(rows);
        }
    }
    
    /**
     * Sets (as xml) the "rows" attribute
     */
    public void xsetRows(org.apache.xmlbeans.XmlUnsignedInt rows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ROWS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ROWS$2);
            }
            target.set(rows);
        }
    }
    
    /**
     * Unsets the "rows" attribute
     */
    public void unsetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWS$2);
        }
    }
    
    /**
     * Gets the "cols" attribute
     */
    public long getCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLS$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cols" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COLS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "cols" attribute
     */
    public boolean isSetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLS$4) != null;
        }
    }
    
    /**
     * Sets the "cols" attribute
     */
    public void setCols(long cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLS$4);
            }
            target.setLongValue(cols);
        }
    }
    
    /**
     * Sets (as xml) the "cols" attribute
     */
    public void xsetCols(org.apache.xmlbeans.XmlUnsignedInt cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COLS$4);
            }
            target.set(cols);
        }
    }
    
    /**
     * Unsets the "cols" attribute
     */
    public void unsetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLS$4);
        }
    }
}
