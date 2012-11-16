/*
 * XML Type:  CT_CommentList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_CommentList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCommentList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCommentList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommentlistf692type");
    
    /**
     * Gets a List of "cm" elements
     */
    java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTComment> getCmList();
    
    /**
     * Gets array of all "cm" elements
     * @deprecated
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTComment[] getCmArray();
    
    /**
     * Gets ith "cm" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTComment getCmArray(int i);
    
    /**
     * Returns number of "cm" element
     */
    int sizeOfCmArray();
    
    /**
     * Sets array of all "cm" element
     */
    void setCmArray(org.openxmlformats.schemas.presentationml.x2006.main.CTComment[] cmArray);
    
    /**
     * Sets ith "cm" element
     */
    void setCmArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTComment cm);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cm" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTComment insertNewCm(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cm" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTComment addNewCm();
    
    /**
     * Removes the ith "cm" element
     */
    void removeCm(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
