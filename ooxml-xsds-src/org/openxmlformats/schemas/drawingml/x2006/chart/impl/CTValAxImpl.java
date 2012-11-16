/*
 * XML Type:  CT_ValAx
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_ValAx(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTValAxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx
{
    
    public CTValAxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axId");
    private static final javax.xml.namespace.QName SCALING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scaling");
    private static final javax.xml.namespace.QName DELETE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "delete");
    private static final javax.xml.namespace.QName AXPOS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "axPos");
    private static final javax.xml.namespace.QName MAJORGRIDLINES$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "majorGridlines");
    private static final javax.xml.namespace.QName MINORGRIDLINES$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minorGridlines");
    private static final javax.xml.namespace.QName TITLE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "title");
    private static final javax.xml.namespace.QName NUMFMT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numFmt");
    private static final javax.xml.namespace.QName MAJORTICKMARK$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "majorTickMark");
    private static final javax.xml.namespace.QName MINORTICKMARK$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minorTickMark");
    private static final javax.xml.namespace.QName TICKLBLPOS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "tickLblPos");
    private static final javax.xml.namespace.QName SPPR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName CROSSAX$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crossAx");
    private static final javax.xml.namespace.QName CROSSES$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crosses");
    private static final javax.xml.namespace.QName CROSSESAT$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crossesAt");
    private static final javax.xml.namespace.QName CROSSBETWEEN$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "crossBetween");
    private static final javax.xml.namespace.QName MAJORUNIT$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "majorUnit");
    private static final javax.xml.namespace.QName MINORUNIT$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "minorUnit");
    private static final javax.xml.namespace.QName DISPUNITS$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispUnits");
    private static final javax.xml.namespace.QName EXTLST$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "axId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getAxId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axId" element
     */
    public void setAxId(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt axId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(AXID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$0);
            }
            target.set(axId);
        }
    }
    
    /**
     * Appends and returns a new empty "axId" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewAxId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(AXID$0);
            return target;
        }
    }
    
    /**
     * Gets the "scaling" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling getScaling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling)get_store().find_element_user(SCALING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scaling" element
     */
    public void setScaling(org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling scaling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling)get_store().find_element_user(SCALING$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling)get_store().add_element_user(SCALING$2);
            }
            target.set(scaling);
        }
    }
    
    /**
     * Appends and returns a new empty "scaling" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling addNewScaling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling)get_store().add_element_user(SCALING$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DELETE$4, 0);
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
            return get_store().count_elements(DELETE$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DELETE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DELETE$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DELETE$4);
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
            get_store().remove_element(DELETE$4, 0);
        }
    }
    
    /**
     * Gets the "axPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos getAxPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos)get_store().find_element_user(AXPOS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axPos" element
     */
    public void setAxPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos axPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos)get_store().find_element_user(AXPOS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos)get_store().add_element_user(AXPOS$6);
            }
            target.set(axPos);
        }
    }
    
    /**
     * Appends and returns a new empty "axPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos addNewAxPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos)get_store().add_element_user(AXPOS$6);
            return target;
        }
    }
    
    /**
     * Gets the "majorGridlines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getMajorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(MAJORGRIDLINES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "majorGridlines" element
     */
    public boolean isSetMajorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAJORGRIDLINES$8) != 0;
        }
    }
    
    /**
     * Sets the "majorGridlines" element
     */
    public void setMajorGridlines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines majorGridlines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(MAJORGRIDLINES$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(MAJORGRIDLINES$8);
            }
            target.set(majorGridlines);
        }
    }
    
    /**
     * Appends and returns a new empty "majorGridlines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewMajorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(MAJORGRIDLINES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "majorGridlines" element
     */
    public void unsetMajorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAJORGRIDLINES$8, 0);
        }
    }
    
    /**
     * Gets the "minorGridlines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines getMinorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(MINORGRIDLINES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minorGridlines" element
     */
    public boolean isSetMinorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINORGRIDLINES$10) != 0;
        }
    }
    
    /**
     * Sets the "minorGridlines" element
     */
    public void setMinorGridlines(org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines minorGridlines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().find_element_user(MINORGRIDLINES$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(MINORGRIDLINES$10);
            }
            target.set(minorGridlines);
        }
    }
    
    /**
     * Appends and returns a new empty "minorGridlines" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines addNewMinorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines)get_store().add_element_user(MINORGRIDLINES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "minorGridlines" element
     */
    public void unsetMinorGridlines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINORGRIDLINES$10, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().find_element_user(TITLE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$12) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().find_element_user(TITLE$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().add_element_user(TITLE$12);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().add_element_user(TITLE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$12, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$14, 0);
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
            return get_store().count_elements(NUMFMT$14) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().find_element_user(NUMFMT$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt)get_store().add_element_user(NUMFMT$14);
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
            get_store().remove_element(NUMFMT$14, 0);
        }
    }
    
    /**
     * Gets the "majorTickMark" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark getMajorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().find_element_user(MAJORTICKMARK$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "majorTickMark" element
     */
    public boolean isSetMajorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAJORTICKMARK$16) != 0;
        }
    }
    
    /**
     * Sets the "majorTickMark" element
     */
    public void setMajorTickMark(org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark majorTickMark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().find_element_user(MAJORTICKMARK$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().add_element_user(MAJORTICKMARK$16);
            }
            target.set(majorTickMark);
        }
    }
    
    /**
     * Appends and returns a new empty "majorTickMark" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark addNewMajorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().add_element_user(MAJORTICKMARK$16);
            return target;
        }
    }
    
    /**
     * Unsets the "majorTickMark" element
     */
    public void unsetMajorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAJORTICKMARK$16, 0);
        }
    }
    
    /**
     * Gets the "minorTickMark" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark getMinorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().find_element_user(MINORTICKMARK$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minorTickMark" element
     */
    public boolean isSetMinorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINORTICKMARK$18) != 0;
        }
    }
    
    /**
     * Sets the "minorTickMark" element
     */
    public void setMinorTickMark(org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark minorTickMark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().find_element_user(MINORTICKMARK$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().add_element_user(MINORTICKMARK$18);
            }
            target.set(minorTickMark);
        }
    }
    
    /**
     * Appends and returns a new empty "minorTickMark" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark addNewMinorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark)get_store().add_element_user(MINORTICKMARK$18);
            return target;
        }
    }
    
    /**
     * Unsets the "minorTickMark" element
     */
    public void unsetMinorTickMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINORTICKMARK$18, 0);
        }
    }
    
    /**
     * Gets the "tickLblPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos getTickLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos)get_store().find_element_user(TICKLBLPOS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tickLblPos" element
     */
    public boolean isSetTickLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TICKLBLPOS$20) != 0;
        }
    }
    
    /**
     * Sets the "tickLblPos" element
     */
    public void setTickLblPos(org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos tickLblPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos)get_store().find_element_user(TICKLBLPOS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos)get_store().add_element_user(TICKLBLPOS$20);
            }
            target.set(tickLblPos);
        }
    }
    
    /**
     * Appends and returns a new empty "tickLblPos" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos addNewTickLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos)get_store().add_element_user(TICKLBLPOS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "tickLblPos" element
     */
    public void unsetTickLblPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TICKLBLPOS$20, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$22, 0);
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
            return get_store().count_elements(SPPR$22) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$22);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$22);
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
            get_store().remove_element(SPPR$22, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$24, 0);
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
            return get_store().count_elements(TXPR$24) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$24);
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
            get_store().remove_element(TXPR$24, 0);
        }
    }
    
    /**
     * Gets the "crossAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt getCrossAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(CROSSAX$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crossAx" element
     */
    public void setCrossAx(org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt crossAx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().find_element_user(CROSSAX$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(CROSSAX$26);
            }
            target.set(crossAx);
        }
    }
    
    /**
     * Appends and returns a new empty "crossAx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt addNewCrossAx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt)get_store().add_element_user(CROSSAX$26);
            return target;
        }
    }
    
    /**
     * Gets the "crosses" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses getCrosses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses)get_store().find_element_user(CROSSES$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "crosses" element
     */
    public boolean isSetCrosses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSES$28) != 0;
        }
    }
    
    /**
     * Sets the "crosses" element
     */
    public void setCrosses(org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses crosses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses)get_store().find_element_user(CROSSES$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses)get_store().add_element_user(CROSSES$28);
            }
            target.set(crosses);
        }
    }
    
    /**
     * Appends and returns a new empty "crosses" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses addNewCrosses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses)get_store().add_element_user(CROSSES$28);
            return target;
        }
    }
    
    /**
     * Unsets the "crosses" element
     */
    public void unsetCrosses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSES$28, 0);
        }
    }
    
    /**
     * Gets the "crossesAt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getCrossesAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(CROSSESAT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "crossesAt" element
     */
    public boolean isSetCrossesAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSESAT$30) != 0;
        }
    }
    
    /**
     * Sets the "crossesAt" element
     */
    public void setCrossesAt(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble crossesAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(CROSSESAT$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(CROSSESAT$30);
            }
            target.set(crossesAt);
        }
    }
    
    /**
     * Appends and returns a new empty "crossesAt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewCrossesAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(CROSSESAT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "crossesAt" element
     */
    public void unsetCrossesAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSESAT$30, 0);
        }
    }
    
    /**
     * Gets the "crossBetween" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween getCrossBetween()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween)get_store().find_element_user(CROSSBETWEEN$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "crossBetween" element
     */
    public boolean isSetCrossBetween()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSBETWEEN$32) != 0;
        }
    }
    
    /**
     * Sets the "crossBetween" element
     */
    public void setCrossBetween(org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween crossBetween)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween)get_store().find_element_user(CROSSBETWEEN$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween)get_store().add_element_user(CROSSBETWEEN$32);
            }
            target.set(crossBetween);
        }
    }
    
    /**
     * Appends and returns a new empty "crossBetween" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween addNewCrossBetween()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween)get_store().add_element_user(CROSSBETWEEN$32);
            return target;
        }
    }
    
    /**
     * Unsets the "crossBetween" element
     */
    public void unsetCrossBetween()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSBETWEEN$32, 0);
        }
    }
    
    /**
     * Gets the "majorUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit getMajorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().find_element_user(MAJORUNIT$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "majorUnit" element
     */
    public boolean isSetMajorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAJORUNIT$34) != 0;
        }
    }
    
    /**
     * Sets the "majorUnit" element
     */
    public void setMajorUnit(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit majorUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().find_element_user(MAJORUNIT$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().add_element_user(MAJORUNIT$34);
            }
            target.set(majorUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "majorUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit addNewMajorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().add_element_user(MAJORUNIT$34);
            return target;
        }
    }
    
    /**
     * Unsets the "majorUnit" element
     */
    public void unsetMajorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAJORUNIT$34, 0);
        }
    }
    
    /**
     * Gets the "minorUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit getMinorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().find_element_user(MINORUNIT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minorUnit" element
     */
    public boolean isSetMinorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINORUNIT$36) != 0;
        }
    }
    
    /**
     * Sets the "minorUnit" element
     */
    public void setMinorUnit(org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit minorUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().find_element_user(MINORUNIT$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().add_element_user(MINORUNIT$36);
            }
            target.set(minorUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "minorUnit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit addNewMinorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit)get_store().add_element_user(MINORUNIT$36);
            return target;
        }
    }
    
    /**
     * Unsets the "minorUnit" element
     */
    public void unsetMinorUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINORUNIT$36, 0);
        }
    }
    
    /**
     * Gets the "dispUnits" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits getDispUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits)get_store().find_element_user(DISPUNITS$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispUnits" element
     */
    public boolean isSetDispUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPUNITS$38) != 0;
        }
    }
    
    /**
     * Sets the "dispUnits" element
     */
    public void setDispUnits(org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits dispUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits)get_store().find_element_user(DISPUNITS$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits)get_store().add_element_user(DISPUNITS$38);
            }
            target.set(dispUnits);
        }
    }
    
    /**
     * Appends and returns a new empty "dispUnits" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits addNewDispUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits)get_store().add_element_user(DISPUNITS$38);
            return target;
        }
    }
    
    /**
     * Unsets the "dispUnits" element
     */
    public void unsetDispUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPUNITS$38, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$40, 0);
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
            return get_store().count_elements(EXTLST$40) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$40);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$40);
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
            get_store().remove_element(EXTLST$40, 0);
        }
    }
}
