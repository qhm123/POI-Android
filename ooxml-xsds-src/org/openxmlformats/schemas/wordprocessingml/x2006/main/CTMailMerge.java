/*
 * XML Type:  CT_MailMerge
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_MailMerge(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMailMerge extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMailMerge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmailmerge1631type");
    
    /**
     * Gets the "mainDocumentType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType getMainDocumentType();
    
    /**
     * Sets the "mainDocumentType" element
     */
    void setMainDocumentType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType mainDocumentType);
    
    /**
     * Appends and returns a new empty "mainDocumentType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDocType addNewMainDocumentType();
    
    /**
     * Gets the "linkToQuery" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getLinkToQuery();
    
    /**
     * True if has "linkToQuery" element
     */
    boolean isSetLinkToQuery();
    
    /**
     * Sets the "linkToQuery" element
     */
    void setLinkToQuery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff linkToQuery);
    
    /**
     * Appends and returns a new empty "linkToQuery" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewLinkToQuery();
    
    /**
     * Unsets the "linkToQuery" element
     */
    void unsetLinkToQuery();
    
    /**
     * Gets the "dataType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType getDataType();
    
    /**
     * Sets the "dataType" element
     */
    void setDataType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType dataType);
    
    /**
     * Appends and returns a new empty "dataType" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDataType addNewDataType();
    
    /**
     * Gets the "connectString" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getConnectString();
    
    /**
     * True if has "connectString" element
     */
    boolean isSetConnectString();
    
    /**
     * Sets the "connectString" element
     */
    void setConnectString(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString connectString);
    
    /**
     * Appends and returns a new empty "connectString" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewConnectString();
    
    /**
     * Unsets the "connectString" element
     */
    void unsetConnectString();
    
    /**
     * Gets the "query" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getQuery();
    
    /**
     * True if has "query" element
     */
    boolean isSetQuery();
    
    /**
     * Sets the "query" element
     */
    void setQuery(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString query);
    
    /**
     * Appends and returns a new empty "query" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewQuery();
    
    /**
     * Unsets the "query" element
     */
    void unsetQuery();
    
    /**
     * Gets the "dataSource" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getDataSource();
    
    /**
     * True if has "dataSource" element
     */
    boolean isSetDataSource();
    
    /**
     * Sets the "dataSource" element
     */
    void setDataSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel dataSource);
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewDataSource();
    
    /**
     * Unsets the "dataSource" element
     */
    void unsetDataSource();
    
    /**
     * Gets the "headerSource" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getHeaderSource();
    
    /**
     * True if has "headerSource" element
     */
    boolean isSetHeaderSource();
    
    /**
     * Sets the "headerSource" element
     */
    void setHeaderSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel headerSource);
    
    /**
     * Appends and returns a new empty "headerSource" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewHeaderSource();
    
    /**
     * Unsets the "headerSource" element
     */
    void unsetHeaderSource();
    
    /**
     * Gets the "doNotSuppressBlankLines" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDoNotSuppressBlankLines();
    
    /**
     * True if has "doNotSuppressBlankLines" element
     */
    boolean isSetDoNotSuppressBlankLines();
    
    /**
     * Sets the "doNotSuppressBlankLines" element
     */
    void setDoNotSuppressBlankLines(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff doNotSuppressBlankLines);
    
    /**
     * Appends and returns a new empty "doNotSuppressBlankLines" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDoNotSuppressBlankLines();
    
    /**
     * Unsets the "doNotSuppressBlankLines" element
     */
    void unsetDoNotSuppressBlankLines();
    
    /**
     * Gets the "destination" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest getDestination();
    
    /**
     * True if has "destination" element
     */
    boolean isSetDestination();
    
    /**
     * Sets the "destination" element
     */
    void setDestination(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest destination);
    
    /**
     * Appends and returns a new empty "destination" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeDest addNewDestination();
    
    /**
     * Unsets the "destination" element
     */
    void unsetDestination();
    
    /**
     * Gets the "addressFieldName" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAddressFieldName();
    
    /**
     * True if has "addressFieldName" element
     */
    boolean isSetAddressFieldName();
    
    /**
     * Sets the "addressFieldName" element
     */
    void setAddressFieldName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addressFieldName);
    
    /**
     * Appends and returns a new empty "addressFieldName" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAddressFieldName();
    
    /**
     * Unsets the "addressFieldName" element
     */
    void unsetAddressFieldName();
    
    /**
     * Gets the "mailSubject" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getMailSubject();
    
    /**
     * True if has "mailSubject" element
     */
    boolean isSetMailSubject();
    
    /**
     * Sets the "mailSubject" element
     */
    void setMailSubject(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString mailSubject);
    
    /**
     * Appends and returns a new empty "mailSubject" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewMailSubject();
    
    /**
     * Unsets the "mailSubject" element
     */
    void unsetMailSubject();
    
    /**
     * Gets the "mailAsAttachment" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getMailAsAttachment();
    
    /**
     * True if has "mailAsAttachment" element
     */
    boolean isSetMailAsAttachment();
    
    /**
     * Sets the "mailAsAttachment" element
     */
    void setMailAsAttachment(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff mailAsAttachment);
    
    /**
     * Appends and returns a new empty "mailAsAttachment" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewMailAsAttachment();
    
    /**
     * Unsets the "mailAsAttachment" element
     */
    void unsetMailAsAttachment();
    
    /**
     * Gets the "viewMergedData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getViewMergedData();
    
    /**
     * True if has "viewMergedData" element
     */
    boolean isSetViewMergedData();
    
    /**
     * Sets the "viewMergedData" element
     */
    void setViewMergedData(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff viewMergedData);
    
    /**
     * Appends and returns a new empty "viewMergedData" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewViewMergedData();
    
    /**
     * Unsets the "viewMergedData" element
     */
    void unsetViewMergedData();
    
    /**
     * Gets the "activeRecord" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getActiveRecord();
    
    /**
     * True if has "activeRecord" element
     */
    boolean isSetActiveRecord();
    
    /**
     * Sets the "activeRecord" element
     */
    void setActiveRecord(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber activeRecord);
    
    /**
     * Appends and returns a new empty "activeRecord" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewActiveRecord();
    
    /**
     * Unsets the "activeRecord" element
     */
    void unsetActiveRecord();
    
    /**
     * Gets the "checkErrors" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getCheckErrors();
    
    /**
     * True if has "checkErrors" element
     */
    boolean isSetCheckErrors();
    
    /**
     * Sets the "checkErrors" element
     */
    void setCheckErrors(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber checkErrors);
    
    /**
     * Appends and returns a new empty "checkErrors" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewCheckErrors();
    
    /**
     * Unsets the "checkErrors" element
     */
    void unsetCheckErrors();
    
    /**
     * Gets the "odso" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso getOdso();
    
    /**
     * True if has "odso" element
     */
    boolean isSetOdso();
    
    /**
     * Sets the "odso" element
     */
    void setOdso(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso odso);
    
    /**
     * Appends and returns a new empty "odso" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso addNewOdso();
    
    /**
     * Unsets the "odso" element
     */
    void unsetOdso();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
