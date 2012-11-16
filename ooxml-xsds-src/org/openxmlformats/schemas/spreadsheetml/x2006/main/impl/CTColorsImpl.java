/*
 * XML Type:  CT_Colors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Colors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors
{
    
    public CTColorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXEDCOLORS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "indexedColors");
    private static final javax.xml.namespace.QName MRUCOLORS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mruColors");
    
    
    /**
     * Gets the "indexedColors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors getIndexedColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors)get_store().find_element_user(INDEXEDCOLORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "indexedColors" element
     */
    public boolean isSetIndexedColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDEXEDCOLORS$0) != 0;
        }
    }
    
    /**
     * Sets the "indexedColors" element
     */
    public void setIndexedColors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors indexedColors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors)get_store().find_element_user(INDEXEDCOLORS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors)get_store().add_element_user(INDEXEDCOLORS$0);
            }
            target.set(indexedColors);
        }
    }
    
    /**
     * Appends and returns a new empty "indexedColors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors addNewIndexedColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors)get_store().add_element_user(INDEXEDCOLORS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "indexedColors" element
     */
    public void unsetIndexedColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDEXEDCOLORS$0, 0);
        }
    }
    
    /**
     * Gets the "mruColors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors getMruColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors)get_store().find_element_user(MRUCOLORS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mruColors" element
     */
    public boolean isSetMruColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRUCOLORS$2) != 0;
        }
    }
    
    /**
     * Sets the "mruColors" element
     */
    public void setMruColors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors mruColors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors)get_store().find_element_user(MRUCOLORS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors)get_store().add_element_user(MRUCOLORS$2);
            }
            target.set(mruColors);
        }
    }
    
    /**
     * Appends and returns a new empty "mruColors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors addNewMruColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMRUColors)get_store().add_element_user(MRUCOLORS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "mruColors" element
     */
    public void unsetMruColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRUCOLORS$2, 0);
        }
    }
}
