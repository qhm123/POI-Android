/*
 * XML Type:  CT_TLCommonMediaNodeData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TLCommonMediaNodeData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTLCommonMediaNodeData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTLCommonMediaNodeData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttlcommonmedianodedatab6c2type");
    
    /**
     * Gets the "cTn" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData getCTn();
    
    /**
     * Sets the "cTn" element
     */
    void setCTn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData cTn);
    
    /**
     * Appends and returns a new empty "cTn" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData addNewCTn();
    
    /**
     * Gets the "tgtEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement getTgtEl();
    
    /**
     * Sets the "tgtEl" element
     */
    void setTgtEl(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement tgtEl);
    
    /**
     * Appends and returns a new empty "tgtEl" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeTargetElement addNewTgtEl();
    
    /**
     * Gets the "vol" attribute
     */
    int getVol();
    
    /**
     * Gets (as xml) the "vol" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage xgetVol();
    
    /**
     * True if has "vol" attribute
     */
    boolean isSetVol();
    
    /**
     * Sets the "vol" attribute
     */
    void setVol(int vol);
    
    /**
     * Sets (as xml) the "vol" attribute
     */
    void xsetVol(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage vol);
    
    /**
     * Unsets the "vol" attribute
     */
    void unsetVol();
    
    /**
     * Gets the "mute" attribute
     */
    boolean getMute();
    
    /**
     * Gets (as xml) the "mute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMute();
    
    /**
     * True if has "mute" attribute
     */
    boolean isSetMute();
    
    /**
     * Sets the "mute" attribute
     */
    void setMute(boolean mute);
    
    /**
     * Sets (as xml) the "mute" attribute
     */
    void xsetMute(org.apache.xmlbeans.XmlBoolean mute);
    
    /**
     * Unsets the "mute" attribute
     */
    void unsetMute();
    
    /**
     * Gets the "numSld" attribute
     */
    long getNumSld();
    
    /**
     * Gets (as xml) the "numSld" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetNumSld();
    
    /**
     * True if has "numSld" attribute
     */
    boolean isSetNumSld();
    
    /**
     * Sets the "numSld" attribute
     */
    void setNumSld(long numSld);
    
    /**
     * Sets (as xml) the "numSld" attribute
     */
    void xsetNumSld(org.apache.xmlbeans.XmlUnsignedInt numSld);
    
    /**
     * Unsets the "numSld" attribute
     */
    void unsetNumSld();
    
    /**
     * Gets the "showWhenStopped" attribute
     */
    boolean getShowWhenStopped();
    
    /**
     * Gets (as xml) the "showWhenStopped" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowWhenStopped();
    
    /**
     * True if has "showWhenStopped" attribute
     */
    boolean isSetShowWhenStopped();
    
    /**
     * Sets the "showWhenStopped" attribute
     */
    void setShowWhenStopped(boolean showWhenStopped);
    
    /**
     * Sets (as xml) the "showWhenStopped" attribute
     */
    void xsetShowWhenStopped(org.apache.xmlbeans.XmlBoolean showWhenStopped);
    
    /**
     * Unsets the "showWhenStopped" attribute
     */
    void unsetShowWhenStopped();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
