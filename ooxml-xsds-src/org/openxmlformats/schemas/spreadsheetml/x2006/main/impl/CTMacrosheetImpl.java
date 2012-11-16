/*
 * XML Type:  CT_Macrosheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMacrosheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Macrosheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMacrosheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMacrosheet
{
    
    public CTMacrosheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
    private static final javax.xml.namespace.QName DIMENSION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimension");
    private static final javax.xml.namespace.QName SHEETVIEWS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
    private static final javax.xml.namespace.QName SHEETFORMATPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetFormatPr");
    private static final javax.xml.namespace.QName COLS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cols");
    private static final javax.xml.namespace.QName SHEETDATA$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetData");
    private static final javax.xml.namespace.QName SHEETPROTECTION$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
    private static final javax.xml.namespace.QName AUTOFILTER$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
    private static final javax.xml.namespace.QName SORTSTATE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
    private static final javax.xml.namespace.QName DATACONSOLIDATE$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataConsolidate");
    private static final javax.xml.namespace.QName CUSTOMSHEETVIEWS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
    private static final javax.xml.namespace.QName PHONETICPR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr");
    private static final javax.xml.namespace.QName CONDITIONALFORMATTING$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormatting");
    private static final javax.xml.namespace.QName PRINTOPTIONS$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
    private static final javax.xml.namespace.QName PAGEMARGINS$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName ROWBREAKS$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowBreaks");
    private static final javax.xml.namespace.QName COLBREAKS$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colBreaks");
    private static final javax.xml.namespace.QName CUSTOMPROPERTIES$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customProperties");
    private static final javax.xml.namespace.QName DRAWING$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
    private static final javax.xml.namespace.QName LEGACYDRAWING$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
    private static final javax.xml.namespace.QName LEGACYDRAWINGHF$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
    private static final javax.xml.namespace.QName PICTURE$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture");
    private static final javax.xml.namespace.QName OLEOBJECTS$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects");
    private static final javax.xml.namespace.QName EXTLST$50 = 
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
     * Gets the "dimension" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().find_element_user(DIMENSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dimension" element
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$2) != 0;
        }
    }
    
    /**
     * Sets the "dimension" element
     */
    public void setDimension(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().find_element_user(DIMENSION$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().add_element_user(DIMENSION$2);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Appends and returns a new empty "dimension" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension)get_store().add_element_user(DIMENSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dimension" element
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$2, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().find_element_user(SHEETVIEWS$4, 0);
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
            return get_store().count_elements(SHEETVIEWS$4) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().find_element_user(SHEETVIEWS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().add_element_user(SHEETVIEWS$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews)get_store().add_element_user(SHEETVIEWS$4);
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
            get_store().remove_element(SHEETVIEWS$4, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().find_element_user(SHEETFORMATPR$6, 0);
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
            return get_store().count_elements(SHEETFORMATPR$6) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().find_element_user(SHEETFORMATPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().add_element_user(SHEETFORMATPR$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr)get_store().add_element_user(SHEETFORMATPR$6);
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
            get_store().remove_element(SHEETFORMATPR$6, 0);
        }
    }
    
    /**
     * Gets a List of "cols" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols> getColsList()
    {
        final class ColsList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols get(int i)
                { return CTMacrosheetImpl.this.getColsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols old = CTMacrosheetImpl.this.getColsArray(i);
                CTMacrosheetImpl.this.setColsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols o)
                { CTMacrosheetImpl.this.insertNewCols(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols old = CTMacrosheetImpl.this.getColsArray(i);
                CTMacrosheetImpl.this.removeCols(i);
                return old;
            }
            
            public int size()
                { return CTMacrosheetImpl.this.sizeOfColsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColsList();
        }
    }
    
    /**
     * Gets array of all "cols" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] getColsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLS$8, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cols" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols getColsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().find_element_user(COLS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cols" element
     */
    public int sizeOfColsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLS$8);
        }
    }
    
    /**
     * Sets array of all "cols" element
     */
    public void setColsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols[] colsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colsArray, COLS$8);
        }
    }
    
    /**
     * Sets ith "cols" element
     */
    public void setColsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().find_element_user(COLS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cols);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cols" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols insertNewCols(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().insert_element_user(COLS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cols" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols addNewCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols)get_store().add_element_user(COLS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "cols" element
     */
    public void removeCols(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLS$8, i);
        }
    }
    
    /**
     * Gets the "sheetData" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData getSheetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().find_element_user(SHEETDATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sheetData" element
     */
    public void setSheetData(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData sheetData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().find_element_user(SHEETDATA$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().add_element_user(SHEETDATA$10);
            }
            target.set(sheetData);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetData" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData addNewSheetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData)get_store().add_element_user(SHEETDATA$10);
            return target;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$12, 0);
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
            return get_store().count_elements(SHEETPROTECTION$12) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$12);
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
            get_store().remove_element(SHEETPROTECTION$12, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$14, 0);
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
            return get_store().count_elements(AUTOFILTER$14) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$14);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$14);
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
            get_store().remove_element(AUTOFILTER$14, 0);
        }
    }
    
    /**
     * Gets the "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sortState" element
     */
    public boolean isSetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTSTATE$16) != 0;
        }
    }
    
    /**
     * Sets the "sortState" element
     */
    public void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$16);
            }
            target.set(sortState);
        }
    }
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "sortState" element
     */
    public void unsetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTSTATE$16, 0);
        }
    }
    
    /**
     * Gets the "dataConsolidate" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate getDataConsolidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().find_element_user(DATACONSOLIDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataConsolidate" element
     */
    public boolean isSetDataConsolidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSOLIDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "dataConsolidate" element
     */
    public void setDataConsolidate(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate dataConsolidate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().find_element_user(DATACONSOLIDATE$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().add_element_user(DATACONSOLIDATE$18);
            }
            target.set(dataConsolidate);
        }
    }
    
    /**
     * Appends and returns a new empty "dataConsolidate" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate addNewDataConsolidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().add_element_user(DATACONSOLIDATE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "dataConsolidate" element
     */
    public void unsetDataConsolidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSOLIDATE$18, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$20, 0);
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
            return get_store().count_elements(CUSTOMSHEETVIEWS$20) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$20);
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
            get_store().remove_element(CUSTOMSHEETVIEWS$20, 0);
        }
    }
    
    /**
     * Gets the "phoneticPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr getPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phoneticPr" element
     */
    public boolean isSetPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONETICPR$22) != 0;
        }
    }
    
    /**
     * Sets the "phoneticPr" element
     */
    public void setPhoneticPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr phoneticPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$22);
            }
            target.set(phoneticPr);
        }
    }
    
    /**
     * Appends and returns a new empty "phoneticPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr addNewPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$22);
            return target;
        }
    }
    
    /**
     * Unsets the "phoneticPr" element
     */
    public void unsetPhoneticPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONETICPR$22, 0);
        }
    }
    
    /**
     * Gets a List of "conditionalFormatting" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting> getConditionalFormattingList()
    {
        final class ConditionalFormattingList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting get(int i)
                { return CTMacrosheetImpl.this.getConditionalFormattingArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting old = CTMacrosheetImpl.this.getConditionalFormattingArray(i);
                CTMacrosheetImpl.this.setConditionalFormattingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting o)
                { CTMacrosheetImpl.this.insertNewConditionalFormatting(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting old = CTMacrosheetImpl.this.getConditionalFormattingArray(i);
                CTMacrosheetImpl.this.removeConditionalFormatting(i);
                return old;
            }
            
            public int size()
                { return CTMacrosheetImpl.this.sizeOfConditionalFormattingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConditionalFormattingList();
        }
    }
    
    /**
     * Gets array of all "conditionalFormatting" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] getConditionalFormattingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITIONALFORMATTING$24, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conditionalFormatting" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting getConditionalFormattingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().find_element_user(CONDITIONALFORMATTING$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conditionalFormatting" element
     */
    public int sizeOfConditionalFormattingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONALFORMATTING$24);
        }
    }
    
    /**
     * Sets array of all "conditionalFormatting" element
     */
    public void setConditionalFormattingArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting[] conditionalFormattingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conditionalFormattingArray, CONDITIONALFORMATTING$24);
        }
    }
    
    /**
     * Sets ith "conditionalFormatting" element
     */
    public void setConditionalFormattingArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting conditionalFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().find_element_user(CONDITIONALFORMATTING$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conditionalFormatting);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conditionalFormatting" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting insertNewConditionalFormatting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().insert_element_user(CONDITIONALFORMATTING$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conditionalFormatting" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting addNewConditionalFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().add_element_user(CONDITIONALFORMATTING$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "conditionalFormatting" element
     */
    public void removeConditionalFormatting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONALFORMATTING$24, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$26, 0);
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
            return get_store().count_elements(PRINTOPTIONS$26) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$26);
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
            get_store().remove_element(PRINTOPTIONS$26, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$28, 0);
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
            return get_store().count_elements(PAGEMARGINS$28) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$28);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$28);
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
            get_store().remove_element(PAGEMARGINS$28, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$30, 0);
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
            return get_store().count_elements(PAGESETUP$30) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$30);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$30);
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
            get_store().remove_element(PAGESETUP$30, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$32, 0);
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
            return get_store().count_elements(HEADERFOOTER$32) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$32);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$32);
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
            get_store().remove_element(HEADERFOOTER$32, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$34, 0);
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
            return get_store().count_elements(ROWBREAKS$34) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$34);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$34);
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
            get_store().remove_element(ROWBREAKS$34, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$36, 0);
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
            return get_store().count_elements(COLBREAKS$36) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$36);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$36);
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
            get_store().remove_element(COLBREAKS$36, 0);
        }
    }
    
    /**
     * Gets the "customProperties" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties getCustomProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().find_element_user(CUSTOMPROPERTIES$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customProperties" element
     */
    public boolean isSetCustomProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMPROPERTIES$38) != 0;
        }
    }
    
    /**
     * Sets the "customProperties" element
     */
    public void setCustomProperties(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties customProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().find_element_user(CUSTOMPROPERTIES$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().add_element_user(CUSTOMPROPERTIES$38);
            }
            target.set(customProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "customProperties" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties addNewCustomProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().add_element_user(CUSTOMPROPERTIES$38);
            return target;
        }
    }
    
    /**
     * Unsets the "customProperties" element
     */
    public void unsetCustomProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMPROPERTIES$38, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$40, 0);
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
            return get_store().count_elements(DRAWING$40) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$40);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$40);
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
            get_store().remove_element(DRAWING$40, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$42, 0);
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
            return get_store().count_elements(LEGACYDRAWING$42) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$42);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$42);
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
            get_store().remove_element(LEGACYDRAWING$42, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$44, 0);
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
            return get_store().count_elements(LEGACYDRAWINGHF$44) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$44, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$44);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$44);
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
            get_store().remove_element(LEGACYDRAWINGHF$44, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$46, 0);
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
            return get_store().count_elements(PICTURE$46) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$46, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$46);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$46);
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
            get_store().remove_element(PICTURE$46, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$48, 0);
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
            return get_store().count_elements(OLEOBJECTS$48) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$48, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$48);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$48);
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
            get_store().remove_element(OLEOBJECTS$48, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$50, 0);
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
            return get_store().count_elements(EXTLST$50) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$50, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$50);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$50);
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
            get_store().remove_element(EXTLST$50, 0);
        }
    }
}
