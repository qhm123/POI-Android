/*
 * XML Type:  CT_ColorSchemeList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ColorSchemeList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorSchemeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList
{
    
    public CTColorSchemeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRACLRSCHEME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extraClrScheme");
    
    
    /**
     * Gets a List of "extraClrScheme" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping> getExtraClrSchemeList()
    {
        final class ExtraClrSchemeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping get(int i)
                { return CTColorSchemeListImpl.this.getExtraClrSchemeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping old = CTColorSchemeListImpl.this.getExtraClrSchemeArray(i);
                CTColorSchemeListImpl.this.setExtraClrSchemeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping o)
                { CTColorSchemeListImpl.this.insertNewExtraClrScheme(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping old = CTColorSchemeListImpl.this.getExtraClrSchemeArray(i);
                CTColorSchemeListImpl.this.removeExtraClrScheme(i);
                return old;
            }
            
            public int size()
                { return CTColorSchemeListImpl.this.sizeOfExtraClrSchemeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtraClrSchemeList();
        }
    }
    
    /**
     * Gets array of all "extraClrScheme" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping[] getExtraClrSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTRACLRSCHEME$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extraClrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping getExtraClrSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping)get_store().find_element_user(EXTRACLRSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extraClrScheme" element
     */
    public int sizeOfExtraClrSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRACLRSCHEME$0);
        }
    }
    
    /**
     * Sets array of all "extraClrScheme" element
     */
    public void setExtraClrSchemeArray(org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping[] extraClrSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extraClrSchemeArray, EXTRACLRSCHEME$0);
        }
    }
    
    /**
     * Sets ith "extraClrScheme" element
     */
    public void setExtraClrSchemeArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping extraClrScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping)get_store().find_element_user(EXTRACLRSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extraClrScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extraClrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping insertNewExtraClrScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping)get_store().insert_element_user(EXTRACLRSCHEME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extraClrScheme" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping addNewExtraClrScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeAndMapping)get_store().add_element_user(EXTRACLRSCHEME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "extraClrScheme" element
     */
    public void removeExtraClrScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRACLRSCHEME$0, i);
        }
    }
}
