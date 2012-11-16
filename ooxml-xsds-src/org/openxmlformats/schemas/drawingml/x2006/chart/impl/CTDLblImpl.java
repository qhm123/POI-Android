/*
 * XML Type:  CT_DLbl
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_DLbl(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTDLblImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbl
{
    
    public CTDLblImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "idx");
    private static final javax.xml.namespace.QName DELETE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "delete");
    private static final javax.xml.namespace.QName LAYOUT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
    private static final javax.xml.namespace.QName TX$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tx");
    private static final javax.xml.namespace.QName NUMFMT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numFmt");
    private static final javax.xml.namespace.QName SPPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName DLBLPOS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dLblPos");
    private static final javax.xml.namespace.QName SHOWLEGENDKEY$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showLegendKey");
    private static final javax.xml.namespace.QName SHOWVAL$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showVal");
    private static final javax.xml.namespace.QName SHOWCATNAME$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showCatName");
    private static final javax.xml.namespace.QName SHOWSERNAME$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showSerName");
    private static final javax.xml.namespace.QName SHOWPERCENT$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showPercent");
    private static final javax.xml.namespace.QName SHOWBUBBLESIZE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showBubbleSize");
    private static final javax.xml.namespace.QName SEPARATOR$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "separator");
    private static final javax.xml.namespace.QName EXTLST$30 = 
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
     * Gets the "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTx getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTx)get_store().find_element_user(TX$6, 0);
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
            return get_store().count_elements(TX$6) != 0;
        }
    }
    
    /**
     * Sets the "tx" element
     */
    public void setTx(org.openxmlformats.schemas.drawingml.x2006.chart.CTTx tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTx)get_store().find_element_user(TX$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTx)get_store().add_element_user(TX$6);
            }
            target.set(tx);
        }
    }
    
    /**
     * Appends and returns a new empty "tx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTx addNewTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTx target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTx)get_store().add_element_user(TX$6);
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
            get_store().remove_element(TX$6, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$8, 0);
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
            return get_store().count_elements(NUMFMT$8) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$8);
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
            get_store().remove_element(NUMFMT$8, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$10, 0);
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
            return get_store().count_elements(SPPR$10) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$10);
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
            get_store().remove_element(SPPR$10, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$12, 0);
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
            return get_store().count_elements(TXPR$12) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$12);
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
            get_store().remove_element(TXPR$12, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().find_element_user(DLBLPOS$14, 0);
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
            return get_store().count_elements(DLBLPOS$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().find_element_user(DLBLPOS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().add_element_user(DLBLPOS$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDLblPos)get_store().add_element_user(DLBLPOS$14);
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
            get_store().remove_element(DLBLPOS$14, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEGENDKEY$16, 0);
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
            return get_store().count_elements(SHOWLEGENDKEY$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWLEGENDKEY$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEGENDKEY$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWLEGENDKEY$16);
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
            get_store().remove_element(SHOWLEGENDKEY$16, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVAL$18, 0);
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
            return get_store().count_elements(SHOWVAL$18) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVAL$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVAL$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVAL$18);
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
            get_store().remove_element(SHOWVAL$18, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWCATNAME$20, 0);
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
            return get_store().count_elements(SHOWCATNAME$20) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWCATNAME$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWCATNAME$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWCATNAME$20);
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
            get_store().remove_element(SHOWCATNAME$20, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWSERNAME$22, 0);
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
            return get_store().count_elements(SHOWSERNAME$22) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWSERNAME$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWSERNAME$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWSERNAME$22);
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
            get_store().remove_element(SHOWSERNAME$22, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWPERCENT$24, 0);
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
            return get_store().count_elements(SHOWPERCENT$24) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWPERCENT$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWPERCENT$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWPERCENT$24);
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
            get_store().remove_element(SHOWPERCENT$24, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWBUBBLESIZE$26, 0);
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
            return get_store().count_elements(SHOWBUBBLESIZE$26) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWBUBBLESIZE$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWBUBBLESIZE$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWBUBBLESIZE$26);
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
            get_store().remove_element(SHOWBUBBLESIZE$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPARATOR$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPARATOR$28, 0);
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
            return get_store().count_elements(SEPARATOR$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEPARATOR$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEPARATOR$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEPARATOR$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEPARATOR$28);
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
            get_store().remove_element(SEPARATOR$28, 0);
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
