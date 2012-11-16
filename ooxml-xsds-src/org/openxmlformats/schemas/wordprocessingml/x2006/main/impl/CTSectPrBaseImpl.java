/*
 * XML Type:  CT_SectPrBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SectPrBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSectPrBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase
{
    
    public CTSectPrBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOOTNOTEPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotePr");
    private static final javax.xml.namespace.QName ENDNOTEPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotePr");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName PGSZ$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgSz");
    private static final javax.xml.namespace.QName PGMAR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgMar");
    private static final javax.xml.namespace.QName PAPERSRC$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "paperSrc");
    private static final javax.xml.namespace.QName PGBORDERS$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgBorders");
    private static final javax.xml.namespace.QName LNNUMTYPE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lnNumType");
    private static final javax.xml.namespace.QName PGNUMTYPE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgNumType");
    private static final javax.xml.namespace.QName COLS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cols");
    private static final javax.xml.namespace.QName FORMPROT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formProt");
    private static final javax.xml.namespace.QName VALIGN$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAlign");
    private static final javax.xml.namespace.QName NOENDNOTE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noEndnote");
    private static final javax.xml.namespace.QName TITLEPG$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "titlePg");
    private static final javax.xml.namespace.QName TEXTDIRECTION$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
    private static final javax.xml.namespace.QName BIDI$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");
    private static final javax.xml.namespace.QName RTLGUTTER$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rtlGutter");
    private static final javax.xml.namespace.QName DOCGRID$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docGrid");
    private static final javax.xml.namespace.QName PRINTERSETTINGS$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printerSettings");
    private static final javax.xml.namespace.QName RSIDRPR$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
    private static final javax.xml.namespace.QName RSIDDEL$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
    private static final javax.xml.namespace.QName RSIDR$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");
    private static final javax.xml.namespace.QName RSIDSECT$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidSect");
    
    
    /**
     * Gets the "footnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps getFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().find_element_user(FOOTNOTEPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "footnotePr" element
     */
    public boolean isSetFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEPR$0) != 0;
        }
    }
    
    /**
     * Sets the "footnotePr" element
     */
    public void setFootnotePr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps footnotePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().find_element_user(FOOTNOTEPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().add_element_user(FOOTNOTEPR$0);
            }
            target.set(footnotePr);
        }
    }
    
    /**
     * Appends and returns a new empty "footnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps addNewFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().add_element_user(FOOTNOTEPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "footnotePr" element
     */
    public void unsetFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEPR$0, 0);
        }
    }
    
    /**
     * Gets the "endnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps getEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().find_element_user(ENDNOTEPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endnotePr" element
     */
    public boolean isSetEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDNOTEPR$2) != 0;
        }
    }
    
    /**
     * Sets the "endnotePr" element
     */
    public void setEndnotePr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps endnotePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().find_element_user(ENDNOTEPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().add_element_user(ENDNOTEPR$2);
            }
            target.set(endnotePr);
        }
    }
    
    /**
     * Appends and returns a new empty "endnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps addNewEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().add_element_user(ENDNOTEPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "endnotePr" element
     */
    public void unsetEndnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDNOTEPR$2, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, 0);
        }
    }
    
    /**
     * Gets the "pgSz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz getPgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().find_element_user(PGSZ$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pgSz" element
     */
    public boolean isSetPgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PGSZ$6) != 0;
        }
    }
    
    /**
     * Sets the "pgSz" element
     */
    public void setPgSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz pgSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().find_element_user(PGSZ$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().add_element_user(PGSZ$6);
            }
            target.set(pgSz);
        }
    }
    
    /**
     * Appends and returns a new empty "pgSz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz addNewPgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().add_element_user(PGSZ$6);
            return target;
        }
    }
    
    /**
     * Unsets the "pgSz" element
     */
    public void unsetPgSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PGSZ$6, 0);
        }
    }
    
    /**
     * Gets the "pgMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar getPgMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().find_element_user(PGMAR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pgMar" element
     */
    public boolean isSetPgMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PGMAR$8) != 0;
        }
    }
    
    /**
     * Sets the "pgMar" element
     */
    public void setPgMar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar pgMar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().find_element_user(PGMAR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().add_element_user(PGMAR$8);
            }
            target.set(pgMar);
        }
    }
    
    /**
     * Appends and returns a new empty "pgMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar addNewPgMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().add_element_user(PGMAR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "pgMar" element
     */
    public void unsetPgMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PGMAR$8, 0);
        }
    }
    
    /**
     * Gets the "paperSrc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource getPaperSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().find_element_user(PAPERSRC$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paperSrc" element
     */
    public boolean isSetPaperSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAPERSRC$10) != 0;
        }
    }
    
    /**
     * Sets the "paperSrc" element
     */
    public void setPaperSrc(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource paperSrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().find_element_user(PAPERSRC$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().add_element_user(PAPERSRC$10);
            }
            target.set(paperSrc);
        }
    }
    
    /**
     * Appends and returns a new empty "paperSrc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource addNewPaperSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().add_element_user(PAPERSRC$10);
            return target;
        }
    }
    
    /**
     * Unsets the "paperSrc" element
     */
    public void unsetPaperSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAPERSRC$10, 0);
        }
    }
    
    /**
     * Gets the "pgBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders getPgBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().find_element_user(PGBORDERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pgBorders" element
     */
    public boolean isSetPgBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PGBORDERS$12) != 0;
        }
    }
    
    /**
     * Sets the "pgBorders" element
     */
    public void setPgBorders(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders pgBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().find_element_user(PGBORDERS$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().add_element_user(PGBORDERS$12);
            }
            target.set(pgBorders);
        }
    }
    
    /**
     * Appends and returns a new empty "pgBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders addNewPgBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().add_element_user(PGBORDERS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "pgBorders" element
     */
    public void unsetPgBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PGBORDERS$12, 0);
        }
    }
    
    /**
     * Gets the "lnNumType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber getLnNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().find_element_user(LNNUMTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnNumType" element
     */
    public boolean isSetLnNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNNUMTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "lnNumType" element
     */
    public void setLnNumType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber lnNumType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().find_element_user(LNNUMTYPE$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().add_element_user(LNNUMTYPE$14);
            }
            target.set(lnNumType);
        }
    }
    
    /**
     * Appends and returns a new empty "lnNumType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber addNewLnNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().add_element_user(LNNUMTYPE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "lnNumType" element
     */
    public void unsetLnNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNNUMTYPE$14, 0);
        }
    }
    
    /**
     * Gets the "pgNumType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber getPgNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().find_element_user(PGNUMTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pgNumType" element
     */
    public boolean isSetPgNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PGNUMTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "pgNumType" element
     */
    public void setPgNumType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber pgNumType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().find_element_user(PGNUMTYPE$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().add_element_user(PGNUMTYPE$16);
            }
            target.set(pgNumType);
        }
    }
    
    /**
     * Appends and returns a new empty "pgNumType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber addNewPgNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().add_element_user(PGNUMTYPE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "pgNumType" element
     */
    public void unsetPgNumType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PGNUMTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "cols" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns getCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().find_element_user(COLS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cols" element
     */
    public boolean isSetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLS$18) != 0;
        }
    }
    
    /**
     * Sets the "cols" element
     */
    public void setCols(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().find_element_user(COLS$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().add_element_user(COLS$18);
            }
            target.set(cols);
        }
    }
    
    /**
     * Appends and returns a new empty "cols" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns addNewCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().add_element_user(COLS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "cols" element
     */
    public void unsetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLS$18, 0);
        }
    }
    
    /**
     * Gets the "formProt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getFormProt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMPROT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formProt" element
     */
    public boolean isSetFormProt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMPROT$20) != 0;
        }
    }
    
    /**
     * Sets the "formProt" element
     */
    public void setFormProt(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff formProt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMPROT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMPROT$20);
            }
            target.set(formProt);
        }
    }
    
    /**
     * Appends and returns a new empty "formProt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewFormProt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMPROT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "formProt" element
     */
    public void unsetFormProt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMPROT$20, 0);
        }
    }
    
    /**
     * Gets the "vAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc getVAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vAlign" element
     */
    public boolean isSetVAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIGN$22) != 0;
        }
    }
    
    /**
     * Sets the "vAlign" element
     */
    public void setVAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc vAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$22);
            }
            target.set(vAlign);
        }
    }
    
    /**
     * Appends and returns a new empty "vAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc addNewVAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$22);
            return target;
        }
    }
    
    /**
     * Unsets the "vAlign" element
     */
    public void unsetVAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIGN$22, 0);
        }
    }
    
    /**
     * Gets the "noEndnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOENDNOTE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noEndnote" element
     */
    public boolean isSetNoEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOENDNOTE$24) != 0;
        }
    }
    
    /**
     * Sets the "noEndnote" element
     */
    public void setNoEndnote(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noEndnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOENDNOTE$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOENDNOTE$24);
            }
            target.set(noEndnote);
        }
    }
    
    /**
     * Appends and returns a new empty "noEndnote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOENDNOTE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "noEndnote" element
     */
    public void unsetNoEndnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOENDNOTE$24, 0);
        }
    }
    
    /**
     * Gets the "titlePg" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getTitlePg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TITLEPG$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "titlePg" element
     */
    public boolean isSetTitlePg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLEPG$26) != 0;
        }
    }
    
    /**
     * Sets the "titlePg" element
     */
    public void setTitlePg(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff titlePg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TITLEPG$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TITLEPG$26);
            }
            target.set(titlePg);
        }
    }
    
    /**
     * Appends and returns a new empty "titlePg" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewTitlePg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TITLEPG$26);
            return target;
        }
    }
    
    /**
     * Unsets the "titlePg" element
     */
    public void unsetTitlePg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLEPG$26, 0);
        }
    }
    
    /**
     * Gets the "textDirection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection getTextDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "textDirection" element
     */
    public boolean isSetTextDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTDIRECTION$28) != 0;
        }
    }
    
    /**
     * Sets the "textDirection" element
     */
    public void setTextDirection(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection textDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$28);
            }
            target.set(textDirection);
        }
    }
    
    /**
     * Appends and returns a new empty "textDirection" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection addNewTextDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$28);
            return target;
        }
    }
    
    /**
     * Unsets the "textDirection" element
     */
    public void unsetTextDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTDIRECTION$28, 0);
        }
    }
    
    /**
     * Gets the "bidi" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDI$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bidi" element
     */
    public boolean isSetBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIDI$30) != 0;
        }
    }
    
    /**
     * Sets the "bidi" element
     */
    public void setBidi(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bidi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDI$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDI$30);
            }
            target.set(bidi);
        }
    }
    
    /**
     * Appends and returns a new empty "bidi" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDI$30);
            return target;
        }
    }
    
    /**
     * Unsets the "bidi" element
     */
    public void unsetBidi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIDI$30, 0);
        }
    }
    
    /**
     * Gets the "rtlGutter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getRtlGutter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTLGUTTER$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rtlGutter" element
     */
    public boolean isSetRtlGutter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RTLGUTTER$32) != 0;
        }
    }
    
    /**
     * Sets the "rtlGutter" element
     */
    public void setRtlGutter(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff rtlGutter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTLGUTTER$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RTLGUTTER$32);
            }
            target.set(rtlGutter);
        }
    }
    
    /**
     * Appends and returns a new empty "rtlGutter" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewRtlGutter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RTLGUTTER$32);
            return target;
        }
    }
    
    /**
     * Unsets the "rtlGutter" element
     */
    public void unsetRtlGutter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RTLGUTTER$32, 0);
        }
    }
    
    /**
     * Gets the "docGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid getDocGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().find_element_user(DOCGRID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docGrid" element
     */
    public boolean isSetDocGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCGRID$34) != 0;
        }
    }
    
    /**
     * Sets the "docGrid" element
     */
    public void setDocGrid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid docGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().find_element_user(DOCGRID$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().add_element_user(DOCGRID$34);
            }
            target.set(docGrid);
        }
    }
    
    /**
     * Appends and returns a new empty "docGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid addNewDocGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().add_element_user(DOCGRID$34);
            return target;
        }
    }
    
    /**
     * Unsets the "docGrid" element
     */
    public void unsetDocGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCGRID$34, 0);
        }
    }
    
    /**
     * Gets the "printerSettings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getPrinterSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(PRINTERSETTINGS$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "printerSettings" element
     */
    public boolean isSetPrinterSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINTERSETTINGS$36) != 0;
        }
    }
    
    /**
     * Sets the "printerSettings" element
     */
    public void setPrinterSettings(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel printerSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(PRINTERSETTINGS$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(PRINTERSETTINGS$36);
            }
            target.set(printerSettings);
        }
    }
    
    /**
     * Appends and returns a new empty "printerSettings" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewPrinterSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(PRINTERSETTINGS$36);
            return target;
        }
    }
    
    /**
     * Unsets the "printerSettings" element
     */
    public void unsetPrinterSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINTERSETTINGS$36, 0);
        }
    }
    
    /**
     * Gets the "rsidRPr" attribute
     */
    public byte[] getRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$38);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidRPr" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$38);
            return target;
        }
    }
    
    /**
     * True if has "rsidRPr" attribute
     */
    public boolean isSetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDRPR$38) != null;
        }
    }
    
    /**
     * Sets the "rsidRPr" attribute
     */
    public void setRsidRPr(byte[] rsidRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDRPR$38);
            }
            target.setByteArrayValue(rsidRPr);
        }
    }
    
    /**
     * Sets (as xml) the "rsidRPr" attribute
     */
    public void xsetRsidRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDRPR$38);
            }
            target.set(rsidRPr);
        }
    }
    
    /**
     * Unsets the "rsidRPr" attribute
     */
    public void unsetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDRPR$38);
        }
    }
    
    /**
     * Gets the "rsidDel" attribute
     */
    public byte[] getRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$40);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidDel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$40);
            return target;
        }
    }
    
    /**
     * True if has "rsidDel" attribute
     */
    public boolean isSetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDDEL$40) != null;
        }
    }
    
    /**
     * Sets the "rsidDel" attribute
     */
    public void setRsidDel(byte[] rsidDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDDEL$40);
            }
            target.setByteArrayValue(rsidDel);
        }
    }
    
    /**
     * Sets (as xml) the "rsidDel" attribute
     */
    public void xsetRsidDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDDEL$40);
            }
            target.set(rsidDel);
        }
    }
    
    /**
     * Unsets the "rsidDel" attribute
     */
    public void unsetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDDEL$40);
        }
    }
    
    /**
     * Gets the "rsidR" attribute
     */
    public byte[] getRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$42);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidR" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$42);
            return target;
        }
    }
    
    /**
     * True if has "rsidR" attribute
     */
    public boolean isSetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDR$42) != null;
        }
    }
    
    /**
     * Sets the "rsidR" attribute
     */
    public void setRsidR(byte[] rsidR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDR$42);
            }
            target.setByteArrayValue(rsidR);
        }
    }
    
    /**
     * Sets (as xml) the "rsidR" attribute
     */
    public void xsetRsidR(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDR$42);
            }
            target.set(rsidR);
        }
    }
    
    /**
     * Unsets the "rsidR" attribute
     */
    public void unsetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDR$42);
        }
    }
    
    /**
     * Gets the "rsidSect" attribute
     */
    public byte[] getRsidSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDSECT$44);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidSect" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDSECT$44);
            return target;
        }
    }
    
    /**
     * True if has "rsidSect" attribute
     */
    public boolean isSetRsidSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDSECT$44) != null;
        }
    }
    
    /**
     * Sets the "rsidSect" attribute
     */
    public void setRsidSect(byte[] rsidSect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDSECT$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDSECT$44);
            }
            target.setByteArrayValue(rsidSect);
        }
    }
    
    /**
     * Sets (as xml) the "rsidSect" attribute
     */
    public void xsetRsidSect(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidSect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDSECT$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDSECT$44);
            }
            target.set(rsidSect);
        }
    }
    
    /**
     * Unsets the "rsidSect" attribute
     */
    public void unsetRsidSect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDSECT$44);
        }
    }
}
