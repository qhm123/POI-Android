/*
 * XML Type:  CT_TextFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TextFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextFields
{
    
    public CTTextFieldsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFIELD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "textField");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "textField" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField> getTextFieldList()
    {
        final class TextFieldList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField get(int i)
                { return CTTextFieldsImpl.this.getTextFieldArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField old = CTTextFieldsImpl.this.getTextFieldArray(i);
                CTTextFieldsImpl.this.setTextFieldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField o)
                { CTTextFieldsImpl.this.insertNewTextField(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField old = CTTextFieldsImpl.this.getTextFieldArray(i);
                CTTextFieldsImpl.this.removeTextField(i);
                return old;
            }
            
            public int size()
                { return CTTextFieldsImpl.this.sizeOfTextFieldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextFieldList();
        }
    }
    
    /**
     * Gets array of all "textField" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField[] getTextFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTFIELD$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField getTextFieldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField)get_store().find_element_user(TEXTFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textField" element
     */
    public int sizeOfTextFieldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTFIELD$0);
        }
    }
    
    /**
     * Sets array of all "textField" element
     */
    public void setTextFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField[] textFieldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textFieldArray, TEXTFIELD$0);
        }
    }
    
    /**
     * Sets ith "textField" element
     */
    public void setTextFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField textField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField)get_store().find_element_user(TEXTFIELD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textField);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField insertNewTextField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField)get_store().insert_element_user(TEXTFIELD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textField" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField addNewTextField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextField)get_store().add_element_user(TEXTFIELD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "textField" element
     */
    public void removeTextField(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTFIELD$0, i);
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
