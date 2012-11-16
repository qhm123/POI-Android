/*
 * XML Type:  CT_Chart
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTChart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Chart(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTChart
{
    
    public CTChartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "title");
    private static final javax.xml.namespace.QName AUTOTITLEDELETED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "autoTitleDeleted");
    private static final javax.xml.namespace.QName PIVOTFMTS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pivotFmts");
    private static final javax.xml.namespace.QName VIEW3D$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "view3D");
    private static final javax.xml.namespace.QName FLOOR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "floor");
    private static final javax.xml.namespace.QName SIDEWALL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "sideWall");
    private static final javax.xml.namespace.QName BACKWALL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "backWall");
    private static final javax.xml.namespace.QName PLOTAREA$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "plotArea");
    private static final javax.xml.namespace.QName LEGEND$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legend");
    private static final javax.xml.namespace.QName PLOTVISONLY$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "plotVisOnly");
    private static final javax.xml.namespace.QName DISPBLANKSAS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispBlanksAs");
    private static final javax.xml.namespace.QName SHOWDLBLSOVERMAX$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showDLblsOverMax");
    private static final javax.xml.namespace.QName EXTLST$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().find_element_user(TITLE$0, 0);
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
            return get_store().count_elements(TITLE$0) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().add_element_user(TITLE$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle)get_store().add_element_user(TITLE$0);
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
            get_store().remove_element(TITLE$0, 0);
        }
    }
    
    /**
     * Gets the "autoTitleDeleted" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getAutoTitleDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(AUTOTITLEDELETED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoTitleDeleted" element
     */
    public boolean isSetAutoTitleDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOTITLEDELETED$2) != 0;
        }
    }
    
    /**
     * Sets the "autoTitleDeleted" element
     */
    public void setAutoTitleDeleted(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean autoTitleDeleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(AUTOTITLEDELETED$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(AUTOTITLEDELETED$2);
            }
            target.set(autoTitleDeleted);
        }
    }
    
    /**
     * Appends and returns a new empty "autoTitleDeleted" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewAutoTitleDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(AUTOTITLEDELETED$2);
            return target;
        }
    }
    
    /**
     * Unsets the "autoTitleDeleted" element
     */
    public void unsetAutoTitleDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOTITLEDELETED$2, 0);
        }
    }
    
    /**
     * Gets the "pivotFmts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts getPivotFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts)get_store().find_element_user(PIVOTFMTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotFmts" element
     */
    public boolean isSetPivotFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTFMTS$4) != 0;
        }
    }
    
    /**
     * Sets the "pivotFmts" element
     */
    public void setPivotFmts(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts pivotFmts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts)get_store().find_element_user(PIVOTFMTS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts)get_store().add_element_user(PIVOTFMTS$4);
            }
            target.set(pivotFmts);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotFmts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts addNewPivotFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts)get_store().add_element_user(PIVOTFMTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotFmts" element
     */
    public void unsetPivotFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTFMTS$4, 0);
        }
    }
    
    /**
     * Gets the "view3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D getView3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D)get_store().find_element_user(VIEW3D$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "view3D" element
     */
    public boolean isSetView3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEW3D$6) != 0;
        }
    }
    
    /**
     * Sets the "view3D" element
     */
    public void setView3D(org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D view3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D)get_store().find_element_user(VIEW3D$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D)get_store().add_element_user(VIEW3D$6);
            }
            target.set(view3D);
        }
    }
    
    /**
     * Appends and returns a new empty "view3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D addNewView3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D)get_store().add_element_user(VIEW3D$6);
            return target;
        }
    }
    
    /**
     * Unsets the "view3D" element
     */
    public void unsetView3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEW3D$6, 0);
        }
    }
    
    /**
     * Gets the "floor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(FLOOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "floor" element
     */
    public boolean isSetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOOR$8) != 0;
        }
    }
    
    /**
     * Sets the "floor" element
     */
    public void setFloor(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface floor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(FLOOR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(FLOOR$8);
            }
            target.set(floor);
        }
    }
    
    /**
     * Appends and returns a new empty "floor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(FLOOR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "floor" element
     */
    public void unsetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOOR$8, 0);
        }
    }
    
    /**
     * Gets the "sideWall" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getSideWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(SIDEWALL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sideWall" element
     */
    public boolean isSetSideWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIDEWALL$10) != 0;
        }
    }
    
    /**
     * Sets the "sideWall" element
     */
    public void setSideWall(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface sideWall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(SIDEWALL$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(SIDEWALL$10);
            }
            target.set(sideWall);
        }
    }
    
    /**
     * Appends and returns a new empty "sideWall" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewSideWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(SIDEWALL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sideWall" element
     */
    public void unsetSideWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIDEWALL$10, 0);
        }
    }
    
    /**
     * Gets the "backWall" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface getBackWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(BACKWALL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "backWall" element
     */
    public boolean isSetBackWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKWALL$12) != 0;
        }
    }
    
    /**
     * Sets the "backWall" element
     */
    public void setBackWall(org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface backWall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().find_element_user(BACKWALL$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(BACKWALL$12);
            }
            target.set(backWall);
        }
    }
    
    /**
     * Appends and returns a new empty "backWall" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface addNewBackWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface)get_store().add_element_user(BACKWALL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "backWall" element
     */
    public void unsetBackWall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKWALL$12, 0);
        }
    }
    
    /**
     * Gets the "plotArea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea getPlotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea)get_store().find_element_user(PLOTAREA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "plotArea" element
     */
    public void setPlotArea(org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea plotArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea)get_store().find_element_user(PLOTAREA$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea)get_store().add_element_user(PLOTAREA$14);
            }
            target.set(plotArea);
        }
    }
    
    /**
     * Appends and returns a new empty "plotArea" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea addNewPlotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea)get_store().add_element_user(PLOTAREA$14);
            return target;
        }
    }
    
    /**
     * Gets the "legend" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend getLegend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend)get_store().find_element_user(LEGEND$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legend" element
     */
    public boolean isSetLegend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGEND$16) != 0;
        }
    }
    
    /**
     * Sets the "legend" element
     */
    public void setLegend(org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend legend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend)get_store().find_element_user(LEGEND$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend)get_store().add_element_user(LEGEND$16);
            }
            target.set(legend);
        }
    }
    
    /**
     * Appends and returns a new empty "legend" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend addNewLegend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend)get_store().add_element_user(LEGEND$16);
            return target;
        }
    }
    
    /**
     * Unsets the "legend" element
     */
    public void unsetLegend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGEND$16, 0);
        }
    }
    
    /**
     * Gets the "plotVisOnly" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getPlotVisOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(PLOTVISONLY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plotVisOnly" element
     */
    public boolean isSetPlotVisOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLOTVISONLY$18) != 0;
        }
    }
    
    /**
     * Sets the "plotVisOnly" element
     */
    public void setPlotVisOnly(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean plotVisOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(PLOTVISONLY$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(PLOTVISONLY$18);
            }
            target.set(plotVisOnly);
        }
    }
    
    /**
     * Appends and returns a new empty "plotVisOnly" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewPlotVisOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(PLOTVISONLY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "plotVisOnly" element
     */
    public void unsetPlotVisOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLOTVISONLY$18, 0);
        }
    }
    
    /**
     * Gets the "dispBlanksAs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs getDispBlanksAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs)get_store().find_element_user(DISPBLANKSAS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispBlanksAs" element
     */
    public boolean isSetDispBlanksAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPBLANKSAS$20) != 0;
        }
    }
    
    /**
     * Sets the "dispBlanksAs" element
     */
    public void setDispBlanksAs(org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs dispBlanksAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs)get_store().find_element_user(DISPBLANKSAS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs)get_store().add_element_user(DISPBLANKSAS$20);
            }
            target.set(dispBlanksAs);
        }
    }
    
    /**
     * Appends and returns a new empty "dispBlanksAs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs addNewDispBlanksAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs)get_store().add_element_user(DISPBLANKSAS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "dispBlanksAs" element
     */
    public void unsetDispBlanksAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPBLANKSAS$20, 0);
        }
    }
    
    /**
     * Gets the "showDLblsOverMax" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowDLblsOverMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWDLBLSOVERMAX$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showDLblsOverMax" element
     */
    public boolean isSetShowDLblsOverMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWDLBLSOVERMAX$22) != 0;
        }
    }
    
    /**
     * Sets the "showDLblsOverMax" element
     */
    public void setShowDLblsOverMax(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showDLblsOverMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWDLBLSOVERMAX$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWDLBLSOVERMAX$22);
            }
            target.set(showDLblsOverMax);
        }
    }
    
    /**
     * Appends and returns a new empty "showDLblsOverMax" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowDLblsOverMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWDLBLSOVERMAX$22);
            return target;
        }
    }
    
    /**
     * Unsets the "showDLblsOverMax" element
     */
    public void unsetShowDLblsOverMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWDLBLSOVERMAX$22, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$24, 0);
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
            return get_store().count_elements(EXTLST$24) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$24);
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
            get_store().remove_element(EXTLST$24, 0);
        }
    }
}
