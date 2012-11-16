/*
 * XML Type:  CT_VectorVariant
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/extended-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;


/**
 * An XML CT_VectorVariant(@http://schemas.openxmlformats.org/officeDocument/2006/extended-properties).
 *
 * This is a complex type.
 */
public interface CTVectorVariant extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTVectorVariant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctvectorvariant9d75type");
    
    /**
     * Gets the "vector" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector getVector();
    
    /**
     * Sets the "vector" element
     */
    void setVector(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector vector);
    
    /**
     * Appends and returns a new empty "vector" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector addNewVector();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
