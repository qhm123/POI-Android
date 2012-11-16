/*
 * XML Type:  CT_DigSigBlob
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/extended-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTDigSigBlob
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;


/**
 * An XML CT_DigSigBlob(@http://schemas.openxmlformats.org/officeDocument/2006/extended-properties).
 *
 * This is a complex type.
 */
public interface CTDigSigBlob extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDigSigBlob.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdigsigblob73c9type");
    
    /**
     * Gets the "blob" element
     */
    byte[] getBlob();
    
    /**
     * Gets (as xml) the "blob" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetBlob();
    
    /**
     * Sets the "blob" element
     */
    void setBlob(byte[] blob);
    
    /**
     * Sets (as xml) the "blob" element
     */
    void xsetBlob(org.apache.xmlbeans.XmlBase64Binary blob);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
