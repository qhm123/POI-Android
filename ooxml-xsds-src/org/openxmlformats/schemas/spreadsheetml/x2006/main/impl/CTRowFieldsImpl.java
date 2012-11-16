/*
 * XML Type:  CT_RowFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RowFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRowFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields
{
    
    public CTRowFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "field");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "field" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField> getFieldList()
    {
        final class FieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField get(int i)
                { return CTRowFieldsImpl.this.getFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField old = CTRowFieldsImpl.this.getFieldArray(i);
                CTRowFieldsImpl.this.setFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField o)
                { CTRowFieldsImpl.this.insertNewField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField old = CTRowFieldsImpl.this.getFieldArray(i);
                CTRowFieldsImpl.this.removeField(i);
                return old;
            }
            
            public int size()
                { return CTRowFieldsImpl.this.sizeOfFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FieldList();
        }
    }
    
    /**
     * Gets array of all "field" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] getFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "field" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField getFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField)get_store().find_element_user(FIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "field" element
     */
    public int sizeOfFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELD$0);
        }
    }
    
    /**
     * Sets array of all "field" element
     */
    public void setFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] fieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD$0);
        }
    }
    
    /**
     * Sets ith "field" element
     */
    public void setFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField)get_store().find_element_user(FIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(field);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField insertNewField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField)get_store().insert_element_user(FIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "field" element
     */
    public void removeField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELD$0, i);
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
