/*
 * XML Type:  CT_PivotFmts
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PivotFmts(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPivotFmtsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts
{
    
    public CTPivotFmtsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTFMT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pivotFmt");
    
    
    /**
     * Gets a List of "pivotFmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt> getPivotFmtList()
    {
        final class PivotFmtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt get(int i)
                { return CTPivotFmtsImpl.this.getPivotFmtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt old = CTPivotFmtsImpl.this.getPivotFmtArray(i);
                CTPivotFmtsImpl.this.setPivotFmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt o)
                { CTPivotFmtsImpl.this.insertNewPivotFmt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt old = CTPivotFmtsImpl.this.getPivotFmtArray(i);
                CTPivotFmtsImpl.this.removePivotFmt(i);
                return old;
            }
            
            public int size()
                { return CTPivotFmtsImpl.this.sizeOfPivotFmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PivotFmtList();
        }
    }
    
    /**
     * Gets array of all "pivotFmt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[] getPivotFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PIVOTFMT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pivotFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt getPivotFmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt)get_store().find_element_user(PIVOTFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pivotFmt" element
     */
    public int sizeOfPivotFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTFMT$0);
        }
    }
    
    /**
     * Sets array of all "pivotFmt" element
     */
    public void setPivotFmtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt[] pivotFmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pivotFmtArray, PIVOTFMT$0);
        }
    }
    
    /**
     * Sets ith "pivotFmt" element
     */
    public void setPivotFmtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt pivotFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt)get_store().find_element_user(PIVOTFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pivotFmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pivotFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt insertNewPivotFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt)get_store().insert_element_user(PIVOTFMT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pivotFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt addNewPivotFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmt)get_store().add_element_user(PIVOTFMT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pivotFmt" element
     */
    public void removePivotFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTFMT$0, i);
        }
    }
}
