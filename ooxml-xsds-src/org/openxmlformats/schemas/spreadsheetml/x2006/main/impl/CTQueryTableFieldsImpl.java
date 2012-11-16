/*
 * XML Type:  CT_QueryTableFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_QueryTableFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryTableFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableFields
{
    
    public CTQueryTableFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTABLEFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "queryTableField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "queryTableField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField> getQueryTableFieldList()
    {
        final class QueryTableFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField get(int i)
                { return CTQueryTableFieldsImpl.this.getQueryTableFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField old = CTQueryTableFieldsImpl.this.getQueryTableFieldArray(i);
                CTQueryTableFieldsImpl.this.setQueryTableFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField o)
                { CTQueryTableFieldsImpl.this.insertNewQueryTableField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField old = CTQueryTableFieldsImpl.this.getQueryTableFieldArray(i);
                CTQueryTableFieldsImpl.this.removeQueryTableField(i);
                return old;
            }
            
            public int size()
                { return CTQueryTableFieldsImpl.this.sizeOfQueryTableFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QueryTableFieldList();
        }
    }
    
    /**
     * Gets array of all "queryTableField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[] getQueryTableFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYTABLEFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "queryTableField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField getQueryTableFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField)get_store().find_element_user(QUERYTABLEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "queryTableField" element
     */
    public int sizeOfQueryTableFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYTABLEFIELD$0);
        }
    }
    
    /**
     * Sets array of all "queryTableField" element
     */
    public void setQueryTableFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField[] queryTableFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryTableFieldArray, QUERYTABLEFIELD$0);
        }
    }
    
    /**
     * Sets ith "queryTableField" element
     */
    public void setQueryTableFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField queryTableField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField)get_store().find_element_user(QUERYTABLEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryTableField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "queryTableField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField insertNewQueryTableField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField)get_store().insert_element_user(QUERYTABLEFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "queryTableField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField addNewQueryTableField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableField)get_store().add_element_user(QUERYTABLEFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "queryTableField" element
     */
    public void removeQueryTableField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYTABLEFIELD$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$2);
            }
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
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$2);
            }
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
