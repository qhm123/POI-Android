/*
 * XML Type:  CT_ChartSpace
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_ChartSpace(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTChartSpaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace
{
    
    public CTChartSpaceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE1904$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "date1904");
    private static final javax.xml.namespace.QName LANG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lang");
    private static final javax.xml.namespace.QName ROUNDEDCORNERS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "roundedCorners");
    private static final javax.xml.namespace.QName STYLE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "style");
    private static final javax.xml.namespace.QName CLRMAPOVR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "clrMapOvr");
    private static final javax.xml.namespace.QName PIVOTSOURCE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pivotSource");
    private static final javax.xml.namespace.QName PROTECTION$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "protection");
    private static final javax.xml.namespace.QName CHART$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "chart");
    private static final javax.xml.namespace.QName SPPR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName EXTERNALDATA$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "externalData");
    private static final javax.xml.namespace.QName PRINTSETTINGS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "printSettings");
    private static final javax.xml.namespace.QName USERSHAPES$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "userShapes");
    private static final javax.xml.namespace.QName EXTLST$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "date1904" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DATE1904$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date1904" element
     */
    public boolean isSetDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE1904$0) != 0;
        }
    }
    
    /**
     * Sets the "date1904" element
     */
    public void setDate1904(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean date1904)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DATE1904$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DATE1904$0);
            }
            target.set(date1904);
        }
    }
    
    /**
     * Appends and returns a new empty "date1904" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DATE1904$0);
            return target;
        }
    }
    
    /**
     * Unsets the "date1904" element
     */
    public void unsetDate1904()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE1904$0, 0);
        }
    }
    
    /**
     * Gets the "lang" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID)get_store().find_element_user(LANG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lang" element
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANG$2) != 0;
        }
    }
    
    /**
     * Sets the "lang" element
     */
    public void setLang(org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID)get_store().find_element_user(LANG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID)get_store().add_element_user(LANG$2);
            }
            target.set(lang);
        }
    }
    
    /**
     * Appends and returns a new empty "lang" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID addNewLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID)get_store().add_element_user(LANG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lang" element
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANG$2, 0);
        }
    }
    
    /**
     * Gets the "roundedCorners" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getRoundedCorners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(ROUNDEDCORNERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roundedCorners" element
     */
    public boolean isSetRoundedCorners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDEDCORNERS$4) != 0;
        }
    }
    
    /**
     * Sets the "roundedCorners" element
     */
    public void setRoundedCorners(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean roundedCorners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(ROUNDEDCORNERS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(ROUNDEDCORNERS$4);
            }
            target.set(roundedCorners);
        }
    }
    
    /**
     * Appends and returns a new empty "roundedCorners" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewRoundedCorners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(ROUNDEDCORNERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "roundedCorners" element
     */
    public void unsetRoundedCorners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDEDCORNERS$4, 0);
        }
    }
    
    /**
     * Gets the "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle)get_store().find_element_user(STYLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$6) != 0;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle)get_store().find_element_user(STYLE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle)get_store().add_element_user(STYLE$6);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle)get_store().add_element_user(STYLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$6, 0);
        }
    }
    
    /**
     * Gets the "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAPOVR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrMapOvr" element
     */
    public boolean isSetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRMAPOVR$8) != 0;
        }
    }
    
    /**
     * Sets the "clrMapOvr" element
     */
    public void setClrMapOvr(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMapOvr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAPOVR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAPOVR$8);
            }
            target.set(clrMapOvr);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMapOvr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAPOVR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "clrMapOvr" element
     */
    public void unsetClrMapOvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRMAPOVR$8, 0);
        }
    }
    
    /**
     * Gets the "pivotSource" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource getPivotSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().find_element_user(PIVOTSOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotSource" element
     */
    public boolean isSetPivotSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTSOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "pivotSource" element
     */
    public void setPivotSource(org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource pivotSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().find_element_user(PIVOTSOURCE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().add_element_user(PIVOTSOURCE$10);
            }
            target.set(pivotSource);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotSource" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource addNewPivotSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource)get_store().add_element_user(PIVOTSOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotSource" element
     */
    public void unsetPivotSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTSOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "protection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection getProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection)get_store().find_element_user(PROTECTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "protection" element
     */
    public boolean isSetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTECTION$12) != 0;
        }
    }
    
    /**
     * Sets the "protection" element
     */
    public void setProtection(org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection protection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection)get_store().find_element_user(PROTECTION$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection)get_store().add_element_user(PROTECTION$12);
            }
            target.set(protection);
        }
    }
    
    /**
     * Appends and returns a new empty "protection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection addNewProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection)get_store().add_element_user(PROTECTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "protection" element
     */
    public void unsetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTECTION$12, 0);
        }
    }
    
    /**
     * Gets the "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChart getChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChart)get_store().find_element_user(CHART$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "chart" element
     */
    public void setChart(org.openxmlformats.schemas.drawingml.x2006.chart.CTChart chart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChart)get_store().find_element_user(CHART$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChart)get_store().add_element_user(CHART$14);
            }
            target.set(chart);
        }
    }
    
    /**
     * Appends and returns a new empty "chart" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTChart addNewChart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTChart target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTChart)get_store().add_element_user(CHART$14);
            return target;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$16, 0);
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
            return get_store().count_elements(SPPR$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$16);
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
            get_store().remove_element(SPPR$16, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$18, 0);
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
            return get_store().count_elements(TXPR$18) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$18);
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
            get_store().remove_element(TXPR$18, 0);
        }
    }
    
    /**
     * Gets the "externalData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData getExternalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData)get_store().find_element_user(EXTERNALDATA$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalData" element
     */
    public boolean isSetExternalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALDATA$20) != 0;
        }
    }
    
    /**
     * Sets the "externalData" element
     */
    public void setExternalData(org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData externalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData)get_store().find_element_user(EXTERNALDATA$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData)get_store().add_element_user(EXTERNALDATA$20);
            }
            target.set(externalData);
        }
    }
    
    /**
     * Appends and returns a new empty "externalData" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData addNewExternalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData)get_store().add_element_user(EXTERNALDATA$20);
            return target;
        }
    }
    
    /**
     * Unsets the "externalData" element
     */
    public void unsetExternalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALDATA$20, 0);
        }
    }
    
    /**
     * Gets the "printSettings" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings getPrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings)get_store().find_element_user(PRINTSETTINGS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printSettings" element
     */
    public boolean isSetPrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTSETTINGS$22) != 0;
        }
    }
    
    /**
     * Sets the "printSettings" element
     */
    public void setPrintSettings(org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings printSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings)get_store().find_element_user(PRINTSETTINGS$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings)get_store().add_element_user(PRINTSETTINGS$22);
            }
            target.set(printSettings);
        }
    }
    
    /**
     * Appends and returns a new empty "printSettings" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings addNewPrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings)get_store().add_element_user(PRINTSETTINGS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "printSettings" element
     */
    public void unsetPrintSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTSETTINGS$22, 0);
        }
    }
    
    /**
     * Gets the "userShapes" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(USERSHAPES$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userShapes" element
     */
    public boolean isSetUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERSHAPES$24) != 0;
        }
    }
    
    /**
     * Sets the "userShapes" element
     */
    public void setUserShapes(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId userShapes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(USERSHAPES$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(USERSHAPES$24);
            }
            target.set(userShapes);
        }
    }
    
    /**
     * Appends and returns a new empty "userShapes" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(USERSHAPES$24);
            return target;
        }
    }
    
    /**
     * Unsets the "userShapes" element
     */
    public void unsetUserShapes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERSHAPES$24, 0);
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
