/*
 * XML Type:  CT_Comment
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTComment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_Comment(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTComment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTComment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctcomment2d10type");
    
    /**
     * Gets the "pos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getPos();
    
    /**
     * Sets the "pos" element
     */
    void setPos(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D pos);
    
    /**
     * Appends and returns a new empty "pos" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewPos();
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    org.apache.xmlbeans.XmlString xgetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(org.apache.xmlbeans.XmlString text);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
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
     * Gets the "dt" attribute
     */
    java.util.Calendar getDt();
    
    /**
     * Gets (as xml) the "dt" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDt();
    
    /**
     * True if has "dt" attribute
     */
    boolean isSetDt();
    
    /**
     * Sets the "dt" attribute
     */
    void setDt(java.util.Calendar dt);
    
    /**
     * Sets (as xml) the "dt" attribute
     */
    void xsetDt(org.apache.xmlbeans.XmlDateTime dt);
    
    /**
     * Unsets the "dt" attribute
     */
    void unsetDt();
    
    /**
     * Gets the "idx" attribute
     */
    long getIdx();
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STIndex xgetIdx();
    
    /**
     * Sets the "idx" attribute
     */
    void setIdx(long idx);
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    void xsetIdx(org.openxmlformats.schemas.presentationml.x2006.main.STIndex idx);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
