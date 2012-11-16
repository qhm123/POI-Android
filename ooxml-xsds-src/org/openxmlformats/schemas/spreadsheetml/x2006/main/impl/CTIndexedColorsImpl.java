/*
 * XML Type:  CT_IndexedColors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_IndexedColors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIndexedColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors
{
    
    public CTIndexedColorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RGBCOLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rgbColor");
    
    
    /**
     * Gets a List of "rgbColor" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor> getRgbColorList()
    {
        final class RgbColorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor get(int i)
                { return CTIndexedColorsImpl.this.getRgbColorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor old = CTIndexedColorsImpl.this.getRgbColorArray(i);
                CTIndexedColorsImpl.this.setRgbColorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor o)
                { CTIndexedColorsImpl.this.insertNewRgbColor(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor old = CTIndexedColorsImpl.this.getRgbColorArray(i);
                CTIndexedColorsImpl.this.removeRgbColor(i);
                return old;
            }
            
            public int size()
                { return CTIndexedColorsImpl.this.sizeOfRgbColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RgbColorList();
        }
    }
    
    /**
     * Gets array of all "rgbColor" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] getRgbColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RGBCOLOR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rgbColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor getRgbColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor)get_store().find_element_user(RGBCOLOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rgbColor" element
     */
    public int sizeOfRgbColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RGBCOLOR$0);
        }
    }
    
    /**
     * Sets array of all "rgbColor" element
     */
    public void setRgbColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor[] rgbColorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rgbColorArray, RGBCOLOR$0);
        }
    }
    
    /**
     * Sets ith "rgbColor" element
     */
    public void setRgbColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor rgbColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor)get_store().find_element_user(RGBCOLOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rgbColor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rgbColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor insertNewRgbColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor)get_store().insert_element_user(RGBCOLOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rgbColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor addNewRgbColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor)get_store().add_element_user(RGBCOLOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rgbColor" element
     */
    public void removeRgbColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RGBCOLOR$0, i);
        }
    }
}
