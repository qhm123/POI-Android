/*
 * XML Type:  CT_F
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTF
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_F(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTF extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTF.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfaff6type");
    
    /**
     * Gets the "fPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr getFPr();
    
    /**
     * True if has "fPr" element
     */
    boolean isSetFPr();
    
    /**
     * Sets the "fPr" element
     */
    void setFPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr fPr);
    
    /**
     * Appends and returns a new empty "fPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTFPr addNewFPr();
    
    /**
     * Unsets the "fPr" element
     */
    void unsetFPr();
    
    /**
     * Gets the "num" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getNum();
    
    /**
     * Sets the "num" element
     */
    void setNum(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg num);
    
    /**
     * Appends and returns a new empty "num" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewNum();
    
    /**
     * Gets the "den" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getDen();
    
    /**
     * Sets the "den" element
     */
    void setDen(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg den);
    
    /**
     * Appends and returns a new empty "den" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewDen();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
