/*
 * XML Type:  CT_ChartFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ChartFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTChartFormatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats
{
    
    public CTChartFormatsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARTFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartFormat");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "chartFormat" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat> getChartFormatList()
    {
        final class ChartFormatList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat get(int i)
                { return CTChartFormatsImpl.this.getChartFormatArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat old = CTChartFormatsImpl.this.getChartFormatArray(i);
                CTChartFormatsImpl.this.setChartFormatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat o)
                { CTChartFormatsImpl.this.insertNewChartFormat(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat old = CTChartFormatsImpl.this.getChartFormatArray(i);
                CTChartFormatsImpl.this.removeChartFormat(i);
                return old;
            }
            
            public int size()
                { return CTChartFormatsImpl.this.sizeOfChartFormatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ChartFormatList();
        }
    }
    
    /**
     * Gets array of all "chartFormat" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[] getChartFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHARTFORMAT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "chartFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat getChartFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat)get_store().find_element_user(CHARTFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "chartFormat" element
     */
    public int sizeOfChartFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARTFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "chartFormat" element
     */
    public void setChartFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat[] chartFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(chartFormatArray, CHARTFORMAT$0);
        }
    }
    
    /**
     * Sets ith "chartFormat" element
     */
    public void setChartFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat chartFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat)get_store().find_element_user(CHARTFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(chartFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "chartFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat insertNewChartFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat)get_store().insert_element_user(CHARTFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "chartFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat addNewChartFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormat)get_store().add_element_user(CHARTFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "chartFormat" element
     */
    public void removeChartFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARTFORMAT$0, i);
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
