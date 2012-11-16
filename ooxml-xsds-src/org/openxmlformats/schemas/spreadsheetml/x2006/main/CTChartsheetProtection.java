/*
 * XML Type:  CT_ChartsheetProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_ChartsheetProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTChartsheetProtection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTChartsheetProtection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctchartsheetprotection3cc3type");
    
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
     * Gets the "content" attribute
     */
    boolean getContent();
    
    /**
     * Gets (as xml) the "content" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetContent();
    
    /**
     * True if has "content" attribute
     */
    boolean isSetContent();
    
    /**
     * Sets the "content" attribute
     */
    void setContent(boolean content);
    
    /**
     * Sets (as xml) the "content" attribute
     */
    void xsetContent(org.apache.xmlbeans.XmlBoolean content);
    
    /**
     * Unsets the "content" attribute
     */
    void unsetContent();
    
    /**
     * Gets the "objects" attribute
     */
    boolean getObjects();
    
    /**
     * Gets (as xml) the "objects" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetObjects();
    
    /**
     * True if has "objects" attribute
     */
    boolean isSetObjects();
    
    /**
     * Sets the "objects" attribute
     */
    void setObjects(boolean objects);
    
    /**
     * Sets (as xml) the "objects" attribute
     */
    void xsetObjects(org.apache.xmlbeans.XmlBoolean objects);
    
    /**
     * Unsets the "objects" attribute
     */
    void unsetObjects();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
