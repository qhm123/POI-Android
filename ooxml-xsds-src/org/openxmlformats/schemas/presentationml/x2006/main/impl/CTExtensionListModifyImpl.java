/*
 * XML Type:  CT_ExtensionListModify
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ExtensionListModify(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTExtensionListModifyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify
{
    
    public CTExtensionListModifyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "ext");
    private static final javax.xml.namespace.QName MOD$2 = 
        new javax.xml.namespace.QName("", "mod");
    
    
    /**
     * Gets a List of "ext" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTExtension> getExtList()
    {
        final class ExtList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTExtension>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension get(int i)
                { return CTExtensionListModifyImpl.this.getExtArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTExtension o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTExtension old = CTExtensionListModifyImpl.this.getExtArray(i);
                CTExtensionListModifyImpl.this.setExtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTExtension o)
                { CTExtensionListModifyImpl.this.insertNewExt(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTExtension old = CTExtensionListModifyImpl.this.getExtArray(i);
                CTExtensionListModifyImpl.this.removeExt(i);
                return old;
            }
            
            public int size()
                { return CTExtensionListModifyImpl.this.sizeOfExtArray(); }
            
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[] getExtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXT$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ext" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension getExtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtension target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtension)get_store().find_element_user(EXT$0, i);
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
    public void setExtArray(org.openxmlformats.schemas.presentationml.x2006.main.CTExtension[] extArray)
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
    public void setExtArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTExtension ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtension target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtension)get_store().find_element_user(EXT$0, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension insertNewExt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtension target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtension)get_store().insert_element_user(EXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ext" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtension addNewExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtension target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtension)get_store().add_element_user(EXT$0);
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
    
    /**
     * Gets the "mod" attribute
     */
    public boolean getMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOD$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mod" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MOD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MOD$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "mod" attribute
     */
    public boolean isSetMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOD$2) != null;
        }
    }
    
    /**
     * Sets the "mod" attribute
     */
    public void setMod(boolean mod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOD$2);
            }
            target.setBooleanValue(mod);
        }
    }
    
    /**
     * Sets (as xml) the "mod" attribute
     */
    public void xsetMod(org.apache.xmlbeans.XmlBoolean mod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MOD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MOD$2);
            }
            target.set(mod);
        }
    }
    
    /**
     * Unsets the "mod" attribute
     */
    public void unsetMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOD$2);
        }
    }
}
