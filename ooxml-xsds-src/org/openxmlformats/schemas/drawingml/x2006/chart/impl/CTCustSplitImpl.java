/*
 * XML Type:  CT_CustSplit
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTCustSplit
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_CustSplit(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTCustSplitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTCustSplit
{
    
    public CTCustSplitImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDPIEPT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "secondPiePt");
    
    
    /**
     * Gets a List of "secondPiePt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getSecondPiePtList()
    {
        final class SecondPiePtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt get(int i)
                { return CTCustSplitImpl.this.getSecondPiePtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTCustSplitImpl.this.getSecondPiePtArray(i);
                CTCustSplitImpl.this.setSecondPiePtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTCustSplitImpl.this.insertNewSecondPiePt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTCustSplitImpl.this.getSecondPiePtArray(i);
                CTCustSplitImpl.this.removeSecondPiePt(i);
                return old;
            }
            
            public int size()
                { return CTCustSplitImpl.this.sizeOfSecondPiePtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecondPiePtList();
        }
    }
    
    /**
     * Gets array of all "secondPiePt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getSecondPiePtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDPIEPT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "secondPiePt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getSecondPiePtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(SECONDPIEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "secondPiePt" element
     */
    public int sizeOfSecondPiePtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDPIEPT$0);
        }
    }
    
    /**
     * Sets array of all "secondPiePt" element
     */
    public void setSecondPiePtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] secondPiePtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(secondPiePtArray, SECONDPIEPT$0);
        }
    }
    
    /**
     * Sets ith "secondPiePt" element
     */
    public void setSecondPiePtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt secondPiePt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(SECONDPIEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(secondPiePt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "secondPiePt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewSecondPiePt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(SECONDPIEPT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "secondPiePt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewSecondPiePt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(SECONDPIEPT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "secondPiePt" element
     */
    public void removeSecondPiePt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDPIEPT$0, i);
        }
    }
}
