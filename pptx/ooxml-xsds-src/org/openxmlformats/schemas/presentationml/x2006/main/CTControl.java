/*
 * XML Type:  CT_Control
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTControl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_Control(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTControl extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTControl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcontrolbf52type");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
