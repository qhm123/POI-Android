/*
 * An XML document type.
 * Localname: bool
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.BoolDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one bool(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface BoolDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BoolDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("bool1687doctype");
    
    /**
     * Gets the "bool" element
     */
    boolean getBool();
    
    /**
     * Gets (as xml) the "bool" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBool();
    
    /**
     * Sets the "bool" element
     */
    void setBool(boolean bool);
    
    /**
     * Sets (as xml) the "bool" element
     */
    void xsetBool(org.apache.xmlbeans.XmlBoolean bool);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
