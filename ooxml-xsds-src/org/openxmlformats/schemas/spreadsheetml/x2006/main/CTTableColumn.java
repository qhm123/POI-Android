/*
 * XML Type:  CT_TableColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TableColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableColumn extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablecolumn08a3type");
    
    /**
     * Gets the "calculatedColumnFormula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula getCalculatedColumnFormula();
    
    /**
     * True if has "calculatedColumnFormula" element
     */
    boolean isSetCalculatedColumnFormula();
    
    /**
     * Sets the "calculatedColumnFormula" element
     */
    void setCalculatedColumnFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula calculatedColumnFormula);
    
    /**
     * Appends and returns a new empty "calculatedColumnFormula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula addNewCalculatedColumnFormula();
    
    /**
     * Unsets the "calculatedColumnFormula" element
     */
    void unsetCalculatedColumnFormula();
    
    /**
     * Gets the "totalsRowFormula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula getTotalsRowFormula();
    
    /**
     * True if has "totalsRowFormula" element
     */
    boolean isSetTotalsRowFormula();
    
    /**
     * Sets the "totalsRowFormula" element
     */
    void setTotalsRowFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula totalsRowFormula);
    
    /**
     * Appends and returns a new empty "totalsRowFormula" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula addNewTotalsRowFormula();
    
    /**
     * Unsets the "totalsRowFormula" element
     */
    void unsetTotalsRowFormula();
    
    /**
     * Gets the "xmlColumnPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr getXmlColumnPr();
    
    /**
     * True if has "xmlColumnPr" element
     */
    boolean isSetXmlColumnPr();
    
    /**
     * Sets the "xmlColumnPr" element
     */
    void setXmlColumnPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr xmlColumnPr);
    
    /**
     * Appends and returns a new empty "xmlColumnPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr addNewXmlColumnPr();
    
    /**
     * Unsets the "xmlColumnPr" element
     */
    void unsetXmlColumnPr();
    
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
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlUnsignedInt id);
    
    /**
     * Gets the "uniqueName" attribute
     */
    java.lang.String getUniqueName();
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName();
    
    /**
     * True if has "uniqueName" attribute
     */
    boolean isSetUniqueName();
    
    /**
     * Sets the "uniqueName" attribute
     */
    void setUniqueName(java.lang.String uniqueName);
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName);
    
    /**
     * Unsets the "uniqueName" attribute
     */
    void unsetUniqueName();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Gets the "totalsRowFunction" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction.Enum getTotalsRowFunction();
    
    /**
     * Gets (as xml) the "totalsRowFunction" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction xgetTotalsRowFunction();
    
    /**
     * True if has "totalsRowFunction" attribute
     */
    boolean isSetTotalsRowFunction();
    
    /**
     * Sets the "totalsRowFunction" attribute
     */
    void setTotalsRowFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction.Enum totalsRowFunction);
    
    /**
     * Sets (as xml) the "totalsRowFunction" attribute
     */
    void xsetTotalsRowFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction totalsRowFunction);
    
    /**
     * Unsets the "totalsRowFunction" attribute
     */
    void unsetTotalsRowFunction();
    
    /**
     * Gets the "totalsRowLabel" attribute
     */
    java.lang.String getTotalsRowLabel();
    
    /**
     * Gets (as xml) the "totalsRowLabel" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTotalsRowLabel();
    
    /**
     * True if has "totalsRowLabel" attribute
     */
    boolean isSetTotalsRowLabel();
    
    /**
     * Sets the "totalsRowLabel" attribute
     */
    void setTotalsRowLabel(java.lang.String totalsRowLabel);
    
    /**
     * Sets (as xml) the "totalsRowLabel" attribute
     */
    void xsetTotalsRowLabel(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring totalsRowLabel);
    
    /**
     * Unsets the "totalsRowLabel" attribute
     */
    void unsetTotalsRowLabel();
    
    /**
     * Gets the "queryTableFieldId" attribute
     */
    long getQueryTableFieldId();
    
    /**
     * Gets (as xml) the "queryTableFieldId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetQueryTableFieldId();
    
    /**
     * True if has "queryTableFieldId" attribute
     */
    boolean isSetQueryTableFieldId();
    
    /**
     * Sets the "queryTableFieldId" attribute
     */
    void setQueryTableFieldId(long queryTableFieldId);
    
    /**
     * Sets (as xml) the "queryTableFieldId" attribute
     */
    void xsetQueryTableFieldId(org.apache.xmlbeans.XmlUnsignedInt queryTableFieldId);
    
    /**
     * Unsets the "queryTableFieldId" attribute
     */
    void unsetQueryTableFieldId();
    
    /**
     * Gets the "headerRowDxfId" attribute
     */
    long getHeaderRowDxfId();
    
    /**
     * Gets (as xml) the "headerRowDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetHeaderRowDxfId();
    
    /**
     * True if has "headerRowDxfId" attribute
     */
    boolean isSetHeaderRowDxfId();
    
    /**
     * Sets the "headerRowDxfId" attribute
     */
    void setHeaderRowDxfId(long headerRowDxfId);
    
    /**
     * Sets (as xml) the "headerRowDxfId" attribute
     */
    void xsetHeaderRowDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId headerRowDxfId);
    
    /**
     * Unsets the "headerRowDxfId" attribute
     */
    void unsetHeaderRowDxfId();
    
    /**
     * Gets the "dataDxfId" attribute
     */
    long getDataDxfId();
    
    /**
     * Gets (as xml) the "dataDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDataDxfId();
    
    /**
     * True if has "dataDxfId" attribute
     */
    boolean isSetDataDxfId();
    
    /**
     * Sets the "dataDxfId" attribute
     */
    void setDataDxfId(long dataDxfId);
    
    /**
     * Sets (as xml) the "dataDxfId" attribute
     */
    void xsetDataDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dataDxfId);
    
    /**
     * Unsets the "dataDxfId" attribute
     */
    void unsetDataDxfId();
    
    /**
     * Gets the "totalsRowDxfId" attribute
     */
    long getTotalsRowDxfId();
    
    /**
     * Gets (as xml) the "totalsRowDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTotalsRowDxfId();
    
    /**
     * True if has "totalsRowDxfId" attribute
     */
    boolean isSetTotalsRowDxfId();
    
    /**
     * Sets the "totalsRowDxfId" attribute
     */
    void setTotalsRowDxfId(long totalsRowDxfId);
    
    /**
     * Sets (as xml) the "totalsRowDxfId" attribute
     */
    void xsetTotalsRowDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId totalsRowDxfId);
    
    /**
     * Unsets the "totalsRowDxfId" attribute
     */
    void unsetTotalsRowDxfId();
    
    /**
     * Gets the "headerRowCellStyle" attribute
     */
    java.lang.String getHeaderRowCellStyle();
    
    /**
     * Gets (as xml) the "headerRowCellStyle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetHeaderRowCellStyle();
    
    /**
     * True if has "headerRowCellStyle" attribute
     */
    boolean isSetHeaderRowCellStyle();
    
    /**
     * Sets the "headerRowCellStyle" attribute
     */
    void setHeaderRowCellStyle(java.lang.String headerRowCellStyle);
    
    /**
     * Sets (as xml) the "headerRowCellStyle" attribute
     */
    void xsetHeaderRowCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring headerRowCellStyle);
    
    /**
     * Unsets the "headerRowCellStyle" attribute
     */
    void unsetHeaderRowCellStyle();
    
    /**
     * Gets the "dataCellStyle" attribute
     */
    java.lang.String getDataCellStyle();
    
    /**
     * Gets (as xml) the "dataCellStyle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDataCellStyle();
    
    /**
     * True if has "dataCellStyle" attribute
     */
    boolean isSetDataCellStyle();
    
    /**
     * Sets the "dataCellStyle" attribute
     */
    void setDataCellStyle(java.lang.String dataCellStyle);
    
    /**
     * Sets (as xml) the "dataCellStyle" attribute
     */
    void xsetDataCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring dataCellStyle);
    
    /**
     * Unsets the "dataCellStyle" attribute
     */
    void unsetDataCellStyle();
    
    /**
     * Gets the "totalsRowCellStyle" attribute
     */
    java.lang.String getTotalsRowCellStyle();
    
    /**
     * Gets (as xml) the "totalsRowCellStyle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTotalsRowCellStyle();
    
    /**
     * True if has "totalsRowCellStyle" attribute
     */
    boolean isSetTotalsRowCellStyle();
    
    /**
     * Sets the "totalsRowCellStyle" attribute
     */
    void setTotalsRowCellStyle(java.lang.String totalsRowCellStyle);
    
    /**
     * Sets (as xml) the "totalsRowCellStyle" attribute
     */
    void xsetTotalsRowCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring totalsRowCellStyle);
    
    /**
     * Unsets the "totalsRowCellStyle" attribute
     */
    void unsetTotalsRowCellStyle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
