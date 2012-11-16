/*
 * XML Type:  CT_FileSharing
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_FileSharing(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFileSharing extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFileSharing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfilesharing5c9ftype");
    
    /**
     * Gets the "readOnlyRecommended" attribute
     */
    boolean getReadOnlyRecommended();
    
    /**
     * Gets (as xml) the "readOnlyRecommended" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReadOnlyRecommended();
    
    /**
     * True if has "readOnlyRecommended" attribute
     */
    boolean isSetReadOnlyRecommended();
    
    /**
     * Sets the "readOnlyRecommended" attribute
     */
    void setReadOnlyRecommended(boolean readOnlyRecommended);
    
    /**
     * Sets (as xml) the "readOnlyRecommended" attribute
     */
    void xsetReadOnlyRecommended(org.apache.xmlbeans.XmlBoolean readOnlyRecommended);
    
    /**
     * Unsets the "readOnlyRecommended" attribute
     */
    void unsetReadOnlyRecommended();
    
    /**
     * Gets the "userName" attribute
     */
    java.lang.String getUserName();
    
    /**
     * Gets (as xml) the "userName" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUserName();
    
    /**
     * True if has "userName" attribute
     */
    boolean isSetUserName();
    
    /**
     * Sets the "userName" attribute
     */
    void setUserName(java.lang.String userName);
    
    /**
     * Sets (as xml) the "userName" attribute
     */
    void xsetUserName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring userName);
    
    /**
     * Unsets the "userName" attribute
     */
    void unsetUserName();
    
    /**
     * Gets the "reservationPassword" attribute
     */
    byte[] getReservationPassword();
    
    /**
     * Gets (as xml) the "reservationPassword" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetReservationPassword();
    
    /**
     * True if has "reservationPassword" attribute
     */
    boolean isSetReservationPassword();
    
    /**
     * Sets the "reservationPassword" attribute
     */
    void setReservationPassword(byte[] reservationPassword);
    
    /**
     * Sets (as xml) the "reservationPassword" attribute
     */
    void xsetReservationPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex reservationPassword);
    
    /**
     * Unsets the "reservationPassword" attribute
     */
    void unsetReservationPassword();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
