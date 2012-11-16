/*
 * XML Type:  CT_LevelGroup
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLevelGroup
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_LevelGroup(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTLevelGroup extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTLevelGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctlevelgroupbf24type");
    
    /**
     * Gets the "groupMembers" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers getGroupMembers();
    
    /**
     * Sets the "groupMembers" element
     */
    void setGroupMembers(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers groupMembers);
    
    /**
     * Appends and returns a new empty "groupMembers" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers addNewGroupMembers();
    
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
     * Gets the "uniqueName" attribute
     */
    java.lang.String getUniqueName();
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName();
    
    /**
     * Sets the "uniqueName" attribute
     */
    void setUniqueName(java.lang.String uniqueName);
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName);
    
    /**
     * Gets the "caption" attribute
     */
    java.lang.String getCaption();
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption();
    
    /**
     * Sets the "caption" attribute
     */
    void setCaption(java.lang.String caption);
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption);
    
    /**
     * Gets the "uniqueParent" attribute
     */
    java.lang.String getUniqueParent();
    
    /**
     * Gets (as xml) the "uniqueParent" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueParent();
    
    /**
     * True if has "uniqueParent" attribute
     */
    boolean isSetUniqueParent();
    
    /**
     * Sets the "uniqueParent" attribute
     */
    void setUniqueParent(java.lang.String uniqueParent);
    
    /**
     * Sets (as xml) the "uniqueParent" attribute
     */
    void xsetUniqueParent(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueParent);
    
    /**
     * Unsets the "uniqueParent" attribute
     */
    void unsetUniqueParent();
    
    /**
     * Gets the "id" attribute
     */
    int getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlInt xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(int id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlInt id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
