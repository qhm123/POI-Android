/*
 * XML Type:  CT_Bar3DChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Bar3DChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTBar3DChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart
{
    
    public CTBar3DChartImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName GAPDEPTH$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "gapDepth");
    private static final javax.xml.namespace.QName SHAPE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "shape");
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
                { return CTBar3DChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer old = CTBar3DChartImpl.this.getSerArray(i);
                CTBar3DChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer o)
                { CTBar3DChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer old = CTBar3DChartImpl.this.getSerArray(i);
                CTBar3DChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTBar3DChartImpl.this.sizeOfSerArray(); }
            
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
     * Gets the "gapDepth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPDEPTH$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gapDepth" element
     */
    public boolean isSetGapDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GAPDEPTH$12) != 0;
        }
    }
    
    /**
     * Sets the "gapDepth" element
     */
    public void setGapDepth(org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount gapDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPDEPTH$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPDEPTH$12);
            }
            target.set(gapDepth);
        }
    }
    
    /**
     * Appends and returns a new empty "gapDepth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount addNewGapDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPDEPTH$12);
            return target;
        }
    }
    
    /**
     * Unsets the "gapDepth" element
     */
    public void unsetGapDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GAPDEPTH$12, 0);
        }
    }
    
    /**
     * Gets the "shape" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTShape getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().find_element_user(SHAPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shape" element
     */
    public boolean isSetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPE$14) != 0;
        }
    }
    
    /**
     * Sets the "shape" element
     */
    public void setShape(org.openxmlformats.schemas.drawingml.x2006.chart.CTShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().find_element_user(SHAPE$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().add_element_user(SHAPE$14);
            }
            target.set(shape);
        }
    }
    
    /**
     * Appends and returns a new empty "shape" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTShape addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().add_element_user(SHAPE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "shape" element
     */
    public void unsetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPE$14, 0);
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
                { return CTBar3DChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTBar3DChartImpl.this.getAxIdArray(i);
                CTBar3DChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTBar3DChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTBar3DChartImpl.this.getAxIdArray(i);
                CTBar3DChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTBar3DChartImpl.this.sizeOfAxIdArray(); }
            
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
