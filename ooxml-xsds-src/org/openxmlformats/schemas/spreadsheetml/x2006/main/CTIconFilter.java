/*
 * XML Type:  CT_IconFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_IconFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTIconFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTIconFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cticonfilterb79atype");
    
    /**
     * Gets the "iconSet" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet();
    
    /**
     * Gets (as xml) the "iconSet" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType xgetIconSet();
    
    /**
     * Sets the "iconSet" attribute
     */
    void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet);
    
    /**
     * Sets (as xml) the "iconSet" attribute
     */
    void xsetIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType iconSet);
    
    /**
     * Gets the "iconId" attribute
     */
    long getIconId();
    
    /**
     * Gets (as xml) the "iconId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIconId();
    
    /**
     * True if has "iconId" attribute
     */
    boolean isSetIconId();
    
    /**
     * Sets the "iconId" attribute
     */
    void setIconId(long iconId);
    
    /**
     * Sets (as xml) the "iconId" attribute
     */
    void xsetIconId(org.apache.xmlbeans.XmlUnsignedInt iconId);
    
    /**
     * Unsets the "iconId" attribute
     */
    void unsetIconId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
