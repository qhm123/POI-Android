/*
 * XML Type:  CT_PageNumber
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_PageNumber(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPageNumber extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPageNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpagenumber7570type");
    
    /**
     * Gets the "fmt" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum getFmt();
    
    /**
     * Gets (as xml) the "fmt" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat xgetFmt();
    
    /**
     * True if has "fmt" attribute
     */
    boolean isSetFmt();
    
    /**
     * Sets the "fmt" attribute
     */
    void setFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum fmt);
    
    /**
     * Sets (as xml) the "fmt" attribute
     */
    void xsetFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat fmt);
    
    /**
     * Unsets the "fmt" attribute
     */
    void unsetFmt();
    
    /**
     * Gets the "start" attribute
     */
    java.math.BigInteger getStart();
    
    /**
     * Gets (as xml) the "start" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetStart();
    
    /**
     * True if has "start" attribute
     */
    boolean isSetStart();
    
    /**
     * Sets the "start" attribute
     */
    void setStart(java.math.BigInteger start);
    
    /**
     * Sets (as xml) the "start" attribute
     */
    void xsetStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber start);
    
    /**
     * Unsets the "start" attribute
     */
    void unsetStart();
    
    /**
     * Gets the "chapStyle" attribute
     */
    java.math.BigInteger getChapStyle();
    
    /**
     * Gets (as xml) the "chapStyle" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetChapStyle();
    
    /**
     * True if has "chapStyle" attribute
     */
    boolean isSetChapStyle();
    
    /**
     * Sets the "chapStyle" attribute
     */
    void setChapStyle(java.math.BigInteger chapStyle);
    
    /**
     * Sets (as xml) the "chapStyle" attribute
     */
    void xsetChapStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber chapStyle);
    
    /**
     * Unsets the "chapStyle" attribute
     */
    void unsetChapStyle();
    
    /**
     * Gets the "chapSep" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum getChapSep();
    
    /**
     * Gets (as xml) the "chapSep" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep xgetChapSep();
    
    /**
     * True if has "chapSep" attribute
     */
    boolean isSetChapSep();
    
    /**
     * Sets the "chapSep" attribute
     */
    void setChapSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum chapSep);
    
    /**
     * Sets (as xml) the "chapSep" attribute
     */
    void xsetChapSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep chapSep);
    
    /**
     * Unsets the "chapSep" attribute
     */
    void unsetChapSep();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
