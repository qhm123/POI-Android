/*
 * XML Type:  CT_Pie3DChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Pie3DChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPie3DChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart
{
    
    public CTPie3DChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARYCOLORS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
    private static final javax.xml.namespace.QName SER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
    private static final javax.xml.namespace.QName DLBLS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "varyColors" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getVaryColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "varyColors" element
     */
    public boolean isSetVaryColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARYCOLORS$0) != 0;
        }
    }
    
    /**
     * Sets the "varyColors" element
     */
    public void setVaryColors(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean varyColors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$0);
            }
            target.set(varyColors);
        }
    }
    
    /**
     * Appends and returns a new empty "varyColors" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewVaryColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "varyColors" element
     */
    public void unsetVaryColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARYCOLORS$0, 0);
        }
    }
    
    /**
     * Gets a List of "ser" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer get(int i)
                { return CTPie3DChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer old = CTPie3DChartImpl.this.getSerArray(i);
                CTPie3DChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer o)
                { CTPie3DChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer old = CTPie3DChartImpl.this.getSerArray(i);
                CTPie3DChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTPie3DChartImpl.this.sizeOfSerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SerList();
        }
    }
    
    /**
     * Gets array of all "ser" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer)get_store().find_element_user(SER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ser" element
     */
    public int sizeOfSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SER$2);
        }
    }
    
    /**
     * Sets array of all "ser" element
     */
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer[] serArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serArray, SER$2);
        }
    }
    
    /**
     * Sets ith "ser" element
     */
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer)get_store().find_element_user(SER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ser);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer)get_store().insert_element_user(SER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer)get_store().add_element_user(SER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ser" element
     */
    public void removeSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SER$2, i);
        }
    }
    
    /**
     * Gets the "dLbls" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls getDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dLbls" element
     */
    public boolean isSetDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLBLS$4) != 0;
        }
    }
    
    /**
     * Sets the "dLbls" element
     */
    public void setDLbls(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls dLbls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$4);
            }
            target.set(dLbls);
        }
    }
    
    /**
     * Appends and returns a new empty "dLbls" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls addNewDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dLbls" element
     */
    public void unsetDLbls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLBLS$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$6, 0);
        }
    }
}
