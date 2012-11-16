/*
 * XML Type:  CT_MdxSet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MdxSet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMdxSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet
{
    
    public CTMdxSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName N$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "n");
    private static final javax.xml.namespace.QName NS$2 = 
        new javax.xml.namespace.QName("", "ns");
    private static final javax.xml.namespace.QName C$4 = 
        new javax.xml.namespace.QName("", "c");
    private static final javax.xml.namespace.QName O$6 = 
        new javax.xml.namespace.QName("", "o");
    
    
    /**
     * Gets a List of "n" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex> getNList()
    {
        final class NList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex get(int i)
                { return CTMdxSetImpl.this.getNArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex old = CTMdxSetImpl.this.getNArray(i);
                CTMdxSetImpl.this.setNArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex o)
                { CTMdxSetImpl.this.insertNewN(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex old = CTMdxSetImpl.this.getNArray(i);
                CTMdxSetImpl.this.removeN(i);
                return old;
            }
            
            public int size()
                { return CTMdxSetImpl.this.sizeOfNArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NList();
        }
    }
    
    /**
     * Gets array of all "n" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] getNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(N$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex getNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().find_element_user(N$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "n" element
     */
    public int sizeOfNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(N$0);
        }
    }
    
    /**
     * Sets array of all "n" element
     */
    public void setNArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex[] nArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nArray, N$0);
        }
    }
    
    /**
     * Sets ith "n" element
     */
    public void setNArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().find_element_user(N$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(n);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex insertNewN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().insert_element_user(N$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "n" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex addNewN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStringIndex)get_store().add_element_user(N$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "n" element
     */
    public void removeN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(N$0, i);
        }
    }
    
    /**
     * Gets the "ns" attribute
     */
    public long getNs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NS$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ns" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NS$2);
            return target;
        }
    }
    
    /**
     * Sets the "ns" attribute
     */
    public void setNs(long ns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NS$2);
            }
            target.setLongValue(ns);
        }
    }
    
    /**
     * Sets (as xml) the "ns" attribute
     */
    public void xsetNs(org.apache.xmlbeans.XmlUnsignedInt ns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NS$2);
            }
            target.set(ns);
        }
    }
    
    /**
     * Gets the "c" attribute
     */
    public long getC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(C$4);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "c" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(C$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "c" attribute
     */
    public boolean isSetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(C$4) != null;
        }
    }
    
    /**
     * Sets the "c" attribute
     */
    public void setC(long c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(C$4);
            }
            target.setLongValue(c);
        }
    }
    
    /**
     * Sets (as xml) the "c" attribute
     */
    public void xsetC(org.apache.xmlbeans.XmlUnsignedInt c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(C$4);
            }
            target.set(c);
        }
    }
    
    /**
     * Unsets the "c" attribute
     */
    public void unsetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(C$4);
        }
    }
    
    /**
     * Gets the "o" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder.Enum getO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(O$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(O$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "o" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder xgetO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder)get_store().find_attribute_user(O$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder)get_default_attribute_value(O$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "o" attribute
     */
    public boolean isSetO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(O$6) != null;
        }
    }
    
    /**
     * Sets the "o" attribute
     */
    public void setO(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder.Enum o)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(O$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(O$6);
            }
            target.setEnumValue(o);
        }
    }
    
    /**
     * Sets (as xml) the "o" attribute
     */
    public void xsetO(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder o)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder)get_store().find_attribute_user(O$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxSetOrder)get_store().add_attribute_user(O$6);
            }
            target.set(o);
        }
    }
    
    /**
     * Unsets the "o" attribute
     */
    public void unsetO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(O$6);
        }
    }
}
