/*
 * XML Type:  CT_DataFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields
{
    
    public CTDataFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "dataField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField> getDataFieldList()
    {
        final class DataFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField get(int i)
                { return CTDataFieldsImpl.this.getDataFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField old = CTDataFieldsImpl.this.getDataFieldArray(i);
                CTDataFieldsImpl.this.setDataFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField o)
                { CTDataFieldsImpl.this.insertNewDataField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField old = CTDataFieldsImpl.this.getDataFieldArray(i);
                CTDataFieldsImpl.this.removeDataField(i);
                return old;
            }
            
            public int size()
                { return CTDataFieldsImpl.this.sizeOfDataFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DataFieldList();
        }
    }
    
    /**
     * Gets array of all "dataField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[] getDataFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField getDataFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField)get_store().find_element_user(DATAFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataField" element
     */
    public int sizeOfDataFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFIELD$0);
        }
    }
    
    /**
     * Sets array of all "dataField" element
     */
    public void setDataFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField[] dataFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataFieldArray, DATAFIELD$0);
        }
    }
    
    /**
     * Sets ith "dataField" element
     */
    public void setDataFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField dataField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField)get_store().find_element_user(DATAFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField insertNewDataField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField)get_store().insert_element_user(DATAFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField addNewDataField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField)get_store().add_element_user(DATAFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataField" element
     */
    public void removeDataField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFIELD$0, i);
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
