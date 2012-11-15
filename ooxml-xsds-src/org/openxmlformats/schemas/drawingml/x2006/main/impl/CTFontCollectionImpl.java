/*
 * XML Type:  CT_FontCollection
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_FontCollection(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection
{
    
    public CTFontCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATIN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "latin");
    private static final javax.xml.namespace.QName EA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ea");
    private static final javax.xml.namespace.QName CS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cs");
    private static final javax.xml.namespace.QName FONT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "font");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "latin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(LATIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "latin" element
     */
    public void setLatin(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont latin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(LATIN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(LATIN$0);
            }
            target.set(latin);
        }
    }
    
    /**
     * Appends and returns a new empty "latin" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewLatin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(LATIN$0);
            return target;
        }
    }
    
    /**
     * Gets the "ea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(EA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ea" element
     */
    public void setEa(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont ea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(EA$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(EA$2);
            }
            target.set(ea);
        }
    }
    
    /**
     * Appends and returns a new empty "ea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewEa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(EA$2);
            return target;
        }
    }
    
    /**
     * Gets the "cs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(CS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cs" element
     */
    public void setCs(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(CS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(CS$4);
            }
            target.set(cs);
        }
    }
    
    /**
     * Appends and returns a new empty "cs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(CS$4);
            return target;
        }
    }
    
    /**
     * Gets a List of "font" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont> getFontList()
    {
        final class FontList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont get(int i)
                { return CTFontCollectionImpl.this.getFontArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont old = CTFontCollectionImpl.this.getFontArray(i);
                CTFontCollectionImpl.this.setFontArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont o)
                { CTFontCollectionImpl.this.insertNewFont(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont old = CTFontCollectionImpl.this.getFontArray(i);
                CTFontCollectionImpl.this.removeFont(i);
                return old;
            }
            
            public int size()
                { return CTFontCollectionImpl.this.sizeOfFontArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont[] getFontArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FONT$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont getFontArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont)get_store().find_element_user(FONT$6, i);
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
            return get_store().count_elements(FONT$6);
        }
    }
    
    /**
     * Sets array of all "font" element
     */
    public void setFontArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont[] fontArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fontArray, FONT$6);
        }
    }
    
    /**
     * Sets ith "font" element
     */
    public void setFontArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont)get_store().find_element_user(FONT$6, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont insertNewFont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont)get_store().insert_element_user(FONT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont)get_store().add_element_user(FONT$6);
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
            get_store().remove_element(FONT$6, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$8) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}
