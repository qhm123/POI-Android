/*
 * XML Type:  CT_Font
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Font(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFont
{
    
    public CTFontImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "altName");
    private static final javax.xml.namespace.QName PANOSE1$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "panose1");
    private static final javax.xml.namespace.QName CHARSET$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "charset");
    private static final javax.xml.namespace.QName FAMILY$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "family");
    private static final javax.xml.namespace.QName NOTTRUETYPE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "notTrueType");
    private static final javax.xml.namespace.QName PITCH$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pitch");
    private static final javax.xml.namespace.QName SIG$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sig");
    private static final javax.xml.namespace.QName EMBEDREGULAR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedRegular");
    private static final javax.xml.namespace.QName EMBEDBOLD$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedBold");
    private static final javax.xml.namespace.QName EMBEDITALIC$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedItalic");
    private static final javax.xml.namespace.QName EMBEDBOLDITALIC$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedBoldItalic");
    private static final javax.xml.namespace.QName NAME$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    
    
    /**
     * Gets the "altName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "altName" element
     */
    public boolean isSetAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "altName" element
     */
    public void setAltName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString altName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALTNAME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ALTNAME$0);
            }
            target.set(altName);
        }
    }
    
    /**
     * Appends and returns a new empty "altName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ALTNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "altName" element
     */
    public void unsetAltName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTNAME$0, 0);
        }
    }
    
    /**
     * Gets the "panose1" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose getPanose1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose)get_store().find_element_user(PANOSE1$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "panose1" element
     */
    public boolean isSetPanose1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PANOSE1$2) != 0;
        }
    }
    
    /**
     * Sets the "panose1" element
     */
    public void setPanose1(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose panose1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose)get_store().find_element_user(PANOSE1$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose)get_store().add_element_user(PANOSE1$2);
            }
            target.set(panose1);
        }
    }
    
    /**
     * Appends and returns a new empty "panose1" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose addNewPanose1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPanose)get_store().add_element_user(PANOSE1$2);
            return target;
        }
    }
    
    /**
     * Unsets the "panose1" element
     */
    public void unsetPanose1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PANOSE1$2, 0);
        }
    }
    
    /**
     * Gets the "charset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber getCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber)get_store().find_element_user(CHARSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "charset" element
     */
    public boolean isSetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARSET$4) != 0;
        }
    }
    
    /**
     * Sets the "charset" element
     */
    public void setCharset(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber)get_store().find_element_user(CHARSET$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber)get_store().add_element_user(CHARSET$4);
            }
            target.set(charset);
        }
    }
    
    /**
     * Appends and returns a new empty "charset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber addNewCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUcharHexNumber)get_store().add_element_user(CHARSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "charset" element
     */
    public void unsetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARSET$4, 0);
        }
    }
    
    /**
     * Gets the "family" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily getFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily)get_store().find_element_user(FAMILY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "family" element
     */
    public boolean isSetFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$6) != 0;
        }
    }
    
    /**
     * Sets the "family" element
     */
    public void setFamily(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily)get_store().find_element_user(FAMILY$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily)get_store().add_element_user(FAMILY$6);
            }
            target.set(family);
        }
    }
    
    /**
     * Appends and returns a new empty "family" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily addNewFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontFamily)get_store().add_element_user(FAMILY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "family" element
     */
    public void unsetFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$6, 0);
        }
    }
    
    /**
     * Gets the "notTrueType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNotTrueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOTTRUETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notTrueType" element
     */
    public boolean isSetNotTrueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTTRUETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "notTrueType" element
     */
    public void setNotTrueType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff notTrueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOTTRUETYPE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOTTRUETYPE$8);
            }
            target.set(notTrueType);
        }
    }
    
    /**
     * Appends and returns a new empty "notTrueType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNotTrueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOTTRUETYPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "notTrueType" element
     */
    public void unsetNotTrueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTTRUETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "pitch" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch getPitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch)get_store().find_element_user(PITCH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pitch" element
     */
    public boolean isSetPitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PITCH$10) != 0;
        }
    }
    
    /**
     * Sets the "pitch" element
     */
    public void setPitch(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch pitch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch)get_store().find_element_user(PITCH$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch)get_store().add_element_user(PITCH$10);
            }
            target.set(pitch);
        }
    }
    
    /**
     * Appends and returns a new empty "pitch" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch addNewPitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPitch)get_store().add_element_user(PITCH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pitch" element
     */
    public void unsetPitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PITCH$10, 0);
        }
    }
    
    /**
     * Gets the "sig" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig getSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig)get_store().find_element_user(SIG$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sig" element
     */
    public boolean isSetSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIG$12) != 0;
        }
    }
    
    /**
     * Sets the "sig" element
     */
    public void setSig(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig sig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig)get_store().find_element_user(SIG$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig)get_store().add_element_user(SIG$12);
            }
            target.set(sig);
        }
    }
    
    /**
     * Appends and returns a new empty "sig" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig addNewSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontSig)get_store().add_element_user(SIG$12);
            return target;
        }
    }
    
    /**
     * Unsets the "sig" element
     */
    public void unsetSig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIG$12, 0);
        }
    }
    
    /**
     * Gets the "embedRegular" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDREGULAR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedRegular" element
     */
    public boolean isSetEmbedRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDREGULAR$14) != 0;
        }
    }
    
    /**
     * Sets the "embedRegular" element
     */
    public void setEmbedRegular(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedRegular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDREGULAR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDREGULAR$14);
            }
            target.set(embedRegular);
        }
    }
    
    /**
     * Appends and returns a new empty "embedRegular" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDREGULAR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "embedRegular" element
     */
    public void unsetEmbedRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDREGULAR$14, 0);
        }
    }
    
    /**
     * Gets the "embedBold" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDBOLD$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedBold" element
     */
    public boolean isSetEmbedBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDBOLD$16) != 0;
        }
    }
    
    /**
     * Sets the "embedBold" element
     */
    public void setEmbedBold(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedBold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDBOLD$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDBOLD$16);
            }
            target.set(embedBold);
        }
    }
    
    /**
     * Appends and returns a new empty "embedBold" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDBOLD$16);
            return target;
        }
    }
    
    /**
     * Unsets the "embedBold" element
     */
    public void unsetEmbedBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDBOLD$16, 0);
        }
    }
    
    /**
     * Gets the "embedItalic" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDITALIC$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedItalic" element
     */
    public boolean isSetEmbedItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDITALIC$18) != 0;
        }
    }
    
    /**
     * Sets the "embedItalic" element
     */
    public void setEmbedItalic(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedItalic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDITALIC$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDITALIC$18);
            }
            target.set(embedItalic);
        }
    }
    
    /**
     * Appends and returns a new empty "embedItalic" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDITALIC$18);
            return target;
        }
    }
    
    /**
     * Unsets the "embedItalic" element
     */
    public void unsetEmbedItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDITALIC$18, 0);
        }
    }
    
    /**
     * Gets the "embedBoldItalic" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel getEmbedBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDBOLDITALIC$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embedBoldItalic" element
     */
    public boolean isSetEmbedBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDBOLDITALIC$20) != 0;
        }
    }
    
    /**
     * Sets the "embedBoldItalic" element
     */
    public void setEmbedBoldItalic(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel embedBoldItalic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().find_element_user(EMBEDBOLDITALIC$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDBOLDITALIC$20);
            }
            target.set(embedBoldItalic);
        }
    }
    
    /**
     * Appends and returns a new empty "embedBoldItalic" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel addNewEmbedBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel)get_store().add_element_user(EMBEDBOLDITALIC$20);
            return target;
        }
    }
    
    /**
     * Unsets the "embedBoldItalic" element
     */
    public void unsetEmbedBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDBOLDITALIC$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$22);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(NAME$22);
            }
            target.set(name);
        }
    }
}
