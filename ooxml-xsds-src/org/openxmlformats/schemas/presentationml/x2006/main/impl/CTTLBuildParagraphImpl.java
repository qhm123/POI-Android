/*
 * XML Type:  CT_TLBuildParagraph
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLBuildParagraph(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLBuildParagraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildParagraph
{
    
    public CTTLBuildParagraphImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TMPLLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tmplLst");
    private static final javax.xml.namespace.QName SPID$2 = 
        new javax.xml.namespace.QName("", "spid");
    private static final javax.xml.namespace.QName GRPID$4 = 
        new javax.xml.namespace.QName("", "grpId");
    private static final javax.xml.namespace.QName UIEXPAND$6 = 
        new javax.xml.namespace.QName("", "uiExpand");
    private static final javax.xml.namespace.QName BUILD$8 = 
        new javax.xml.namespace.QName("", "build");
    private static final javax.xml.namespace.QName BLDLVL$10 = 
        new javax.xml.namespace.QName("", "bldLvl");
    private static final javax.xml.namespace.QName ANIMBG$12 = 
        new javax.xml.namespace.QName("", "animBg");
    private static final javax.xml.namespace.QName AUTOUPDATEANIMBG$14 = 
        new javax.xml.namespace.QName("", "autoUpdateAnimBg");
    private static final javax.xml.namespace.QName REV$16 = 
        new javax.xml.namespace.QName("", "rev");
    private static final javax.xml.namespace.QName ADVAUTO$18 = 
        new javax.xml.namespace.QName("", "advAuto");
    
    
    /**
     * Gets the "tmplLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList getTmplLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList)get_store().find_element_user(TMPLLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tmplLst" element
     */
    public boolean isSetTmplLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPLLST$0) != 0;
        }
    }
    
    /**
     * Sets the "tmplLst" element
     */
    public void setTmplLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList tmplLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList)get_store().find_element_user(TMPLLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList)get_store().add_element_user(TMPLLST$0);
            }
            target.set(tmplLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tmplLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList addNewTmplLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTemplateList)get_store().add_element_user(TMPLLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tmplLst" element
     */
    public void unsetTmplLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPLLST$0, 0);
        }
    }
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$2);
            return target;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$2);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$2);
            }
            target.set(spid);
        }
    }
    
    /**
     * Gets the "grpId" attribute
     */
    public long getGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "grpId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$4);
            return target;
        }
    }
    
    /**
     * Sets the "grpId" attribute
     */
    public void setGrpId(long grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRPID$4);
            }
            target.setLongValue(grpId);
        }
    }
    
    /**
     * Sets (as xml) the "grpId" attribute
     */
    public void xsetGrpId(org.apache.xmlbeans.XmlUnsignedInt grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(GRPID$4);
            }
            target.set(grpId);
        }
    }
    
    /**
     * Gets the "uiExpand" attribute
     */
    public boolean getUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UIEXPAND$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "uiExpand" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UIEXPAND$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "uiExpand" attribute
     */
    public boolean isSetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UIEXPAND$6) != null;
        }
    }
    
    /**
     * Sets the "uiExpand" attribute
     */
    public void setUiExpand(boolean uiExpand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UIEXPAND$6);
            }
            target.setBooleanValue(uiExpand);
        }
    }
    
    /**
     * Sets (as xml) the "uiExpand" attribute
     */
    public void xsetUiExpand(org.apache.xmlbeans.XmlBoolean uiExpand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UIEXPAND$6);
            }
            target.set(uiExpand);
        }
    }
    
    /**
     * Unsets the "uiExpand" attribute
     */
    public void unsetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UIEXPAND$6);
        }
    }
    
    /**
     * Gets the "build" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType.Enum getBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BUILD$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "build" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType xgetBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType)get_store().find_attribute_user(BUILD$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType)get_default_attribute_value(BUILD$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "build" attribute
     */
    public boolean isSetBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BUILD$8) != null;
        }
    }
    
    /**
     * Sets the "build" attribute
     */
    public void setBuild(org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType.Enum build)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILD$8);
            }
            target.setEnumValue(build);
        }
    }
    
    /**
     * Sets (as xml) the "build" attribute
     */
    public void xsetBuild(org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType build)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType)get_store().find_attribute_user(BUILD$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLParaBuildType)get_store().add_attribute_user(BUILD$8);
            }
            target.set(build);
        }
    }
    
    /**
     * Unsets the "build" attribute
     */
    public void unsetBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BUILD$8);
        }
    }
    
    /**
     * Gets the "bldLvl" attribute
     */
    public long getBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDLVL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLDLVL$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "bldLvl" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BLDLVL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(BLDLVL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "bldLvl" attribute
     */
    public boolean isSetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLDLVL$10) != null;
        }
    }
    
    /**
     * Sets the "bldLvl" attribute
     */
    public void setBldLvl(long bldLvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDLVL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLDLVL$10);
            }
            target.setLongValue(bldLvl);
        }
    }
    
    /**
     * Sets (as xml) the "bldLvl" attribute
     */
    public void xsetBldLvl(org.apache.xmlbeans.XmlUnsignedInt bldLvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BLDLVL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BLDLVL$10);
            }
            target.set(bldLvl);
        }
    }
    
    /**
     * Unsets the "bldLvl" attribute
     */
    public void unsetBldLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLDLVL$10);
        }
    }
    
    /**
     * Gets the "animBg" attribute
     */
    public boolean getAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANIMBG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ANIMBG$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "animBg" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANIMBG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ANIMBG$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "animBg" attribute
     */
    public boolean isSetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANIMBG$12) != null;
        }
    }
    
    /**
     * Sets the "animBg" attribute
     */
    public void setAnimBg(boolean animBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANIMBG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANIMBG$12);
            }
            target.setBooleanValue(animBg);
        }
    }
    
    /**
     * Sets (as xml) the "animBg" attribute
     */
    public void xsetAnimBg(org.apache.xmlbeans.XmlBoolean animBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANIMBG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ANIMBG$12);
            }
            target.set(animBg);
        }
    }
    
    /**
     * Unsets the "animBg" attribute
     */
    public void unsetAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANIMBG$12);
        }
    }
    
    /**
     * Gets the "autoUpdateAnimBg" attribute
     */
    public boolean getAutoUpdateAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOUPDATEANIMBG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOUPDATEANIMBG$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoUpdateAnimBg" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoUpdateAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOUPDATEANIMBG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOUPDATEANIMBG$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoUpdateAnimBg" attribute
     */
    public boolean isSetAutoUpdateAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOUPDATEANIMBG$14) != null;
        }
    }
    
    /**
     * Sets the "autoUpdateAnimBg" attribute
     */
    public void setAutoUpdateAnimBg(boolean autoUpdateAnimBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOUPDATEANIMBG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOUPDATEANIMBG$14);
            }
            target.setBooleanValue(autoUpdateAnimBg);
        }
    }
    
    /**
     * Sets (as xml) the "autoUpdateAnimBg" attribute
     */
    public void xsetAutoUpdateAnimBg(org.apache.xmlbeans.XmlBoolean autoUpdateAnimBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOUPDATEANIMBG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOUPDATEANIMBG$14);
            }
            target.set(autoUpdateAnimBg);
        }
    }
    
    /**
     * Unsets the "autoUpdateAnimBg" attribute
     */
    public void unsetAutoUpdateAnimBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOUPDATEANIMBG$14);
        }
    }
    
    /**
     * Gets the "rev" attribute
     */
    public boolean getRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REV$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rev" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REV$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REV$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "rev" attribute
     */
    public boolean isSetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REV$16) != null;
        }
    }
    
    /**
     * Sets the "rev" attribute
     */
    public void setRev(boolean rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REV$16);
            }
            target.setBooleanValue(rev);
        }
    }
    
    /**
     * Sets (as xml) the "rev" attribute
     */
    public void xsetRev(org.apache.xmlbeans.XmlBoolean rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REV$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REV$16);
            }
            target.set(rev);
        }
    }
    
    /**
     * Unsets the "rev" attribute
     */
    public void unsetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REV$16);
        }
    }
    
    /**
     * Gets the "advAuto" attribute
     */
    public java.lang.Object getAdvAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVAUTO$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADVAUTO$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "advAuto" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLTime xgetAdvAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(ADVAUTO$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_default_attribute_value(ADVAUTO$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "advAuto" attribute
     */
    public boolean isSetAdvAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADVAUTO$18) != null;
        }
    }
    
    /**
     * Sets the "advAuto" attribute
     */
    public void setAdvAuto(java.lang.Object advAuto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADVAUTO$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADVAUTO$18);
            }
            target.setObjectValue(advAuto);
        }
    }
    
    /**
     * Sets (as xml) the "advAuto" attribute
     */
    public void xsetAdvAuto(org.openxmlformats.schemas.presentationml.x2006.main.STTLTime advAuto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLTime target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().find_attribute_user(ADVAUTO$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLTime)get_store().add_attribute_user(ADVAUTO$18);
            }
            target.set(advAuto);
        }
    }
    
    /**
     * Unsets the "advAuto" attribute
     */
    public void unsetAdvAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADVAUTO$18);
        }
    }
}
