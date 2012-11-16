/*
 * XML Type:  CT_FutureMetadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FutureMetadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFutureMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata
{
    
    public CTFutureMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bk");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "bk" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock> getBkList()
    {
        final class BkList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock get(int i)
                { return CTFutureMetadataImpl.this.getBkArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock old = CTFutureMetadataImpl.this.getBkArray(i);
                CTFutureMetadataImpl.this.setBkArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock o)
                { CTFutureMetadataImpl.this.insertNewBk(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock old = CTFutureMetadataImpl.this.getBkArray(i);
                CTFutureMetadataImpl.this.removeBk(i);
                return old;
            }
            
            public int size()
                { return CTFutureMetadataImpl.this.sizeOfBkArray(); }
            
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[] getBkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BK$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock getBkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock)get_store().find_element_user(BK$0, i);
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
    public void setBkArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock[] bkArray)
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
    public void setBkArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock bk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock)get_store().find_element_user(BK$0, i);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock insertNewBk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock)get_store().insert_element_user(BK$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bk" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock addNewBk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadataBlock)get_store().add_element_user(BK$0);
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
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$6);
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
            return get_store().find_attribute_user(COUNT$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$6);
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
            get_store().remove_attribute(COUNT$6);
        }
    }
}
