/*
 * XML Type:  CT_DefinedNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DefinedNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDefinedNamesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames
{
    
    public CTDefinedNamesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINEDNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedName");
    
    
    /**
     * Gets a List of "definedName" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName> getDefinedNameList()
    {
        final class DefinedNameList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName get(int i)
                { return CTDefinedNamesImpl.this.getDefinedNameArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName old = CTDefinedNamesImpl.this.getDefinedNameArray(i);
                CTDefinedNamesImpl.this.setDefinedNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName o)
                { CTDefinedNamesImpl.this.insertNewDefinedName(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName old = CTDefinedNamesImpl.this.getDefinedNameArray(i);
                CTDefinedNamesImpl.this.removeDefinedName(i);
                return old;
            }
            
            public int size()
                { return CTDefinedNamesImpl.this.sizeOfDefinedNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DefinedNameList();
        }
    }
    
    /**
     * Gets array of all "definedName" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[] getDefinedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEFINEDNAME$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "definedName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName getDefinedNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().find_element_user(DEFINEDNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "definedName" element
     */
    public int sizeOfDefinedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINEDNAME$0);
        }
    }
    
    /**
     * Sets array of all "definedName" element
     */
    public void setDefinedNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName[] definedNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(definedNameArray, DEFINEDNAME$0);
        }
    }
    
    /**
     * Sets ith "definedName" element
     */
    public void setDefinedNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName definedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().find_element_user(DEFINEDNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(definedName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "definedName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName insertNewDefinedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().insert_element_user(DEFINEDNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "definedName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName addNewDefinedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName)get_store().add_element_user(DEFINEDNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "definedName" element
     */
    public void removeDefinedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINEDNAME$0, i);
        }
    }
}
