/*
 * XML Type:  CT_SlideRelationshipList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideRelationshipList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideRelationshipListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipList
{
    
    public CTSlideRelationshipListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sld");
    
    
    /**
     * Gets a List of "sld" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry> getSldList()
    {
        final class SldList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry get(int i)
                { return CTSlideRelationshipListImpl.this.getSldArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry old = CTSlideRelationshipListImpl.this.getSldArray(i);
                CTSlideRelationshipListImpl.this.setSldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry o)
                { CTSlideRelationshipListImpl.this.insertNewSld(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry old = CTSlideRelationshipListImpl.this.getSldArray(i);
                CTSlideRelationshipListImpl.this.removeSld(i);
                return old;
            }
            
            public int size()
                { return CTSlideRelationshipListImpl.this.sizeOfSldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SldList();
        }
    }
    
    /**
     * Gets array of all "sld" elements
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[] getSldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SLD$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry getSldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry)get_store().find_element_user(SLD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sld" element
     */
    public int sizeOfSldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLD$0);
        }
    }
    
    /**
     * Sets array of all "sld" element
     */
    public void setSldArray(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry[] sldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sldArray, SLD$0);
        }
    }
    
    /**
     * Sets ith "sld" element
     */
    public void setSldArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry sld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry)get_store().find_element_user(SLD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sld);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry insertNewSld(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry)get_store().insert_element_user(SLD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry addNewSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideRelationshipListEntry)get_store().add_element_user(SLD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sld" element
     */
    public void removeSld(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLD$0, i);
        }
    }
}
