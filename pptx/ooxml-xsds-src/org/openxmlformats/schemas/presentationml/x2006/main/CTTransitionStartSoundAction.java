/*
 * XML Type:  CT_TransitionStartSoundAction
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TransitionStartSoundAction(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTransitionStartSoundAction extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTransitionStartSoundAction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttransitionstartsoundaction3e0dtype");
    
    /**
     * Gets the "snd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile getSnd();
    
    /**
     * Sets the "snd" element
     */
    void setSnd(org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile snd);
    
    /**
     * Appends and returns a new empty "snd" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile addNewSnd();
    
    /**
     * Gets the "loop" attribute
     */
    boolean getLoop();
    
    /**
     * Gets (as xml) the "loop" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLoop();
    
    /**
     * True if has "loop" attribute
     */
    boolean isSetLoop();
    
    /**
     * Sets the "loop" attribute
     */
    void setLoop(boolean loop);
    
    /**
     * Sets (as xml) the "loop" attribute
     */
    void xsetLoop(org.apache.xmlbeans.XmlBoolean loop);
    
    /**
     * Unsets the "loop" attribute
     */
    void unsetLoop();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
