/*
 * XML Type:  CT_BorderBox
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_BorderBox(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTBorderBox extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBorderBox.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctborderbox15bdtype");
    
    /**
     * Gets the "borderBoxPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr getBorderBoxPr();
    
    /**
     * True if has "borderBoxPr" element
     */
    boolean isSetBorderBoxPr();
    
    /**
     * Sets the "borderBoxPr" element
     */
    void setBorderBoxPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr borderBoxPr);
    
    /**
     * Appends and returns a new empty "borderBoxPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTBorderBoxPr addNewBorderBoxPr();
    
    /**
     * Unsets the "borderBoxPr" element
     */
    void unsetBorderBoxPr();
    
    /**
     * Gets the "e" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getE();
    
    /**
     * Sets the "e" element
     */
    void setE(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg e);
    
    /**
     * Appends and returns a new empty "e" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewE();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
