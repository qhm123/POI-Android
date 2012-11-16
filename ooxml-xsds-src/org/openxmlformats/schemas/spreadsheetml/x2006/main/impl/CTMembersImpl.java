/*
 * XML Type:  CT_Members
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Members(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMembersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers
{
    
    public CTMembersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "member");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName LEVEL$4 = 
        new javax.xml.namespace.QName("", "level");
    
    
    /**
     * Gets a List of "member" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember> getMemberList()
    {
        final class MemberList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember get(int i)
                { return CTMembersImpl.this.getMemberArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember old = CTMembersImpl.this.getMemberArray(i);
                CTMembersImpl.this.setMemberArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember o)
                { CTMembersImpl.this.insertNewMember(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember old = CTMembersImpl.this.getMemberArray(i);
                CTMembersImpl.this.removeMember(i);
                return old;
            }
            
            public int size()
                { return CTMembersImpl.this.sizeOfMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MemberList();
        }
    }
    
    /**
     * Gets array of all "member" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "member" element
     */
    public void setMemberArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember[] memberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(memberArray, MEMBER$0);
        }
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMember)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
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
    
    /**
     * Gets the "level" attribute
     */
    public long getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$4);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$4) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(long level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$4);
            }
            target.setLongValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlUnsignedInt level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LEVEL$4);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$4);
        }
    }
}
