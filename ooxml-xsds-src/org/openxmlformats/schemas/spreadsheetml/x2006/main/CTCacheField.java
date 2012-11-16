/*
 * XML Type:  CT_CacheField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CacheField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCacheField extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCacheField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcachefieldae21type");
    
    /**
     * Gets the "sharedItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems getSharedItems();
    
    /**
     * True if has "sharedItems" element
     */
    boolean isSetSharedItems();
    
    /**
     * Sets the "sharedItems" element
     */
    void setSharedItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems sharedItems);
    
    /**
     * Appends and returns a new empty "sharedItems" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems addNewSharedItems();
    
    /**
     * Unsets the "sharedItems" element
     */
    void unsetSharedItems();
    
    /**
     * Gets the "fieldGroup" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup getFieldGroup();
    
    /**
     * True if has "fieldGroup" element
     */
    boolean isSetFieldGroup();
    
    /**
     * Sets the "fieldGroup" element
     */
    void setFieldGroup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup fieldGroup);
    
    /**
     * Appends and returns a new empty "fieldGroup" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup addNewFieldGroup();
    
    /**
     * Unsets the "fieldGroup" element
     */
    void unsetFieldGroup();
    
    /**
     * Gets a List of "mpMap" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getMpMapList();
    
    /**
     * Gets array of all "mpMap" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] getMpMapArray();
    
    /**
     * Gets ith "mpMap" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX getMpMapArray(int i);
    
    /**
     * Returns number of "mpMap" element
     */
    int sizeOfMpMapArray();
    
    /**
     * Sets array of all "mpMap" element
     */
    void setMpMapArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] mpMapArray);
    
    /**
     * Sets ith "mpMap" element
     */
    void setMpMapArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX mpMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mpMap" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX insertNewMpMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mpMap" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX addNewMpMap();
    
    /**
     * Removes the ith "mpMap" element
     */
    void removeMpMap(int i);
    
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
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Gets the "caption" attribute
     */
    java.lang.String getCaption();
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption();
    
    /**
     * True if has "caption" attribute
     */
    boolean isSetCaption();
    
    /**
     * Sets the "caption" attribute
     */
    void setCaption(java.lang.String caption);
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption);
    
    /**
     * Unsets the "caption" attribute
     */
    void unsetCaption();
    
    /**
     * Gets the "propertyName" attribute
     */
    java.lang.String getPropertyName();
    
    /**
     * Gets (as xml) the "propertyName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPropertyName();
    
    /**
     * True if has "propertyName" attribute
     */
    boolean isSetPropertyName();
    
    /**
     * Sets the "propertyName" attribute
     */
    void setPropertyName(java.lang.String propertyName);
    
    /**
     * Sets (as xml) the "propertyName" attribute
     */
    void xsetPropertyName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring propertyName);
    
    /**
     * Unsets the "propertyName" attribute
     */
    void unsetPropertyName();
    
    /**
     * Gets the "serverField" attribute
     */
    boolean getServerField();
    
    /**
     * Gets (as xml) the "serverField" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetServerField();
    
    /**
     * True if has "serverField" attribute
     */
    boolean isSetServerField();
    
    /**
     * Sets the "serverField" attribute
     */
    void setServerField(boolean serverField);
    
    /**
     * Sets (as xml) the "serverField" attribute
     */
    void xsetServerField(org.apache.xmlbeans.XmlBoolean serverField);
    
    /**
     * Unsets the "serverField" attribute
     */
    void unsetServerField();
    
    /**
     * Gets the "uniqueList" attribute
     */
    boolean getUniqueList();
    
    /**
     * Gets (as xml) the "uniqueList" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUniqueList();
    
    /**
     * True if has "uniqueList" attribute
     */
    boolean isSetUniqueList();
    
    /**
     * Sets the "uniqueList" attribute
     */
    void setUniqueList(boolean uniqueList);
    
    /**
     * Sets (as xml) the "uniqueList" attribute
     */
    void xsetUniqueList(org.apache.xmlbeans.XmlBoolean uniqueList);
    
    /**
     * Unsets the "uniqueList" attribute
     */
    void unsetUniqueList();
    
    /**
     * Gets the "numFmtId" attribute
     */
    long getNumFmtId();
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId();
    
    /**
     * True if has "numFmtId" attribute
     */
    boolean isSetNumFmtId();
    
    /**
     * Sets the "numFmtId" attribute
     */
    void setNumFmtId(long numFmtId);
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId);
    
    /**
     * Unsets the "numFmtId" attribute
     */
    void unsetNumFmtId();
    
    /**
     * Gets the "formula" attribute
     */
    java.lang.String getFormula();
    
    /**
     * Gets (as xml) the "formula" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFormula();
    
    /**
     * True if has "formula" attribute
     */
    boolean isSetFormula();
    
    /**
     * Sets the "formula" attribute
     */
    void setFormula(java.lang.String formula);
    
    /**
     * Sets (as xml) the "formula" attribute
     */
    void xsetFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring formula);
    
    /**
     * Unsets the "formula" attribute
     */
    void unsetFormula();
    
    /**
     * Gets the "sqlType" attribute
     */
    int getSqlType();
    
    /**
     * Gets (as xml) the "sqlType" attribute
     */
    org.apache.xmlbeans.XmlInt xgetSqlType();
    
    /**
     * True if has "sqlType" attribute
     */
    boolean isSetSqlType();
    
    /**
     * Sets the "sqlType" attribute
     */
    void setSqlType(int sqlType);
    
    /**
     * Sets (as xml) the "sqlType" attribute
     */
    void xsetSqlType(org.apache.xmlbeans.XmlInt sqlType);
    
    /**
     * Unsets the "sqlType" attribute
     */
    void unsetSqlType();
    
    /**
     * Gets the "hierarchy" attribute
     */
    int getHierarchy();
    
    /**
     * Gets (as xml) the "hierarchy" attribute
     */
    org.apache.xmlbeans.XmlInt xgetHierarchy();
    
    /**
     * True if has "hierarchy" attribute
     */
    boolean isSetHierarchy();
    
    /**
     * Sets the "hierarchy" attribute
     */
    void setHierarchy(int hierarchy);
    
    /**
     * Sets (as xml) the "hierarchy" attribute
     */
    void xsetHierarchy(org.apache.xmlbeans.XmlInt hierarchy);
    
    /**
     * Unsets the "hierarchy" attribute
     */
    void unsetHierarchy();
    
    /**
     * Gets the "level" attribute
     */
    long getLevel();
    
    /**
     * Gets (as xml) the "level" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLevel();
    
    /**
     * True if has "level" attribute
     */
    boolean isSetLevel();
    
    /**
     * Sets the "level" attribute
     */
    void setLevel(long level);
    
    /**
     * Sets (as xml) the "level" attribute
     */
    void xsetLevel(org.apache.xmlbeans.XmlUnsignedInt level);
    
    /**
     * Unsets the "level" attribute
     */
    void unsetLevel();
    
    /**
     * Gets the "databaseField" attribute
     */
    boolean getDatabaseField();
    
    /**
     * Gets (as xml) the "databaseField" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDatabaseField();
    
    /**
     * True if has "databaseField" attribute
     */
    boolean isSetDatabaseField();
    
    /**
     * Sets the "databaseField" attribute
     */
    void setDatabaseField(boolean databaseField);
    
    /**
     * Sets (as xml) the "databaseField" attribute
     */
    void xsetDatabaseField(org.apache.xmlbeans.XmlBoolean databaseField);
    
    /**
     * Unsets the "databaseField" attribute
     */
    void unsetDatabaseField();
    
    /**
     * Gets the "mappingCount" attribute
     */
    long getMappingCount();
    
    /**
     * Gets (as xml) the "mappingCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMappingCount();
    
    /**
     * True if has "mappingCount" attribute
     */
    boolean isSetMappingCount();
    
    /**
     * Sets the "mappingCount" attribute
     */
    void setMappingCount(long mappingCount);
    
    /**
     * Sets (as xml) the "mappingCount" attribute
     */
    void xsetMappingCount(org.apache.xmlbeans.XmlUnsignedInt mappingCount);
    
    /**
     * Unsets the "mappingCount" attribute
     */
    void unsetMappingCount();
    
    /**
     * Gets the "memberPropertyField" attribute
     */
    boolean getMemberPropertyField();
    
    /**
     * Gets (as xml) the "memberPropertyField" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMemberPropertyField();
    
    /**
     * True if has "memberPropertyField" attribute
     */
    boolean isSetMemberPropertyField();
    
    /**
     * Sets the "memberPropertyField" attribute
     */
    void setMemberPropertyField(boolean memberPropertyField);
    
    /**
     * Sets (as xml) the "memberPropertyField" attribute
     */
    void xsetMemberPropertyField(org.apache.xmlbeans.XmlBoolean memberPropertyField);
    
    /**
     * Unsets the "memberPropertyField" attribute
     */
    void unsetMemberPropertyField();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
