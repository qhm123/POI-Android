/*
 * XML Type:  CT_SectPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SectPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSectPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr
{
    
    public CTSectPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "headerReference");
    private static final javax.xml.namespace.QName FOOTERREFERENCE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footerReference");
    private static final javax.xml.namespace.QName FOOTNOTEPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotePr");
    private static final javax.xml.namespace.QName ENDNOTEPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotePr");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName PGSZ$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgSz");
    private static final javax.xml.namespace.QName PGMAR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgMar");
    private static final javax.xml.namespace.QName PAPERSRC$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "paperSrc");
    private static final javax.xml.namespace.QName PGBORDERS$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgBorders");
    private static final javax.xml.namespace.QName LNNUMTYPE$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lnNumType");
    private static final javax.xml.namespace.QName PGNUMTYPE$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgNumType");
    private static final javax.xml.namespace.QName COLS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cols");
    private static final javax.xml.namespace.QName FORMPROT$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formProt");
    private static final javax.xml.namespace.QName VALIGN$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAlign");
    private static final javax.xml.namespace.QName NOENDNOTE$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noEndnote");
    private static final javax.xml.namespace.QName TITLEPG$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "titlePg");
    private static final javax.xml.namespace.QName TEXTDIRECTION$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
    private static final javax.xml.namespace.QName BIDI$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");
    private static final javax.xml.namespace.QName RTLGUTTER$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rtlGutter");
    private static final javax.xml.namespace.QName DOCGRID$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docGrid");
    private static final javax.xml.namespace.QName PRINTERSETTINGS$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printerSettings");
    private static final javax.xml.namespace.QName SECTPRCHANGE$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sectPrChange");
    private static final javax.xml.namespace.QName RSIDRPR$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
    private static final javax.xml.namespace.QName RSIDDEL$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
    private static final javax.xml.namespace.QName RSIDR$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");
    private static final javax.xml.namespace.QName RSIDSECT$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidSect");
    
    
    /**
     * Gets a List of "headerReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef> getHeaderReferenceList()
    {
        final class HeaderReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef get(int i)
                { return CTSectPrImpl.this.getHeaderReferenceArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef old = CTSectPrImpl.this.getHeaderReferenceArray(i);
                CTSectPrImpl.this.setHeaderReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef o)
                { CTSectPrImpl.this.insertNewHeaderReference(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef old = CTSectPrImpl.this.getHeaderReferenceArray(i);
                CTSectPrImpl.this.removeHeaderReference(i);
                return old;
            }
            
            public int size()
                { return CTSectPrImpl.this.sizeOfHeaderReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HeaderReferenceList();
        }
    }
    
    /**
     * Gets array of all "headerReference" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] getHeaderReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HEADERREFERENCE$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "headerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef getHeaderReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().find_element_user(HEADERREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "headerReference" element
     */
    public int sizeOfHeaderReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERREFERENCE$0);
        }
    }
    
    /**
     * Sets array of all "headerReference" element
     */
    public void setHeaderReferenceArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] headerReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headerReferenceArray, HEADERREFERENCE$0);
        }
    }
    
    /**
     * Sets ith "headerReference" element
     */
    public void setHeaderReferenceArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef headerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().find_element_user(HEADERREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(headerReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "headerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef insertNewHeaderReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().insert_element_user(HEADERREFERENCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "headerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef addNewHeaderReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().add_element_user(HEADERREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "headerReference" element
     */
    public void removeHeaderReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERREFERENCE$0, i);
        }
    }
    
    /**
     * Gets a List of "footerReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef> getFooterReferenceList()
    {
        final class FooterReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef get(int i)
                { return CTSectPrImpl.this.getFooterReferenceArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef old = CTSectPrImpl.this.getFooterReferenceArray(i);
                CTSectPrImpl.this.setFooterReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef o)
                { CTSectPrImpl.this.insertNewFooterReference(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef old = CTSectPrImpl.this.getFooterReferenceArray(i);
                CTSectPrImpl.this.removeFooterReference(i);
                return old;
            }
            
            public int size()
                { return CTSectPrImpl.this.sizeOfFooterReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FooterReferenceList();
        }
    }
    
    /**
     * Gets array of all "footerReference" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] getFooterReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTERREFERENCE$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef getFooterReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().find_element_user(FOOTERREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footerReference" element
     */
    public int sizeOfFooterReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTERREFERENCE$2);
        }
    }
    
    /**
     * Sets array of all "footerReference" element
     */
    public void setFooterReferenceArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef[] footerReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footerReferenceArray, FOOTERREFERENCE$2);
        }
    }
    
    /**
     * Sets ith "footerReference" element
     */
    public void setFooterReferenceArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef footerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().find_element_user(FOOTERREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footerReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef insertNewFooterReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().insert_element_user(FOOTERREFERENCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footerReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef addNewFooterReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef)get_store().add_element_user(FOOTERREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "footerReference" element
     */
    public void removeFooterReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTERREFERENCE$2, i);
        }
    }
    
    /**
     * Gets the "footnotePr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps getFootnotePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().find_element_user(FOOTNOTEPR$4, 0);
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
            return get_store().count_elements(FOOTNOTEPR$4) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().find_element_user(FOOTNOTEPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().add_element_user(FOOTNOTEPR$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps)get_store().add_element_user(FOOTNOTEPR$4);
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
            get_store().remove_element(FOOTNOTEPR$4, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().find_element_user(ENDNOTEPR$6, 0);
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
            return get_store().count_elements(ENDNOTEPR$6) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().find_element_user(ENDNOTEPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().add_element_user(ENDNOTEPR$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps)get_store().add_element_user(ENDNOTEPR$6);
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
            get_store().remove_element(ENDNOTEPR$6, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().find_element_user(TYPE$8, 0);
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
            return get_store().count_elements(TYPE$8) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().find_element_user(TYPE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().add_element_user(TYPE$8);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType)get_store().add_element_user(TYPE$8);
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
            get_store().remove_element(TYPE$8, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().find_element_user(PGSZ$10, 0);
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
            return get_store().count_elements(PGSZ$10) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().find_element_user(PGSZ$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().add_element_user(PGSZ$10);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz)get_store().add_element_user(PGSZ$10);
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
            get_store().remove_element(PGSZ$10, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().find_element_user(PGMAR$12, 0);
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
            return get_store().count_elements(PGMAR$12) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().find_element_user(PGMAR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().add_element_user(PGMAR$12);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar)get_store().add_element_user(PGMAR$12);
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
            get_store().remove_element(PGMAR$12, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().find_element_user(PAPERSRC$14, 0);
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
            return get_store().count_elements(PAPERSRC$14) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().find_element_user(PAPERSRC$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().add_element_user(PAPERSRC$14);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource)get_store().add_element_user(PAPERSRC$14);
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
            get_store().remove_element(PAPERSRC$14, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().find_element_user(PGBORDERS$16, 0);
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
            return get_store().count_elements(PGBORDERS$16) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().find_element_user(PGBORDERS$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().add_element_user(PGBORDERS$16);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders)get_store().add_element_user(PGBORDERS$16);
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
            get_store().remove_element(PGBORDERS$16, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().find_element_user(LNNUMTYPE$18, 0);
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
            return get_store().count_elements(LNNUMTYPE$18) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().find_element_user(LNNUMTYPE$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().add_element_user(LNNUMTYPE$18);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber)get_store().add_element_user(LNNUMTYPE$18);
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
            get_store().remove_element(LNNUMTYPE$18, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().find_element_user(PGNUMTYPE$20, 0);
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
            return get_store().count_elements(PGNUMTYPE$20) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().find_element_user(PGNUMTYPE$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().add_element_user(PGNUMTYPE$20);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber)get_store().add_element_user(PGNUMTYPE$20);
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
            get_store().remove_element(PGNUMTYPE$20, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().find_element_user(COLS$22, 0);
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
            return get_store().count_elements(COLS$22) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().find_element_user(COLS$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().add_element_user(COLS$22);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns)get_store().add_element_user(COLS$22);
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
            get_store().remove_element(COLS$22, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMPROT$24, 0);
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
            return get_store().count_elements(FORMPROT$24) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FORMPROT$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMPROT$24);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FORMPROT$24);
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
            get_store().remove_element(FORMPROT$24, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$26, 0);
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
            return get_store().count_elements(VALIGN$26) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$26);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$26);
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
            get_store().remove_element(VALIGN$26, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOENDNOTE$28, 0);
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
            return get_store().count_elements(NOENDNOTE$28) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOENDNOTE$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOENDNOTE$28);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOENDNOTE$28);
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
            get_store().remove_element(NOENDNOTE$28, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TITLEPG$30, 0);
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
            return get_store().count_elements(TITLEPG$30) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TITLEPG$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TITLEPG$30);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TITLEPG$30);
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
            get_store().remove_element(TITLEPG$30, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$32, 0);
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
            return get_store().count_elements(TEXTDIRECTION$32) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$32);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$32);
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
            get_store().remove_element(TEXTDIRECTION$32, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDI$34, 0);
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
            return get_store().count_elements(BIDI$34) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDI$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDI$34);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDI$34);
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
            get_store().remove_element(BIDI$34, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTLGUTTER$36, 0);
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
            return get_store().count_elements(RTLGUTTER$36) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTLGUTTER$36, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RTLGUTTER$36);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RTLGUTTER$36);
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
            get_store().remove_element(RTLGUTTER$36, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().find_element_user(DOCGRID$38, 0);
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
            return get_store().count_elements(DOCGRID$38) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().find_element_user(DOCGRID$38, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().add_element_user(DOCGRID$38);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid)get_store().add_element_user(DOCGRID$38);
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
            get_store().remove_element(DOCGRID$38, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(PRINTERSETTINGS$40, 0);
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
            return get_store().count_elements(PRINTERSETTINGS$40) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(PRINTERSETTINGS$40, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(PRINTERSETTINGS$40);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(PRINTERSETTINGS$40);
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
            get_store().remove_element(PRINTERSETTINGS$40, 0);
        }
    }
    
    /**
     * Gets the "sectPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange getSectPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange)get_store().find_element_user(SECTPRCHANGE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sectPrChange" element
     */
    public boolean isSetSectPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTPRCHANGE$42) != 0;
        }
    }
    
    /**
     * Sets the "sectPrChange" element
     */
    public void setSectPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange sectPrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange)get_store().find_element_user(SECTPRCHANGE$42, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange)get_store().add_element_user(SECTPRCHANGE$42);
            }
            target.set(sectPrChange);
        }
    }
    
    /**
     * Appends and returns a new empty "sectPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange addNewSectPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange)get_store().add_element_user(SECTPRCHANGE$42);
            return target;
        }
    }
    
    /**
     * Unsets the "sectPrChange" element
     */
    public void unsetSectPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTPRCHANGE$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$44);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$44);
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
            return get_store().find_attribute_user(RSIDRPR$44) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDRPR$44);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDRPR$44);
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
            get_store().remove_attribute(RSIDRPR$44);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$46);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$46);
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
            return get_store().find_attribute_user(RSIDDEL$46) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDDEL$46);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDDEL$46);
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
            get_store().remove_attribute(RSIDDEL$46);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$48);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$48);
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
            return get_store().find_attribute_user(RSIDR$48) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDR$48);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDR$48);
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
            get_store().remove_attribute(RSIDR$48);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDSECT$50);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDSECT$50);
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
            return get_store().find_attribute_user(RSIDSECT$50) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDSECT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDSECT$50);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDSECT$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDSECT$50);
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
            get_store().remove_attribute(RSIDSECT$50);
        }
    }
}
