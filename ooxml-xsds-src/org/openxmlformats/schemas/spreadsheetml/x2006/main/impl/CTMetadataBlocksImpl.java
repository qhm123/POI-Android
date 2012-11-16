/*
 * XML Type:  CT_MetadataBlocks
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MetadataBlocks(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataBlocksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks
{
    
    public CTMetadataBlocksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bk");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "bk" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock> getBkList()
    {
        final class BkList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock get(int i)
                { return CTMetadataBlocksImpl.this.getBkArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock old = CTMetadataBlocksImpl.this.getBkArray(i);
                CTMetadataBlocksImpl.this.setBkArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock o)
                { CTMetadataBlocksImpl.this.insertNewBk(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock old = CTMetadataBlocksImpl.this.getBkArray(i);
                CTMetadataBlocksImpl.this.removeBk(i);
                return old;
            }
            
            public int size()
                { return CTMetadataBlocksImpl.this.sizeOfBkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BkList();
        }
    }
    
    /**
     * Gets array of all "bk" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock[] getBkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BK$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock getBkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock)get_store().find_element_user(BK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bk" element
     */
    public int sizeOfBkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BK$0);
        }
    }
    
    /**
     * Sets array of all "bk" element
     */
    public void setBkArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock[] bkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bkArray, BK$0);
        }
    }
    
    /**
     * Sets ith "bk" element
     */
    public void setBkArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock bk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock)get_store().find_element_user(BK$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bk);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock insertNewBk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock)get_store().insert_element_user(BK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock addNewBk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock)get_store().add_element_user(BK$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "bk" element
     */
    public void removeBk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BK$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$2);
            }
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
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$2);
            }
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
