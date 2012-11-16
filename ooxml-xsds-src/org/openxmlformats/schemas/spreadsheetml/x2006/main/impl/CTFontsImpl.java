/*
 * XML Type:  CT_Fonts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Fonts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts
{
    
    public CTFontsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "font");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "font" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont> getFontList()
    {
        final class FontList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont get(int i)
                { return CTFontsImpl.this.getFontArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont old = CTFontsImpl.this.getFontArray(i);
                CTFontsImpl.this.setFontArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont o)
                { CTFontsImpl.this.insertNewFont(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont old = CTFontsImpl.this.getFontArray(i);
                CTFontsImpl.this.removeFont(i);
                return old;
            }
            
            public int size()
                { return CTFontsImpl.this.sizeOfFontArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FontList();
        }
    }
    
    /**
     * Gets array of all "font" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[] getFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FONT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "font" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont getFontArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().find_element_user(FONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "font" element
     */
    public int sizeOfFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FONT$0);
        }
    }
    
    /**
     * Sets array of all "font" element
     */
    public void setFontArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[] fontArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fontArray, FONT$0);
        }
    }
    
    /**
     * Sets ith "font" element
     */
    public void setFontArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().find_element_user(FONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(font);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "font" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont insertNewFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().insert_element_user(FONT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "font" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().add_element_user(FONT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "font" element
     */
    public void removeFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FONT$0, i);
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
