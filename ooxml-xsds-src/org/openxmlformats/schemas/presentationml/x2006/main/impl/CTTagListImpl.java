/*
 * XML Type:  CT_TagList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTagList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TagList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTagListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTagList
{
    
    public CTTagListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tag");
    
    
    /**
     * Gets a List of "tag" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag> getTagList()
    {
        final class TagList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag get(int i)
                { return CTTagListImpl.this.getTagArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag old = CTTagListImpl.this.getTagArray(i);
                CTTagListImpl.this.setTagArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag o)
                { CTTagListImpl.this.insertNewTag(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag old = CTTagListImpl.this.getTagArray(i);
                CTTagListImpl.this.removeTag(i);
                return old;
            }
            
            public int size()
                { return CTTagListImpl.this.sizeOfTagArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TagList();
        }
    }
    
    /**
     * Gets array of all "tag" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag[] getTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAG$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tag" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag getTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag)get_store().find_element_user(TAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tag" element
     */
    public int sizeOfTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAG$0);
        }
    }
    
    /**
     * Sets array of all "tag" element
     */
    public void setTagArray(org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag[] tagArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tagArray, TAG$0);
        }
    }
    
    /**
     * Sets ith "tag" element
     */
    public void setTagArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag)get_store().find_element_user(TAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tag" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag insertNewTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag)get_store().insert_element_user(TAG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tag" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag addNewTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTStringTag)get_store().add_element_user(TAG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tag" element
     */
    public void removeTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAG$0, i);
        }
    }
}
