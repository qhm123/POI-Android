/*
 * XML Type:  CT_RevisionHeader
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionHeader(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisionheader6b51type");
    
    /**
     * Gets the "sheetIdMap" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap getSheetIdMap();
    
    /**
     * Sets the "sheetIdMap" element
     */
    void setSheetIdMap(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap sheetIdMap);
    
    /**
     * Appends and returns a new empty "sheetIdMap" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetIdMap addNewSheetIdMap();
    
    /**
     * Gets the "reviewedList" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions getReviewedList();
    
    /**
     * True if has "reviewedList" element
     */
    boolean isSetReviewedList();
    
    /**
     * Sets the "reviewedList" element
     */
    void setReviewedList(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions reviewedList);
    
    /**
     * Appends and returns a new empty "reviewedList" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTReviewedRevisions addNewReviewedList();
    
    /**
     * Unsets the "reviewedList" element
     */
    void unsetReviewedList();
    
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
     * Gets the "guid" attribute
     */
    java.lang.String getGuid();
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid();
    
    /**
     * Sets the "guid" attribute
     */
    void setGuid(java.lang.String guid);
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid);
    
    /**
     * Gets the "dateTime" attribute
     */
    java.util.Calendar getDateTime();
    
    /**
     * Gets (as xml) the "dateTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTime();
    
    /**
     * Sets the "dateTime" attribute
     */
    void setDateTime(java.util.Calendar dateTime);
    
    /**
     * Sets (as xml) the "dateTime" attribute
     */
    void xsetDateTime(org.apache.xmlbeans.XmlDateTime dateTime);
    
    /**
     * Gets the "maxSheetId" attribute
     */
    long getMaxSheetId();
    
    /**
     * Gets (as xml) the "maxSheetId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMaxSheetId();
    
    /**
     * Sets the "maxSheetId" attribute
     */
    void setMaxSheetId(long maxSheetId);
    
    /**
     * Sets (as xml) the "maxSheetId" attribute
     */
    void xsetMaxSheetId(org.apache.xmlbeans.XmlUnsignedInt maxSheetId);
    
    /**
     * Gets the "userName" attribute
     */
    java.lang.String getUserName();
    
    /**
     * Gets (as xml) the "userName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUserName();
    
    /**
     * Sets the "userName" attribute
     */
    void setUserName(java.lang.String userName);
    
    /**
     * Sets (as xml) the "userName" attribute
     */
    void xsetUserName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring userName);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
    
    /**
     * Gets the "minRId" attribute
     */
    long getMinRId();
    
    /**
     * Gets (as xml) the "minRId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMinRId();
    
    /**
     * True if has "minRId" attribute
     */
    boolean isSetMinRId();
    
    /**
     * Sets the "minRId" attribute
     */
    void setMinRId(long minRId);
    
    /**
     * Sets (as xml) the "minRId" attribute
     */
    void xsetMinRId(org.apache.xmlbeans.XmlUnsignedInt minRId);
    
    /**
     * Unsets the "minRId" attribute
     */
    void unsetMinRId();
    
    /**
     * Gets the "maxRId" attribute
     */
    long getMaxRId();
    
    /**
     * Gets (as xml) the "maxRId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMaxRId();
    
    /**
     * True if has "maxRId" attribute
     */
    boolean isSetMaxRId();
    
    /**
     * Sets the "maxRId" attribute
     */
    void setMaxRId(long maxRId);
    
    /**
     * Sets (as xml) the "maxRId" attribute
     */
    void xsetMaxRId(org.apache.xmlbeans.XmlUnsignedInt maxRId);
    
    /**
     * Unsets the "maxRId" attribute
     */
    void unsetMaxRId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
