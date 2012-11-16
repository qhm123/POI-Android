/*
 * XML Type:  CT_Stylesheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Stylesheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTStylesheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet
{
    
    public CTStylesheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMFMTS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmts");
    private static final javax.xml.namespace.QName FONTS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fonts");
    private static final javax.xml.namespace.QName FILLS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fills");
    private static final javax.xml.namespace.QName BORDERS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "borders");
    private static final javax.xml.namespace.QName CELLSTYLEXFS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyleXfs");
    private static final javax.xml.namespace.QName CELLXFS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellXfs");
    private static final javax.xml.namespace.QName CELLSTYLES$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyles");
    private static final javax.xml.namespace.QName DXFS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dxfs");
    private static final javax.xml.namespace.QName TABLESTYLES$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyles");
    private static final javax.xml.namespace.QName COLORS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colors");
    private static final javax.xml.namespace.QName EXTLST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "numFmts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts getNumFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().find_element_user(NUMFMTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numFmts" element
     */
    public boolean isSetNumFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMFMTS$0) != 0;
        }
    }
    
    /**
     * Sets the "numFmts" element
     */
    public void setNumFmts(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts numFmts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().find_element_user(NUMFMTS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().add_element_user(NUMFMTS$0);
            }
            target.set(numFmts);
        }
    }
    
    /**
     * Appends and returns a new empty "numFmts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts addNewNumFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts)get_store().add_element_user(NUMFMTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "numFmts" element
     */
    public void unsetNumFmts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMFMTS$0, 0);
        }
    }
    
    /**
     * Gets the "fonts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts getFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().find_element_user(FONTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fonts" element
     */
    public boolean isSetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FONTS$2) != 0;
        }
    }
    
    /**
     * Sets the "fonts" element
     */
    public void setFonts(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts fonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().find_element_user(FONTS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().add_element_user(FONTS$2);
            }
            target.set(fonts);
        }
    }
    
    /**
     * Appends and returns a new empty "fonts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts addNewFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts)get_store().add_element_user(FONTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fonts" element
     */
    public void unsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FONTS$2, 0);
        }
    }
    
    /**
     * Gets the "fills" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills getFills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills)get_store().find_element_user(FILLS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fills" element
     */
    public boolean isSetFills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLS$4) != 0;
        }
    }
    
    /**
     * Sets the "fills" element
     */
    public void setFills(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills fills)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills)get_store().find_element_user(FILLS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills)get_store().add_element_user(FILLS$4);
            }
            target.set(fills);
        }
    }
    
    /**
     * Appends and returns a new empty "fills" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills addNewFills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills)get_store().add_element_user(FILLS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fills" element
     */
    public void unsetFills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLS$4, 0);
        }
    }
    
    /**
     * Gets the "borders" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders getBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders)get_store().find_element_user(BORDERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "borders" element
     */
    public boolean isSetBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERS$6) != 0;
        }
    }
    
    /**
     * Sets the "borders" element
     */
    public void setBorders(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders borders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders)get_store().find_element_user(BORDERS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders)get_store().add_element_user(BORDERS$6);
            }
            target.set(borders);
        }
    }
    
    /**
     * Appends and returns a new empty "borders" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders addNewBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders)get_store().add_element_user(BORDERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "borders" element
     */
    public void unsetBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERS$6, 0);
        }
    }
    
    /**
     * Gets the "cellStyleXfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs getCellStyleXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs)get_store().find_element_user(CELLSTYLEXFS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellStyleXfs" element
     */
    public boolean isSetCellStyleXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSTYLEXFS$8) != 0;
        }
    }
    
    /**
     * Sets the "cellStyleXfs" element
     */
    public void setCellStyleXfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs cellStyleXfs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs)get_store().find_element_user(CELLSTYLEXFS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs)get_store().add_element_user(CELLSTYLEXFS$8);
            }
            target.set(cellStyleXfs);
        }
    }
    
    /**
     * Appends and returns a new empty "cellStyleXfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs addNewCellStyleXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs)get_store().add_element_user(CELLSTYLEXFS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "cellStyleXfs" element
     */
    public void unsetCellStyleXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSTYLEXFS$8, 0);
        }
    }
    
    /**
     * Gets the "cellXfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs getCellXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs)get_store().find_element_user(CELLXFS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellXfs" element
     */
    public boolean isSetCellXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLXFS$10) != 0;
        }
    }
    
    /**
     * Sets the "cellXfs" element
     */
    public void setCellXfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs cellXfs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs)get_store().find_element_user(CELLXFS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs)get_store().add_element_user(CELLXFS$10);
            }
            target.set(cellXfs);
        }
    }
    
    /**
     * Appends and returns a new empty "cellXfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs addNewCellXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs)get_store().add_element_user(CELLXFS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "cellXfs" element
     */
    public void unsetCellXfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLXFS$10, 0);
        }
    }
    
    /**
     * Gets the "cellStyles" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles getCellStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles)get_store().find_element_user(CELLSTYLES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellStyles" element
     */
    public boolean isSetCellStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLSTYLES$12) != 0;
        }
    }
    
    /**
     * Sets the "cellStyles" element
     */
    public void setCellStyles(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles cellStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles)get_store().find_element_user(CELLSTYLES$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles)get_store().add_element_user(CELLSTYLES$12);
            }
            target.set(cellStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "cellStyles" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles addNewCellStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles)get_store().add_element_user(CELLSTYLES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "cellStyles" element
     */
    public void unsetCellStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLSTYLES$12, 0);
        }
    }
    
    /**
     * Gets the "dxfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs getDxfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs)get_store().find_element_user(DXFS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dxfs" element
     */
    public boolean isSetDxfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DXFS$14) != 0;
        }
    }
    
    /**
     * Sets the "dxfs" element
     */
    public void setDxfs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs dxfs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs)get_store().find_element_user(DXFS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs)get_store().add_element_user(DXFS$14);
            }
            target.set(dxfs);
        }
    }
    
    /**
     * Appends and returns a new empty "dxfs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs addNewDxfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs)get_store().add_element_user(DXFS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "dxfs" element
     */
    public void unsetDxfs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DXFS$14, 0);
        }
    }
    
    /**
     * Gets the "tableStyles" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles getTableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles)get_store().find_element_user(TABLESTYLES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tableStyles" element
     */
    public boolean isSetTableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLES$16) != 0;
        }
    }
    
    /**
     * Sets the "tableStyles" element
     */
    public void setTableStyles(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles tableStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles)get_store().find_element_user(TABLESTYLES$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles)get_store().add_element_user(TABLESTYLES$16);
            }
            target.set(tableStyles);
        }
    }
    
    /**
     * Appends and returns a new empty "tableStyles" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles addNewTableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles)get_store().add_element_user(TABLESTYLES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "tableStyles" element
     */
    public void unsetTableStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLES$16, 0);
        }
    }
    
    /**
     * Gets the "colors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors getColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors)get_store().find_element_user(COLORS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colors" element
     */
    public boolean isSetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORS$18) != 0;
        }
    }
    
    /**
     * Sets the "colors" element
     */
    public void setColors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors colors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors)get_store().find_element_user(COLORS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors)get_store().add_element_user(COLORS$18);
            }
            target.set(colors);
        }
    }
    
    /**
     * Appends and returns a new empty "colors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors addNewColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors)get_store().add_element_user(COLORS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "colors" element
     */
    public void unsetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORS$18, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
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
            return get_store().count_elements(EXTLST$20) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$20);
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
            get_store().remove_element(EXTLST$20, 0);
        }
    }
}
