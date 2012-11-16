/*
 * XML Type:  CT_MoveBookmark
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_MoveBookmark(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTMoveBookmark extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTMoveBookmark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmovebookmarkf7a1type");
    
    /**
     * Gets the "author" attribute
     */
    java.lang.String getAuthor();
    
    /**
     * Gets (as xml) the "author" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAuthor();
    
    /**
     * Sets the "author" attribute
     */
    void setAuthor(java.lang.String author);
    
    /**
     * Sets (as xml) the "author" attribute
     */
    void xsetAuthor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString author);
    
    /**
     * Gets the "date" attribute
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime xgetDate();
    
    /**
     * Sets the "date" attribute
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" attribute
     */
    void xsetDate(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime date);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
