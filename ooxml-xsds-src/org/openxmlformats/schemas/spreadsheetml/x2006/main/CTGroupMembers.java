/*
 * XML Type:  CT_GroupMembers
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMembers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_GroupMembers(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTGroupMembers extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTGroupMembers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctgroupmembers7d63type");
    
    /**
     * Gets a List of "groupMember" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember> getGroupMemberList();
    
    /**
     * Gets array of all "groupMember" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[] getGroupMemberArray();
    
    /**
     * Gets ith "groupMember" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember getGroupMemberArray(int i);
    
    /**
     * Returns number of "groupMember" element
     */
    int sizeOfGroupMemberArray();
    
    /**
     * Sets array of all "groupMember" element
     */
    void setGroupMemberArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember[] groupMemberArray);
    
    /**
     * Sets ith "groupMember" element
     */
    void setGroupMemberArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember groupMember);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupMember" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember insertNewGroupMember(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupMember" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupMember addNewGroupMember();
    
    /**
     * Removes the ith "groupMember" element
     */
    void removeGroupMember(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
