/*
 * XML Type:  CT_Worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorksheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet
{
    
    public CTWorksheetImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName SHEETCALCPR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetCalcPr");
    private static final javax.xml.namespace.QName SHEETPROTECTION$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
    private static final javax.xml.namespace.QName PROTECTEDRANGES$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protectedRanges");
    private static final javax.xml.namespace.QName SCENARIOS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scenarios");
    private static final javax.xml.namespace.QName AUTOFILTER$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
    private static final javax.xml.namespace.QName SORTSTATE$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
    private static final javax.xml.namespace.QName DATACONSOLIDATE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataConsolidate");
    private static final javax.xml.namespace.QName CUSTOMSHEETVIEWS$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
    private static final javax.xml.namespace.QName MERGECELLS$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mergeCells");
    private static final javax.xml.namespace.QName PHONETICPR$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr");
    private static final javax.xml.namespace.QName CONDITIONALFORMATTING$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormatting");
    private static final javax.xml.namespace.QName DATAVALIDATIONS$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataValidations");
    private static final javax.xml.namespace.QName HYPERLINKS$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "hyperlinks");
    private static final javax.xml.namespace.QName PRINTOPTIONS$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
    private static final javax.xml.namespace.QName PAGEMARGINS$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
    private static final javax.xml.namespace.QName HEADERFOOTER$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
    private static final javax.xml.namespace.QName ROWBREAKS$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowBreaks");
    private static final javax.xml.namespace.QName COLBREAKS$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colBreaks");
    private static final javax.xml.namespace.QName CUSTOMPROPERTIES$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customProperties");
    private static final javax.xml.namespace.QName CELLWATCHES$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellWatches");
    private static final javax.xml.namespace.QName IGNOREDERRORS$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ignoredErrors");
    private static final javax.xml.namespace.QName SMARTTAGS$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTags");
    private static final javax.xml.namespace.QName DRAWING$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
    private static final javax.xml.namespace.QName LEGACYDRAWING$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
    private static final javax.xml.namespace.QName LEGACYDRAWINGHF$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
    private static final javax.xml.namespace.QName PICTURE$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture");
    private static final javax.xml.namespace.QName OLEOBJECTS$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects");
    private static final javax.xml.namespace.QName CONTROLS$68 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "controls");
    private static final javax.xml.namespace.QName WEBPUBLISHITEMS$70 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItems");
    private static final javax.xml.namespace.QName TABLEPARTS$72 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableParts");
    private static final javax.xml.namespace.QName EXTLST$74 = 
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
                { return CTWorksheetImpl.this.getColsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols old = CTWorksheetImpl.this.getColsArray(i);
                CTWorksheetImpl.this.setColsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols o)
                { CTWorksheetImpl.this.insertNewCols(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols old = CTWorksheetImpl.this.getColsArray(i);
                CTWorksheetImpl.this.removeCols(i);
                return old;
            }
            
            public int size()
                { return CTWorksheetImpl.this.sizeOfColsArray(); }
            
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
     * Gets the "sheetCalcPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr getSheetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().find_element_user(SHEETCALCPR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetCalcPr" element
     */
    public boolean isSetSheetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETCALCPR$12) != 0;
        }
    }
    
    /**
     * Sets the "sheetCalcPr" element
     */
    public void setSheetCalcPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr sheetCalcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().find_element_user(SHEETCALCPR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().add_element_user(SHEETCALCPR$12);
            }
            target.set(sheetCalcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetCalcPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr addNewSheetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr)get_store().add_element_user(SHEETCALCPR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetCalcPr" element
     */
    public void unsetSheetCalcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETCALCPR$12, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$14, 0);
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
            return get_store().count_elements(SHEETPROTECTION$14) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().find_element_user(SHEETPROTECTION$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$14);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection)get_store().add_element_user(SHEETPROTECTION$14);
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
            get_store().remove_element(SHEETPROTECTION$14, 0);
        }
    }
    
    /**
     * Gets the "protectedRanges" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges getProtectedRanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges)get_store().find_element_user(PROTECTEDRANGES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "protectedRanges" element
     */
    public boolean isSetProtectedRanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTECTEDRANGES$16) != 0;
        }
    }
    
    /**
     * Sets the "protectedRanges" element
     */
    public void setProtectedRanges(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges protectedRanges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges)get_store().find_element_user(PROTECTEDRANGES$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges)get_store().add_element_user(PROTECTEDRANGES$16);
            }
            target.set(protectedRanges);
        }
    }
    
    /**
     * Appends and returns a new empty "protectedRanges" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges addNewProtectedRanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges)get_store().add_element_user(PROTECTEDRANGES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "protectedRanges" element
     */
    public void unsetProtectedRanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTECTEDRANGES$16, 0);
        }
    }
    
    /**
     * Gets the "scenarios" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios getScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios)get_store().find_element_user(SCENARIOS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scenarios" element
     */
    public boolean isSetScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCENARIOS$18) != 0;
        }
    }
    
    /**
     * Sets the "scenarios" element
     */
    public void setScenarios(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios scenarios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios)get_store().find_element_user(SCENARIOS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios)get_store().add_element_user(SCENARIOS$18);
            }
            target.set(scenarios);
        }
    }
    
    /**
     * Appends and returns a new empty "scenarios" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios addNewScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios)get_store().add_element_user(SCENARIOS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "scenarios" element
     */
    public void unsetScenarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCENARIOS$18, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$20, 0);
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
            return get_store().count_elements(AUTOFILTER$20) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$20);
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
            get_store().remove_element(AUTOFILTER$20, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$22, 0);
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
            return get_store().count_elements(SORTSTATE$22) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$22);
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
            get_store().remove_element(SORTSTATE$22, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().find_element_user(DATACONSOLIDATE$24, 0);
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
            return get_store().count_elements(DATACONSOLIDATE$24) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().find_element_user(DATACONSOLIDATE$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().add_element_user(DATACONSOLIDATE$24);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate)get_store().add_element_user(DATACONSOLIDATE$24);
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
            get_store().remove_element(DATACONSOLIDATE$24, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$26, 0);
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
            return get_store().count_elements(CUSTOMSHEETVIEWS$26) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().find_element_user(CUSTOMSHEETVIEWS$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews)get_store().add_element_user(CUSTOMSHEETVIEWS$26);
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
            get_store().remove_element(CUSTOMSHEETVIEWS$26, 0);
        }
    }
    
    /**
     * Gets the "mergeCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells getMergeCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().find_element_user(MERGECELLS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mergeCells" element
     */
    public boolean isSetMergeCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERGECELLS$28) != 0;
        }
    }
    
    /**
     * Sets the "mergeCells" element
     */
    public void setMergeCells(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells mergeCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().find_element_user(MERGECELLS$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().add_element_user(MERGECELLS$28);
            }
            target.set(mergeCells);
        }
    }
    
    /**
     * Appends and returns a new empty "mergeCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells addNewMergeCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells)get_store().add_element_user(MERGECELLS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "mergeCells" element
     */
    public void unsetMergeCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERGECELLS$28, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$30, 0);
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
            return get_store().count_elements(PHONETICPR$30) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().find_element_user(PHONETICPR$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$30);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr)get_store().add_element_user(PHONETICPR$30);
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
            get_store().remove_element(PHONETICPR$30, 0);
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
                { return CTWorksheetImpl.this.getConditionalFormattingArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting old = CTWorksheetImpl.this.getConditionalFormattingArray(i);
                CTWorksheetImpl.this.setConditionalFormattingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting o)
                { CTWorksheetImpl.this.insertNewConditionalFormatting(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting old = CTWorksheetImpl.this.getConditionalFormattingArray(i);
                CTWorksheetImpl.this.removeConditionalFormatting(i);
                return old;
            }
            
            public int size()
                { return CTWorksheetImpl.this.sizeOfConditionalFormattingArray(); }
            
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
            get_store().find_all_element_users(CONDITIONALFORMATTING$32, targetList);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().find_element_user(CONDITIONALFORMATTING$32, i);
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
            return get_store().count_elements(CONDITIONALFORMATTING$32);
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
            arraySetterHelper(conditionalFormattingArray, CONDITIONALFORMATTING$32);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().find_element_user(CONDITIONALFORMATTING$32, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().insert_element_user(CONDITIONALFORMATTING$32, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting)get_store().add_element_user(CONDITIONALFORMATTING$32);
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
            get_store().remove_element(CONDITIONALFORMATTING$32, i);
        }
    }
    
    /**
     * Gets the "dataValidations" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations getDataValidations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations)get_store().find_element_user(DATAVALIDATIONS$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataValidations" element
     */
    public boolean isSetDataValidations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVALIDATIONS$34) != 0;
        }
    }
    
    /**
     * Sets the "dataValidations" element
     */
    public void setDataValidations(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations dataValidations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations)get_store().find_element_user(DATAVALIDATIONS$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations)get_store().add_element_user(DATAVALIDATIONS$34);
            }
            target.set(dataValidations);
        }
    }
    
    /**
     * Appends and returns a new empty "dataValidations" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations addNewDataValidations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations)get_store().add_element_user(DATAVALIDATIONS$34);
            return target;
        }
    }
    
    /**
     * Unsets the "dataValidations" element
     */
    public void unsetDataValidations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVALIDATIONS$34, 0);
        }
    }
    
    /**
     * Gets the "hyperlinks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks getHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().find_element_user(HYPERLINKS$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hyperlinks" element
     */
    public boolean isSetHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERLINKS$36) != 0;
        }
    }
    
    /**
     * Sets the "hyperlinks" element
     */
    public void setHyperlinks(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks hyperlinks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().find_element_user(HYPERLINKS$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().add_element_user(HYPERLINKS$36);
            }
            target.set(hyperlinks);
        }
    }
    
    /**
     * Appends and returns a new empty "hyperlinks" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks addNewHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks)get_store().add_element_user(HYPERLINKS$36);
            return target;
        }
    }
    
    /**
     * Unsets the "hyperlinks" element
     */
    public void unsetHyperlinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERLINKS$36, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$38, 0);
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
            return get_store().count_elements(PRINTOPTIONS$38) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().find_element_user(PRINTOPTIONS$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$38);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions)get_store().add_element_user(PRINTOPTIONS$38);
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
            get_store().remove_element(PRINTOPTIONS$38, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$40, 0);
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
            return get_store().count_elements(PAGEMARGINS$40) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().find_element_user(PAGEMARGINS$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$40);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins)get_store().add_element_user(PAGEMARGINS$40);
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
            get_store().remove_element(PAGEMARGINS$40, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$42, 0);
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
            return get_store().count_elements(PAGESETUP$42) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().find_element_user(PAGESETUP$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$42);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup)get_store().add_element_user(PAGESETUP$42);
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
            get_store().remove_element(PAGESETUP$42, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$44, 0);
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
            return get_store().count_elements(HEADERFOOTER$44) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$44, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$44);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$44);
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
            get_store().remove_element(HEADERFOOTER$44, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$46, 0);
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
            return get_store().count_elements(ROWBREAKS$46) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(ROWBREAKS$46, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$46);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(ROWBREAKS$46);
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
            get_store().remove_element(ROWBREAKS$46, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$48, 0);
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
            return get_store().count_elements(COLBREAKS$48) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().find_element_user(COLBREAKS$48, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$48);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak)get_store().add_element_user(COLBREAKS$48);
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
            get_store().remove_element(COLBREAKS$48, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().find_element_user(CUSTOMPROPERTIES$50, 0);
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
            return get_store().count_elements(CUSTOMPROPERTIES$50) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().find_element_user(CUSTOMPROPERTIES$50, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().add_element_user(CUSTOMPROPERTIES$50);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties)get_store().add_element_user(CUSTOMPROPERTIES$50);
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
            get_store().remove_element(CUSTOMPROPERTIES$50, 0);
        }
    }
    
    /**
     * Gets the "cellWatches" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches getCellWatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches)get_store().find_element_user(CELLWATCHES$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellWatches" element
     */
    public boolean isSetCellWatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLWATCHES$52) != 0;
        }
    }
    
    /**
     * Sets the "cellWatches" element
     */
    public void setCellWatches(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches cellWatches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches)get_store().find_element_user(CELLWATCHES$52, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches)get_store().add_element_user(CELLWATCHES$52);
            }
            target.set(cellWatches);
        }
    }
    
    /**
     * Appends and returns a new empty "cellWatches" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches addNewCellWatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches)get_store().add_element_user(CELLWATCHES$52);
            return target;
        }
    }
    
    /**
     * Unsets the "cellWatches" element
     */
    public void unsetCellWatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLWATCHES$52, 0);
        }
    }
    
    /**
     * Gets the "ignoredErrors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors getIgnoredErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors)get_store().find_element_user(IGNOREDERRORS$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ignoredErrors" element
     */
    public boolean isSetIgnoredErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREDERRORS$54) != 0;
        }
    }
    
    /**
     * Sets the "ignoredErrors" element
     */
    public void setIgnoredErrors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors ignoredErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors)get_store().find_element_user(IGNOREDERRORS$54, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors)get_store().add_element_user(IGNOREDERRORS$54);
            }
            target.set(ignoredErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "ignoredErrors" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors addNewIgnoredErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors)get_store().add_element_user(IGNOREDERRORS$54);
            return target;
        }
    }
    
    /**
     * Unsets the "ignoredErrors" element
     */
    public void unsetIgnoredErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREDERRORS$54, 0);
        }
    }
    
    /**
     * Gets the "smartTags" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags getSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags)get_store().find_element_user(SMARTTAGS$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smartTags" element
     */
    public boolean isSetSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGS$56) != 0;
        }
    }
    
    /**
     * Sets the "smartTags" element
     */
    public void setSmartTags(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags smartTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags)get_store().find_element_user(SMARTTAGS$56, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags)get_store().add_element_user(SMARTTAGS$56);
            }
            target.set(smartTags);
        }
    }
    
    /**
     * Appends and returns a new empty "smartTags" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags addNewSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags)get_store().add_element_user(SMARTTAGS$56);
            return target;
        }
    }
    
    /**
     * Unsets the "smartTags" element
     */
    public void unsetSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGS$56, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$58, 0);
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
            return get_store().count_elements(DRAWING$58) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$58, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$58);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$58);
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
            get_store().remove_element(DRAWING$58, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$60, 0);
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
            return get_store().count_elements(LEGACYDRAWING$60) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWING$60, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$60);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWING$60);
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
            get_store().remove_element(LEGACYDRAWING$60, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$62, 0);
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
            return get_store().count_elements(LEGACYDRAWINGHF$62) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().find_element_user(LEGACYDRAWINGHF$62, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$62);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing)get_store().add_element_user(LEGACYDRAWINGHF$62);
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
            get_store().remove_element(LEGACYDRAWINGHF$62, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$64, 0);
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
            return get_store().count_elements(PICTURE$64) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().find_element_user(PICTURE$64, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$64);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture)get_store().add_element_user(PICTURE$64);
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
            get_store().remove_element(PICTURE$64, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$66, 0);
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
            return get_store().count_elements(OLEOBJECTS$66) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().find_element_user(OLEOBJECTS$66, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$66);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects)get_store().add_element_user(OLEOBJECTS$66);
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
            get_store().remove_element(OLEOBJECTS$66, 0);
        }
    }
    
    /**
     * Gets the "controls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls getControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls)get_store().find_element_user(CONTROLS$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "controls" element
     */
    public boolean isSetControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROLS$68) != 0;
        }
    }
    
    /**
     * Sets the "controls" element
     */
    public void setControls(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls controls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls)get_store().find_element_user(CONTROLS$68, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls)get_store().add_element_user(CONTROLS$68);
            }
            target.set(controls);
        }
    }
    
    /**
     * Appends and returns a new empty "controls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls addNewControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls)get_store().add_element_user(CONTROLS$68);
            return target;
        }
    }
    
    /**
     * Unsets the "controls" element
     */
    public void unsetControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROLS$68, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().find_element_user(WEBPUBLISHITEMS$70, 0);
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
            return get_store().count_elements(WEBPUBLISHITEMS$70) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().find_element_user(WEBPUBLISHITEMS$70, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().add_element_user(WEBPUBLISHITEMS$70);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems)get_store().add_element_user(WEBPUBLISHITEMS$70);
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
            get_store().remove_element(WEBPUBLISHITEMS$70, 0);
        }
    }
    
    /**
     * Gets the "tableParts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts getTableParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts)get_store().find_element_user(TABLEPARTS$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tableParts" element
     */
    public boolean isSetTableParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLEPARTS$72) != 0;
        }
    }
    
    /**
     * Sets the "tableParts" element
     */
    public void setTableParts(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts tableParts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts)get_store().find_element_user(TABLEPARTS$72, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts)get_store().add_element_user(TABLEPARTS$72);
            }
            target.set(tableParts);
        }
    }
    
    /**
     * Appends and returns a new empty "tableParts" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts addNewTableParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts)get_store().add_element_user(TABLEPARTS$72);
            return target;
        }
    }
    
    /**
     * Unsets the "tableParts" element
     */
    public void unsetTableParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLEPARTS$72, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$74, 0);
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
            return get_store().count_elements(EXTLST$74) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$74, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$74);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$74);
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
            get_store().remove_element(EXTLST$74, 0);
        }
    }
}
