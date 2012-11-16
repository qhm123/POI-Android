/*
 * XML Type:  CT_ExternalDefinedNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalDefinedNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalDefinedNamesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames
{
    
    public CTExternalDefinedNamesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINEDNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedName");
    
    
    /**
     * Gets a List of "definedName" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName> getDefinedNameList()
    {
        final class DefinedNameList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName get(int i)
                { return CTExternalDefinedNamesImpl.this.getDefinedNameArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName old = CTExternalDefinedNamesImpl.this.getDefinedNameArray(i);
                CTExternalDefinedNamesImpl.this.setDefinedNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName o)
                { CTExternalDefinedNamesImpl.this.insertNewDefinedName(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName old = CTExternalDefinedNamesImpl.this.getDefinedNameArray(i);
                CTExternalDefinedNamesImpl.this.removeDefinedName(i);
                return old;
            }
            
            public int size()
                { return CTExternalDefinedNamesImpl.this.sizeOfDefinedNameArray(); }
            
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[] getDefinedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEFINEDNAME$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "definedName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName getDefinedNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName)get_store().find_element_user(DEFINEDNAME$0, i);
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
    public void setDefinedNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName[] definedNameArray)
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
    public void setDefinedNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName definedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName)get_store().find_element_user(DEFINEDNAME$0, i);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName insertNewDefinedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName)get_store().insert_element_user(DEFINEDNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "definedName" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName addNewDefinedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName)get_store().add_element_user(DEFINEDNAME$0);
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
