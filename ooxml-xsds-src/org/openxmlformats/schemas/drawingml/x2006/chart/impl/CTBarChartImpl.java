/*
 * XML Type:  CT_BarChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_BarChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTBarChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart
{
    
    public CTBarChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BARDIR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "barDir");
    private static final javax.xml.namespace.QName GROUPING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "grouping");
    private static final javax.xml.namespace.QName VARYCOLORS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
    private static final javax.xml.namespace.QName SER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
    private static final javax.xml.namespace.QName DLBLS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName GAPWIDTH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "gapWidth");
    private static final javax.xml.namespace.QName OVERLAP$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "overlap");
    private static final javax.xml.namespace.QName SERLINES$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "serLines");
    private static final javax.xml.namespace.QName AXID$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName EXTLST$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "barDir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir getBarDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir)get_store().find_element_user(BARDIR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "barDir" element
     */
    public void setBarDir(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir barDir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir)get_store().find_element_user(BARDIR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir)get_store().add_element_user(BARDIR$0);
            }
            target.set(barDir);
        }
    }
    
    /**
     * Appends and returns a new empty "barDir" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir addNewBarDir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarDir)get_store().add_element_user(BARDIR$0);
            return target;
        }
    }
    
    /**
     * Gets the "grouping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping getGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping)get_store().find_element_user(GROUPING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grouping" element
     */
    public boolean isSetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPING$2) != 0;
        }
    }
    
    /**
     * Sets the "grouping" element
     */
    public void setGrouping(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping grouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping)get_store().find_element_user(GROUPING$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping)get_store().add_element_user(GROUPING$2);
            }
            target.set(grouping);
        }
    }
    
    /**
     * Appends and returns a new empty "grouping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping addNewGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarGrouping)get_store().add_element_user(GROUPING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "grouping" element
     */
    public void unsetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPING$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$4, 0);
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
            return get_store().count_elements(VARYCOLORS$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(VARYCOLORS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(VARYCOLORS$4);
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
            get_store().remove_element(VARYCOLORS$4, 0);
        }
    }
    
    /**
     * Gets a List of "ser" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer get(int i)
                { return CTBarChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer old = CTBarChartImpl.this.getSerArray(i);
                CTBarChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer o)
                { CTBarChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer old = CTBarChartImpl.this.getSerArray(i);
                CTBarChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTBarChartImpl.this.sizeOfSerArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer)get_store().find_element_user(SER$6, i);
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
            return get_store().count_elements(SER$6);
        }
    }
    
    /**
     * Sets array of all "ser" element
     */
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer[] serArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serArray, SER$6);
        }
    }
    
    /**
     * Sets ith "ser" element
     */
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer)get_store().find_element_user(SER$6, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer)get_store().insert_element_user(SER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer)get_store().add_element_user(SER$6);
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
            get_store().remove_element(SER$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$8, 0);
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
            return get_store().count_elements(DLBLS$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$8);
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
            get_store().remove_element(DLBLS$8, 0);
        }
    }
    
    /**
     * Gets the "gapWidth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPWIDTH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gapWidth" element
     */
    public boolean isSetGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GAPWIDTH$10) != 0;
        }
    }
    
    /**
     * Sets the "gapWidth" element
     */
    public void setGapWidth(org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount gapWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPWIDTH$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPWIDTH$10);
            }
            target.set(gapWidth);
        }
    }
    
    /**
     * Appends and returns a new empty "gapWidth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount addNewGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPWIDTH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "gapWidth" element
     */
    public void unsetGapWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GAPWIDTH$10, 0);
        }
    }
    
    /**
     * Gets the "overlap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap getOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap)get_store().find_element_user(OVERLAP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "overlap" element
     */
    public boolean isSetOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERLAP$12) != 0;
        }
    }
    
    /**
     * Sets the "overlap" element
     */
    public void setOverlap(org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap overlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap)get_store().find_element_user(OVERLAP$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap)get_store().add_element_user(OVERLAP$12);
            }
            target.set(overlap);
        }
    }
    
    /**
     * Appends and returns a new empty "overlap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap addNewOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOverlap)get_store().add_element_user(OVERLAP$12);
            return target;
        }
    }
    
    /**
     * Unsets the "overlap" element
     */
    public void unsetOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERLAP$12, 0);
        }
    }
    
    /**
     * Gets a List of "serLines" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines> getSerLinesList()
    {
        final class SerLinesList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines get(int i)
                { return CTBarChartImpl.this.getSerLinesArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines old = CTBarChartImpl.this.getSerLinesArray(i);
                CTBarChartImpl.this.setSerLinesArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines o)
                { CTBarChartImpl.this.insertNewSerLines(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines old = CTBarChartImpl.this.getSerLinesArray(i);
                CTBarChartImpl.this.removeSerLines(i);
                return old;
            }
            
            public int size()
                { return CTBarChartImpl.this.sizeOfSerLinesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SerLinesList();
        }
    }
    
    /**
     * Gets array of all "serLines" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines[] getSerLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERLINES$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getSerLinesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(SERLINES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serLines" element
     */
    public int sizeOfSerLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERLINES$14);
        }
    }
    
    /**
     * Sets array of all "serLines" element
     */
    public void setSerLinesArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines[] serLinesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serLinesArray, SERLINES$14);
        }
    }
    
    /**
     * Sets ith "serLines" element
     */
    public void setSerLinesArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines serLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(SERLINES$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serLines);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines insertNewSerLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().insert_element_user(SERLINES$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewSerLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(SERLINES$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "serLines" element
     */
    public void removeSerLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERLINES$14, i);
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
                { return CTBarChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTBarChartImpl.this.getAxIdArray(i);
                CTBarChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTBarChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTBarChartImpl.this.getAxIdArray(i);
                CTBarChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTBarChartImpl.this.sizeOfAxIdArray(); }
            
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
            get_store().find_all_element_users(AXID$16, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$16, i);
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
            return get_store().count_elements(AXID$16);
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
            arraySetterHelper(axIdArray, AXID$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$16, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(AXID$16, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$16);
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
            get_store().remove_element(AXID$16, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
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
            return get_store().count_elements(EXTLST$18) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$18);
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
            get_store().remove_element(EXTLST$18, 0);
        }
    }
}
