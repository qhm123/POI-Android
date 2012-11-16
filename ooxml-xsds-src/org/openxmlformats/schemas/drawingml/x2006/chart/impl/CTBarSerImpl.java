/*
 * XML Type:  CT_BarSer
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_BarSer(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTBarSerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer
{
    
    public CTBarSerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "idx");
    private static final javax.xml.namespace.QName ORDER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "order");
    private static final javax.xml.namespace.QName TX$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tx");
    private static final javax.xml.namespace.QName SPPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName INVERTIFNEGATIVE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "invertIfNegative");
    private static final javax.xml.namespace.QName PICTUREOPTIONS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pictureOptions");
    private static final javax.xml.namespace.QName DPT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dPt");
    private static final javax.xml.namespace.QName DLBLS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbls");
    private static final javax.xml.namespace.QName TRENDLINE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "trendline");
    private static final javax.xml.namespace.QName ERRBARS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "errBars");
    private static final javax.xml.namespace.QName CAT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "cat");
    private static final javax.xml.namespace.QName VAL$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "val");
    private static final javax.xml.namespace.QName SHAPE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "shape");
    private static final javax.xml.namespace.QName EXTLST$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "idx" element
     */
    public void setIdx(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(IDX$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            }
            target.set(idx);
        }
    }
    
    /**
     * Appends and returns a new empty "idx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(IDX$0);
            return target;
        }
    }
    
    /**
     * Gets the "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(ORDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "order" element
     */
    public void setOrder(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(ORDER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(ORDER$2);
            }
            target.set(order);
        }
    }
    
    /**
     * Appends and returns a new empty "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(ORDER$2);
            return target;
        }
    }
    
    /**
     * Gets the "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().find_element_user(TX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tx" element
     */
    public boolean isSetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TX$4) != 0;
        }
    }
    
    /**
     * Sets the "tx" element
     */
    public void setTx(org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().find_element_user(TX$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().add_element_user(TX$4);
            }
            target.set(tx);
        }
    }
    
    /**
     * Appends and returns a new empty "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx addNewTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx)get_store().add_element_user(TX$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tx" element
     */
    public void unsetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TX$4, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$6) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$6);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$6, 0);
        }
    }
    
    /**
     * Gets the "invertIfNegative" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(INVERTIFNEGATIVE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invertIfNegative" element
     */
    public boolean isSetInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVERTIFNEGATIVE$8) != 0;
        }
    }
    
    /**
     * Sets the "invertIfNegative" element
     */
    public void setInvertIfNegative(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean invertIfNegative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(INVERTIFNEGATIVE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(INVERTIFNEGATIVE$8);
            }
            target.set(invertIfNegative);
        }
    }
    
    /**
     * Appends and returns a new empty "invertIfNegative" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(INVERTIFNEGATIVE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "invertIfNegative" element
     */
    public void unsetInvertIfNegative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVERTIFNEGATIVE$8, 0);
        }
    }
    
    /**
     * Gets the "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions getPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pictureOptions" element
     */
    public boolean isSetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTUREOPTIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "pictureOptions" element
     */
    public void setPictureOptions(org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions pictureOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().find_element_user(PICTUREOPTIONS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$10);
            }
            target.set(pictureOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "pictureOptions" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions addNewPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPictureOptions)get_store().add_element_user(PICTUREOPTIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pictureOptions" element
     */
    public void unsetPictureOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTUREOPTIONS$10, 0);
        }
    }
    
    /**
     * Gets a List of "dPt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt> getDPtList()
    {
        final class DPtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt get(int i)
                { return CTBarSerImpl.this.getDPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt old = CTBarSerImpl.this.getDPtArray(i);
                CTBarSerImpl.this.setDPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt o)
                { CTBarSerImpl.this.insertNewDPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt old = CTBarSerImpl.this.getDPtArray(i);
                CTBarSerImpl.this.removeDPt(i);
                return old;
            }
            
            public int size()
                { return CTBarSerImpl.this.sizeOfDPtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DPtList();
        }
    }
    
    /**
     * Gets array of all "dPt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] getDPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DPT$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt getDPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().find_element_user(DPT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dPt" element
     */
    public int sizeOfDPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DPT$12);
        }
    }
    
    /**
     * Sets array of all "dPt" element
     */
    public void setDPtArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt[] dPtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dPtArray, DPT$12);
        }
    }
    
    /**
     * Sets ith "dPt" element
     */
    public void setDPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt dPt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().find_element_user(DPT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dPt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt insertNewDPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().insert_element_user(DPT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dPt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt addNewDPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt)get_store().add_element_user(DPT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "dPt" element
     */
    public void removeDPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DPT$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$14, 0);
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
            return get_store().count_elements(DLBLS$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().find_element_user(DLBLS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls)get_store().add_element_user(DLBLS$14);
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
            get_store().remove_element(DLBLS$14, 0);
        }
    }
    
    /**
     * Gets a List of "trendline" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline> getTrendlineList()
    {
        final class TrendlineList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline get(int i)
                { return CTBarSerImpl.this.getTrendlineArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline old = CTBarSerImpl.this.getTrendlineArray(i);
                CTBarSerImpl.this.setTrendlineArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline o)
                { CTBarSerImpl.this.insertNewTrendline(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline old = CTBarSerImpl.this.getTrendlineArray(i);
                CTBarSerImpl.this.removeTrendline(i);
                return old;
            }
            
            public int size()
                { return CTBarSerImpl.this.sizeOfTrendlineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrendlineList();
        }
    }
    
    /**
     * Gets array of all "trendline" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] getTrendlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRENDLINE$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline getTrendlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().find_element_user(TRENDLINE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "trendline" element
     */
    public int sizeOfTrendlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRENDLINE$16);
        }
    }
    
    /**
     * Sets array of all "trendline" element
     */
    public void setTrendlineArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline[] trendlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trendlineArray, TRENDLINE$16);
        }
    }
    
    /**
     * Sets ith "trendline" element
     */
    public void setTrendlineArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline trendline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().find_element_user(TRENDLINE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(trendline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline insertNewTrendline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().insert_element_user(TRENDLINE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "trendline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline addNewTrendline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline)get_store().add_element_user(TRENDLINE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "trendline" element
     */
    public void removeTrendline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRENDLINE$16, i);
        }
    }
    
    /**
     * Gets the "errBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars getErrBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().find_element_user(ERRBARS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errBars" element
     */
    public boolean isSetErrBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRBARS$18) != 0;
        }
    }
    
    /**
     * Sets the "errBars" element
     */
    public void setErrBars(org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars errBars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().find_element_user(ERRBARS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().add_element_user(ERRBARS$18);
            }
            target.set(errBars);
        }
    }
    
    /**
     * Appends and returns a new empty "errBars" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars addNewErrBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars)get_store().add_element_user(ERRBARS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "errBars" element
     */
    public void unsetErrBars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRBARS$18, 0);
        }
    }
    
    /**
     * Gets the "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource getCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().find_element_user(CAT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cat" element
     */
    public boolean isSetCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAT$20) != 0;
        }
    }
    
    /**
     * Sets the "cat" element
     */
    public void setCat(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().find_element_user(CAT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().add_element_user(CAT$20);
            }
            target.set(cat);
        }
    }
    
    /**
     * Appends and returns a new empty "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource addNewCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource)get_store().add_element_user(CAT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "cat" element
     */
    public void unsetCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAT$20, 0);
        }
    }
    
    /**
     * Gets the "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(VAL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "val" element
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAL$22) != 0;
        }
    }
    
    /**
     * Sets the "val" element
     */
    public void setVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().find_element_user(VAL$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(VAL$22);
            }
            target.set(val);
        }
    }
    
    /**
     * Appends and returns a new empty "val" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource addNewVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource)get_store().add_element_user(VAL$22);
            return target;
        }
    }
    
    /**
     * Unsets the "val" element
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAL$22, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().find_element_user(SHAPE$24, 0);
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
            return get_store().count_elements(SHAPE$24) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().find_element_user(SHAPE$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().add_element_user(SHAPE$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTShape)get_store().add_element_user(SHAPE$24);
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
            get_store().remove_element(SHAPE$24, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$26, 0);
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
            return get_store().count_elements(EXTLST$26) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$26);
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
            get_store().remove_element(EXTLST$26, 0);
        }
    }
}
