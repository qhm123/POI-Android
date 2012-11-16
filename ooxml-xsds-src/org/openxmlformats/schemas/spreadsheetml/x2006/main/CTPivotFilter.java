/*
 * XML Type:  CT_PivotFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotfilter22b9type");
    
    /**
     * Gets the "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter();
    
    /**
     * Sets the "autoFilter" element
     */
    void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter);
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter();
    
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
     * Gets the "fld" attribute
     */
    long getFld();
    
    /**
     * Gets (as xml) the "fld" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFld();
    
    /**
     * Sets the "fld" attribute
     */
    void setFld(long fld);
    
    /**
     * Sets (as xml) the "fld" attribute
     */
    void xsetFld(org.apache.xmlbeans.XmlUnsignedInt fld);
    
    /**
     * Gets the "mpFld" attribute
     */
    long getMpFld();
    
    /**
     * Gets (as xml) the "mpFld" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMpFld();
    
    /**
     * True if has "mpFld" attribute
     */
    boolean isSetMpFld();
    
    /**
     * Sets the "mpFld" attribute
     */
    void setMpFld(long mpFld);
    
    /**
     * Sets (as xml) the "mpFld" attribute
     */
    void xsetMpFld(org.apache.xmlbeans.XmlUnsignedInt mpFld);
    
    /**
     * Unsets the "mpFld" attribute
     */
    void unsetMpFld();
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType type);
    
    /**
     * Gets the "evalOrder" attribute
     */
    int getEvalOrder();
    
    /**
     * Gets (as xml) the "evalOrder" attribute
     */
    org.apache.xmlbeans.XmlInt xgetEvalOrder();
    
    /**
     * True if has "evalOrder" attribute
     */
    boolean isSetEvalOrder();
    
    /**
     * Sets the "evalOrder" attribute
     */
    void setEvalOrder(int evalOrder);
    
    /**
     * Sets (as xml) the "evalOrder" attribute
     */
    void xsetEvalOrder(org.apache.xmlbeans.XmlInt evalOrder);
    
    /**
     * Unsets the "evalOrder" attribute
     */
    void unsetEvalOrder();
    
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
     * Gets the "iMeasureHier" attribute
     */
    long getIMeasureHier();
    
    /**
     * Gets (as xml) the "iMeasureHier" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIMeasureHier();
    
    /**
     * True if has "iMeasureHier" attribute
     */
    boolean isSetIMeasureHier();
    
    /**
     * Sets the "iMeasureHier" attribute
     */
    void setIMeasureHier(long iMeasureHier);
    
    /**
     * Sets (as xml) the "iMeasureHier" attribute
     */
    void xsetIMeasureHier(org.apache.xmlbeans.XmlUnsignedInt iMeasureHier);
    
    /**
     * Unsets the "iMeasureHier" attribute
     */
    void unsetIMeasureHier();
    
    /**
     * Gets the "iMeasureFld" attribute
     */
    long getIMeasureFld();
    
    /**
     * Gets (as xml) the "iMeasureFld" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIMeasureFld();
    
    /**
     * True if has "iMeasureFld" attribute
     */
    boolean isSetIMeasureFld();
    
    /**
     * Sets the "iMeasureFld" attribute
     */
    void setIMeasureFld(long iMeasureFld);
    
    /**
     * Sets (as xml) the "iMeasureFld" attribute
     */
    void xsetIMeasureFld(org.apache.xmlbeans.XmlUnsignedInt iMeasureFld);
    
    /**
     * Unsets the "iMeasureFld" attribute
     */
    void unsetIMeasureFld();
    
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
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
    /**
     * Gets the "stringValue1" attribute
     */
    java.lang.String getStringValue1();
    
    /**
     * Gets (as xml) the "stringValue1" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStringValue1();
    
    /**
     * True if has "stringValue1" attribute
     */
    boolean isSetStringValue1();
    
    /**
     * Sets the "stringValue1" attribute
     */
    void setStringValue1(java.lang.String stringValue1);
    
    /**
     * Sets (as xml) the "stringValue1" attribute
     */
    void xsetStringValue1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring stringValue1);
    
    /**
     * Unsets the "stringValue1" attribute
     */
    void unsetStringValue1();
    
    /**
     * Gets the "stringValue2" attribute
     */
    java.lang.String getStringValue2();
    
    /**
     * Gets (as xml) the "stringValue2" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStringValue2();
    
    /**
     * True if has "stringValue2" attribute
     */
    boolean isSetStringValue2();
    
    /**
     * Sets the "stringValue2" attribute
     */
    void setStringValue2(java.lang.String stringValue2);
    
    /**
     * Sets (as xml) the "stringValue2" attribute
     */
    void xsetStringValue2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring stringValue2);
    
    /**
     * Unsets the "stringValue2" attribute
     */
    void unsetStringValue2();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
