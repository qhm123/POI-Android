/*
 * XML Type:  CT_RevisionHeaders
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeaders
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_RevisionHeaders(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRevisionHeaders extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTRevisionHeaders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctrevisionheadersdecatype");
    
    /**
     * Gets a List of "header" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader> getHeaderList();
    
    /**
     * Gets array of all "header" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[] getHeaderArray();
    
    /**
     * Gets ith "header" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader getHeaderArray(int i);
    
    /**
     * Returns number of "header" element
     */
    int sizeOfHeaderArray();
    
    /**
     * Sets array of all "header" element
     */
    void setHeaderArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader[] headerArray);
    
    /**
     * Sets ith "header" element
     */
    void setHeaderArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader header);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "header" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader insertNewHeader(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "header" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionHeader addNewHeader();
    
    /**
     * Removes the ith "header" element
     */
    void removeHeader(int i);
    
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
     * Gets the "lastGuid" attribute
     */
    java.lang.String getLastGuid();
    
    /**
     * Gets (as xml) the "lastGuid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetLastGuid();
    
    /**
     * True if has "lastGuid" attribute
     */
    boolean isSetLastGuid();
    
    /**
     * Sets the "lastGuid" attribute
     */
    void setLastGuid(java.lang.String lastGuid);
    
    /**
     * Sets (as xml) the "lastGuid" attribute
     */
    void xsetLastGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid lastGuid);
    
    /**
     * Unsets the "lastGuid" attribute
     */
    void unsetLastGuid();
    
    /**
     * Gets the "shared" attribute
     */
    boolean getShared();
    
    /**
     * Gets (as xml) the "shared" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShared();
    
    /**
     * True if has "shared" attribute
     */
    boolean isSetShared();
    
    /**
     * Sets the "shared" attribute
     */
    void setShared(boolean shared);
    
    /**
     * Sets (as xml) the "shared" attribute
     */
    void xsetShared(org.apache.xmlbeans.XmlBoolean shared);
    
    /**
     * Unsets the "shared" attribute
     */
    void unsetShared();
    
    /**
     * Gets the "diskRevisions" attribute
     */
    boolean getDiskRevisions();
    
    /**
     * Gets (as xml) the "diskRevisions" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDiskRevisions();
    
    /**
     * True if has "diskRevisions" attribute
     */
    boolean isSetDiskRevisions();
    
    /**
     * Sets the "diskRevisions" attribute
     */
    void setDiskRevisions(boolean diskRevisions);
    
    /**
     * Sets (as xml) the "diskRevisions" attribute
     */
    void xsetDiskRevisions(org.apache.xmlbeans.XmlBoolean diskRevisions);
    
    /**
     * Unsets the "diskRevisions" attribute
     */
    void unsetDiskRevisions();
    
    /**
     * Gets the "history" attribute
     */
    boolean getHistory();
    
    /**
     * Gets (as xml) the "history" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHistory();
    
    /**
     * True if has "history" attribute
     */
    boolean isSetHistory();
    
    /**
     * Sets the "history" attribute
     */
    void setHistory(boolean history);
    
    /**
     * Sets (as xml) the "history" attribute
     */
    void xsetHistory(org.apache.xmlbeans.XmlBoolean history);
    
    /**
     * Unsets the "history" attribute
     */
    void unsetHistory();
    
    /**
     * Gets the "trackRevisions" attribute
     */
    boolean getTrackRevisions();
    
    /**
     * Gets (as xml) the "trackRevisions" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTrackRevisions();
    
    /**
     * True if has "trackRevisions" attribute
     */
    boolean isSetTrackRevisions();
    
    /**
     * Sets the "trackRevisions" attribute
     */
    void setTrackRevisions(boolean trackRevisions);
    
    /**
     * Sets (as xml) the "trackRevisions" attribute
     */
    void xsetTrackRevisions(org.apache.xmlbeans.XmlBoolean trackRevisions);
    
    /**
     * Unsets the "trackRevisions" attribute
     */
    void unsetTrackRevisions();
    
    /**
     * Gets the "exclusive" attribute
     */
    boolean getExclusive();
    
    /**
     * Gets (as xml) the "exclusive" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExclusive();
    
    /**
     * True if has "exclusive" attribute
     */
    boolean isSetExclusive();
    
    /**
     * Sets the "exclusive" attribute
     */
    void setExclusive(boolean exclusive);
    
    /**
     * Sets (as xml) the "exclusive" attribute
     */
    void xsetExclusive(org.apache.xmlbeans.XmlBoolean exclusive);
    
    /**
     * Unsets the "exclusive" attribute
     */
    void unsetExclusive();
    
    /**
     * Gets the "revisionId" attribute
     */
    long getRevisionId();
    
    /**
     * Gets (as xml) the "revisionId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetRevisionId();
    
    /**
     * True if has "revisionId" attribute
     */
    boolean isSetRevisionId();
    
    /**
     * Sets the "revisionId" attribute
     */
    void setRevisionId(long revisionId);
    
    /**
     * Sets (as xml) the "revisionId" attribute
     */
    void xsetRevisionId(org.apache.xmlbeans.XmlUnsignedInt revisionId);
    
    /**
     * Unsets the "revisionId" attribute
     */
    void unsetRevisionId();
    
    /**
     * Gets the "version" attribute
     */
    int getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.apache.xmlbeans.XmlInt xgetVersion();
    
    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(int version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.apache.xmlbeans.XmlInt version);
    
    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
    
    /**
     * Gets the "keepChangeHistory" attribute
     */
    boolean getKeepChangeHistory();
    
    /**
     * Gets (as xml) the "keepChangeHistory" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetKeepChangeHistory();
    
    /**
     * True if has "keepChangeHistory" attribute
     */
    boolean isSetKeepChangeHistory();
    
    /**
     * Sets the "keepChangeHistory" attribute
     */
    void setKeepChangeHistory(boolean keepChangeHistory);
    
    /**
     * Sets (as xml) the "keepChangeHistory" attribute
     */
    void xsetKeepChangeHistory(org.apache.xmlbeans.XmlBoolean keepChangeHistory);
    
    /**
     * Unsets the "keepChangeHistory" attribute
     */
    void unsetKeepChangeHistory();
    
    /**
     * Gets the "protected" attribute
     */
    boolean getProtected();
    
    /**
     * Gets (as xml) the "protected" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProtected();
    
    /**
     * True if has "protected" attribute
     */
    boolean isSetProtected();
    
    /**
     * Sets the "protected" attribute
     */
    void setProtected(boolean xprotected);
    
    /**
     * Sets (as xml) the "protected" attribute
     */
    void xsetProtected(org.apache.xmlbeans.XmlBoolean xprotected);
    
    /**
     * Unsets the "protected" attribute
     */
    void unsetProtected();
    
    /**
     * Gets the "preserveHistory" attribute
     */
    long getPreserveHistory();
    
    /**
     * Gets (as xml) the "preserveHistory" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetPreserveHistory();
    
    /**
     * True if has "preserveHistory" attribute
     */
    boolean isSetPreserveHistory();
    
    /**
     * Sets the "preserveHistory" attribute
     */
    void setPreserveHistory(long preserveHistory);
    
    /**
     * Sets (as xml) the "preserveHistory" attribute
     */
    void xsetPreserveHistory(org.apache.xmlbeans.XmlUnsignedInt preserveHistory);
    
    /**
     * Unsets the "preserveHistory" attribute
     */
    void unsetPreserveHistory();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
