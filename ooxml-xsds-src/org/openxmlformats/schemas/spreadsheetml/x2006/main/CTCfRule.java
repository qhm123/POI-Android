/*
 * XML Type:  CT_CfRule
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CfRule(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCfRule extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCfRule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcfrule3548type");
    
    /**
     * Gets a List of "formula" elements
     */
    java.util.List<java.lang.String> getFormulaList();
    
    /**
     * Gets array of all "formula" elements
     * @deprecated
     */
    java.lang.String[] getFormulaArray();
    
    /**
     * Gets ith "formula" element
     */
    java.lang.String getFormulaArray(int i);
    
    /**
     * Gets (as xml) a List of "formula" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula> xgetFormulaList();
    
    /**
     * Gets (as xml) array of all "formula" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[] xgetFormulaArray();
    
    /**
     * Gets (as xml) ith "formula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormulaArray(int i);
    
    /**
     * Returns number of "formula" element
     */
    int sizeOfFormulaArray();
    
    /**
     * Sets array of all "formula" element
     */
    void setFormulaArray(java.lang.String[] formulaArray);
    
    /**
     * Sets ith "formula" element
     */
    void setFormulaArray(int i, java.lang.String formula);
    
    /**
     * Sets (as xml) array of all "formula" element
     */
    void xsetFormulaArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula[] formulaArray);
    
    /**
     * Sets (as xml) ith "formula" element
     */
    void xsetFormulaArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula);
    
    /**
     * Inserts the value as the ith "formula" element
     */
    void insertFormula(int i, java.lang.String formula);
    
    /**
     * Appends the value as the last "formula" element
     */
    void addFormula(java.lang.String formula);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula insertNewFormula(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula addNewFormula();
    
    /**
     * Removes the ith "formula" element
     */
    void removeFormula(int i);
    
    /**
     * Gets the "colorScale" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale getColorScale();
    
    /**
     * True if has "colorScale" element
     */
    boolean isSetColorScale();
    
    /**
     * Sets the "colorScale" element
     */
    void setColorScale(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale colorScale);
    
    /**
     * Appends and returns a new empty "colorScale" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale addNewColorScale();
    
    /**
     * Unsets the "colorScale" element
     */
    void unsetColorScale();
    
    /**
     * Gets the "dataBar" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar getDataBar();
    
    /**
     * True if has "dataBar" element
     */
    boolean isSetDataBar();
    
    /**
     * Sets the "dataBar" element
     */
    void setDataBar(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar dataBar);
    
    /**
     * Appends and returns a new empty "dataBar" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar addNewDataBar();
    
    /**
     * Unsets the "dataBar" element
     */
    void unsetDataBar();
    
    /**
     * Gets the "iconSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet getIconSet();
    
    /**
     * True if has "iconSet" element
     */
    boolean isSetIconSet();
    
    /**
     * Sets the "iconSet" element
     */
    void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet iconSet);
    
    /**
     * Appends and returns a new empty "iconSet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet addNewIconSet();
    
    /**
     * Unsets the "iconSet" element
     */
    void unsetIconSet();
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "dxfId" attribute
     */
    long getDxfId();
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId();
    
    /**
     * True if has "dxfId" attribute
     */
    boolean isSetDxfId();
    
    /**
     * Sets the "dxfId" attribute
     */
    void setDxfId(long dxfId);
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId);
    
    /**
     * Unsets the "dxfId" attribute
     */
    void unsetDxfId();
    
    /**
     * Gets the "priority" attribute
     */
    int getPriority();
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPriority();
    
    /**
     * Sets the "priority" attribute
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    void xsetPriority(org.apache.xmlbeans.XmlInt priority);
    
    /**
     * Gets the "stopIfTrue" attribute
     */
    boolean getStopIfTrue();
    
    /**
     * Gets (as xml) the "stopIfTrue" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetStopIfTrue();
    
    /**
     * True if has "stopIfTrue" attribute
     */
    boolean isSetStopIfTrue();
    
    /**
     * Sets the "stopIfTrue" attribute
     */
    void setStopIfTrue(boolean stopIfTrue);
    
    /**
     * Sets (as xml) the "stopIfTrue" attribute
     */
    void xsetStopIfTrue(org.apache.xmlbeans.XmlBoolean stopIfTrue);
    
    /**
     * Unsets the "stopIfTrue" attribute
     */
    void unsetStopIfTrue();
    
    /**
     * Gets the "aboveAverage" attribute
     */
    boolean getAboveAverage();
    
    /**
     * Gets (as xml) the "aboveAverage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAboveAverage();
    
    /**
     * True if has "aboveAverage" attribute
     */
    boolean isSetAboveAverage();
    
    /**
     * Sets the "aboveAverage" attribute
     */
    void setAboveAverage(boolean aboveAverage);
    
    /**
     * Sets (as xml) the "aboveAverage" attribute
     */
    void xsetAboveAverage(org.apache.xmlbeans.XmlBoolean aboveAverage);
    
    /**
     * Unsets the "aboveAverage" attribute
     */
    void unsetAboveAverage();
    
    /**
     * Gets the "percent" attribute
     */
    boolean getPercent();
    
    /**
     * Gets (as xml) the "percent" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPercent();
    
    /**
     * True if has "percent" attribute
     */
    boolean isSetPercent();
    
    /**
     * Sets the "percent" attribute
     */
    void setPercent(boolean percent);
    
    /**
     * Sets (as xml) the "percent" attribute
     */
    void xsetPercent(org.apache.xmlbeans.XmlBoolean percent);
    
    /**
     * Unsets the "percent" attribute
     */
    void unsetPercent();
    
    /**
     * Gets the "bottom" attribute
     */
    boolean getBottom();
    
    /**
     * Gets (as xml) the "bottom" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBottom();
    
    /**
     * True if has "bottom" attribute
     */
    boolean isSetBottom();
    
    /**
     * Sets the "bottom" attribute
     */
    void setBottom(boolean bottom);
    
    /**
     * Sets (as xml) the "bottom" attribute
     */
    void xsetBottom(org.apache.xmlbeans.XmlBoolean bottom);
    
    /**
     * Unsets the "bottom" attribute
     */
    void unsetBottom();
    
    /**
     * Gets the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum getOperator();
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator xgetOperator();
    
    /**
     * True if has "operator" attribute
     */
    boolean isSetOperator();
    
    /**
     * Sets the "operator" attribute
     */
    void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.Enum operator);
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator operator);
    
    /**
     * Unsets the "operator" attribute
     */
    void unsetOperator();
    
    /**
     * Gets the "text" attribute
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" attribute
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * True if has "text" attribute
     */
    boolean isSetText();
    
    /**
     * Sets the "text" attribute
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" attribute
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Unsets the "text" attribute
     */
    void unsetText();
    
    /**
     * Gets the "timePeriod" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod.Enum getTimePeriod();
    
    /**
     * Gets (as xml) the "timePeriod" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod xgetTimePeriod();
    
    /**
     * True if has "timePeriod" attribute
     */
    boolean isSetTimePeriod();
    
    /**
     * Sets the "timePeriod" attribute
     */
    void setTimePeriod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod.Enum timePeriod);
    
    /**
     * Sets (as xml) the "timePeriod" attribute
     */
    void xsetTimePeriod(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod timePeriod);
    
    /**
     * Unsets the "timePeriod" attribute
     */
    void unsetTimePeriod();
    
    /**
     * Gets the "rank" attribute
     */
    long getRank();
    
    /**
     * Gets (as xml) the "rank" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRank();
    
    /**
     * True if has "rank" attribute
     */
    boolean isSetRank();
    
    /**
     * Sets the "rank" attribute
     */
    void setRank(long rank);
    
    /**
     * Sets (as xml) the "rank" attribute
     */
    void xsetRank(org.apache.xmlbeans.XmlUnsignedInt rank);
    
    /**
     * Unsets the "rank" attribute
     */
    void unsetRank();
    
    /**
     * Gets the "stdDev" attribute
     */
    int getStdDev();
    
    /**
     * Gets (as xml) the "stdDev" attribute
     */
    org.apache.xmlbeans.XmlInt xgetStdDev();
    
    /**
     * True if has "stdDev" attribute
     */
    boolean isSetStdDev();
    
    /**
     * Sets the "stdDev" attribute
     */
    void setStdDev(int stdDev);
    
    /**
     * Sets (as xml) the "stdDev" attribute
     */
    void xsetStdDev(org.apache.xmlbeans.XmlInt stdDev);
    
    /**
     * Unsets the "stdDev" attribute
     */
    void unsetStdDev();
    
    /**
     * Gets the "equalAverage" attribute
     */
    boolean getEqualAverage();
    
    /**
     * Gets (as xml) the "equalAverage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEqualAverage();
    
    /**
     * True if has "equalAverage" attribute
     */
    boolean isSetEqualAverage();
    
    /**
     * Sets the "equalAverage" attribute
     */
    void setEqualAverage(boolean equalAverage);
    
    /**
     * Sets (as xml) the "equalAverage" attribute
     */
    void xsetEqualAverage(org.apache.xmlbeans.XmlBoolean equalAverage);
    
    /**
     * Unsets the "equalAverage" attribute
     */
    void unsetEqualAverage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
