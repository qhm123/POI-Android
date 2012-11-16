/*
 * An XML document type.
 * Localname: MapInfo
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one MapInfo(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class MapInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.MapInfoDocument
{
    
    public MapInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "MapInfo");
    
    
    /**
     * Gets the "MapInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo getMapInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo)get_store().find_element_user(MAPINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MapInfo" element
     */
    public void setMapInfo(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo mapInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo)get_store().find_element_user(MAPINFO$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo)get_store().add_element_user(MAPINFO$0);
            }
            target.set(mapInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "MapInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo addNewMapInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo)get_store().add_element_user(MAPINFO$0);
            return target;
        }
    }
}
