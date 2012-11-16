/*
 * XML Type:  CT_Tables
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Tables(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTablesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTables
{
    
    public CTTablesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName M$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "m");
    private static final javax.xml.namespace.QName S$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "s");
    private static final javax.xml.namespace.QName X$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "m" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing> getMList()
    {
        final class MList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing get(int i)
                { return CTTablesImpl.this.getMArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing old = CTTablesImpl.this.getMArray(i);
                CTTablesImpl.this.setMArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing o)
                { CTTablesImpl.this.insertNewM(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing old = CTTablesImpl.this.getMArray(i);
                CTTablesImpl.this.removeM(i);
                return old;
            }
            
            public int size()
                { return CTTablesImpl.this.sizeOfMArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MList();
        }
    }
    
    /**
     * Gets array of all "m" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[] getMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(M$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing getMArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing)get_store().find_element_user(M$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "m" element
     */
    public int sizeOfMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(M$0);
        }
    }
    
    /**
     * Sets array of all "m" element
     */
    public void setMArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing[] mArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mArray, M$0);
        }
    }
    
    /**
     * Sets ith "m" element
     */
    public void setMArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing m)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing)get_store().find_element_user(M$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(m);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing insertNewM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing)get_store().insert_element_user(M$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "m" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing addNewM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableMissing)get_store().add_element_user(M$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "m" element
     */
    public void removeM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(M$0, i);
        }
    }
    
    /**
     * Gets a List of "s" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement> getSList()
    {
        final class SList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement get(int i)
                { return CTTablesImpl.this.getSArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement old = CTTablesImpl.this.getSArray(i);
                CTTablesImpl.this.setSArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement o)
                { CTTablesImpl.this.insertNewS(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement old = CTTablesImpl.this.getSArray(i);
                CTTablesImpl.this.removeS(i);
                return old;
            }
            
            public int size()
                { return CTTablesImpl.this.sizeOfSArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SList();
        }
    }
    
    /**
     * Gets array of all "s" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] getSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(S$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement getSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().find_element_user(S$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "s" element
     */
    public int sizeOfSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(S$2);
        }
    }
    
    /**
     * Sets array of all "s" element
     */
    public void setSArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] sArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sArray, S$2);
        }
    }
    
    /**
     * Sets ith "s" element
     */
    public void setSArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().find_element_user(S$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(s);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement insertNewS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().insert_element_user(S$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement addNewS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().add_element_user(S$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "s" element
     */
    public void removeS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(S$2, i);
        }
    }
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex get(int i)
                { return CTTablesImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTTablesImpl.this.getXArray(i);
                CTTablesImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
                { CTTablesImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTTablesImpl.this.getXArray(i);
                CTTablesImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTTablesImpl.this.sizeOfXArray(); }
            
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
            get_store().find_all_element_users(X$4, targetList);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$4, i);
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
            return get_store().count_elements(X$4);
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
            arraySetterHelper(xArray, X$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$4, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().insert_element_user(X$4, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().add_element_user(X$4);
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
            get_store().remove_element(X$4, i);
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
