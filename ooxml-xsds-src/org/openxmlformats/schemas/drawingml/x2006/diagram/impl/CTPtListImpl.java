/*
 * XML Type:  CT_PtList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_PtList(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTPtListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList
{
    
    public CTPtListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "pt");
    
    
    /**
     * Gets a List of "pt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt> getPtList()
    {
        final class PtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt get(int i)
                { return CTPtListImpl.this.getPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt old = CTPtListImpl.this.getPtArray(i);
                CTPtListImpl.this.setPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt o)
                { CTPtListImpl.this.insertNewPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt old = CTPtListImpl.this.getPtArray(i);
                CTPtListImpl.this.removePt(i);
                return old;
            }
            
            public int size()
                { return CTPtListImpl.this.sizeOfPtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PtList();
        }
    }
    
    /**
     * Gets array of all "pt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[] getPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt getPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt)get_store().find_element_user(PT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pt" element
     */
    public int sizeOfPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PT$0);
        }
    }
    
    /**
     * Sets array of all "pt" element
     */
    public void setPtArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt[] ptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ptArray, PT$0);
        }
    }
    
    /**
     * Sets ith "pt" element
     */
    public void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt)get_store().find_element_user(PT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt insertNewPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt)get_store().insert_element_user(PT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt addNewPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt)get_store().add_element_user(PT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pt" element
     */
    public void removePt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PT$0, i);
        }
    }
}
