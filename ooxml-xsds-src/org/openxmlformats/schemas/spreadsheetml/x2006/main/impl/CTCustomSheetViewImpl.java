/*
 * XML Type:  CT_CustomSheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomSheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomSheetViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetView
{
    
    public CTCustomSheetViewImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PANE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pane");
    private static final javax.xml.namespace.QName SELECTION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "selection");
    private static final javax.xml.namespace.QName ROWBREAKS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowBreaks");
    private static final javax.xml.namespace.QName COLBREAKS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colBreaks");
    private static final javax.xml.namespace.QName PAGEMARGINS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PRINTOPTIONS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
    private static final javax.xml.namespace.QName PAGESETUP$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName AUTOFILTER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
    private static final javax.xml.namespace.QName EXTLST$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName GUID$20 = 
        new javax.xml.namespace.QName("", "guid");
    private static final javax.xml.namespace.QName SCALE$22 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName COLORID$24 = 
        new javax.xml.namespace.QName("", "colorId");
    private static final javax.xml.namespace.QName SHOWPAGEBREAKS$26 = 
        new javax.xml.namespace.QName("", "showPageBreaks");
    private static final javax.xml.namespace.QName SHOWFORMULAS$28 = 
        new javax.xml.namespace.QName("", "showFormulas");
    private static final javax.xml.namespace.QName SHOWGRIDLINES$30 = 
        new javax.xml.namespace.QName("", "showGridLines");
    private static final javax.xml.namespace.QName SHOWROWCOL$32 = 
        new javax.xml.namespace.QName("", "showRowCol");
    private static final javax.xml.namespace.QName OUTLINESYMBOLS$34 = 
        new javax.xml.namespace.QName("", "outlineSymbols");
    private static final javax.xml.namespace.QName ZEROVALUES$36 = 
        new javax.xml.namespace.QName("", "zeroValues");
    private static final javax.xml.namespace.QName FITTOPAGE$38 = 
        new javax.xml.namespace.QName("", "fitToPage");
    private static final javax.xml.namespace.QName PRINTAREA$40 = 
        new javax.xml.namespace.QName("", "printArea");
    private static final javax.xml.namespace.QName FILTER$42 = 
        new javax.xml.namespace.QName("", "filter");
    private static final javax.xml.namespace.QName SHOWAUTOFILTER$44 = 
        new javax.xml.namespace.QName("", "showAutoFilter");
    private static final javax.xml.namespace.QName HIDDENROWS$46 = 
        new javax.xml.namespace.QName("", "hiddenRows");
    private static final javax.xml.namespace.QName HIDDENCOLUMNS$48 = 
        new javax.xml.namespace.QName("", "hiddenColumns");
    private static final javax.xml.namespace.QName STATE$50 = 
        new javax.xml.namespace.QName("", "state");
    private static final javax.xml.namespace.QName FILTERUNIQUE$52 = 
        new javax.xml.namespace.QName("", "filterUnique");
    private static final javax.xml.namespace.QName VIEW$54 = 
        new javax.xml.namespace.QName("", "view");
    private static final javax.xml.namespace.QName SHOWRULER$56 = 
        new javax.xml.namespace.QName("", "showRuler");
    private static final javax.xml.namespace.QName TOPLEFTCELL$58 = 
        new javax.xml.namespace.QName("", "topLeftCell");
    
    
    /**
     * Gets the "pane" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane getPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().find_element_user(PANE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pane" element
     */
    public boolean isSetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PANE$0) != 0;
        }
    }
    
    /**
     * Sets the "pane" element
     */
    public void setPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane pane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().find_element_user(PANE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().add_element_user(PANE$0);
            }
            target.set(pane);
        }
    }
    
    /**
     * Appends and returns a new empty "pane" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane addNewPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane)get_store().add_element_user(PANE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pane" element
     */
    public void unsetPane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PANE$0, 0);
        }
    }
    
    /**
     * Gets the "selection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection getSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().find_element_user(SELECTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "selection" element
     */
    public boolean isSetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECTION$2) != 0;
        }
    }
    
    /**
     * Sets the "selection" element
     */
    public void setSelection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection selection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().find_element_user(SELECTION$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().add_element_user(SELECTION$2);
            }
            target.set(selection);
        }
    }
    
    /**
     * Appends and returns a new empty "selection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection addNewSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection)get_store().add_element_user(SELECTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "selection" element
     */
    public void unsetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECTION$2, 0);
        }
    }
    
    /**
     * Gets the "rowBreaks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak getRowBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rowBreaks" element
     */
    public boolean isSetRowBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWBREAKS$4) != 0;
        }
    }
    
    /**
     * Sets the "rowBreaks" element
     */
    public void setRowBreaks(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak rowBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$4);
            }
            target.set(rowBreaks);
        }
    }
    
    /**
     * Appends and returns a new empty "rowBreaks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak addNewRowBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rowBreaks" element
     */
    public void unsetRowBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWBREAKS$4, 0);
        }
    }
    
    /**
     * Gets the "colBreaks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak getColBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colBreaks" element
     */
    public boolean isSetColBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLBREAKS$6) != 0;
        }
    }
    
    /**
     * Sets the "colBreaks" element
     */
    public void setColBreaks(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak colBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$6);
            }
            target.set(colBreaks);
        }
    }
    
    /**
     * Appends and returns a new empty "colBreaks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak addNewColBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "colBreaks" element
     */
    public void unsetColBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLBREAKS$6, 0);
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
     * Gets the "pageSetup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup getPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$12, 0);
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
            return get_store().count_elements(PAGESETUP$12) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$12);
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
            get_store().remove_element(PAGESETUP$12, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$14, 0);
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
            return get_store().count_elements(HEADERFOOTER$14) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$14);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$14);
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
            get_store().remove_element(HEADERFOOTER$14, 0);
        }
    }
    
    /**
     * Gets the "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoFilter" element
     */
    public boolean isSetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFILTER$16) != 0;
        }
    }
    
    /**
     * Sets the "autoFilter" element
     */
    public void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$16);
            }
            target.set(autoFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "autoFilter" element
     */
    public void unsetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFILTER$16, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
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
            return get_store().count_elements(EXTLST$18) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$18);
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
            get_store().remove_element(EXTLST$18, 0);
        }
    }
    
    /**
     * Gets the "guid" attribute
     */
    public java.lang.String getGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$20);
            return target;
        }
    }
    
    /**
     * Sets the "guid" attribute
     */
    public void setGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GUID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GUID$20);
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    public void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().find_attribute_user(GUID$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid)get_store().add_attribute_user(GUID$20);
            }
            target.set(guid);
        }
    }
    
    /**
     * Gets the "scale" attribute
     */
    public long getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALE$22);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(SCALE$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$22) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(long scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$22);
            }
            target.setLongValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlUnsignedInt scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SCALE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SCALE$22);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$22);
        }
    }
    
    /**
     * Gets the "colorId" attribute
     */
    public long getColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLORID$24);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "colorId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLORID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COLORID$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "colorId" attribute
     */
    public boolean isSetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLORID$24) != null;
        }
    }
    
    /**
     * Sets the "colorId" attribute
     */
    public void setColorId(long colorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLORID$24);
            }
            target.setLongValue(colorId);
        }
    }
    
    /**
     * Sets (as xml) the "colorId" attribute
     */
    public void xsetColorId(org.apache.xmlbeans.XmlUnsignedInt colorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COLORID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COLORID$24);
            }
            target.set(colorId);
        }
    }
    
    /**
     * Unsets the "colorId" attribute
     */
    public void unsetColorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLORID$24);
        }
    }
    
    /**
     * Gets the "showPageBreaks" attribute
     */
    public boolean getShowPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPAGEBREAKS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWPAGEBREAKS$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showPageBreaks" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPAGEBREAKS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWPAGEBREAKS$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "showPageBreaks" attribute
     */
    public boolean isSetShowPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWPAGEBREAKS$26) != null;
        }
    }
    
    /**
     * Sets the "showPageBreaks" attribute
     */
    public void setShowPageBreaks(boolean showPageBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPAGEBREAKS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWPAGEBREAKS$26);
            }
            target.setBooleanValue(showPageBreaks);
        }
    }
    
    /**
     * Sets (as xml) the "showPageBreaks" attribute
     */
    public void xsetShowPageBreaks(org.apache.xmlbeans.XmlBoolean showPageBreaks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPAGEBREAKS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWPAGEBREAKS$26);
            }
            target.set(showPageBreaks);
        }
    }
    
    /**
     * Unsets the "showPageBreaks" attribute
     */
    public void unsetShowPageBreaks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWPAGEBREAKS$26);
        }
    }
    
    /**
     * Gets the "showFormulas" attribute
     */
    public boolean getShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULAS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWFORMULAS$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showFormulas" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULAS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWFORMULAS$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "showFormulas" attribute
     */
    public boolean isSetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWFORMULAS$28) != null;
        }
    }
    
    /**
     * Sets the "showFormulas" attribute
     */
    public void setShowFormulas(boolean showFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFORMULAS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWFORMULAS$28);
            }
            target.setBooleanValue(showFormulas);
        }
    }
    
    /**
     * Sets (as xml) the "showFormulas" attribute
     */
    public void xsetShowFormulas(org.apache.xmlbeans.XmlBoolean showFormulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFORMULAS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWFORMULAS$28);
            }
            target.set(showFormulas);
        }
    }
    
    /**
     * Unsets the "showFormulas" attribute
     */
    public void unsetShowFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWFORMULAS$28);
        }
    }
    
    /**
     * Gets the "showGridLines" attribute
     */
    public boolean getShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGRIDLINES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWGRIDLINES$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showGridLines" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGRIDLINES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWGRIDLINES$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "showGridLines" attribute
     */
    public boolean isSetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWGRIDLINES$30) != null;
        }
    }
    
    /**
     * Sets the "showGridLines" attribute
     */
    public void setShowGridLines(boolean showGridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWGRIDLINES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWGRIDLINES$30);
            }
            target.setBooleanValue(showGridLines);
        }
    }
    
    /**
     * Sets (as xml) the "showGridLines" attribute
     */
    public void xsetShowGridLines(org.apache.xmlbeans.XmlBoolean showGridLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWGRIDLINES$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWGRIDLINES$30);
            }
            target.set(showGridLines);
        }
    }
    
    /**
     * Unsets the "showGridLines" attribute
     */
    public void unsetShowGridLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWGRIDLINES$30);
        }
    }
    
    /**
     * Gets the "showRowCol" attribute
     */
    public boolean getShowRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWROWCOL$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRowCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWROWCOL$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "showRowCol" attribute
     */
    public boolean isSetShowRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWROWCOL$32) != null;
        }
    }
    
    /**
     * Sets the "showRowCol" attribute
     */
    public void setShowRowCol(boolean showRowCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWROWCOL$32);
            }
            target.setBooleanValue(showRowCol);
        }
    }
    
    /**
     * Sets (as xml) the "showRowCol" attribute
     */
    public void xsetShowRowCol(org.apache.xmlbeans.XmlBoolean showRowCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWROWCOL$32);
            }
            target.set(showRowCol);
        }
    }
    
    /**
     * Unsets the "showRowCol" attribute
     */
    public void unsetShowRowCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWROWCOL$32);
        }
    }
    
    /**
     * Gets the "outlineSymbols" attribute
     */
    public boolean getOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINESYMBOLS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINESYMBOLS$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineSymbols" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINESYMBOLS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINESYMBOLS$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineSymbols" attribute
     */
    public boolean isSetOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINESYMBOLS$34) != null;
        }
    }
    
    /**
     * Sets the "outlineSymbols" attribute
     */
    public void setOutlineSymbols(boolean outlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINESYMBOLS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINESYMBOLS$34);
            }
            target.setBooleanValue(outlineSymbols);
        }
    }
    
    /**
     * Sets (as xml) the "outlineSymbols" attribute
     */
    public void xsetOutlineSymbols(org.apache.xmlbeans.XmlBoolean outlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINESYMBOLS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINESYMBOLS$34);
            }
            target.set(outlineSymbols);
        }
    }
    
    /**
     * Unsets the "outlineSymbols" attribute
     */
    public void unsetOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINESYMBOLS$34);
        }
    }
    
    /**
     * Gets the "zeroValues" attribute
     */
    public boolean getZeroValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZEROVALUES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZEROVALUES$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "zeroValues" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetZeroValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZEROVALUES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ZEROVALUES$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "zeroValues" attribute
     */
    public boolean isSetZeroValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZEROVALUES$36) != null;
        }
    }
    
    /**
     * Sets the "zeroValues" attribute
     */
    public void setZeroValues(boolean zeroValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZEROVALUES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZEROVALUES$36);
            }
            target.setBooleanValue(zeroValues);
        }
    }
    
    /**
     * Sets (as xml) the "zeroValues" attribute
     */
    public void xsetZeroValues(org.apache.xmlbeans.XmlBoolean zeroValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ZEROVALUES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ZEROVALUES$36);
            }
            target.set(zeroValues);
        }
    }
    
    /**
     * Unsets the "zeroValues" attribute
     */
    public void unsetZeroValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZEROVALUES$36);
        }
    }
    
    /**
     * Gets the "fitToPage" attribute
     */
    public boolean getFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOPAGE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FITTOPAGE$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitToPage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FITTOPAGE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FITTOPAGE$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "fitToPage" attribute
     */
    public boolean isSetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITTOPAGE$38) != null;
        }
    }
    
    /**
     * Sets the "fitToPage" attribute
     */
    public void setFitToPage(boolean fitToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITTOPAGE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITTOPAGE$38);
            }
            target.setBooleanValue(fitToPage);
        }
    }
    
    /**
     * Sets (as xml) the "fitToPage" attribute
     */
    public void xsetFitToPage(org.apache.xmlbeans.XmlBoolean fitToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FITTOPAGE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FITTOPAGE$38);
            }
            target.set(fitToPage);
        }
    }
    
    /**
     * Unsets the "fitToPage" attribute
     */
    public void unsetFitToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITTOPAGE$38);
        }
    }
    
    /**
     * Gets the "printArea" attribute
     */
    public boolean getPrintArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINTAREA$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRINTAREA$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "printArea" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrintArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRINTAREA$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRINTAREA$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "printArea" attribute
     */
    public boolean isSetPrintArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRINTAREA$40) != null;
        }
    }
    
    /**
     * Sets the "printArea" attribute
     */
    public void setPrintArea(boolean printArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINTAREA$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRINTAREA$40);
            }
            target.setBooleanValue(printArea);
        }
    }
    
    /**
     * Sets (as xml) the "printArea" attribute
     */
    public void xsetPrintArea(org.apache.xmlbeans.XmlBoolean printArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRINTAREA$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRINTAREA$40);
            }
            target.set(printArea);
        }
    }
    
    /**
     * Unsets the "printArea" attribute
     */
    public void unsetPrintArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRINTAREA$40);
        }
    }
    
    /**
     * Gets the "filter" attribute
     */
    public boolean getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTER$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "filter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FILTER$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "filter" attribute
     */
    public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTER$42) != null;
        }
    }
    
    /**
     * Sets the "filter" attribute
     */
    public void setFilter(boolean filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTER$42);
            }
            target.setBooleanValue(filter);
        }
    }
    
    /**
     * Sets (as xml) the "filter" attribute
     */
    public void xsetFilter(org.apache.xmlbeans.XmlBoolean filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTER$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILTER$42);
            }
            target.set(filter);
        }
    }
    
    /**
     * Unsets the "filter" attribute
     */
    public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTER$42);
        }
    }
    
    /**
     * Gets the "showAutoFilter" attribute
     */
    public boolean getShowAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWAUTOFILTER$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWAUTOFILTER$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAutoFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWAUTOFILTER$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWAUTOFILTER$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAutoFilter" attribute
     */
    public boolean isSetShowAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWAUTOFILTER$44) != null;
        }
    }
    
    /**
     * Sets the "showAutoFilter" attribute
     */
    public void setShowAutoFilter(boolean showAutoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWAUTOFILTER$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWAUTOFILTER$44);
            }
            target.setBooleanValue(showAutoFilter);
        }
    }
    
    /**
     * Sets (as xml) the "showAutoFilter" attribute
     */
    public void xsetShowAutoFilter(org.apache.xmlbeans.XmlBoolean showAutoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWAUTOFILTER$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWAUTOFILTER$44);
            }
            target.set(showAutoFilter);
        }
    }
    
    /**
     * Unsets the "showAutoFilter" attribute
     */
    public void unsetShowAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWAUTOFILTER$44);
        }
    }
    
    /**
     * Gets the "hiddenRows" attribute
     */
    public boolean getHiddenRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENROWS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENROWS$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenRows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENROWS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENROWS$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenRows" attribute
     */
    public boolean isSetHiddenRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENROWS$46) != null;
        }
    }
    
    /**
     * Sets the "hiddenRows" attribute
     */
    public void setHiddenRows(boolean hiddenRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENROWS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENROWS$46);
            }
            target.setBooleanValue(hiddenRows);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenRows" attribute
     */
    public void xsetHiddenRows(org.apache.xmlbeans.XmlBoolean hiddenRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENROWS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENROWS$46);
            }
            target.set(hiddenRows);
        }
    }
    
    /**
     * Unsets the "hiddenRows" attribute
     */
    public void unsetHiddenRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENROWS$46);
        }
    }
    
    /**
     * Gets the "hiddenColumns" attribute
     */
    public boolean getHiddenColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENCOLUMNS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENCOLUMNS$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenColumns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENCOLUMNS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENCOLUMNS$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenColumns" attribute
     */
    public boolean isSetHiddenColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENCOLUMNS$48) != null;
        }
    }
    
    /**
     * Sets the "hiddenColumns" attribute
     */
    public void setHiddenColumns(boolean hiddenColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENCOLUMNS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENCOLUMNS$48);
            }
            target.setBooleanValue(hiddenColumns);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenColumns" attribute
     */
    public void xsetHiddenColumns(org.apache.xmlbeans.XmlBoolean hiddenColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENCOLUMNS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENCOLUMNS$48);
            }
            target.set(hiddenColumns);
        }
    }
    
    /**
     * Unsets the "hiddenColumns" attribute
     */
    public void unsetHiddenColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENCOLUMNS$48);
        }
    }
    
    /**
     * Gets the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATE$50);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().find_attribute_user(STATE$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_default_attribute_value(STATE$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "state" attribute
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATE$50) != null;
        }
    }
    
    /**
     * Sets the "state" attribute
     */
    public void setState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$50);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" attribute
     */
    public void xsetState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().find_attribute_user(STATE$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState)get_store().add_attribute_user(STATE$50);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "state" attribute
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATE$50);
        }
    }
    
    /**
     * Gets the "filterUnique" attribute
     */
    public boolean getFilterUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERUNIQUE$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERUNIQUE$52);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "filterUnique" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFilterUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERUNIQUE$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FILTERUNIQUE$52);
            }
            return target;
        }
    }
    
    /**
     * True if has "filterUnique" attribute
     */
    public boolean isSetFilterUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTERUNIQUE$52) != null;
        }
    }
    
    /**
     * Sets the "filterUnique" attribute
     */
    public void setFilterUnique(boolean filterUnique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERUNIQUE$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERUNIQUE$52);
            }
            target.setBooleanValue(filterUnique);
        }
    }
    
    /**
     * Sets (as xml) the "filterUnique" attribute
     */
    public void xsetFilterUnique(org.apache.xmlbeans.XmlBoolean filterUnique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERUNIQUE$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILTERUNIQUE$52);
            }
            target.set(filterUnique);
        }
    }
    
    /**
     * Unsets the "filterUnique" attribute
     */
    public void unsetFilterUnique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTERUNIQUE$52);
        }
    }
    
    /**
     * Gets the "view" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum getView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEW$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VIEW$54);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "view" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType xgetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().find_attribute_user(VIEW$54);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_default_attribute_value(VIEW$54);
            }
            return target;
        }
    }
    
    /**
     * True if has "view" attribute
     */
    public boolean isSetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIEW$54) != null;
        }
    }
    
    /**
     * Sets the "view" attribute
     */
    public void setView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType.Enum view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEW$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEW$54);
            }
            target.setEnumValue(view);
        }
    }
    
    /**
     * Sets (as xml) the "view" attribute
     */
    public void xsetView(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().find_attribute_user(VIEW$54);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType)get_store().add_attribute_user(VIEW$54);
            }
            target.set(view);
        }
    }
    
    /**
     * Unsets the "view" attribute
     */
    public void unsetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIEW$54);
        }
    }
    
    /**
     * Gets the "showRuler" attribute
     */
    public boolean getShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRULER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWRULER$56);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRuler" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRULER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWRULER$56);
            }
            return target;
        }
    }
    
    /**
     * True if has "showRuler" attribute
     */
    public boolean isSetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWRULER$56) != null;
        }
    }
    
    /**
     * Sets the "showRuler" attribute
     */
    public void setShowRuler(boolean showRuler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWRULER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWRULER$56);
            }
            target.setBooleanValue(showRuler);
        }
    }
    
    /**
     * Sets (as xml) the "showRuler" attribute
     */
    public void xsetShowRuler(org.apache.xmlbeans.XmlBoolean showRuler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWRULER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWRULER$56);
            }
            target.set(showRuler);
        }
    }
    
    /**
     * Unsets the "showRuler" attribute
     */
    public void unsetShowRuler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWRULER$56);
        }
    }
    
    /**
     * Gets the "topLeftCell" attribute
     */
    public java.lang.String getTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topLeftCell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$58);
            return target;
        }
    }
    
    /**
     * True if has "topLeftCell" attribute
     */
    public boolean isSetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPLEFTCELL$58) != null;
        }
    }
    
    /**
     * Sets the "topLeftCell" attribute
     */
    public void setTopLeftCell(java.lang.String topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLEFTCELL$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPLEFTCELL$58);
            }
            target.setStringValue(topLeftCell);
        }
    }
    
    /**
     * Sets (as xml) the "topLeftCell" attribute
     */
    public void xsetTopLeftCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef topLeftCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(TOPLEFTCELL$58);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(TOPLEFTCELL$58);
            }
            target.set(topLeftCell);
        }
    }
    
    /**
     * Unsets the "topLeftCell" attribute
     */
    public void unsetTopLeftCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPLEFTCELL$58);
        }
    }
}
