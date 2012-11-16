/*
 * XML Type:  CT_Presentation
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_Presentation(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTPresentationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation
{
    
    public CTPresentationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLDMASTERIDLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMasterIdLst");
    private static final javax.xml.namespace.QName NOTESMASTERIDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMasterIdLst");
    private static final javax.xml.namespace.QName HANDOUTMASTERIDLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "handoutMasterIdLst");
    private static final javax.xml.namespace.QName SLDIDLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldIdLst");
    private static final javax.xml.namespace.QName SLDSZ$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldSz");
    private static final javax.xml.namespace.QName NOTESSZ$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesSz");
    private static final javax.xml.namespace.QName SMARTTAGS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "smartTags");
    private static final javax.xml.namespace.QName EMBEDDEDFONTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "embeddedFontLst");
    private static final javax.xml.namespace.QName CUSTSHOWLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custShowLst");
    private static final javax.xml.namespace.QName PHOTOALBUM$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "photoAlbum");
    private static final javax.xml.namespace.QName CUSTDATALST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
    private static final javax.xml.namespace.QName KINSOKU$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "kinsoku");
    private static final javax.xml.namespace.QName DEFAULTTEXTSTYLE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "defaultTextStyle");
    private static final javax.xml.namespace.QName MODIFYVERIFIER$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "modifyVerifier");
    private static final javax.xml.namespace.QName EXTLST$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SERVERZOOM$30 = 
        new javax.xml.namespace.QName("", "serverZoom");
    private static final javax.xml.namespace.QName FIRSTSLIDENUM$32 = 
        new javax.xml.namespace.QName("", "firstSlideNum");
    private static final javax.xml.namespace.QName SHOWSPECIALPLSONTITLESLD$34 = 
        new javax.xml.namespace.QName("", "showSpecialPlsOnTitleSld");
    private static final javax.xml.namespace.QName RTL$36 = 
        new javax.xml.namespace.QName("", "rtl");
    private static final javax.xml.namespace.QName REMOVEPERSONALINFOONSAVE$38 = 
        new javax.xml.namespace.QName("", "removePersonalInfoOnSave");
    private static final javax.xml.namespace.QName COMPATMODE$40 = 
        new javax.xml.namespace.QName("", "compatMode");
    private static final javax.xml.namespace.QName STRICTFIRSTANDLASTCHARS$42 = 
        new javax.xml.namespace.QName("", "strictFirstAndLastChars");
    private static final javax.xml.namespace.QName EMBEDTRUETYPEFONTS$44 = 
        new javax.xml.namespace.QName("", "embedTrueTypeFonts");
    private static final javax.xml.namespace.QName SAVESUBSETFONTS$46 = 
        new javax.xml.namespace.QName("", "saveSubsetFonts");
    private static final javax.xml.namespace.QName AUTOCOMPRESSPICTURES$48 = 
        new javax.xml.namespace.QName("", "autoCompressPictures");
    private static final javax.xml.namespace.QName BOOKMARKIDSEED$50 = 
        new javax.xml.namespace.QName("", "bookmarkIdSeed");
    
    
    /**
     * Gets the "sldMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList getSldMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList)get_store().find_element_user(SLDMASTERIDLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldMasterIdLst" element
     */
    public boolean isSetSldMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDMASTERIDLST$0) != 0;
        }
    }
    
    /**
     * Sets the "sldMasterIdLst" element
     */
    public void setSldMasterIdLst(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList sldMasterIdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList)get_store().find_element_user(SLDMASTERIDLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList)get_store().add_element_user(SLDMASTERIDLST$0);
            }
            target.set(sldMasterIdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "sldMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList addNewSldMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList)get_store().add_element_user(SLDMASTERIDLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sldMasterIdLst" element
     */
    public void unsetSldMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDMASTERIDLST$0, 0);
        }
    }
    
    /**
     * Gets the "notesMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList getNotesMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList)get_store().find_element_user(NOTESMASTERIDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notesMasterIdLst" element
     */
    public boolean isSetNotesMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTESMASTERIDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "notesMasterIdLst" element
     */
    public void setNotesMasterIdLst(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList notesMasterIdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList)get_store().find_element_user(NOTESMASTERIDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList)get_store().add_element_user(NOTESMASTERIDLST$2);
            }
            target.set(notesMasterIdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "notesMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList addNewNotesMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList)get_store().add_element_user(NOTESMASTERIDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "notesMasterIdLst" element
     */
    public void unsetNotesMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTESMASTERIDLST$2, 0);
        }
    }
    
    /**
     * Gets the "handoutMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList getHandoutMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList)get_store().find_element_user(HANDOUTMASTERIDLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handoutMasterIdLst" element
     */
    public boolean isSetHandoutMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDOUTMASTERIDLST$4) != 0;
        }
    }
    
    /**
     * Sets the "handoutMasterIdLst" element
     */
    public void setHandoutMasterIdLst(org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList handoutMasterIdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList)get_store().find_element_user(HANDOUTMASTERIDLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList)get_store().add_element_user(HANDOUTMASTERIDLST$4);
            }
            target.set(handoutMasterIdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "handoutMasterIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList addNewHandoutMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList)get_store().add_element_user(HANDOUTMASTERIDLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "handoutMasterIdLst" element
     */
    public void unsetHandoutMasterIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDOUTMASTERIDLST$4, 0);
        }
    }
    
    /**
     * Gets the "sldIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList getSldIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList)get_store().find_element_user(SLDIDLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldIdLst" element
     */
    public boolean isSetSldIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDIDLST$6) != 0;
        }
    }
    
    /**
     * Sets the "sldIdLst" element
     */
    public void setSldIdLst(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList sldIdLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList)get_store().find_element_user(SLDIDLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList)get_store().add_element_user(SLDIDLST$6);
            }
            target.set(sldIdLst);
        }
    }
    
    /**
     * Appends and returns a new empty "sldIdLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList addNewSldIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList)get_store().add_element_user(SLDIDLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "sldIdLst" element
     */
    public void unsetSldIdLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDIDLST$6, 0);
        }
    }
    
    /**
     * Gets the "sldSz" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize getSldSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize)get_store().find_element_user(SLDSZ$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldSz" element
     */
    public boolean isSetSldSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDSZ$8) != 0;
        }
    }
    
    /**
     * Sets the "sldSz" element
     */
    public void setSldSz(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize sldSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize)get_store().find_element_user(SLDSZ$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize)get_store().add_element_user(SLDSZ$8);
            }
            target.set(sldSz);
        }
    }
    
    /**
     * Appends and returns a new empty "sldSz" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize addNewSldSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize)get_store().add_element_user(SLDSZ$8);
            return target;
        }
    }
    
    /**
     * Unsets the "sldSz" element
     */
    public void unsetSldSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDSZ$8, 0);
        }
    }
    
    /**
     * Gets the "notesSz" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getNotesSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(NOTESSZ$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notesSz" element
     */
    public void setNotesSz(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D notesSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(NOTESSZ$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(NOTESSZ$10);
            }
            target.set(notesSz);
        }
    }
    
    /**
     * Appends and returns a new empty "notesSz" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewNotesSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(NOTESSZ$10);
            return target;
        }
    }
    
    /**
     * Gets the "smartTags" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags getSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags)get_store().find_element_user(SMARTTAGS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smartTags" element
     */
    public boolean isSetSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAGS$12) != 0;
        }
    }
    
    /**
     * Sets the "smartTags" element
     */
    public void setSmartTags(org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags smartTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags)get_store().find_element_user(SMARTTAGS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags)get_store().add_element_user(SMARTTAGS$12);
            }
            target.set(smartTags);
        }
    }
    
    /**
     * Appends and returns a new empty "smartTags" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags addNewSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags)get_store().add_element_user(SMARTTAGS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "smartTags" element
     */
    public void unsetSmartTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAGS$12, 0);
        }
    }
    
    /**
     * Gets the "embeddedFontLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList getEmbeddedFontLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList)get_store().find_element_user(EMBEDDEDFONTLST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embeddedFontLst" element
     */
    public boolean isSetEmbeddedFontLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDDEDFONTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "embeddedFontLst" element
     */
    public void setEmbeddedFontLst(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList embeddedFontLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList)get_store().find_element_user(EMBEDDEDFONTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList)get_store().add_element_user(EMBEDDEDFONTLST$14);
            }
            target.set(embeddedFontLst);
        }
    }
    
    /**
     * Appends and returns a new empty "embeddedFontLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList addNewEmbeddedFontLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList)get_store().add_element_user(EMBEDDEDFONTLST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "embeddedFontLst" element
     */
    public void unsetEmbeddedFontLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDDEDFONTLST$14, 0);
        }
    }
    
    /**
     * Gets the "custShowLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList getCustShowLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList)get_store().find_element_user(CUSTSHOWLST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custShowLst" element
     */
    public boolean isSetCustShowLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTSHOWLST$16) != 0;
        }
    }
    
    /**
     * Sets the "custShowLst" element
     */
    public void setCustShowLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList custShowLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList)get_store().find_element_user(CUSTSHOWLST$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList)get_store().add_element_user(CUSTSHOWLST$16);
            }
            target.set(custShowLst);
        }
    }
    
    /**
     * Appends and returns a new empty "custShowLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList addNewCustShowLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList)get_store().add_element_user(CUSTSHOWLST$16);
            return target;
        }
    }
    
    /**
     * Unsets the "custShowLst" element
     */
    public void unsetCustShowLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTSHOWLST$16, 0);
        }
    }
    
    /**
     * Gets the "photoAlbum" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum getPhotoAlbum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum)get_store().find_element_user(PHOTOALBUM$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "photoAlbum" element
     */
    public boolean isSetPhotoAlbum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHOTOALBUM$18) != 0;
        }
    }
    
    /**
     * Sets the "photoAlbum" element
     */
    public void setPhotoAlbum(org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum photoAlbum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum)get_store().find_element_user(PHOTOALBUM$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum)get_store().add_element_user(PHOTOALBUM$18);
            }
            target.set(photoAlbum);
        }
    }
    
    /**
     * Appends and returns a new empty "photoAlbum" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum addNewPhotoAlbum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum)get_store().add_element_user(PHOTOALBUM$18);
            return target;
        }
    }
    
    /**
     * Unsets the "photoAlbum" element
     */
    public void unsetPhotoAlbum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHOTOALBUM$18, 0);
        }
    }
    
    /**
     * Gets the "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList getCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custDataLst" element
     */
    public boolean isSetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTDATALST$20) != 0;
        }
    }
    
    /**
     * Sets the "custDataLst" element
     */
    public void setCustDataLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList custDataLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$20);
            }
            target.set(custDataLst);
        }
    }
    
    /**
     * Appends and returns a new empty "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList addNewCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$20);
            return target;
        }
    }
    
    /**
     * Unsets the "custDataLst" element
     */
    public void unsetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTDATALST$20, 0);
        }
    }
    
    /**
     * Gets the "kinsoku" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku getKinsoku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku)get_store().find_element_user(KINSOKU$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kinsoku" element
     */
    public boolean isSetKinsoku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KINSOKU$22) != 0;
        }
    }
    
    /**
     * Sets the "kinsoku" element
     */
    public void setKinsoku(org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku kinsoku)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku)get_store().find_element_user(KINSOKU$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku)get_store().add_element_user(KINSOKU$22);
            }
            target.set(kinsoku);
        }
    }
    
    /**
     * Appends and returns a new empty "kinsoku" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku addNewKinsoku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku)get_store().add_element_user(KINSOKU$22);
            return target;
        }
    }
    
    /**
     * Unsets the "kinsoku" element
     */
    public void unsetKinsoku()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KINSOKU$22, 0);
        }
    }
    
    /**
     * Gets the "defaultTextStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getDefaultTextStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(DEFAULTTEXTSTYLE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultTextStyle" element
     */
    public boolean isSetDefaultTextStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTTEXTSTYLE$24) != 0;
        }
    }
    
    /**
     * Sets the "defaultTextStyle" element
     */
    public void setDefaultTextStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle defaultTextStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(DEFAULTTEXTSTYLE$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(DEFAULTTEXTSTYLE$24);
            }
            target.set(defaultTextStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "defaultTextStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewDefaultTextStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(DEFAULTTEXTSTYLE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "defaultTextStyle" element
     */
    public void unsetDefaultTextStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTTEXTSTYLE$24, 0);
        }
    }
    
    /**
     * Gets the "modifyVerifier" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier getModifyVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier)get_store().find_element_user(MODIFYVERIFIER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifyVerifier" element
     */
    public boolean isSetModifyVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFYVERIFIER$26) != 0;
        }
    }
    
    /**
     * Sets the "modifyVerifier" element
     */
    public void setModifyVerifier(org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier modifyVerifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier)get_store().find_element_user(MODIFYVERIFIER$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier)get_store().add_element_user(MODIFYVERIFIER$26);
            }
            target.set(modifyVerifier);
        }
    }
    
    /**
     * Appends and returns a new empty "modifyVerifier" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier addNewModifyVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier)get_store().add_element_user(MODIFYVERIFIER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "modifyVerifier" element
     */
    public void unsetModifyVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFYVERIFIER$26, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$28) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$28);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$28);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$28, 0);
        }
    }
    
    /**
     * Gets the "serverZoom" attribute
     */
    public int getServerZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERZOOM$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERZOOM$30);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverZoom" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetServerZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SERVERZOOM$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SERVERZOOM$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverZoom" attribute
     */
    public boolean isSetServerZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERZOOM$30) != null;
        }
    }
    
    /**
     * Sets the "serverZoom" attribute
     */
    public void setServerZoom(int serverZoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERZOOM$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERZOOM$30);
            }
            target.setIntValue(serverZoom);
        }
    }
    
    /**
     * Sets (as xml) the "serverZoom" attribute
     */
    public void xsetServerZoom(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage serverZoom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SERVERZOOM$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SERVERZOOM$30);
            }
            target.set(serverZoom);
        }
    }
    
    /**
     * Unsets the "serverZoom" attribute
     */
    public void unsetServerZoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERZOOM$30);
        }
    }
    
    /**
     * Gets the "firstSlideNum" attribute
     */
    public int getFirstSlideNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTSLIDENUM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIRSTSLIDENUM$32);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstSlideNum" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetFirstSlideNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FIRSTSLIDENUM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(FIRSTSLIDENUM$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "firstSlideNum" attribute
     */
    public boolean isSetFirstSlideNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTSLIDENUM$32) != null;
        }
    }
    
    /**
     * Sets the "firstSlideNum" attribute
     */
    public void setFirstSlideNum(int firstSlideNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTSLIDENUM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTSLIDENUM$32);
            }
            target.setIntValue(firstSlideNum);
        }
    }
    
    /**
     * Sets (as xml) the "firstSlideNum" attribute
     */
    public void xsetFirstSlideNum(org.apache.xmlbeans.XmlInt firstSlideNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(FIRSTSLIDENUM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(FIRSTSLIDENUM$32);
            }
            target.set(firstSlideNum);
        }
    }
    
    /**
     * Unsets the "firstSlideNum" attribute
     */
    public void unsetFirstSlideNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTSLIDENUM$32);
        }
    }
    
    /**
     * Gets the "showSpecialPlsOnTitleSld" attribute
     */
    public boolean getShowSpecialPlsOnTitleSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWSPECIALPLSONTITLESLD$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showSpecialPlsOnTitleSld" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowSpecialPlsOnTitleSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWSPECIALPLSONTITLESLD$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "showSpecialPlsOnTitleSld" attribute
     */
    public boolean isSetShowSpecialPlsOnTitleSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34) != null;
        }
    }
    
    /**
     * Sets the "showSpecialPlsOnTitleSld" attribute
     */
    public void setShowSpecialPlsOnTitleSld(boolean showSpecialPlsOnTitleSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            }
            target.setBooleanValue(showSpecialPlsOnTitleSld);
        }
    }
    
    /**
     * Sets (as xml) the "showSpecialPlsOnTitleSld" attribute
     */
    public void xsetShowSpecialPlsOnTitleSld(org.apache.xmlbeans.XmlBoolean showSpecialPlsOnTitleSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
            }
            target.set(showSpecialPlsOnTitleSld);
        }
    }
    
    /**
     * Unsets the "showSpecialPlsOnTitleSld" attribute
     */
    public void unsetShowSpecialPlsOnTitleSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWSPECIALPLSONTITLESLD$34);
        }
    }
    
    /**
     * Gets the "rtl" attribute
     */
    public boolean getRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RTL$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtl" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RTL$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "rtl" attribute
     */
    public boolean isSetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTL$36) != null;
        }
    }
    
    /**
     * Sets the "rtl" attribute
     */
    public void setRtl(boolean rtl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTL$36);
            }
            target.setBooleanValue(rtl);
        }
    }
    
    /**
     * Sets (as xml) the "rtl" attribute
     */
    public void xsetRtl(org.apache.xmlbeans.XmlBoolean rtl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RTL$36);
            }
            target.set(rtl);
        }
    }
    
    /**
     * Unsets the "rtl" attribute
     */
    public void unsetRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTL$36);
        }
    }
    
    /**
     * Gets the "removePersonalInfoOnSave" attribute
     */
    public boolean getRemovePersonalInfoOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REMOVEPERSONALINFOONSAVE$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "removePersonalInfoOnSave" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRemovePersonalInfoOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REMOVEPERSONALINFOONSAVE$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "removePersonalInfoOnSave" attribute
     */
    public boolean isSetRemovePersonalInfoOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38) != null;
        }
    }
    
    /**
     * Sets the "removePersonalInfoOnSave" attribute
     */
    public void setRemovePersonalInfoOnSave(boolean removePersonalInfoOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            }
            target.setBooleanValue(removePersonalInfoOnSave);
        }
    }
    
    /**
     * Sets (as xml) the "removePersonalInfoOnSave" attribute
     */
    public void xsetRemovePersonalInfoOnSave(org.apache.xmlbeans.XmlBoolean removePersonalInfoOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REMOVEPERSONALINFOONSAVE$38);
            }
            target.set(removePersonalInfoOnSave);
        }
    }
    
    /**
     * Unsets the "removePersonalInfoOnSave" attribute
     */
    public void unsetRemovePersonalInfoOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOVEPERSONALINFOONSAVE$38);
        }
    }
    
    /**
     * Gets the "compatMode" attribute
     */
    public boolean getCompatMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPATMODE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPATMODE$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compatMode" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompatMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPATMODE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPATMODE$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "compatMode" attribute
     */
    public boolean isSetCompatMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPATMODE$40) != null;
        }
    }
    
    /**
     * Sets the "compatMode" attribute
     */
    public void setCompatMode(boolean compatMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPATMODE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPATMODE$40);
            }
            target.setBooleanValue(compatMode);
        }
    }
    
    /**
     * Sets (as xml) the "compatMode" attribute
     */
    public void xsetCompatMode(org.apache.xmlbeans.XmlBoolean compatMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPATMODE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPATMODE$40);
            }
            target.set(compatMode);
        }
    }
    
    /**
     * Unsets the "compatMode" attribute
     */
    public void unsetCompatMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPATMODE$40);
        }
    }
    
    /**
     * Gets the "strictFirstAndLastChars" attribute
     */
    public boolean getStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STRICTFIRSTANDLASTCHARS$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "strictFirstAndLastChars" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STRICTFIRSTANDLASTCHARS$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "strictFirstAndLastChars" attribute
     */
    public boolean isSetStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42) != null;
        }
    }
    
    /**
     * Sets the "strictFirstAndLastChars" attribute
     */
    public void setStrictFirstAndLastChars(boolean strictFirstAndLastChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            }
            target.setBooleanValue(strictFirstAndLastChars);
        }
    }
    
    /**
     * Sets (as xml) the "strictFirstAndLastChars" attribute
     */
    public void xsetStrictFirstAndLastChars(org.apache.xmlbeans.XmlBoolean strictFirstAndLastChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STRICTFIRSTANDLASTCHARS$42);
            }
            target.set(strictFirstAndLastChars);
        }
    }
    
    /**
     * Unsets the "strictFirstAndLastChars" attribute
     */
    public void unsetStrictFirstAndLastChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRICTFIRSTANDLASTCHARS$42);
        }
    }
    
    /**
     * Gets the "embedTrueTypeFonts" attribute
     */
    public boolean getEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EMBEDTRUETYPEFONTS$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "embedTrueTypeFonts" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EMBEDTRUETYPEFONTS$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "embedTrueTypeFonts" attribute
     */
    public boolean isSetEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44) != null;
        }
    }
    
    /**
     * Sets the "embedTrueTypeFonts" attribute
     */
    public void setEmbedTrueTypeFonts(boolean embedTrueTypeFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMBEDTRUETYPEFONTS$44);
            }
            target.setBooleanValue(embedTrueTypeFonts);
        }
    }
    
    /**
     * Sets (as xml) the "embedTrueTypeFonts" attribute
     */
    public void xsetEmbedTrueTypeFonts(org.apache.xmlbeans.XmlBoolean embedTrueTypeFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EMBEDTRUETYPEFONTS$44);
            }
            target.set(embedTrueTypeFonts);
        }
    }
    
    /**
     * Unsets the "embedTrueTypeFonts" attribute
     */
    public void unsetEmbedTrueTypeFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EMBEDTRUETYPEFONTS$44);
        }
    }
    
    /**
     * Gets the "saveSubsetFonts" attribute
     */
    public boolean getSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVESUBSETFONTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVESUBSETFONTS$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "saveSubsetFonts" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVESUBSETFONTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SAVESUBSETFONTS$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "saveSubsetFonts" attribute
     */
    public boolean isSetSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SAVESUBSETFONTS$46) != null;
        }
    }
    
    /**
     * Sets the "saveSubsetFonts" attribute
     */
    public void setSaveSubsetFonts(boolean saveSubsetFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVESUBSETFONTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVESUBSETFONTS$46);
            }
            target.setBooleanValue(saveSubsetFonts);
        }
    }
    
    /**
     * Sets (as xml) the "saveSubsetFonts" attribute
     */
    public void xsetSaveSubsetFonts(org.apache.xmlbeans.XmlBoolean saveSubsetFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SAVESUBSETFONTS$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SAVESUBSETFONTS$46);
            }
            target.set(saveSubsetFonts);
        }
    }
    
    /**
     * Unsets the "saveSubsetFonts" attribute
     */
    public void unsetSaveSubsetFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SAVESUBSETFONTS$46);
        }
    }
    
    /**
     * Gets the "autoCompressPictures" attribute
     */
    public boolean getAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOCOMPRESSPICTURES$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoCompressPictures" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOCOMPRESSPICTURES$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoCompressPictures" attribute
     */
    public boolean isSetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48) != null;
        }
    }
    
    /**
     * Sets the "autoCompressPictures" attribute
     */
    public void setAutoCompressPictures(boolean autoCompressPictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOCOMPRESSPICTURES$48);
            }
            target.setBooleanValue(autoCompressPictures);
        }
    }
    
    /**
     * Sets (as xml) the "autoCompressPictures" attribute
     */
    public void xsetAutoCompressPictures(org.apache.xmlbeans.XmlBoolean autoCompressPictures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOCOMPRESSPICTURES$48);
            }
            target.set(autoCompressPictures);
        }
    }
    
    /**
     * Unsets the "autoCompressPictures" attribute
     */
    public void unsetAutoCompressPictures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOCOMPRESSPICTURES$48);
        }
    }
    
    /**
     * Gets the "bookmarkIdSeed" attribute
     */
    public long getBookmarkIdSeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKMARKIDSEED$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BOOKMARKIDSEED$50);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "bookmarkIdSeed" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed xgetBookmarkIdSeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed)get_store().find_attribute_user(BOOKMARKIDSEED$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed)get_default_attribute_value(BOOKMARKIDSEED$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "bookmarkIdSeed" attribute
     */
    public boolean isSetBookmarkIdSeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOOKMARKIDSEED$50) != null;
        }
    }
    
    /**
     * Sets the "bookmarkIdSeed" attribute
     */
    public void setBookmarkIdSeed(long bookmarkIdSeed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOKMARKIDSEED$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOKMARKIDSEED$50);
            }
            target.setLongValue(bookmarkIdSeed);
        }
    }
    
    /**
     * Sets (as xml) the "bookmarkIdSeed" attribute
     */
    public void xsetBookmarkIdSeed(org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed bookmarkIdSeed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed)get_store().find_attribute_user(BOOKMARKIDSEED$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed)get_store().add_attribute_user(BOOKMARKIDSEED$50);
            }
            target.set(bookmarkIdSeed);
        }
    }
    
    /**
     * Unsets the "bookmarkIdSeed" attribute
     */
    public void unsetBookmarkIdSeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOOKMARKIDSEED$50);
        }
    }
}
