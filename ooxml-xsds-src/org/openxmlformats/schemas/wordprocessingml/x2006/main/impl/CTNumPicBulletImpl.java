/*
 * XML Type:  CT_NumPicBullet
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_NumPicBullet(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumPicBulletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet
{
    
    public CTNumPicBulletImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pict");
    private static final javax.xml.namespace.QName NUMPICBULLETID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numPicBulletId");
    
    
    /**
     * Gets the "pict" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture getPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().find_element_user(PICT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pict" element
     */
    public void setPict(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture pict)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().find_element_user(PICT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().add_element_user(PICT$0);
            }
            target.set(pict);
        }
    }
    
    /**
     * Appends and returns a new empty "pict" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture addNewPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().add_element_user(PICT$0);
            return target;
        }
    }
    
    /**
     * Gets the "numPicBulletId" attribute
     */
    public java.math.BigInteger getNumPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMPICBULLETID$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numPicBulletId" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetNumPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUMPICBULLETID$2);
            return target;
        }
    }
    
    /**
     * Sets the "numPicBulletId" attribute
     */
    public void setNumPicBulletId(java.math.BigInteger numPicBulletId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMPICBULLETID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMPICBULLETID$2);
            }
            target.setBigIntegerValue(numPicBulletId);
        }
    }
    
    /**
     * Sets (as xml) the "numPicBulletId" attribute
     */
    public void xsetNumPicBulletId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber numPicBulletId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(NUMPICBULLETID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(NUMPICBULLETID$2);
            }
            target.set(numPicBulletId);
        }
    }
}
