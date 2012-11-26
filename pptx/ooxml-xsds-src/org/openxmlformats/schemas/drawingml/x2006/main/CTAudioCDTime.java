/*
 * XML Type:  CT_AudioCDTime
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCDTime
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_AudioCDTime(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTAudioCDTime extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTAudioCDTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctaudiocdtime68d5type");
    
    /**
     * Gets the "track" attribute
     */
    short getTrack();
    
    /**
     * Gets (as xml) the "track" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetTrack();
    
    /**
     * Sets the "track" attribute
     */
    void setTrack(short track);
    
    /**
     * Sets (as xml) the "track" attribute
     */
    void xsetTrack(org.apache.xmlbeans.XmlUnsignedByte track);
    
    /**
     * Gets the "time" attribute
     */
    long getTime();
    
    /**
     * Gets (as xml) the "time" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTime();
    
    /**
     * True if has "time" attribute
     */
    boolean isSetTime();
    
    /**
     * Sets the "time" attribute
     */
    void setTime(long time);
    
    /**
     * Sets (as xml) the "time" attribute
     */
    void xsetTime(org.apache.xmlbeans.XmlUnsignedInt time);
    
    /**
     * Unsets the "time" attribute
     */
    void unsetTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
