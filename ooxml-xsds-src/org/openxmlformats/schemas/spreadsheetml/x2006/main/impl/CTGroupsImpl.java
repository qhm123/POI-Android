/*
 * XML Type:  CT_Groups
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Groups(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups
{
    
    public CTGroupsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "group");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "group" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup> getGroupList()
    {
        final class GroupList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup get(int i)
                { return CTGroupsImpl.this.getGroupArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup old = CTGroupsImpl.this.getGroupArray(i);
                CTGroupsImpl.this.setGroupArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup o)
                { CTGroupsImpl.this.insertNewGroup(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup old = CTGroupsImpl.this.getGroupArray(i);
                CTGroupsImpl.this.removeGroup(i);
                return old;
            }
            
            public int size()
                { return CTGroupsImpl.this.sizeOfGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupList();
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup)get_store().find_element_user(GROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$0);
        }
    }
    
    /**
     * Sets array of all "group" element
     */
    public void setGroupArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$0);
        }
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup)get_store().find_element_user(GROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup)get_store().insert_element_user(GROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$0, i);
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
