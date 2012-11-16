/*
 * XML Type:  CT_CommentList
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_CommentList(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCommentList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCommentList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommentlist7a3ctype");
    
    /**
     * Gets a List of "comment" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment> getCommentList();
    
    /**
     * Gets array of all "comment" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[] getCommentArray();
    
    /**
     * Gets ith "comment" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment getCommentArray(int i);
    
    /**
     * Returns number of "comment" element
     */
    int sizeOfCommentArray();
    
    /**
     * Sets array of all "comment" element
     */
    void setCommentArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment[] commentArray);
    
    /**
     * Sets ith "comment" element
     */
    void setCommentArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment comment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comment" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment insertNewComment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comment" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment addNewComment();
    
    /**
     * Removes the ith "comment" element
     */
    void removeComment(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
