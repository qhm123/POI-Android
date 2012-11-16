/*
 * XML Type:  CT_Phant
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTPhant
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_Phant(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTPhant extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPhant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctphant234dtype");
    
    /**
     * Gets the "phantPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr getPhantPr();
    
    /**
     * True if has "phantPr" element
     */
    boolean isSetPhantPr();
    
    /**
     * Sets the "phantPr" element
     */
    void setPhantPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr phantPr);
    
    /**
     * Appends and returns a new empty "phantPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTPhantPr addNewPhantPr();
    
    /**
     * Unsets the "phantPr" element
     */
    void unsetPhantPr();
    
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
