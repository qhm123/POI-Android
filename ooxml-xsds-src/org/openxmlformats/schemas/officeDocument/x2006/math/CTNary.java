/*
 * XML Type:  CT_Nary
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTNary
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_Nary(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTNary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnarye738type");
    
    /**
     * Gets the "naryPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr getNaryPr();
    
    /**
     * True if has "naryPr" element
     */
    boolean isSetNaryPr();
    
    /**
     * Sets the "naryPr" element
     */
    void setNaryPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr naryPr);
    
    /**
     * Appends and returns a new empty "naryPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTNaryPr addNewNaryPr();
    
    /**
     * Unsets the "naryPr" element
     */
    void unsetNaryPr();
    
    /**
     * Gets the "sub" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getSub();
    
    /**
     * Sets the "sub" element
     */
    void setSub(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg sub);
    
    /**
     * Appends and returns a new empty "sub" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewSub();
    
    /**
     * Gets the "sup" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getSup();
    
    /**
     * Sets the "sup" element
     */
    void setSup(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg sup);
    
    /**
     * Appends and returns a new empty "sup" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewSup();
    
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
