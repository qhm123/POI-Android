/*
 * XML Type:  CT_PageFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PageFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields
{
    
    public CTPageFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGEFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "pageField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField> getPageFieldList()
    {
        final class PageFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField get(int i)
                { return CTPageFieldsImpl.this.getPageFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField old = CTPageFieldsImpl.this.getPageFieldArray(i);
                CTPageFieldsImpl.this.setPageFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField o)
                { CTPageFieldsImpl.this.insertNewPageField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField old = CTPageFieldsImpl.this.getPageFieldArray(i);
                CTPageFieldsImpl.this.removePageField(i);
                return old;
            }
            
            public int size()
                { return CTPageFieldsImpl.this.sizeOfPageFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PageFieldList();
        }
    }
    
    /**
     * Gets array of all "pageField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField[] getPageFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAGEFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pageField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField getPageFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField)get_store().find_element_user(PAGEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pageField" element
     */
    public int sizeOfPageFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEFIELD$0);
        }
    }
    
    /**
     * Sets array of all "pageField" element
     */
    public void setPageFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField[] pageFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pageFieldArray, PAGEFIELD$0);
        }
    }
    
    /**
     * Sets ith "pageField" element
     */
    public void setPageFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField pageField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField)get_store().find_element_user(PAGEFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pageField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pageField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField insertNewPageField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField)get_store().insert_element_user(PAGEFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pageField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField addNewPageField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageField)get_store().add_element_user(PAGEFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pageField" element
     */
    public void removePageField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEFIELD$0, i);
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
