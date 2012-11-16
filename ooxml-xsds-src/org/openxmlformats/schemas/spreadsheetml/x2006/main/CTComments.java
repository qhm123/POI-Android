/*
 * XML Type:  CT_Comments
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Comments(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTComments extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTComments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcommentse3bdtype");
    
    /**
     * Gets the "authors" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors getAuthors();
    
    /**
     * Sets the "authors" element
     */
    void setAuthors(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors authors);
    
    /**
     * Appends and returns a new empty "authors" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors addNewAuthors();
    
    /**
     * Gets the "commentList" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList getCommentList();
    
    /**
     * Sets the "commentList" element
     */
    void setCommentList(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList commentList);
    
    /**
     * Appends and returns a new empty "commentList" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList addNewCommentList();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
