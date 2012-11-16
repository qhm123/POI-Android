/*
 * XML Type:  CT_PivotFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields
{
    
    public CTPivotFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "pivotField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField> getPivotFieldList()
    {
        final class PivotFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField get(int i)
                { return CTPivotFieldsImpl.this.getPivotFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField old = CTPivotFieldsImpl.this.getPivotFieldArray(i);
                CTPivotFieldsImpl.this.setPivotFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField o)
                { CTPivotFieldsImpl.this.insertNewPivotField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField old = CTPivotFieldsImpl.this.getPivotFieldArray(i);
                CTPivotFieldsImpl.this.removePivotField(i);
                return old;
            }
            
            public int size()
                { return CTPivotFieldsImpl.this.sizeOfPivotFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotFieldList();
        }
    }
    
    /**
     * Gets array of all "pivotField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[] getPivotFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField getPivotFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField)get_store().find_element_user(PIVOTFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotField" element
     */
    public int sizeOfPivotFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTFIELD$0);
        }
    }
    
    /**
     * Sets array of all "pivotField" element
     */
    public void setPivotFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField[] pivotFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotFieldArray, PIVOTFIELD$0);
        }
    }
    
    /**
     * Sets ith "pivotField" element
     */
    public void setPivotFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField pivotField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField)get_store().find_element_user(PIVOTFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField insertNewPivotField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField)get_store().insert_element_user(PIVOTFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField addNewPivotField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField)get_store().add_element_user(PIVOTFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotField" element
     */
    public void removePivotField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTFIELD$0, i);
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
