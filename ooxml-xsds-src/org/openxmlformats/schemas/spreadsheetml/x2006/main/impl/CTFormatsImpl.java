/*
 * XML Type:  CT_Formats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Formats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFormatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats
{
    
    public CTFormatsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "format");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "format" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat> getFormatList()
    {
        final class FormatList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat get(int i)
                { return CTFormatsImpl.this.getFormatArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat old = CTFormatsImpl.this.getFormatArray(i);
                CTFormatsImpl.this.setFormatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat o)
                { CTFormatsImpl.this.insertNewFormat(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat old = CTFormatsImpl.this.getFormatArray(i);
                CTFormatsImpl.this.removeFormat(i);
                return old;
            }
            
            public int size()
                { return CTFormatsImpl.this.sizeOfFormatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FormatList();
        }
    }
    
    /**
     * Gets array of all "format" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[] getFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "format" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat getFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "format" element
     */
    public int sizeOfFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0);
        }
    }
    
    /**
     * Sets array of all "format" element
     */
    public void setFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat[] formatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formatArray, FORMAT$0);
        }
    }
    
    /**
     * Sets ith "format" element
     */
    public void setFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(format);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "format" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat insertNewFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat)get_store().insert_element_user(FORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "format" element
     */
    public void removeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, i);
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
