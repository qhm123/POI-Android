/*
 * XML Type:  CT_TextFont
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_TextFont(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTextFont extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTextFont.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttextfont92b7type");
    
    /**
     * Gets the "typeface" attribute
     */
    java.lang.String getTypeface();
    
    /**
     * Gets (as xml) the "typeface" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface xgetTypeface();
    
    /**
     * True if has "typeface" attribute
     */
    boolean isSetTypeface();
    
    /**
     * Sets the "typeface" attribute
     */
    void setTypeface(java.lang.String typeface);
    
    /**
     * Sets (as xml) the "typeface" attribute
     */
    void xsetTypeface(org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface typeface);
    
    /**
     * Unsets the "typeface" attribute
     */
    void unsetTypeface();
    
    /**
     * Gets the "panose" attribute
     */
    byte[] getPanose();
    
    /**
     * Gets (as xml) the "panose" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPanose xgetPanose();
    
    /**
     * True if has "panose" attribute
     */
    boolean isSetPanose();
    
    /**
     * Sets the "panose" attribute
     */
    void setPanose(byte[] panose);
    
    /**
     * Sets (as xml) the "panose" attribute
     */
    void xsetPanose(org.openxmlformats.schemas.drawingml.x2006.main.STPanose panose);
    
    /**
     * Unsets the "panose" attribute
     */
    void unsetPanose();
    
    /**
     * Gets the "pitchFamily" attribute
     */
    byte getPitchFamily();
    
    /**
     * Gets (as xml) the "pitchFamily" attribute
     */
    org.apache.xmlbeans.XmlByte xgetPitchFamily();
    
    /**
     * True if has "pitchFamily" attribute
     */
    boolean isSetPitchFamily();
    
    /**
     * Sets the "pitchFamily" attribute
     */
    void setPitchFamily(byte pitchFamily);
    
    /**
     * Sets (as xml) the "pitchFamily" attribute
     */
    void xsetPitchFamily(org.apache.xmlbeans.XmlByte pitchFamily);
    
    /**
     * Unsets the "pitchFamily" attribute
     */
    void unsetPitchFamily();
    
    /**
     * Gets the "charset" attribute
     */
    byte getCharset();
    
    /**
     * Gets (as xml) the "charset" attribute
     */
    org.apache.xmlbeans.XmlByte xgetCharset();
    
    /**
     * True if has "charset" attribute
     */
    boolean isSetCharset();
    
    /**
     * Sets the "charset" attribute
     */
    void setCharset(byte charset);
    
    /**
     * Sets (as xml) the "charset" attribute
     */
    void xsetCharset(org.apache.xmlbeans.XmlByte charset);
    
    /**
     * Unsets the "charset" attribute
     */
    void unsetCharset();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
