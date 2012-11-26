/*
 * XML Type:  CT_TextParagraphProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextParagraphProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextParagraphPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties
{
    
    public CTTextParagraphPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LNSPC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnSpc");
    private static final javax.xml.namespace.QName SPCBEF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcBef");
    private static final javax.xml.namespace.QName SPCAFT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcAft");
    private static final javax.xml.namespace.QName BUCLRTX$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buClrTx");
    private static final javax.xml.namespace.QName BUCLR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buClr");
    private static final javax.xml.namespace.QName BUSZTX$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzTx");
    private static final javax.xml.namespace.QName BUSZPCT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzPct");
    private static final javax.xml.namespace.QName BUSZPTS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzPts");
    private static final javax.xml.namespace.QName BUFONTTX$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buFontTx");
    private static final javax.xml.namespace.QName BUFONT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buFont");
    private static final javax.xml.namespace.QName BUNONE$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buNone");
    private static final javax.xml.namespace.QName BUAUTONUM$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buAutoNum");
    private static final javax.xml.namespace.QName BUCHAR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buChar");
    private static final javax.xml.namespace.QName BUBLIP$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buBlip");
    private static final javax.xml.namespace.QName TABLST$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tabLst");
    private static final javax.xml.namespace.QName DEFRPR$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "defRPr");
    private static final javax.xml.namespace.QName EXTLST$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName MARL$34 = 
        new javax.xml.namespace.QName("", "marL");
    private static final javax.xml.namespace.QName MARR$36 = 
        new javax.xml.namespace.QName("", "marR");
    private static final javax.xml.namespace.QName LVL$38 = 
        new javax.xml.namespace.QName("", "lvl");
    private static final javax.xml.namespace.QName INDENT$40 = 
        new javax.xml.namespace.QName("", "indent");
    private static final javax.xml.namespace.QName ALGN$42 = 
        new javax.xml.namespace.QName("", "algn");
    private static final javax.xml.namespace.QName DEFTABSZ$44 = 
        new javax.xml.namespace.QName("", "defTabSz");
    private static final javax.xml.namespace.QName RTL$46 = 
        new javax.xml.namespace.QName("", "rtl");
    private static final javax.xml.namespace.QName EALNBRK$48 = 
        new javax.xml.namespace.QName("", "eaLnBrk");
    private static final javax.xml.namespace.QName FONTALGN$50 = 
        new javax.xml.namespace.QName("", "fontAlgn");
    private static final javax.xml.namespace.QName LATINLNBRK$52 = 
        new javax.xml.namespace.QName("", "latinLnBrk");
    private static final javax.xml.namespace.QName HANGINGPUNCT$54 = 
        new javax.xml.namespace.QName("", "hangingPunct");
    
    
    /**
     * Gets the "lnSpc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing getLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(LNSPC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnSpc" element
     */
    public boolean isSetLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNSPC$0) != 0;
        }
    }
    
    /**
     * Sets the "lnSpc" element
     */
    public void setLnSpc(org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing lnSpc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(LNSPC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(LNSPC$0);
            }
            target.set(lnSpc);
        }
    }
    
    /**
     * Appends and returns a new empty "lnSpc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing addNewLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(LNSPC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "lnSpc" element
     */
    public void unsetLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNSPC$0, 0);
        }
    }
    
    /**
     * Gets the "spcBef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing getSpcBef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(SPCBEF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spcBef" element
     */
    public boolean isSetSpcBef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPCBEF$2) != 0;
        }
    }
    
    /**
     * Sets the "spcBef" element
     */
    public void setSpcBef(org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing spcBef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(SPCBEF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(SPCBEF$2);
            }
            target.set(spcBef);
        }
    }
    
    /**
     * Appends and returns a new empty "spcBef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing addNewSpcBef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(SPCBEF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "spcBef" element
     */
    public void unsetSpcBef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPCBEF$2, 0);
        }
    }
    
    /**
     * Gets the "spcAft" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing getSpcAft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(SPCAFT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spcAft" element
     */
    public boolean isSetSpcAft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPCAFT$4) != 0;
        }
    }
    
    /**
     * Sets the "spcAft" element
     */
    public void setSpcAft(org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing spcAft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().find_element_user(SPCAFT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(SPCAFT$4);
            }
            target.set(spcAft);
        }
    }
    
    /**
     * Appends and returns a new empty "spcAft" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing addNewSpcAft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing)get_store().add_element_user(SPCAFT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "spcAft" element
     */
    public void unsetSpcAft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPCAFT$4, 0);
        }
    }
    
    /**
     * Gets the "buClrTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText getBuClrTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText)get_store().find_element_user(BUCLRTX$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buClrTx" element
     */
    public boolean isSetBuClrTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUCLRTX$6) != 0;
        }
    }
    
    /**
     * Sets the "buClrTx" element
     */
    public void setBuClrTx(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText buClrTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText)get_store().find_element_user(BUCLRTX$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText)get_store().add_element_user(BUCLRTX$6);
            }
            target.set(buClrTx);
        }
    }
    
    /**
     * Appends and returns a new empty "buClrTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText addNewBuClrTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText)get_store().add_element_user(BUCLRTX$6);
            return target;
        }
    }
    
    /**
     * Unsets the "buClrTx" element
     */
    public void unsetBuClrTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUCLRTX$6, 0);
        }
    }
    
    /**
     * Gets the "buClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getBuClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(BUCLR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buClr" element
     */
    public boolean isSetBuClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUCLR$8) != 0;
        }
    }
    
    /**
     * Sets the "buClr" element
     */
    public void setBuClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor buClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(BUCLR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(BUCLR$8);
            }
            target.set(buClr);
        }
    }
    
    /**
     * Appends and returns a new empty "buClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewBuClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(BUCLR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "buClr" element
     */
    public void unsetBuClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUCLR$8, 0);
        }
    }
    
    /**
     * Gets the "buSzTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText getBuSzTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText)get_store().find_element_user(BUSZTX$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buSzTx" element
     */
    public boolean isSetBuSzTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSZTX$10) != 0;
        }
    }
    
    /**
     * Sets the "buSzTx" element
     */
    public void setBuSzTx(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText buSzTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText)get_store().find_element_user(BUSZTX$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText)get_store().add_element_user(BUSZTX$10);
            }
            target.set(buSzTx);
        }
    }
    
    /**
     * Appends and returns a new empty "buSzTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText addNewBuSzTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText)get_store().add_element_user(BUSZTX$10);
            return target;
        }
    }
    
    /**
     * Unsets the "buSzTx" element
     */
    public void unsetBuSzTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSZTX$10, 0);
        }
    }
    
    /**
     * Gets the "buSzPct" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent getBuSzPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent)get_store().find_element_user(BUSZPCT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buSzPct" element
     */
    public boolean isSetBuSzPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSZPCT$12) != 0;
        }
    }
    
    /**
     * Sets the "buSzPct" element
     */
    public void setBuSzPct(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent buSzPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent)get_store().find_element_user(BUSZPCT$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent)get_store().add_element_user(BUSZPCT$12);
            }
            target.set(buSzPct);
        }
    }
    
    /**
     * Appends and returns a new empty "buSzPct" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent addNewBuSzPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent)get_store().add_element_user(BUSZPCT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "buSzPct" element
     */
    public void unsetBuSzPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSZPCT$12, 0);
        }
    }
    
    /**
     * Gets the "buSzPts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint getBuSzPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint)get_store().find_element_user(BUSZPTS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buSzPts" element
     */
    public boolean isSetBuSzPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSZPTS$14) != 0;
        }
    }
    
    /**
     * Sets the "buSzPts" element
     */
    public void setBuSzPts(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint buSzPts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint)get_store().find_element_user(BUSZPTS$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint)get_store().add_element_user(BUSZPTS$14);
            }
            target.set(buSzPts);
        }
    }
    
    /**
     * Appends and returns a new empty "buSzPts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint addNewBuSzPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint)get_store().add_element_user(BUSZPTS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "buSzPts" element
     */
    public void unsetBuSzPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSZPTS$14, 0);
        }
    }
    
    /**
     * Gets the "buFontTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText getBuFontTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText)get_store().find_element_user(BUFONTTX$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buFontTx" element
     */
    public boolean isSetBuFontTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUFONTTX$16) != 0;
        }
    }
    
    /**
     * Sets the "buFontTx" element
     */
    public void setBuFontTx(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText buFontTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText)get_store().find_element_user(BUFONTTX$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText)get_store().add_element_user(BUFONTTX$16);
            }
            target.set(buFontTx);
        }
    }
    
    /**
     * Appends and returns a new empty "buFontTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText addNewBuFontTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText)get_store().add_element_user(BUFONTTX$16);
            return target;
        }
    }
    
    /**
     * Unsets the "buFontTx" element
     */
    public void unsetBuFontTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUFONTTX$16, 0);
        }
    }
    
    /**
     * Gets the "buFont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getBuFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(BUFONT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buFont" element
     */
    public boolean isSetBuFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUFONT$18) != 0;
        }
    }
    
    /**
     * Sets the "buFont" element
     */
    public void setBuFont(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont buFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(BUFONT$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(BUFONT$18);
            }
            target.set(buFont);
        }
    }
    
    /**
     * Appends and returns a new empty "buFont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewBuFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(BUFONT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "buFont" element
     */
    public void unsetBuFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUFONT$18, 0);
        }
    }
    
    /**
     * Gets the "buNone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet getBuNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet)get_store().find_element_user(BUNONE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buNone" element
     */
    public boolean isSetBuNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNONE$20) != 0;
        }
    }
    
    /**
     * Sets the "buNone" element
     */
    public void setBuNone(org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet buNone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet)get_store().find_element_user(BUNONE$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet)get_store().add_element_user(BUNONE$20);
            }
            target.set(buNone);
        }
    }
    
    /**
     * Appends and returns a new empty "buNone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet addNewBuNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet)get_store().add_element_user(BUNONE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "buNone" element
     */
    public void unsetBuNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNONE$20, 0);
        }
    }
    
    /**
     * Gets the "buAutoNum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet getBuAutoNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet)get_store().find_element_user(BUAUTONUM$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buAutoNum" element
     */
    public boolean isSetBuAutoNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUAUTONUM$22) != 0;
        }
    }
    
    /**
     * Sets the "buAutoNum" element
     */
    public void setBuAutoNum(org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet buAutoNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet)get_store().find_element_user(BUAUTONUM$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet)get_store().add_element_user(BUAUTONUM$22);
            }
            target.set(buAutoNum);
        }
    }
    
    /**
     * Appends and returns a new empty "buAutoNum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet addNewBuAutoNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet)get_store().add_element_user(BUAUTONUM$22);
            return target;
        }
    }
    
    /**
     * Unsets the "buAutoNum" element
     */
    public void unsetBuAutoNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUAUTONUM$22, 0);
        }
    }
    
    /**
     * Gets the "buChar" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet getBuChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet)get_store().find_element_user(BUCHAR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buChar" element
     */
    public boolean isSetBuChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUCHAR$24) != 0;
        }
    }
    
    /**
     * Sets the "buChar" element
     */
    public void setBuChar(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet buChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet)get_store().find_element_user(BUCHAR$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet)get_store().add_element_user(BUCHAR$24);
            }
            target.set(buChar);
        }
    }
    
    /**
     * Appends and returns a new empty "buChar" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet addNewBuChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet)get_store().add_element_user(BUCHAR$24);
            return target;
        }
    }
    
    /**
     * Unsets the "buChar" element
     */
    public void unsetBuChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUCHAR$24, 0);
        }
    }
    
    /**
     * Gets the "buBlip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet getBuBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet)get_store().find_element_user(BUBLIP$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "buBlip" element
     */
    public boolean isSetBuBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUBLIP$26) != 0;
        }
    }
    
    /**
     * Sets the "buBlip" element
     */
    public void setBuBlip(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet buBlip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet)get_store().find_element_user(BUBLIP$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet)get_store().add_element_user(BUBLIP$26);
            }
            target.set(buBlip);
        }
    }
    
    /**
     * Appends and returns a new empty "buBlip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet addNewBuBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet)get_store().add_element_user(BUBLIP$26);
            return target;
        }
    }
    
    /**
     * Unsets the "buBlip" element
     */
    public void unsetBuBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUBLIP$26, 0);
        }
    }
    
    /**
     * Gets the "tabLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList getTabLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList)get_store().find_element_user(TABLST$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tabLst" element
     */
    public boolean isSetTabLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLST$28) != 0;
        }
    }
    
    /**
     * Sets the "tabLst" element
     */
    public void setTabLst(org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList tabLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList)get_store().find_element_user(TABLST$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList)get_store().add_element_user(TABLST$28);
            }
            target.set(tabLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tabLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList addNewTabLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList)get_store().add_element_user(TABLST$28);
            return target;
        }
    }
    
    /**
     * Unsets the "tabLst" element
     */
    public void unsetTabLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLST$28, 0);
        }
    }
    
    /**
     * Gets the "defRPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties getDefRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(DEFRPR$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defRPr" element
     */
    public boolean isSetDefRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFRPR$30) != 0;
        }
    }
    
    /**
     * Sets the "defRPr" element
     */
    public void setDefRPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties defRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(DEFRPR$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(DEFRPR$30);
            }
            target.set(defRPr);
        }
    }
    
    /**
     * Appends and returns a new empty "defRPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties addNewDefRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(DEFRPR$30);
            return target;
        }
    }
    
    /**
     * Unsets the "defRPr" element
     */
    public void unsetDefRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFRPR$30, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$32, 0);
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
            return get_store().count_elements(EXTLST$32) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$32);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$32);
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
            get_store().remove_element(EXTLST$32, 0);
        }
    }
    
    /**
     * Gets the "marL" attribute
     */
    public int getMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARL$34);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marL" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin xgetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().find_attribute_user(MARL$34);
            return target;
        }
    }
    
    /**
     * True if has "marL" attribute
     */
    public boolean isSetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARL$34) != null;
        }
    }
    
    /**
     * Sets the "marL" attribute
     */
    public void setMarL(int marL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARL$34);
            }
            target.setIntValue(marL);
        }
    }
    
    /**
     * Sets (as xml) the "marL" attribute
     */
    public void xsetMarL(org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin marL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().find_attribute_user(MARL$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().add_attribute_user(MARL$34);
            }
            target.set(marL);
        }
    }
    
    /**
     * Unsets the "marL" attribute
     */
    public void unsetMarL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARL$34);
        }
    }
    
    /**
     * Gets the "marR" attribute
     */
    public int getMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARR$36);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marR" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin xgetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().find_attribute_user(MARR$36);
            return target;
        }
    }
    
    /**
     * True if has "marR" attribute
     */
    public boolean isSetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARR$36) != null;
        }
    }
    
    /**
     * Sets the "marR" attribute
     */
    public void setMarR(int marR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARR$36);
            }
            target.setIntValue(marR);
        }
    }
    
    /**
     * Sets (as xml) the "marR" attribute
     */
    public void xsetMarR(org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin marR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().find_attribute_user(MARR$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin)get_store().add_attribute_user(MARR$36);
            }
            target.set(marR);
        }
    }
    
    /**
     * Unsets the "marR" attribute
     */
    public void unsetMarR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARR$36);
        }
    }
    
    /**
     * Gets the "lvl" attribute
     */
    public int getLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LVL$38);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lvl" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType xgetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType)get_store().find_attribute_user(LVL$38);
            return target;
        }
    }
    
    /**
     * True if has "lvl" attribute
     */
    public boolean isSetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LVL$38) != null;
        }
    }
    
    /**
     * Sets the "lvl" attribute
     */
    public void setLvl(int lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LVL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LVL$38);
            }
            target.setIntValue(lvl);
        }
    }
    
    /**
     * Sets (as xml) the "lvl" attribute
     */
    public void xsetLvl(org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType)get_store().find_attribute_user(LVL$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType)get_store().add_attribute_user(LVL$38);
            }
            target.set(lvl);
        }
    }
    
    /**
     * Unsets the "lvl" attribute
     */
    public void unsetLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LVL$38);
        }
    }
    
    /**
     * Gets the "indent" attribute
     */
    public int getIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$40);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "indent" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent xgetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent)get_store().find_attribute_user(INDENT$40);
            return target;
        }
    }
    
    /**
     * True if has "indent" attribute
     */
    public boolean isSetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDENT$40) != null;
        }
    }
    
    /**
     * Sets the "indent" attribute
     */
    public void setIndent(int indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENT$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDENT$40);
            }
            target.setIntValue(indent);
        }
    }
    
    /**
     * Sets (as xml) the "indent" attribute
     */
    public void xsetIndent(org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent indent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent)get_store().find_attribute_user(INDENT$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent)get_store().add_attribute_user(INDENT$40);
            }
            target.set(indent);
        }
    }
    
    /**
     * Unsets the "indent" attribute
     */
    public void unsetIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDENT$40);
        }
    }
    
    /**
     * Gets the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType.Enum getAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$42);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType xgetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType)get_store().find_attribute_user(ALGN$42);
            return target;
        }
    }
    
    /**
     * True if has "algn" attribute
     */
    public boolean isSetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGN$42) != null;
        }
    }
    
    /**
     * Sets the "algn" attribute
     */
    public void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType.Enum algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$42);
            }
            target.setEnumValue(algn);
        }
    }
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    public void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType)get_store().find_attribute_user(ALGN$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType)get_store().add_attribute_user(ALGN$42);
            }
            target.set(algn);
        }
    }
    
    /**
     * Unsets the "algn" attribute
     */
    public void unsetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGN$42);
        }
    }
    
    /**
     * Gets the "defTabSz" attribute
     */
    public int getDefTabSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFTABSZ$44);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "defTabSz" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetDefTabSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(DEFTABSZ$44);
            return target;
        }
    }
    
    /**
     * True if has "defTabSz" attribute
     */
    public boolean isSetDefTabSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFTABSZ$44) != null;
        }
    }
    
    /**
     * Sets the "defTabSz" attribute
     */
    public void setDefTabSz(int defTabSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFTABSZ$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFTABSZ$44);
            }
            target.setIntValue(defTabSz);
        }
    }
    
    /**
     * Sets (as xml) the "defTabSz" attribute
     */
    public void xsetDefTabSz(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 defTabSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(DEFTABSZ$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(DEFTABSZ$44);
            }
            target.set(defTabSz);
        }
    }
    
    /**
     * Unsets the "defTabSz" attribute
     */
    public void unsetDefTabSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFTABSZ$44);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$46);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$46);
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
            return get_store().find_attribute_user(RTL$46) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTL$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTL$46);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTL$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RTL$46);
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
            get_store().remove_attribute(RTL$46);
        }
    }
    
    /**
     * Gets the "eaLnBrk" attribute
     */
    public boolean getEaLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EALNBRK$48);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "eaLnBrk" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEaLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EALNBRK$48);
            return target;
        }
    }
    
    /**
     * True if has "eaLnBrk" attribute
     */
    public boolean isSetEaLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EALNBRK$48) != null;
        }
    }
    
    /**
     * Sets the "eaLnBrk" attribute
     */
    public void setEaLnBrk(boolean eaLnBrk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EALNBRK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EALNBRK$48);
            }
            target.setBooleanValue(eaLnBrk);
        }
    }
    
    /**
     * Sets (as xml) the "eaLnBrk" attribute
     */
    public void xsetEaLnBrk(org.apache.xmlbeans.XmlBoolean eaLnBrk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EALNBRK$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EALNBRK$48);
            }
            target.set(eaLnBrk);
        }
    }
    
    /**
     * Unsets the "eaLnBrk" attribute
     */
    public void unsetEaLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EALNBRK$48);
        }
    }
    
    /**
     * Gets the "fontAlgn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType.Enum getFontAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTALGN$50);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontAlgn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType xgetFontAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType)get_store().find_attribute_user(FONTALGN$50);
            return target;
        }
    }
    
    /**
     * True if has "fontAlgn" attribute
     */
    public boolean isSetFontAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FONTALGN$50) != null;
        }
    }
    
    /**
     * Sets the "fontAlgn" attribute
     */
    public void setFontAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType.Enum fontAlgn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTALGN$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTALGN$50);
            }
            target.setEnumValue(fontAlgn);
        }
    }
    
    /**
     * Sets (as xml) the "fontAlgn" attribute
     */
    public void xsetFontAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType fontAlgn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType)get_store().find_attribute_user(FONTALGN$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType)get_store().add_attribute_user(FONTALGN$50);
            }
            target.set(fontAlgn);
        }
    }
    
    /**
     * Unsets the "fontAlgn" attribute
     */
    public void unsetFontAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FONTALGN$50);
        }
    }
    
    /**
     * Gets the "latinLnBrk" attribute
     */
    public boolean getLatinLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATINLNBRK$52);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "latinLnBrk" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLatinLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LATINLNBRK$52);
            return target;
        }
    }
    
    /**
     * True if has "latinLnBrk" attribute
     */
    public boolean isSetLatinLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LATINLNBRK$52) != null;
        }
    }
    
    /**
     * Sets the "latinLnBrk" attribute
     */
    public void setLatinLnBrk(boolean latinLnBrk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATINLNBRK$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATINLNBRK$52);
            }
            target.setBooleanValue(latinLnBrk);
        }
    }
    
    /**
     * Sets (as xml) the "latinLnBrk" attribute
     */
    public void xsetLatinLnBrk(org.apache.xmlbeans.XmlBoolean latinLnBrk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LATINLNBRK$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LATINLNBRK$52);
            }
            target.set(latinLnBrk);
        }
    }
    
    /**
     * Unsets the "latinLnBrk" attribute
     */
    public void unsetLatinLnBrk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LATINLNBRK$52);
        }
    }
    
    /**
     * Gets the "hangingPunct" attribute
     */
    public boolean getHangingPunct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGINGPUNCT$54);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hangingPunct" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHangingPunct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANGINGPUNCT$54);
            return target;
        }
    }
    
    /**
     * True if has "hangingPunct" attribute
     */
    public boolean isSetHangingPunct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANGINGPUNCT$54) != null;
        }
    }
    
    /**
     * Sets the "hangingPunct" attribute
     */
    public void setHangingPunct(boolean hangingPunct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGINGPUNCT$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANGINGPUNCT$54);
            }
            target.setBooleanValue(hangingPunct);
        }
    }
    
    /**
     * Sets (as xml) the "hangingPunct" attribute
     */
    public void xsetHangingPunct(org.apache.xmlbeans.XmlBoolean hangingPunct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANGINGPUNCT$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HANGINGPUNCT$54);
            }
            target.set(hangingPunct);
        }
    }
    
    /**
     * Unsets the "hangingPunct" attribute
     */
    public void unsetHangingPunct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANGINGPUNCT$54);
        }
    }
}
