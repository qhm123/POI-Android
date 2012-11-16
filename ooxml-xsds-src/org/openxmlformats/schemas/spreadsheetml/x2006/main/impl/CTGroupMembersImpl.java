/*
 * XML Type:  CT_GroupMembers
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_GroupMembers(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupMembersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers
{
    
    public CTGroupMembersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPMEMBER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "groupMember");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "groupMember" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember> getGroupMemberList()
    {
        final class GroupMemberList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember get(int i)
                { return CTGroupMembersImpl.this.getGroupMemberArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember old = CTGroupMembersImpl.this.getGroupMemberArray(i);
                CTGroupMembersImpl.this.setGroupMemberArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember o)
                { CTGroupMembersImpl.this.insertNewGroupMember(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember old = CTGroupMembersImpl.this.getGroupMemberArray(i);
                CTGroupMembersImpl.this.removeGroupMember(i);
                return old;
            }
            
            public int size()
                { return CTGroupMembersImpl.this.sizeOfGroupMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupMemberList();
        }
    }
    
    /**
     * Gets array of all "groupMember" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[] getGroupMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUPMEMBER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "groupMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember getGroupMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember)get_store().find_element_user(GROUPMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "groupMember" element
     */
    public int sizeOfGroupMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "groupMember" element
     */
    public void setGroupMemberArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[] groupMemberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupMemberArray, GROUPMEMBER$0);
        }
    }
    
    /**
     * Sets ith "groupMember" element
     */
    public void setGroupMemberArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember groupMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember)get_store().find_element_user(GROUPMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groupMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember insertNewGroupMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember)get_store().insert_element_user(GROUPMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupMember" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember addNewGroupMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember)get_store().add_element_user(GROUPMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "groupMember" element
     */
    public void removeGroupMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPMEMBER$0, i);
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
