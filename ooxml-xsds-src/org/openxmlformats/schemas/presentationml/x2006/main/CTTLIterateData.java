/*
 * XML Type:  CT_TLIterateData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLIterateData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLIterateData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLIterateData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttliteratedatac1c3type");
    
    /**
     * Gets the "tmAbs" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime getTmAbs();
    
    /**
     * True if has "tmAbs" element
     */
    boolean isSetTmAbs();
    
    /**
     * Sets the "tmAbs" element
     */
    void setTmAbs(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime tmAbs);
    
    /**
     * Appends and returns a new empty "tmAbs" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalTime addNewTmAbs();
    
    /**
     * Unsets the "tmAbs" element
     */
    void unsetTmAbs();
    
    /**
     * Gets the "tmPct" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage getTmPct();
    
    /**
     * True if has "tmPct" element
     */
    boolean isSetTmPct();
    
    /**
     * Sets the "tmPct" element
     */
    void setTmPct(org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage tmPct);
    
    /**
     * Appends and returns a new empty "tmPct" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLIterateIntervalPercentage addNewTmPct();
    
    /**
     * Unsets the "tmPct" element
     */
    void unsetTmPct();
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STIterateType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STIterateType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.presentationml.x2006.main.STIterateType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.presentationml.x2006.main.STIterateType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "backwards" attribute
     */
    boolean getBackwards();
    
    /**
     * Gets (as xml) the "backwards" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBackwards();
    
    /**
     * True if has "backwards" attribute
     */
    boolean isSetBackwards();
    
    /**
     * Sets the "backwards" attribute
     */
    void setBackwards(boolean backwards);
    
    /**
     * Sets (as xml) the "backwards" attribute
     */
    void xsetBackwards(org.apache.xmlbeans.XmlBoolean backwards);
    
    /**
     * Unsets the "backwards" attribute
     */
    void unsetBackwards();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
