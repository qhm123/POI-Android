/*
 * XML Type:  CT_SignatureLine
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTSignatureLine
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_SignatureLine(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTSignatureLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTSignatureLine
{
    
    public CTSignatureLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName ISSIGNATURELINE$2 = 
        new javax.xml.namespace.QName("", "issignatureline");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName PROVID$6 = 
        new javax.xml.namespace.QName("", "provid");
    private static final javax.xml.namespace.QName SIGNINGINSTRUCTIONSSET$8 = 
        new javax.xml.namespace.QName("", "signinginstructionsset");
    private static final javax.xml.namespace.QName ALLOWCOMMENTS$10 = 
        new javax.xml.namespace.QName("", "allowcomments");
    private static final javax.xml.namespace.QName SHOWSIGNDATE$12 = 
        new javax.xml.namespace.QName("", "showsigndate");
    private static final javax.xml.namespace.QName SUGGESTEDSIGNER$14 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "suggestedsigner");
    private static final javax.xml.namespace.QName SUGGESTEDSIGNER2$16 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "suggestedsigner2");
    private static final javax.xml.namespace.QName SUGGESTEDSIGNEREMAIL$18 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "suggestedsigneremail");
    private static final javax.xml.namespace.QName SIGNINGINSTRUCTIONS$20 = 
        new javax.xml.namespace.QName("", "signinginstructions");
    private static final javax.xml.namespace.QName ADDLXML$22 = 
        new javax.xml.namespace.QName("", "addlxml");
    private static final javax.xml.namespace.QName SIGPROVURL$24 = 
        new javax.xml.namespace.QName("", "sigprovurl");
    
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$0) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$0);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$0);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$0);
        }
    }
    
    /**
     * Gets the "issignatureline" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getIssignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSIGNATURELINE$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "issignatureline" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetIssignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ISSIGNATURELINE$2);
            return target;
        }
    }
    
    /**
     * True if has "issignatureline" attribute
     */
    public boolean isSetIssignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSIGNATURELINE$2) != null;
        }
    }
    
    /**
     * Sets the "issignatureline" attribute
     */
    public void setIssignatureline(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum issignatureline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSIGNATURELINE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSIGNATURELINE$2);
            }
            target.setEnumValue(issignatureline);
        }
    }
    
    /**
     * Sets (as xml) the "issignatureline" attribute
     */
    public void xsetIssignatureline(schemasMicrosoftComOfficeOffice.STTrueFalse issignatureline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ISSIGNATURELINE$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ISSIGNATURELINE$2);
            }
            target.set(issignatureline);
        }
    }
    
    /**
     * Unsets the "issignatureline" attribute
     */
    public void unsetIssignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSIGNATURELINE$2);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public schemasMicrosoftComOfficeOffice.STGuid xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STGuid target = null;
            target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(schemasMicrosoftComOfficeOffice.STGuid id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STGuid target = null;
            target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "provid" attribute
     */
    public java.lang.String getProvid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "provid" attribute
     */
    public schemasMicrosoftComOfficeOffice.STGuid xgetProvid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STGuid target = null;
            target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().find_attribute_user(PROVID$6);
            return target;
        }
    }
    
    /**
     * True if has "provid" attribute
     */
    public boolean isSetProvid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROVID$6) != null;
        }
    }
    
    /**
     * Sets the "provid" attribute
     */
    public void setProvid(java.lang.String provid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVID$6);
            }
            target.setStringValue(provid);
        }
    }
    
    /**
     * Sets (as xml) the "provid" attribute
     */
    public void xsetProvid(schemasMicrosoftComOfficeOffice.STGuid provid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STGuid target = null;
            target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().find_attribute_user(PROVID$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STGuid)get_store().add_attribute_user(PROVID$6);
            }
            target.set(provid);
        }
    }
    
    /**
     * Unsets the "provid" attribute
     */
    public void unsetProvid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROVID$6);
        }
    }
    
    /**
     * Gets the "signinginstructionsset" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getSigninginstructionsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "signinginstructionsset" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetSigninginstructionsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            return target;
        }
    }
    
    /**
     * True if has "signinginstructionsset" attribute
     */
    public boolean isSetSigninginstructionsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIGNINGINSTRUCTIONSSET$8) != null;
        }
    }
    
    /**
     * Sets the "signinginstructionsset" attribute
     */
    public void setSigninginstructionsset(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum signinginstructionsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            }
            target.setEnumValue(signinginstructionsset);
        }
    }
    
    /**
     * Sets (as xml) the "signinginstructionsset" attribute
     */
    public void xsetSigninginstructionsset(schemasMicrosoftComOfficeOffice.STTrueFalse signinginstructionsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SIGNINGINSTRUCTIONSSET$8);
            }
            target.set(signinginstructionsset);
        }
    }
    
    /**
     * Unsets the "signinginstructionsset" attribute
     */
    public void unsetSigninginstructionsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIGNINGINSTRUCTIONSSET$8);
        }
    }
    
    /**
     * Gets the "allowcomments" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowcomments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWCOMMENTS$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowcomments" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowcomments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWCOMMENTS$10);
            return target;
        }
    }
    
    /**
     * True if has "allowcomments" attribute
     */
    public boolean isSetAllowcomments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWCOMMENTS$10) != null;
        }
    }
    
    /**
     * Sets the "allowcomments" attribute
     */
    public void setAllowcomments(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowcomments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWCOMMENTS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWCOMMENTS$10);
            }
            target.setEnumValue(allowcomments);
        }
    }
    
    /**
     * Sets (as xml) the "allowcomments" attribute
     */
    public void xsetAllowcomments(schemasMicrosoftComOfficeOffice.STTrueFalse allowcomments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWCOMMENTS$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWCOMMENTS$10);
            }
            target.set(allowcomments);
        }
    }
    
    /**
     * Unsets the "allowcomments" attribute
     */
    public void unsetAllowcomments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWCOMMENTS$10);
        }
    }
    
    /**
     * Gets the "showsigndate" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getShowsigndate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSIGNDATE$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "showsigndate" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetShowsigndate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SHOWSIGNDATE$12);
            return target;
        }
    }
    
    /**
     * True if has "showsigndate" attribute
     */
    public boolean isSetShowsigndate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSIGNDATE$12) != null;
        }
    }
    
    /**
     * Sets the "showsigndate" attribute
     */
    public void setShowsigndate(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum showsigndate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSIGNDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSIGNDATE$12);
            }
            target.setEnumValue(showsigndate);
        }
    }
    
    /**
     * Sets (as xml) the "showsigndate" attribute
     */
    public void xsetShowsigndate(schemasMicrosoftComOfficeOffice.STTrueFalse showsigndate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SHOWSIGNDATE$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SHOWSIGNDATE$12);
            }
            target.set(showsigndate);
        }
    }
    
    /**
     * Unsets the "showsigndate" attribute
     */
    public void unsetShowsigndate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSIGNDATE$12);
        }
    }
    
    /**
     * Gets the "suggestedsigner" attribute
     */
    public java.lang.String getSuggestedsigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNER$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suggestedsigner" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSuggestedsigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNER$14);
            return target;
        }
    }
    
    /**
     * True if has "suggestedsigner" attribute
     */
    public boolean isSetSuggestedsigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUGGESTEDSIGNER$14) != null;
        }
    }
    
    /**
     * Sets the "suggestedsigner" attribute
     */
    public void setSuggestedsigner(java.lang.String suggestedsigner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUGGESTEDSIGNER$14);
            }
            target.setStringValue(suggestedsigner);
        }
    }
    
    /**
     * Sets (as xml) the "suggestedsigner" attribute
     */
    public void xsetSuggestedsigner(org.apache.xmlbeans.XmlString suggestedsigner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUGGESTEDSIGNER$14);
            }
            target.set(suggestedsigner);
        }
    }
    
    /**
     * Unsets the "suggestedsigner" attribute
     */
    public void unsetSuggestedsigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUGGESTEDSIGNER$14);
        }
    }
    
    /**
     * Gets the "suggestedsigner2" attribute
     */
    public java.lang.String getSuggestedsigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNER2$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suggestedsigner2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSuggestedsigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNER2$16);
            return target;
        }
    }
    
    /**
     * True if has "suggestedsigner2" attribute
     */
    public boolean isSetSuggestedsigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUGGESTEDSIGNER2$16) != null;
        }
    }
    
    /**
     * Sets the "suggestedsigner2" attribute
     */
    public void setSuggestedsigner2(java.lang.String suggestedsigner2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNER2$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUGGESTEDSIGNER2$16);
            }
            target.setStringValue(suggestedsigner2);
        }
    }
    
    /**
     * Sets (as xml) the "suggestedsigner2" attribute
     */
    public void xsetSuggestedsigner2(org.apache.xmlbeans.XmlString suggestedsigner2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNER2$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUGGESTEDSIGNER2$16);
            }
            target.set(suggestedsigner2);
        }
    }
    
    /**
     * Unsets the "suggestedsigner2" attribute
     */
    public void unsetSuggestedsigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUGGESTEDSIGNER2$16);
        }
    }
    
    /**
     * Gets the "suggestedsigneremail" attribute
     */
    public java.lang.String getSuggestedsigneremail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suggestedsigneremail" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSuggestedsigneremail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            return target;
        }
    }
    
    /**
     * True if has "suggestedsigneremail" attribute
     */
    public boolean isSetSuggestedsigneremail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUGGESTEDSIGNEREMAIL$18) != null;
        }
    }
    
    /**
     * Sets the "suggestedsigneremail" attribute
     */
    public void setSuggestedsigneremail(java.lang.String suggestedsigneremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            }
            target.setStringValue(suggestedsigneremail);
        }
    }
    
    /**
     * Sets (as xml) the "suggestedsigneremail" attribute
     */
    public void xsetSuggestedsigneremail(org.apache.xmlbeans.XmlString suggestedsigneremail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUGGESTEDSIGNEREMAIL$18);
            }
            target.set(suggestedsigneremail);
        }
    }
    
    /**
     * Unsets the "suggestedsigneremail" attribute
     */
    public void unsetSuggestedsigneremail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUGGESTEDSIGNEREMAIL$18);
        }
    }
    
    /**
     * Gets the "signinginstructions" attribute
     */
    public java.lang.String getSigninginstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNINGINSTRUCTIONS$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "signinginstructions" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSigninginstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNINGINSTRUCTIONS$20);
            return target;
        }
    }
    
    /**
     * True if has "signinginstructions" attribute
     */
    public boolean isSetSigninginstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIGNINGINSTRUCTIONS$20) != null;
        }
    }
    
    /**
     * Sets the "signinginstructions" attribute
     */
    public void setSigninginstructions(java.lang.String signinginstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNINGINSTRUCTIONS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNINGINSTRUCTIONS$20);
            }
            target.setStringValue(signinginstructions);
        }
    }
    
    /**
     * Sets (as xml) the "signinginstructions" attribute
     */
    public void xsetSigninginstructions(org.apache.xmlbeans.XmlString signinginstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNINGINSTRUCTIONS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIGNINGINSTRUCTIONS$20);
            }
            target.set(signinginstructions);
        }
    }
    
    /**
     * Unsets the "signinginstructions" attribute
     */
    public void unsetSigninginstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIGNINGINSTRUCTIONS$20);
        }
    }
    
    /**
     * Gets the "addlxml" attribute
     */
    public java.lang.String getAddlxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDLXML$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addlxml" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAddlxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDLXML$22);
            return target;
        }
    }
    
    /**
     * True if has "addlxml" attribute
     */
    public boolean isSetAddlxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDLXML$22) != null;
        }
    }
    
    /**
     * Sets the "addlxml" attribute
     */
    public void setAddlxml(java.lang.String addlxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDLXML$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDLXML$22);
            }
            target.setStringValue(addlxml);
        }
    }
    
    /**
     * Sets (as xml) the "addlxml" attribute
     */
    public void xsetAddlxml(org.apache.xmlbeans.XmlString addlxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDLXML$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDLXML$22);
            }
            target.set(addlxml);
        }
    }
    
    /**
     * Unsets the "addlxml" attribute
     */
    public void unsetAddlxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDLXML$22);
        }
    }
    
    /**
     * Gets the "sigprovurl" attribute
     */
    public java.lang.String getSigprovurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGPROVURL$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sigprovurl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSigprovurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGPROVURL$24);
            return target;
        }
    }
    
    /**
     * True if has "sigprovurl" attribute
     */
    public boolean isSetSigprovurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIGPROVURL$24) != null;
        }
    }
    
    /**
     * Sets the "sigprovurl" attribute
     */
    public void setSigprovurl(java.lang.String sigprovurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGPROVURL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGPROVURL$24);
            }
            target.setStringValue(sigprovurl);
        }
    }
    
    /**
     * Sets (as xml) the "sigprovurl" attribute
     */
    public void xsetSigprovurl(org.apache.xmlbeans.XmlString sigprovurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGPROVURL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIGPROVURL$24);
            }
            target.set(sigprovurl);
        }
    }
    
    /**
     * Unsets the "sigprovurl" attribute
     */
    public void unsetSigprovurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIGPROVURL$24);
        }
    }
}
