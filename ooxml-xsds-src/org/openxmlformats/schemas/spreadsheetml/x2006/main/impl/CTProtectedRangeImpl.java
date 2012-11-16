/*
 * XML Type:  CT_ProtectedRange
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ProtectedRange(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTProtectedRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRange
{
    
    public CTProtectedRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSWORD$0 = 
        new javax.xml.namespace.QName("", "password");
    private static final javax.xml.namespace.QName SQREF$2 = 
        new javax.xml.namespace.QName("", "sqref");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SECURITYDESCRIPTOR$6 = 
        new javax.xml.namespace.QName("", "securityDescriptor");
    
    
    /**
     * Gets the "password" attribute
     */
    public byte[] getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(PASSWORD$0);
            return target;
        }
    }
    
    /**
     * True if has "password" attribute
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORD$0) != null;
        }
    }
    
    /**
     * Sets the "password" attribute
     */
    public void setPassword(byte[] password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORD$0);
            }
            target.setByteArrayValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" attribute
     */
    public void xsetPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(PASSWORD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().add_attribute_user(PASSWORD$0);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" attribute
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORD$0);
        }
    }
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "sqref" attribute
     */
    public void setSqref(java.util.List sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$2);
            }
            target.setListValue(sqref);
        }
    }
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    public void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$2);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "securityDescriptor" attribute
     */
    public java.lang.String getSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYDESCRIPTOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "securityDescriptor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYDESCRIPTOR$6);
            return target;
        }
    }
    
    /**
     * True if has "securityDescriptor" attribute
     */
    public boolean isSetSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SECURITYDESCRIPTOR$6) != null;
        }
    }
    
    /**
     * Sets the "securityDescriptor" attribute
     */
    public void setSecurityDescriptor(java.lang.String securityDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYDESCRIPTOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECURITYDESCRIPTOR$6);
            }
            target.setStringValue(securityDescriptor);
        }
    }
    
    /**
     * Sets (as xml) the "securityDescriptor" attribute
     */
    public void xsetSecurityDescriptor(org.apache.xmlbeans.XmlString securityDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYDESCRIPTOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECURITYDESCRIPTOR$6);
            }
            target.set(securityDescriptor);
        }
    }
    
    /**
     * Unsets the "securityDescriptor" attribute
     */
    public void unsetSecurityDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SECURITYDESCRIPTOR$6);
        }
    }
}
