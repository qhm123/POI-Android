/*
 * XML Type:  CT_Comment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Comment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTComment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTComment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcomment7bfetype");
    
    /**
     * Gets the "text" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst getText();
    
    /**
     * Sets the "text" element
     */
    void setText(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst addNewText();
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref);
    
    /**
     * Gets the "authorId" attribute
     */
    long getAuthorId();
    
    /**
     * Gets (as xml) the "authorId" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetAuthorId();
    
    /**
     * Sets the "authorId" attribute
     */
    void setAuthorId(long authorId);
    
    /**
     * Sets (as xml) the "authorId" attribute
     */
    void xsetAuthorId(org.apache.xmlbeans.XmlUnsignedInt authorId);
    
    /**
     * Gets the "guid" attribute
     */
    java.lang.String getGuid();
    
    /**
     * Gets (as xml) the "guid" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid xgetGuid();
    
    /**
     * True if has "guid" attribute
     */
    boolean isSetGuid();
    
    /**
     * Sets the "guid" attribute
     */
    void setGuid(java.lang.String guid);
    
    /**
     * Sets (as xml) the "guid" attribute
     */
    void xsetGuid(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGuid guid);
    
    /**
     * Unsets the "guid" attribute
     */
    void unsetGuid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
