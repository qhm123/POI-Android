/*
 * XML Type:  CT_NumPicBullet
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_NumPicBullet(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNumPicBullet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNumPicBullet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnumpicbullet61e2type");
    
    /**
     * Gets the "pict" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture getPict();
    
    /**
     * Sets the "pict" element
     */
    void setPict(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture pict);
    
    /**
     * Appends and returns a new empty "pict" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture addNewPict();
    
    /**
     * Gets the "numPicBulletId" attribute
     */
    java.math.BigInteger getNumPicBulletId();
    
    /**
     * Gets (as xml) the "numPicBulletId" attribute
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetNumPicBulletId();
    
    /**
     * Sets the "numPicBulletId" attribute
     */
    void setNumPicBulletId(java.math.BigInteger numPicBulletId);
    
    /**
     * Sets (as xml) the "numPicBulletId" attribute
     */
    void xsetNumPicBulletId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber numPicBulletId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
