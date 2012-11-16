/*
 * XML Type:  CT_XmlPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_XmlPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTXmlPr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTXmlPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctxmlpr2c58type");
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "mapId" attribute
     */
    long getMapId();
    
    /**
     * Gets (as xml) the "mapId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMapId();
    
    /**
     * Sets the "mapId" attribute
     */
    void setMapId(long mapId);
    
    /**
     * Sets (as xml) the "mapId" attribute
     */
    void xsetMapId(org.apache.xmlbeans.XmlUnsignedInt mapId);
    
    /**
     * Gets the "xpath" attribute
     */
    java.lang.String getXpath();
    
    /**
     * Gets (as xml) the "xpath" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetXpath();
    
    /**
     * Sets the "xpath" attribute
     */
    void setXpath(java.lang.String xpath);
    
    /**
     * Sets (as xml) the "xpath" attribute
     */
    void xsetXpath(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xpath);
    
    /**
     * Gets the "xmlDataType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType.Enum getXmlDataType();
    
    /**
     * Gets (as xml) the "xmlDataType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType xgetXmlDataType();
    
    /**
     * Sets the "xmlDataType" attribute
     */
    void setXmlDataType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType.Enum xmlDataType);
    
    /**
     * Sets (as xml) the "xmlDataType" attribute
     */
    void xsetXmlDataType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType xmlDataType);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
