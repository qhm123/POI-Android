/*
 * XML Type:  CT_MeasureDimensionMaps
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MeasureDimensionMaps(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMeasureDimensionMapsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps
{
    
    public CTMeasureDimensionMapsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "map");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "map" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap> getMapList()
    {
        final class MapList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap get(int i)
                { return CTMeasureDimensionMapsImpl.this.getMapArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap old = CTMeasureDimensionMapsImpl.this.getMapArray(i);
                CTMeasureDimensionMapsImpl.this.setMapArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap o)
                { CTMeasureDimensionMapsImpl.this.insertNewMap(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap old = CTMeasureDimensionMapsImpl.this.getMapArray(i);
                CTMeasureDimensionMapsImpl.this.removeMap(i);
                return old;
            }
            
            public int size()
                { return CTMeasureDimensionMapsImpl.this.sizeOfMapArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MapList();
        }
    }
    
    /**
     * Gets array of all "map" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap)get_store().find_element_user(MAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$0);
        }
    }
    
    /**
     * Sets array of all "map" element
     */
    public void setMapArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap[] mapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapArray, MAP$0);
        }
    }
    
    /**
     * Sets ith "map" element
     */
    public void setMapArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap)get_store().find_element_user(MAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap)get_store().insert_element_user(MAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap)get_store().add_element_user(MAP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$0, i);
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
