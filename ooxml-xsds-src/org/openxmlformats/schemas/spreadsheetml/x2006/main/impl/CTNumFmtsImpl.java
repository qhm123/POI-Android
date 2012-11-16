/*
 * XML Type:  CT_NumFmts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_NumFmts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumFmtsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts
{
    
    public CTNumFmtsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMFMT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmt");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "numFmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt> getNumFmtList()
    {
        final class NumFmtList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt get(int i)
                { return CTNumFmtsImpl.this.getNumFmtArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt old = CTNumFmtsImpl.this.getNumFmtArray(i);
                CTNumFmtsImpl.this.setNumFmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt o)
                { CTNumFmtsImpl.this.insertNewNumFmt(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt old = CTNumFmtsImpl.this.getNumFmtArray(i);
                CTNumFmtsImpl.this.removeNumFmt(i);
                return old;
            }
            
            public int size()
                { return CTNumFmtsImpl.this.sizeOfNumFmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NumFmtList();
        }
    }
    
    /**
     * Gets array of all "numFmt" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] getNumFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NUMFMT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "numFmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt getNumFmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "numFmt" element
     */
    public int sizeOfNumFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMFMT$0);
        }
    }
    
    /**
     * Sets array of all "numFmt" element
     */
    public void setNumFmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt[] numFmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(numFmtArray, NUMFMT$0);
        }
    }
    
    /**
     * Sets ith "numFmt" element
     */
    public void setNumFmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "numFmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt insertNewNumFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().insert_element_user(NUMFMT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "numFmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt addNewNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "numFmt" element
     */
    public void removeNumFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMFMT$0, i);
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
