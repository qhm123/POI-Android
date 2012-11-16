/*
 * XML Type:  CT_SurfaceChart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_SurfaceChart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTSurfaceChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart
{
    
    public CTSurfaceChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WIREFRAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "wireframe");
    private static final javax.xml.namespace.QName SER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ser");
    private static final javax.xml.namespace.QName BANDFMTS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bandFmts");
    private static final javax.xml.namespace.QName AXID$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "wireframe" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getWireframe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(WIREFRAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wireframe" element
     */
    public boolean isSetWireframe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIREFRAME$0) != 0;
        }
    }
    
    /**
     * Sets the "wireframe" element
     */
    public void setWireframe(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean wireframe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(WIREFRAME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(WIREFRAME$0);
            }
            target.set(wireframe);
        }
    }
    
    /**
     * Appends and returns a new empty "wireframe" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewWireframe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(WIREFRAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "wireframe" element
     */
    public void unsetWireframe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIREFRAME$0, 0);
        }
    }
    
    /**
     * Gets a List of "ser" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer> getSerList()
    {
        final class SerList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer get(int i)
                { return CTSurfaceChartImpl.this.getSerArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer old = CTSurfaceChartImpl.this.getSerArray(i);
                CTSurfaceChartImpl.this.setSerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer o)
                { CTSurfaceChartImpl.this.insertNewSer(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer old = CTSurfaceChartImpl.this.getSerArray(i);
                CTSurfaceChartImpl.this.removeSer(i);
                return old;
            }
            
            public int size()
                { return CTSurfaceChartImpl.this.sizeOfSerArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[] getSerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SER$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer getSerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer)get_store().find_element_user(SER$2, i);
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
    public void setSerArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer[] serArray)
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
    public void setSerArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer ser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer)get_store().find_element_user(SER$2, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer insertNewSer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer)get_store().insert_element_user(SER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ser" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer addNewSer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceSer)get_store().add_element_user(SER$2);
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
     * Gets the "bandFmts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts getBandFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts)get_store().find_element_user(BANDFMTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bandFmts" element
     */
    public boolean isSetBandFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BANDFMTS$4) != 0;
        }
    }
    
    /**
     * Sets the "bandFmts" element
     */
    public void setBandFmts(org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts bandFmts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts)get_store().find_element_user(BANDFMTS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts)get_store().add_element_user(BANDFMTS$4);
            }
            target.set(bandFmts);
        }
    }
    
    /**
     * Appends and returns a new empty "bandFmts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts addNewBandFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBandFmts)get_store().add_element_user(BANDFMTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bandFmts" element
     */
    public void unsetBandFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BANDFMTS$4, 0);
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
                { return CTSurfaceChartImpl.this.getAxIdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTSurfaceChartImpl.this.getAxIdArray(i);
                CTSurfaceChartImpl.this.setAxIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt o)
                { CTSurfaceChartImpl.this.insertNewAxId(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt old = CTSurfaceChartImpl.this.getAxIdArray(i);
                CTSurfaceChartImpl.this.removeAxId(i);
                return old;
            }
            
            public int size()
                { return CTSurfaceChartImpl.this.sizeOfAxIdArray(); }
            
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
            get_store().find_all_element_users(AXID$6, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$6, i);
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
            return get_store().count_elements(AXID$6);
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
            arraySetterHelper(axIdArray, AXID$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().insert_element_user(AXID$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$6);
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
            get_store().remove_element(AXID$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}
