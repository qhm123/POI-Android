/*
 * XML Type:  CT_SmartTagTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SmartTagTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSmartTagTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes
{
    
    public CTSmartTagTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMARTTAGTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagType");
    
    
    /**
     * Gets a List of "smartTagType" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType> getSmartTagTypeList()
    {
        final class SmartTagTypeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType get(int i)
                { return CTSmartTagTypesImpl.this.getSmartTagTypeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType old = CTSmartTagTypesImpl.this.getSmartTagTypeArray(i);
                CTSmartTagTypesImpl.this.setSmartTagTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType o)
                { CTSmartTagTypesImpl.this.insertNewSmartTagType(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType old = CTSmartTagTypesImpl.this.getSmartTagTypeArray(i);
                CTSmartTagTypesImpl.this.removeSmartTagType(i);
                return old;
            }
            
            public int size()
                { return CTSmartTagTypesImpl.this.sizeOfSmartTagTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SmartTagTypeList();
        }
    }
    
    /**
     * Gets array of all "smartTagType" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[] getSmartTagTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SMARTTAGTYPE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "smartTagType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType getSmartTagTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType)get_store().find_element_user(SMARTTAGTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "smartTagType" element
     */
    public int sizeOfSmartTagTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGTYPE$0);
        }
    }
    
    /**
     * Sets array of all "smartTagType" element
     */
    public void setSmartTagTypeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType[] smartTagTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(smartTagTypeArray, SMARTTAGTYPE$0);
        }
    }
    
    /**
     * Sets ith "smartTagType" element
     */
    public void setSmartTagTypeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType smartTagType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType)get_store().find_element_user(SMARTTAGTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(smartTagType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "smartTagType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType insertNewSmartTagType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType)get_store().insert_element_user(SMARTTAGTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "smartTagType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType addNewSmartTagType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagType)get_store().add_element_user(SMARTTAGTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "smartTagType" element
     */
    public void removeSmartTagType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGTYPE$0, i);
        }
    }
}
