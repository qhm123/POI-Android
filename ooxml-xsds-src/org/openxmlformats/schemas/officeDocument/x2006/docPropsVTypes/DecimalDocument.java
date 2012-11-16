/*
 * An XML document type.
 * Localname: decimal
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.DecimalDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * A document containing one decimal(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes) element.
 *
 * This is a complex type.
 */
public interface DecimalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DecimalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("decimal39d2doctype");
    
    /**
     * Gets the "decimal" element
     */
    java.math.BigDecimal getDecimal();
    
    /**
     * Gets (as xml) the "decimal" element
     */
    org.apache.xmlbeans.XmlDecimal xgetDecimal();
    
    /**
     * Sets the "decimal" element
     */
    void setDecimal(java.math.BigDecimal decimal);
    
    /**
     * Sets (as xml) the "decimal" element
     */
    void xsetDecimal(org.apache.xmlbeans.XmlDecimal decimal);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
