/*
 * XML Type:  CT_Dimensions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Dimensions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDimensionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions
{
    
    public CTDimensionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimension");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "dimension" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension> getDimensionList()
    {
        final class DimensionList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension get(int i)
                { return CTDimensionsImpl.this.getDimensionArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension old = CTDimensionsImpl.this.getDimensionArray(i);
                CTDimensionsImpl.this.setDimensionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension o)
                { CTDimensionsImpl.this.insertNewDimension(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension old = CTDimensionsImpl.this.getDimensionArray(i);
                CTDimensionsImpl.this.removeDimension(i);
                return old;
            }
            
            public int size()
                { return CTDimensionsImpl.this.sizeOfDimensionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DimensionList();
        }
    }
    
    /**
     * Gets array of all "dimension" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dimension" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$0);
        }
    }
    
    /**
     * Sets array of all "dimension" element
     */
    public void setDimensionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$0);
        }
    }
    
    /**
     * Sets ith "dimension" element
     */
    public void setDimensionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dimension" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension)get_store().insert_element_user(DIMENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dimension" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotDimension)get_store().add_element_user(DIMENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$0, i);
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
