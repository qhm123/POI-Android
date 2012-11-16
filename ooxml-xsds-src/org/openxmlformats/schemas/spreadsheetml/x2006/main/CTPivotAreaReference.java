/*
 * XML Type:  CT_PivotAreaReference
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotAreaReference(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotAreaReference extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotAreaReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivotareareferencee5a5type");
    
    /**
     * Gets a List of "x" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex> getXList();
    
    /**
     * Gets array of all "x" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] getXArray();
    
    /**
     * Gets ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex getXArray(int i);
    
    /**
     * Returns number of "x" element
     */
    int sizeOfXArray();
    
    /**
     * Sets array of all "x" element
     */
    void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] xArray);
    
    /**
     * Sets ith "x" element
     */
    void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex x);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex insertNewX(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex addNewX();
    
    /**
     * Removes the ith "x" element
     */
    void removeX(int i);
    
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
     * Gets the "field" attribute
     */
    long getField();
    
    /**
     * Gets (as xml) the "field" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetField();
    
    /**
     * True if has "field" attribute
     */
    boolean isSetField();
    
    /**
     * Sets the "field" attribute
     */
    void setField(long field);
    
    /**
     * Sets (as xml) the "field" attribute
     */
    void xsetField(org.apache.xmlbeans.XmlUnsignedInt field);
    
    /**
     * Unsets the "field" attribute
     */
    void unsetField();
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * Gets the "selected" attribute
     */
    boolean getSelected();
    
    /**
     * Gets (as xml) the "selected" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSelected();
    
    /**
     * True if has "selected" attribute
     */
    boolean isSetSelected();
    
    /**
     * Sets the "selected" attribute
     */
    void setSelected(boolean selected);
    
    /**
     * Sets (as xml) the "selected" attribute
     */
    void xsetSelected(org.apache.xmlbeans.XmlBoolean selected);
    
    /**
     * Unsets the "selected" attribute
     */
    void unsetSelected();
    
    /**
     * Gets the "byPosition" attribute
     */
    boolean getByPosition();
    
    /**
     * Gets (as xml) the "byPosition" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetByPosition();
    
    /**
     * True if has "byPosition" attribute
     */
    boolean isSetByPosition();
    
    /**
     * Sets the "byPosition" attribute
     */
    void setByPosition(boolean byPosition);
    
    /**
     * Sets (as xml) the "byPosition" attribute
     */
    void xsetByPosition(org.apache.xmlbeans.XmlBoolean byPosition);
    
    /**
     * Unsets the "byPosition" attribute
     */
    void unsetByPosition();
    
    /**
     * Gets the "relative" attribute
     */
    boolean getRelative();
    
    /**
     * Gets (as xml) the "relative" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRelative();
    
    /**
     * True if has "relative" attribute
     */
    boolean isSetRelative();
    
    /**
     * Sets the "relative" attribute
     */
    void setRelative(boolean relative);
    
    /**
     * Sets (as xml) the "relative" attribute
     */
    void xsetRelative(org.apache.xmlbeans.XmlBoolean relative);
    
    /**
     * Unsets the "relative" attribute
     */
    void unsetRelative();
    
    /**
     * Gets the "defaultSubtotal" attribute
     */
    boolean getDefaultSubtotal();
    
    /**
     * Gets (as xml) the "defaultSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDefaultSubtotal();
    
    /**
     * True if has "defaultSubtotal" attribute
     */
    boolean isSetDefaultSubtotal();
    
    /**
     * Sets the "defaultSubtotal" attribute
     */
    void setDefaultSubtotal(boolean defaultSubtotal);
    
    /**
     * Sets (as xml) the "defaultSubtotal" attribute
     */
    void xsetDefaultSubtotal(org.apache.xmlbeans.XmlBoolean defaultSubtotal);
    
    /**
     * Unsets the "defaultSubtotal" attribute
     */
    void unsetDefaultSubtotal();
    
    /**
     * Gets the "sumSubtotal" attribute
     */
    boolean getSumSubtotal();
    
    /**
     * Gets (as xml) the "sumSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSumSubtotal();
    
    /**
     * True if has "sumSubtotal" attribute
     */
    boolean isSetSumSubtotal();
    
    /**
     * Sets the "sumSubtotal" attribute
     */
    void setSumSubtotal(boolean sumSubtotal);
    
    /**
     * Sets (as xml) the "sumSubtotal" attribute
     */
    void xsetSumSubtotal(org.apache.xmlbeans.XmlBoolean sumSubtotal);
    
    /**
     * Unsets the "sumSubtotal" attribute
     */
    void unsetSumSubtotal();
    
    /**
     * Gets the "countASubtotal" attribute
     */
    boolean getCountASubtotal();
    
    /**
     * Gets (as xml) the "countASubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCountASubtotal();
    
    /**
     * True if has "countASubtotal" attribute
     */
    boolean isSetCountASubtotal();
    
    /**
     * Sets the "countASubtotal" attribute
     */
    void setCountASubtotal(boolean countASubtotal);
    
    /**
     * Sets (as xml) the "countASubtotal" attribute
     */
    void xsetCountASubtotal(org.apache.xmlbeans.XmlBoolean countASubtotal);
    
    /**
     * Unsets the "countASubtotal" attribute
     */
    void unsetCountASubtotal();
    
    /**
     * Gets the "avgSubtotal" attribute
     */
    boolean getAvgSubtotal();
    
    /**
     * Gets (as xml) the "avgSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAvgSubtotal();
    
    /**
     * True if has "avgSubtotal" attribute
     */
    boolean isSetAvgSubtotal();
    
    /**
     * Sets the "avgSubtotal" attribute
     */
    void setAvgSubtotal(boolean avgSubtotal);
    
    /**
     * Sets (as xml) the "avgSubtotal" attribute
     */
    void xsetAvgSubtotal(org.apache.xmlbeans.XmlBoolean avgSubtotal);
    
    /**
     * Unsets the "avgSubtotal" attribute
     */
    void unsetAvgSubtotal();
    
    /**
     * Gets the "maxSubtotal" attribute
     */
    boolean getMaxSubtotal();
    
    /**
     * Gets (as xml) the "maxSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMaxSubtotal();
    
    /**
     * True if has "maxSubtotal" attribute
     */
    boolean isSetMaxSubtotal();
    
    /**
     * Sets the "maxSubtotal" attribute
     */
    void setMaxSubtotal(boolean maxSubtotal);
    
    /**
     * Sets (as xml) the "maxSubtotal" attribute
     */
    void xsetMaxSubtotal(org.apache.xmlbeans.XmlBoolean maxSubtotal);
    
    /**
     * Unsets the "maxSubtotal" attribute
     */
    void unsetMaxSubtotal();
    
    /**
     * Gets the "minSubtotal" attribute
     */
    boolean getMinSubtotal();
    
    /**
     * Gets (as xml) the "minSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMinSubtotal();
    
    /**
     * True if has "minSubtotal" attribute
     */
    boolean isSetMinSubtotal();
    
    /**
     * Sets the "minSubtotal" attribute
     */
    void setMinSubtotal(boolean minSubtotal);
    
    /**
     * Sets (as xml) the "minSubtotal" attribute
     */
    void xsetMinSubtotal(org.apache.xmlbeans.XmlBoolean minSubtotal);
    
    /**
     * Unsets the "minSubtotal" attribute
     */
    void unsetMinSubtotal();
    
    /**
     * Gets the "productSubtotal" attribute
     */
    boolean getProductSubtotal();
    
    /**
     * Gets (as xml) the "productSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProductSubtotal();
    
    /**
     * True if has "productSubtotal" attribute
     */
    boolean isSetProductSubtotal();
    
    /**
     * Sets the "productSubtotal" attribute
     */
    void setProductSubtotal(boolean productSubtotal);
    
    /**
     * Sets (as xml) the "productSubtotal" attribute
     */
    void xsetProductSubtotal(org.apache.xmlbeans.XmlBoolean productSubtotal);
    
    /**
     * Unsets the "productSubtotal" attribute
     */
    void unsetProductSubtotal();
    
    /**
     * Gets the "countSubtotal" attribute
     */
    boolean getCountSubtotal();
    
    /**
     * Gets (as xml) the "countSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCountSubtotal();
    
    /**
     * True if has "countSubtotal" attribute
     */
    boolean isSetCountSubtotal();
    
    /**
     * Sets the "countSubtotal" attribute
     */
    void setCountSubtotal(boolean countSubtotal);
    
    /**
     * Sets (as xml) the "countSubtotal" attribute
     */
    void xsetCountSubtotal(org.apache.xmlbeans.XmlBoolean countSubtotal);
    
    /**
     * Unsets the "countSubtotal" attribute
     */
    void unsetCountSubtotal();
    
    /**
     * Gets the "stdDevSubtotal" attribute
     */
    boolean getStdDevSubtotal();
    
    /**
     * Gets (as xml) the "stdDevSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetStdDevSubtotal();
    
    /**
     * True if has "stdDevSubtotal" attribute
     */
    boolean isSetStdDevSubtotal();
    
    /**
     * Sets the "stdDevSubtotal" attribute
     */
    void setStdDevSubtotal(boolean stdDevSubtotal);
    
    /**
     * Sets (as xml) the "stdDevSubtotal" attribute
     */
    void xsetStdDevSubtotal(org.apache.xmlbeans.XmlBoolean stdDevSubtotal);
    
    /**
     * Unsets the "stdDevSubtotal" attribute
     */
    void unsetStdDevSubtotal();
    
    /**
     * Gets the "stdDevPSubtotal" attribute
     */
    boolean getStdDevPSubtotal();
    
    /**
     * Gets (as xml) the "stdDevPSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetStdDevPSubtotal();
    
    /**
     * True if has "stdDevPSubtotal" attribute
     */
    boolean isSetStdDevPSubtotal();
    
    /**
     * Sets the "stdDevPSubtotal" attribute
     */
    void setStdDevPSubtotal(boolean stdDevPSubtotal);
    
    /**
     * Sets (as xml) the "stdDevPSubtotal" attribute
     */
    void xsetStdDevPSubtotal(org.apache.xmlbeans.XmlBoolean stdDevPSubtotal);
    
    /**
     * Unsets the "stdDevPSubtotal" attribute
     */
    void unsetStdDevPSubtotal();
    
    /**
     * Gets the "varSubtotal" attribute
     */
    boolean getVarSubtotal();
    
    /**
     * Gets (as xml) the "varSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVarSubtotal();
    
    /**
     * True if has "varSubtotal" attribute
     */
    boolean isSetVarSubtotal();
    
    /**
     * Sets the "varSubtotal" attribute
     */
    void setVarSubtotal(boolean varSubtotal);
    
    /**
     * Sets (as xml) the "varSubtotal" attribute
     */
    void xsetVarSubtotal(org.apache.xmlbeans.XmlBoolean varSubtotal);
    
    /**
     * Unsets the "varSubtotal" attribute
     */
    void unsetVarSubtotal();
    
    /**
     * Gets the "varPSubtotal" attribute
     */
    boolean getVarPSubtotal();
    
    /**
     * Gets (as xml) the "varPSubtotal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetVarPSubtotal();
    
    /**
     * True if has "varPSubtotal" attribute
     */
    boolean isSetVarPSubtotal();
    
    /**
     * Sets the "varPSubtotal" attribute
     */
    void setVarPSubtotal(boolean varPSubtotal);
    
    /**
     * Sets (as xml) the "varPSubtotal" attribute
     */
    void xsetVarPSubtotal(org.apache.xmlbeans.XmlBoolean varPSubtotal);
    
    /**
     * Unsets the "varPSubtotal" attribute
     */
    void unsetVarPSubtotal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
