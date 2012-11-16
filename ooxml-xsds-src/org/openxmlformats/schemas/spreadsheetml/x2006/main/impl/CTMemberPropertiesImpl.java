/*
 * XML Type:  CT_MemberProperties
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MemberProperties(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMemberPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties
{
    
    public CTMemberPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mp");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "mp" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty> getMpList()
    {
        final class MpList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty get(int i)
                { return CTMemberPropertiesImpl.this.getMpArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty old = CTMemberPropertiesImpl.this.getMpArray(i);
                CTMemberPropertiesImpl.this.setMpArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty o)
                { CTMemberPropertiesImpl.this.insertNewMp(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty old = CTMemberPropertiesImpl.this.getMpArray(i);
                CTMemberPropertiesImpl.this.removeMp(i);
                return old;
            }
            
            public int size()
                { return CTMemberPropertiesImpl.this.sizeOfMpArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MpList();
        }
    }
    
    /**
     * Gets array of all "mp" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[] getMpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty getMpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().find_element_user(MP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mp" element
     */
    public int sizeOfMpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MP$0);
        }
    }
    
    /**
     * Sets array of all "mp" element
     */
    public void setMpArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty[] mpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mpArray, MP$0);
        }
    }
    
    /**
     * Sets ith "mp" element
     */
    public void setMpArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty mp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().find_element_user(MP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty insertNewMp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().insert_element_user(MP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mp" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty addNewMp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperty)get_store().add_element_user(MP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mp" element
     */
    public void removeMp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MP$0, i);
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
