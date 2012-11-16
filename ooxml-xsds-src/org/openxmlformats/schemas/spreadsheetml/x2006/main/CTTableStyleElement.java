/*
 * XML Type:  CT_TableStyleElement
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_TableStyleElement(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTTableStyleElement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTableStyleElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cttablestyleelementa658type");
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableStyleType type);
    
    /**
     * Gets the "size" attribute
     */
    long getSize();
    
    /**
     * Gets (as xml) the "size" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSize();
    
    /**
     * True if has "size" attribute
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" attribute
     */
    void setSize(long size);
    
    /**
     * Sets (as xml) the "size" attribute
     */
    void xsetSize(org.apache.xmlbeans.XmlUnsignedInt size);
    
    /**
     * Unsets the "size" attribute
     */
    void unsetSize();
    
    /**
     * Gets the "dxfId" attribute
     */
    long getDxfId();
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId();
    
    /**
     * True if has "dxfId" attribute
     */
    boolean isSetDxfId();
    
    /**
     * Sets the "dxfId" attribute
     */
    void setDxfId(long dxfId);
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId);
    
    /**
     * Unsets the "dxfId" attribute
     */
    void unsetDxfId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
