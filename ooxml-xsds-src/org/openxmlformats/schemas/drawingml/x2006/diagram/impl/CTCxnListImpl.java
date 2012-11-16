/*
 * XML Type:  CT_CxnList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_CxnList(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTCxnListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList
{
    
    public CTCxnListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CXN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "cxn");
    
    
    /**
     * Gets a List of "cxn" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn> getCxnList()
    {
        final class CxnList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn get(int i)
                { return CTCxnListImpl.this.getCxnArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn old = CTCxnListImpl.this.getCxnArray(i);
                CTCxnListImpl.this.setCxnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn o)
                { CTCxnListImpl.this.insertNewCxn(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn old = CTCxnListImpl.this.getCxnArray(i);
                CTCxnListImpl.this.removeCxn(i);
                return old;
            }
            
            public int size()
                { return CTCxnListImpl.this.sizeOfCxnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CxnList();
        }
    }
    
    /**
     * Gets array of all "cxn" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[] getCxnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CXN$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn getCxnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn)get_store().find_element_user(CXN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cxn" element
     */
    public int sizeOfCxnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXN$0);
        }
    }
    
    /**
     * Sets array of all "cxn" element
     */
    public void setCxnArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn[] cxnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cxnArray, CXN$0);
        }
    }
    
    /**
     * Sets ith "cxn" element
     */
    public void setCxnArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn cxn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn)get_store().find_element_user(CXN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cxn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn insertNewCxn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn)get_store().insert_element_user(CXN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn addNewCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn)get_store().add_element_user(CXN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cxn" element
     */
    public void removeCxn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXN$0, i);
        }
    }
}
