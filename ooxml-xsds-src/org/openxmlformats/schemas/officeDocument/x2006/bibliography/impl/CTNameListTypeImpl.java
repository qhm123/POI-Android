/*
 * XML Type:  CT_NameListType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_NameListType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTNameListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameListType
{
    
    public CTNameListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Person");
    
    
    /**
     * Gets a List of "Person" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType> getPersonList()
    {
        final class PersonList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType get(int i)
                { return CTNameListTypeImpl.this.getPersonArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType old = CTNameListTypeImpl.this.getPersonArray(i);
                CTNameListTypeImpl.this.setPersonArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType o)
                { CTNameListTypeImpl.this.insertNewPerson(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType old = CTNameListTypeImpl.this.getPersonArray(i);
                CTNameListTypeImpl.this.removePerson(i);
                return old;
            }
            
            public int size()
                { return CTNameListTypeImpl.this.sizeOfPersonArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PersonList();
        }
    }
    
    /**
     * Gets array of all "Person" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[] getPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSON$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Person" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType getPersonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Person" element
     */
    public int sizeOfPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$0);
        }
    }
    
    /**
     * Sets array of all "Person" element
     */
    public void setPersonArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType[] personArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personArray, PERSON$0);
        }
    }
    
    /**
     * Sets ith "Person" element
     */
    public void setPersonArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(person);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Person" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType insertNewPerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType)get_store().insert_element_user(PERSON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Person" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTPersonType)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Person" element
     */
    public void removePerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$0, i);
        }
    }
}
