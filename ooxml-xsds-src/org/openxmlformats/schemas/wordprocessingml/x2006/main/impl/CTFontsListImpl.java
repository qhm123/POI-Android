/*
 * XML Type:  CT_FontsList
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FontsList(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontsListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList
{
    
    public CTFontsListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "font");
    
    
    /**
     * Gets a List of "font" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont> getFontList()
    {
        final class FontList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont get(int i)
                { return CTFontsListImpl.this.getFontArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont old = CTFontsListImpl.this.getFontArray(i);
                CTFontsListImpl.this.setFontArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont o)
                { CTFontsListImpl.this.insertNewFont(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont old = CTFontsListImpl.this.getFontArray(i);
                CTFontsListImpl.this.removeFont(i);
                return old;
            }
            
            public int size()
                { return CTFontsListImpl.this.sizeOfFontArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont[] getFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FONT$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "font" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont getFontArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont)get_store().find_element_user(FONT$0, i);
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
    public void setFontArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont[] fontArray)
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
    public void setFontArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont)get_store().find_element_user(FONT$0, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont insertNewFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont)get_store().insert_element_user(FONT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "font" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont)get_store().add_element_user(FONT$0);
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
}
