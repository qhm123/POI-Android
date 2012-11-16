/*
 * XML Type:  CT_TablePartStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TablePartStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTablePartStyle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTablePartStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablepartstylef22btype");
    
    /**
     * Gets the "tcTxStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle getTcTxStyle();
    
    /**
     * True if has "tcTxStyle" element
     */
    boolean isSetTcTxStyle();
    
    /**
     * Sets the "tcTxStyle" element
     */
    void setTcTxStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle tcTxStyle);
    
    /**
     * Appends and returns a new empty "tcTxStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle addNewTcTxStyle();
    
    /**
     * Unsets the "tcTxStyle" element
     */
    void unsetTcTxStyle();
    
    /**
     * Gets the "tcStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle getTcStyle();
    
    /**
     * True if has "tcStyle" element
     */
    boolean isSetTcStyle();
    
    /**
     * Sets the "tcStyle" element
     */
    void setTcStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle tcStyle);
    
    /**
     * Appends and returns a new empty "tcStyle" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle addNewTcStyle();
    
    /**
     * Unsets the "tcStyle" element
     */
    void unsetTcStyle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
