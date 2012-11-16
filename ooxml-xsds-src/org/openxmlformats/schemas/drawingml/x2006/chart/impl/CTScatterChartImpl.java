/*
 * XML Type:  CT_ScatterChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_ScatterChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTScatterChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart
{
    
    public CTScatterChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCATTERSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scatterStyle");
    private static final javax.xml.namespace.QName VARYCOLORS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "varyColors");
    private static final javax.xml.namespace.QName SER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
    private static final javax.xml.namespace.QName DLBLS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName AXID$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName EXTLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "scatterStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle getScatterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle)get_store().find_element_user(SCATTERSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scatterStyle" element
     */
    public void setScatterStyle(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle scatterStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle)get_store().find_element_user(SCATTERSTYLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle)get_store().add_element_user(SCATTERSTYLE$0);
            }
            target.set(scatterStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "scatterStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle addNewScatterStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle)get_store().add_element_user(SCATTERSTYLE$0);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer get(int i)
                { return CTScatterChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer old = CTScatterChartImpl.this.getSerArray(i);
                CTScatterChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer o)
                { CTScatterChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer old = CTScatterChartImpl.this.getSerArray(i);
                CTScatterChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTScatterChartImpl.this.sizeOfSerArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().find_element_user(SER$4, i);
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
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer[] serArray)
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
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().find_element_user(SER$4, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().insert_element_user(SER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer)get_store().add_element_user(SER$4);
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
     * Gets a List of "axId" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt> getAxIdList()
    {
        final class AxIdList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt get(int i)
                { return CTScatterChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTScatterChartImpl.this.getAxIdArray(i);
                CTScatterChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTScatterChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTScatterChartImpl.this.getAxIdArray(i);
                CTScatterChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTScatterChartImpl.this.sizeOfAxIdArray(); }
            
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
            get_store().find_all_element_users(AXID$8, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$8, i);
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
            return get_store().count_elements(AXID$8);
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
            arraySetterHelper(axIdArray, AXID$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$8, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(AXID$8, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$8);
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
            get_store().remove_element(AXID$8, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
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
            return get_store().count_elements(EXTLST$10) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$10);
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
            get_store().remove_element(EXTLST$10, 0);
        }
    }
}
