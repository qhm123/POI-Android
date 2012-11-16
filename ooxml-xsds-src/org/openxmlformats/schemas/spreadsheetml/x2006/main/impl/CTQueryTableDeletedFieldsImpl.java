/*
 * XML Type:  CT_QueryTableDeletedFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_QueryTableDeletedFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryTableDeletedFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQueryTableDeletedFields
{
    
    public CTQueryTableDeletedFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEDFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "deletedField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "deletedField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField> getDeletedFieldList()
    {
        final class DeletedFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField get(int i)
                { return CTQueryTableDeletedFieldsImpl.this.getDeletedFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField old = CTQueryTableDeletedFieldsImpl.this.getDeletedFieldArray(i);
                CTQueryTableDeletedFieldsImpl.this.setDeletedFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField o)
                { CTQueryTableDeletedFieldsImpl.this.insertNewDeletedField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField old = CTQueryTableDeletedFieldsImpl.this.getDeletedFieldArray(i);
                CTQueryTableDeletedFieldsImpl.this.removeDeletedField(i);
                return old;
            }
            
            public int size()
                { return CTQueryTableDeletedFieldsImpl.this.sizeOfDeletedFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DeletedFieldList();
        }
    }
    
    /**
     * Gets array of all "deletedField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField[] getDeletedFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETEDFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deletedField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField getDeletedFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField)get_store().find_element_user(DELETEDFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deletedField" element
     */
    public int sizeOfDeletedFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEDFIELD$0);
        }
    }
    
    /**
     * Sets array of all "deletedField" element
     */
    public void setDeletedFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField[] deletedFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deletedFieldArray, DELETEDFIELD$0);
        }
    }
    
    /**
     * Sets ith "deletedField" element
     */
    public void setDeletedFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField deletedField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField)get_store().find_element_user(DELETEDFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deletedField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deletedField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField insertNewDeletedField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField)get_store().insert_element_user(DELETEDFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deletedField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField addNewDeletedField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDeletedField)get_store().add_element_user(DELETEDFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "deletedField" element
     */
    public void removeDeletedField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEDFIELD$0, i);
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
