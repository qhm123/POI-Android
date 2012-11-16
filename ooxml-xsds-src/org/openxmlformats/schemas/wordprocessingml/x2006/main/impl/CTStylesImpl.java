/*
 * XML Type:  CT_Styles
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Styles(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTStylesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles
{
    
    public CTStylesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCDEFAULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docDefaults");
    private static final javax.xml.namespace.QName LATENTSTYLES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "latentStyles");
    private static final javax.xml.namespace.QName STYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "style");
    
    
    /**
     * Gets the "docDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults getDocDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults)get_store().find_element_user(DOCDEFAULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docDefaults" element
     */
    public boolean isSetDocDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCDEFAULTS$0) != 0;
        }
    }
    
    /**
     * Sets the "docDefaults" element
     */
    public void setDocDefaults(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults docDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults)get_store().find_element_user(DOCDEFAULTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults)get_store().add_element_user(DOCDEFAULTS$0);
            }
            target.set(docDefaults);
        }
    }
    
    /**
     * Appends and returns a new empty "docDefaults" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults addNewDocDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults)get_store().add_element_user(DOCDEFAULTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "docDefaults" element
     */
    public void unsetDocDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCDEFAULTS$0, 0);
        }
    }
    
    /**
     * Gets the "latentStyles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles getLatentStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles)get_store().find_element_user(LATENTSTYLES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "latentStyles" element
     */
    public boolean isSetLatentStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATENTSTYLES$2) != 0;
        }
    }
    
    /**
     * Sets the "latentStyles" element
     */
    public void setLatentStyles(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles latentStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles)get_store().find_element_user(LATENTSTYLES$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles)get_store().add_element_user(LATENTSTYLES$2);
            }
            target.set(latentStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "latentStyles" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles addNewLatentStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles)get_store().add_element_user(LATENTSTYLES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "latentStyles" element
     */
    public void unsetLatentStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATENTSTYLES$2, 0);
        }
    }
    
    /**
     * Gets a List of "style" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle> getStyleList()
    {
        final class StyleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle get(int i)
                { return CTStylesImpl.this.getStyleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle old = CTStylesImpl.this.getStyleArray(i);
                CTStylesImpl.this.setStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle o)
                { CTStylesImpl.this.insertNewStyle(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle old = CTStylesImpl.this.getStyleArray(i);
                CTStylesImpl.this.removeStyle(i);
                return old;
            }
            
            public int size()
                { return CTStylesImpl.this.sizeOfStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StyleList();
        }
    }
    
    /**
     * Gets array of all "style" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[] getStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle getStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle)get_store().find_element_user(STYLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "style" element
     */
    public int sizeOfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$4);
        }
    }
    
    /**
     * Sets array of all "style" element
     */
    public void setStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle[] styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$4);
        }
    }
    
    /**
     * Sets ith "style" element
     */
    public void setStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle)get_store().find_element_user(STYLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(style);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle insertNewStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle)get_store().insert_element_user(STYLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle)get_store().add_element_user(STYLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "style" element
     */
    public void removeStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$4, i);
        }
    }
}
