/*
 * XML Type:  CT_WritingStyle
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_WritingStyle(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTWritingStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle
{
    
    public CTWritingStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lang");
    private static final javax.xml.namespace.QName VENDORID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vendorID");
    private static final javax.xml.namespace.QName DLLVERSION$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dllVersion");
    private static final javax.xml.namespace.QName NLCHECK$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "nlCheck");
    private static final javax.xml.namespace.QName CHECKSTYLE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checkStyle");
    private static final javax.xml.namespace.QName APPNAME$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "appName");
    
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.Object getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(LANG$0);
            return target;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.Object lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
            }
            target.setObjectValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().find_attribute_user(LANG$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang)get_store().add_attribute_user(LANG$0);
            }
            target.set(lang);
        }
    }
    
    /**
     * Gets the "vendorID" attribute
     */
    public java.math.BigInteger getVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDORID$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "vendorID" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetVendorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(VENDORID$2);
            return target;
        }
    }
    
    /**
     * Sets the "vendorID" attribute
     */
    public void setVendorID(java.math.BigInteger vendorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDORID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VENDORID$2);
            }
            target.setBigIntegerValue(vendorID);
        }
    }
    
    /**
     * Sets (as xml) the "vendorID" attribute
     */
    public void xsetVendorID(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber vendorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(VENDORID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(VENDORID$2);
            }
            target.set(vendorID);
        }
    }
    
    /**
     * Gets the "dllVersion" attribute
     */
    public java.math.BigInteger getDllVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DLLVERSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dllVersion" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetDllVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(DLLVERSION$4);
            return target;
        }
    }
    
    /**
     * Sets the "dllVersion" attribute
     */
    public void setDllVersion(java.math.BigInteger dllVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DLLVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DLLVERSION$4);
            }
            target.setBigIntegerValue(dllVersion);
        }
    }
    
    /**
     * Sets (as xml) the "dllVersion" attribute
     */
    public void xsetDllVersion(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber dllVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(DLLVERSION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(DLLVERSION$4);
            }
            target.set(dllVersion);
        }
    }
    
    /**
     * Gets the "nlCheck" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getNlCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NLCHECK$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nlCheck" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetNlCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(NLCHECK$6);
            return target;
        }
    }
    
    /**
     * True if has "nlCheck" attribute
     */
    public boolean isSetNlCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NLCHECK$6) != null;
        }
    }
    
    /**
     * Sets the "nlCheck" attribute
     */
    public void setNlCheck(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum nlCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NLCHECK$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NLCHECK$6);
            }
            target.setEnumValue(nlCheck);
        }
    }
    
    /**
     * Sets (as xml) the "nlCheck" attribute
     */
    public void xsetNlCheck(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff nlCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(NLCHECK$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(NLCHECK$6);
            }
            target.set(nlCheck);
        }
    }
    
    /**
     * Unsets the "nlCheck" attribute
     */
    public void unsetNlCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NLCHECK$6);
        }
    }
    
    /**
     * Gets the "checkStyle" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getCheckStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSTYLE$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "checkStyle" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetCheckStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CHECKSTYLE$8);
            return target;
        }
    }
    
    /**
     * Sets the "checkStyle" attribute
     */
    public void setCheckStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum checkStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSTYLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKSTYLE$8);
            }
            target.setEnumValue(checkStyle);
        }
    }
    
    /**
     * Sets (as xml) the "checkStyle" attribute
     */
    public void xsetCheckStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff checkStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CHECKSTYLE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(CHECKSTYLE$8);
            }
            target.set(checkStyle);
        }
    }
    
    /**
     * Gets the "appName" attribute
     */
    public java.lang.String getAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPNAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "appName" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAppName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(APPNAME$10);
            return target;
        }
    }
    
    /**
     * Sets the "appName" attribute
     */
    public void setAppName(java.lang.String appName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPNAME$10);
            }
            target.setStringValue(appName);
        }
    }
    
    /**
     * Sets (as xml) the "appName" attribute
     */
    public void xsetAppName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString appName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(APPNAME$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(APPNAME$10);
            }
            target.set(appName);
        }
    }
}
