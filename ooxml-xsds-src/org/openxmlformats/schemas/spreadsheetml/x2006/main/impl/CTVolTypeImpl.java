/*
 * XML Type:  CT_VolType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_VolType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTVolTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolType
{
    
    public CTVolTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAIN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "main");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets a List of "main" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain> getMainList()
    {
        final class MainList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain get(int i)
                { return CTVolTypeImpl.this.getMainArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain old = CTVolTypeImpl.this.getMainArray(i);
                CTVolTypeImpl.this.setMainArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain o)
                { CTVolTypeImpl.this.insertNewMain(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain old = CTVolTypeImpl.this.getMainArray(i);
                CTVolTypeImpl.this.removeMain(i);
                return old;
            }
            
            public int size()
                { return CTVolTypeImpl.this.sizeOfMainArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MainList();
        }
    }
    
    /**
     * Gets array of all "main" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[] getMainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAIN$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "main" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain getMainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain)get_store().find_element_user(MAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "main" element
     */
    public int sizeOfMainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAIN$0);
        }
    }
    
    /**
     * Sets array of all "main" element
     */
    public void setMainArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain[] mainArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mainArray, MAIN$0);
        }
    }
    
    /**
     * Sets ith "main" element
     */
    public void setMainArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain main)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain)get_store().find_element_user(MAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(main);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "main" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain insertNewMain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain)get_store().insert_element_user(MAIN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "main" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain addNewMain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVolMain)get_store().add_element_user(MAIN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "main" element
     */
    public void removeMain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAIN$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STVolDepType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
}
