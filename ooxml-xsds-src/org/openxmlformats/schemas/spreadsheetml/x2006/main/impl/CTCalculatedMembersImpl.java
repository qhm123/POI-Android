/*
 * XML Type:  CT_CalculatedMembers
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CalculatedMembers(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalculatedMembersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers
{
    
    public CTCalculatedMembersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATEDMEMBER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedMember");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "calculatedMember" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember> getCalculatedMemberList()
    {
        final class CalculatedMemberList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember get(int i)
                { return CTCalculatedMembersImpl.this.getCalculatedMemberArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember old = CTCalculatedMembersImpl.this.getCalculatedMemberArray(i);
                CTCalculatedMembersImpl.this.setCalculatedMemberArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember o)
                { CTCalculatedMembersImpl.this.insertNewCalculatedMember(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember old = CTCalculatedMembersImpl.this.getCalculatedMemberArray(i);
                CTCalculatedMembersImpl.this.removeCalculatedMember(i);
                return old;
            }
            
            public int size()
                { return CTCalculatedMembersImpl.this.sizeOfCalculatedMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CalculatedMemberList();
        }
    }
    
    /**
     * Gets array of all "calculatedMember" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember[] getCalculatedMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CALCULATEDMEMBER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "calculatedMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember getCalculatedMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember)get_store().find_element_user(CALCULATEDMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "calculatedMember" element
     */
    public int sizeOfCalculatedMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATEDMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "calculatedMember" element
     */
    public void setCalculatedMemberArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember[] calculatedMemberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(calculatedMemberArray, CALCULATEDMEMBER$0);
        }
    }
    
    /**
     * Sets ith "calculatedMember" element
     */
    public void setCalculatedMemberArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember calculatedMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember)get_store().find_element_user(CALCULATEDMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(calculatedMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "calculatedMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember insertNewCalculatedMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember)get_store().insert_element_user(CALCULATEDMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "calculatedMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember addNewCalculatedMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember)get_store().add_element_user(CALCULATEDMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "calculatedMember" element
     */
    public void removeCalculatedMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATEDMEMBER$0, i);
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
