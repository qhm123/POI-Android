/*
 * XML Type:  CT_OleObjectEmbed
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_OleObjectEmbed(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOleObjectEmbed extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOleObjectEmbed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoleobjectembedcc93type");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "followColorScheme" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme.Enum getFollowColorScheme();
    
    /**
     * Gets (as xml) the "followColorScheme" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme xgetFollowColorScheme();
    
    /**
     * True if has "followColorScheme" attribute
     */
    boolean isSetFollowColorScheme();
    
    /**
     * Sets the "followColorScheme" attribute
     */
    void setFollowColorScheme(org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme.Enum followColorScheme);
    
    /**
     * Sets (as xml) the "followColorScheme" attribute
     */
    void xsetFollowColorScheme(org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme followColorScheme);
    
    /**
     * Unsets the "followColorScheme" attribute
     */
    void unsetFollowColorScheme();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
