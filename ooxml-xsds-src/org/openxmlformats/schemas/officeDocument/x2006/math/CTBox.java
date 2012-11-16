/*
 * XML Type:  CT_Box
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_Box(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTBox extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTBox.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctbox7a31type");
    
    /**
     * Gets the "boxPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr getBoxPr();
    
    /**
     * True if has "boxPr" element
     */
    boolean isSetBoxPr();
    
    /**
     * Sets the "boxPr" element
     */
    void setBoxPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr boxPr);
    
    /**
     * Appends and returns a new empty "boxPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTBoxPr addNewBoxPr();
    
    /**
     * Unsets the "boxPr" element
     */
    void unsetBoxPr();
    
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
