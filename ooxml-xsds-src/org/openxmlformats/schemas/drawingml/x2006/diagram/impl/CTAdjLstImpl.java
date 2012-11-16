/*
 * XML Type:  CT_AdjLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_AdjLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTAdjLstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst
{
    
    public CTAdjLstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADJ$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "adj");
    
    
    /**
     * Gets a List of "adj" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj> getAdjList()
    {
        final class AdjList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj get(int i)
                { return CTAdjLstImpl.this.getAdjArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj old = CTAdjLstImpl.this.getAdjArray(i);
                CTAdjLstImpl.this.setAdjArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj o)
                { CTAdjLstImpl.this.insertNewAdj(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj old = CTAdjLstImpl.this.getAdjArray(i);
                CTAdjLstImpl.this.removeAdj(i);
                return old;
            }
            
            public int size()
                { return CTAdjLstImpl.this.sizeOfAdjArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AdjList();
        }
    }
    
    /**
     * Gets array of all "adj" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[] getAdjArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADJ$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "adj" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj getAdjArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj)get_store().find_element_user(ADJ$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "adj" element
     */
    public int sizeOfAdjArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADJ$0);
        }
    }
    
    /**
     * Sets array of all "adj" element
     */
    public void setAdjArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj[] adjArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(adjArray, ADJ$0);
        }
    }
    
    /**
     * Sets ith "adj" element
     */
    public void setAdjArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj adj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj)get_store().find_element_user(ADJ$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(adj);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adj" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj insertNewAdj(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj)get_store().insert_element_user(ADJ$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adj" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj addNewAdj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdj)get_store().add_element_user(ADJ$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "adj" element
     */
    public void removeAdj(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADJ$0, i);
        }
    }
}
