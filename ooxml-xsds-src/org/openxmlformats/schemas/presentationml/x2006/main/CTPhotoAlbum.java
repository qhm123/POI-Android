/*
 * XML Type:  CT_PhotoAlbum
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_PhotoAlbum(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPhotoAlbum extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPhotoAlbum.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctphotoalbum4368type");
    
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
     * Gets the "bw" attribute
     */
    boolean getBw();
    
    /**
     * Gets (as xml) the "bw" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBw();
    
    /**
     * True if has "bw" attribute
     */
    boolean isSetBw();
    
    /**
     * Sets the "bw" attribute
     */
    void setBw(boolean bw);
    
    /**
     * Sets (as xml) the "bw" attribute
     */
    void xsetBw(org.apache.xmlbeans.XmlBoolean bw);
    
    /**
     * Unsets the "bw" attribute
     */
    void unsetBw();
    
    /**
     * Gets the "showCaptions" attribute
     */
    boolean getShowCaptions();
    
    /**
     * Gets (as xml) the "showCaptions" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowCaptions();
    
    /**
     * True if has "showCaptions" attribute
     */
    boolean isSetShowCaptions();
    
    /**
     * Sets the "showCaptions" attribute
     */
    void setShowCaptions(boolean showCaptions);
    
    /**
     * Sets (as xml) the "showCaptions" attribute
     */
    void xsetShowCaptions(org.apache.xmlbeans.XmlBoolean showCaptions);
    
    /**
     * Unsets the "showCaptions" attribute
     */
    void unsetShowCaptions();
    
    /**
     * Gets the "layout" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.Enum getLayout();
    
    /**
     * Gets (as xml) the "layout" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout xgetLayout();
    
    /**
     * True if has "layout" attribute
     */
    boolean isSetLayout();
    
    /**
     * Sets the "layout" attribute
     */
    void setLayout(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout.Enum layout);
    
    /**
     * Sets (as xml) the "layout" attribute
     */
    void xsetLayout(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumLayout layout);
    
    /**
     * Unsets the "layout" attribute
     */
    void unsetLayout();
    
    /**
     * Gets the "frame" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.Enum getFrame();
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape xgetFrame();
    
    /**
     * True if has "frame" attribute
     */
    boolean isSetFrame();
    
    /**
     * Sets the "frame" attribute
     */
    void setFrame(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape.Enum frame);
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    void xsetFrame(org.openxmlformats.schemas.presentationml.x2006.main.STPhotoAlbumFrameShape frame);
    
    /**
     * Unsets the "frame" attribute
     */
    void unsetFrame();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
