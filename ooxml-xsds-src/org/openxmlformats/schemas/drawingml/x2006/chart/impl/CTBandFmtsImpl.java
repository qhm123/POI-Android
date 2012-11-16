/*
 * XML Type:  CT_BandFmts
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_BandFmts(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTBandFmtsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts
{
    
    public CTBandFmtsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANDFMT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bandFmt");
    
    
    /**
     * Gets a List of "bandFmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt> getBandFmtList()
    {
        final class BandFmtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt get(int i)
                { return CTBandFmtsImpl.this.getBandFmtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt old = CTBandFmtsImpl.this.getBandFmtArray(i);
                CTBandFmtsImpl.this.setBandFmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt o)
                { CTBandFmtsImpl.this.insertNewBandFmt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt old = CTBandFmtsImpl.this.getBandFmtArray(i);
                CTBandFmtsImpl.this.removeBandFmt(i);
                return old;
            }
            
            public int size()
                { return CTBandFmtsImpl.this.sizeOfBandFmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BandFmtList();
        }
    }
    
    /**
     * Gets array of all "bandFmt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[] getBandFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BANDFMT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bandFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt getBandFmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt)get_store().find_element_user(BANDFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bandFmt" element
     */
    public int sizeOfBandFmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANDFMT$0);
        }
    }
    
    /**
     * Sets array of all "bandFmt" element
     */
    public void setBandFmtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt[] bandFmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bandFmtArray, BANDFMT$0);
        }
    }
    
    /**
     * Sets ith "bandFmt" element
     */
    public void setBandFmtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt bandFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt)get_store().find_element_user(BANDFMT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bandFmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bandFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt insertNewBandFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt)get_store().insert_element_user(BANDFMT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bandFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt addNewBandFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmt)get_store().add_element_user(BANDFMT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "bandFmt" element
     */
    public void removeBandFmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANDFMT$0, i);
        }
    }
}
