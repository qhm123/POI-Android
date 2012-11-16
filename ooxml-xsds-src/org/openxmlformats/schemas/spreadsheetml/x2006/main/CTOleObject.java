/*
 * XML Type:  CT_OleObject
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_OleObject(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTOleObject extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTOleObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctoleobjectd866type");
    
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
     * Gets the "dvAspect" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect.Enum getDvAspect();
    
    /**
     * Gets (as xml) the "dvAspect" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect xgetDvAspect();
    
    /**
     * True if has "dvAspect" attribute
     */
    boolean isSetDvAspect();
    
    /**
     * Sets the "dvAspect" attribute
     */
    void setDvAspect(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect.Enum dvAspect);
    
    /**
     * Sets (as xml) the "dvAspect" attribute
     */
    void xsetDvAspect(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect dvAspect);
    
    /**
     * Unsets the "dvAspect" attribute
     */
    void unsetDvAspect();
    
    /**
     * Gets the "link" attribute
     */
    java.lang.String getLink();
    
    /**
     * Gets (as xml) the "link" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetLink();
    
    /**
     * True if has "link" attribute
     */
    boolean isSetLink();
    
    /**
     * Sets the "link" attribute
     */
    void setLink(java.lang.String link);
    
    /**
     * Sets (as xml) the "link" attribute
     */
    void xsetLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring link);
    
    /**
     * Unsets the "link" attribute
     */
    void unsetLink();
    
    /**
     * Gets the "oleUpdate" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate.Enum getOleUpdate();
    
    /**
     * Gets (as xml) the "oleUpdate" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate xgetOleUpdate();
    
    /**
     * True if has "oleUpdate" attribute
     */
    boolean isSetOleUpdate();
    
    /**
     * Sets the "oleUpdate" attribute
     */
    void setOleUpdate(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate.Enum oleUpdate);
    
    /**
     * Sets (as xml) the "oleUpdate" attribute
     */
    void xsetOleUpdate(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate oleUpdate);
    
    /**
     * Unsets the "oleUpdate" attribute
     */
    void unsetOleUpdate();
    
    /**
     * Gets the "autoLoad" attribute
     */
    boolean getAutoLoad();
    
    /**
     * Gets (as xml) the "autoLoad" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAutoLoad();
    
    /**
     * True if has "autoLoad" attribute
     */
    boolean isSetAutoLoad();
    
    /**
     * Sets the "autoLoad" attribute
     */
    void setAutoLoad(boolean autoLoad);
    
    /**
     * Sets (as xml) the "autoLoad" attribute
     */
    void xsetAutoLoad(org.apache.xmlbeans.XmlBoolean autoLoad);
    
    /**
     * Unsets the "autoLoad" attribute
     */
    void unsetAutoLoad();
    
    /**
     * Gets the "shapeId" attribute
     */
    long getShapeId();
    
    /**
     * Gets (as xml) the "shapeId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetShapeId();
    
    /**
     * Sets the "shapeId" attribute
     */
    void setShapeId(long shapeId);
    
    /**
     * Sets (as xml) the "shapeId" attribute
     */
    void xsetShapeId(org.apache.xmlbeans.XmlUnsignedInt shapeId);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
