/*
 * XML Type:  CT_Format
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Format(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFormat extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFormat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctformat1940type");
    
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
     * Gets the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
