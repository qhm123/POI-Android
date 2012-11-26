/*
 * XML Type:  CT_ModifyVerifier
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ModifyVerifier(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTModifyVerifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier
{
    
    public CTModifyVerifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPE$0 = 
        new javax.xml.namespace.QName("", "cryptProviderType");
    private static final javax.xml.namespace.QName CRYPTALGORITHMCLASS$2 = 
        new javax.xml.namespace.QName("", "cryptAlgorithmClass");
    private static final javax.xml.namespace.QName CRYPTALGORITHMTYPE$4 = 
        new javax.xml.namespace.QName("", "cryptAlgorithmType");
    private static final javax.xml.namespace.QName CRYPTALGORITHMSID$6 = 
        new javax.xml.namespace.QName("", "cryptAlgorithmSid");
    private static final javax.xml.namespace.QName SPINCOUNT$8 = 
        new javax.xml.namespace.QName("", "spinCount");
    private static final javax.xml.namespace.QName SALTDATA$10 = 
        new javax.xml.namespace.QName("", "saltData");
    private static final javax.xml.namespace.QName HASHDATA$12 = 
        new javax.xml.namespace.QName("", "hashData");
    private static final javax.xml.namespace.QName CRYPTPROVIDER$14 = 
        new javax.xml.namespace.QName("", "cryptProvider");
    private static final javax.xml.namespace.QName ALGIDEXT$16 = 
        new javax.xml.namespace.QName("", "algIdExt");
    private static final javax.xml.namespace.QName ALGIDEXTSOURCE$18 = 
        new javax.xml.namespace.QName("", "algIdExtSource");
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPEEXT$20 = 
        new javax.xml.namespace.QName("", "cryptProviderTypeExt");
    private static final javax.xml.namespace.QName CRYPTPROVIDERTYPEEXTSOURCE$22 = 
        new javax.xml.namespace.QName("", "cryptProviderTypeExtSource");
    
    
    /**
     * Gets the "cryptProviderType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv.Enum getCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProviderType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv xgetCryptProviderType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv)get_store().find_attribute_user(CRYPTPROVIDERTYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "cryptProviderType" attribute
     */
    public void setCryptProviderType(org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv.Enum cryptProviderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPE$0);
            }
            target.setEnumValue(cryptProviderType);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderType" attribute
     */
    public void xsetCryptProviderType(org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv cryptProviderType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv)get_store().find_attribute_user(CRYPTPROVIDERTYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv)get_store().add_attribute_user(CRYPTPROVIDERTYPE$0);
            }
            target.set(cryptProviderType);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmClass" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass.Enum getCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMCLASS$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmClass" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass xgetCryptAlgorithmClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass)get_store().find_attribute_user(CRYPTALGORITHMCLASS$2);
            return target;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmClass" attribute
     */
    public void setCryptAlgorithmClass(org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass.Enum cryptAlgorithmClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMCLASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMCLASS$2);
            }
            target.setEnumValue(cryptAlgorithmClass);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmClass" attribute
     */
    public void xsetCryptAlgorithmClass(org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass cryptAlgorithmClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass)get_store().find_attribute_user(CRYPTALGORITHMCLASS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass)get_store().add_attribute_user(CRYPTALGORITHMCLASS$2);
            }
            target.set(cryptAlgorithmClass);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STAlgType.Enum getCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STAlgType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmType" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STAlgType xgetCryptAlgorithmType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STAlgType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgType)get_store().find_attribute_user(CRYPTALGORITHMTYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmType" attribute
     */
    public void setCryptAlgorithmType(org.openxmlformats.schemas.presentationml.x2006.main.STAlgType.Enum cryptAlgorithmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMTYPE$4);
            }
            target.setEnumValue(cryptAlgorithmType);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmType" attribute
     */
    public void xsetCryptAlgorithmType(org.openxmlformats.schemas.presentationml.x2006.main.STAlgType cryptAlgorithmType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STAlgType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgType)get_store().find_attribute_user(CRYPTALGORITHMTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STAlgType)get_store().add_attribute_user(CRYPTALGORITHMTYPE$4);
            }
            target.set(cryptAlgorithmType);
        }
    }
    
    /**
     * Gets the "cryptAlgorithmSid" attribute
     */
    public long getCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMSID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptAlgorithmSid" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCryptAlgorithmSid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CRYPTALGORITHMSID$6);
            return target;
        }
    }
    
    /**
     * Sets the "cryptAlgorithmSid" attribute
     */
    public void setCryptAlgorithmSid(long cryptAlgorithmSid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTALGORITHMSID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTALGORITHMSID$6);
            }
            target.setLongValue(cryptAlgorithmSid);
        }
    }
    
    /**
     * Sets (as xml) the "cryptAlgorithmSid" attribute
     */
    public void xsetCryptAlgorithmSid(org.apache.xmlbeans.XmlUnsignedInt cryptAlgorithmSid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CRYPTALGORITHMSID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CRYPTALGORITHMSID$6);
            }
            target.set(cryptAlgorithmSid);
        }
    }
    
    /**
     * Gets the "spinCount" attribute
     */
    public long getSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPINCOUNT$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "spinCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSpinCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SPINCOUNT$8);
            return target;
        }
    }
    
    /**
     * Sets the "spinCount" attribute
     */
    public void setSpinCount(long spinCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPINCOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPINCOUNT$8);
            }
            target.setLongValue(spinCount);
        }
    }
    
    /**
     * Sets (as xml) the "spinCount" attribute
     */
    public void xsetSpinCount(org.apache.xmlbeans.XmlUnsignedInt spinCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SPINCOUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SPINCOUNT$8);
            }
            target.set(spinCount);
        }
    }
    
    /**
     * Gets the "saltData" attribute
     */
    public java.lang.String getSaltData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALTDATA$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "saltData" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSaltData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SALTDATA$10);
            return target;
        }
    }
    
    /**
     * Sets the "saltData" attribute
     */
    public void setSaltData(java.lang.String saltData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALTDATA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SALTDATA$10);
            }
            target.setStringValue(saltData);
        }
    }
    
    /**
     * Sets (as xml) the "saltData" attribute
     */
    public void xsetSaltData(org.apache.xmlbeans.XmlString saltData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SALTDATA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SALTDATA$10);
            }
            target.set(saltData);
        }
    }
    
    /**
     * Gets the "hashData" attribute
     */
    public java.lang.String getHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASHDATA$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hashData" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHashData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HASHDATA$12);
            return target;
        }
    }
    
    /**
     * Sets the "hashData" attribute
     */
    public void setHashData(java.lang.String hashData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASHDATA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASHDATA$12);
            }
            target.setStringValue(hashData);
        }
    }
    
    /**
     * Sets (as xml) the "hashData" attribute
     */
    public void xsetHashData(org.apache.xmlbeans.XmlString hashData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HASHDATA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HASHDATA$12);
            }
            target.set(hashData);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDER$14);
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
    public org.apache.xmlbeans.XmlString xgetCryptProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRYPTPROVIDER$14);
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
            return get_store().find_attribute_user(CRYPTPROVIDER$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDER$14);
            }
            target.setStringValue(cryptProvider);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProvider" attribute
     */
    public void xsetCryptProvider(org.apache.xmlbeans.XmlString cryptProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRYPTPROVIDER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CRYPTPROVIDER$14);
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
            get_store().remove_attribute(CRYPTPROVIDER$14);
        }
    }
    
    /**
     * Gets the "algIdExt" attribute
     */
    public long getAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXT$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "algIdExt" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetAlgIdExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ALGIDEXT$16);
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
            return get_store().find_attribute_user(ALGIDEXT$16) != null;
        }
    }
    
    /**
     * Sets the "algIdExt" attribute
     */
    public void setAlgIdExt(long algIdExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGIDEXT$16);
            }
            target.setLongValue(algIdExt);
        }
    }
    
    /**
     * Sets (as xml) the "algIdExt" attribute
     */
    public void xsetAlgIdExt(org.apache.xmlbeans.XmlUnsignedInt algIdExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ALGIDEXT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ALGIDEXT$16);
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
            get_store().remove_attribute(ALGIDEXT$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXTSOURCE$18);
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
    public org.apache.xmlbeans.XmlString xgetAlgIdExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGIDEXTSOURCE$18);
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
            return get_store().find_attribute_user(ALGIDEXTSOURCE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGIDEXTSOURCE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGIDEXTSOURCE$18);
            }
            target.setStringValue(algIdExtSource);
        }
    }
    
    /**
     * Sets (as xml) the "algIdExtSource" attribute
     */
    public void xsetAlgIdExtSource(org.apache.xmlbeans.XmlString algIdExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGIDEXTSOURCE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALGIDEXTSOURCE$18);
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
            get_store().remove_attribute(ALGIDEXTSOURCE$18);
        }
    }
    
    /**
     * Gets the "cryptProviderTypeExt" attribute
     */
    public long getCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$20);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cryptProviderTypeExt" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCryptProviderTypeExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$20);
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
            return get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$20) != null;
        }
    }
    
    /**
     * Sets the "cryptProviderTypeExt" attribute
     */
    public void setCryptProviderTypeExt(long cryptProviderTypeExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$20);
            }
            target.setLongValue(cryptProviderTypeExt);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderTypeExt" attribute
     */
    public void xsetCryptProviderTypeExt(org.apache.xmlbeans.XmlUnsignedInt cryptProviderTypeExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$20);
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
            get_store().remove_attribute(CRYPTPROVIDERTYPEEXT$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
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
    public org.apache.xmlbeans.XmlString xgetCryptProviderTypeExtSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
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
            return get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
            }
            target.setStringValue(cryptProviderTypeExtSource);
        }
    }
    
    /**
     * Sets (as xml) the "cryptProviderTypeExtSource" attribute
     */
    public void xsetCryptProviderTypeExtSource(org.apache.xmlbeans.XmlString cryptProviderTypeExtSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$22);
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
            get_store().remove_attribute(CRYPTPROVIDERTYPEEXTSOURCE$22);
        }
    }
}
