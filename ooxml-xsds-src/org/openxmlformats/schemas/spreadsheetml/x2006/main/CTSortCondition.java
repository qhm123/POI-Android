/*
 * XML Type:  CT_SortCondition
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortCondition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_SortCondition(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSortCondition extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSortCondition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsortconditionc4fctype");
    
    /**
     * Gets the "descending" attribute
     */
    boolean getDescending();
    
    /**
     * Gets (as xml) the "descending" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDescending();
    
    /**
     * True if has "descending" attribute
     */
    boolean isSetDescending();
    
    /**
     * Sets the "descending" attribute
     */
    void setDescending(boolean descending);
    
    /**
     * Sets (as xml) the "descending" attribute
     */
    void xsetDescending(org.apache.xmlbeans.XmlBoolean descending);
    
    /**
     * Unsets the "descending" attribute
     */
    void unsetDescending();
    
    /**
     * Gets the "sortBy" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy.Enum getSortBy();
    
    /**
     * Gets (as xml) the "sortBy" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy xgetSortBy();
    
    /**
     * True if has "sortBy" attribute
     */
    boolean isSetSortBy();
    
    /**
     * Sets the "sortBy" attribute
     */
    void setSortBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy.Enum sortBy);
    
    /**
     * Sets (as xml) the "sortBy" attribute
     */
    void xsetSortBy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy sortBy);
    
    /**
     * Unsets the "sortBy" attribute
     */
    void unsetSortBy();
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * Gets the "customList" attribute
     */
    java.lang.String getCustomList();
    
    /**
     * Gets (as xml) the "customList" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCustomList();
    
    /**
     * True if has "customList" attribute
     */
    boolean isSetCustomList();
    
    /**
     * Sets the "customList" attribute
     */
    void setCustomList(java.lang.String customList);
    
    /**
     * Sets (as xml) the "customList" attribute
     */
    void xsetCustomList(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring customList);
    
    /**
     * Unsets the "customList" attribute
     */
    void unsetCustomList();
    
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
     * Gets the "iconSet" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum getIconSet();
    
    /**
     * Gets (as xml) the "iconSet" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType xgetIconSet();
    
    /**
     * True if has "iconSet" attribute
     */
    boolean isSetIconSet();
    
    /**
     * Sets the "iconSet" attribute
     */
    void setIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType.Enum iconSet);
    
    /**
     * Sets (as xml) the "iconSet" attribute
     */
    void xsetIconSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType iconSet);
    
    /**
     * Unsets the "iconSet" attribute
     */
    void unsetIconSet();
    
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
