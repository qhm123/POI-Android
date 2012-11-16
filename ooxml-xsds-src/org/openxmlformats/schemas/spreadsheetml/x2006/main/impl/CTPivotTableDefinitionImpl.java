/*
 * XML Type:  CT_pivotTableDefinition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_pivotTableDefinition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotTableDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition
{
    
    public CTPivotTableDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "location");
    private static final javax.xml.namespace.QName PIVOTFIELDS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotFields");
    private static final javax.xml.namespace.QName ROWFIELDS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowFields");
    private static final javax.xml.namespace.QName ROWITEMS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowItems");
    private static final javax.xml.namespace.QName COLFIELDS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colFields");
    private static final javax.xml.namespace.QName COLITEMS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colItems");
    private static final javax.xml.namespace.QName PAGEFIELDS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageFields");
    private static final javax.xml.namespace.QName DATAFIELDS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataFields");
    private static final javax.xml.namespace.QName FORMATS$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formats");
    private static final javax.xml.namespace.QName CONDITIONALFORMATS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormats");
    private static final javax.xml.namespace.QName CHARTFORMATS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartFormats");
    private static final javax.xml.namespace.QName PIVOTHIERARCHIES$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotHierarchies");
    private static final javax.xml.namespace.QName PIVOTTABLESTYLEINFO$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotTableStyleInfo");
    private static final javax.xml.namespace.QName FILTERS$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filters");
    private static final javax.xml.namespace.QName ROWHIERARCHIESUSAGE$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowHierarchiesUsage");
    private static final javax.xml.namespace.QName COLHIERARCHIESUSAGE$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colHierarchiesUsage");
    private static final javax.xml.namespace.QName EXTLST$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$34 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName CACHEID$36 = 
        new javax.xml.namespace.QName("", "cacheId");
    private static final javax.xml.namespace.QName DATAONROWS$38 = 
        new javax.xml.namespace.QName("", "dataOnRows");
    private static final javax.xml.namespace.QName DATAPOSITION$40 = 
        new javax.xml.namespace.QName("", "dataPosition");
    private static final javax.xml.namespace.QName AUTOFORMATID$42 = 
        new javax.xml.namespace.QName("", "autoFormatId");
    private static final javax.xml.namespace.QName APPLYNUMBERFORMATS$44 = 
        new javax.xml.namespace.QName("", "applyNumberFormats");
    private static final javax.xml.namespace.QName APPLYBORDERFORMATS$46 = 
        new javax.xml.namespace.QName("", "applyBorderFormats");
    private static final javax.xml.namespace.QName APPLYFONTFORMATS$48 = 
        new javax.xml.namespace.QName("", "applyFontFormats");
    private static final javax.xml.namespace.QName APPLYPATTERNFORMATS$50 = 
        new javax.xml.namespace.QName("", "applyPatternFormats");
    private static final javax.xml.namespace.QName APPLYALIGNMENTFORMATS$52 = 
        new javax.xml.namespace.QName("", "applyAlignmentFormats");
    private static final javax.xml.namespace.QName APPLYWIDTHHEIGHTFORMATS$54 = 
        new javax.xml.namespace.QName("", "applyWidthHeightFormats");
    private static final javax.xml.namespace.QName DATACAPTION$56 = 
        new javax.xml.namespace.QName("", "dataCaption");
    private static final javax.xml.namespace.QName GRANDTOTALCAPTION$58 = 
        new javax.xml.namespace.QName("", "grandTotalCaption");
    private static final javax.xml.namespace.QName ERRORCAPTION$60 = 
        new javax.xml.namespace.QName("", "errorCaption");
    private static final javax.xml.namespace.QName SHOWERROR$62 = 
        new javax.xml.namespace.QName("", "showError");
    private static final javax.xml.namespace.QName MISSINGCAPTION$64 = 
        new javax.xml.namespace.QName("", "missingCaption");
    private static final javax.xml.namespace.QName SHOWMISSING$66 = 
        new javax.xml.namespace.QName("", "showMissing");
    private static final javax.xml.namespace.QName PAGESTYLE$68 = 
        new javax.xml.namespace.QName("", "pageStyle");
    private static final javax.xml.namespace.QName PIVOTTABLESTYLE$70 = 
        new javax.xml.namespace.QName("", "pivotTableStyle");
    private static final javax.xml.namespace.QName VACATEDSTYLE$72 = 
        new javax.xml.namespace.QName("", "vacatedStyle");
    private static final javax.xml.namespace.QName TAG$74 = 
        new javax.xml.namespace.QName("", "tag");
    private static final javax.xml.namespace.QName UPDATEDVERSION$76 = 
        new javax.xml.namespace.QName("", "updatedVersion");
    private static final javax.xml.namespace.QName MINREFRESHABLEVERSION$78 = 
        new javax.xml.namespace.QName("", "minRefreshableVersion");
    private static final javax.xml.namespace.QName ASTERISKTOTALS$80 = 
        new javax.xml.namespace.QName("", "asteriskTotals");
    private static final javax.xml.namespace.QName SHOWITEMS$82 = 
        new javax.xml.namespace.QName("", "showItems");
    private static final javax.xml.namespace.QName EDITDATA$84 = 
        new javax.xml.namespace.QName("", "editData");
    private static final javax.xml.namespace.QName DISABLEFIELDLIST$86 = 
        new javax.xml.namespace.QName("", "disableFieldList");
    private static final javax.xml.namespace.QName SHOWCALCMBRS$88 = 
        new javax.xml.namespace.QName("", "showCalcMbrs");
    private static final javax.xml.namespace.QName VISUALTOTALS$90 = 
        new javax.xml.namespace.QName("", "visualTotals");
    private static final javax.xml.namespace.QName SHOWMULTIPLELABEL$92 = 
        new javax.xml.namespace.QName("", "showMultipleLabel");
    private static final javax.xml.namespace.QName SHOWDATADROPDOWN$94 = 
        new javax.xml.namespace.QName("", "showDataDropDown");
    private static final javax.xml.namespace.QName SHOWDRILL$96 = 
        new javax.xml.namespace.QName("", "showDrill");
    private static final javax.xml.namespace.QName PRINTDRILL$98 = 
        new javax.xml.namespace.QName("", "printDrill");
    private static final javax.xml.namespace.QName SHOWMEMBERPROPERTYTIPS$100 = 
        new javax.xml.namespace.QName("", "showMemberPropertyTips");
    private static final javax.xml.namespace.QName SHOWDATATIPS$102 = 
        new javax.xml.namespace.QName("", "showDataTips");
    private static final javax.xml.namespace.QName ENABLEWIZARD$104 = 
        new javax.xml.namespace.QName("", "enableWizard");
    private static final javax.xml.namespace.QName ENABLEDRILL$106 = 
        new javax.xml.namespace.QName("", "enableDrill");
    private static final javax.xml.namespace.QName ENABLEFIELDPROPERTIES$108 = 
        new javax.xml.namespace.QName("", "enableFieldProperties");
    private static final javax.xml.namespace.QName PRESERVEFORMATTING$110 = 
        new javax.xml.namespace.QName("", "preserveFormatting");
    private static final javax.xml.namespace.QName USEAUTOFORMATTING$112 = 
        new javax.xml.namespace.QName("", "useAutoFormatting");
    private static final javax.xml.namespace.QName PAGEWRAP$114 = 
        new javax.xml.namespace.QName("", "pageWrap");
    private static final javax.xml.namespace.QName PAGEOVERTHENDOWN$116 = 
        new javax.xml.namespace.QName("", "pageOverThenDown");
    private static final javax.xml.namespace.QName SUBTOTALHIDDENITEMS$118 = 
        new javax.xml.namespace.QName("", "subtotalHiddenItems");
    private static final javax.xml.namespace.QName ROWGRANDTOTALS$120 = 
        new javax.xml.namespace.QName("", "rowGrandTotals");
    private static final javax.xml.namespace.QName COLGRANDTOTALS$122 = 
        new javax.xml.namespace.QName("", "colGrandTotals");
    private static final javax.xml.namespace.QName FIELDPRINTTITLES$124 = 
        new javax.xml.namespace.QName("", "fieldPrintTitles");
    private static final javax.xml.namespace.QName ITEMPRINTTITLES$126 = 
        new javax.xml.namespace.QName("", "itemPrintTitles");
    private static final javax.xml.namespace.QName MERGEITEM$128 = 
        new javax.xml.namespace.QName("", "mergeItem");
    private static final javax.xml.namespace.QName SHOWDROPZONES$130 = 
        new javax.xml.namespace.QName("", "showDropZones");
    private static final javax.xml.namespace.QName CREATEDVERSION$132 = 
        new javax.xml.namespace.QName("", "createdVersion");
    private static final javax.xml.namespace.QName INDENT$134 = 
        new javax.xml.namespace.QName("", "indent");
    private static final javax.xml.namespace.QName SHOWEMPTYROW$136 = 
        new javax.xml.namespace.QName("", "showEmptyRow");
    private static final javax.xml.namespace.QName SHOWEMPTYCOL$138 = 
        new javax.xml.namespace.QName("", "showEmptyCol");
    private static final javax.xml.namespace.QName SHOWHEADERS$140 = 
        new javax.xml.namespace.QName("", "showHeaders");
    private static final javax.xml.namespace.QName COMPACT$142 = 
        new javax.xml.namespace.QName("", "compact");
    private static final javax.xml.namespace.QName OUTLINE$144 = 
        new javax.xml.namespace.QName("", "outline");
    private static final javax.xml.namespace.QName OUTLINEDATA$146 = 
        new javax.xml.namespace.QName("", "outlineData");
    private static final javax.xml.namespace.QName COMPACTDATA$148 = 
        new javax.xml.namespace.QName("", "compactData");
    private static final javax.xml.namespace.QName PUBLISHED$150 = 
        new javax.xml.namespace.QName("", "published");
    private static final javax.xml.namespace.QName GRIDDROPZONES$152 = 
        new javax.xml.namespace.QName("", "gridDropZones");
    private static final javax.xml.namespace.QName IMMERSIVE$154 = 
        new javax.xml.namespace.QName("", "immersive");
    private static final javax.xml.namespace.QName MULTIPLEFIELDFILTERS$156 = 
        new javax.xml.namespace.QName("", "multipleFieldFilters");
    private static final javax.xml.namespace.QName CHARTFORMAT$158 = 
        new javax.xml.namespace.QName("", "chartFormat");
    private static final javax.xml.namespace.QName ROWHEADERCAPTION$160 = 
        new javax.xml.namespace.QName("", "rowHeaderCaption");
    private static final javax.xml.namespace.QName COLHEADERCAPTION$162 = 
        new javax.xml.namespace.QName("", "colHeaderCaption");
    private static final javax.xml.namespace.QName FIELDLISTSORTASCENDING$164 = 
        new javax.xml.namespace.QName("", "fieldListSortAscending");
    private static final javax.xml.namespace.QName MDXSUBQUERIES$166 = 
        new javax.xml.namespace.QName("", "mdxSubqueries");
    private static final javax.xml.namespace.QName CUSTOMLISTSORT$168 = 
        new javax.xml.namespace.QName("", "customListSort");
    
    
    /**
     * Gets the "location" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "pivotFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields getPivotFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields)get_store().find_element_user(PIVOTFIELDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotFields" element
     */
    public boolean isSetPivotFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTFIELDS$2) != 0;
        }
    }
    
    /**
     * Sets the "pivotFields" element
     */
    public void setPivotFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields pivotFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields)get_store().find_element_user(PIVOTFIELDS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields)get_store().add_element_user(PIVOTFIELDS$2);
            }
            target.set(pivotFields);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields addNewPivotFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields)get_store().add_element_user(PIVOTFIELDS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotFields" element
     */
    public void unsetPivotFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTFIELDS$2, 0);
        }
    }
    
    /**
     * Gets the "rowFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields getRowFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields)get_store().find_element_user(ROWFIELDS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rowFields" element
     */
    public boolean isSetRowFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWFIELDS$4) != 0;
        }
    }
    
    /**
     * Sets the "rowFields" element
     */
    public void setRowFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields rowFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields)get_store().find_element_user(ROWFIELDS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields)get_store().add_element_user(ROWFIELDS$4);
            }
            target.set(rowFields);
        }
    }
    
    /**
     * Appends and returns a new empty "rowFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields addNewRowFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields)get_store().add_element_user(ROWFIELDS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rowFields" element
     */
    public void unsetRowFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWFIELDS$4, 0);
        }
    }
    
    /**
     * Gets the "rowItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems getRowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems)get_store().find_element_user(ROWITEMS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rowItems" element
     */
    public boolean isSetRowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWITEMS$6) != 0;
        }
    }
    
    /**
     * Sets the "rowItems" element
     */
    public void setRowItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems rowItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems)get_store().find_element_user(ROWITEMS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems)get_store().add_element_user(ROWITEMS$6);
            }
            target.set(rowItems);
        }
    }
    
    /**
     * Appends and returns a new empty "rowItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems addNewRowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems)get_store().add_element_user(ROWITEMS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "rowItems" element
     */
    public void unsetRowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWITEMS$6, 0);
        }
    }
    
    /**
     * Gets the "colFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields getColFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields)get_store().find_element_user(COLFIELDS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colFields" element
     */
    public boolean isSetColFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLFIELDS$8) != 0;
        }
    }
    
    /**
     * Sets the "colFields" element
     */
    public void setColFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields colFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields)get_store().find_element_user(COLFIELDS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields)get_store().add_element_user(COLFIELDS$8);
            }
            target.set(colFields);
        }
    }
    
    /**
     * Appends and returns a new empty "colFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields addNewColFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields)get_store().add_element_user(COLFIELDS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "colFields" element
     */
    public void unsetColFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLFIELDS$8, 0);
        }
    }
    
    /**
     * Gets the "colItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems getColItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems)get_store().find_element_user(COLITEMS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colItems" element
     */
    public boolean isSetColItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLITEMS$10) != 0;
        }
    }
    
    /**
     * Sets the "colItems" element
     */
    public void setColItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems colItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems)get_store().find_element_user(COLITEMS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems)get_store().add_element_user(COLITEMS$10);
            }
            target.set(colItems);
        }
    }
    
    /**
     * Appends and returns a new empty "colItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems addNewColItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems)get_store().add_element_user(COLITEMS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "colItems" element
     */
    public void unsetColItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLITEMS$10, 0);
        }
    }
    
    /**
     * Gets the "pageFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields getPageFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields)get_store().find_element_user(PAGEFIELDS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageFields" element
     */
    public boolean isSetPageFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEFIELDS$12) != 0;
        }
    }
    
    /**
     * Sets the "pageFields" element
     */
    public void setPageFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields pageFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields)get_store().find_element_user(PAGEFIELDS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields)get_store().add_element_user(PAGEFIELDS$12);
            }
            target.set(pageFields);
        }
    }
    
    /**
     * Appends and returns a new empty "pageFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields addNewPageFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields)get_store().add_element_user(PAGEFIELDS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "pageFields" element
     */
    public void unsetPageFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEFIELDS$12, 0);
        }
    }
    
    /**
     * Gets the "dataFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields getDataFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields)get_store().find_element_user(DATAFIELDS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataFields" element
     */
    public boolean isSetDataFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFIELDS$14) != 0;
        }
    }
    
    /**
     * Sets the "dataFields" element
     */
    public void setDataFields(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields dataFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields)get_store().find_element_user(DATAFIELDS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields)get_store().add_element_user(DATAFIELDS$14);
            }
            target.set(dataFields);
        }
    }
    
    /**
     * Appends and returns a new empty "dataFields" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields addNewDataFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields)get_store().add_element_user(DATAFIELDS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "dataFields" element
     */
    public void unsetDataFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFIELDS$14, 0);
        }
    }
    
    /**
     * Gets the "formats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats getFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats)get_store().find_element_user(FORMATS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formats" element
     */
    public boolean isSetFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATS$16) != 0;
        }
    }
    
    /**
     * Sets the "formats" element
     */
    public void setFormats(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats formats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats)get_store().find_element_user(FORMATS$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats)get_store().add_element_user(FORMATS$16);
            }
            target.set(formats);
        }
    }
    
    /**
     * Appends and returns a new empty "formats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats addNewFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats)get_store().add_element_user(FORMATS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "formats" element
     */
    public void unsetFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATS$16, 0);
        }
    }
    
    /**
     * Gets the "conditionalFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats getConditionalFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats)get_store().find_element_user(CONDITIONALFORMATS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conditionalFormats" element
     */
    public boolean isSetConditionalFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONALFORMATS$18) != 0;
        }
    }
    
    /**
     * Sets the "conditionalFormats" element
     */
    public void setConditionalFormats(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats conditionalFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats)get_store().find_element_user(CONDITIONALFORMATS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats)get_store().add_element_user(CONDITIONALFORMATS$18);
            }
            target.set(conditionalFormats);
        }
    }
    
    /**
     * Appends and returns a new empty "conditionalFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats addNewConditionalFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats)get_store().add_element_user(CONDITIONALFORMATS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "conditionalFormats" element
     */
    public void unsetConditionalFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONALFORMATS$18, 0);
        }
    }
    
    /**
     * Gets the "chartFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats getChartFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats)get_store().find_element_user(CHARTFORMATS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chartFormats" element
     */
    public boolean isSetChartFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARTFORMATS$20) != 0;
        }
    }
    
    /**
     * Sets the "chartFormats" element
     */
    public void setChartFormats(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats chartFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats)get_store().find_element_user(CHARTFORMATS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats)get_store().add_element_user(CHARTFORMATS$20);
            }
            target.set(chartFormats);
        }
    }
    
    /**
     * Appends and returns a new empty "chartFormats" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats addNewChartFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats)get_store().add_element_user(CHARTFORMATS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "chartFormats" element
     */
    public void unsetChartFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARTFORMATS$20, 0);
        }
    }
    
    /**
     * Gets the "pivotHierarchies" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies getPivotHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies)get_store().find_element_user(PIVOTHIERARCHIES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotHierarchies" element
     */
    public boolean isSetPivotHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTHIERARCHIES$22) != 0;
        }
    }
    
    /**
     * Sets the "pivotHierarchies" element
     */
    public void setPivotHierarchies(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies pivotHierarchies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies)get_store().find_element_user(PIVOTHIERARCHIES$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies)get_store().add_element_user(PIVOTHIERARCHIES$22);
            }
            target.set(pivotHierarchies);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotHierarchies" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies addNewPivotHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies)get_store().add_element_user(PIVOTHIERARCHIES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotHierarchies" element
     */
    public void unsetPivotHierarchies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTHIERARCHIES$22, 0);
        }
    }
    
    /**
     * Gets the "pivotTableStyleInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle getPivotTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle)get_store().find_element_user(PIVOTTABLESTYLEINFO$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotTableStyleInfo" element
     */
    public boolean isSetPivotTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIVOTTABLESTYLEINFO$24) != 0;
        }
    }
    
    /**
     * Sets the "pivotTableStyleInfo" element
     */
    public void setPivotTableStyleInfo(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle pivotTableStyleInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle)get_store().find_element_user(PIVOTTABLESTYLEINFO$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle)get_store().add_element_user(PIVOTTABLESTYLEINFO$24);
            }
            target.set(pivotTableStyleInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotTableStyleInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle addNewPivotTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle)get_store().add_element_user(PIVOTTABLESTYLEINFO$24);
            return target;
        }
    }
    
    /**
     * Unsets the "pivotTableStyleInfo" element
     */
    public void unsetPivotTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIVOTTABLESTYLEINFO$24, 0);
        }
    }
    
    /**
     * Gets the "filters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters)get_store().find_element_user(FILTERS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$26) != 0;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters filters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters)get_store().find_element_user(FILTERS$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters)get_store().add_element_user(FILTERS$26);
            }
            target.set(filters);
        }
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters)get_store().add_element_user(FILTERS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$26, 0);
        }
    }
    
    /**
     * Gets the "rowHierarchiesUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage getRowHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage)get_store().find_element_user(ROWHIERARCHIESUSAGE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rowHierarchiesUsage" element
     */
    public boolean isSetRowHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWHIERARCHIESUSAGE$28) != 0;
        }
    }
    
    /**
     * Sets the "rowHierarchiesUsage" element
     */
    public void setRowHierarchiesUsage(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage rowHierarchiesUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage)get_store().find_element_user(ROWHIERARCHIESUSAGE$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage)get_store().add_element_user(ROWHIERARCHIESUSAGE$28);
            }
            target.set(rowHierarchiesUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "rowHierarchiesUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage addNewRowHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage)get_store().add_element_user(ROWHIERARCHIESUSAGE$28);
            return target;
        }
    }
    
    /**
     * Unsets the "rowHierarchiesUsage" element
     */
    public void unsetRowHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWHIERARCHIESUSAGE$28, 0);
        }
    }
    
    /**
     * Gets the "colHierarchiesUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage getColHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage)get_store().find_element_user(COLHIERARCHIESUSAGE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colHierarchiesUsage" element
     */
    public boolean isSetColHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLHIERARCHIESUSAGE$30) != 0;
        }
    }
    
    /**
     * Sets the "colHierarchiesUsage" element
     */
    public void setColHierarchiesUsage(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage colHierarchiesUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage)get_store().find_element_user(COLHIERARCHIESUSAGE$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage)get_store().add_element_user(COLHIERARCHIESUSAGE$30);
            }
            target.set(colHierarchiesUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "colHierarchiesUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage addNewColHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage)get_store().add_element_user(COLHIERARCHIESUSAGE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "colHierarchiesUsage" element
     */
    public void unsetColHierarchiesUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLHIERARCHIESUSAGE$30, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$32, 0);
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
            return get_store().count_elements(EXTLST$32) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$32);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$32);
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
            get_store().remove_element(EXTLST$32, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$34);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$34);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$34);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "cacheId" attribute
     */
    public long getCacheId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEID$36);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cacheId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCacheId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CACHEID$36);
            return target;
        }
    }
    
    /**
     * Sets the "cacheId" attribute
     */
    public void setCacheId(long cacheId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEID$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEID$36);
            }
            target.setLongValue(cacheId);
        }
    }
    
    /**
     * Sets (as xml) the "cacheId" attribute
     */
    public void xsetCacheId(org.apache.xmlbeans.XmlUnsignedInt cacheId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CACHEID$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CACHEID$36);
            }
            target.set(cacheId);
        }
    }
    
    /**
     * Gets the "dataOnRows" attribute
     */
    public boolean getDataOnRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAONROWS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATAONROWS$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataOnRows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataOnRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAONROWS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATAONROWS$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "dataOnRows" attribute
     */
    public boolean isSetDataOnRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAONROWS$38) != null;
        }
    }
    
    /**
     * Sets the "dataOnRows" attribute
     */
    public void setDataOnRows(boolean dataOnRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAONROWS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAONROWS$38);
            }
            target.setBooleanValue(dataOnRows);
        }
    }
    
    /**
     * Sets (as xml) the "dataOnRows" attribute
     */
    public void xsetDataOnRows(org.apache.xmlbeans.XmlBoolean dataOnRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAONROWS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATAONROWS$38);
            }
            target.set(dataOnRows);
        }
    }
    
    /**
     * Unsets the "dataOnRows" attribute
     */
    public void unsetDataOnRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAONROWS$38);
        }
    }
    
    /**
     * Gets the "dataPosition" attribute
     */
    public long getDataPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPOSITION$40);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataPosition" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDataPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DATAPOSITION$40);
            return target;
        }
    }
    
    /**
     * True if has "dataPosition" attribute
     */
    public boolean isSetDataPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAPOSITION$40) != null;
        }
    }
    
    /**
     * Sets the "dataPosition" attribute
     */
    public void setDataPosition(long dataPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPOSITION$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPOSITION$40);
            }
            target.setLongValue(dataPosition);
        }
    }
    
    /**
     * Sets (as xml) the "dataPosition" attribute
     */
    public void xsetDataPosition(org.apache.xmlbeans.XmlUnsignedInt dataPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DATAPOSITION$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DATAPOSITION$40);
            }
            target.set(dataPosition);
        }
    }
    
    /**
     * Unsets the "dataPosition" attribute
     */
    public void unsetDataPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAPOSITION$40);
        }
    }
    
    /**
     * Gets the "autoFormatId" attribute
     */
    public long getAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$42);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoFormatId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$42);
            return target;
        }
    }
    
    /**
     * True if has "autoFormatId" attribute
     */
    public boolean isSetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFORMATID$42) != null;
        }
    }
    
    /**
     * Sets the "autoFormatId" attribute
     */
    public void setAutoFormatId(long autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFORMATID$42);
            }
            target.setLongValue(autoFormatId);
        }
    }
    
    /**
     * Sets (as xml) the "autoFormatId" attribute
     */
    public void xsetAutoFormatId(org.apache.xmlbeans.XmlUnsignedInt autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(AUTOFORMATID$42);
            }
            target.set(autoFormatId);
        }
    }
    
    /**
     * Unsets the "autoFormatId" attribute
     */
    public void unsetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFORMATID$42);
        }
    }
    
    /**
     * Gets the "applyNumberFormats" attribute
     */
    public boolean getApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyNumberFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
            return target;
        }
    }
    
    /**
     * True if has "applyNumberFormats" attribute
     */
    public boolean isSetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYNUMBERFORMATS$44) != null;
        }
    }
    
    /**
     * Sets the "applyNumberFormats" attribute
     */
    public void setApplyNumberFormats(boolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYNUMBERFORMATS$44);
            }
            target.setBooleanValue(applyNumberFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyNumberFormats" attribute
     */
    public void xsetApplyNumberFormats(org.apache.xmlbeans.XmlBoolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYNUMBERFORMATS$44);
            }
            target.set(applyNumberFormats);
        }
    }
    
    /**
     * Unsets the "applyNumberFormats" attribute
     */
    public void unsetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYNUMBERFORMATS$44);
        }
    }
    
    /**
     * Gets the "applyBorderFormats" attribute
     */
    public boolean getApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyBorderFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$46);
            return target;
        }
    }
    
    /**
     * True if has "applyBorderFormats" attribute
     */
    public boolean isSetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYBORDERFORMATS$46) != null;
        }
    }
    
    /**
     * Sets the "applyBorderFormats" attribute
     */
    public void setApplyBorderFormats(boolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYBORDERFORMATS$46);
            }
            target.setBooleanValue(applyBorderFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyBorderFormats" attribute
     */
    public void xsetApplyBorderFormats(org.apache.xmlbeans.XmlBoolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYBORDERFORMATS$46);
            }
            target.set(applyBorderFormats);
        }
    }
    
    /**
     * Unsets the "applyBorderFormats" attribute
     */
    public void unsetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYBORDERFORMATS$46);
        }
    }
    
    /**
     * Gets the "applyFontFormats" attribute
     */
    public boolean getApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$48);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyFontFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$48);
            return target;
        }
    }
    
    /**
     * True if has "applyFontFormats" attribute
     */
    public boolean isSetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFONTFORMATS$48) != null;
        }
    }
    
    /**
     * Sets the "applyFontFormats" attribute
     */
    public void setApplyFontFormats(boolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFONTFORMATS$48);
            }
            target.setBooleanValue(applyFontFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyFontFormats" attribute
     */
    public void xsetApplyFontFormats(org.apache.xmlbeans.XmlBoolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFONTFORMATS$48);
            }
            target.set(applyFontFormats);
        }
    }
    
    /**
     * Unsets the "applyFontFormats" attribute
     */
    public void unsetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFONTFORMATS$48);
        }
    }
    
    /**
     * Gets the "applyPatternFormats" attribute
     */
    public boolean getApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyPatternFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
            return target;
        }
    }
    
    /**
     * True if has "applyPatternFormats" attribute
     */
    public boolean isSetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYPATTERNFORMATS$50) != null;
        }
    }
    
    /**
     * Sets the "applyPatternFormats" attribute
     */
    public void setApplyPatternFormats(boolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYPATTERNFORMATS$50);
            }
            target.setBooleanValue(applyPatternFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyPatternFormats" attribute
     */
    public void xsetApplyPatternFormats(org.apache.xmlbeans.XmlBoolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYPATTERNFORMATS$50);
            }
            target.set(applyPatternFormats);
        }
    }
    
    /**
     * Unsets the "applyPatternFormats" attribute
     */
    public void unsetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYPATTERNFORMATS$50);
        }
    }
    
    /**
     * Gets the "applyAlignmentFormats" attribute
     */
    public boolean getApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyAlignmentFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
            return target;
        }
    }
    
    /**
     * True if has "applyAlignmentFormats" attribute
     */
    public boolean isSetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52) != null;
        }
    }
    
    /**
     * Sets the "applyAlignmentFormats" attribute
     */
    public void setApplyAlignmentFormats(boolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$52);
            }
            target.setBooleanValue(applyAlignmentFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyAlignmentFormats" attribute
     */
    public void xsetApplyAlignmentFormats(org.apache.xmlbeans.XmlBoolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$52);
            }
            target.set(applyAlignmentFormats);
        }
    }
    
    /**
     * Unsets the "applyAlignmentFormats" attribute
     */
    public void unsetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYALIGNMENTFORMATS$52);
        }
    }
    
    /**
     * Gets the "applyWidthHeightFormats" attribute
     */
    public boolean getApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyWidthHeightFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            return target;
        }
    }
    
    /**
     * True if has "applyWidthHeightFormats" attribute
     */
    public boolean isSetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54) != null;
        }
    }
    
    /**
     * Sets the "applyWidthHeightFormats" attribute
     */
    public void setApplyWidthHeightFormats(boolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            }
            target.setBooleanValue(applyWidthHeightFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyWidthHeightFormats" attribute
     */
    public void xsetApplyWidthHeightFormats(org.apache.xmlbeans.XmlBoolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
            }
            target.set(applyWidthHeightFormats);
        }
    }
    
    /**
     * Unsets the "applyWidthHeightFormats" attribute
     */
    public void unsetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYWIDTHHEIGHTFORMATS$54);
        }
    }
    
    /**
     * Gets the "dataCaption" attribute
     */
    public java.lang.String getDataCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACAPTION$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDataCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACAPTION$56);
            return target;
        }
    }
    
    /**
     * Sets the "dataCaption" attribute
     */
    public void setDataCaption(java.lang.String dataCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACAPTION$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATACAPTION$56);
            }
            target.setStringValue(dataCaption);
        }
    }
    
    /**
     * Sets (as xml) the "dataCaption" attribute
     */
    public void xsetDataCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring dataCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACAPTION$56);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DATACAPTION$56);
            }
            target.set(dataCaption);
        }
    }
    
    /**
     * Gets the "grandTotalCaption" attribute
     */
    public java.lang.String getGrandTotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDTOTALCAPTION$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "grandTotalCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetGrandTotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(GRANDTOTALCAPTION$58);
            return target;
        }
    }
    
    /**
     * True if has "grandTotalCaption" attribute
     */
    public boolean isSetGrandTotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRANDTOTALCAPTION$58) != null;
        }
    }
    
    /**
     * Sets the "grandTotalCaption" attribute
     */
    public void setGrandTotalCaption(java.lang.String grandTotalCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDTOTALCAPTION$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRANDTOTALCAPTION$58);
            }
            target.setStringValue(grandTotalCaption);
        }
    }
    
    /**
     * Sets (as xml) the "grandTotalCaption" attribute
     */
    public void xsetGrandTotalCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring grandTotalCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(GRANDTOTALCAPTION$58);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(GRANDTOTALCAPTION$58);
            }
            target.set(grandTotalCaption);
        }
    }
    
    /**
     * Unsets the "grandTotalCaption" attribute
     */
    public void unsetGrandTotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRANDTOTALCAPTION$58);
        }
    }
    
    /**
     * Gets the "errorCaption" attribute
     */
    public java.lang.String getErrorCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCAPTION$60);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetErrorCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERRORCAPTION$60);
            return target;
        }
    }
    
    /**
     * True if has "errorCaption" attribute
     */
    public boolean isSetErrorCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORCAPTION$60) != null;
        }
    }
    
    /**
     * Sets the "errorCaption" attribute
     */
    public void setErrorCaption(java.lang.String errorCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCAPTION$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCAPTION$60);
            }
            target.setStringValue(errorCaption);
        }
    }
    
    /**
     * Sets (as xml) the "errorCaption" attribute
     */
    public void xsetErrorCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring errorCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERRORCAPTION$60);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ERRORCAPTION$60);
            }
            target.set(errorCaption);
        }
    }
    
    /**
     * Unsets the "errorCaption" attribute
     */
    public void unsetErrorCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORCAPTION$60);
        }
    }
    
    /**
     * Gets the "showError" attribute
     */
    public boolean getShowError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWERROR$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWERROR$62);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWERROR$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWERROR$62);
            }
            return target;
        }
    }
    
    /**
     * True if has "showError" attribute
     */
    public boolean isSetShowError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWERROR$62) != null;
        }
    }
    
    /**
     * Sets the "showError" attribute
     */
    public void setShowError(boolean showError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWERROR$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWERROR$62);
            }
            target.setBooleanValue(showError);
        }
    }
    
    /**
     * Sets (as xml) the "showError" attribute
     */
    public void xsetShowError(org.apache.xmlbeans.XmlBoolean showError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWERROR$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWERROR$62);
            }
            target.set(showError);
        }
    }
    
    /**
     * Unsets the "showError" attribute
     */
    public void unsetShowError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWERROR$62);
        }
    }
    
    /**
     * Gets the "missingCaption" attribute
     */
    public java.lang.String getMissingCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSINGCAPTION$64);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "missingCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMissingCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MISSINGCAPTION$64);
            return target;
        }
    }
    
    /**
     * True if has "missingCaption" attribute
     */
    public boolean isSetMissingCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MISSINGCAPTION$64) != null;
        }
    }
    
    /**
     * Sets the "missingCaption" attribute
     */
    public void setMissingCaption(java.lang.String missingCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSINGCAPTION$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSINGCAPTION$64);
            }
            target.setStringValue(missingCaption);
        }
    }
    
    /**
     * Sets (as xml) the "missingCaption" attribute
     */
    public void xsetMissingCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring missingCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MISSINGCAPTION$64);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MISSINGCAPTION$64);
            }
            target.set(missingCaption);
        }
    }
    
    /**
     * Unsets the "missingCaption" attribute
     */
    public void unsetMissingCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MISSINGCAPTION$64);
        }
    }
    
    /**
     * Gets the "showMissing" attribute
     */
    public boolean getShowMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMISSING$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMISSING$66);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMissing" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMISSING$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMISSING$66);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMissing" attribute
     */
    public boolean isSetShowMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMISSING$66) != null;
        }
    }
    
    /**
     * Sets the "showMissing" attribute
     */
    public void setShowMissing(boolean showMissing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMISSING$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMISSING$66);
            }
            target.setBooleanValue(showMissing);
        }
    }
    
    /**
     * Sets (as xml) the "showMissing" attribute
     */
    public void xsetShowMissing(org.apache.xmlbeans.XmlBoolean showMissing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMISSING$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMISSING$66);
            }
            target.set(showMissing);
        }
    }
    
    /**
     * Unsets the "showMissing" attribute
     */
    public void unsetShowMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMISSING$66);
        }
    }
    
    /**
     * Gets the "pageStyle" attribute
     */
    public java.lang.String getPageStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGESTYLE$68);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPageStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PAGESTYLE$68);
            return target;
        }
    }
    
    /**
     * True if has "pageStyle" attribute
     */
    public boolean isSetPageStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAGESTYLE$68) != null;
        }
    }
    
    /**
     * Sets the "pageStyle" attribute
     */
    public void setPageStyle(java.lang.String pageStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGESTYLE$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGESTYLE$68);
            }
            target.setStringValue(pageStyle);
        }
    }
    
    /**
     * Sets (as xml) the "pageStyle" attribute
     */
    public void xsetPageStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring pageStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PAGESTYLE$68);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PAGESTYLE$68);
            }
            target.set(pageStyle);
        }
    }
    
    /**
     * Unsets the "pageStyle" attribute
     */
    public void unsetPageStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAGESTYLE$68);
        }
    }
    
    /**
     * Gets the "pivotTableStyle" attribute
     */
    public java.lang.String getPivotTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTTABLESTYLE$70);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pivotTableStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPivotTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PIVOTTABLESTYLE$70);
            return target;
        }
    }
    
    /**
     * True if has "pivotTableStyle" attribute
     */
    public boolean isSetPivotTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PIVOTTABLESTYLE$70) != null;
        }
    }
    
    /**
     * Sets the "pivotTableStyle" attribute
     */
    public void setPivotTableStyle(java.lang.String pivotTableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTTABLESTYLE$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIVOTTABLESTYLE$70);
            }
            target.setStringValue(pivotTableStyle);
        }
    }
    
    /**
     * Sets (as xml) the "pivotTableStyle" attribute
     */
    public void xsetPivotTableStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring pivotTableStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PIVOTTABLESTYLE$70);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PIVOTTABLESTYLE$70);
            }
            target.set(pivotTableStyle);
        }
    }
    
    /**
     * Unsets the "pivotTableStyle" attribute
     */
    public void unsetPivotTableStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PIVOTTABLESTYLE$70);
        }
    }
    
    /**
     * Gets the "vacatedStyle" attribute
     */
    public java.lang.String getVacatedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VACATEDSTYLE$72);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vacatedStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetVacatedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VACATEDSTYLE$72);
            return target;
        }
    }
    
    /**
     * True if has "vacatedStyle" attribute
     */
    public boolean isSetVacatedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VACATEDSTYLE$72) != null;
        }
    }
    
    /**
     * Sets the "vacatedStyle" attribute
     */
    public void setVacatedStyle(java.lang.String vacatedStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VACATEDSTYLE$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VACATEDSTYLE$72);
            }
            target.setStringValue(vacatedStyle);
        }
    }
    
    /**
     * Sets (as xml) the "vacatedStyle" attribute
     */
    public void xsetVacatedStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring vacatedStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(VACATEDSTYLE$72);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(VACATEDSTYLE$72);
            }
            target.set(vacatedStyle);
        }
    }
    
    /**
     * Unsets the "vacatedStyle" attribute
     */
    public void unsetVacatedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VACATEDSTYLE$72);
        }
    }
    
    /**
     * Gets the "tag" attribute
     */
    public java.lang.String getTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAG$74);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tag" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TAG$74);
            return target;
        }
    }
    
    /**
     * True if has "tag" attribute
     */
    public boolean isSetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TAG$74) != null;
        }
    }
    
    /**
     * Sets the "tag" attribute
     */
    public void setTag(java.lang.String tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAG$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAG$74);
            }
            target.setStringValue(tag);
        }
    }
    
    /**
     * Sets (as xml) the "tag" attribute
     */
    public void xsetTag(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TAG$74);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TAG$74);
            }
            target.set(tag);
        }
    }
    
    /**
     * Unsets the "tag" attribute
     */
    public void unsetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TAG$74);
        }
    }
    
    /**
     * Gets the "updatedVersion" attribute
     */
    public short getUpdatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEDVERSION$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPDATEDVERSION$76);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "updatedVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUpdatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(UPDATEDVERSION$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(UPDATEDVERSION$76);
            }
            return target;
        }
    }
    
    /**
     * True if has "updatedVersion" attribute
     */
    public boolean isSetUpdatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPDATEDVERSION$76) != null;
        }
    }
    
    /**
     * Sets the "updatedVersion" attribute
     */
    public void setUpdatedVersion(short updatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEDVERSION$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEDVERSION$76);
            }
            target.setShortValue(updatedVersion);
        }
    }
    
    /**
     * Sets (as xml) the "updatedVersion" attribute
     */
    public void xsetUpdatedVersion(org.apache.xmlbeans.XmlUnsignedByte updatedVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(UPDATEDVERSION$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(UPDATEDVERSION$76);
            }
            target.set(updatedVersion);
        }
    }
    
    /**
     * Unsets the "updatedVersion" attribute
     */
    public void unsetUpdatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPDATEDVERSION$76);
        }
    }
    
    /**
     * Gets the "minRefreshableVersion" attribute
     */
    public short getMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINREFRESHABLEVERSION$78);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "minRefreshableVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(MINREFRESHABLEVERSION$78);
            }
            return target;
        }
    }
    
    /**
     * True if has "minRefreshableVersion" attribute
     */
    public boolean isSetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINREFRESHABLEVERSION$78) != null;
        }
    }
    
    /**
     * Sets the "minRefreshableVersion" attribute
     */
    public void setMinRefreshableVersion(short minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINREFRESHABLEVERSION$78);
            }
            target.setShortValue(minRefreshableVersion);
        }
    }
    
    /**
     * Sets (as xml) the "minRefreshableVersion" attribute
     */
    public void xsetMinRefreshableVersion(org.apache.xmlbeans.XmlUnsignedByte minRefreshableVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(MINREFRESHABLEVERSION$78);
            }
            target.set(minRefreshableVersion);
        }
    }
    
    /**
     * Unsets the "minRefreshableVersion" attribute
     */
    public void unsetMinRefreshableVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINREFRESHABLEVERSION$78);
        }
    }
    
    /**
     * Gets the "asteriskTotals" attribute
     */
    public boolean getAsteriskTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASTERISKTOTALS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ASTERISKTOTALS$80);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "asteriskTotals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAsteriskTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASTERISKTOTALS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ASTERISKTOTALS$80);
            }
            return target;
        }
    }
    
    /**
     * True if has "asteriskTotals" attribute
     */
    public boolean isSetAsteriskTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASTERISKTOTALS$80) != null;
        }
    }
    
    /**
     * Sets the "asteriskTotals" attribute
     */
    public void setAsteriskTotals(boolean asteriskTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASTERISKTOTALS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASTERISKTOTALS$80);
            }
            target.setBooleanValue(asteriskTotals);
        }
    }
    
    /**
     * Sets (as xml) the "asteriskTotals" attribute
     */
    public void xsetAsteriskTotals(org.apache.xmlbeans.XmlBoolean asteriskTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ASTERISKTOTALS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ASTERISKTOTALS$80);
            }
            target.set(asteriskTotals);
        }
    }
    
    /**
     * Unsets the "asteriskTotals" attribute
     */
    public void unsetAsteriskTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASTERISKTOTALS$80);
        }
    }
    
    /**
     * Gets the "showItems" attribute
     */
    public boolean getShowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWITEMS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWITEMS$82);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showItems" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWITEMS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWITEMS$82);
            }
            return target;
        }
    }
    
    /**
     * True if has "showItems" attribute
     */
    public boolean isSetShowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWITEMS$82) != null;
        }
    }
    
    /**
     * Sets the "showItems" attribute
     */
    public void setShowItems(boolean showItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWITEMS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWITEMS$82);
            }
            target.setBooleanValue(showItems);
        }
    }
    
    /**
     * Sets (as xml) the "showItems" attribute
     */
    public void xsetShowItems(org.apache.xmlbeans.XmlBoolean showItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWITEMS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWITEMS$82);
            }
            target.set(showItems);
        }
    }
    
    /**
     * Unsets the "showItems" attribute
     */
    public void unsetShowItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWITEMS$82);
        }
    }
    
    /**
     * Gets the "editData" attribute
     */
    public boolean getEditData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITDATA$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDITDATA$84);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "editData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEditData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDITDATA$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EDITDATA$84);
            }
            return target;
        }
    }
    
    /**
     * True if has "editData" attribute
     */
    public boolean isSetEditData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDITDATA$84) != null;
        }
    }
    
    /**
     * Sets the "editData" attribute
     */
    public void setEditData(boolean editData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITDATA$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITDATA$84);
            }
            target.setBooleanValue(editData);
        }
    }
    
    /**
     * Sets (as xml) the "editData" attribute
     */
    public void xsetEditData(org.apache.xmlbeans.XmlBoolean editData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDITDATA$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EDITDATA$84);
            }
            target.set(editData);
        }
    }
    
    /**
     * Unsets the "editData" attribute
     */
    public void unsetEditData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDITDATA$84);
        }
    }
    
    /**
     * Gets the "disableFieldList" attribute
     */
    public boolean getDisableFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEFIELDLIST$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISABLEFIELDLIST$86);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disableFieldList" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisableFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEFIELDLIST$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DISABLEFIELDLIST$86);
            }
            return target;
        }
    }
    
    /**
     * True if has "disableFieldList" attribute
     */
    public boolean isSetDisableFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLEFIELDLIST$86) != null;
        }
    }
    
    /**
     * Sets the "disableFieldList" attribute
     */
    public void setDisableFieldList(boolean disableFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEFIELDLIST$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEFIELDLIST$86);
            }
            target.setBooleanValue(disableFieldList);
        }
    }
    
    /**
     * Sets (as xml) the "disableFieldList" attribute
     */
    public void xsetDisableFieldList(org.apache.xmlbeans.XmlBoolean disableFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEFIELDLIST$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLEFIELDLIST$86);
            }
            target.set(disableFieldList);
        }
    }
    
    /**
     * Unsets the "disableFieldList" attribute
     */
    public void unsetDisableFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLEFIELDLIST$86);
        }
    }
    
    /**
     * Gets the "showCalcMbrs" attribute
     */
    public boolean getShowCalcMbrs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCALCMBRS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWCALCMBRS$88);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showCalcMbrs" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowCalcMbrs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCALCMBRS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWCALCMBRS$88);
            }
            return target;
        }
    }
    
    /**
     * True if has "showCalcMbrs" attribute
     */
    public boolean isSetShowCalcMbrs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCALCMBRS$88) != null;
        }
    }
    
    /**
     * Sets the "showCalcMbrs" attribute
     */
    public void setShowCalcMbrs(boolean showCalcMbrs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCALCMBRS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCALCMBRS$88);
            }
            target.setBooleanValue(showCalcMbrs);
        }
    }
    
    /**
     * Sets (as xml) the "showCalcMbrs" attribute
     */
    public void xsetShowCalcMbrs(org.apache.xmlbeans.XmlBoolean showCalcMbrs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCALCMBRS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCALCMBRS$88);
            }
            target.set(showCalcMbrs);
        }
    }
    
    /**
     * Unsets the "showCalcMbrs" attribute
     */
    public void unsetShowCalcMbrs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCALCMBRS$88);
        }
    }
    
    /**
     * Gets the "visualTotals" attribute
     */
    public boolean getVisualTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISUALTOTALS$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VISUALTOTALS$90);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "visualTotals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVisualTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VISUALTOTALS$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VISUALTOTALS$90);
            }
            return target;
        }
    }
    
    /**
     * True if has "visualTotals" attribute
     */
    public boolean isSetVisualTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VISUALTOTALS$90) != null;
        }
    }
    
    /**
     * Sets the "visualTotals" attribute
     */
    public void setVisualTotals(boolean visualTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISUALTOTALS$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISUALTOTALS$90);
            }
            target.setBooleanValue(visualTotals);
        }
    }
    
    /**
     * Sets (as xml) the "visualTotals" attribute
     */
    public void xsetVisualTotals(org.apache.xmlbeans.XmlBoolean visualTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VISUALTOTALS$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VISUALTOTALS$90);
            }
            target.set(visualTotals);
        }
    }
    
    /**
     * Unsets the "visualTotals" attribute
     */
    public void unsetVisualTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VISUALTOTALS$90);
        }
    }
    
    /**
     * Gets the "showMultipleLabel" attribute
     */
    public boolean getShowMultipleLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMULTIPLELABEL$92);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMultipleLabel" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMultipleLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMULTIPLELABEL$92);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMultipleLabel" attribute
     */
    public boolean isSetShowMultipleLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMULTIPLELABEL$92) != null;
        }
    }
    
    /**
     * Sets the "showMultipleLabel" attribute
     */
    public void setShowMultipleLabel(boolean showMultipleLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMULTIPLELABEL$92);
            }
            target.setBooleanValue(showMultipleLabel);
        }
    }
    
    /**
     * Sets (as xml) the "showMultipleLabel" attribute
     */
    public void xsetShowMultipleLabel(org.apache.xmlbeans.XmlBoolean showMultipleLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMULTIPLELABEL$92);
            }
            target.set(showMultipleLabel);
        }
    }
    
    /**
     * Unsets the "showMultipleLabel" attribute
     */
    public void unsetShowMultipleLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMULTIPLELABEL$92);
        }
    }
    
    /**
     * Gets the "showDataDropDown" attribute
     */
    public boolean getShowDataDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATADROPDOWN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDATADROPDOWN$94);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDataDropDown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDataDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDATADROPDOWN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDATADROPDOWN$94);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDataDropDown" attribute
     */
    public boolean isSetShowDataDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDATADROPDOWN$94) != null;
        }
    }
    
    /**
     * Sets the "showDataDropDown" attribute
     */
    public void setShowDataDropDown(boolean showDataDropDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATADROPDOWN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDATADROPDOWN$94);
            }
            target.setBooleanValue(showDataDropDown);
        }
    }
    
    /**
     * Sets (as xml) the "showDataDropDown" attribute
     */
    public void xsetShowDataDropDown(org.apache.xmlbeans.XmlBoolean showDataDropDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDATADROPDOWN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDATADROPDOWN$94);
            }
            target.set(showDataDropDown);
        }
    }
    
    /**
     * Unsets the "showDataDropDown" attribute
     */
    public void unsetShowDataDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDATADROPDOWN$94);
        }
    }
    
    /**
     * Gets the "showDrill" attribute
     */
    public boolean getShowDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDRILL$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDRILL$96);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDrill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDRILL$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDRILL$96);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDrill" attribute
     */
    public boolean isSetShowDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDRILL$96) != null;
        }
    }
    
    /**
     * Sets the "showDrill" attribute
     */
    public void setShowDrill(boolean showDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDRILL$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDRILL$96);
            }
            target.setBooleanValue(showDrill);
        }
    }
    
    /**
     * Sets (as xml) the "showDrill" attribute
     */
    public void xsetShowDrill(org.apache.xmlbeans.XmlBoolean showDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDRILL$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDRILL$96);
            }
            target.set(showDrill);
        }
    }
    
    /**
     * Unsets the "showDrill" attribute
     */
    public void unsetShowDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDRILL$96);
        }
    }
    
    /**
     * Gets the "printDrill" attribute
     */
    public boolean getPrintDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINTDRILL$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRINTDRILL$98);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "printDrill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrintDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRINTDRILL$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRINTDRILL$98);
            }
            return target;
        }
    }
    
    /**
     * True if has "printDrill" attribute
     */
    public boolean isSetPrintDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRINTDRILL$98) != null;
        }
    }
    
    /**
     * Sets the "printDrill" attribute
     */
    public void setPrintDrill(boolean printDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINTDRILL$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRINTDRILL$98);
            }
            target.setBooleanValue(printDrill);
        }
    }
    
    /**
     * Sets (as xml) the "printDrill" attribute
     */
    public void xsetPrintDrill(org.apache.xmlbeans.XmlBoolean printDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRINTDRILL$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRINTDRILL$98);
            }
            target.set(printDrill);
        }
    }
    
    /**
     * Unsets the "printDrill" attribute
     */
    public void unsetPrintDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRINTDRILL$98);
        }
    }
    
    /**
     * Gets the "showMemberPropertyTips" attribute
     */
    public boolean getShowMemberPropertyTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWMEMBERPROPERTYTIPS$100);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showMemberPropertyTips" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowMemberPropertyTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWMEMBERPROPERTYTIPS$100);
            }
            return target;
        }
    }
    
    /**
     * True if has "showMemberPropertyTips" attribute
     */
    public boolean isSetShowMemberPropertyTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100) != null;
        }
    }
    
    /**
     * Sets the "showMemberPropertyTips" attribute
     */
    public void setShowMemberPropertyTips(boolean showMemberPropertyTips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            }
            target.setBooleanValue(showMemberPropertyTips);
        }
    }
    
    /**
     * Sets (as xml) the "showMemberPropertyTips" attribute
     */
    public void xsetShowMemberPropertyTips(org.apache.xmlbeans.XmlBoolean showMemberPropertyTips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
            }
            target.set(showMemberPropertyTips);
        }
    }
    
    /**
     * Unsets the "showMemberPropertyTips" attribute
     */
    public void unsetShowMemberPropertyTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWMEMBERPROPERTYTIPS$100);
        }
    }
    
    /**
     * Gets the "showDataTips" attribute
     */
    public boolean getShowDataTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATATIPS$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDATATIPS$102);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDataTips" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDataTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDATATIPS$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDATATIPS$102);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDataTips" attribute
     */
    public boolean isSetShowDataTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDATATIPS$102) != null;
        }
    }
    
    /**
     * Sets the "showDataTips" attribute
     */
    public void setShowDataTips(boolean showDataTips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDATATIPS$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDATATIPS$102);
            }
            target.setBooleanValue(showDataTips);
        }
    }
    
    /**
     * Sets (as xml) the "showDataTips" attribute
     */
    public void xsetShowDataTips(org.apache.xmlbeans.XmlBoolean showDataTips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDATATIPS$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDATATIPS$102);
            }
            target.set(showDataTips);
        }
    }
    
    /**
     * Unsets the "showDataTips" attribute
     */
    public void unsetShowDataTips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDATATIPS$102);
        }
    }
    
    /**
     * Gets the "enableWizard" attribute
     */
    public boolean getEnableWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEWIZARD$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEWIZARD$104);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableWizard" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEWIZARD$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENABLEWIZARD$104);
            }
            return target;
        }
    }
    
    /**
     * True if has "enableWizard" attribute
     */
    public boolean isSetEnableWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLEWIZARD$104) != null;
        }
    }
    
    /**
     * Sets the "enableWizard" attribute
     */
    public void setEnableWizard(boolean enableWizard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEWIZARD$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEWIZARD$104);
            }
            target.setBooleanValue(enableWizard);
        }
    }
    
    /**
     * Sets (as xml) the "enableWizard" attribute
     */
    public void xsetEnableWizard(org.apache.xmlbeans.XmlBoolean enableWizard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEWIZARD$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLEWIZARD$104);
            }
            target.set(enableWizard);
        }
    }
    
    /**
     * Unsets the "enableWizard" attribute
     */
    public void unsetEnableWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLEWIZARD$104);
        }
    }
    
    /**
     * Gets the "enableDrill" attribute
     */
    public boolean getEnableDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEDRILL$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEDRILL$106);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableDrill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEDRILL$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENABLEDRILL$106);
            }
            return target;
        }
    }
    
    /**
     * True if has "enableDrill" attribute
     */
    public boolean isSetEnableDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLEDRILL$106) != null;
        }
    }
    
    /**
     * Sets the "enableDrill" attribute
     */
    public void setEnableDrill(boolean enableDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEDRILL$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEDRILL$106);
            }
            target.setBooleanValue(enableDrill);
        }
    }
    
    /**
     * Sets (as xml) the "enableDrill" attribute
     */
    public void xsetEnableDrill(org.apache.xmlbeans.XmlBoolean enableDrill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEDRILL$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLEDRILL$106);
            }
            target.set(enableDrill);
        }
    }
    
    /**
     * Unsets the "enableDrill" attribute
     */
    public void unsetEnableDrill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLEDRILL$106);
        }
    }
    
    /**
     * Gets the "enableFieldProperties" attribute
     */
    public boolean getEnableFieldProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEFIELDPROPERTIES$108);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableFieldProperties" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableFieldProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENABLEFIELDPROPERTIES$108);
            }
            return target;
        }
    }
    
    /**
     * True if has "enableFieldProperties" attribute
     */
    public boolean isSetEnableFieldProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108) != null;
        }
    }
    
    /**
     * Sets the "enableFieldProperties" attribute
     */
    public void setEnableFieldProperties(boolean enableFieldProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEFIELDPROPERTIES$108);
            }
            target.setBooleanValue(enableFieldProperties);
        }
    }
    
    /**
     * Sets (as xml) the "enableFieldProperties" attribute
     */
    public void xsetEnableFieldProperties(org.apache.xmlbeans.XmlBoolean enableFieldProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLEFIELDPROPERTIES$108);
            }
            target.set(enableFieldProperties);
        }
    }
    
    /**
     * Unsets the "enableFieldProperties" attribute
     */
    public void unsetEnableFieldProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLEFIELDPROPERTIES$108);
        }
    }
    
    /**
     * Gets the "preserveFormatting" attribute
     */
    public boolean getPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMATTING$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESERVEFORMATTING$110);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preserveFormatting" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMATTING$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRESERVEFORMATTING$110);
            }
            return target;
        }
    }
    
    /**
     * True if has "preserveFormatting" attribute
     */
    public boolean isSetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESERVEFORMATTING$110) != null;
        }
    }
    
    /**
     * Sets the "preserveFormatting" attribute
     */
    public void setPreserveFormatting(boolean preserveFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESERVEFORMATTING$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESERVEFORMATTING$110);
            }
            target.setBooleanValue(preserveFormatting);
        }
    }
    
    /**
     * Sets (as xml) the "preserveFormatting" attribute
     */
    public void xsetPreserveFormatting(org.apache.xmlbeans.XmlBoolean preserveFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRESERVEFORMATTING$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRESERVEFORMATTING$110);
            }
            target.set(preserveFormatting);
        }
    }
    
    /**
     * Unsets the "preserveFormatting" attribute
     */
    public void unsetPreserveFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESERVEFORMATTING$110);
        }
    }
    
    /**
     * Gets the "useAutoFormatting" attribute
     */
    public boolean getUseAutoFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEAUTOFORMATTING$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEAUTOFORMATTING$112);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useAutoFormatting" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseAutoFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEAUTOFORMATTING$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEAUTOFORMATTING$112);
            }
            return target;
        }
    }
    
    /**
     * True if has "useAutoFormatting" attribute
     */
    public boolean isSetUseAutoFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEAUTOFORMATTING$112) != null;
        }
    }
    
    /**
     * Sets the "useAutoFormatting" attribute
     */
    public void setUseAutoFormatting(boolean useAutoFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEAUTOFORMATTING$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEAUTOFORMATTING$112);
            }
            target.setBooleanValue(useAutoFormatting);
        }
    }
    
    /**
     * Sets (as xml) the "useAutoFormatting" attribute
     */
    public void xsetUseAutoFormatting(org.apache.xmlbeans.XmlBoolean useAutoFormatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEAUTOFORMATTING$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEAUTOFORMATTING$112);
            }
            target.set(useAutoFormatting);
        }
    }
    
    /**
     * Unsets the "useAutoFormatting" attribute
     */
    public void unsetUseAutoFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEAUTOFORMATTING$112);
        }
    }
    
    /**
     * Gets the "pageWrap" attribute
     */
    public long getPageWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEWRAP$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGEWRAP$114);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageWrap" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetPageWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAGEWRAP$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(PAGEWRAP$114);
            }
            return target;
        }
    }
    
    /**
     * True if has "pageWrap" attribute
     */
    public boolean isSetPageWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAGEWRAP$114) != null;
        }
    }
    
    /**
     * Sets the "pageWrap" attribute
     */
    public void setPageWrap(long pageWrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEWRAP$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEWRAP$114);
            }
            target.setLongValue(pageWrap);
        }
    }
    
    /**
     * Sets (as xml) the "pageWrap" attribute
     */
    public void xsetPageWrap(org.apache.xmlbeans.XmlUnsignedInt pageWrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PAGEWRAP$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PAGEWRAP$114);
            }
            target.set(pageWrap);
        }
    }
    
    /**
     * Unsets the "pageWrap" attribute
     */
    public void unsetPageWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAGEWRAP$114);
        }
    }
    
    /**
     * Gets the "pageOverThenDown" attribute
     */
    public boolean getPageOverThenDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGEOVERTHENDOWN$116);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageOverThenDown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPageOverThenDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PAGEOVERTHENDOWN$116);
            }
            return target;
        }
    }
    
    /**
     * True if has "pageOverThenDown" attribute
     */
    public boolean isSetPageOverThenDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAGEOVERTHENDOWN$116) != null;
        }
    }
    
    /**
     * Sets the "pageOverThenDown" attribute
     */
    public void setPageOverThenDown(boolean pageOverThenDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEOVERTHENDOWN$116);
            }
            target.setBooleanValue(pageOverThenDown);
        }
    }
    
    /**
     * Sets (as xml) the "pageOverThenDown" attribute
     */
    public void xsetPageOverThenDown(org.apache.xmlbeans.XmlBoolean pageOverThenDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PAGEOVERTHENDOWN$116);
            }
            target.set(pageOverThenDown);
        }
    }
    
    /**
     * Unsets the "pageOverThenDown" attribute
     */
    public void unsetPageOverThenDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAGEOVERTHENDOWN$116);
        }
    }
    
    /**
     * Gets the "subtotalHiddenItems" attribute
     */
    public boolean getSubtotalHiddenItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUBTOTALHIDDENITEMS$118);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "subtotalHiddenItems" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSubtotalHiddenItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUBTOTALHIDDENITEMS$118);
            }
            return target;
        }
    }
    
    /**
     * True if has "subtotalHiddenItems" attribute
     */
    public boolean isSetSubtotalHiddenItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118) != null;
        }
    }
    
    /**
     * Sets the "subtotalHiddenItems" attribute
     */
    public void setSubtotalHiddenItems(boolean subtotalHiddenItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTOTALHIDDENITEMS$118);
            }
            target.setBooleanValue(subtotalHiddenItems);
        }
    }
    
    /**
     * Sets (as xml) the "subtotalHiddenItems" attribute
     */
    public void xsetSubtotalHiddenItems(org.apache.xmlbeans.XmlBoolean subtotalHiddenItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUBTOTALHIDDENITEMS$118);
            }
            target.set(subtotalHiddenItems);
        }
    }
    
    /**
     * Unsets the "subtotalHiddenItems" attribute
     */
    public void unsetSubtotalHiddenItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTOTALHIDDENITEMS$118);
        }
    }
    
    /**
     * Gets the "rowGrandTotals" attribute
     */
    public boolean getRowGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWGRANDTOTALS$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWGRANDTOTALS$120);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowGrandTotals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRowGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWGRANDTOTALS$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ROWGRANDTOTALS$120);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowGrandTotals" attribute
     */
    public boolean isSetRowGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWGRANDTOTALS$120) != null;
        }
    }
    
    /**
     * Sets the "rowGrandTotals" attribute
     */
    public void setRowGrandTotals(boolean rowGrandTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWGRANDTOTALS$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWGRANDTOTALS$120);
            }
            target.setBooleanValue(rowGrandTotals);
        }
    }
    
    /**
     * Sets (as xml) the "rowGrandTotals" attribute
     */
    public void xsetRowGrandTotals(org.apache.xmlbeans.XmlBoolean rowGrandTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ROWGRANDTOTALS$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ROWGRANDTOTALS$120);
            }
            target.set(rowGrandTotals);
        }
    }
    
    /**
     * Unsets the "rowGrandTotals" attribute
     */
    public void unsetRowGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWGRANDTOTALS$120);
        }
    }
    
    /**
     * Gets the "colGrandTotals" attribute
     */
    public boolean getColGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLGRANDTOTALS$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLGRANDTOTALS$122);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "colGrandTotals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetColGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLGRANDTOTALS$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COLGRANDTOTALS$122);
            }
            return target;
        }
    }
    
    /**
     * True if has "colGrandTotals" attribute
     */
    public boolean isSetColGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLGRANDTOTALS$122) != null;
        }
    }
    
    /**
     * Sets the "colGrandTotals" attribute
     */
    public void setColGrandTotals(boolean colGrandTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLGRANDTOTALS$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLGRANDTOTALS$122);
            }
            target.setBooleanValue(colGrandTotals);
        }
    }
    
    /**
     * Sets (as xml) the "colGrandTotals" attribute
     */
    public void xsetColGrandTotals(org.apache.xmlbeans.XmlBoolean colGrandTotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLGRANDTOTALS$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COLGRANDTOTALS$122);
            }
            target.set(colGrandTotals);
        }
    }
    
    /**
     * Unsets the "colGrandTotals" attribute
     */
    public void unsetColGrandTotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLGRANDTOTALS$122);
        }
    }
    
    /**
     * Gets the "fieldPrintTitles" attribute
     */
    public boolean getFieldPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPRINTTITLES$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDPRINTTITLES$124);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldPrintTitles" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFieldPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDPRINTTITLES$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIELDPRINTTITLES$124);
            }
            return target;
        }
    }
    
    /**
     * True if has "fieldPrintTitles" attribute
     */
    public boolean isSetFieldPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDPRINTTITLES$124) != null;
        }
    }
    
    /**
     * Sets the "fieldPrintTitles" attribute
     */
    public void setFieldPrintTitles(boolean fieldPrintTitles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPRINTTITLES$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDPRINTTITLES$124);
            }
            target.setBooleanValue(fieldPrintTitles);
        }
    }
    
    /**
     * Sets (as xml) the "fieldPrintTitles" attribute
     */
    public void xsetFieldPrintTitles(org.apache.xmlbeans.XmlBoolean fieldPrintTitles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDPRINTTITLES$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIELDPRINTTITLES$124);
            }
            target.set(fieldPrintTitles);
        }
    }
    
    /**
     * Unsets the "fieldPrintTitles" attribute
     */
    public void unsetFieldPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDPRINTTITLES$124);
        }
    }
    
    /**
     * Gets the "itemPrintTitles" attribute
     */
    public boolean getItemPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMPRINTTITLES$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITEMPRINTTITLES$126);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemPrintTitles" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetItemPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITEMPRINTTITLES$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ITEMPRINTTITLES$126);
            }
            return target;
        }
    }
    
    /**
     * True if has "itemPrintTitles" attribute
     */
    public boolean isSetItemPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITEMPRINTTITLES$126) != null;
        }
    }
    
    /**
     * Sets the "itemPrintTitles" attribute
     */
    public void setItemPrintTitles(boolean itemPrintTitles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMPRINTTITLES$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMPRINTTITLES$126);
            }
            target.setBooleanValue(itemPrintTitles);
        }
    }
    
    /**
     * Sets (as xml) the "itemPrintTitles" attribute
     */
    public void xsetItemPrintTitles(org.apache.xmlbeans.XmlBoolean itemPrintTitles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITEMPRINTTITLES$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ITEMPRINTTITLES$126);
            }
            target.set(itemPrintTitles);
        }
    }
    
    /**
     * Unsets the "itemPrintTitles" attribute
     */
    public void unsetItemPrintTitles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITEMPRINTTITLES$126);
        }
    }
    
    /**
     * Gets the "mergeItem" attribute
     */
    public boolean getMergeItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGEITEM$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MERGEITEM$128);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mergeItem" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMergeItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MERGEITEM$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MERGEITEM$128);
            }
            return target;
        }
    }
    
    /**
     * True if has "mergeItem" attribute
     */
    public boolean isSetMergeItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MERGEITEM$128) != null;
        }
    }
    
    /**
     * Sets the "mergeItem" attribute
     */
    public void setMergeItem(boolean mergeItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MERGEITEM$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MERGEITEM$128);
            }
            target.setBooleanValue(mergeItem);
        }
    }
    
    /**
     * Sets (as xml) the "mergeItem" attribute
     */
    public void xsetMergeItem(org.apache.xmlbeans.XmlBoolean mergeItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MERGEITEM$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MERGEITEM$128);
            }
            target.set(mergeItem);
        }
    }
    
    /**
     * Unsets the "mergeItem" attribute
     */
    public void unsetMergeItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MERGEITEM$128);
        }
    }
    
    /**
     * Gets the "showDropZones" attribute
     */
    public boolean getShowDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPZONES$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDROPZONES$130);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDropZones" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPZONES$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDROPZONES$130);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDropZones" attribute
     */
    public boolean isSetShowDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDROPZONES$130) != null;
        }
    }
    
    /**
     * Sets the "showDropZones" attribute
     */
    public void setShowDropZones(boolean showDropZones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPZONES$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDROPZONES$130);
            }
            target.setBooleanValue(showDropZones);
        }
    }
    
    /**
     * Sets (as xml) the "showDropZones" attribute
     */
    public void xsetShowDropZones(org.apache.xmlbeans.XmlBoolean showDropZones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPZONES$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDROPZONES$130);
            }
            target.set(showDropZones);
        }
    }
    
    /**
     * Unsets the "showDropZones" attribute
     */
    public void unsetShowDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDROPZONES$130);
        }
    }
    
    /**
     * Gets the "createdVersion" attribute
     */
    public short getCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDVERSION$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CREATEDVERSION$132);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdVersion" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CREATEDVERSION$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(CREATEDVERSION$132);
            }
            return target;
        }
    }
    
    /**
     * True if has "createdVersion" attribute
     */
    public boolean isSetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATEDVERSION$132) != null;
        }
    }
    
    /**
     * Sets the "createdVersion" attribute
     */
    public void setCreatedVersion(short createdVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDVERSION$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDVERSION$132);
            }
            target.setShortValue(createdVersion);
        }
    }
    
    /**
     * Sets (as xml) the "createdVersion" attribute
     */
    public void xsetCreatedVersion(org.apache.xmlbeans.XmlUnsignedByte createdVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(CREATEDVERSION$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(CREATEDVERSION$132);
            }
            target.set(createdVersion);
        }
    }
    
    /**
     * Unsets the "createdVersion" attribute
     */
    public void unsetCreatedVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATEDVERSION$132);
        }
    }
    
    /**
     * Gets the "indent" attribute
     */
    public long getIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDENT$134);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "indent" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDENT$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(INDENT$134);
            }
            return target;
        }
    }
    
    /**
     * True if has "indent" attribute
     */
    public boolean isSetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDENT$134) != null;
        }
    }
    
    /**
     * Sets the "indent" attribute
     */
    public void setIndent(long indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDENT$134);
            }
            target.setLongValue(indent);
        }
    }
    
    /**
     * Sets (as xml) the "indent" attribute
     */
    public void xsetIndent(org.apache.xmlbeans.XmlUnsignedInt indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDENT$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(INDENT$134);
            }
            target.set(indent);
        }
    }
    
    /**
     * Unsets the "indent" attribute
     */
    public void unsetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDENT$134);
        }
    }
    
    /**
     * Gets the "showEmptyRow" attribute
     */
    public boolean getShowEmptyRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWEMPTYROW$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWEMPTYROW$136);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showEmptyRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowEmptyRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWEMPTYROW$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWEMPTYROW$136);
            }
            return target;
        }
    }
    
    /**
     * True if has "showEmptyRow" attribute
     */
    public boolean isSetShowEmptyRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWEMPTYROW$136) != null;
        }
    }
    
    /**
     * Sets the "showEmptyRow" attribute
     */
    public void setShowEmptyRow(boolean showEmptyRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWEMPTYROW$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWEMPTYROW$136);
            }
            target.setBooleanValue(showEmptyRow);
        }
    }
    
    /**
     * Sets (as xml) the "showEmptyRow" attribute
     */
    public void xsetShowEmptyRow(org.apache.xmlbeans.XmlBoolean showEmptyRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWEMPTYROW$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWEMPTYROW$136);
            }
            target.set(showEmptyRow);
        }
    }
    
    /**
     * Unsets the "showEmptyRow" attribute
     */
    public void unsetShowEmptyRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWEMPTYROW$136);
        }
    }
    
    /**
     * Gets the "showEmptyCol" attribute
     */
    public boolean getShowEmptyCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWEMPTYCOL$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWEMPTYCOL$138);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showEmptyCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowEmptyCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWEMPTYCOL$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWEMPTYCOL$138);
            }
            return target;
        }
    }
    
    /**
     * True if has "showEmptyCol" attribute
     */
    public boolean isSetShowEmptyCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWEMPTYCOL$138) != null;
        }
    }
    
    /**
     * Sets the "showEmptyCol" attribute
     */
    public void setShowEmptyCol(boolean showEmptyCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWEMPTYCOL$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWEMPTYCOL$138);
            }
            target.setBooleanValue(showEmptyCol);
        }
    }
    
    /**
     * Sets (as xml) the "showEmptyCol" attribute
     */
    public void xsetShowEmptyCol(org.apache.xmlbeans.XmlBoolean showEmptyCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWEMPTYCOL$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWEMPTYCOL$138);
            }
            target.set(showEmptyCol);
        }
    }
    
    /**
     * Unsets the "showEmptyCol" attribute
     */
    public void unsetShowEmptyCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWEMPTYCOL$138);
        }
    }
    
    /**
     * Gets the "showHeaders" attribute
     */
    public boolean getShowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHEADERS$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWHEADERS$140);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showHeaders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHEADERS$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWHEADERS$140);
            }
            return target;
        }
    }
    
    /**
     * True if has "showHeaders" attribute
     */
    public boolean isSetShowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWHEADERS$140) != null;
        }
    }
    
    /**
     * Sets the "showHeaders" attribute
     */
    public void setShowHeaders(boolean showHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWHEADERS$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWHEADERS$140);
            }
            target.setBooleanValue(showHeaders);
        }
    }
    
    /**
     * Sets (as xml) the "showHeaders" attribute
     */
    public void xsetShowHeaders(org.apache.xmlbeans.XmlBoolean showHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWHEADERS$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWHEADERS$140);
            }
            target.set(showHeaders);
        }
    }
    
    /**
     * Unsets the "showHeaders" attribute
     */
    public void unsetShowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWHEADERS$140);
        }
    }
    
    /**
     * Gets the "compact" attribute
     */
    public boolean getCompact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACT$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPACT$142);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compact" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACT$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPACT$142);
            }
            return target;
        }
    }
    
    /**
     * True if has "compact" attribute
     */
    public boolean isSetCompact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPACT$142) != null;
        }
    }
    
    /**
     * Sets the "compact" attribute
     */
    public void setCompact(boolean compact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACT$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPACT$142);
            }
            target.setBooleanValue(compact);
        }
    }
    
    /**
     * Sets (as xml) the "compact" attribute
     */
    public void xsetCompact(org.apache.xmlbeans.XmlBoolean compact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACT$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPACT$142);
            }
            target.set(compact);
        }
    }
    
    /**
     * Unsets the "compact" attribute
     */
    public void unsetCompact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPACT$142);
        }
    }
    
    /**
     * Gets the "outline" attribute
     */
    public boolean getOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINE$144);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "outline" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINE$144);
            }
            return target;
        }
    }
    
    /**
     * True if has "outline" attribute
     */
    public boolean isSetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINE$144) != null;
        }
    }
    
    /**
     * Sets the "outline" attribute
     */
    public void setOutline(boolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINE$144);
            }
            target.setBooleanValue(outline);
        }
    }
    
    /**
     * Sets (as xml) the "outline" attribute
     */
    public void xsetOutline(org.apache.xmlbeans.XmlBoolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINE$144);
            }
            target.set(outline);
        }
    }
    
    /**
     * Unsets the "outline" attribute
     */
    public void unsetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINE$144);
        }
    }
    
    /**
     * Gets the "outlineData" attribute
     */
    public boolean getOutlineData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINEDATA$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINEDATA$146);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutlineData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINEDATA$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINEDATA$146);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineData" attribute
     */
    public boolean isSetOutlineData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINEDATA$146) != null;
        }
    }
    
    /**
     * Sets the "outlineData" attribute
     */
    public void setOutlineData(boolean outlineData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINEDATA$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINEDATA$146);
            }
            target.setBooleanValue(outlineData);
        }
    }
    
    /**
     * Sets (as xml) the "outlineData" attribute
     */
    public void xsetOutlineData(org.apache.xmlbeans.XmlBoolean outlineData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINEDATA$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINEDATA$146);
            }
            target.set(outlineData);
        }
    }
    
    /**
     * Unsets the "outlineData" attribute
     */
    public void unsetOutlineData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINEDATA$146);
        }
    }
    
    /**
     * Gets the "compactData" attribute
     */
    public boolean getCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACTDATA$148);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPACTDATA$148);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compactData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACTDATA$148);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPACTDATA$148);
            }
            return target;
        }
    }
    
    /**
     * True if has "compactData" attribute
     */
    public boolean isSetCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPACTDATA$148) != null;
        }
    }
    
    /**
     * Sets the "compactData" attribute
     */
    public void setCompactData(boolean compactData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACTDATA$148);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPACTDATA$148);
            }
            target.setBooleanValue(compactData);
        }
    }
    
    /**
     * Sets (as xml) the "compactData" attribute
     */
    public void xsetCompactData(org.apache.xmlbeans.XmlBoolean compactData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACTDATA$148);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPACTDATA$148);
            }
            target.set(compactData);
        }
    }
    
    /**
     * Unsets the "compactData" attribute
     */
    public void unsetCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPACTDATA$148);
        }
    }
    
    /**
     * Gets the "published" attribute
     */
    public boolean getPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$150);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHED$150);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "published" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$150);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHED$150);
            }
            return target;
        }
    }
    
    /**
     * True if has "published" attribute
     */
    public boolean isSetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHED$150) != null;
        }
    }
    
    /**
     * Sets the "published" attribute
     */
    public void setPublished(boolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$150);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHED$150);
            }
            target.setBooleanValue(published);
        }
    }
    
    /**
     * Sets (as xml) the "published" attribute
     */
    public void xsetPublished(org.apache.xmlbeans.XmlBoolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$150);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHED$150);
            }
            target.set(published);
        }
    }
    
    /**
     * Unsets the "published" attribute
     */
    public void unsetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHED$150);
        }
    }
    
    /**
     * Gets the "gridDropZones" attribute
     */
    public boolean getGridDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDDROPZONES$152);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRIDDROPZONES$152);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "gridDropZones" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGridDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDDROPZONES$152);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GRIDDROPZONES$152);
            }
            return target;
        }
    }
    
    /**
     * True if has "gridDropZones" attribute
     */
    public boolean isSetGridDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRIDDROPZONES$152) != null;
        }
    }
    
    /**
     * Sets the "gridDropZones" attribute
     */
    public void setGridDropZones(boolean gridDropZones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDDROPZONES$152);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRIDDROPZONES$152);
            }
            target.setBooleanValue(gridDropZones);
        }
    }
    
    /**
     * Sets (as xml) the "gridDropZones" attribute
     */
    public void xsetGridDropZones(org.apache.xmlbeans.XmlBoolean gridDropZones)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRIDDROPZONES$152);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GRIDDROPZONES$152);
            }
            target.set(gridDropZones);
        }
    }
    
    /**
     * Unsets the "gridDropZones" attribute
     */
    public void unsetGridDropZones()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRIDDROPZONES$152);
        }
    }
    
    /**
     * Gets the "immersive" attribute
     */
    public boolean getImmersive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMMERSIVE$154);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMMERSIVE$154);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "immersive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetImmersive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMMERSIVE$154);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(IMMERSIVE$154);
            }
            return target;
        }
    }
    
    /**
     * True if has "immersive" attribute
     */
    public boolean isSetImmersive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMMERSIVE$154) != null;
        }
    }
    
    /**
     * Sets the "immersive" attribute
     */
    public void setImmersive(boolean immersive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMMERSIVE$154);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMMERSIVE$154);
            }
            target.setBooleanValue(immersive);
        }
    }
    
    /**
     * Sets (as xml) the "immersive" attribute
     */
    public void xsetImmersive(org.apache.xmlbeans.XmlBoolean immersive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMMERSIVE$154);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IMMERSIVE$154);
            }
            target.set(immersive);
        }
    }
    
    /**
     * Unsets the "immersive" attribute
     */
    public void unsetImmersive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMMERSIVE$154);
        }
    }
    
    /**
     * Gets the "multipleFieldFilters" attribute
     */
    public boolean getMultipleFieldFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MULTIPLEFIELDFILTERS$156);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "multipleFieldFilters" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMultipleFieldFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MULTIPLEFIELDFILTERS$156);
            }
            return target;
        }
    }
    
    /**
     * True if has "multipleFieldFilters" attribute
     */
    public boolean isSetMultipleFieldFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156) != null;
        }
    }
    
    /**
     * Sets the "multipleFieldFilters" attribute
     */
    public void setMultipleFieldFilters(boolean multipleFieldFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIPLEFIELDFILTERS$156);
            }
            target.setBooleanValue(multipleFieldFilters);
        }
    }
    
    /**
     * Sets (as xml) the "multipleFieldFilters" attribute
     */
    public void xsetMultipleFieldFilters(org.apache.xmlbeans.XmlBoolean multipleFieldFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MULTIPLEFIELDFILTERS$156);
            }
            target.set(multipleFieldFilters);
        }
    }
    
    /**
     * Unsets the "multipleFieldFilters" attribute
     */
    public void unsetMultipleFieldFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MULTIPLEFIELDFILTERS$156);
        }
    }
    
    /**
     * Gets the "chartFormat" attribute
     */
    public long getChartFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARTFORMAT$158);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHARTFORMAT$158);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "chartFormat" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetChartFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CHARTFORMAT$158);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(CHARTFORMAT$158);
            }
            return target;
        }
    }
    
    /**
     * True if has "chartFormat" attribute
     */
    public boolean isSetChartFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHARTFORMAT$158) != null;
        }
    }
    
    /**
     * Sets the "chartFormat" attribute
     */
    public void setChartFormat(long chartFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARTFORMAT$158);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARTFORMAT$158);
            }
            target.setLongValue(chartFormat);
        }
    }
    
    /**
     * Sets (as xml) the "chartFormat" attribute
     */
    public void xsetChartFormat(org.apache.xmlbeans.XmlUnsignedInt chartFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CHARTFORMAT$158);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CHARTFORMAT$158);
            }
            target.set(chartFormat);
        }
    }
    
    /**
     * Unsets the "chartFormat" attribute
     */
    public void unsetChartFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHARTFORMAT$158);
        }
    }
    
    /**
     * Gets the "rowHeaderCaption" attribute
     */
    public java.lang.String getRowHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWHEADERCAPTION$160);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowHeaderCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetRowHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ROWHEADERCAPTION$160);
            return target;
        }
    }
    
    /**
     * True if has "rowHeaderCaption" attribute
     */
    public boolean isSetRowHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWHEADERCAPTION$160) != null;
        }
    }
    
    /**
     * Sets the "rowHeaderCaption" attribute
     */
    public void setRowHeaderCaption(java.lang.String rowHeaderCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWHEADERCAPTION$160);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWHEADERCAPTION$160);
            }
            target.setStringValue(rowHeaderCaption);
        }
    }
    
    /**
     * Sets (as xml) the "rowHeaderCaption" attribute
     */
    public void xsetRowHeaderCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring rowHeaderCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ROWHEADERCAPTION$160);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ROWHEADERCAPTION$160);
            }
            target.set(rowHeaderCaption);
        }
    }
    
    /**
     * Unsets the "rowHeaderCaption" attribute
     */
    public void unsetRowHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWHEADERCAPTION$160);
        }
    }
    
    /**
     * Gets the "colHeaderCaption" attribute
     */
    public java.lang.String getColHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLHEADERCAPTION$162);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colHeaderCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetColHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COLHEADERCAPTION$162);
            return target;
        }
    }
    
    /**
     * True if has "colHeaderCaption" attribute
     */
    public boolean isSetColHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLHEADERCAPTION$162) != null;
        }
    }
    
    /**
     * Sets the "colHeaderCaption" attribute
     */
    public void setColHeaderCaption(java.lang.String colHeaderCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLHEADERCAPTION$162);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLHEADERCAPTION$162);
            }
            target.setStringValue(colHeaderCaption);
        }
    }
    
    /**
     * Sets (as xml) the "colHeaderCaption" attribute
     */
    public void xsetColHeaderCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring colHeaderCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COLHEADERCAPTION$162);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COLHEADERCAPTION$162);
            }
            target.set(colHeaderCaption);
        }
    }
    
    /**
     * Unsets the "colHeaderCaption" attribute
     */
    public void unsetColHeaderCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLHEADERCAPTION$162);
        }
    }
    
    /**
     * Gets the "fieldListSortAscending" attribute
     */
    public boolean getFieldListSortAscending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDLISTSORTASCENDING$164);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldListSortAscending" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFieldListSortAscending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FIELDLISTSORTASCENDING$164);
            }
            return target;
        }
    }
    
    /**
     * True if has "fieldListSortAscending" attribute
     */
    public boolean isSetFieldListSortAscending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDLISTSORTASCENDING$164) != null;
        }
    }
    
    /**
     * Sets the "fieldListSortAscending" attribute
     */
    public void setFieldListSortAscending(boolean fieldListSortAscending)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDLISTSORTASCENDING$164);
            }
            target.setBooleanValue(fieldListSortAscending);
        }
    }
    
    /**
     * Sets (as xml) the "fieldListSortAscending" attribute
     */
    public void xsetFieldListSortAscending(org.apache.xmlbeans.XmlBoolean fieldListSortAscending)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FIELDLISTSORTASCENDING$164);
            }
            target.set(fieldListSortAscending);
        }
    }
    
    /**
     * Unsets the "fieldListSortAscending" attribute
     */
    public void unsetFieldListSortAscending()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDLISTSORTASCENDING$164);
        }
    }
    
    /**
     * Gets the "mdxSubqueries" attribute
     */
    public boolean getMdxSubqueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDXSUBQUERIES$166);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MDXSUBQUERIES$166);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mdxSubqueries" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMdxSubqueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MDXSUBQUERIES$166);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MDXSUBQUERIES$166);
            }
            return target;
        }
    }
    
    /**
     * True if has "mdxSubqueries" attribute
     */
    public boolean isSetMdxSubqueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MDXSUBQUERIES$166) != null;
        }
    }
    
    /**
     * Sets the "mdxSubqueries" attribute
     */
    public void setMdxSubqueries(boolean mdxSubqueries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDXSUBQUERIES$166);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MDXSUBQUERIES$166);
            }
            target.setBooleanValue(mdxSubqueries);
        }
    }
    
    /**
     * Sets (as xml) the "mdxSubqueries" attribute
     */
    public void xsetMdxSubqueries(org.apache.xmlbeans.XmlBoolean mdxSubqueries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MDXSUBQUERIES$166);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MDXSUBQUERIES$166);
            }
            target.set(mdxSubqueries);
        }
    }
    
    /**
     * Unsets the "mdxSubqueries" attribute
     */
    public void unsetMdxSubqueries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MDXSUBQUERIES$166);
        }
    }
    
    /**
     * Gets the "customListSort" attribute
     */
    public boolean getCustomListSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMLISTSORT$168);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMLISTSORT$168);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customListSort" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomListSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMLISTSORT$168);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMLISTSORT$168);
            }
            return target;
        }
    }
    
    /**
     * True if has "customListSort" attribute
     */
    public boolean isSetCustomListSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMLISTSORT$168) != null;
        }
    }
    
    /**
     * Sets the "customListSort" attribute
     */
    public void setCustomListSort(boolean customListSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMLISTSORT$168);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMLISTSORT$168);
            }
            target.setBooleanValue(customListSort);
        }
    }
    
    /**
     * Sets (as xml) the "customListSort" attribute
     */
    public void xsetCustomListSort(org.apache.xmlbeans.XmlBoolean customListSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMLISTSORT$168);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMLISTSORT$168);
            }
            target.set(customListSort);
        }
    }
    
    /**
     * Unsets the "customListSort" attribute
     */
    public void unsetCustomListSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMLISTSORT$168);
        }
    }
}
