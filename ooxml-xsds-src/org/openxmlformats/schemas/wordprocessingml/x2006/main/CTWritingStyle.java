/*
 * XML Type:  CT_WritingStyle
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_WritingStyle(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTWritingStyle extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTWritingStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctwritingstyled853type");
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.Object getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang xgetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.Object lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang lang);
    
    /**
     * Gets the "vendorID" attribute
     */
    java.math.BigInteger getVendorID();
    
    /**
     * Gets (as xml) the "vendorID" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetVendorID();
    
    /**
     * Sets the "vendorID" attribute
     */
    void setVendorID(java.math.BigInteger vendorID);
    
    /**
     * Sets (as xml) the "vendorID" attribute
     */
    void xsetVendorID(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber vendorID);
    
    /**
     * Gets the "dllVersion" attribute
     */
    java.math.BigInteger getDllVersion();
    
    /**
     * Gets (as xml) the "dllVersion" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetDllVersion();
    
    /**
     * Sets the "dllVersion" attribute
     */
    void setDllVersion(java.math.BigInteger dllVersion);
    
    /**
     * Sets (as xml) the "dllVersion" attribute
     */
    void xsetDllVersion(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber dllVersion);
    
    /**
     * Gets the "nlCheck" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getNlCheck();
    
    /**
     * Gets (as xml) the "nlCheck" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetNlCheck();
    
    /**
     * True if has "nlCheck" attribute
     */
    boolean isSetNlCheck();
    
    /**
     * Sets the "nlCheck" attribute
     */
    void setNlCheck(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum nlCheck);
    
    /**
     * Sets (as xml) the "nlCheck" attribute
     */
    void xsetNlCheck(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff nlCheck);
    
    /**
     * Unsets the "nlCheck" attribute
     */
    void unsetNlCheck();
    
    /**
     * Gets the "checkStyle" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getCheckStyle();
    
    /**
     * Gets (as xml) the "checkStyle" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetCheckStyle();
    
    /**
     * Sets the "checkStyle" attribute
     */
    void setCheckStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum checkStyle);
    
    /**
     * Sets (as xml) the "checkStyle" attribute
     */
    void xsetCheckStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff checkStyle);
    
    /**
     * Gets the "appName" attribute
     */
    java.lang.String getAppName();
    
    /**
     * Gets (as xml) the "appName" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAppName();
    
    /**
     * Sets the "appName" attribute
     */
    void setAppName(java.lang.String appName);
    
    /**
     * Sets (as xml) the "appName" attribute
     */
    void xsetAppName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString appName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
