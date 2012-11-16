/*
 * XML Type:  CT_DataField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataField extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatafield6f0ftype");
    
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
     * Gets the "subtotal" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum getSubtotal();
    
    /**
     * Gets (as xml) the "subtotal" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction xgetSubtotal();
    
    /**
     * True if has "subtotal" attribute
     */
    boolean isSetSubtotal();
    
    /**
     * Sets the "subtotal" attribute
     */
    void setSubtotal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum subtotal);
    
    /**
     * Sets (as xml) the "subtotal" attribute
     */
    void xsetSubtotal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction subtotal);
    
    /**
     * Unsets the "subtotal" attribute
     */
    void unsetSubtotal();
    
    /**
     * Gets the "showDataAs" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.Enum getShowDataAs();
    
    /**
     * Gets (as xml) the "showDataAs" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs xgetShowDataAs();
    
    /**
     * True if has "showDataAs" attribute
     */
    boolean isSetShowDataAs();
    
    /**
     * Sets the "showDataAs" attribute
     */
    void setShowDataAs(org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs.Enum showDataAs);
    
    /**
     * Sets (as xml) the "showDataAs" attribute
     */
    void xsetShowDataAs(org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs showDataAs);
    
    /**
     * Unsets the "showDataAs" attribute
     */
    void unsetShowDataAs();
    
    /**
     * Gets the "baseField" attribute
     */
    int getBaseField();
    
    /**
     * Gets (as xml) the "baseField" attribute
     */
    org.apache.xmlbeans.XmlInt xgetBaseField();
    
    /**
     * True if has "baseField" attribute
     */
    boolean isSetBaseField();
    
    /**
     * Sets the "baseField" attribute
     */
    void setBaseField(int baseField);
    
    /**
     * Sets (as xml) the "baseField" attribute
     */
    void xsetBaseField(org.apache.xmlbeans.XmlInt baseField);
    
    /**
     * Unsets the "baseField" attribute
     */
    void unsetBaseField();
    
    /**
     * Gets the "baseItem" attribute
     */
    long getBaseItem();
    
    /**
     * Gets (as xml) the "baseItem" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetBaseItem();
    
    /**
     * True if has "baseItem" attribute
     */
    boolean isSetBaseItem();
    
    /**
     * Sets the "baseItem" attribute
     */
    void setBaseItem(long baseItem);
    
    /**
     * Sets (as xml) the "baseItem" attribute
     */
    void xsetBaseItem(org.apache.xmlbeans.XmlUnsignedInt baseItem);
    
    /**
     * Unsets the "baseItem" attribute
     */
    void unsetBaseItem();
    
    /**
     * Gets the "numFmtId" attribute
     */
    long getNumFmtId();
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId();
    
    /**
     * True if has "numFmtId" attribute
     */
    boolean isSetNumFmtId();
    
    /**
     * Sets the "numFmtId" attribute
     */
    void setNumFmtId(long numFmtId);
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId);
    
    /**
     * Unsets the "numFmtId" attribute
     */
    void unsetNumFmtId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
