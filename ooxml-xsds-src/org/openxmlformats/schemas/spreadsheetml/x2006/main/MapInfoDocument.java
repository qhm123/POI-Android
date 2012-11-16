/*
 * An XML document type.
 * Localname: MapInfo
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * A document containing one MapInfo(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface MapInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("mapinfo5715doctype");
    
    /**
     * Gets the "MapInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo getMapInfo();
    
    /**
     * Sets the "MapInfo" element
     */
    void setMapInfo(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo mapInfo);
    
    /**
     * Appends and returns a new empty "MapInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo addNewMapInfo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
