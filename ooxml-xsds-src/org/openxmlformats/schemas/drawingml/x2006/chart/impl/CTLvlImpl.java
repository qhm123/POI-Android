/*
 * XML Type:  CT_Lvl
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Lvl(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTLvlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTLvl
{
    
    public CTLvlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pt");
    
    
    /**
     * Gets a List of "pt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal> getPtList()
    {
        final class PtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal get(int i)
                { return CTLvlImpl.this.getPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal old = CTLvlImpl.this.getPtArray(i);
                CTLvlImpl.this.setPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal o)
                { CTLvlImpl.this.insertNewPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal old = CTLvlImpl.this.getPtArray(i);
                CTLvlImpl.this.removePt(i);
                return old;
            }
            
            public int size()
                { return CTLvlImpl.this.sizeOfPtArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] getPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal getPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().find_element_user(PT$0, i);
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
    public void setPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal[] ptArray)
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
    public void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().find_element_user(PT$0, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal insertNewPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().insert_element_user(PT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal addNewPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal)get_store().add_element_user(PT$0);
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
