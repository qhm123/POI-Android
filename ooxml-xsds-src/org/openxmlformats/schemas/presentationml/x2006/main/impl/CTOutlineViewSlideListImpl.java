/*
 * XML Type:  CT_OutlineViewSlideList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_OutlineViewSlideList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTOutlineViewSlideListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList
{
    
    public CTOutlineViewSlideListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sld");
    
    
    /**
     * Gets a List of "sld" elements
     */
    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry> getSldList()
    {
        final class SldList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry>
        {
            public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry get(int i)
                { return CTOutlineViewSlideListImpl.this.getSldArray(i); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry o)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry old = CTOutlineViewSlideListImpl.this.getSldArray(i);
                CTOutlineViewSlideListImpl.this.setSldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry o)
                { CTOutlineViewSlideListImpl.this.insertNewSld(i).set(o); }
            
            public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry remove(int i)
            {
                org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry old = CTOutlineViewSlideListImpl.this.getSldArray(i);
                CTOutlineViewSlideListImpl.this.removeSld(i);
                return old;
            }
            
            public int size()
                { return CTOutlineViewSlideListImpl.this.sizeOfSldArray(); }
            
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[] getSldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SLD$0, targetList);
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry getSldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry)get_store().find_element_user(SLD$0, i);
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
    public void setSldArray(org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry[] sldArray)
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
    public void setSldArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry sld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry)get_store().find_element_user(SLD$0, i);
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
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry insertNewSld(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry)get_store().insert_element_user(SLD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry addNewSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideEntry)get_store().add_element_user(SLD$0);
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
