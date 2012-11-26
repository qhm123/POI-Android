/*
 * XML Type:  CT_TransitionSoundAction
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionSoundAction
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_TransitionSoundAction(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTransitionSoundAction extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTransitionSoundAction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttransitionsoundactionc47ftype");
    
    /**
     * Gets the "stSnd" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction getStSnd();
    
    /**
     * True if has "stSnd" element
     */
    boolean isSetStSnd();
    
    /**
     * Sets the "stSnd" element
     */
    void setStSnd(org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction stSnd);
    
    /**
     * Appends and returns a new empty "stSnd" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTTransitionStartSoundAction addNewStSnd();
    
    /**
     * Unsets the "stSnd" element
     */
    void unsetStSnd();
    
    /**
     * Gets the "endSnd" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getEndSnd();
    
    /**
     * True if has "endSnd" element
     */
    boolean isSetEndSnd();
    
    /**
     * Sets the "endSnd" element
     */
    void setEndSnd(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty endSnd);
    
    /**
     * Appends and returns a new empty "endSnd" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewEndSnd();
    
    /**
     * Unsets the "endSnd" element
     */
    void unsetEndSnd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
