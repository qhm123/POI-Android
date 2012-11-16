/*
 * XML Type:  CT_CommentAuthorList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_CommentAuthorList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCommentAuthorList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCommentAuthorList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommentauthorlisteb07type");
    
    /**
     * Gets a List of "cmAuthor" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor> getCmAuthorList();
    
    /**
     * Gets array of all "cmAuthor" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[] getCmAuthorArray();
    
    /**
     * Gets ith "cmAuthor" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor getCmAuthorArray(int i);
    
    /**
     * Returns number of "cmAuthor" element
     */
    int sizeOfCmAuthorArray();
    
    /**
     * Sets array of all "cmAuthor" element
     */
    void setCmAuthorArray(org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor[] cmAuthorArray);
    
    /**
     * Sets ith "cmAuthor" element
     */
    void setCmAuthorArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor cmAuthor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cmAuthor" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor insertNewCmAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cmAuthor" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor addNewCmAuthor();
    
    /**
     * Removes the ith "cmAuthor" element
     */
    void removeCmAuthor(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
