/*
 * XML Type:  CT_ProtectedRanges
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ProtectedRanges(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTProtectedRangesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges
{
    
    public CTProtectedRangesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTECTEDRANGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protectedRange");
    
    
    /**
     * Gets a List of "protectedRange" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange> getProtectedRangeList()
    {
        final class ProtectedRangeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange get(int i)
                { return CTProtectedRangesImpl.this.getProtectedRangeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange old = CTProtectedRangesImpl.this.getProtectedRangeArray(i);
                CTProtectedRangesImpl.this.setProtectedRangeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange o)
                { CTProtectedRangesImpl.this.insertNewProtectedRange(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange old = CTProtectedRangesImpl.this.getProtectedRangeArray(i);
                CTProtectedRangesImpl.this.removeProtectedRange(i);
                return old;
            }
            
            public int size()
                { return CTProtectedRangesImpl.this.sizeOfProtectedRangeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProtectedRangeList();
        }
    }
    
    /**
     * Gets array of all "protectedRange" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange[] getProtectedRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROTECTEDRANGE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "protectedRange" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange getProtectedRangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange)get_store().find_element_user(PROTECTEDRANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "protectedRange" element
     */
    public int sizeOfProtectedRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTECTEDRANGE$0);
        }
    }
    
    /**
     * Sets array of all "protectedRange" element
     */
    public void setProtectedRangeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange[] protectedRangeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(protectedRangeArray, PROTECTEDRANGE$0);
        }
    }
    
    /**
     * Sets ith "protectedRange" element
     */
    public void setProtectedRangeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange protectedRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange)get_store().find_element_user(PROTECTEDRANGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(protectedRange);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "protectedRange" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange insertNewProtectedRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange)get_store().insert_element_user(PROTECTEDRANGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "protectedRange" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange addNewProtectedRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange)get_store().add_element_user(PROTECTEDRANGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "protectedRange" element
     */
    public void removeProtectedRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTECTEDRANGE$0, i);
        }
    }
}
