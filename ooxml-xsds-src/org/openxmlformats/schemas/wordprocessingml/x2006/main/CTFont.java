/*
 * XML Type:  CT_Font
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Font(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFont extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFont.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfonteb79type");
    
    /**
     * Gets the "altName" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAltName();
    
    /**
     * True if has "altName" element
     */
    boolean isSetAltName();
    
    /**
     * Sets the "altName" element
     */
    void setAltName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString altName);
    
    /**
     * Appends and returns a new empty "altName" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAltName();
    
    /**
     * Unsets the "altName" element
     */
    void unsetAltName();
    
    /**
     * Gets the "panose1" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose getPanose1();
    
    /**
     * True if has "panose1" element
     */
    boolean isSetPanose1();
    
    /**
     * Sets the "panose1" element
     */
    void setPanose1(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose panose1);
    
    /**
     * Appends and returns a new empty "panose1" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose addNewPanose1();
    
    /**
     * Unsets the "panose1" element
     */
    void unsetPanose1();
    
    /**
     * Gets the "charset" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber getCharset();
    
    /**
     * True if has "charset" element
     */
    boolean isSetCharset();
    
    /**
     * Sets the "charset" element
     */
    void setCharset(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber charset);
    
    /**
     * Appends and returns a new empty "charset" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber addNewCharset();
    
    /**
     * Unsets the "charset" element
     */
    void unsetCharset();
    
    /**
     * Gets the "family" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily getFamily();
    
    /**
     * True if has "family" element
     */
    boolean isSetFamily();
    
    /**
     * Sets the "family" element
     */
    void setFamily(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily family);
    
    /**
     * Appends and returns a new empty "family" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily addNewFamily();
    
    /**
     * Unsets the "family" element
     */
    void unsetFamily();
    
    /**
     * Gets the "notTrueType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNotTrueType();
    
    /**
     * True if has "notTrueType" element
     */
    boolean isSetNotTrueType();
    
    /**
     * Sets the "notTrueType" element
     */
    void setNotTrueType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff notTrueType);
    
    /**
     * Appends and returns a new empty "notTrueType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNotTrueType();
    
    /**
     * Unsets the "notTrueType" element
     */
    void unsetNotTrueType();
    
    /**
     * Gets the "pitch" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch getPitch();
    
    /**
     * True if has "pitch" element
     */
    boolean isSetPitch();
    
    /**
     * Sets the "pitch" element
     */
    void setPitch(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch pitch);
    
    /**
     * Appends and returns a new empty "pitch" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch addNewPitch();
    
    /**
     * Unsets the "pitch" element
     */
    void unsetPitch();
    
    /**
     * Gets the "sig" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig getSig();
    
    /**
     * True if has "sig" element
     */
    boolean isSetSig();
    
    /**
     * Sets the "sig" element
     */
    void setSig(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig sig);
    
    /**
     * Appends and returns a new empty "sig" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig addNewSig();
    
    /**
     * Unsets the "sig" element
     */
    void unsetSig();
    
    /**
     * Gets the "embedRegular" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedRegular();
    
    /**
     * True if has "embedRegular" element
     */
    boolean isSetEmbedRegular();
    
    /**
     * Sets the "embedRegular" element
     */
    void setEmbedRegular(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedRegular);
    
    /**
     * Appends and returns a new empty "embedRegular" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedRegular();
    
    /**
     * Unsets the "embedRegular" element
     */
    void unsetEmbedRegular();
    
    /**
     * Gets the "embedBold" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedBold();
    
    /**
     * True if has "embedBold" element
     */
    boolean isSetEmbedBold();
    
    /**
     * Sets the "embedBold" element
     */
    void setEmbedBold(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedBold);
    
    /**
     * Appends and returns a new empty "embedBold" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedBold();
    
    /**
     * Unsets the "embedBold" element
     */
    void unsetEmbedBold();
    
    /**
     * Gets the "embedItalic" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedItalic();
    
    /**
     * True if has "embedItalic" element
     */
    boolean isSetEmbedItalic();
    
    /**
     * Sets the "embedItalic" element
     */
    void setEmbedItalic(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedItalic);
    
    /**
     * Appends and returns a new empty "embedItalic" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedItalic();
    
    /**
     * Unsets the "embedItalic" element
     */
    void unsetEmbedItalic();
    
    /**
     * Gets the "embedBoldItalic" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedBoldItalic();
    
    /**
     * True if has "embedBoldItalic" element
     */
    boolean isSetEmbedBoldItalic();
    
    /**
     * Sets the "embedBoldItalic" element
     */
    void setEmbedBoldItalic(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedBoldItalic);
    
    /**
     * Appends and returns a new empty "embedBoldItalic" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedBoldItalic();
    
    /**
     * Unsets the "embedBoldItalic" element
     */
    void unsetEmbedBoldItalic();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
