/*
 * XML Type:  CT_Connection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Connection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTConnection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTConnection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctconnectionc6e7type");
    
    /**
     * Gets the "dbPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr getDbPr();
    
    /**
     * True if has "dbPr" element
     */
    boolean isSetDbPr();
    
    /**
     * Sets the "dbPr" element
     */
    void setDbPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr dbPr);
    
    /**
     * Appends and returns a new empty "dbPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr addNewDbPr();
    
    /**
     * Unsets the "dbPr" element
     */
    void unsetDbPr();
    
    /**
     * Gets the "olapPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr getOlapPr();
    
    /**
     * True if has "olapPr" element
     */
    boolean isSetOlapPr();
    
    /**
     * Sets the "olapPr" element
     */
    void setOlapPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr olapPr);
    
    /**
     * Appends and returns a new empty "olapPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOlapPr addNewOlapPr();
    
    /**
     * Unsets the "olapPr" element
     */
    void unsetOlapPr();
    
    /**
     * Gets the "webPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr getWebPr();
    
    /**
     * True if has "webPr" element
     */
    boolean isSetWebPr();
    
    /**
     * Sets the "webPr" element
     */
    void setWebPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr webPr);
    
    /**
     * Appends and returns a new empty "webPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPr addNewWebPr();
    
    /**
     * Unsets the "webPr" element
     */
    void unsetWebPr();
    
    /**
     * Gets the "textPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr getTextPr();
    
    /**
     * True if has "textPr" element
     */
    boolean isSetTextPr();
    
    /**
     * Sets the "textPr" element
     */
    void setTextPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr textPr);
    
    /**
     * Appends and returns a new empty "textPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTextPr addNewTextPr();
    
    /**
     * Unsets the "textPr" element
     */
    void unsetTextPr();
    
    /**
     * Gets the "parameters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters getParameters();
    
    /**
     * True if has "parameters" element
     */
    boolean isSetParameters();
    
    /**
     * Sets the "parameters" element
     */
    void setParameters(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters parameters);
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters addNewParameters();
    
    /**
     * Unsets the "parameters" element
     */
    void unsetParameters();
    
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
     * Gets the "id" attribute
     */
    long getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(long id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlUnsignedInt id);
    
    /**
     * Gets the "sourceFile" attribute
     */
    java.lang.String getSourceFile();
    
    /**
     * Gets (as xml) the "sourceFile" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSourceFile();
    
    /**
     * True if has "sourceFile" attribute
     */
    boolean isSetSourceFile();
    
    /**
     * Sets the "sourceFile" attribute
     */
    void setSourceFile(java.lang.String sourceFile);
    
    /**
     * Sets (as xml) the "sourceFile" attribute
     */
    void xsetSourceFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring sourceFile);
    
    /**
     * Unsets the "sourceFile" attribute
     */
    void unsetSourceFile();
    
    /**
     * Gets the "odcFile" attribute
     */
    java.lang.String getOdcFile();
    
    /**
     * Gets (as xml) the "odcFile" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOdcFile();
    
    /**
     * True if has "odcFile" attribute
     */
    boolean isSetOdcFile();
    
    /**
     * Sets the "odcFile" attribute
     */
    void setOdcFile(java.lang.String odcFile);
    
    /**
     * Sets (as xml) the "odcFile" attribute
     */
    void xsetOdcFile(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring odcFile);
    
    /**
     * Unsets the "odcFile" attribute
     */
    void unsetOdcFile();
    
    /**
     * Gets the "keepAlive" attribute
     */
    boolean getKeepAlive();
    
    /**
     * Gets (as xml) the "keepAlive" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetKeepAlive();
    
    /**
     * True if has "keepAlive" attribute
     */
    boolean isSetKeepAlive();
    
    /**
     * Sets the "keepAlive" attribute
     */
    void setKeepAlive(boolean keepAlive);
    
    /**
     * Sets (as xml) the "keepAlive" attribute
     */
    void xsetKeepAlive(org.apache.xmlbeans.XmlBoolean keepAlive);
    
    /**
     * Unsets the "keepAlive" attribute
     */
    void unsetKeepAlive();
    
    /**
     * Gets the "interval" attribute
     */
    long getInterval();
    
    /**
     * Gets (as xml) the "interval" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetInterval();
    
    /**
     * True if has "interval" attribute
     */
    boolean isSetInterval();
    
    /**
     * Sets the "interval" attribute
     */
    void setInterval(long interval);
    
    /**
     * Sets (as xml) the "interval" attribute
     */
    void xsetInterval(org.apache.xmlbeans.XmlUnsignedInt interval);
    
    /**
     * Unsets the "interval" attribute
     */
    void unsetInterval();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
    /**
     * Gets the "type" attribute
     */
    long getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(long type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlUnsignedInt type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "reconnectionMethod" attribute
     */
    long getReconnectionMethod();
    
    /**
     * Gets (as xml) the "reconnectionMethod" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetReconnectionMethod();
    
    /**
     * True if has "reconnectionMethod" attribute
     */
    boolean isSetReconnectionMethod();
    
    /**
     * Sets the "reconnectionMethod" attribute
     */
    void setReconnectionMethod(long reconnectionMethod);
    
    /**
     * Sets (as xml) the "reconnectionMethod" attribute
     */
    void xsetReconnectionMethod(org.apache.xmlbeans.XmlUnsignedInt reconnectionMethod);
    
    /**
     * Unsets the "reconnectionMethod" attribute
     */
    void unsetReconnectionMethod();
    
    /**
     * Gets the "refreshedVersion" attribute
     */
    short getRefreshedVersion();
    
    /**
     * Gets (as xml) the "refreshedVersion" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetRefreshedVersion();
    
    /**
     * Sets the "refreshedVersion" attribute
     */
    void setRefreshedVersion(short refreshedVersion);
    
    /**
     * Sets (as xml) the "refreshedVersion" attribute
     */
    void xsetRefreshedVersion(org.apache.xmlbeans.XmlUnsignedByte refreshedVersion);
    
    /**
     * Gets the "minRefreshableVersion" attribute
     */
    short getMinRefreshableVersion();
    
    /**
     * Gets (as xml) the "minRefreshableVersion" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetMinRefreshableVersion();
    
    /**
     * True if has "minRefreshableVersion" attribute
     */
    boolean isSetMinRefreshableVersion();
    
    /**
     * Sets the "minRefreshableVersion" attribute
     */
    void setMinRefreshableVersion(short minRefreshableVersion);
    
    /**
     * Sets (as xml) the "minRefreshableVersion" attribute
     */
    void xsetMinRefreshableVersion(org.apache.xmlbeans.XmlUnsignedByte minRefreshableVersion);
    
    /**
     * Unsets the "minRefreshableVersion" attribute
     */
    void unsetMinRefreshableVersion();
    
    /**
     * Gets the "savePassword" attribute
     */
    boolean getSavePassword();
    
    /**
     * Gets (as xml) the "savePassword" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSavePassword();
    
    /**
     * True if has "savePassword" attribute
     */
    boolean isSetSavePassword();
    
    /**
     * Sets the "savePassword" attribute
     */
    void setSavePassword(boolean savePassword);
    
    /**
     * Sets (as xml) the "savePassword" attribute
     */
    void xsetSavePassword(org.apache.xmlbeans.XmlBoolean savePassword);
    
    /**
     * Unsets the "savePassword" attribute
     */
    void unsetSavePassword();
    
    /**
     * Gets the "new" attribute
     */
    boolean getNew();
    
    /**
     * Gets (as xml) the "new" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNew();
    
    /**
     * True if has "new" attribute
     */
    boolean isSetNew();
    
    /**
     * Sets the "new" attribute
     */
    void setNew(boolean xnew);
    
    /**
     * Sets (as xml) the "new" attribute
     */
    void xsetNew(org.apache.xmlbeans.XmlBoolean xnew);
    
    /**
     * Unsets the "new" attribute
     */
    void unsetNew();
    
    /**
     * Gets the "deleted" attribute
     */
    boolean getDeleted();
    
    /**
     * Gets (as xml) the "deleted" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDeleted();
    
    /**
     * True if has "deleted" attribute
     */
    boolean isSetDeleted();
    
    /**
     * Sets the "deleted" attribute
     */
    void setDeleted(boolean deleted);
    
    /**
     * Sets (as xml) the "deleted" attribute
     */
    void xsetDeleted(org.apache.xmlbeans.XmlBoolean deleted);
    
    /**
     * Unsets the "deleted" attribute
     */
    void unsetDeleted();
    
    /**
     * Gets the "onlyUseConnectionFile" attribute
     */
    boolean getOnlyUseConnectionFile();
    
    /**
     * Gets (as xml) the "onlyUseConnectionFile" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOnlyUseConnectionFile();
    
    /**
     * True if has "onlyUseConnectionFile" attribute
     */
    boolean isSetOnlyUseConnectionFile();
    
    /**
     * Sets the "onlyUseConnectionFile" attribute
     */
    void setOnlyUseConnectionFile(boolean onlyUseConnectionFile);
    
    /**
     * Sets (as xml) the "onlyUseConnectionFile" attribute
     */
    void xsetOnlyUseConnectionFile(org.apache.xmlbeans.XmlBoolean onlyUseConnectionFile);
    
    /**
     * Unsets the "onlyUseConnectionFile" attribute
     */
    void unsetOnlyUseConnectionFile();
    
    /**
     * Gets the "background" attribute
     */
    boolean getBackground();
    
    /**
     * Gets (as xml) the "background" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBackground();
    
    /**
     * True if has "background" attribute
     */
    boolean isSetBackground();
    
    /**
     * Sets the "background" attribute
     */
    void setBackground(boolean background);
    
    /**
     * Sets (as xml) the "background" attribute
     */
    void xsetBackground(org.apache.xmlbeans.XmlBoolean background);
    
    /**
     * Unsets the "background" attribute
     */
    void unsetBackground();
    
    /**
     * Gets the "refreshOnLoad" attribute
     */
    boolean getRefreshOnLoad();
    
    /**
     * Gets (as xml) the "refreshOnLoad" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshOnLoad();
    
    /**
     * True if has "refreshOnLoad" attribute
     */
    boolean isSetRefreshOnLoad();
    
    /**
     * Sets the "refreshOnLoad" attribute
     */
    void setRefreshOnLoad(boolean refreshOnLoad);
    
    /**
     * Sets (as xml) the "refreshOnLoad" attribute
     */
    void xsetRefreshOnLoad(org.apache.xmlbeans.XmlBoolean refreshOnLoad);
    
    /**
     * Unsets the "refreshOnLoad" attribute
     */
    void unsetRefreshOnLoad();
    
    /**
     * Gets the "saveData" attribute
     */
    boolean getSaveData();
    
    /**
     * Gets (as xml) the "saveData" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSaveData();
    
    /**
     * True if has "saveData" attribute
     */
    boolean isSetSaveData();
    
    /**
     * Sets the "saveData" attribute
     */
    void setSaveData(boolean saveData);
    
    /**
     * Sets (as xml) the "saveData" attribute
     */
    void xsetSaveData(org.apache.xmlbeans.XmlBoolean saveData);
    
    /**
     * Unsets the "saveData" attribute
     */
    void unsetSaveData();
    
    /**
     * Gets the "credentials" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod.Enum getCredentials();
    
    /**
     * Gets (as xml) the "credentials" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod xgetCredentials();
    
    /**
     * True if has "credentials" attribute
     */
    boolean isSetCredentials();
    
    /**
     * Sets the "credentials" attribute
     */
    void setCredentials(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod.Enum credentials);
    
    /**
     * Sets (as xml) the "credentials" attribute
     */
    void xsetCredentials(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCredMethod credentials);
    
    /**
     * Unsets the "credentials" attribute
     */
    void unsetCredentials();
    
    /**
     * Gets the "singleSignOnId" attribute
     */
    java.lang.String getSingleSignOnId();
    
    /**
     * Gets (as xml) the "singleSignOnId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetSingleSignOnId();
    
    /**
     * True if has "singleSignOnId" attribute
     */
    boolean isSetSingleSignOnId();
    
    /**
     * Sets the "singleSignOnId" attribute
     */
    void setSingleSignOnId(java.lang.String singleSignOnId);
    
    /**
     * Sets (as xml) the "singleSignOnId" attribute
     */
    void xsetSingleSignOnId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring singleSignOnId);
    
    /**
     * Unsets the "singleSignOnId" attribute
     */
    void unsetSingleSignOnId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
