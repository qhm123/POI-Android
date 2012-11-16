/*
 * An XML document type.
 * Localname: date
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.DateDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one date(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface DateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("datedc43doctype");
    
    /**
     * Gets the "date" element
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDate();
    
    /**
     * Sets the "date" element
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlDateTime date);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
