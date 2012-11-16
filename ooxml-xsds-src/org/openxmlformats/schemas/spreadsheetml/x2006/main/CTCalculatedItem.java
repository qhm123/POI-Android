/*
 * XML Type:  CT_CalculatedItem
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CalculatedItem(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCalculatedItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCalculatedItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcalculateditem29batype");
    
    /**
     * Gets the "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotArea();
    
    /**
     * Sets the "pivotArea" element
     */
    void setPivotArea(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea);
    
    /**
     * Appends and returns a new empty "pivotArea" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea();
    
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
     * Gets the "formula" attribute
     */
    java.lang.String getFormula();
    
    /**
     * Gets (as xml) the "formula" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFormula();
    
    /**
     * True if has "formula" attribute
     */
    boolean isSetFormula();
    
    /**
     * Sets the "formula" attribute
     */
    void setFormula(java.lang.String formula);
    
    /**
     * Sets (as xml) the "formula" attribute
     */
    void xsetFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring formula);
    
    /**
     * Unsets the "formula" attribute
     */
    void unsetFormula();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
