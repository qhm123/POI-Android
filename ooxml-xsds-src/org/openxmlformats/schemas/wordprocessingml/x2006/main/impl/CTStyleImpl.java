/*
 * XML Type:  CT_Style
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Style(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle
{
    
    public CTStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName ALIASES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "aliases");
    private static final javax.xml.namespace.QName BASEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "basedOn");
    private static final javax.xml.namespace.QName NEXT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "next");
    private static final javax.xml.namespace.QName LINK$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "link");
    private static final javax.xml.namespace.QName AUTOREDEFINE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoRedefine");
    private static final javax.xml.namespace.QName HIDDEN$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hidden");
    private static final javax.xml.namespace.QName UIPRIORITY$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiPriority");
    private static final javax.xml.namespace.QName SEMIHIDDEN$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "semiHidden");
    private static final javax.xml.namespace.QName UNHIDEWHENUSED$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "unhideWhenUsed");
    private static final javax.xml.namespace.QName QFORMAT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "qFormat");
    private static final javax.xml.namespace.QName LOCKED$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "locked");
    private static final javax.xml.namespace.QName PERSONAL$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personal");
    private static final javax.xml.namespace.QName PERSONALCOMPOSE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personalCompose");
    private static final javax.xml.namespace.QName PERSONALREPLY$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "personalReply");
    private static final javax.xml.namespace.QName RSID$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsid");
    private static final javax.xml.namespace.QName PPR$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    private static final javax.xml.namespace.QName RPR$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName TBLPR$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPr");
    private static final javax.xml.namespace.QName TRPR$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPr");
    private static final javax.xml.namespace.QName TCPR$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPr");
    private static final javax.xml.namespace.QName TBLSTYLEPR$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStylePr");
    private static final javax.xml.namespace.QName TYPE$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName STYLEID$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleId");
    private static final javax.xml.namespace.QName DEFAULT$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
    private static final javax.xml.namespace.QName CUSTOMSTYLE$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customStyle");
    
    
    /**
     * Gets the "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "aliases" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAliases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALIASES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aliases" element
     */
    public boolean isSetAliases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIASES$2) != 0;
        }
    }
    
    /**
     * Sets the "aliases" element
     */
    public void setAliases(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString aliases)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALIASES$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ALIASES$2);
            }
            target.set(aliases);
        }
    }
    
    /**
     * Appends and returns a new empty "aliases" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAliases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ALIASES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "aliases" element
     */
    public void unsetAliases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIASES$2, 0);
        }
    }
    
    /**
     * Gets the "basedOn" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getBasedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(BASEDON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "basedOn" element
     */
    public boolean isSetBasedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEDON$4) != 0;
        }
    }
    
    /**
     * Sets the "basedOn" element
     */
    public void setBasedOn(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString basedOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(BASEDON$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(BASEDON$4);
            }
            target.set(basedOn);
        }
    }
    
    /**
     * Appends and returns a new empty "basedOn" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewBasedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(BASEDON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "basedOn" element
     */
    public void unsetBasedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEDON$4, 0);
        }
    }
    
    /**
     * Gets the "next" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "next" element
     */
    public boolean isSetNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "next" element
     */
    public void setNext(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString next)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NEXT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NEXT$6);
            }
            target.set(next);
        }
    }
    
    /**
     * Appends and returns a new empty "next" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NEXT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "next" element
     */
    public void unsetNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXT$6, 0);
        }
    }
    
    /**
     * Gets the "link" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LINK$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "link" element
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$8) != 0;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(LINK$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(LINK$8);
            }
            target.set(link);
        }
    }
    
    /**
     * Appends and returns a new empty "link" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(LINK$8);
            return target;
        }
    }
    
    /**
     * Unsets the "link" element
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$8, 0);
        }
    }
    
    /**
     * Gets the "autoRedefine" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getAutoRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOREDEFINE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoRedefine" element
     */
    public boolean isSetAutoRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOREDEFINE$10) != 0;
        }
    }
    
    /**
     * Sets the "autoRedefine" element
     */
    public void setAutoRedefine(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff autoRedefine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(AUTOREDEFINE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOREDEFINE$10);
            }
            target.set(autoRedefine);
        }
    }
    
    /**
     * Appends and returns a new empty "autoRedefine" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewAutoRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(AUTOREDEFINE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "autoRedefine" element
     */
    public void unsetAutoRedefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOREDEFINE$10, 0);
        }
    }
    
    /**
     * Gets the "hidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDDEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" element
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDDEN$12) != 0;
        }
    }
    
    /**
     * Sets the "hidden" element
     */
    public void setHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDDEN$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDDEN$12);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Appends and returns a new empty "hidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDDEN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "hidden" element
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDDEN$12, 0);
        }
    }
    
    /**
     * Gets the "uiPriority" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(UIPRIORITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uiPriority" element
     */
    public boolean isSetUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UIPRIORITY$14) != 0;
        }
    }
    
    /**
     * Sets the "uiPriority" element
     */
    public void setUiPriority(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber uiPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(UIPRIORITY$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(UIPRIORITY$14);
            }
            target.set(uiPriority);
        }
    }
    
    /**
     * Appends and returns a new empty "uiPriority" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(UIPRIORITY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "uiPriority" element
     */
    public void unsetUiPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UIPRIORITY$14, 0);
        }
    }
    
    /**
     * Gets the "semiHidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SEMIHIDDEN$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "semiHidden" element
     */
    public boolean isSetSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEMIHIDDEN$16) != 0;
        }
    }
    
    /**
     * Sets the "semiHidden" element
     */
    public void setSemiHidden(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff semiHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SEMIHIDDEN$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SEMIHIDDEN$16);
            }
            target.set(semiHidden);
        }
    }
    
    /**
     * Appends and returns a new empty "semiHidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SEMIHIDDEN$16);
            return target;
        }
    }
    
    /**
     * Unsets the "semiHidden" element
     */
    public void unsetSemiHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEMIHIDDEN$16, 0);
        }
    }
    
    /**
     * Gets the "unhideWhenUsed" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UNHIDEWHENUSED$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "unhideWhenUsed" element
     */
    public boolean isSetUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNHIDEWHENUSED$18) != 0;
        }
    }
    
    /**
     * Sets the "unhideWhenUsed" element
     */
    public void setUnhideWhenUsed(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff unhideWhenUsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(UNHIDEWHENUSED$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UNHIDEWHENUSED$18);
            }
            target.set(unhideWhenUsed);
        }
    }
    
    /**
     * Appends and returns a new empty "unhideWhenUsed" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(UNHIDEWHENUSED$18);
            return target;
        }
    }
    
    /**
     * Unsets the "unhideWhenUsed" element
     */
    public void unsetUnhideWhenUsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNHIDEWHENUSED$18, 0);
        }
    }
    
    /**
     * Gets the "qFormat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(QFORMAT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "qFormat" element
     */
    public boolean isSetQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QFORMAT$20) != 0;
        }
    }
    
    /**
     * Sets the "qFormat" element
     */
    public void setQFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff qFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(QFORMAT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(QFORMAT$20);
            }
            target.set(qFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "qFormat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(QFORMAT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "qFormat" element
     */
    public void unsetQFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QFORMAT$20, 0);
        }
    }
    
    /**
     * Gets the "locked" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LOCKED$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locked" element
     */
    public boolean isSetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCKED$22) != 0;
        }
    }
    
    /**
     * Sets the "locked" element
     */
    public void setLocked(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LOCKED$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LOCKED$22);
            }
            target.set(locked);
        }
    }
    
    /**
     * Appends and returns a new empty "locked" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LOCKED$22);
            return target;
        }
    }
    
    /**
     * Unsets the "locked" element
     */
    public void unsetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCKED$22, 0);
        }
    }
    
    /**
     * Gets the "personal" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONAL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "personal" element
     */
    public boolean isSetPersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONAL$24) != 0;
        }
    }
    
    /**
     * Sets the "personal" element
     */
    public void setPersonal(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff personal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONAL$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONAL$24);
            }
            target.set(personal);
        }
    }
    
    /**
     * Appends and returns a new empty "personal" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONAL$24);
            return target;
        }
    }
    
    /**
     * Unsets the "personal" element
     */
    public void unsetPersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONAL$24, 0);
        }
    }
    
    /**
     * Gets the "personalCompose" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPersonalCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONALCOMPOSE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "personalCompose" element
     */
    public boolean isSetPersonalCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONALCOMPOSE$26) != 0;
        }
    }
    
    /**
     * Sets the "personalCompose" element
     */
    public void setPersonalCompose(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff personalCompose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONALCOMPOSE$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONALCOMPOSE$26);
            }
            target.set(personalCompose);
        }
    }
    
    /**
     * Appends and returns a new empty "personalCompose" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPersonalCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONALCOMPOSE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "personalCompose" element
     */
    public void unsetPersonalCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONALCOMPOSE$26, 0);
        }
    }
    
    /**
     * Gets the "personalReply" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getPersonalReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONALREPLY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "personalReply" element
     */
    public boolean isSetPersonalReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONALREPLY$28) != 0;
        }
    }
    
    /**
     * Sets the "personalReply" element
     */
    public void setPersonalReply(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff personalReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(PERSONALREPLY$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONALREPLY$28);
            }
            target.set(personalReply);
        }
    }
    
    /**
     * Appends and returns a new empty "personalReply" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewPersonalReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(PERSONALREPLY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "personalReply" element
     */
    public void unsetPersonalReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONALREPLY$28, 0);
        }
    }
    
    /**
     * Gets the "rsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getRsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSID$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rsid" element
     */
    public boolean isSetRsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSID$30) != 0;
        }
    }
    
    /**
     * Sets the "rsid" element
     */
    public void setRsid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber rsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(RSID$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(RSID$30);
            }
            target.set(rsid);
        }
    }
    
    /**
     * Appends and returns a new empty "rsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewRsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(RSID$30);
            return target;
        }
    }
    
    /**
     * Unsets the "rsid" element
     */
    public void unsetRsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSID$30, 0);
        }
    }
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPr" element
     */
    public boolean isSetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPR$32) != 0;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$32);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$32);
            return target;
        }
    }
    
    /**
     * Unsets the "pPr" element
     */
    public void unsetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPR$32, 0);
        }
    }
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$34) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$34);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$34);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$34, 0);
        }
    }
    
    /**
     * Gets the "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase getTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblPr" element
     */
    public boolean isSetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPR$36) != 0;
        }
    }
    
    /**
     * Sets the "tblPr" element
     */
    public void setTblPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase tblPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$36);
            }
            target.set(tblPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase addNewTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$36);
            return target;
        }
    }
    
    /**
     * Unsets the "tblPr" element
     */
    public void unsetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPR$36, 0);
        }
    }
    
    /**
     * Gets the "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr getTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().find_element_user(TRPR$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trPr" element
     */
    public boolean isSetTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRPR$38) != 0;
        }
    }
    
    /**
     * Sets the "trPr" element
     */
    public void setTrPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr trPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().find_element_user(TRPR$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().add_element_user(TRPR$38);
            }
            target.set(trPr);
        }
    }
    
    /**
     * Appends and returns a new empty "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr addNewTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().add_element_user(TRPR$38);
            return target;
        }
    }
    
    /**
     * Unsets the "trPr" element
     */
    public void unsetTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRPR$38, 0);
        }
    }
    
    /**
     * Gets the "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr getTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().find_element_user(TCPR$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcPr" element
     */
    public boolean isSetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCPR$40) != 0;
        }
    }
    
    /**
     * Sets the "tcPr" element
     */
    public void setTcPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr tcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().find_element_user(TCPR$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().add_element_user(TCPR$40);
            }
            target.set(tcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr addNewTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().add_element_user(TCPR$40);
            return target;
        }
    }
    
    /**
     * Unsets the "tcPr" element
     */
    public void unsetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCPR$40, 0);
        }
    }
    
    /**
     * Gets a List of "tblStylePr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr> getTblStylePrList()
    {
        final class TblStylePrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr get(int i)
                { return CTStyleImpl.this.getTblStylePrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr old = CTStyleImpl.this.getTblStylePrArray(i);
                CTStyleImpl.this.setTblStylePrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr o)
                { CTStyleImpl.this.insertNewTblStylePr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr old = CTStyleImpl.this.getTblStylePrArray(i);
                CTStyleImpl.this.removeTblStylePr(i);
                return old;
            }
            
            public int size()
                { return CTStyleImpl.this.sizeOfTblStylePrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TblStylePrList();
        }
    }
    
    /**
     * Gets array of all "tblStylePr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr[] getTblStylePrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TBLSTYLEPR$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tblStylePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr getTblStylePrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr)get_store().find_element_user(TBLSTYLEPR$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tblStylePr" element
     */
    public int sizeOfTblStylePrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLSTYLEPR$42);
        }
    }
    
    /**
     * Sets array of all "tblStylePr" element
     */
    public void setTblStylePrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr[] tblStylePrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tblStylePrArray, TBLSTYLEPR$42);
        }
    }
    
    /**
     * Sets ith "tblStylePr" element
     */
    public void setTblStylePrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr tblStylePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr)get_store().find_element_user(TBLSTYLEPR$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tblStylePr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tblStylePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr insertNewTblStylePr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr)get_store().insert_element_user(TBLSTYLEPR$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tblStylePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr addNewTblStylePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr)get_store().add_element_user(TBLSTYLEPR$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "tblStylePr" element
     */
    public void removeTblStylePr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLSTYLEPR$42, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$44);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType)get_store().find_attribute_user(TYPE$44);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$44) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$44);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType)get_store().find_attribute_user(TYPE$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STStyleType)get_store().add_attribute_user(TYPE$44);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$44);
        }
    }
    
    /**
     * Gets the "styleId" attribute
     */
    public java.lang.String getStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEID$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleId" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(STYLEID$46);
            return target;
        }
    }
    
    /**
     * True if has "styleId" attribute
     */
    public boolean isSetStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLEID$46) != null;
        }
    }
    
    /**
     * Sets the "styleId" attribute
     */
    public void setStyleId(java.lang.String styleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEID$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLEID$46);
            }
            target.setStringValue(styleId);
        }
    }
    
    /**
     * Sets (as xml) the "styleId" attribute
     */
    public void xsetStyleId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString styleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(STYLEID$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(STYLEID$46);
            }
            target.set(styleId);
        }
    }
    
    /**
     * Unsets the "styleId" attribute
     */
    public void unsetStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLEID$46);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$48);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFAULT$48);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$48) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$48);
            }
            target.setEnumValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(DEFAULT$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(DEFAULT$48);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$48);
        }
    }
    
    /**
     * Gets the "customStyle" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getCustomStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMSTYLE$50);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "customStyle" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetCustomStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CUSTOMSTYLE$50);
            return target;
        }
    }
    
    /**
     * True if has "customStyle" attribute
     */
    public boolean isSetCustomStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMSTYLE$50) != null;
        }
    }
    
    /**
     * Sets the "customStyle" attribute
     */
    public void setCustomStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum customStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMSTYLE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMSTYLE$50);
            }
            target.setEnumValue(customStyle);
        }
    }
    
    /**
     * Sets (as xml) the "customStyle" attribute
     */
    public void xsetCustomStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff customStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CUSTOMSTYLE$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(CUSTOMSTYLE$50);
            }
            target.set(customStyle);
        }
    }
    
    /**
     * Unsets the "customStyle" attribute
     */
    public void unsetCustomStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMSTYLE$50);
        }
    }
}
