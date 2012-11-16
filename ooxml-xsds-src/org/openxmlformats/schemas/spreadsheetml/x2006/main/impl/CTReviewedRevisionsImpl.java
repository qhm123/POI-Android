/*
 * XML Type:  CT_ReviewedRevisions
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ReviewedRevisions(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTReviewedRevisionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions
{
    
    public CTReviewedRevisionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVIEWED$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "reviewed");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "reviewed" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed> getReviewedList()
    {
        final class ReviewedList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed get(int i)
                { return CTReviewedRevisionsImpl.this.getReviewedArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed old = CTReviewedRevisionsImpl.this.getReviewedArray(i);
                CTReviewedRevisionsImpl.this.setReviewedArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed o)
                { CTReviewedRevisionsImpl.this.insertNewReviewed(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed old = CTReviewedRevisionsImpl.this.getReviewedArray(i);
                CTReviewedRevisionsImpl.this.removeReviewed(i);
                return old;
            }
            
            public int size()
                { return CTReviewedRevisionsImpl.this.sizeOfReviewedArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReviewedList();
        }
    }
    
    /**
     * Gets array of all "reviewed" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[] getReviewedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REVIEWED$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reviewed" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed getReviewedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed)get_store().find_element_user(REVIEWED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reviewed" element
     */
    public int sizeOfReviewedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVIEWED$0);
        }
    }
    
    /**
     * Sets array of all "reviewed" element
     */
    public void setReviewedArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed[] reviewedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reviewedArray, REVIEWED$0);
        }
    }
    
    /**
     * Sets ith "reviewed" element
     */
    public void setReviewedArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed reviewed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed)get_store().find_element_user(REVIEWED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reviewed);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reviewed" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed insertNewReviewed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed)get_store().insert_element_user(REVIEWED$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reviewed" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed addNewReviewed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewed)get_store().add_element_user(REVIEWED$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "reviewed" element
     */
    public void removeReviewed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVIEWED$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}
