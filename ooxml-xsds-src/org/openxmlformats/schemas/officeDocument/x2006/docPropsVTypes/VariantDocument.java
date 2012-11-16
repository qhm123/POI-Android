/*
 * An XML document type.
 * Localname: variant
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.VariantDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one variant(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface VariantDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariantDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("variantfd1edoctype");
    
    /**
     * Gets the "variant" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant getVariant();
    
    /**
     * Sets the "variant" element
     */
    void setVariant(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant variant);
    
    /**
     * Appends and returns a new empty "variant" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant addNewVariant();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
