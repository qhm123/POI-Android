/*
 * XML Type:  CT_Dialogsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Dialogsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDialogsheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet
{
    
    public CTDialogsheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
    private static final javax.xml.namespace.QName SHEETVIEWS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
    private static final javax.xml.namespace.QName SHEETFORMATPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetFormatPr");
    private static final javax.xml.namespace.QName SHEETPROTECTION$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
    private static final javax.xml.namespace.QName CUSTOMSHEETVIEWS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
    private static final javax.xml.namespace.QName PRINTOPTIONS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
    private static final javax.xml.namespace.QName PAGEMARGINS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName DRAWING$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
    private static final javax.xml.namespace.QName LEGACYDRAWING$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
    private static final javax.xml.namespace.QName LEGACYDRAWINGHF$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
    private static final javax.xml.namespace.QName OLEOBJECTS$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects");
    private static final javax.xml.namespace.QName EXTLST$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "sheetPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr getSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().find_element_user(SHEETPR$0, 0);
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
    public void setSheetPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr sheetPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().find_element_user(SHEETPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().add_element_user(SHEETPR$0);
            }
            target.set(sheetPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr addNewSheetPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr)get_store().add_element_user(SHEETPR$0);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews getSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().find_element_user(SHEETVIEWS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetViews" element
     */
    public boolean isSetSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETVIEWS$2) != 0;
        }
    }
    
    /**
     * Sets the "sheetViews" element
     */
    public void setSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews sheetViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().find_element_user(SHEETVIEWS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().add_element_user(SHEETVIEWS$2);
            }
            target.set(sheetViews);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews addNewSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().add_element_user(SHEETVIEWS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetViews" element
     */
    public void unsetSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETVIEWS$2, 0);
        }
    }
    
    /**
     * Gets the "sheetFormatPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr getSheetFormatPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().find_element_user(SHEETFORMATPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetFormatPr" element
     */
    public boolean isSetSheetFormatPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETFORMATPR$4) != 0;
        }
    }
    
    /**
     * Sets the "sheetFormatPr" element
     */
    public void setSheetFormatPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr sheetFormatPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().find_element_user(SHEETFORMATPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().add_element_user(SHEETFORMATPR$4);
            }
            target.set(sheetFormatPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetFormatPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr addNewSheetFormatPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().add_element_user(SHEETFORMATPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetFormatPr" element
     */
    public void unsetSheetFormatPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETFORMATPR$4, 0);
        }
    }
    
    /**
     * Gets the "sheetProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection getSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$6, 0);
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
            return get_store().count_elements(SHEETPROTECTION$6) != 0;
        }
    }
    
    /**
     * Sets the "sheetProtection" element
     */
    public void setSheetProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection sheetProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$6);
            }
            target.set(sheetProtection);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetProtection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection addNewSheetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$6);
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
            get_store().remove_element(SHEETPROTECTION$6, 0);
        }
    }
    
    /**
     * Gets the "customSheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews getCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$8, 0);
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
            return get_store().count_elements(CUSTOMSHEETVIEWS$8) != 0;
        }
    }
    
    /**
     * Sets the "customSheetViews" element
     */
    public void setCustomSheetViews(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews customSheetViews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$8);
            }
            target.set(customSheetViews);
        }
    }
    
    /**
     * Appends and returns a new empty "customSheetViews" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews addNewCustomSheetViews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$8);
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
            get_store().remove_element(CUSTOMSHEETVIEWS$8, 0);
        }
    }
    
    /**
     * Gets the "printOptions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions getPrintOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printOptions" element
     */
    public boolean isSetPrintOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTOPTIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "printOptions" element
     */
    public void setPrintOptions(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions printOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$10);
            }
            target.set(printOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "printOptions" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions addNewPrintOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "printOptions" element
     */
    public void unsetPrintOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTOPTIONS$10, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$12, 0);
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
            return get_store().count_elements(PAGEMARGINS$12) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$12);
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
            get_store().remove_element(PAGEMARGINS$12, 0);
        }
    }
    
    /**
     * Gets the "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup getPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$14, 0);
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
            return get_store().count_elements(PAGESETUP$14) != 0;
        }
    }
    
    /**
     * Sets the "pageSetup" element
     */
    public void setPageSetup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup pageSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$14);
            }
            target.set(pageSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup addNewPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$14);
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
            get_store().remove_element(PAGESETUP$14, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$16, 0);
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
            return get_store().count_elements(HEADERFOOTER$16) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$16);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$16);
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
            get_store().remove_element(HEADERFOOTER$16, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "drawing" element
     */
    public boolean isSetDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWING$18) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$18);
            return target;
        }
    }
    
    /**
     * Unsets the "drawing" element
     */
    public void unsetDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWING$18, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$20, 0);
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
            return get_store().count_elements(LEGACYDRAWING$20) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$20);
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
            get_store().remove_element(LEGACYDRAWING$20, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$22, 0);
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
            return get_store().count_elements(LEGACYDRAWINGHF$22) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$22);
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
            get_store().remove_element(LEGACYDRAWINGHF$22, 0);
        }
    }
    
    /**
     * Gets the "oleObjects" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects getOleObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oleObjects" element
     */
    public boolean isSetOleObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLEOBJECTS$24) != 0;
        }
    }
    
    /**
     * Sets the "oleObjects" element
     */
    public void setOleObjects(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects oleObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$24);
            }
            target.set(oleObjects);
        }
    }
    
    /**
     * Appends and returns a new empty "oleObjects" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects addNewOleObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "oleObjects" element
     */
    public void unsetOleObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLEOBJECTS$24, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$26, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$26);
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
