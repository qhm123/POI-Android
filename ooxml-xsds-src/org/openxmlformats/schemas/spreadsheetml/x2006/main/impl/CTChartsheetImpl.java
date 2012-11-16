/*
 * XML Type:  CT_Chartsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Chartsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTChartsheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet
{
    
    public CTChartsheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
    private static final javax.xml.namespace.QName SHEETVIEWS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
    private static final javax.xml.namespace.QName SHEETPROTECTION$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
    private static final javax.xml.namespace.QName CUSTOMSHEETVIEWS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
    private static final javax.xml.namespace.QName PAGEMARGINS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName DRAWING$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
    private static final javax.xml.namespace.QName LEGACYDRAWING$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
    private static final javax.xml.namespace.QName LEGACYDRAWINGHF$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
    private static final javax.xml.namespace.QName PICTURE$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture");
    private static final javax.xml.namespace.QName WEBPUBLISHITEMS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItems");
    private static final javax.xml.namespace.QName EXTLST$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "sheetPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr getSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr)get_store().find_element_user(SHEETPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetPr" element
     */
    public boolean isSetSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sheetPr" element
     */
    public void setSheetPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr sheetPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr)get_store().find_element_user(SHEETPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr)get_store().add_element_user(SHEETPR$0);
            }
            target.set(sheetPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr addNewSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr)get_store().add_element_user(SHEETPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetPr" element
     */
    public void unsetSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETPR$0, 0);
        }
    }
    
    /**
     * Gets the "sheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews getSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews)get_store().find_element_user(SHEETVIEWS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sheetViews" element
     */
    public void setSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews sheetViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews)get_store().find_element_user(SHEETVIEWS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews)get_store().add_element_user(SHEETVIEWS$2);
            }
            target.set(sheetViews);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews addNewSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews)get_store().add_element_user(SHEETVIEWS$2);
            return target;
        }
    }
    
    /**
     * Gets the "sheetProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection getSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection)get_store().find_element_user(SHEETPROTECTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetProtection" element
     */
    public boolean isSetSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETPROTECTION$4) != 0;
        }
    }
    
    /**
     * Sets the "sheetProtection" element
     */
    public void setSheetProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection sheetProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection)get_store().find_element_user(SHEETPROTECTION$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection)get_store().add_element_user(SHEETPROTECTION$4);
            }
            target.set(sheetProtection);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection addNewSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection)get_store().add_element_user(SHEETPROTECTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetProtection" element
     */
    public void unsetSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETPROTECTION$4, 0);
        }
    }
    
    /**
     * Gets the "customSheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews getCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customSheetViews" element
     */
    public boolean isSetCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMSHEETVIEWS$6) != 0;
        }
    }
    
    /**
     * Sets the "customSheetViews" element
     */
    public void setCustomSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews customSheetViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$6);
            }
            target.set(customSheetViews);
        }
    }
    
    /**
     * Appends and returns a new empty "customSheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews addNewCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "customSheetViews" element
     */
    public void unsetCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMSHEETVIEWS$6, 0);
        }
    }
    
    /**
     * Gets the "pageMargins" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins getPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageMargins" element
     */
    public boolean isSetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEMARGINS$8) != 0;
        }
    }
    
    /**
     * Sets the "pageMargins" element
     */
    public void setPageMargins(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins pageMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$8);
            }
            target.set(pageMargins);
        }
    }
    
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins addNewPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "pageMargins" element
     */
    public void unsetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEMARGINS$8, 0);
        }
    }
    
    /**
     * Gets the "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup getPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().find_element_user(PAGESETUP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageSetup" element
     */
    public boolean isSetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESETUP$10) != 0;
        }
    }
    
    /**
     * Sets the "pageSetup" element
     */
    public void setPageSetup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup pageSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().find_element_user(PAGESETUP$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().add_element_user(PAGESETUP$10);
            }
            target.set(pageSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup addNewPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup)get_store().add_element_user(PAGESETUP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pageSetup" element
     */
    public void unsetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESETUP$10, 0);
        }
    }
    
    /**
     * Gets the "headerFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter getHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "headerFooter" element
     */
    public boolean isSetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERFOOTER$12) != 0;
        }
    }
    
    /**
     * Sets the "headerFooter" element
     */
    public void setHeaderFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter headerFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$12);
            }
            target.set(headerFooter);
        }
    }
    
    /**
     * Appends and returns a new empty "headerFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter addNewHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "headerFooter" element
     */
    public void unsetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERFOOTER$12, 0);
        }
    }
    
    /**
     * Gets the "drawing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing getDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "drawing" element
     */
    public void setDrawing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing drawing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$14);
            }
            target.set(drawing);
        }
    }
    
    /**
     * Appends and returns a new empty "drawing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing addNewDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$14);
            return target;
        }
    }
    
    /**
     * Gets the "legacyDrawing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing getLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legacyDrawing" element
     */
    public boolean isSetLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGACYDRAWING$16) != 0;
        }
    }
    
    /**
     * Sets the "legacyDrawing" element
     */
    public void setLegacyDrawing(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing legacyDrawing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$16);
            }
            target.set(legacyDrawing);
        }
    }
    
    /**
     * Appends and returns a new empty "legacyDrawing" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing addNewLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$16);
            return target;
        }
    }
    
    /**
     * Unsets the "legacyDrawing" element
     */
    public void unsetLegacyDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGACYDRAWING$16, 0);
        }
    }
    
    /**
     * Gets the "legacyDrawingHF" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing getLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legacyDrawingHF" element
     */
    public boolean isSetLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGACYDRAWINGHF$18) != 0;
        }
    }
    
    /**
     * Sets the "legacyDrawingHF" element
     */
    public void setLegacyDrawingHF(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing legacyDrawingHF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$18);
            }
            target.set(legacyDrawingHF);
        }
    }
    
    /**
     * Appends and returns a new empty "legacyDrawingHF" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing addNewLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$18);
            return target;
        }
    }
    
    /**
     * Unsets the "legacyDrawingHF" element
     */
    public void unsetLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGACYDRAWINGHF$18, 0);
        }
    }
    
    /**
     * Gets the "picture" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture getPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "picture" element
     */
    public boolean isSetPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTURE$20) != 0;
        }
    }
    
    /**
     * Sets the "picture" element
     */
    public void setPicture(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$20);
            }
            target.set(picture);
        }
    }
    
    /**
     * Appends and returns a new empty "picture" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture addNewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "picture" element
     */
    public void unsetPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTURE$20, 0);
        }
    }
    
    /**
     * Gets the "webPublishItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems getWebPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().find_element_user(WEBPUBLISHITEMS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webPublishItems" element
     */
    public boolean isSetWebPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPUBLISHITEMS$22) != 0;
        }
    }
    
    /**
     * Sets the "webPublishItems" element
     */
    public void setWebPublishItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems webPublishItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().find_element_user(WEBPUBLISHITEMS$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().add_element_user(WEBPUBLISHITEMS$22);
            }
            target.set(webPublishItems);
        }
    }
    
    /**
     * Appends and returns a new empty "webPublishItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems addNewWebPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().add_element_user(WEBPUBLISHITEMS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "webPublishItems" element
     */
    public void unsetWebPublishItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPUBLISHITEMS$22, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$24, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$24);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$24);
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
