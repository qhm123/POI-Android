/*
 * XML Type:  CT_PCDKPIs
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PCDKPIs(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPCDKPIsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs
{
    
    public CTPCDKPIsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KPI$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "kpi");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "kpi" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI> getKpiList()
    {
        final class KpiList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI get(int i)
                { return CTPCDKPIsImpl.this.getKpiArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI old = CTPCDKPIsImpl.this.getKpiArray(i);
                CTPCDKPIsImpl.this.setKpiArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI o)
                { CTPCDKPIsImpl.this.insertNewKpi(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI old = CTPCDKPIsImpl.this.getKpiArray(i);
                CTPCDKPIsImpl.this.removeKpi(i);
                return old;
            }
            
            public int size()
                { return CTPCDKPIsImpl.this.sizeOfKpiArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KpiList();
        }
    }
    
    /**
     * Gets array of all "kpi" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[] getKpiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KPI$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "kpi" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI getKpiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI)get_store().find_element_user(KPI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "kpi" element
     */
    public int sizeOfKpiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KPI$0);
        }
    }
    
    /**
     * Sets array of all "kpi" element
     */
    public void setKpiArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI[] kpiArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(kpiArray, KPI$0);
        }
    }
    
    /**
     * Sets ith "kpi" element
     */
    public void setKpiArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI kpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI)get_store().find_element_user(KPI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(kpi);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "kpi" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI insertNewKpi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI)get_store().insert_element_user(KPI$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "kpi" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI addNewKpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPI)get_store().add_element_user(KPI$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "kpi" element
     */
    public void removeKpi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KPI$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}
