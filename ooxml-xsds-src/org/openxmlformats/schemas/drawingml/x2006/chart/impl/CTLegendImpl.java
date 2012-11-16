/*
 * XML Type:  CT_Legend
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Legend(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTLegendImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend
{
    
    public CTLegendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGENDPOS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legendPos");
    private static final javax.xml.namespace.QName LEGENDENTRY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legendEntry");
    private static final javax.xml.namespace.QName LAYOUT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
    private static final javax.xml.namespace.QName OVERLAY$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "overlay");
    private static final javax.xml.namespace.QName SPPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "legendPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos getLegendPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos)get_store().find_element_user(LEGENDPOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legendPos" element
     */
    public boolean isSetLegendPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGENDPOS$0) != 0;
        }
    }
    
    /**
     * Sets the "legendPos" element
     */
    public void setLegendPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos legendPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos)get_store().find_element_user(LEGENDPOS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos)get_store().add_element_user(LEGENDPOS$0);
            }
            target.set(legendPos);
        }
    }
    
    /**
     * Appends and returns a new empty "legendPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos addNewLegendPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos)get_store().add_element_user(LEGENDPOS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "legendPos" element
     */
    public void unsetLegendPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGENDPOS$0, 0);
        }
    }
    
    /**
     * Gets a List of "legendEntry" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry> getLegendEntryList()
    {
        final class LegendEntryList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry get(int i)
                { return CTLegendImpl.this.getLegendEntryArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry old = CTLegendImpl.this.getLegendEntryArray(i);
                CTLegendImpl.this.setLegendEntryArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry o)
                { CTLegendImpl.this.insertNewLegendEntry(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry old = CTLegendImpl.this.getLegendEntryArray(i);
                CTLegendImpl.this.removeLegendEntry(i);
                return old;
            }
            
            public int size()
                { return CTLegendImpl.this.sizeOfLegendEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LegendEntryList();
        }
    }
    
    /**
     * Gets array of all "legendEntry" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[] getLegendEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LEGENDENTRY$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "legendEntry" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry getLegendEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry)get_store().find_element_user(LEGENDENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "legendEntry" element
     */
    public int sizeOfLegendEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGENDENTRY$2);
        }
    }
    
    /**
     * Sets array of all "legendEntry" element
     */
    public void setLegendEntryArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry[] legendEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(legendEntryArray, LEGENDENTRY$2);
        }
    }
    
    /**
     * Sets ith "legendEntry" element
     */
    public void setLegendEntryArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry legendEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry)get_store().find_element_user(LEGENDENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(legendEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legendEntry" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry insertNewLegendEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry)get_store().insert_element_user(LEGENDENTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legendEntry" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry addNewLegendEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry)get_store().add_element_user(LEGENDENTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "legendEntry" element
     */
    public void removeLegendEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGENDENTRY$2, i);
        }
    }
    
    /**
     * Gets the "layout" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout getLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().find_element_user(LAYOUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "layout" element
     */
    public boolean isSetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUT$4) != 0;
        }
    }
    
    /**
     * Sets the "layout" element
     */
    public void setLayout(org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().find_element_user(LAYOUT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().add_element_user(LAYOUT$4);
            }
            target.set(layout);
        }
    }
    
    /**
     * Appends and returns a new empty "layout" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout addNewLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout)get_store().add_element_user(LAYOUT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "layout" element
     */
    public void unsetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUT$4, 0);
        }
    }
    
    /**
     * Gets the "overlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(OVERLAY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "overlay" element
     */
    public boolean isSetOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERLAY$6) != 0;
        }
    }
    
    /**
     * Sets the "overlay" element
     */
    public void setOverlay(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean overlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(OVERLAY$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(OVERLAY$6);
            }
            target.set(overlay);
        }
    }
    
    /**
     * Appends and returns a new empty "overlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(OVERLAY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "overlay" element
     */
    public void unsetOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERLAY$6, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$8, 0);
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
            return get_store().count_elements(SPPR$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$8);
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
            get_store().remove_element(SPPR$8, 0);
        }
    }
    
    /**
     * Gets the "txPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txPr" element
     */
    public boolean isSetTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXPR$10) != 0;
        }
    }
    
    /**
     * Sets the "txPr" element
     */
    public void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$10);
            }
            target.set(txPr);
        }
    }
    
    /**
     * Appends and returns a new empty "txPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "txPr" element
     */
    public void unsetTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXPR$10, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
        }
    }
}
