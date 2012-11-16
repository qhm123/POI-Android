/*
 * XML Type:  CT_Users
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Users(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTUsersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers
{
    
    public CTUsersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "userInfo");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "userInfo" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser> getUserInfoList()
    {
        final class UserInfoList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser get(int i)
                { return CTUsersImpl.this.getUserInfoArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser old = CTUsersImpl.this.getUserInfoArray(i);
                CTUsersImpl.this.setUserInfoArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser o)
                { CTUsersImpl.this.insertNewUserInfo(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser old = CTUsersImpl.this.getUserInfoArray(i);
                CTUsersImpl.this.removeUserInfo(i);
                return old;
            }
            
            public int size()
                { return CTUsersImpl.this.sizeOfUserInfoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UserInfoList();
        }
    }
    
    /**
     * Gets array of all "userInfo" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[] getUserInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USERINFO$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "userInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser getUserInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser)get_store().find_element_user(USERINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "userInfo" element
     */
    public int sizeOfUserInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERINFO$0);
        }
    }
    
    /**
     * Sets array of all "userInfo" element
     */
    public void setUserInfoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[] userInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userInfoArray, USERINFO$0);
        }
    }
    
    /**
     * Sets ith "userInfo" element
     */
    public void setUserInfoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser userInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser)get_store().find_element_user(USERINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(userInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "userInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser insertNewUserInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser)get_store().insert_element_user(USERINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "userInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser addNewUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser)get_store().add_element_user(USERINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "userInfo" element
     */
    public void removeUserInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERINFO$0, i);
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
