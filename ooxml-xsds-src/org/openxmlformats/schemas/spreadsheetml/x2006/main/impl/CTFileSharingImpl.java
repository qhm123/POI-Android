/*
 * XML Type:  CT_FileSharing
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FileSharing(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFileSharingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing
{
    
    public CTFileSharingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName READONLYRECOMMENDED$0 = 
        new javax.xml.namespace.QName("", "readOnlyRecommended");
    private static final javax.xml.namespace.QName USERNAME$2 = 
        new javax.xml.namespace.QName("", "userName");
    private static final javax.xml.namespace.QName RESERVATIONPASSWORD$4 = 
        new javax.xml.namespace.QName("", "reservationPassword");
    
    
    /**
     * Gets the "readOnlyRecommended" attribute
     */
    public boolean getReadOnlyRecommended()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLYRECOMMENDED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(READONLYRECOMMENDED$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "readOnlyRecommended" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReadOnlyRecommended()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLYRECOMMENDED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(READONLYRECOMMENDED$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "readOnlyRecommended" attribute
     */
    public boolean isSetReadOnlyRecommended()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(READONLYRECOMMENDED$0) != null;
        }
    }
    
    /**
     * Sets the "readOnlyRecommended" attribute
     */
    public void setReadOnlyRecommended(boolean readOnlyRecommended)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLYRECOMMENDED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLYRECOMMENDED$0);
            }
            target.setBooleanValue(readOnlyRecommended);
        }
    }
    
    /**
     * Sets (as xml) the "readOnlyRecommended" attribute
     */
    public void xsetReadOnlyRecommended(org.apache.xmlbeans.XmlBoolean readOnlyRecommended)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(READONLYRECOMMENDED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(READONLYRECOMMENDED$0);
            }
            target.set(readOnlyRecommended);
        }
    }
    
    /**
     * Unsets the "readOnlyRecommended" attribute
     */
    public void unsetReadOnlyRecommended()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(READONLYRECOMMENDED$0);
        }
    }
    
    /**
     * Gets the "userName" attribute
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USERNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "userName" attribute
     */
    public boolean isSetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERNAME$2) != null;
        }
    }
    
    /**
     * Sets the "userName" attribute
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERNAME$2);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" attribute
     */
    public void xsetUserName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USERNAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(USERNAME$2);
            }
            target.set(userName);
        }
    }
    
    /**
     * Unsets the "userName" attribute
     */
    public void unsetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERNAME$2);
        }
    }
    
    /**
     * Gets the "reservationPassword" attribute
     */
    public byte[] getReservationPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESERVATIONPASSWORD$4);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationPassword" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetReservationPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(RESERVATIONPASSWORD$4);
            return target;
        }
    }
    
    /**
     * True if has "reservationPassword" attribute
     */
    public boolean isSetReservationPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESERVATIONPASSWORD$4) != null;
        }
    }
    
    /**
     * Sets the "reservationPassword" attribute
     */
    public void setReservationPassword(byte[] reservationPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESERVATIONPASSWORD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESERVATIONPASSWORD$4);
            }
            target.setByteArrayValue(reservationPassword);
        }
    }
    
    /**
     * Sets (as xml) the "reservationPassword" attribute
     */
    public void xsetReservationPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex reservationPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(RESERVATIONPASSWORD$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().add_attribute_user(RESERVATIONPASSWORD$4);
            }
            target.set(reservationPassword);
        }
    }
    
    /**
     * Unsets the "reservationPassword" attribute
     */
    public void unsetReservationPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESERVATIONPASSWORD$4);
        }
    }
}
