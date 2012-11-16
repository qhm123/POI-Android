/*
 * XML Type:  CT_MRUColors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MRUColors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMRUColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors
{
    
    public CTMRUColorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
    
    
    /**
     * Gets a List of "color" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor> getColorList()
    {
        final class ColorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor get(int i)
                { return CTMRUColorsImpl.this.getColorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTMRUColorsImpl.this.getColorArray(i);
                CTMRUColorsImpl.this.setColorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
                { CTMRUColorsImpl.this.insertNewColor(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTMRUColorsImpl.this.getColorArray(i);
                CTMRUColorsImpl.this.removeColor(i);
                return old;
            }
            
            public int size()
                { return CTMRUColorsImpl.this.sizeOfColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColorList();
        }
    }
    
    /**
     * Gets array of all "color" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] getColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLOR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "color" element
     */
    public int sizeOfColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$0);
        }
    }
    
    /**
     * Sets array of all "color" element
     */
    public void setColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] colorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colorArray, COLOR$0);
        }
    }
    
    /**
     * Sets ith "color" element
     */
    public void setColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(color);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor insertNewColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().insert_element_user(COLOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "color" element
     */
    public void removeColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$0, i);
        }
    }
}
