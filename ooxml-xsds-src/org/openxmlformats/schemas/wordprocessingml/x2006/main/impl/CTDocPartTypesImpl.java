/*
 * XML Type:  CT_DocPartTypes
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartTypes(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes
{
    
    public CTDocPartTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName ALL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "all");
    
    
    /**
     * Gets a List of "type" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType> getTypeList()
    {
        final class TypeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType get(int i)
                { return CTDocPartTypesImpl.this.getTypeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType old = CTDocPartTypesImpl.this.getTypeArray(i);
                CTDocPartTypesImpl.this.setTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType o)
                { CTDocPartTypesImpl.this.insertNewType(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType old = CTDocPartTypesImpl.this.getTypeArray(i);
                CTDocPartTypesImpl.this.removeType(i);
                return old;
            }
            
            public int size()
                { return CTDocPartTypesImpl.this.sizeOfTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypeList();
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType)get_store().find_element_user(TYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0);
        }
    }
    
    /**
     * Sets array of all "type" element
     */
    public void setTypeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType[] typeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typeArray, TYPE$0);
        }
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType)get_store().find_element_user(TYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType)get_store().insert_element_user(TYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, i);
        }
    }
    
    /**
     * Gets the "all" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALL$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "all" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ALL$2);
            return target;
        }
    }
    
    /**
     * True if has "all" attribute
     */
    public boolean isSetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALL$2) != null;
        }
    }
    
    /**
     * Sets the "all" attribute
     */
    public void setAll(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALL$2);
            }
            target.setEnumValue(all);
        }
    }
    
    /**
     * Sets (as xml) the "all" attribute
     */
    public void xsetAll(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ALL$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(ALL$2);
            }
            target.set(all);
        }
    }
    
    /**
     * Unsets the "all" attribute
     */
    public void unsetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALL$2);
        }
    }
}
