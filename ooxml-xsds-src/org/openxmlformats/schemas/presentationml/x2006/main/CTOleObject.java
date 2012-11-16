/*
 * XML Type:  CT_OleObject
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOleObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_OleObject(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOleObject extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOleObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoleobject5da8type");
    
    /**
     * Gets the "embed" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed getEmbed();
    
    /**
     * True if has "embed" element
     */
    boolean isSetEmbed();
    
    /**
     * Sets the "embed" element
     */
    void setEmbed(org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed embed);
    
    /**
     * Appends and returns a new empty "embed" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed addNewEmbed();
    
    /**
     * Unsets the "embed" element
     */
    void unsetEmbed();
    
    /**
     * Gets the "link" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink getLink();
    
    /**
     * True if has "link" element
     */
    boolean isSetLink();
    
    /**
     * Sets the "link" element
     */
    void setLink(org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink link);
    
    /**
     * Appends and returns a new empty "link" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectLink addNewLink();
    
    /**
     * Unsets the "link" element
     */
    void unsetLink();
    
    /**
     * Gets the "spid" attribute
     */
    java.lang.String getSpid();
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid();
    
    /**
     * Sets the "spid" attribute
     */
    void setSpid(java.lang.String spid);
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "showAsIcon" attribute
     */
    boolean getShowAsIcon();
    
    /**
     * Gets (as xml) the "showAsIcon" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowAsIcon();
    
    /**
     * True if has "showAsIcon" attribute
     */
    boolean isSetShowAsIcon();
    
    /**
     * Sets the "showAsIcon" attribute
     */
    void setShowAsIcon(boolean showAsIcon);
    
    /**
     * Sets (as xml) the "showAsIcon" attribute
     */
    void xsetShowAsIcon(org.apache.xmlbeans.XmlBoolean showAsIcon);
    
    /**
     * Unsets the "showAsIcon" attribute
     */
    void unsetShowAsIcon();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "imgW" attribute
     */
    int getImgW();
    
    /**
     * Gets (as xml) the "imgW" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 xgetImgW();
    
    /**
     * True if has "imgW" attribute
     */
    boolean isSetImgW();
    
    /**
     * Sets the "imgW" attribute
     */
    void setImgW(int imgW);
    
    /**
     * Sets (as xml) the "imgW" attribute
     */
    void xsetImgW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 imgW);
    
    /**
     * Unsets the "imgW" attribute
     */
    void unsetImgW();
    
    /**
     * Gets the "imgH" attribute
     */
    int getImgH();
    
    /**
     * Gets (as xml) the "imgH" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 xgetImgH();
    
    /**
     * True if has "imgH" attribute
     */
    boolean isSetImgH();
    
    /**
     * Sets the "imgH" attribute
     */
    void setImgH(int imgH);
    
    /**
     * Sets (as xml) the "imgH" attribute
     */
    void xsetImgH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 imgH);
    
    /**
     * Unsets the "imgH" attribute
     */
    void unsetImgH();
    
    /**
     * Gets the "progId" attribute
     */
    java.lang.String getProgId();
    
    /**
     * Gets (as xml) the "progId" attribute
     */
    org.apache.xmlbeans.XmlString xgetProgId();
    
    /**
     * True if has "progId" attribute
     */
    boolean isSetProgId();
    
    /**
     * Sets the "progId" attribute
     */
    void setProgId(java.lang.String progId);
    
    /**
     * Sets (as xml) the "progId" attribute
     */
    void xsetProgId(org.apache.xmlbeans.XmlString progId);
    
    /**
     * Unsets the "progId" attribute
     */
    void unsetProgId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
