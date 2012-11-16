/*
 * XML Type:  CT_DiscretePr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DiscretePr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDiscretePrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDiscretePr
{
    
    public CTDiscretePrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex get(int i)
                { return CTDiscretePrImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTDiscretePrImpl.this.getXArray(i);
                CTDiscretePrImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
                { CTDiscretePrImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTDiscretePrImpl.this.getXArray(i);
                CTDiscretePrImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTDiscretePrImpl.this.sizeOfXArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XList();
        }
    }
    
    /**
     * Gets array of all "x" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] getXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex getXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "x" element
     */
    public int sizeOfXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X$0);
        }
    }
    
    /**
     * Sets array of all "x" element
     */
    public void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] xArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xArray, X$0);
        }
    }
    
    /**
     * Sets ith "x" element
     */
    public void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(x);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex insertNewX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().insert_element_user(X$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex addNewX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().add_element_user(X$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "x" element
     */
    public void removeX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X$0, i);
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
