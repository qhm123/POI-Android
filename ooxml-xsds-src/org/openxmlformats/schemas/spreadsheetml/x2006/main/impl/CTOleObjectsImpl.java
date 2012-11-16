/*
 * XML Type:  CT_OleObjects
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OleObjects(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleObjectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects
{
    
    public CTOleObjectsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEOBJECT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObject");
    
    
    /**
     * Gets a List of "oleObject" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject> getOleObjectList()
    {
        final class OleObjectList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject get(int i)
                { return CTOleObjectsImpl.this.getOleObjectArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject old = CTOleObjectsImpl.this.getOleObjectArray(i);
                CTOleObjectsImpl.this.setOleObjectArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject o)
                { CTOleObjectsImpl.this.insertNewOleObject(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject old = CTOleObjectsImpl.this.getOleObjectArray(i);
                CTOleObjectsImpl.this.removeOleObject(i);
                return old;
            }
            
            public int size()
                { return CTOleObjectsImpl.this.sizeOfOleObjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OleObjectList();
        }
    }
    
    /**
     * Gets array of all "oleObject" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject[] getOleObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OLEOBJECT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oleObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject getOleObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject)get_store().find_element_user(OLEOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oleObject" element
     */
    public int sizeOfOleObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLEOBJECT$0);
        }
    }
    
    /**
     * Sets array of all "oleObject" element
     */
    public void setOleObjectArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject[] oleObjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oleObjectArray, OLEOBJECT$0);
        }
    }
    
    /**
     * Sets ith "oleObject" element
     */
    public void setOleObjectArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject oleObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject)get_store().find_element_user(OLEOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oleObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oleObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject insertNewOleObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject)get_store().insert_element_user(OLEOBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oleObject" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject addNewOleObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject)get_store().add_element_user(OLEOBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "oleObject" element
     */
    public void removeOleObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLEOBJECT$0, i);
        }
    }
}
