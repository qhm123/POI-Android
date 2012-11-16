/*
 * XML Type:  CT_CacheSource
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CacheSource(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCacheSource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCacheSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcachesource00dctype");
    
    /**
     * Gets the "worksheetSource" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource getWorksheetSource();
    
    /**
     * True if has "worksheetSource" element
     */
    boolean isSetWorksheetSource();
    
    /**
     * Sets the "worksheetSource" element
     */
    void setWorksheetSource(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource worksheetSource);
    
    /**
     * Appends and returns a new empty "worksheetSource" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource addNewWorksheetSource();
    
    /**
     * Unsets the "worksheetSource" element
     */
    void unsetWorksheetSource();
    
    /**
     * Gets the "consolidation" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation getConsolidation();
    
    /**
     * True if has "consolidation" element
     */
    boolean isSetConsolidation();
    
    /**
     * Sets the "consolidation" element
     */
    void setConsolidation(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation consolidation);
    
    /**
     * Appends and returns a new empty "consolidation" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation addNewConsolidation();
    
    /**
     * Unsets the "consolidation" element
     */
    void unsetConsolidation();
    
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
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType type);
    
    /**
     * Gets the "connectionId" attribute
     */
    long getConnectionId();
    
    /**
     * Gets (as xml) the "connectionId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetConnectionId();
    
    /**
     * True if has "connectionId" attribute
     */
    boolean isSetConnectionId();
    
    /**
     * Sets the "connectionId" attribute
     */
    void setConnectionId(long connectionId);
    
    /**
     * Sets (as xml) the "connectionId" attribute
     */
    void xsetConnectionId(org.apache.xmlbeans.XmlUnsignedInt connectionId);
    
    /**
     * Unsets the "connectionId" attribute
     */
    void unsetConnectionId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
