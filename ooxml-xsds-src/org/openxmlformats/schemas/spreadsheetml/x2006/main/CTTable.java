/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTable extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttable736dtype");
    
    /**
     * Gets the "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter();
    
    /**
     * True if has "autoFilter" element
     */
    boolean isSetAutoFilter();
    
    /**
     * Sets the "autoFilter" element
     */
    void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter);
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter();
    
    /**
     * Unsets the "autoFilter" element
     */
    void unsetAutoFilter();
    
    /**
     * Gets the "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState();
    
    /**
     * True if has "sortState" element
     */
    boolean isSetSortState();
    
    /**
     * Sets the "sortState" element
     */
    void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState);
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState();
    
    /**
     * Unsets the "sortState" element
     */
    void unsetSortState();
    
    /**
     * Gets the "tableColumns" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns getTableColumns();
    
    /**
     * Sets the "tableColumns" element
     */
    void setTableColumns(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns tableColumns);
    
    /**
     * Appends and returns a new empty "tableColumns" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns addNewTableColumns();
    
    /**
     * Gets the "tableStyleInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo getTableStyleInfo();
    
    /**
     * True if has "tableStyleInfo" element
     */
    boolean isSetTableStyleInfo();
    
    /**
     * Sets the "tableStyleInfo" element
     */
    void setTableStyleInfo(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo tableStyleInfo);
    
    /**
     * Appends and returns a new empty "tableStyleInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo addNewTableStyleInfo();
    
    /**
     * Unsets the "tableStyleInfo" element
     */
    void unsetTableStyleInfo();
    
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
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "displayName" attribute
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDisplayName();
    
    /**
     * Sets the "displayName" attribute
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    void xsetDisplayName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring displayName);
    
    /**
     * Gets the "comment" attribute
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "comment" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetComment();
    
    /**
     * True if has "comment" attribute
     */
    boolean isSetComment();
    
    /**
     * Sets the "comment" attribute
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "comment" attribute
     */
    void xsetComment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring comment);
    
    /**
     * Unsets the "comment" attribute
     */
    void unsetComment();
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * Gets the "tableType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType.Enum getTableType();
    
    /**
     * Gets (as xml) the "tableType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType xgetTableType();
    
    /**
     * True if has "tableType" attribute
     */
    boolean isSetTableType();
    
    /**
     * Sets the "tableType" attribute
     */
    void setTableType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType.Enum tableType);
    
    /**
     * Sets (as xml) the "tableType" attribute
     */
    void xsetTableType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType tableType);
    
    /**
     * Unsets the "tableType" attribute
     */
    void unsetTableType();
    
    /**
     * Gets the "headerRowCount" attribute
     */
    long getHeaderRowCount();
    
    /**
     * Gets (as xml) the "headerRowCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetHeaderRowCount();
    
    /**
     * True if has "headerRowCount" attribute
     */
    boolean isSetHeaderRowCount();
    
    /**
     * Sets the "headerRowCount" attribute
     */
    void setHeaderRowCount(long headerRowCount);
    
    /**
     * Sets (as xml) the "headerRowCount" attribute
     */
    void xsetHeaderRowCount(org.apache.xmlbeans.XmlUnsignedInt headerRowCount);
    
    /**
     * Unsets the "headerRowCount" attribute
     */
    void unsetHeaderRowCount();
    
    /**
     * Gets the "insertRow" attribute
     */
    boolean getInsertRow();
    
    /**
     * Gets (as xml) the "insertRow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertRow();
    
    /**
     * True if has "insertRow" attribute
     */
    boolean isSetInsertRow();
    
    /**
     * Sets the "insertRow" attribute
     */
    void setInsertRow(boolean insertRow);
    
    /**
     * Sets (as xml) the "insertRow" attribute
     */
    void xsetInsertRow(org.apache.xmlbeans.XmlBoolean insertRow);
    
    /**
     * Unsets the "insertRow" attribute
     */
    void unsetInsertRow();
    
    /**
     * Gets the "insertRowShift" attribute
     */
    boolean getInsertRowShift();
    
    /**
     * Gets (as xml) the "insertRowShift" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertRowShift();
    
    /**
     * True if has "insertRowShift" attribute
     */
    boolean isSetInsertRowShift();
    
    /**
     * Sets the "insertRowShift" attribute
     */
    void setInsertRowShift(boolean insertRowShift);
    
    /**
     * Sets (as xml) the "insertRowShift" attribute
     */
    void xsetInsertRowShift(org.apache.xmlbeans.XmlBoolean insertRowShift);
    
    /**
     * Unsets the "insertRowShift" attribute
     */
    void unsetInsertRowShift();
    
    /**
     * Gets the "totalsRowCount" attribute
     */
    long getTotalsRowCount();
    
    /**
     * Gets (as xml) the "totalsRowCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTotalsRowCount();
    
    /**
     * True if has "totalsRowCount" attribute
     */
    boolean isSetTotalsRowCount();
    
    /**
     * Sets the "totalsRowCount" attribute
     */
    void setTotalsRowCount(long totalsRowCount);
    
    /**
     * Sets (as xml) the "totalsRowCount" attribute
     */
    void xsetTotalsRowCount(org.apache.xmlbeans.XmlUnsignedInt totalsRowCount);
    
    /**
     * Unsets the "totalsRowCount" attribute
     */
    void unsetTotalsRowCount();
    
    /**
     * Gets the "totalsRowShown" attribute
     */
    boolean getTotalsRowShown();
    
    /**
     * Gets (as xml) the "totalsRowShown" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTotalsRowShown();
    
    /**
     * True if has "totalsRowShown" attribute
     */
    boolean isSetTotalsRowShown();
    
    /**
     * Sets the "totalsRowShown" attribute
     */
    void setTotalsRowShown(boolean totalsRowShown);
    
    /**
     * Sets (as xml) the "totalsRowShown" attribute
     */
    void xsetTotalsRowShown(org.apache.xmlbeans.XmlBoolean totalsRowShown);
    
    /**
     * Unsets the "totalsRowShown" attribute
     */
    void unsetTotalsRowShown();
    
    /**
     * Gets the "published" attribute
     */
    boolean getPublished();
    
    /**
     * Gets (as xml) the "published" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPublished();
    
    /**
     * True if has "published" attribute
     */
    boolean isSetPublished();
    
    /**
     * Sets the "published" attribute
     */
    void setPublished(boolean published);
    
    /**
     * Sets (as xml) the "published" attribute
     */
    void xsetPublished(org.apache.xmlbeans.XmlBoolean published);
    
    /**
     * Unsets the "published" attribute
     */
    void unsetPublished();
    
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
     * Gets the "headerRowBorderDxfId" attribute
     */
    long getHeaderRowBorderDxfId();
    
    /**
     * Gets (as xml) the "headerRowBorderDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetHeaderRowBorderDxfId();
    
    /**
     * True if has "headerRowBorderDxfId" attribute
     */
    boolean isSetHeaderRowBorderDxfId();
    
    /**
     * Sets the "headerRowBorderDxfId" attribute
     */
    void setHeaderRowBorderDxfId(long headerRowBorderDxfId);
    
    /**
     * Sets (as xml) the "headerRowBorderDxfId" attribute
     */
    void xsetHeaderRowBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId headerRowBorderDxfId);
    
    /**
     * Unsets the "headerRowBorderDxfId" attribute
     */
    void unsetHeaderRowBorderDxfId();
    
    /**
     * Gets the "tableBorderDxfId" attribute
     */
    long getTableBorderDxfId();
    
    /**
     * Gets (as xml) the "tableBorderDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTableBorderDxfId();
    
    /**
     * True if has "tableBorderDxfId" attribute
     */
    boolean isSetTableBorderDxfId();
    
    /**
     * Sets the "tableBorderDxfId" attribute
     */
    void setTableBorderDxfId(long tableBorderDxfId);
    
    /**
     * Sets (as xml) the "tableBorderDxfId" attribute
     */
    void xsetTableBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId tableBorderDxfId);
    
    /**
     * Unsets the "tableBorderDxfId" attribute
     */
    void unsetTableBorderDxfId();
    
    /**
     * Gets the "totalsRowBorderDxfId" attribute
     */
    long getTotalsRowBorderDxfId();
    
    /**
     * Gets (as xml) the "totalsRowBorderDxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTotalsRowBorderDxfId();
    
    /**
     * True if has "totalsRowBorderDxfId" attribute
     */
    boolean isSetTotalsRowBorderDxfId();
    
    /**
     * Sets the "totalsRowBorderDxfId" attribute
     */
    void setTotalsRowBorderDxfId(long totalsRowBorderDxfId);
    
    /**
     * Sets (as xml) the "totalsRowBorderDxfId" attribute
     */
    void xsetTotalsRowBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId totalsRowBorderDxfId);
    
    /**
     * Unsets the "totalsRowBorderDxfId" attribute
     */
    void unsetTotalsRowBorderDxfId();
    
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
     * Gets the "connectionId" attribute
     */
    long getConnectionId();
    
    /**
     * Gets (as xml) the "connectionId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetConnectionId();
    
    /**
     * True if has "connectionId" attribute
     */
    boolean isSetConnectionId();
    
    /**
     * Sets the "connectionId" attribute
     */
    void setConnectionId(long connectionId);
    
    /**
     * Sets (as xml) the "connectionId" attribute
     */
    void xsetConnectionId(org.apache.xmlbeans.XmlUnsignedInt connectionId);
    
    /**
     * Unsets the "connectionId" attribute
     */
    void unsetConnectionId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
