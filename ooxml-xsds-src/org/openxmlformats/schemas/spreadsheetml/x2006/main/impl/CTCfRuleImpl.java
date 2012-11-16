/*
 * XML Type:  CT_CfRule
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CfRule(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCfRuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule
{
    
    public CTCfRuleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula");
    private static final javax.xml.namespace.QName COLORSCALE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colorScale");
    private static final javax.xml.namespace.QName DATABAR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataBar");
    private static final javax.xml.namespace.QName ICONSET$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "iconSet");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DXFID$12 = 
        new javax.xml.namespace.QName("", "dxfId");
    private static final javax.xml.namespace.QName PRIORITY$14 = 
        new javax.xml.namespace.QName("", "priority");
    private static final javax.xml.namespace.QName STOPIFTRUE$16 = 
        new javax.xml.namespace.QName("", "stopIfTrue");
    private static final javax.xml.namespace.QName ABOVEAVERAGE$18 = 
        new javax.xml.namespace.QName("", "aboveAverage");
    private static final javax.xml.namespace.QName PERCENT$20 = 
        new javax.xml.namespace.QName("", "percent");
    private static final javax.xml.namespace.QName BOTTOM$22 = 
        new javax.xml.namespace.QName("", "bottom");
    private static final javax.xml.namespace.QName OPERATOR$24 = 
        new javax.xml.namespace.QName("", "operator");
    private static final javax.xml.namespace.QName TEXT$26 = 
        new javax.xml.namespace.QName("", "text");
    private static final javax.xml.namespace.QName TIMEPERIOD$28 = 
        new javax.xml.namespace.QName("", "timePeriod");
    private static final javax.xml.namespace.QName RANK$30 = 
        new javax.xml.namespace.QName("", "rank");
    private static final javax.xml.namespace.QName STDDEV$32 = 
        new javax.xml.namespace.QName("", "stdDev");
    private static final javax.xml.namespace.QName EQUALAVERAGE$34 = 
        new javax.xml.namespace.QName("", "equalAverage");
    
    
    /**
     * Gets a List of "formula" elements
     */
    public java.util.List<java.lang.String> getFormulaList()
    {
        final class FormulaList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTCfRuleImpl.this.getFormulaArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTCfRuleImpl.this.getFormulaArray(i);
                CTCfRuleImpl.this.setFormulaArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTCfRuleImpl.this.insertFormula(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTCfRuleImpl.this.getFormulaArray(i);
                CTCfRuleImpl.this.removeFormula(i);
                return old;
            }
            
            public int size()
                { return CTCfRuleImpl.this.sizeOfFormulaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FormulaList();
        }
    }
    
    /**
     * Gets array of all "formula" elements
     */
    public java.lang.String[] getFormulaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMULA$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "formula" element
     */
    public java.lang.String getFormulaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "formula" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula> xgetFormulaList()
    {
        final class FormulaList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula get(int i)
                { return CTCfRuleImpl.this.xgetFormulaArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula old = CTCfRuleImpl.this.xgetFormulaArray(i);
                CTCfRuleImpl.this.xsetFormulaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula o)
                { CTCfRuleImpl.this.insertNewFormula(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula old = CTCfRuleImpl.this.xgetFormulaArray(i);
                CTCfRuleImpl.this.removeFormula(i);
                return old;
            }
            
            public int size()
                { return CTCfRuleImpl.this.sizeOfFormulaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FormulaList();
        }
    }
    
    /**
     * Gets (as xml) array of all "formula" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[] xgetFormulaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMULA$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "formula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormulaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)target;
        }
    }
    
    /**
     * Returns number of "formula" element
     */
    public int sizeOfFormulaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA$0);
        }
    }
    
    /**
     * Sets array of all "formula" element
     */
    public void setFormulaArray(java.lang.String[] formulaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formulaArray, FORMULA$0);
        }
    }
    
    /**
     * Sets ith "formula" element
     */
    public void setFormulaArray(int i, java.lang.String formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(formula);
        }
    }
    
    /**
     * Sets (as xml) array of all "formula" element
     */
    public void xsetFormulaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[]formulaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formulaArray, FORMULA$0);
        }
    }
    
    /**
     * Sets (as xml) ith "formula" element
     */
    public void xsetFormulaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(formula);
        }
    }
    
    /**
     * Inserts the value as the ith "formula" element
     */
    public void insertFormula(int i, java.lang.String formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FORMULA$0, i);
            target.setStringValue(formula);
        }
    }
    
    /**
     * Appends the value as the last "formula" element
     */
    public void addFormula(java.lang.String formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULA$0);
            target.setStringValue(formula);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula insertNewFormula(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().insert_element_user(FORMULA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula addNewFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(FORMULA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "formula" element
     */
    public void removeFormula(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA$0, i);
        }
    }
    
    /**
     * Gets the "colorScale" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale getColorScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().find_element_user(COLORSCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colorScale" element
     */
    public boolean isSetColorScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORSCALE$2) != 0;
        }
    }
    
    /**
     * Sets the "colorScale" element
     */
    public void setColorScale(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale colorScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().find_element_user(COLORSCALE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().add_element_user(COLORSCALE$2);
            }
            target.set(colorScale);
        }
    }
    
    /**
     * Appends and returns a new empty "colorScale" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale addNewColorScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale)get_store().add_element_user(COLORSCALE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "colorScale" element
     */
    public void unsetColorScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORSCALE$2, 0);
        }
    }
    
    /**
     * Gets the "dataBar" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar getDataBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().find_element_user(DATABAR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataBar" element
     */
    public boolean isSetDataBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABAR$4) != 0;
        }
    }
    
    /**
     * Sets the "dataBar" element
     */
    public void setDataBar(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar dataBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().find_element_user(DATABAR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().add_element_user(DATABAR$4);
            }
            target.set(dataBar);
        }
    }
    
    /**
     * Appends and returns a new empty "dataBar" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar addNewDataBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar)get_store().add_element_user(DATABAR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dataBar" element
     */
    public void unsetDataBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABAR$4, 0);
        }
    }
    
    /**
     * Gets the "iconSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet getIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().find_element_user(ICONSET$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iconSet" element
     */
    public boolean isSetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICONSET$6) != 0;
        }
    }
    
    /**
     * Sets the "iconSet" element
     */
    public void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().find_element_user(ICONSET$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().add_element_user(ICONSET$6);
            }
            target.set(iconSet);
        }
    }
    
    /**
     * Appends and returns a new empty "iconSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet addNewIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet)get_store().add_element_user(ICONSET$6);
            return target;
        }
    }
    
    /**
     * Unsets the "iconSet" element
     */
    public void unsetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICONSET$6, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType)get_store().find_attribute_user(TYPE$10);
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
            return get_store().find_attribute_user(TYPE$10) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType)get_store().add_attribute_user(TYPE$10);
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
            get_store().remove_attribute(TYPE$10);
        }
    }
    
    /**
     * Gets the "dxfId" attribute
     */
    public long getDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$12);
            return target;
        }
    }
    
    /**
     * True if has "dxfId" attribute
     */
    public boolean isSetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXFID$12) != null;
        }
    }
    
    /**
     * Sets the "dxfId" attribute
     */
    public void setDxfId(long dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXFID$12);
            }
            target.setLongValue(dxfId);
        }
    }
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    public void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DXFID$12);
            }
            target.set(dxfId);
        }
    }
    
    /**
     * Unsets the "dxfId" attribute
     */
    public void unsetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXFID$12);
        }
    }
    
    /**
     * Gets the "priority" attribute
     */
    public int getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$14);
            return target;
        }
    }
    
    /**
     * Sets the "priority" attribute
     */
    public void setPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$14);
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRIORITY$14);
            }
            target.set(priority);
        }
    }
    
    /**
     * Gets the "stopIfTrue" attribute
     */
    public boolean getStopIfTrue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPIFTRUE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STOPIFTRUE$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stopIfTrue" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStopIfTrue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STOPIFTRUE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STOPIFTRUE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "stopIfTrue" attribute
     */
    public boolean isSetStopIfTrue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STOPIFTRUE$16) != null;
        }
    }
    
    /**
     * Sets the "stopIfTrue" attribute
     */
    public void setStopIfTrue(boolean stopIfTrue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STOPIFTRUE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STOPIFTRUE$16);
            }
            target.setBooleanValue(stopIfTrue);
        }
    }
    
    /**
     * Sets (as xml) the "stopIfTrue" attribute
     */
    public void xsetStopIfTrue(org.apache.xmlbeans.XmlBoolean stopIfTrue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STOPIFTRUE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STOPIFTRUE$16);
            }
            target.set(stopIfTrue);
        }
    }
    
    /**
     * Unsets the "stopIfTrue" attribute
     */
    public void unsetStopIfTrue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STOPIFTRUE$16);
        }
    }
    
    /**
     * Gets the "aboveAverage" attribute
     */
    public boolean getAboveAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABOVEAVERAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABOVEAVERAGE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "aboveAverage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAboveAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABOVEAVERAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ABOVEAVERAGE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "aboveAverage" attribute
     */
    public boolean isSetAboveAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABOVEAVERAGE$18) != null;
        }
    }
    
    /**
     * Sets the "aboveAverage" attribute
     */
    public void setAboveAverage(boolean aboveAverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABOVEAVERAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABOVEAVERAGE$18);
            }
            target.setBooleanValue(aboveAverage);
        }
    }
    
    /**
     * Sets (as xml) the "aboveAverage" attribute
     */
    public void xsetAboveAverage(org.apache.xmlbeans.XmlBoolean aboveAverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABOVEAVERAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABOVEAVERAGE$18);
            }
            target.set(aboveAverage);
        }
    }
    
    /**
     * Unsets the "aboveAverage" attribute
     */
    public void unsetAboveAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABOVEAVERAGE$18);
        }
    }
    
    /**
     * Gets the "percent" attribute
     */
    public boolean getPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERCENT$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "percent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PERCENT$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "percent" attribute
     */
    public boolean isSetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERCENT$20) != null;
        }
    }
    
    /**
     * Sets the "percent" attribute
     */
    public void setPercent(boolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERCENT$20);
            }
            target.setBooleanValue(percent);
        }
    }
    
    /**
     * Sets (as xml) the "percent" attribute
     */
    public void xsetPercent(org.apache.xmlbeans.XmlBoolean percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PERCENT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PERCENT$20);
            }
            target.set(percent);
        }
    }
    
    /**
     * Unsets the "percent" attribute
     */
    public void unsetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERCENT$20);
        }
    }
    
    /**
     * Gets the "bottom" attribute
     */
    public boolean getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BOTTOM$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bottom" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOTTOM$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BOTTOM$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" attribute
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOTTOM$22) != null;
        }
    }
    
    /**
     * Sets the "bottom" attribute
     */
    public void setBottom(boolean bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOM$22);
            }
            target.setBooleanValue(bottom);
        }
    }
    
    /**
     * Sets (as xml) the "bottom" attribute
     */
    public void xsetBottom(org.apache.xmlbeans.XmlBoolean bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOTTOM$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BOTTOM$22);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Unsets the "bottom" attribute
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOTTOM$22);
        }
    }
    
    /**
     * Gets the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$24);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().find_attribute_user(OPERATOR$24);
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$24) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$24);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().find_attribute_user(OPERATOR$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator)get_store().add_attribute_user(OPERATOR$24);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$24);
        }
    }
    
    /**
     * Gets the "text" attribute
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" attribute
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$26);
            return target;
        }
    }
    
    /**
     * True if has "text" attribute
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXT$26) != null;
        }
    }
    
    /**
     * Sets the "text" attribute
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$26);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" attribute
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXT$26);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "text" attribute
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXT$26);
        }
    }
    
    /**
     * Gets the "timePeriod" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod.Enum getTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$28);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "timePeriod" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod xgetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod)get_store().find_attribute_user(TIMEPERIOD$28);
            return target;
        }
    }
    
    /**
     * True if has "timePeriod" attribute
     */
    public boolean isSetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEPERIOD$28) != null;
        }
    }
    
    /**
     * Sets the "timePeriod" attribute
     */
    public void setTimePeriod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod.Enum timePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEPERIOD$28);
            }
            target.setEnumValue(timePeriod);
        }
    }
    
    /**
     * Sets (as xml) the "timePeriod" attribute
     */
    public void xsetTimePeriod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod timePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod)get_store().find_attribute_user(TIMEPERIOD$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod)get_store().add_attribute_user(TIMEPERIOD$28);
            }
            target.set(timePeriod);
        }
    }
    
    /**
     * Unsets the "timePeriod" attribute
     */
    public void unsetTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEPERIOD$28);
        }
    }
    
    /**
     * Gets the "rank" attribute
     */
    public long getRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANK$30);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rank" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RANK$30);
            return target;
        }
    }
    
    /**
     * True if has "rank" attribute
     */
    public boolean isSetRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RANK$30) != null;
        }
    }
    
    /**
     * Sets the "rank" attribute
     */
    public void setRank(long rank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANK$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RANK$30);
            }
            target.setLongValue(rank);
        }
    }
    
    /**
     * Sets (as xml) the "rank" attribute
     */
    public void xsetRank(org.apache.xmlbeans.XmlUnsignedInt rank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RANK$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RANK$30);
            }
            target.set(rank);
        }
    }
    
    /**
     * Unsets the "rank" attribute
     */
    public void unsetRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RANK$30);
        }
    }
    
    /**
     * Gets the "stdDev" attribute
     */
    public int getStdDev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEV$32);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdDev" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetStdDev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(STDDEV$32);
            return target;
        }
    }
    
    /**
     * True if has "stdDev" attribute
     */
    public boolean isSetStdDev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STDDEV$32) != null;
        }
    }
    
    /**
     * Sets the "stdDev" attribute
     */
    public void setStdDev(int stdDev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STDDEV$32);
            }
            target.setIntValue(stdDev);
        }
    }
    
    /**
     * Sets (as xml) the "stdDev" attribute
     */
    public void xsetStdDev(org.apache.xmlbeans.XmlInt stdDev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(STDDEV$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(STDDEV$32);
            }
            target.set(stdDev);
        }
    }
    
    /**
     * Unsets the "stdDev" attribute
     */
    public void unsetStdDev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STDDEV$32);
        }
    }
    
    /**
     * Gets the "equalAverage" attribute
     */
    public boolean getEqualAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUALAVERAGE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EQUALAVERAGE$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "equalAverage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEqualAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EQUALAVERAGE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EQUALAVERAGE$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "equalAverage" attribute
     */
    public boolean isSetEqualAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EQUALAVERAGE$34) != null;
        }
    }
    
    /**
     * Sets the "equalAverage" attribute
     */
    public void setEqualAverage(boolean equalAverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQUALAVERAGE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQUALAVERAGE$34);
            }
            target.setBooleanValue(equalAverage);
        }
    }
    
    /**
     * Sets (as xml) the "equalAverage" attribute
     */
    public void xsetEqualAverage(org.apache.xmlbeans.XmlBoolean equalAverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EQUALAVERAGE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EQUALAVERAGE$34);
            }
            target.set(equalAverage);
        }
    }
    
    /**
     * Unsets the "equalAverage" attribute
     */
    public void unsetEqualAverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EQUALAVERAGE$34);
        }
    }
}
