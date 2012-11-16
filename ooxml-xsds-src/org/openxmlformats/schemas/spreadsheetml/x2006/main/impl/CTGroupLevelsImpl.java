/*
 * XML Type:  CT_GroupLevels
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_GroupLevels(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupLevelsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels
{
    
    public CTGroupLevelsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "groupLevel");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "groupLevel" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel> getGroupLevelList()
    {
        final class GroupLevelList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel get(int i)
                { return CTGroupLevelsImpl.this.getGroupLevelArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel old = CTGroupLevelsImpl.this.getGroupLevelArray(i);
                CTGroupLevelsImpl.this.setGroupLevelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel o)
                { CTGroupLevelsImpl.this.insertNewGroupLevel(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel old = CTGroupLevelsImpl.this.getGroupLevelArray(i);
                CTGroupLevelsImpl.this.removeGroupLevel(i);
                return old;
            }
            
            public int size()
                { return CTGroupLevelsImpl.this.sizeOfGroupLevelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupLevelList();
        }
    }
    
    /**
     * Gets array of all "groupLevel" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[] getGroupLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUPLEVEL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "groupLevel" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel getGroupLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel)get_store().find_element_user(GROUPLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "groupLevel" element
     */
    public int sizeOfGroupLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPLEVEL$0);
        }
    }
    
    /**
     * Sets array of all "groupLevel" element
     */
    public void setGroupLevelArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel[] groupLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupLevelArray, GROUPLEVEL$0);
        }
    }
    
    /**
     * Sets ith "groupLevel" element
     */
    public void setGroupLevelArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel groupLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel)get_store().find_element_user(GROUPLEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groupLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupLevel" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel insertNewGroupLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel)get_store().insert_element_user(GROUPLEVEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupLevel" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel addNewGroupLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel)get_store().add_element_user(GROUPLEVEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "groupLevel" element
     */
    public void removeGroupLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPLEVEL$0, i);
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
