/*
 * XML Type:  CT_FieldsUsage
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FieldsUsage(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFieldsUsageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage
{
    
    public CTFieldsUsageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDUSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fieldUsage");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "fieldUsage" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage> getFieldUsageList()
    {
        final class FieldUsageList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage get(int i)
                { return CTFieldsUsageImpl.this.getFieldUsageArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage old = CTFieldsUsageImpl.this.getFieldUsageArray(i);
                CTFieldsUsageImpl.this.setFieldUsageArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage o)
                { CTFieldsUsageImpl.this.insertNewFieldUsage(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage old = CTFieldsUsageImpl.this.getFieldUsageArray(i);
                CTFieldsUsageImpl.this.removeFieldUsage(i);
                return old;
            }
            
            public int size()
                { return CTFieldsUsageImpl.this.sizeOfFieldUsageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FieldUsageList();
        }
    }
    
    /**
     * Gets array of all "fieldUsage" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[] getFieldUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDUSAGE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fieldUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage getFieldUsageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage)get_store().find_element_user(FIELDUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fieldUsage" element
     */
    public int sizeOfFieldUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDUSAGE$0);
        }
    }
    
    /**
     * Sets array of all "fieldUsage" element
     */
    public void setFieldUsageArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage[] fieldUsageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldUsageArray, FIELDUSAGE$0);
        }
    }
    
    /**
     * Sets ith "fieldUsage" element
     */
    public void setFieldUsageArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage fieldUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage)get_store().find_element_user(FIELDUSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fieldUsage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fieldUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage insertNewFieldUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage)get_store().insert_element_user(FIELDUSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fieldUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage addNewFieldUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldUsage)get_store().add_element_user(FIELDUSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "fieldUsage" element
     */
    public void removeFieldUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDUSAGE$0, i);
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
