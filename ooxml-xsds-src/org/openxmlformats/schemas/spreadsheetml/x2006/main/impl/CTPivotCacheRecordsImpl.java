/*
 * XML Type:  CT_PivotCacheRecords
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotCacheRecords(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotCacheRecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords
{
    
    public CTPivotCacheRecordsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName R$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "r");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName COUNT$4 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord> getRList()
    {
        final class RList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord get(int i)
                { return CTPivotCacheRecordsImpl.this.getRArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord old = CTPivotCacheRecordsImpl.this.getRArray(i);
                CTPivotCacheRecordsImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord o)
                { CTPivotCacheRecordsImpl.this.insertNewR(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord old = CTPivotCacheRecordsImpl.this.getRArray(i);
                CTPivotCacheRecordsImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTPivotCacheRecordsImpl.this.sizeOfRArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RList();
        }
    }
    
    /**
     * Gets array of all "r" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "r" element
     */
    public int sizeOfRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R$0);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$0);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord)get_store().insert_element_user(R$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord)get_store().add_element_user(R$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "r" element
     */
    public void removeR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
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
            return get_store().find_attribute_user(COUNT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$4);
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
            get_store().remove_attribute(COUNT$4);
        }
    }
}
