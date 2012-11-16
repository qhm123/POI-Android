/*
 * XML Type:  CT_Users
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Users(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTUsers extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTUsers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctusersa927type");
    
    /**
     * Gets a List of "userInfo" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser> getUserInfoList();
    
    /**
     * Gets array of all "userInfo" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[] getUserInfoArray();
    
    /**
     * Gets ith "userInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser getUserInfoArray(int i);
    
    /**
     * Returns number of "userInfo" element
     */
    int sizeOfUserInfoArray();
    
    /**
     * Sets array of all "userInfo" element
     */
    void setUserInfoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser[] userInfoArray);
    
    /**
     * Sets ith "userInfo" element
     */
    void setUserInfoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser userInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "userInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser insertNewUserInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "userInfo" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedUser addNewUserInfo();
    
    /**
     * Removes the ith "userInfo" element
     */
    void removeUserInfo(int i);
    
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
