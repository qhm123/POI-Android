/*
 * XML Type:  CT_OfficeArtExtensionList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_OfficeArtExtensionList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTOfficeArtExtensionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList
{
    
    public CTOfficeArtExtensionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ext");
    
    
    /**
     * Gets a List of "ext" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension> getExtList()
    {
        final class ExtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension get(int i)
                { return CTOfficeArtExtensionListImpl.this.getExtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension old = CTOfficeArtExtensionListImpl.this.getExtArray(i);
                CTOfficeArtExtensionListImpl.this.setExtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension o)
                { CTOfficeArtExtensionListImpl.this.insertNewExt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension old = CTOfficeArtExtensionListImpl.this.getExtArray(i);
                CTOfficeArtExtensionListImpl.this.removeExt(i);
                return old;
            }
            
            public int size()
                { return CTOfficeArtExtensionListImpl.this.sizeOfExtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtList();
        }
    }
    
    /**
     * Gets array of all "ext" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[] getExtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension getExtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension)get_store().find_element_user(EXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ext" element
     */
    public int sizeOfExtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXT$0);
        }
    }
    
    /**
     * Sets array of all "ext" element
     */
    public void setExtArray(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension[] extArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extArray, EXT$0);
        }
    }
    
    /**
     * Sets ith "ext" element
     */
    public void setExtArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension)get_store().find_element_user(EXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ext);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension insertNewExt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension)get_store().insert_element_user(EXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension addNewExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtension)get_store().add_element_user(EXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ext" element
     */
    public void removeExt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXT$0, i);
        }
    }
}
