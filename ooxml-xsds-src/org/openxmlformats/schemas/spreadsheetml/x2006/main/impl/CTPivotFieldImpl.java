/*
 * XML Type:  CT_PivotField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField
{
    
    public CTPivotFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "items");
    private static final javax.xml.namespace.QName AUTOSORTSCOPE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoSortScope");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName AXIS$8 = 
        new javax.xml.namespace.QName("", "axis");
    private static final javax.xml.namespace.QName DATAFIELD$10 = 
        new javax.xml.namespace.QName("", "dataField");
    private static final javax.xml.namespace.QName SUBTOTALCAPTION$12 = 
        new javax.xml.namespace.QName("", "subtotalCaption");
    private static final javax.xml.namespace.QName SHOWDROPDOWNS$14 = 
        new javax.xml.namespace.QName("", "showDropDowns");
    private static final javax.xml.namespace.QName HIDDENLEVEL$16 = 
        new javax.xml.namespace.QName("", "hiddenLevel");
    private static final javax.xml.namespace.QName UNIQUEMEMBERPROPERTY$18 = 
        new javax.xml.namespace.QName("", "uniqueMemberProperty");
    private static final javax.xml.namespace.QName COMPACT$20 = 
        new javax.xml.namespace.QName("", "compact");
    private static final javax.xml.namespace.QName ALLDRILLED$22 = 
        new javax.xml.namespace.QName("", "allDrilled");
    private static final javax.xml.namespace.QName NUMFMTID$24 = 
        new javax.xml.namespace.QName("", "numFmtId");
    private static final javax.xml.namespace.QName OUTLINE$26 = 
        new javax.xml.namespace.QName("", "outline");
    private static final javax.xml.namespace.QName SUBTOTALTOP$28 = 
        new javax.xml.namespace.QName("", "subtotalTop");
    private static final javax.xml.namespace.QName DRAGTOROW$30 = 
        new javax.xml.namespace.QName("", "dragToRow");
    private static final javax.xml.namespace.QName DRAGTOCOL$32 = 
        new javax.xml.namespace.QName("", "dragToCol");
    private static final javax.xml.namespace.QName MULTIPLEITEMSELECTIONALLOWED$34 = 
        new javax.xml.namespace.QName("", "multipleItemSelectionAllowed");
    private static final javax.xml.namespace.QName DRAGTOPAGE$36 = 
        new javax.xml.namespace.QName("", "dragToPage");
    private static final javax.xml.namespace.QName DRAGTODATA$38 = 
        new javax.xml.namespace.QName("", "dragToData");
    private static final javax.xml.namespace.QName DRAGOFF$40 = 
        new javax.xml.namespace.QName("", "dragOff");
    private static final javax.xml.namespace.QName SHOWALL$42 = 
        new javax.xml.namespace.QName("", "showAll");
    private static final javax.xml.namespace.QName INSERTBLANKROW$44 = 
        new javax.xml.namespace.QName("", "insertBlankRow");
    private static final javax.xml.namespace.QName SERVERFIELD$46 = 
        new javax.xml.namespace.QName("", "serverField");
    private static final javax.xml.namespace.QName INSERTPAGEBREAK$48 = 
        new javax.xml.namespace.QName("", "insertPageBreak");
    private static final javax.xml.namespace.QName AUTOSHOW$50 = 
        new javax.xml.namespace.QName("", "autoShow");
    private static final javax.xml.namespace.QName TOPAUTOSHOW$52 = 
        new javax.xml.namespace.QName("", "topAutoShow");
    private static final javax.xml.namespace.QName HIDENEWITEMS$54 = 
        new javax.xml.namespace.QName("", "hideNewItems");
    private static final javax.xml.namespace.QName MEASUREFILTER$56 = 
        new javax.xml.namespace.QName("", "measureFilter");
    private static final javax.xml.namespace.QName INCLUDENEWITEMSINFILTER$58 = 
        new javax.xml.namespace.QName("", "includeNewItemsInFilter");
    private static final javax.xml.namespace.QName ITEMPAGECOUNT$60 = 
        new javax.xml.namespace.QName("", "itemPageCount");
    private static final javax.xml.namespace.QName SORTTYPE$62 = 
        new javax.xml.namespace.QName("", "sortType");
    private static final javax.xml.namespace.QName DATASOURCESORT$64 = 
        new javax.xml.namespace.QName("", "dataSourceSort");
    private static final javax.xml.namespace.QName NONAUTOSORTDEFAULT$66 = 
        new javax.xml.namespace.QName("", "nonAutoSortDefault");
    private static final javax.xml.namespace.QName RANKBY$68 = 
        new javax.xml.namespace.QName("", "rankBy");
    private static final javax.xml.namespace.QName DEFAULTSUBTOTAL$70 = 
        new javax.xml.namespace.QName("", "defaultSubtotal");
    private static final javax.xml.namespace.QName SUMSUBTOTAL$72 = 
        new javax.xml.namespace.QName("", "sumSubtotal");
    private static final javax.xml.namespace.QName COUNTASUBTOTAL$74 = 
        new javax.xml.namespace.QName("", "countASubtotal");
    private static final javax.xml.namespace.QName AVGSUBTOTAL$76 = 
        new javax.xml.namespace.QName("", "avgSubtotal");
    private static final javax.xml.namespace.QName MAXSUBTOTAL$78 = 
        new javax.xml.namespace.QName("", "maxSubtotal");
    private static final javax.xml.namespace.QName MINSUBTOTAL$80 = 
        new javax.xml.namespace.QName("", "minSubtotal");
    private static final javax.xml.namespace.QName PRODUCTSUBTOTAL$82 = 
        new javax.xml.namespace.QName("", "productSubtotal");
    private static final javax.xml.namespace.QName COUNTSUBTOTAL$84 = 
        new javax.xml.namespace.QName("", "countSubtotal");
    private static final javax.xml.namespace.QName STDDEVSUBTOTAL$86 = 
        new javax.xml.namespace.QName("", "stdDevSubtotal");
    private static final javax.xml.namespace.QName STDDEVPSUBTOTAL$88 = 
        new javax.xml.namespace.QName("", "stdDevPSubtotal");
    private static final javax.xml.namespace.QName VARSUBTOTAL$90 = 
        new javax.xml.namespace.QName("", "varSubtotal");
    private static final javax.xml.namespace.QName VARPSUBTOTAL$92 = 
        new javax.xml.namespace.QName("", "varPSubtotal");
    private static final javax.xml.namespace.QName SHOWPROPCELL$94 = 
        new javax.xml.namespace.QName("", "showPropCell");
    private static final javax.xml.namespace.QName SHOWPROPTIP$96 = 
        new javax.xml.namespace.QName("", "showPropTip");
    private static final javax.xml.namespace.QName SHOWPROPASCAPTION$98 = 
        new javax.xml.namespace.QName("", "showPropAsCaption");
    private static final javax.xml.namespace.QName DEFAULTATTRIBUTEDRILLSTATE$100 = 
        new javax.xml.namespace.QName("", "defaultAttributeDrillState");
    
    
    /**
     * Gets the "items" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems getItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems)get_store().find_element_user(ITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "items" element
     */
    public boolean isSetItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMS$0) != 0;
        }
    }
    
    /**
     * Sets the "items" element
     */
    public void setItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems items)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems)get_store().find_element_user(ITEMS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems)get_store().add_element_user(ITEMS$0);
            }
            target.set(items);
        }
    }
    
    /**
     * Appends and returns a new empty "items" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems addNewItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems)get_store().add_element_user(ITEMS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "items" element
     */
    public void unsetItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMS$0, 0);
        }
    }
    
    /**
     * Gets the "autoSortScope" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope getAutoSortScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope)get_store().find_element_user(AUTOSORTSCOPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoSortScope" element
     */
    public boolean isSetAutoSortScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOSORTSCOPE$2) != 0;
        }
    }
    
    /**
     * Sets the "autoSortScope" element
     */
    public void setAutoSortScope(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope autoSortScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope)get_store().find_element_user(AUTOSORTSCOPE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope)get_store().add_element_user(AUTOSORTSCOPE$2);
            }
            target.set(autoSortScope);
        }
    }
    
    /**
     * Appends and returns a new empty "autoSortScope" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope addNewAutoSortScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope)get_store().add_element_user(AUTOSORTSCOPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "autoSortScope" element
     */
    public void unsetAutoSortScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOSORTSCOPE$2, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
    
    /**
     * Gets the "axis" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum getAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis xgetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$8);
            return target;
        }
    }
    
    /**
     * True if has "axis" attribute
     */
    public boolean isSetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXIS$8) != null;
        }
    }
    
    /**
     * Sets the "axis" attribute
     */
    public void setAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis.Enum axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXIS$8);
            }
            target.setEnumValue(axis);
        }
    }
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    public void xsetAxis(org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().add_attribute_user(AXIS$8);
            }
            target.set(axis);
        }
    }
    
    /**
     * Unsets the "axis" attribute
     */
    public void unsetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXIS$8);
        }
    }
    
    /**
     * Gets the "dataField" attribute
     */
    public boolean getDataField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATAFIELD$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATAFIELD$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "dataField" attribute
     */
    public boolean isSetDataField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAFIELD$10) != null;
        }
    }
    
    /**
     * Sets the "dataField" attribute
     */
    public void setDataField(boolean dataField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFIELD$10);
            }
            target.setBooleanValue(dataField);
        }
    }
    
    /**
     * Sets (as xml) the "dataField" attribute
     */
    public void xsetDataField(org.apache.xmlbeans.XmlBoolean dataField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAFIELD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATAFIELD$10);
            }
            target.set(dataField);
        }
    }
    
    /**
     * Unsets the "dataField" attribute
     */
    public void unsetDataField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAFIELD$10);
        }
    }
    
    /**
     * Gets the "subtotalCaption" attribute
     */
    public java.lang.String getSubtotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALCAPTION$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subtotalCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSubtotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SUBTOTALCAPTION$12);
            return target;
        }
    }
    
    /**
     * True if has "subtotalCaption" attribute
     */
    public boolean isSetSubtotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTOTALCAPTION$12) != null;
        }
    }
    
    /**
     * Sets the "subtotalCaption" attribute
     */
    public void setSubtotalCaption(java.lang.String subtotalCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALCAPTION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTOTALCAPTION$12);
            }
            target.setStringValue(subtotalCaption);
        }
    }
    
    /**
     * Sets (as xml) the "subtotalCaption" attribute
     */
    public void xsetSubtotalCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring subtotalCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SUBTOTALCAPTION$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SUBTOTALCAPTION$12);
            }
            target.set(subtotalCaption);
        }
    }
    
    /**
     * Unsets the "subtotalCaption" attribute
     */
    public void unsetSubtotalCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTOTALCAPTION$12);
        }
    }
    
    /**
     * Gets the "showDropDowns" attribute
     */
    public boolean getShowDropDowns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPDOWNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDROPDOWNS$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDropDowns" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDropDowns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPDOWNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDROPDOWNS$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDropDowns" attribute
     */
    public boolean isSetShowDropDowns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDROPDOWNS$14) != null;
        }
    }
    
    /**
     * Sets the "showDropDowns" attribute
     */
    public void setShowDropDowns(boolean showDropDowns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPDOWNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDROPDOWNS$14);
            }
            target.setBooleanValue(showDropDowns);
        }
    }
    
    /**
     * Sets (as xml) the "showDropDowns" attribute
     */
    public void xsetShowDropDowns(org.apache.xmlbeans.XmlBoolean showDropDowns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPDOWNS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDROPDOWNS$14);
            }
            target.set(showDropDowns);
        }
    }
    
    /**
     * Unsets the "showDropDowns" attribute
     */
    public void unsetShowDropDowns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDROPDOWNS$14);
        }
    }
    
    /**
     * Gets the "hiddenLevel" attribute
     */
    public boolean getHiddenLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENLEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDENLEVEL$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenLevel" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHiddenLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENLEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDENLEVEL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "hiddenLevel" attribute
     */
    public boolean isSetHiddenLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDENLEVEL$16) != null;
        }
    }
    
    /**
     * Sets the "hiddenLevel" attribute
     */
    public void setHiddenLevel(boolean hiddenLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDENLEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDENLEVEL$16);
            }
            target.setBooleanValue(hiddenLevel);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenLevel" attribute
     */
    public void xsetHiddenLevel(org.apache.xmlbeans.XmlBoolean hiddenLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDENLEVEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDENLEVEL$16);
            }
            target.set(hiddenLevel);
        }
    }
    
    /**
     * Unsets the "hiddenLevel" attribute
     */
    public void unsetHiddenLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDENLEVEL$16);
        }
    }
    
    /**
     * Gets the "uniqueMemberProperty" attribute
     */
    public java.lang.String getUniqueMemberProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueMemberProperty" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueMemberProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
            return target;
        }
    }
    
    /**
     * True if has "uniqueMemberProperty" attribute
     */
    public boolean isSetUniqueMemberProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18) != null;
        }
    }
    
    /**
     * Sets the "uniqueMemberProperty" attribute
     */
    public void setUniqueMemberProperty(java.lang.String uniqueMemberProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEMEMBERPROPERTY$18);
            }
            target.setStringValue(uniqueMemberProperty);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueMemberProperty" attribute
     */
    public void xsetUniqueMemberProperty(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueMemberProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(UNIQUEMEMBERPROPERTY$18);
            }
            target.set(uniqueMemberProperty);
        }
    }
    
    /**
     * Unsets the "uniqueMemberProperty" attribute
     */
    public void unsetUniqueMemberProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUEMEMBERPROPERTY$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPACT$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPACT$20);
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
            return get_store().find_attribute_user(COMPACT$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPACT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPACT$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPACT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPACT$20);
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
            get_store().remove_attribute(COMPACT$20);
        }
    }
    
    /**
     * Gets the "allDrilled" attribute
     */
    public boolean getAllDrilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLDRILLED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLDRILLED$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allDrilled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllDrilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLDRILLED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALLDRILLED$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "allDrilled" attribute
     */
    public boolean isSetAllDrilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLDRILLED$22) != null;
        }
    }
    
    /**
     * Sets the "allDrilled" attribute
     */
    public void setAllDrilled(boolean allDrilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLDRILLED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLDRILLED$22);
            }
            target.setBooleanValue(allDrilled);
        }
    }
    
    /**
     * Sets (as xml) the "allDrilled" attribute
     */
    public void xsetAllDrilled(org.apache.xmlbeans.XmlBoolean allDrilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLDRILLED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLDRILLED$22);
            }
            target.set(allDrilled);
        }
    }
    
    /**
     * Unsets the "allDrilled" attribute
     */
    public void unsetAllDrilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLDRILLED$22);
        }
    }
    
    /**
     * Gets the "numFmtId" attribute
     */
    public long getNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$24);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$24);
            return target;
        }
    }
    
    /**
     * True if has "numFmtId" attribute
     */
    public boolean isSetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMFMTID$24) != null;
        }
    }
    
    /**
     * Sets the "numFmtId" attribute
     */
    public void setNumFmtId(long numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMTID$24);
            }
            target.setLongValue(numFmtId);
        }
    }
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    public void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().add_attribute_user(NUMFMTID$24);
            }
            target.set(numFmtId);
        }
    }
    
    /**
     * Unsets the "numFmtId" attribute
     */
    public void unsetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMFMTID$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINE$26);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINE$26);
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
            return get_store().find_attribute_user(OUTLINE$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINE$26);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINE$26);
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
            get_store().remove_attribute(OUTLINE$26);
        }
    }
    
    /**
     * Gets the "subtotalTop" attribute
     */
    public boolean getSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALTOP$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUBTOTALTOP$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "subtotalTop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALTOP$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUBTOTALTOP$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "subtotalTop" attribute
     */
    public boolean isSetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTOTALTOP$28) != null;
        }
    }
    
    /**
     * Sets the "subtotalTop" attribute
     */
    public void setSubtotalTop(boolean subtotalTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALTOP$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTOTALTOP$28);
            }
            target.setBooleanValue(subtotalTop);
        }
    }
    
    /**
     * Sets (as xml) the "subtotalTop" attribute
     */
    public void xsetSubtotalTop(org.apache.xmlbeans.XmlBoolean subtotalTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALTOP$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUBTOTALTOP$28);
            }
            target.set(subtotalTop);
        }
    }
    
    /**
     * Unsets the "subtotalTop" attribute
     */
    public void unsetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTOTALTOP$28);
        }
    }
    
    /**
     * Gets the "dragToRow" attribute
     */
    public boolean getDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOROW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOROW$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOROW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOROW$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToRow" attribute
     */
    public boolean isSetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOROW$30) != null;
        }
    }
    
    /**
     * Sets the "dragToRow" attribute
     */
    public void setDragToRow(boolean dragToRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOROW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOROW$30);
            }
            target.setBooleanValue(dragToRow);
        }
    }
    
    /**
     * Sets (as xml) the "dragToRow" attribute
     */
    public void xsetDragToRow(org.apache.xmlbeans.XmlBoolean dragToRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOROW$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOROW$30);
            }
            target.set(dragToRow);
        }
    }
    
    /**
     * Unsets the "dragToRow" attribute
     */
    public void unsetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOROW$30);
        }
    }
    
    /**
     * Gets the "dragToCol" attribute
     */
    public boolean getDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOCOL$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOCOL$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToCol" attribute
     */
    public boolean isSetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOCOL$32) != null;
        }
    }
    
    /**
     * Sets the "dragToCol" attribute
     */
    public void setDragToCol(boolean dragToCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOCOL$32);
            }
            target.setBooleanValue(dragToCol);
        }
    }
    
    /**
     * Sets (as xml) the "dragToCol" attribute
     */
    public void xsetDragToCol(org.apache.xmlbeans.XmlBoolean dragToCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOCOL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOCOL$32);
            }
            target.set(dragToCol);
        }
    }
    
    /**
     * Unsets the "dragToCol" attribute
     */
    public void unsetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOCOL$32);
        }
    }
    
    /**
     * Gets the "multipleItemSelectionAllowed" attribute
     */
    public boolean getMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "multipleItemSelectionAllowed" attribute
     */
    public boolean isSetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34) != null;
        }
    }
    
    /**
     * Sets the "multipleItemSelectionAllowed" attribute
     */
    public void setMultipleItemSelectionAllowed(boolean multipleItemSelectionAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            }
            target.setBooleanValue(multipleItemSelectionAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    public void xsetMultipleItemSelectionAllowed(org.apache.xmlbeans.XmlBoolean multipleItemSelectionAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
            }
            target.set(multipleItemSelectionAllowed);
        }
    }
    
    /**
     * Unsets the "multipleItemSelectionAllowed" attribute
     */
    public void unsetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MULTIPLEITEMSELECTIONALLOWED$34);
        }
    }
    
    /**
     * Gets the "dragToPage" attribute
     */
    public boolean getDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOPAGE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOPAGE$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToPage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOPAGE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOPAGE$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToPage" attribute
     */
    public boolean isSetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOPAGE$36) != null;
        }
    }
    
    /**
     * Sets the "dragToPage" attribute
     */
    public void setDragToPage(boolean dragToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOPAGE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOPAGE$36);
            }
            target.setBooleanValue(dragToPage);
        }
    }
    
    /**
     * Sets (as xml) the "dragToPage" attribute
     */
    public void xsetDragToPage(org.apache.xmlbeans.XmlBoolean dragToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOPAGE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOPAGE$36);
            }
            target.set(dragToPage);
        }
    }
    
    /**
     * Unsets the "dragToPage" attribute
     */
    public void unsetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOPAGE$36);
        }
    }
    
    /**
     * Gets the "dragToData" attribute
     */
    public boolean getDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTODATA$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTODATA$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTODATA$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTODATA$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToData" attribute
     */
    public boolean isSetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTODATA$38) != null;
        }
    }
    
    /**
     * Sets the "dragToData" attribute
     */
    public void setDragToData(boolean dragToData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTODATA$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTODATA$38);
            }
            target.setBooleanValue(dragToData);
        }
    }
    
    /**
     * Sets (as xml) the "dragToData" attribute
     */
    public void xsetDragToData(org.apache.xmlbeans.XmlBoolean dragToData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTODATA$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTODATA$38);
            }
            target.set(dragToData);
        }
    }
    
    /**
     * Unsets the "dragToData" attribute
     */
    public void unsetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTODATA$38);
        }
    }
    
    /**
     * Gets the "dragOff" attribute
     */
    public boolean getDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGOFF$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGOFF$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragOff" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGOFF$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGOFF$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragOff" attribute
     */
    public boolean isSetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGOFF$40) != null;
        }
    }
    
    /**
     * Sets the "dragOff" attribute
     */
    public void setDragOff(boolean dragOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGOFF$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGOFF$40);
            }
            target.setBooleanValue(dragOff);
        }
    }
    
    /**
     * Sets (as xml) the "dragOff" attribute
     */
    public void xsetDragOff(org.apache.xmlbeans.XmlBoolean dragOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGOFF$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGOFF$40);
            }
            target.set(dragOff);
        }
    }
    
    /**
     * Unsets the "dragOff" attribute
     */
    public void unsetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGOFF$40);
        }
    }
    
    /**
     * Gets the "showAll" attribute
     */
    public boolean getShowAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWALL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWALL$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWALL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWALL$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "showAll" attribute
     */
    public boolean isSetShowAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWALL$42) != null;
        }
    }
    
    /**
     * Sets the "showAll" attribute
     */
    public void setShowAll(boolean showAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWALL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWALL$42);
            }
            target.setBooleanValue(showAll);
        }
    }
    
    /**
     * Sets (as xml) the "showAll" attribute
     */
    public void xsetShowAll(org.apache.xmlbeans.XmlBoolean showAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWALL$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWALL$42);
            }
            target.set(showAll);
        }
    }
    
    /**
     * Unsets the "showAll" attribute
     */
    public void unsetShowAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWALL$42);
        }
    }
    
    /**
     * Gets the "insertBlankRow" attribute
     */
    public boolean getInsertBlankRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTBLANKROW$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTBLANKROW$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertBlankRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertBlankRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTBLANKROW$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTBLANKROW$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertBlankRow" attribute
     */
    public boolean isSetInsertBlankRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTBLANKROW$44) != null;
        }
    }
    
    /**
     * Sets the "insertBlankRow" attribute
     */
    public void setInsertBlankRow(boolean insertBlankRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTBLANKROW$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTBLANKROW$44);
            }
            target.setBooleanValue(insertBlankRow);
        }
    }
    
    /**
     * Sets (as xml) the "insertBlankRow" attribute
     */
    public void xsetInsertBlankRow(org.apache.xmlbeans.XmlBoolean insertBlankRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTBLANKROW$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTBLANKROW$44);
            }
            target.set(insertBlankRow);
        }
    }
    
    /**
     * Unsets the "insertBlankRow" attribute
     */
    public void unsetInsertBlankRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTBLANKROW$44);
        }
    }
    
    /**
     * Gets the "serverField" attribute
     */
    public boolean getServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFIELD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERFIELD$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFIELD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERFIELD$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverField" attribute
     */
    public boolean isSetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERFIELD$46) != null;
        }
    }
    
    /**
     * Sets the "serverField" attribute
     */
    public void setServerField(boolean serverField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFIELD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERFIELD$46);
            }
            target.setBooleanValue(serverField);
        }
    }
    
    /**
     * Sets (as xml) the "serverField" attribute
     */
    public void xsetServerField(org.apache.xmlbeans.XmlBoolean serverField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFIELD$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERFIELD$46);
            }
            target.set(serverField);
        }
    }
    
    /**
     * Unsets the "serverField" attribute
     */
    public void unsetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERFIELD$46);
        }
    }
    
    /**
     * Gets the "insertPageBreak" attribute
     */
    public boolean getInsertPageBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTPAGEBREAK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTPAGEBREAK$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertPageBreak" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertPageBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTPAGEBREAK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTPAGEBREAK$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertPageBreak" attribute
     */
    public boolean isSetInsertPageBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTPAGEBREAK$48) != null;
        }
    }
    
    /**
     * Sets the "insertPageBreak" attribute
     */
    public void setInsertPageBreak(boolean insertPageBreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTPAGEBREAK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTPAGEBREAK$48);
            }
            target.setBooleanValue(insertPageBreak);
        }
    }
    
    /**
     * Sets (as xml) the "insertPageBreak" attribute
     */
    public void xsetInsertPageBreak(org.apache.xmlbeans.XmlBoolean insertPageBreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTPAGEBREAK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTPAGEBREAK$48);
            }
            target.set(insertPageBreak);
        }
    }
    
    /**
     * Unsets the "insertPageBreak" attribute
     */
    public void unsetInsertPageBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTPAGEBREAK$48);
        }
    }
    
    /**
     * Gets the "autoShow" attribute
     */
    public boolean getAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSHOW$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOSHOW$50);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoShow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSHOW$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOSHOW$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoShow" attribute
     */
    public boolean isSetAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOSHOW$50) != null;
        }
    }
    
    /**
     * Sets the "autoShow" attribute
     */
    public void setAutoShow(boolean autoShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSHOW$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOSHOW$50);
            }
            target.setBooleanValue(autoShow);
        }
    }
    
    /**
     * Sets (as xml) the "autoShow" attribute
     */
    public void xsetAutoShow(org.apache.xmlbeans.XmlBoolean autoShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOSHOW$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOSHOW$50);
            }
            target.set(autoShow);
        }
    }
    
    /**
     * Unsets the "autoShow" attribute
     */
    public void unsetAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOSHOW$50);
        }
    }
    
    /**
     * Gets the "topAutoShow" attribute
     */
    public boolean getTopAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPAUTOSHOW$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOPAUTOSHOW$52);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "topAutoShow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTopAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPAUTOSHOW$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TOPAUTOSHOW$52);
            }
            return target;
        }
    }
    
    /**
     * True if has "topAutoShow" attribute
     */
    public boolean isSetTopAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPAUTOSHOW$52) != null;
        }
    }
    
    /**
     * Sets the "topAutoShow" attribute
     */
    public void setTopAutoShow(boolean topAutoShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPAUTOSHOW$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPAUTOSHOW$52);
            }
            target.setBooleanValue(topAutoShow);
        }
    }
    
    /**
     * Sets (as xml) the "topAutoShow" attribute
     */
    public void xsetTopAutoShow(org.apache.xmlbeans.XmlBoolean topAutoShow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPAUTOSHOW$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TOPAUTOSHOW$52);
            }
            target.set(topAutoShow);
        }
    }
    
    /**
     * Unsets the "topAutoShow" attribute
     */
    public void unsetTopAutoShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPAUTOSHOW$52);
        }
    }
    
    /**
     * Gets the "hideNewItems" attribute
     */
    public boolean getHideNewItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDENEWITEMS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDENEWITEMS$54);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hideNewItems" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHideNewItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDENEWITEMS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDENEWITEMS$54);
            }
            return target;
        }
    }
    
    /**
     * True if has "hideNewItems" attribute
     */
    public boolean isSetHideNewItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDENEWITEMS$54) != null;
        }
    }
    
    /**
     * Sets the "hideNewItems" attribute
     */
    public void setHideNewItems(boolean hideNewItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDENEWITEMS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDENEWITEMS$54);
            }
            target.setBooleanValue(hideNewItems);
        }
    }
    
    /**
     * Sets (as xml) the "hideNewItems" attribute
     */
    public void xsetHideNewItems(org.apache.xmlbeans.XmlBoolean hideNewItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDENEWITEMS$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDENEWITEMS$54);
            }
            target.set(hideNewItems);
        }
    }
    
    /**
     * Unsets the "hideNewItems" attribute
     */
    public void unsetHideNewItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDENEWITEMS$54);
        }
    }
    
    /**
     * Gets the "measureFilter" attribute
     */
    public boolean getMeasureFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREFILTER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEASUREFILTER$56);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "measureFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMeasureFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASUREFILTER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MEASUREFILTER$56);
            }
            return target;
        }
    }
    
    /**
     * True if has "measureFilter" attribute
     */
    public boolean isSetMeasureFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUREFILTER$56) != null;
        }
    }
    
    /**
     * Sets the "measureFilter" attribute
     */
    public void setMeasureFilter(boolean measureFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREFILTER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUREFILTER$56);
            }
            target.setBooleanValue(measureFilter);
        }
    }
    
    /**
     * Sets (as xml) the "measureFilter" attribute
     */
    public void xsetMeasureFilter(org.apache.xmlbeans.XmlBoolean measureFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASUREFILTER$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MEASUREFILTER$56);
            }
            target.set(measureFilter);
        }
    }
    
    /**
     * Unsets the "measureFilter" attribute
     */
    public void unsetMeasureFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUREFILTER$56);
        }
    }
    
    /**
     * Gets the "includeNewItemsInFilter" attribute
     */
    public boolean getIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDENEWITEMSINFILTER$58);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "includeNewItemsInFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDENEWITEMSINFILTER$58);
            }
            return target;
        }
    }
    
    /**
     * True if has "includeNewItemsInFilter" attribute
     */
    public boolean isSetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58) != null;
        }
    }
    
    /**
     * Sets the "includeNewItemsInFilter" attribute
     */
    public void setIncludeNewItemsInFilter(boolean includeNewItemsInFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$58);
            }
            target.setBooleanValue(includeNewItemsInFilter);
        }
    }
    
    /**
     * Sets (as xml) the "includeNewItemsInFilter" attribute
     */
    public void xsetIncludeNewItemsInFilter(org.apache.xmlbeans.XmlBoolean includeNewItemsInFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$58);
            }
            target.set(includeNewItemsInFilter);
        }
    }
    
    /**
     * Unsets the "includeNewItemsInFilter" attribute
     */
    public void unsetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDENEWITEMSINFILTER$58);
        }
    }
    
    /**
     * Gets the "itemPageCount" attribute
     */
    public long getItemPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMPAGECOUNT$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITEMPAGECOUNT$60);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemPageCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetItemPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITEMPAGECOUNT$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ITEMPAGECOUNT$60);
            }
            return target;
        }
    }
    
    /**
     * True if has "itemPageCount" attribute
     */
    public boolean isSetItemPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITEMPAGECOUNT$60) != null;
        }
    }
    
    /**
     * Sets the "itemPageCount" attribute
     */
    public void setItemPageCount(long itemPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMPAGECOUNT$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMPAGECOUNT$60);
            }
            target.setLongValue(itemPageCount);
        }
    }
    
    /**
     * Sets (as xml) the "itemPageCount" attribute
     */
    public void xsetItemPageCount(org.apache.xmlbeans.XmlUnsignedInt itemPageCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITEMPAGECOUNT$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ITEMPAGECOUNT$60);
            }
            target.set(itemPageCount);
        }
    }
    
    /**
     * Unsets the "itemPageCount" attribute
     */
    public void unsetItemPageCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITEMPAGECOUNT$60);
        }
    }
    
    /**
     * Gets the "sortType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType.Enum getSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTTYPE$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTTYPE$62);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType xgetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType)get_store().find_attribute_user(SORTTYPE$62);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType)get_default_attribute_value(SORTTYPE$62);
            }
            return target;
        }
    }
    
    /**
     * True if has "sortType" attribute
     */
    public boolean isSetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTTYPE$62) != null;
        }
    }
    
    /**
     * Sets the "sortType" attribute
     */
    public void setSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType.Enum sortType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTTYPE$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTTYPE$62);
            }
            target.setEnumValue(sortType);
        }
    }
    
    /**
     * Sets (as xml) the "sortType" attribute
     */
    public void xsetSortType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType sortType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType)get_store().find_attribute_user(SORTTYPE$62);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType)get_store().add_attribute_user(SORTTYPE$62);
            }
            target.set(sortType);
        }
    }
    
    /**
     * Unsets the "sortType" attribute
     */
    public void unsetSortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTTYPE$62);
        }
    }
    
    /**
     * Gets the "dataSourceSort" attribute
     */
    public boolean getDataSourceSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCESORT$64);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataSourceSort" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataSourceSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATASOURCESORT$64);
            return target;
        }
    }
    
    /**
     * True if has "dataSourceSort" attribute
     */
    public boolean isSetDataSourceSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATASOURCESORT$64) != null;
        }
    }
    
    /**
     * Sets the "dataSourceSort" attribute
     */
    public void setDataSourceSort(boolean dataSourceSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCESORT$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASOURCESORT$64);
            }
            target.setBooleanValue(dataSourceSort);
        }
    }
    
    /**
     * Sets (as xml) the "dataSourceSort" attribute
     */
    public void xsetDataSourceSort(org.apache.xmlbeans.XmlBoolean dataSourceSort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATASOURCESORT$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATASOURCESORT$64);
            }
            target.set(dataSourceSort);
        }
    }
    
    /**
     * Unsets the "dataSourceSort" attribute
     */
    public void unsetDataSourceSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATASOURCESORT$64);
        }
    }
    
    /**
     * Gets the "nonAutoSortDefault" attribute
     */
    public boolean getNonAutoSortDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NONAUTOSORTDEFAULT$66);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nonAutoSortDefault" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNonAutoSortDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NONAUTOSORTDEFAULT$66);
            }
            return target;
        }
    }
    
    /**
     * True if has "nonAutoSortDefault" attribute
     */
    public boolean isSetNonAutoSortDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NONAUTOSORTDEFAULT$66) != null;
        }
    }
    
    /**
     * Sets the "nonAutoSortDefault" attribute
     */
    public void setNonAutoSortDefault(boolean nonAutoSortDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONAUTOSORTDEFAULT$66);
            }
            target.setBooleanValue(nonAutoSortDefault);
        }
    }
    
    /**
     * Sets (as xml) the "nonAutoSortDefault" attribute
     */
    public void xsetNonAutoSortDefault(org.apache.xmlbeans.XmlBoolean nonAutoSortDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NONAUTOSORTDEFAULT$66);
            }
            target.set(nonAutoSortDefault);
        }
    }
    
    /**
     * Unsets the "nonAutoSortDefault" attribute
     */
    public void unsetNonAutoSortDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NONAUTOSORTDEFAULT$66);
        }
    }
    
    /**
     * Gets the "rankBy" attribute
     */
    public long getRankBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANKBY$68);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rankBy" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRankBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RANKBY$68);
            return target;
        }
    }
    
    /**
     * True if has "rankBy" attribute
     */
    public boolean isSetRankBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RANKBY$68) != null;
        }
    }
    
    /**
     * Sets the "rankBy" attribute
     */
    public void setRankBy(long rankBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANKBY$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RANKBY$68);
            }
            target.setLongValue(rankBy);
        }
    }
    
    /**
     * Sets (as xml) the "rankBy" attribute
     */
    public void xsetRankBy(org.apache.xmlbeans.XmlUnsignedInt rankBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RANKBY$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RANKBY$68);
            }
            target.set(rankBy);
        }
    }
    
    /**
     * Unsets the "rankBy" attribute
     */
    public void unsetRankBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RANKBY$68);
        }
    }
    
    /**
     * Gets the "defaultSubtotal" attribute
     */
    public boolean getDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTSUBTOTAL$70);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTSUBTOTAL$70);
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultSubtotal" attribute
     */
    public boolean isSetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTSUBTOTAL$70) != null;
        }
    }
    
    /**
     * Sets the "defaultSubtotal" attribute
     */
    public void setDefaultSubtotal(boolean defaultSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSUBTOTAL$70);
            }
            target.setBooleanValue(defaultSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "defaultSubtotal" attribute
     */
    public void xsetDefaultSubtotal(org.apache.xmlbeans.XmlBoolean defaultSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTSUBTOTAL$70);
            }
            target.set(defaultSubtotal);
        }
    }
    
    /**
     * Unsets the "defaultSubtotal" attribute
     */
    public void unsetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTSUBTOTAL$70);
        }
    }
    
    /**
     * Gets the "sumSubtotal" attribute
     */
    public boolean getSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMSUBTOTAL$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUMSUBTOTAL$72);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sumSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMSUBTOTAL$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUMSUBTOTAL$72);
            }
            return target;
        }
    }
    
    /**
     * True if has "sumSubtotal" attribute
     */
    public boolean isSetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUMSUBTOTAL$72) != null;
        }
    }
    
    /**
     * Sets the "sumSubtotal" attribute
     */
    public void setSumSubtotal(boolean sumSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMSUBTOTAL$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMSUBTOTAL$72);
            }
            target.setBooleanValue(sumSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "sumSubtotal" attribute
     */
    public void xsetSumSubtotal(org.apache.xmlbeans.XmlBoolean sumSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMSUBTOTAL$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUMSUBTOTAL$72);
            }
            target.set(sumSubtotal);
        }
    }
    
    /**
     * Unsets the "sumSubtotal" attribute
     */
    public void unsetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUMSUBTOTAL$72);
        }
    }
    
    /**
     * Gets the "countASubtotal" attribute
     */
    public boolean getCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTASUBTOTAL$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNTASUBTOTAL$74);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "countASubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTASUBTOTAL$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COUNTASUBTOTAL$74);
            }
            return target;
        }
    }
    
    /**
     * True if has "countASubtotal" attribute
     */
    public boolean isSetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTASUBTOTAL$74) != null;
        }
    }
    
    /**
     * Sets the "countASubtotal" attribute
     */
    public void setCountASubtotal(boolean countASubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTASUBTOTAL$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTASUBTOTAL$74);
            }
            target.setBooleanValue(countASubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "countASubtotal" attribute
     */
    public void xsetCountASubtotal(org.apache.xmlbeans.XmlBoolean countASubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTASUBTOTAL$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COUNTASUBTOTAL$74);
            }
            target.set(countASubtotal);
        }
    }
    
    /**
     * Unsets the "countASubtotal" attribute
     */
    public void unsetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTASUBTOTAL$74);
        }
    }
    
    /**
     * Gets the "avgSubtotal" attribute
     */
    public boolean getAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGSUBTOTAL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AVGSUBTOTAL$76);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "avgSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AVGSUBTOTAL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AVGSUBTOTAL$76);
            }
            return target;
        }
    }
    
    /**
     * True if has "avgSubtotal" attribute
     */
    public boolean isSetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AVGSUBTOTAL$76) != null;
        }
    }
    
    /**
     * Sets the "avgSubtotal" attribute
     */
    public void setAvgSubtotal(boolean avgSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGSUBTOTAL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVGSUBTOTAL$76);
            }
            target.setBooleanValue(avgSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "avgSubtotal" attribute
     */
    public void xsetAvgSubtotal(org.apache.xmlbeans.XmlBoolean avgSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AVGSUBTOTAL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AVGSUBTOTAL$76);
            }
            target.set(avgSubtotal);
        }
    }
    
    /**
     * Unsets the "avgSubtotal" attribute
     */
    public void unsetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AVGSUBTOTAL$76);
        }
    }
    
    /**
     * Gets the "maxSubtotal" attribute
     */
    public boolean getMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSUBTOTAL$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXSUBTOTAL$78);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXSUBTOTAL$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MAXSUBTOTAL$78);
            }
            return target;
        }
    }
    
    /**
     * True if has "maxSubtotal" attribute
     */
    public boolean isSetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXSUBTOTAL$78) != null;
        }
    }
    
    /**
     * Sets the "maxSubtotal" attribute
     */
    public void setMaxSubtotal(boolean maxSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSUBTOTAL$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXSUBTOTAL$78);
            }
            target.setBooleanValue(maxSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "maxSubtotal" attribute
     */
    public void xsetMaxSubtotal(org.apache.xmlbeans.XmlBoolean maxSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXSUBTOTAL$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MAXSUBTOTAL$78);
            }
            target.set(maxSubtotal);
        }
    }
    
    /**
     * Unsets the "maxSubtotal" attribute
     */
    public void unsetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXSUBTOTAL$78);
        }
    }
    
    /**
     * Gets the "minSubtotal" attribute
     */
    public boolean getMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUBTOTAL$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINSUBTOTAL$80);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "minSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINSUBTOTAL$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MINSUBTOTAL$80);
            }
            return target;
        }
    }
    
    /**
     * True if has "minSubtotal" attribute
     */
    public boolean isSetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINSUBTOTAL$80) != null;
        }
    }
    
    /**
     * Sets the "minSubtotal" attribute
     */
    public void setMinSubtotal(boolean minSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUBTOTAL$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINSUBTOTAL$80);
            }
            target.setBooleanValue(minSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "minSubtotal" attribute
     */
    public void xsetMinSubtotal(org.apache.xmlbeans.XmlBoolean minSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINSUBTOTAL$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MINSUBTOTAL$80);
            }
            target.set(minSubtotal);
        }
    }
    
    /**
     * Unsets the "minSubtotal" attribute
     */
    public void unsetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINSUBTOTAL$80);
        }
    }
    
    /**
     * Gets the "productSubtotal" attribute
     */
    public boolean getProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRODUCTSUBTOTAL$82);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "productSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRODUCTSUBTOTAL$82);
            }
            return target;
        }
    }
    
    /**
     * True if has "productSubtotal" attribute
     */
    public boolean isSetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRODUCTSUBTOTAL$82) != null;
        }
    }
    
    /**
     * Sets the "productSubtotal" attribute
     */
    public void setProductSubtotal(boolean productSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRODUCTSUBTOTAL$82);
            }
            target.setBooleanValue(productSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "productSubtotal" attribute
     */
    public void xsetProductSubtotal(org.apache.xmlbeans.XmlBoolean productSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRODUCTSUBTOTAL$82);
            }
            target.set(productSubtotal);
        }
    }
    
    /**
     * Unsets the "productSubtotal" attribute
     */
    public void unsetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRODUCTSUBTOTAL$82);
        }
    }
    
    /**
     * Gets the "countSubtotal" attribute
     */
    public boolean getCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTSUBTOTAL$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNTSUBTOTAL$84);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "countSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTSUBTOTAL$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COUNTSUBTOTAL$84);
            }
            return target;
        }
    }
    
    /**
     * True if has "countSubtotal" attribute
     */
    public boolean isSetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTSUBTOTAL$84) != null;
        }
    }
    
    /**
     * Sets the "countSubtotal" attribute
     */
    public void setCountSubtotal(boolean countSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTSUBTOTAL$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTSUBTOTAL$84);
            }
            target.setBooleanValue(countSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "countSubtotal" attribute
     */
    public void xsetCountSubtotal(org.apache.xmlbeans.XmlBoolean countSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTSUBTOTAL$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COUNTSUBTOTAL$84);
            }
            target.set(countSubtotal);
        }
    }
    
    /**
     * Unsets the "countSubtotal" attribute
     */
    public void unsetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTSUBTOTAL$84);
        }
    }
    
    /**
     * Gets the "stdDevSubtotal" attribute
     */
    public boolean getStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVSUBTOTAL$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STDDEVSUBTOTAL$86);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdDevSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVSUBTOTAL$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STDDEVSUBTOTAL$86);
            }
            return target;
        }
    }
    
    /**
     * True if has "stdDevSubtotal" attribute
     */
    public boolean isSetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STDDEVSUBTOTAL$86) != null;
        }
    }
    
    /**
     * Sets the "stdDevSubtotal" attribute
     */
    public void setStdDevSubtotal(boolean stdDevSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVSUBTOTAL$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STDDEVSUBTOTAL$86);
            }
            target.setBooleanValue(stdDevSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "stdDevSubtotal" attribute
     */
    public void xsetStdDevSubtotal(org.apache.xmlbeans.XmlBoolean stdDevSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVSUBTOTAL$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STDDEVSUBTOTAL$86);
            }
            target.set(stdDevSubtotal);
        }
    }
    
    /**
     * Unsets the "stdDevSubtotal" attribute
     */
    public void unsetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STDDEVSUBTOTAL$86);
        }
    }
    
    /**
     * Gets the "stdDevPSubtotal" attribute
     */
    public boolean getStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STDDEVPSUBTOTAL$88);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdDevPSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STDDEVPSUBTOTAL$88);
            }
            return target;
        }
    }
    
    /**
     * True if has "stdDevPSubtotal" attribute
     */
    public boolean isSetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STDDEVPSUBTOTAL$88) != null;
        }
    }
    
    /**
     * Sets the "stdDevPSubtotal" attribute
     */
    public void setStdDevPSubtotal(boolean stdDevPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STDDEVPSUBTOTAL$88);
            }
            target.setBooleanValue(stdDevPSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "stdDevPSubtotal" attribute
     */
    public void xsetStdDevPSubtotal(org.apache.xmlbeans.XmlBoolean stdDevPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STDDEVPSUBTOTAL$88);
            }
            target.set(stdDevPSubtotal);
        }
    }
    
    /**
     * Unsets the "stdDevPSubtotal" attribute
     */
    public void unsetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STDDEVPSUBTOTAL$88);
        }
    }
    
    /**
     * Gets the "varSubtotal" attribute
     */
    public boolean getVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSUBTOTAL$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VARSUBTOTAL$90);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "varSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSUBTOTAL$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VARSUBTOTAL$90);
            }
            return target;
        }
    }
    
    /**
     * True if has "varSubtotal" attribute
     */
    public boolean isSetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARSUBTOTAL$90) != null;
        }
    }
    
    /**
     * Sets the "varSubtotal" attribute
     */
    public void setVarSubtotal(boolean varSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSUBTOTAL$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARSUBTOTAL$90);
            }
            target.setBooleanValue(varSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "varSubtotal" attribute
     */
    public void xsetVarSubtotal(org.apache.xmlbeans.XmlBoolean varSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSUBTOTAL$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VARSUBTOTAL$90);
            }
            target.set(varSubtotal);
        }
    }
    
    /**
     * Unsets the "varSubtotal" attribute
     */
    public void unsetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARSUBTOTAL$90);
        }
    }
    
    /**
     * Gets the "varPSubtotal" attribute
     */
    public boolean getVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARPSUBTOTAL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VARPSUBTOTAL$92);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "varPSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARPSUBTOTAL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VARPSUBTOTAL$92);
            }
            return target;
        }
    }
    
    /**
     * True if has "varPSubtotal" attribute
     */
    public boolean isSetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARPSUBTOTAL$92) != null;
        }
    }
    
    /**
     * Sets the "varPSubtotal" attribute
     */
    public void setVarPSubtotal(boolean varPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARPSUBTOTAL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARPSUBTOTAL$92);
            }
            target.setBooleanValue(varPSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "varPSubtotal" attribute
     */
    public void xsetVarPSubtotal(org.apache.xmlbeans.XmlBoolean varPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARPSUBTOTAL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VARPSUBTOTAL$92);
            }
            target.set(varPSubtotal);
        }
    }
    
    /**
     * Unsets the "varPSubtotal" attribute
     */
    public void unsetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARPSUBTOTAL$92);
        }
    }
    
    /**
     * Gets the "showPropCell" attribute
     */
    public boolean getShowPropCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPCELL$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWPROPCELL$94);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showPropCell" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowPropCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPCELL$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWPROPCELL$94);
            }
            return target;
        }
    }
    
    /**
     * True if has "showPropCell" attribute
     */
    public boolean isSetShowPropCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWPROPCELL$94) != null;
        }
    }
    
    /**
     * Sets the "showPropCell" attribute
     */
    public void setShowPropCell(boolean showPropCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPCELL$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWPROPCELL$94);
            }
            target.setBooleanValue(showPropCell);
        }
    }
    
    /**
     * Sets (as xml) the "showPropCell" attribute
     */
    public void xsetShowPropCell(org.apache.xmlbeans.XmlBoolean showPropCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPCELL$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWPROPCELL$94);
            }
            target.set(showPropCell);
        }
    }
    
    /**
     * Unsets the "showPropCell" attribute
     */
    public void unsetShowPropCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWPROPCELL$94);
        }
    }
    
    /**
     * Gets the "showPropTip" attribute
     */
    public boolean getShowPropTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPTIP$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWPROPTIP$96);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showPropTip" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowPropTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPTIP$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWPROPTIP$96);
            }
            return target;
        }
    }
    
    /**
     * True if has "showPropTip" attribute
     */
    public boolean isSetShowPropTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWPROPTIP$96) != null;
        }
    }
    
    /**
     * Sets the "showPropTip" attribute
     */
    public void setShowPropTip(boolean showPropTip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPTIP$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWPROPTIP$96);
            }
            target.setBooleanValue(showPropTip);
        }
    }
    
    /**
     * Sets (as xml) the "showPropTip" attribute
     */
    public void xsetShowPropTip(org.apache.xmlbeans.XmlBoolean showPropTip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPTIP$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWPROPTIP$96);
            }
            target.set(showPropTip);
        }
    }
    
    /**
     * Unsets the "showPropTip" attribute
     */
    public void unsetShowPropTip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWPROPTIP$96);
        }
    }
    
    /**
     * Gets the "showPropAsCaption" attribute
     */
    public boolean getShowPropAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPASCAPTION$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWPROPASCAPTION$98);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showPropAsCaption" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowPropAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPASCAPTION$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWPROPASCAPTION$98);
            }
            return target;
        }
    }
    
    /**
     * True if has "showPropAsCaption" attribute
     */
    public boolean isSetShowPropAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWPROPASCAPTION$98) != null;
        }
    }
    
    /**
     * Sets the "showPropAsCaption" attribute
     */
    public void setShowPropAsCaption(boolean showPropAsCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWPROPASCAPTION$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWPROPASCAPTION$98);
            }
            target.setBooleanValue(showPropAsCaption);
        }
    }
    
    /**
     * Sets (as xml) the "showPropAsCaption" attribute
     */
    public void xsetShowPropAsCaption(org.apache.xmlbeans.XmlBoolean showPropAsCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWPROPASCAPTION$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWPROPASCAPTION$98);
            }
            target.set(showPropAsCaption);
        }
    }
    
    /**
     * Unsets the "showPropAsCaption" attribute
     */
    public void unsetShowPropAsCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWPROPASCAPTION$98);
        }
    }
    
    /**
     * Gets the "defaultAttributeDrillState" attribute
     */
    public boolean getDefaultAttributeDrillState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTATTRIBUTEDRILLSTATE$100);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultAttributeDrillState" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultAttributeDrillState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTATTRIBUTEDRILLSTATE$100);
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultAttributeDrillState" attribute
     */
    public boolean isSetDefaultAttributeDrillState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100) != null;
        }
    }
    
    /**
     * Sets the "defaultAttributeDrillState" attribute
     */
    public void setDefaultAttributeDrillState(boolean defaultAttributeDrillState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            }
            target.setBooleanValue(defaultAttributeDrillState);
        }
    }
    
    /**
     * Sets (as xml) the "defaultAttributeDrillState" attribute
     */
    public void xsetDefaultAttributeDrillState(org.apache.xmlbeans.XmlBoolean defaultAttributeDrillState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
            }
            target.set(defaultAttributeDrillState);
        }
    }
    
    /**
     * Unsets the "defaultAttributeDrillState" attribute
     */
    public void unsetDefaultAttributeDrillState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTATTRIBUTEDRILLSTATE$100);
        }
    }
}
