/*
 * XML Type:  CT_DashStopList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_DashStopList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDashStopListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTDashStopList
{
    
    public CTDashStopListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ds");
    
    
    /**
     * Gets a List of "ds" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop> getDsList()
    {
        final class DsList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop get(int i)
                { return CTDashStopListImpl.this.getDsArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop old = CTDashStopListImpl.this.getDsArray(i);
                CTDashStopListImpl.this.setDsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop o)
                { CTDashStopListImpl.this.insertNewDs(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop old = CTDashStopListImpl.this.getDsArray(i);
                CTDashStopListImpl.this.removeDs(i);
                return old;
            }
            
            public int size()
                { return CTDashStopListImpl.this.sizeOfDsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DsList();
        }
    }
    
    /**
     * Gets array of all "ds" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[] getDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DS$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ds" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop getDsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop)get_store().find_element_user(DS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ds" element
     */
    public int sizeOfDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DS$0);
        }
    }
    
    /**
     * Sets array of all "ds" element
     */
    public void setDsArray(org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop[] dsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dsArray, DS$0);
        }
    }
    
    /**
     * Sets ith "ds" element
     */
    public void setDsArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop ds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop)get_store().find_element_user(DS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ds);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ds" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop insertNewDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop)get_store().insert_element_user(DS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ds" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop addNewDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDashStop)get_store().add_element_user(DS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ds" element
     */
    public void removeDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DS$0, i);
        }
    }
}
