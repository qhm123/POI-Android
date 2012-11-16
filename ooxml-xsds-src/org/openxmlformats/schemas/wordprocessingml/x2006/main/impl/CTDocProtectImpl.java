/*
 * XML Type:  CT_DocProtect
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocProtect(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocProtectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect
{
    
    public CTDocProtectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDIT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "edit");
    private static final javax.xml.namespace.QName FORMATTING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formatting");
    private static final javax.xml.namespace.QName ENFORCEMENT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "enforcement");
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderType");
    private static final javax.xml.namespace.QName CRYPTALGORITHMCLASS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmClass");
    private static final javax.xml.namespace.QName CRYPTALGORITHMTYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmType");
    private static final javax.xml.namespace.QName CRYPTALGORITHMSID$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmSid");
    private static final javax.xml.namespace.QName CRYPTSPINCOUNT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptSpinCount");
    private static final javax.xml.namespace.QName CRYPTPROVIDER$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProvider");
    private static final javax.xml.namespace.QName ALGIDEXT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "algIdExt");
    private static final javax.xml.namespace.QName ALGIDEXTSOURCE$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "algIdExtSource");
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPEEXT$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderTypeExt");
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPEEXTSOURCE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderTypeExtSource");
    private static final javax.xml.namespace.QName HASH$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hash");
    private static final javax.xml.namespace.QName SALT$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "salt");
    
    
    /**
     * Gets the "edit" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect.Enum getEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "edit" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect xgetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect)get_store().find_attribute_user(EDIT$0);
            return target;
        }
    }
    
    /**
     * True if has "edit" attribute
     */
    public boolean isSetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDIT$0) != null;
        }
    }
    
    /**
     * Sets the "edit" attribute
     */
    public void setEdit(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect.Enum edit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDIT$0);
            }
            target.setEnumValue(edit);
        }
    }
    
    /**
     * Sets (as xml) the "edit" attribute
     */
    public void xsetEdit(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect edit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect)get_store().find_attribute_user(EDIT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect)get_store().add_attribute_user(EDIT$0);
            }
            target.set(edit);
        }
    }
    
    /**
     * Unsets the "edit" attribute
     */
    public void unsetEdit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDIT$0);
        }
    }
    
    /**
     * Gets the "formatting" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTING$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatting" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FORMATTING$2);
            return target;
        }
    }
    
    /**
     * True if has "formatting" attribute
     */
    public boolean isSetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATTING$2) != null;
        }
    }
    
    /**
     * Sets the "formatting" attribute
     */
    public void setFormatting(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum formatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTING$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATTING$2);
            }
            target.setEnumValue(formatting);
        }
    }
    
    /**
     * Sets (as xml) the "formatting" attribute
     */
    public void xsetFormatting(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff formatting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(FORMATTING$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(FORMATTING$2);
            }
            target.set(formatting);
        }
    }
    
    /**
     * Unsets the "formatting" attribute
     */
    public void unsetFormatting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATTING$2);
        }
    }
    
    /**
     * Gets the "enforcement" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getEnforcement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENFORCEMENT$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "enforcement" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetEnforcement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ENFORCEMENT$4);
            return target;
        }
    }
    
    /**
     * True if has "enforcement" attribute
     */
    public boolean isSetEnforcement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENFORCEMENT$4) != null;
        }
    }
    
    /**
     * Sets the "enforcement" attribute
     */
    public void setEnforcement(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum enforcement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENFORCEMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENFORCEMENT$4);
            }
            target.setEnumValue(enforcement);
        }
    }
    
    /**
     * Sets (as xml) the "enforcement" attribute
     */
    public void xsetEnforcement(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff enforcement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ENFORCEMENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(ENFORCEMENT$4);
            }
            target.set(enforcement);
        }
    }
    
    /**
     * Unsets the "enforcement" attribute
     */
    public void unsetEnforcement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENFORCEMENT$4);
        }
    }
    
    /**
     * Gets the "cryptProviderType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv.Enum getCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProviderType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv xgetCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv)get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "cryptProviderType" attribute
     */
    public boolean isSetCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTPROVIDERTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "cryptProviderType" attribute
     */
    public void setCryptProviderType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv.Enum cryptProviderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPE$6);
            }
            target.setEnumValue(cryptProviderType);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderType" attribute
     */
    public void xsetCryptProviderType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv cryptProviderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv)get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv)get_store().add_attribute_user(CRYPTPROVIDERTYPE$6);
            }
            target.set(cryptProviderType);
        }
    }
    
    /**
     * Unsets the "cryptProviderType" attribute
     */
    public void unsetCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTPROVIDERTYPE$6);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmClass" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass.Enum getCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmClass" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass xgetCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass)get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
            return target;
        }
    }
    
    /**
     * True if has "cryptAlgorithmClass" attribute
     */
    public boolean isSetCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTALGORITHMCLASS$8) != null;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmClass" attribute
     */
    public void setCryptAlgorithmClass(org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass.Enum cryptAlgorithmClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMCLASS$8);
            }
            target.setEnumValue(cryptAlgorithmClass);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmClass" attribute
     */
    public void xsetCryptAlgorithmClass(org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass cryptAlgorithmClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass)get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass)get_store().add_attribute_user(CRYPTALGORITHMCLASS$8);
            }
            target.set(cryptAlgorithmClass);
        }
    }
    
    /**
     * Unsets the "cryptAlgorithmClass" attribute
     */
    public void unsetCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTALGORITHMCLASS$8);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType.Enum getCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmType" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType xgetCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType)get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "cryptAlgorithmType" attribute
     */
    public boolean isSetCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTALGORITHMTYPE$10) != null;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmType" attribute
     */
    public void setCryptAlgorithmType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType.Enum cryptAlgorithmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMTYPE$10);
            }
            target.setEnumValue(cryptAlgorithmType);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmType" attribute
     */
    public void xsetCryptAlgorithmType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType cryptAlgorithmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType)get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType)get_store().add_attribute_user(CRYPTALGORITHMTYPE$10);
            }
            target.set(cryptAlgorithmType);
        }
    }
    
    /**
     * Unsets the "cryptAlgorithmType" attribute
     */
    public void unsetCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTALGORITHMTYPE$10);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmSid" attribute
     */
    public java.math.BigInteger getCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMSID$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmSid" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CRYPTALGORITHMSID$12);
            return target;
        }
    }
    
    /**
     * True if has "cryptAlgorithmSid" attribute
     */
    public boolean isSetCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTALGORITHMSID$12) != null;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmSid" attribute
     */
    public void setCryptAlgorithmSid(java.math.BigInteger cryptAlgorithmSid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMSID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMSID$12);
            }
            target.setBigIntegerValue(cryptAlgorithmSid);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmSid" attribute
     */
    public void xsetCryptAlgorithmSid(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber cryptAlgorithmSid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CRYPTALGORITHMSID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(CRYPTALGORITHMSID$12);
            }
            target.set(cryptAlgorithmSid);
        }
    }
    
    /**
     * Unsets the "cryptAlgorithmSid" attribute
     */
    public void unsetCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTALGORITHMSID$12);
        }
    }
    
    /**
     * Gets the "cryptSpinCount" attribute
     */
    public java.math.BigInteger getCryptSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTSPINCOUNT$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptSpinCount" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCryptSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CRYPTSPINCOUNT$14);
            return target;
        }
    }
    
    /**
     * True if has "cryptSpinCount" attribute
     */
    public boolean isSetCryptSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTSPINCOUNT$14) != null;
        }
    }
    
    /**
     * Sets the "cryptSpinCount" attribute
     */
    public void setCryptSpinCount(java.math.BigInteger cryptSpinCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTSPINCOUNT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTSPINCOUNT$14);
            }
            target.setBigIntegerValue(cryptSpinCount);
        }
    }
    
    /**
     * Sets (as xml) the "cryptSpinCount" attribute
     */
    public void xsetCryptSpinCount(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber cryptSpinCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CRYPTSPINCOUNT$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(CRYPTSPINCOUNT$14);
            }
            target.set(cryptSpinCount);
        }
    }
    
    /**
     * Unsets the "cryptSpinCount" attribute
     */
    public void unsetCryptSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTSPINCOUNT$14);
        }
    }
    
    /**
     * Gets the "cryptProvider" attribute
     */
    public java.lang.String getCryptProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDER$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProvider" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetCryptProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CRYPTPROVIDER$16);
            return target;
        }
    }
    
    /**
     * True if has "cryptProvider" attribute
     */
    public boolean isSetCryptProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTPROVIDER$16) != null;
        }
    }
    
    /**
     * Sets the "cryptProvider" attribute
     */
    public void setCryptProvider(java.lang.String cryptProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDER$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDER$16);
            }
            target.setStringValue(cryptProvider);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProvider" attribute
     */
    public void xsetCryptProvider(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString cryptProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CRYPTPROVIDER$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(CRYPTPROVIDER$16);
            }
            target.set(cryptProvider);
        }
    }
    
    /**
     * Unsets the "cryptProvider" attribute
     */
    public void unsetCryptProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTPROVIDER$16);
        }
    }
    
    /**
     * Gets the "algIdExt" attribute
     */
    public byte[] getAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXT$18);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "algIdExt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(ALGIDEXT$18);
            return target;
        }
    }
    
    /**
     * True if has "algIdExt" attribute
     */
    public boolean isSetAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGIDEXT$18) != null;
        }
    }
    
    /**
     * Sets the "algIdExt" attribute
     */
    public void setAlgIdExt(byte[] algIdExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGIDEXT$18);
            }
            target.setByteArrayValue(algIdExt);
        }
    }
    
    /**
     * Sets (as xml) the "algIdExt" attribute
     */
    public void xsetAlgIdExt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber algIdExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(ALGIDEXT$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(ALGIDEXT$18);
            }
            target.set(algIdExt);
        }
    }
    
    /**
     * Unsets the "algIdExt" attribute
     */
    public void unsetAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGIDEXT$18);
        }
    }
    
    /**
     * Gets the "algIdExtSource" attribute
     */
    public java.lang.String getAlgIdExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXTSOURCE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "algIdExtSource" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetAlgIdExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ALGIDEXTSOURCE$20);
            return target;
        }
    }
    
    /**
     * True if has "algIdExtSource" attribute
     */
    public boolean isSetAlgIdExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGIDEXTSOURCE$20) != null;
        }
    }
    
    /**
     * Sets the "algIdExtSource" attribute
     */
    public void setAlgIdExtSource(java.lang.String algIdExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXTSOURCE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGIDEXTSOURCE$20);
            }
            target.setStringValue(algIdExtSource);
        }
    }
    
    /**
     * Sets (as xml) the "algIdExtSource" attribute
     */
    public void xsetAlgIdExtSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString algIdExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ALGIDEXTSOURCE$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(ALGIDEXTSOURCE$20);
            }
            target.set(algIdExtSource);
        }
    }
    
    /**
     * Unsets the "algIdExtSource" attribute
     */
    public void unsetAlgIdExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGIDEXTSOURCE$20);
        }
    }
    
    /**
     * Gets the "cryptProviderTypeExt" attribute
     */
    public byte[] getCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProviderTypeExt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            return target;
        }
    }
    
    /**
     * True if has "cryptProviderTypeExt" attribute
     */
    public boolean isSetCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22) != null;
        }
    }
    
    /**
     * Sets the "cryptProviderTypeExt" attribute
     */
    public void setCryptProviderTypeExt(byte[] cryptProviderTypeExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            }
            target.setByteArrayValue(cryptProviderTypeExt);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderTypeExt" attribute
     */
    public void xsetCryptProviderTypeExt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber cryptProviderTypeExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$22);
            }
            target.set(cryptProviderTypeExt);
        }
    }
    
    /**
     * Unsets the "cryptProviderTypeExt" attribute
     */
    public void unsetCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTPROVIDERTYPEEXT$22);
        }
    }
    
    /**
     * Gets the "cryptProviderTypeExtSource" attribute
     */
    public java.lang.String getCryptProviderTypeExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProviderTypeExtSource" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetCryptProviderTypeExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            return target;
        }
    }
    
    /**
     * True if has "cryptProviderTypeExtSource" attribute
     */
    public boolean isSetCryptProviderTypeExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24) != null;
        }
    }
    
    /**
     * Sets the "cryptProviderTypeExtSource" attribute
     */
    public void setCryptProviderTypeExtSource(java.lang.String cryptProviderTypeExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            }
            target.setStringValue(cryptProviderTypeExtSource);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderTypeExtSource" attribute
     */
    public void xsetCryptProviderTypeExtSource(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString cryptProviderTypeExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
            }
            target.set(cryptProviderTypeExtSource);
        }
    }
    
    /**
     * Unsets the "cryptProviderTypeExtSource" attribute
     */
    public void unsetCryptProviderTypeExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CRYPTPROVIDERTYPEEXTSOURCE$24);
        }
    }
    
    /**
     * Gets the "hash" attribute
     */
    public byte[] getHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASH$26);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "hash" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(HASH$26);
            return target;
        }
    }
    
    /**
     * True if has "hash" attribute
     */
    public boolean isSetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HASH$26) != null;
        }
    }
    
    /**
     * Sets the "hash" attribute
     */
    public void setHash(byte[] hash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASH$26);
            }
            target.setByteArrayValue(hash);
        }
    }
    
    /**
     * Sets (as xml) the "hash" attribute
     */
    public void xsetHash(org.apache.xmlbeans.XmlBase64Binary hash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(HASH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(HASH$26);
            }
            target.set(hash);
        }
    }
    
    /**
     * Unsets the "hash" attribute
     */
    public void unsetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HASH$26);
        }
    }
    
    /**
     * Gets the "salt" attribute
     */
    public byte[] getSalt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALT$28);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "salt" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSalt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(SALT$28);
            return target;
        }
    }
    
    /**
     * True if has "salt" attribute
     */
    public boolean isSetSalt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SALT$28) != null;
        }
    }
    
    /**
     * Sets the "salt" attribute
     */
    public void setSalt(byte[] salt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SALT$28);
            }
            target.setByteArrayValue(salt);
        }
    }
    
    /**
     * Sets (as xml) the "salt" attribute
     */
    public void xsetSalt(org.apache.xmlbeans.XmlBase64Binary salt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(SALT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(SALT$28);
            }
            target.set(salt);
        }
    }
    
    /**
     * Unsets the "salt" attribute
     */
    public void unsetSalt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SALT$28);
        }
    }
}
