/*
 * XML Type:  CT_LineChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_LineChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTLineChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart
{
    
    public CTLineChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "grouping");
    private static final javax.xml.namespace.QName VARYCOLORS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
    private static final javax.xml.namespace.QName SER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
    private static final javax.xml.namespace.QName DLBLS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName DROPLINES$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dropLines");
    private static final javax.xml.namespace.QName HILOWLINES$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "hiLowLines");
    private static final javax.xml.namespace.QName UPDOWNBARS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "upDownBars");
    private static final javax.xml.namespace.QName MARKER$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "marker");
    private static final javax.xml.namespace.QName SMOOTH$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "smooth");
    private static final javax.xml.namespace.QName AXID$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName EXTLST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "grouping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping getGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping)get_store().find_element_user(GROUPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "grouping" element
     */
    public void setGrouping(org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping grouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping)get_store().find_element_user(GROUPING$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping)get_store().add_element_user(GROUPING$0);
            }
            target.set(grouping);
        }
    }
    
    /**
     * Appends and returns a new empty "grouping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping addNewGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping)get_store().add_element_user(GROUPING$0);
            return target;
        }
    }
    
    /**
     * Gets the "varyColors" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getVaryColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$2, 0);
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
            return get_store().count_elements(VARYCOLORS$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$2);
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
            get_store().remove_element(VARYCOLORS$2, 0);
        }
    }
    
    /**
     * Gets a List of "ser" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer get(int i)
                { return CTLineChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer old = CTLineChartImpl.this.getSerArray(i);
                CTLineChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer o)
                { CTLineChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer old = CTLineChartImpl.this.getSerArray(i);
                CTLineChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTLineChartImpl.this.sizeOfSerArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer)get_store().find_element_user(SER$4, i);
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
            return get_store().count_elements(SER$4);
        }
    }
    
    /**
     * Sets array of all "ser" element
     */
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer[] serArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serArray, SER$4);
        }
    }
    
    /**
     * Sets ith "ser" element
     */
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer)get_store().find_element_user(SER$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer)get_store().insert_element_user(SER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer)get_store().add_element_user(SER$4);
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
            get_store().remove_element(SER$4, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$6, 0);
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
            return get_store().count_elements(DLBLS$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$6);
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
            get_store().remove_element(DLBLS$6, 0);
        }
    }
    
    /**
     * Gets the "dropLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getDropLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(DROPLINES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dropLines" element
     */
    public boolean isSetDropLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DROPLINES$8) != 0;
        }
    }
    
    /**
     * Sets the "dropLines" element
     */
    public void setDropLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines dropLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(DROPLINES$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(DROPLINES$8);
            }
            target.set(dropLines);
        }
    }
    
    /**
     * Appends and returns a new empty "dropLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewDropLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(DROPLINES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "dropLines" element
     */
    public void unsetDropLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DROPLINES$8, 0);
        }
    }
    
    /**
     * Gets the "hiLowLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getHiLowLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(HILOWLINES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hiLowLines" element
     */
    public boolean isSetHiLowLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HILOWLINES$10) != 0;
        }
    }
    
    /**
     * Sets the "hiLowLines" element
     */
    public void setHiLowLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines hiLowLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(HILOWLINES$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(HILOWLINES$10);
            }
            target.set(hiLowLines);
        }
    }
    
    /**
     * Appends and returns a new empty "hiLowLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewHiLowLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(HILOWLINES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "hiLowLines" element
     */
    public void unsetHiLowLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HILOWLINES$10, 0);
        }
    }
    
    /**
     * Gets the "upDownBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars getUpDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars)get_store().find_element_user(UPDOWNBARS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "upDownBars" element
     */
    public boolean isSetUpDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDOWNBARS$12) != 0;
        }
    }
    
    /**
     * Sets the "upDownBars" element
     */
    public void setUpDownBars(org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars upDownBars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars)get_store().find_element_user(UPDOWNBARS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars)get_store().add_element_user(UPDOWNBARS$12);
            }
            target.set(upDownBars);
        }
    }
    
    /**
     * Appends and returns a new empty "upDownBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars addNewUpDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars)get_store().add_element_user(UPDOWNBARS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "upDownBars" element
     */
    public void unsetUpDownBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDOWNBARS$12, 0);
        }
    }
    
    /**
     * Gets the "marker" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(MARKER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marker" element
     */
    public boolean isSetMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKER$14) != 0;
        }
    }
    
    /**
     * Sets the "marker" element
     */
    public void setMarker(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean marker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(MARKER$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(MARKER$14);
            }
            target.set(marker);
        }
    }
    
    /**
     * Appends and returns a new empty "marker" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(MARKER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "marker" element
     */
    public void unsetMarker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKER$14, 0);
        }
    }
    
    /**
     * Gets the "smooth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getSmooth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SMOOTH$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smooth" element
     */
    public boolean isSetSmooth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMOOTH$16) != 0;
        }
    }
    
    /**
     * Sets the "smooth" element
     */
    public void setSmooth(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean smooth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SMOOTH$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SMOOTH$16);
            }
            target.set(smooth);
        }
    }
    
    /**
     * Appends and returns a new empty "smooth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewSmooth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SMOOTH$16);
            return target;
        }
    }
    
    /**
     * Unsets the "smooth" element
     */
    public void unsetSmooth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMOOTH$16, 0);
        }
    }
    
    /**
     * Gets a List of "axId" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getAxIdList()
    {
        final class AxIdList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt get(int i)
                { return CTLineChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTLineChartImpl.this.getAxIdArray(i);
                CTLineChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTLineChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTLineChartImpl.this.getAxIdArray(i);
                CTLineChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTLineChartImpl.this.sizeOfAxIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AxIdList();
        }
    }
    
    /**
     * Gets array of all "axId" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] getAxIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AXID$18, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "axId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getAxIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axId" element
     */
    public int sizeOfAxIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXID$18);
        }
    }
    
    /**
     * Sets array of all "axId" element
     */
    public void setAxIdArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt[] axIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(axIdArray, AXID$18);
        }
    }
    
    /**
     * Sets ith "axId" element
     */
    public void setAxIdArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt axId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(axId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt insertNewAxId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(AXID$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewAxId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "axId" element
     */
    public void removeAxId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXID$18, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
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
            return get_store().count_elements(EXTLST$20) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            get_store().remove_element(EXTLST$20, 0);
        }
    }
}
