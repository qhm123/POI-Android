/*
 * XML Type:  CT_SSub
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTSSub
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_SSub(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTSSub extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSSub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctssubfdc5type");
    
    /**
     * Gets the "sSubPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr getSSubPr();
    
    /**
     * True if has "sSubPr" element
     */
    boolean isSetSSubPr();
    
    /**
     * Sets the "sSubPr" element
     */
    void setSSubPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr sSubPr);
    
    /**
     * Appends and returns a new empty "sSubPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTSSubPr addNewSSubPr();
    
    /**
     * Unsets the "sSubPr" element
     */
    void unsetSSubPr();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
