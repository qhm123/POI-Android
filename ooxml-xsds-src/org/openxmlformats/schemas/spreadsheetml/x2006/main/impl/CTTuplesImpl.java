/*
 * XML Type:  CT_Tuples
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Tuples(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTuplesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples
{
    
    public CTTuplesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TPL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tpl");
    private static final javax.xml.namespace.QName C$2 = 
        new javax.xml.namespace.QName("", "c");
    
    
    /**
     * Gets a List of "tpl" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple> getTplList()
    {
        final class TplList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple get(int i)
                { return CTTuplesImpl.this.getTplArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple old = CTTuplesImpl.this.getTplArray(i);
                CTTuplesImpl.this.setTplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple o)
                { CTTuplesImpl.this.insertNewTpl(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple old = CTTuplesImpl.this.getTplArray(i);
                CTTuplesImpl.this.removeTpl(i);
                return old;
            }
            
            public int size()
                { return CTTuplesImpl.this.sizeOfTplArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TplList();
        }
    }
    
    /**
     * Gets array of all "tpl" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[] getTplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TPL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tpl" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple getTplArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple)get_store().find_element_user(TPL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tpl" element
     */
    public int sizeOfTplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TPL$0);
        }
    }
    
    /**
     * Sets array of all "tpl" element
     */
    public void setTplArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple[] tplArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tplArray, TPL$0);
        }
    }
    
    /**
     * Sets ith "tpl" element
     */
    public void setTplArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple tpl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple)get_store().find_element_user(TPL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tpl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tpl" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple insertNewTpl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple)get_store().insert_element_user(TPL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tpl" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple addNewTpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuple)get_store().add_element_user(TPL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tpl" element
     */
    public void removeTpl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TPL$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$2);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$2);
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
            return get_store().find_attribute_user(C$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(C$2);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(C$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(C$2);
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
            get_store().remove_attribute(C$2);
        }
    }
}
