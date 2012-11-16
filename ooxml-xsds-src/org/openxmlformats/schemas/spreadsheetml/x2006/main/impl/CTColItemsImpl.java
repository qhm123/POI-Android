/*
 * XML Type:  CT_colItems
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_colItems(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems
{
    
    public CTColItemsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName I$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "i");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "i" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI> getIList()
    {
        final class IList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI get(int i)
                { return CTColItemsImpl.this.getIArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI old = CTColItemsImpl.this.getIArray(i);
                CTColItemsImpl.this.setIArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI o)
                { CTColItemsImpl.this.insertNewI(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI old = CTColItemsImpl.this.getIArray(i);
                CTColItemsImpl.this.removeI(i);
                return old;
            }
            
            public int size()
                { return CTColItemsImpl.this.sizeOfIArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IList();
        }
    }
    
    /**
     * Gets array of all "i" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI[] getIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI getIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI)get_store().find_element_user(I$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "i" element
     */
    public int sizeOfIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I$0);
        }
    }
    
    /**
     * Sets array of all "i" element
     */
    public void setIArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI[] iValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iValueArray, I$0);
        }
    }
    
    /**
     * Sets ith "i" element
     */
    public void setIArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI)get_store().find_element_user(I$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI insertNewI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI)get_store().insert_element_user(I$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI addNewI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTI)get_store().add_element_user(I$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "i" element
     */
    public void removeI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I$0, i);
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
