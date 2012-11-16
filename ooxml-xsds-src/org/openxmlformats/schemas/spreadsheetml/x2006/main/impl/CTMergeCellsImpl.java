/*
 * XML Type:  CT_MergeCells
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MergeCells(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMergeCellsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells
{
    
    public CTMergeCellsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MERGECELL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mergeCell");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "mergeCell" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell> getMergeCellList()
    {
        final class MergeCellList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell get(int i)
                { return CTMergeCellsImpl.this.getMergeCellArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell old = CTMergeCellsImpl.this.getMergeCellArray(i);
                CTMergeCellsImpl.this.setMergeCellArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell o)
                { CTMergeCellsImpl.this.insertNewMergeCell(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell old = CTMergeCellsImpl.this.getMergeCellArray(i);
                CTMergeCellsImpl.this.removeMergeCell(i);
                return old;
            }
            
            public int size()
                { return CTMergeCellsImpl.this.sizeOfMergeCellArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MergeCellList();
        }
    }
    
    /**
     * Gets array of all "mergeCell" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] getMergeCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MERGECELL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mergeCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell getMergeCellArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell)get_store().find_element_user(MERGECELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mergeCell" element
     */
    public int sizeOfMergeCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERGECELL$0);
        }
    }
    
    /**
     * Sets array of all "mergeCell" element
     */
    public void setMergeCellArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell[] mergeCellArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mergeCellArray, MERGECELL$0);
        }
    }
    
    /**
     * Sets ith "mergeCell" element
     */
    public void setMergeCellArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell mergeCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell)get_store().find_element_user(MERGECELL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mergeCell);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mergeCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell insertNewMergeCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell)get_store().insert_element_user(MERGECELL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mergeCell" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell addNewMergeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCell)get_store().add_element_user(MERGECELL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mergeCell" element
     */
    public void removeMergeCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERGECELL$0, i);
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
