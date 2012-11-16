/*
 * XML Type:  CT_ConditionalFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ConditionalFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConditionalFormatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats
{
    
    public CTConditionalFormatsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONALFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormat");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "conditionalFormat" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat> getConditionalFormatList()
    {
        final class ConditionalFormatList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat get(int i)
                { return CTConditionalFormatsImpl.this.getConditionalFormatArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat old = CTConditionalFormatsImpl.this.getConditionalFormatArray(i);
                CTConditionalFormatsImpl.this.setConditionalFormatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat o)
                { CTConditionalFormatsImpl.this.insertNewConditionalFormat(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat old = CTConditionalFormatsImpl.this.getConditionalFormatArray(i);
                CTConditionalFormatsImpl.this.removeConditionalFormat(i);
                return old;
            }
            
            public int size()
                { return CTConditionalFormatsImpl.this.sizeOfConditionalFormatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConditionalFormatList();
        }
    }
    
    /**
     * Gets array of all "conditionalFormat" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[] getConditionalFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITIONALFORMAT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conditionalFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat getConditionalFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat)get_store().find_element_user(CONDITIONALFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conditionalFormat" element
     */
    public int sizeOfConditionalFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONALFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "conditionalFormat" element
     */
    public void setConditionalFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat[] conditionalFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conditionalFormatArray, CONDITIONALFORMAT$0);
        }
    }
    
    /**
     * Sets ith "conditionalFormat" element
     */
    public void setConditionalFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat conditionalFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat)get_store().find_element_user(CONDITIONALFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conditionalFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conditionalFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat insertNewConditionalFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat)get_store().insert_element_user(CONDITIONALFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat addNewConditionalFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormat)get_store().add_element_user(CONDITIONALFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "conditionalFormat" element
     */
    public void removeConditionalFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONALFORMAT$0, i);
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
