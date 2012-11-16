/*
 * XML Type:  CT_ProtectedRange
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ProtectedRange(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTProtectedRange extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTProtectedRange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctprotectedrange7078type");
    
    /**
     * Gets the "password" attribute
     */
    byte[] getPassword();
    
    /**
     * Gets (as xml) the "password" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetPassword();
    
    /**
     * True if has "password" attribute
     */
    boolean isSetPassword();
    
    /**
     * Sets the "password" attribute
     */
    void setPassword(byte[] password);
    
    /**
     * Sets (as xml) the "password" attribute
     */
    void xsetPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex password);
    
    /**
     * Unsets the "password" attribute
     */
    void unsetPassword();
    
    /**
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref();
    
    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Gets the "securityDescriptor" attribute
     */
    java.lang.String getSecurityDescriptor();
    
    /**
     * Gets (as xml) the "securityDescriptor" attribute
     */
    org.apache.xmlbeans.XmlString xgetSecurityDescriptor();
    
    /**
     * True if has "securityDescriptor" attribute
     */
    boolean isSetSecurityDescriptor();
    
    /**
     * Sets the "securityDescriptor" attribute
     */
    void setSecurityDescriptor(java.lang.String securityDescriptor);
    
    /**
     * Sets (as xml) the "securityDescriptor" attribute
     */
    void xsetSecurityDescriptor(org.apache.xmlbeans.XmlString securityDescriptor);
    
    /**
     * Unsets the "securityDescriptor" attribute
     */
    void unsetSecurityDescriptor();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
