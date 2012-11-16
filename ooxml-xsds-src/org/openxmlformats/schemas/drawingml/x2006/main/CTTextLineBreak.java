/*
 * XML Type:  CT_TextLineBreak
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TextLineBreak(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextLineBreak extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextLineBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextlinebreak932ftype");
    
    /**
     * Gets the "rPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties getRPr();
    
    /**
     * True if has "rPr" element
     */
    boolean isSetRPr();
    
    /**
     * Sets the "rPr" element
     */
    void setRPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties rPr);
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties addNewRPr();
    
    /**
     * Unsets the "rPr" element
     */
    void unsetRPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
