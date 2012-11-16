/*
 * XML Type:  CT_PivotArea
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotArea(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea
{
    
    public CTPivotAreaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "references");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName FIELD$4 = 
        new javax.xml.namespace.QName("", "field");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DATAONLY$8 = 
        new javax.xml.namespace.QName("", "dataOnly");
    private static final javax.xml.namespace.QName LABELONLY$10 = 
        new javax.xml.namespace.QName("", "labelOnly");
    private static final javax.xml.namespace.QName GRANDROW$12 = 
        new javax.xml.namespace.QName("", "grandRow");
    private static final javax.xml.namespace.QName GRANDCOL$14 = 
        new javax.xml.namespace.QName("", "grandCol");
    private static final javax.xml.namespace.QName CACHEINDEX$16 = 
        new javax.xml.namespace.QName("", "cacheIndex");
    private static final javax.xml.namespace.QName OUTLINE$18 = 
        new javax.xml.namespace.QName("", "outline");
    private static final javax.xml.namespace.QName OFFSET$20 = 
        new javax.xml.namespace.QName("", "offset");
    private static final javax.xml.namespace.QName COLLAPSEDLEVELSARESUBTOTALS$22 = 
        new javax.xml.namespace.QName("", "collapsedLevelsAreSubtotals");
    private static final javax.xml.namespace.QName AXIS$24 = 
        new javax.xml.namespace.QName("", "axis");
    private static final javax.xml.namespace.QName FIELDPOSITION$26 = 
        new javax.xml.namespace.QName("", "fieldPosition");
    
    
    /**
     * Gets the "references" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "references" element
     */
    public boolean isSetReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCES$0) != 0;
        }
    }
    
    /**
     * Sets the "references" element
     */
    public void setReferences(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences)get_store().add_element_user(REFERENCES$0);
            }
            target.set(references);
        }
    }
    
    /**
     * Appends and returns a new empty "references" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences)get_store().add_element_user(REFERENCES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "references" element
     */
    public void unsetReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCES$0, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "field" attribute
     */
    public int getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "field" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FIELD$4);
            return target;
        }
    }
    
    /**
     * True if has "field" attribute
     */
    public boolean isSetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELD$4) != null;
        }
    }
    
    /**
     * Sets the "field" attribute
     */
    public void setField(int field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$4);
            }
            target.setIntValue(field);
        }
    }
    
    /**
     * Sets (as xml) the "field" attribute
     */
    public void xsetField(org.apache.xmlbeans.XmlInt field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(FIELD$4);
            }
            target.set(field);
        }
    }
    
    /**
     * Unsets the "field" attribute
     */
    public void unsetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELD$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType)get_default_attribute_value(TYPE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotAreaType)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$6);
        }
    }
    
    /**
     * Gets the "dataOnly" attribute
     */
    public boolean getDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATAONLY$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataOnly" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATAONLY$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "dataOnly" attribute
     */
    public boolean isSetDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAONLY$8) != null;
        }
    }
    
    /**
     * Sets the "dataOnly" attribute
     */
    public void setDataOnly(boolean dataOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAONLY$8);
            }
            target.setBooleanValue(dataOnly);
        }
    }
    
    /**
     * Sets (as xml) the "dataOnly" attribute
     */
    public void xsetDataOnly(org.apache.xmlbeans.XmlBoolean dataOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATAONLY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATAONLY$8);
            }
            target.set(dataOnly);
        }
    }
    
    /**
     * Unsets the "dataOnly" attribute
     */
    public void unsetDataOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAONLY$8);
        }
    }
    
    /**
     * Gets the "labelOnly" attribute
     */
    public boolean getLabelOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELONLY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LABELONLY$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "labelOnly" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLabelOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LABELONLY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LABELONLY$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "labelOnly" attribute
     */
    public boolean isSetLabelOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABELONLY$10) != null;
        }
    }
    
    /**
     * Sets the "labelOnly" attribute
     */
    public void setLabelOnly(boolean labelOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELONLY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELONLY$10);
            }
            target.setBooleanValue(labelOnly);
        }
    }
    
    /**
     * Sets (as xml) the "labelOnly" attribute
     */
    public void xsetLabelOnly(org.apache.xmlbeans.XmlBoolean labelOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LABELONLY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LABELONLY$10);
            }
            target.set(labelOnly);
        }
    }
    
    /**
     * Unsets the "labelOnly" attribute
     */
    public void unsetLabelOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABELONLY$10);
        }
    }
    
    /**
     * Gets the "grandRow" attribute
     */
    public boolean getGrandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRANDROW$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "grandRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGrandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRANDROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GRANDROW$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "grandRow" attribute
     */
    public boolean isSetGrandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRANDROW$12) != null;
        }
    }
    
    /**
     * Sets the "grandRow" attribute
     */
    public void setGrandRow(boolean grandRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRANDROW$12);
            }
            target.setBooleanValue(grandRow);
        }
    }
    
    /**
     * Sets (as xml) the "grandRow" attribute
     */
    public void xsetGrandRow(org.apache.xmlbeans.XmlBoolean grandRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRANDROW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GRANDROW$12);
            }
            target.set(grandRow);
        }
    }
    
    /**
     * Unsets the "grandRow" attribute
     */
    public void unsetGrandRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRANDROW$12);
        }
    }
    
    /**
     * Gets the "grandCol" attribute
     */
    public boolean getGrandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDCOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRANDCOL$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "grandCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetGrandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRANDCOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(GRANDCOL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "grandCol" attribute
     */
    public boolean isSetGrandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRANDCOL$14) != null;
        }
    }
    
    /**
     * Sets the "grandCol" attribute
     */
    public void setGrandCol(boolean grandCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRANDCOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRANDCOL$14);
            }
            target.setBooleanValue(grandCol);
        }
    }
    
    /**
     * Sets (as xml) the "grandCol" attribute
     */
    public void xsetGrandCol(org.apache.xmlbeans.XmlBoolean grandCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(GRANDCOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(GRANDCOL$14);
            }
            target.set(grandCol);
        }
    }
    
    /**
     * Unsets the "grandCol" attribute
     */
    public void unsetGrandCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRANDCOL$14);
        }
    }
    
    /**
     * Gets the "cacheIndex" attribute
     */
    public boolean getCacheIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEINDEX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CACHEINDEX$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cacheIndex" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCacheIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHEINDEX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CACHEINDEX$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "cacheIndex" attribute
     */
    public boolean isSetCacheIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHEINDEX$16) != null;
        }
    }
    
    /**
     * Sets the "cacheIndex" attribute
     */
    public void setCacheIndex(boolean cacheIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEINDEX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEINDEX$16);
            }
            target.setBooleanValue(cacheIndex);
        }
    }
    
    /**
     * Sets (as xml) the "cacheIndex" attribute
     */
    public void xsetCacheIndex(org.apache.xmlbeans.XmlBoolean cacheIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHEINDEX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CACHEINDEX$16);
            }
            target.set(cacheIndex);
        }
    }
    
    /**
     * Unsets the "cacheIndex" attribute
     */
    public void unsetCacheIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHEINDEX$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINE$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINE$18);
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
            return get_store().find_attribute_user(OUTLINE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINE$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINE$18);
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
            get_store().remove_attribute(OUTLINE$18);
        }
    }
    
    /**
     * Gets the "offset" attribute
     */
    public java.lang.String getOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offset" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(OFFSET$20);
            return target;
        }
    }
    
    /**
     * True if has "offset" attribute
     */
    public boolean isSetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFSET$20) != null;
        }
    }
    
    /**
     * Sets the "offset" attribute
     */
    public void setOffset(java.lang.String offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSET$20);
            }
            target.setStringValue(offset);
        }
    }
    
    /**
     * Sets (as xml) the "offset" attribute
     */
    public void xsetOffset(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(OFFSET$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(OFFSET$20);
            }
            target.set(offset);
        }
    }
    
    /**
     * Unsets the "offset" attribute
     */
    public void unsetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFSET$20);
        }
    }
    
    /**
     * Gets the "collapsedLevelsAreSubtotals" attribute
     */
    public boolean getCollapsedLevelsAreSubtotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLLAPSEDLEVELSARESUBTOTALS$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "collapsedLevelsAreSubtotals" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCollapsedLevelsAreSubtotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COLLAPSEDLEVELSARESUBTOTALS$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "collapsedLevelsAreSubtotals" attribute
     */
    public boolean isSetCollapsedLevelsAreSubtotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22) != null;
        }
    }
    
    /**
     * Sets the "collapsedLevelsAreSubtotals" attribute
     */
    public void setCollapsedLevelsAreSubtotals(boolean collapsedLevelsAreSubtotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            }
            target.setBooleanValue(collapsedLevelsAreSubtotals);
        }
    }
    
    /**
     * Sets (as xml) the "collapsedLevelsAreSubtotals" attribute
     */
    public void xsetCollapsedLevelsAreSubtotals(org.apache.xmlbeans.XmlBoolean collapsedLevelsAreSubtotals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COLLAPSEDLEVELSARESUBTOTALS$22);
            }
            target.set(collapsedLevelsAreSubtotals);
        }
    }
    
    /**
     * Unsets the "collapsedLevelsAreSubtotals" attribute
     */
    public void unsetCollapsedLevelsAreSubtotals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLLAPSEDLEVELSARESUBTOTALS$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$24);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$24);
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
            return get_store().find_attribute_user(AXIS$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXIS$24);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().find_attribute_user(AXIS$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis)get_store().add_attribute_user(AXIS$24);
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
            get_store().remove_attribute(AXIS$24);
        }
    }
    
    /**
     * Gets the "fieldPosition" attribute
     */
    public long getFieldPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPOSITION$26);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldPosition" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFieldPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELDPOSITION$26);
            return target;
        }
    }
    
    /**
     * True if has "fieldPosition" attribute
     */
    public boolean isSetFieldPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELDPOSITION$26) != null;
        }
    }
    
    /**
     * Sets the "fieldPosition" attribute
     */
    public void setFieldPosition(long fieldPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPOSITION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDPOSITION$26);
            }
            target.setLongValue(fieldPosition);
        }
    }
    
    /**
     * Sets (as xml) the "fieldPosition" attribute
     */
    public void xsetFieldPosition(org.apache.xmlbeans.XmlUnsignedInt fieldPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELDPOSITION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIELDPOSITION$26);
            }
            target.set(fieldPosition);
        }
    }
    
    /**
     * Unsets the "fieldPosition" attribute
     */
    public void unsetFieldPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELDPOSITION$26);
        }
    }
}
