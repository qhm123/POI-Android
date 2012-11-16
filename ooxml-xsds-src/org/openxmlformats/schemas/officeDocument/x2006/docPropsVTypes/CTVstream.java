/*
 * XML Type:  CT_Vstream
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;


/**
 * An XML CT_Vstream(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream.
 */
public interface CTVstream extends org.apache.xmlbeans.XmlBase64Binary
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTVstream.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctvstream1579type");
    
    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetVersion();
    
    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid version);
    
    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
