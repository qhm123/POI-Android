/*
 * An XML document type.
 * Localname: uint
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.UintDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one uint(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface UintDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UintDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("uint5017doctype");
    
    /**
     * Gets the "uint" element
     */
    long getUint();
    
    /**
     * Gets (as xml) the "uint" element
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetUint();
    
    /**
     * Sets the "uint" element
     */
    void setUint(long uint);
    
    /**
     * Sets (as xml) the "uint" element
     */
    void xsetUint(org.apache.xmlbeans.XmlUnsignedInt uint);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
