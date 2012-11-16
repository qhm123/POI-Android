/*
 * XML Type:  CT_Acc
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTAcc
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_Acc(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTAcc extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAcc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctaccd5bbtype");
    
    /**
     * Gets the "accPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr getAccPr();
    
    /**
     * True if has "accPr" element
     */
    boolean isSetAccPr();
    
    /**
     * Sets the "accPr" element
     */
    void setAccPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr accPr);
    
    /**
     * Appends and returns a new empty "accPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTAccPr addNewAccPr();
    
    /**
     * Unsets the "accPr" element
     */
    void unsetAccPr();
    
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
