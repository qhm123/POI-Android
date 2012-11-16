/*
 * XML Type:  CT_DLbls
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_DLbls(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTDLblsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls
{
    
    public CTDLblsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DLBL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLbl");
    private static final javax.xml.namespace.QName DELETE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "delete");
    private static final javax.xml.namespace.QName NUMFMT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numFmt");
    private static final javax.xml.namespace.QName SPPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName DLBLPOS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLblPos");
    private static final javax.xml.namespace.QName SHOWLEGENDKEY$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showLegendKey");
    private static final javax.xml.namespace.QName SHOWVAL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showVal");
    private static final javax.xml.namespace.QName SHOWCATNAME$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showCatName");
    private static final javax.xml.namespace.QName SHOWSERNAME$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showSerName");
    private static final javax.xml.namespace.QName SHOWPERCENT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showPercent");
    private static final javax.xml.namespace.QName SHOWBUBBLESIZE$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showBubbleSize");
    private static final javax.xml.namespace.QName SEPARATOR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "separator");
    private static final javax.xml.namespace.QName SHOWLEADERLINES$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showLeaderLines");
    private static final javax.xml.namespace.QName LEADERLINES$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "leaderLines");
    private static final javax.xml.namespace.QName EXTLST$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets a List of "dLbl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl> getDLblList()
    {
        final class DLblList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl get(int i)
                { return CTDLblsImpl.this.getDLblArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl set(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl old = CTDLblsImpl.this.getDLblArray(i);
                CTDLblsImpl.this.setDLblArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl o)
                { CTDLblsImpl.this.insertNewDLbl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl old = CTDLblsImpl.this.getDLblArray(i);
                CTDLblsImpl.this.removeDLbl(i);
                return old;
            }
            
            public int size()
                { return CTDLblsImpl.this.sizeOfDLblArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DLblList();
        }
    }
    
    /**
     * Gets array of all "dLbl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[] getDLblArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DLBL$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[] result = new org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl getDLblArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl)get_store().find_element_user(DLBL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dLbl" element
     */
    public int sizeOfDLblArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLBL$0);
        }
    }
    
    /**
     * Sets array of all "dLbl" element
     */
    public void setDLblArray(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl[] dLblArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dLblArray, DLBL$0);
        }
    }
    
    /**
     * Sets ith "dLbl" element
     */
    public void setDLblArray(int i, org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl dLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl)get_store().find_element_user(DLBL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dLbl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl insertNewDLbl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl)get_store().insert_element_user(DLBL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl addNewDLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl)get_store().add_element_user(DLBL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dLbl" element
     */
    public void removeDLbl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLBL$0, i);
        }
    }
    
    /**
     * Gets the "delete" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "delete" element
     */
    public boolean isSetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETE$2) != 0;
        }
    }
    
    /**
     * Sets the "delete" element
     */
    public void setDelete(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DELETE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DELETE$2);
            }
            target.set(delete);
        }
    }
    
    /**
     * Appends and returns a new empty "delete" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DELETE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "delete" element
     */
    public void unsetDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETE$2, 0);
        }
    }
    
    /**
     * Gets the "numFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt getNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numFmt" element
     */
    public boolean isSetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMFMT$4) != 0;
        }
    }
    
    /**
     * Sets the "numFmt" element
     */
    public void setNumFmt(org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$4);
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Appends and returns a new empty "numFmt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt addNewNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numFmt" element
     */
    public void unsetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMFMT$4, 0);
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
     * Gets the "txPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$8, 0);
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
            return get_store().count_elements(TXPR$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$8);
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
            get_store().remove_element(TXPR$8, 0);
        }
    }
    
    /**
     * Gets the "dLblPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos getDLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().find_element_user(DLBLPOS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dLblPos" element
     */
    public boolean isSetDLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DLBLPOS$10) != 0;
        }
    }
    
    /**
     * Sets the "dLblPos" element
     */
    public void setDLblPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos dLblPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().find_element_user(DLBLPOS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().add_element_user(DLBLPOS$10);
            }
            target.set(dLblPos);
        }
    }
    
    /**
     * Appends and returns a new empty "dLblPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos addNewDLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().add_element_user(DLBLPOS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "dLblPos" element
     */
    public void unsetDLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DLBLPOS$10, 0);
        }
    }
    
    /**
     * Gets the "showLegendKey" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowLegendKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEGENDKEY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showLegendKey" element
     */
    public boolean isSetShowLegendKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWLEGENDKEY$12) != 0;
        }
    }
    
    /**
     * Sets the "showLegendKey" element
     */
    public void setShowLegendKey(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showLegendKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEGENDKEY$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEGENDKEY$12);
            }
            target.set(showLegendKey);
        }
    }
    
    /**
     * Appends and returns a new empty "showLegendKey" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowLegendKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEGENDKEY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "showLegendKey" element
     */
    public void unsetShowLegendKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWLEGENDKEY$12, 0);
        }
    }
    
    /**
     * Gets the "showVal" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVAL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showVal" element
     */
    public boolean isSetShowVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWVAL$14) != 0;
        }
    }
    
    /**
     * Sets the "showVal" element
     */
    public void setShowVal(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVAL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVAL$14);
            }
            target.set(showVal);
        }
    }
    
    /**
     * Appends and returns a new empty "showVal" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVAL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "showVal" element
     */
    public void unsetShowVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWVAL$14, 0);
        }
    }
    
    /**
     * Gets the "showCatName" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowCatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWCATNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showCatName" element
     */
    public boolean isSetShowCatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWCATNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "showCatName" element
     */
    public void setShowCatName(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showCatName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWCATNAME$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWCATNAME$16);
            }
            target.set(showCatName);
        }
    }
    
    /**
     * Appends and returns a new empty "showCatName" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowCatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWCATNAME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "showCatName" element
     */
    public void unsetShowCatName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWCATNAME$16, 0);
        }
    }
    
    /**
     * Gets the "showSerName" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowSerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWSERNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showSerName" element
     */
    public boolean isSetShowSerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWSERNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "showSerName" element
     */
    public void setShowSerName(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showSerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWSERNAME$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWSERNAME$18);
            }
            target.set(showSerName);
        }
    }
    
    /**
     * Appends and returns a new empty "showSerName" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowSerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWSERNAME$18);
            return target;
        }
    }
    
    /**
     * Unsets the "showSerName" element
     */
    public void unsetShowSerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWSERNAME$18, 0);
        }
    }
    
    /**
     * Gets the "showPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWPERCENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showPercent" element
     */
    public boolean isSetShowPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWPERCENT$20) != 0;
        }
    }
    
    /**
     * Sets the "showPercent" element
     */
    public void setShowPercent(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showPercent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWPERCENT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWPERCENT$20);
            }
            target.set(showPercent);
        }
    }
    
    /**
     * Appends and returns a new empty "showPercent" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWPERCENT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "showPercent" element
     */
    public void unsetShowPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWPERCENT$20, 0);
        }
    }
    
    /**
     * Gets the "showBubbleSize" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowBubbleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWBUBBLESIZE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showBubbleSize" element
     */
    public boolean isSetShowBubbleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWBUBBLESIZE$22) != 0;
        }
    }
    
    /**
     * Sets the "showBubbleSize" element
     */
    public void setShowBubbleSize(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showBubbleSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWBUBBLESIZE$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWBUBBLESIZE$22);
            }
            target.set(showBubbleSize);
        }
    }
    
    /**
     * Appends and returns a new empty "showBubbleSize" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowBubbleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWBUBBLESIZE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "showBubbleSize" element
     */
    public void unsetShowBubbleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWBUBBLESIZE$22, 0);
        }
    }
    
    /**
     * Gets the "separator" element
     */
    public java.lang.String getSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPARATOR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "separator" element
     */
    public org.apache.xmlbeans.XmlString xgetSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPARATOR$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "separator" element
     */
    public boolean isSetSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPARATOR$24) != 0;
        }
    }
    
    /**
     * Sets the "separator" element
     */
    public void setSeparator(java.lang.String separator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPARATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEPARATOR$24);
            }
            target.setStringValue(separator);
        }
    }
    
    /**
     * Sets (as xml) the "separator" element
     */
    public void xsetSeparator(org.apache.xmlbeans.XmlString separator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPARATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEPARATOR$24);
            }
            target.set(separator);
        }
    }
    
    /**
     * Unsets the "separator" element
     */
    public void unsetSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPARATOR$24, 0);
        }
    }
    
    /**
     * Gets the "showLeaderLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEADERLINES$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showLeaderLines" element
     */
    public boolean isSetShowLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWLEADERLINES$26) != 0;
        }
    }
    
    /**
     * Sets the "showLeaderLines" element
     */
    public void setShowLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showLeaderLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEADERLINES$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEADERLINES$26);
            }
            target.set(showLeaderLines);
        }
    }
    
    /**
     * Appends and returns a new empty "showLeaderLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEADERLINES$26);
            return target;
        }
    }
    
    /**
     * Unsets the "showLeaderLines" element
     */
    public void unsetShowLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWLEADERLINES$26, 0);
        }
    }
    
    /**
     * Gets the "leaderLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(LEADERLINES$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "leaderLines" element
     */
    public boolean isSetLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEADERLINES$28) != 0;
        }
    }
    
    /**
     * Sets the "leaderLines" element
     */
    public void setLeaderLines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines leaderLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(LEADERLINES$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(LEADERLINES$28);
            }
            target.set(leaderLines);
        }
    }
    
    /**
     * Appends and returns a new empty "leaderLines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(LEADERLINES$28);
            return target;
        }
    }
    
    /**
     * Unsets the "leaderLines" element
     */
    public void unsetLeaderLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEADERLINES$28, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$30, 0);
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
            return get_store().count_elements(EXTLST$30) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$30);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$30);
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
            get_store().remove_element(EXTLST$30, 0);
        }
    }
}
