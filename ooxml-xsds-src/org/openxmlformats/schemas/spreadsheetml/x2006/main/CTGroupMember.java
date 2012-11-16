/*
 * XML Type:  CT_GroupMember
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_GroupMember(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGroupMember extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGroupMember.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgroupmember1598type");
    
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
     * Gets the "group" attribute
     */
    boolean getGroup();
    
    /**
     * Gets (as xml) the "group" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetGroup();
    
    /**
     * True if has "group" attribute
     */
    boolean isSetGroup();
    
    /**
     * Sets the "group" attribute
     */
    void setGroup(boolean group);
    
    /**
     * Sets (as xml) the "group" attribute
     */
    void xsetGroup(org.apache.xmlbeans.XmlBoolean group);
    
    /**
     * Unsets the "group" attribute
     */
    void unsetGroup();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
