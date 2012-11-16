/*
 * XML Type:  CT_Area3DChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Area3DChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTArea3DChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart
{
    
    public CTArea3DChartImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName GAPDEPTH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "gapDepth");
    private static final javax.xml.namespace.QName AXID$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName EXTLST$14 = 
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
     * True if has "grouping" element
     */
    public boolean isSetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPING$0) != 0;
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
     * Unsets the "grouping" element
     */
    public void unsetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPING$0, 0);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer get(int i)
                { return CTArea3DChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer old = CTArea3DChartImpl.this.getSerArray(i);
                CTArea3DChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer o)
                { CTArea3DChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer old = CTArea3DChartImpl.this.getSerArray(i);
                CTArea3DChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTArea3DChartImpl.this.sizeOfSerArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer)get_store().find_element_user(SER$4, i);
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
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer[] serArray)
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
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer)get_store().find_element_user(SER$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer)get_store().insert_element_user(SER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer)get_store().add_element_user(SER$4);
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
     * Gets the "gapDepth" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount getGapDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPDEPTH$10, 0);
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
            return get_store().count_elements(GAPDEPTH$10) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().find_element_user(GAPDEPTH$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPDEPTH$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTGapAmount)get_store().add_element_user(GAPDEPTH$10);
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
            get_store().remove_element(GAPDEPTH$10, 0);
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
                { return CTArea3DChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTArea3DChartImpl.this.getAxIdArray(i);
                CTArea3DChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTArea3DChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTArea3DChartImpl.this.getAxIdArray(i);
                CTArea3DChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTArea3DChartImpl.this.sizeOfAxIdArray(); }
            
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
            get_store().find_all_element_users(AXID$12, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$12, i);
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
            return get_store().count_elements(AXID$12);
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
            arraySetterHelper(axIdArray, AXID$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(AXID$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$12);
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
            get_store().remove_element(AXID$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
            return get_store().count_elements(EXTLST$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            get_store().remove_element(EXTLST$14, 0);
        }
    }
}
