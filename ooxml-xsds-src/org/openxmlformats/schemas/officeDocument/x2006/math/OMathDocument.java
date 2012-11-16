/*
 * An XML document type.
 * Localname: oMath
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.OMathDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * A document containing one oMath(@http://schemas.openxmlformats.org/officeDocument/2006/math) element.
 *
 * This is a complex type.
 */
public interface OMathDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OMathDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("omathd479doctype");
    
    /**
     * Gets the "oMath" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath getOMath();
    
    /**
     * Sets the "oMath" element
     */
    void setOMath(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath oMath);
    
    /**
     * Appends and returns a new empty "oMath" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath addNewOMath();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
