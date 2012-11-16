/*
 * XML Type:  CT_Xf
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Xf(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTXfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf
{
    
    public CTXfImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "alignment");
    private static final javax.xml.namespace.QName PROTECTION$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protection");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NUMFMTID$6 = 
        new javax.xml.namespace.QName("", "numFmtId");
    private static final javax.xml.namespace.QName FONTID$8 = 
        new javax.xml.namespace.QName("", "fontId");
    private static final javax.xml.namespace.QName FILLID$10 = 
        new javax.xml.namespace.QName("", "fillId");
    private static final javax.xml.namespace.QName BORDERID$12 = 
        new javax.xml.namespace.QName("", "borderId");
    private static final javax.xml.namespace.QName XFID$14 = 
        new javax.xml.namespace.QName("", "xfId");
    private static final javax.xml.namespace.QName QUOTEPREFIX$16 = 
        new javax.xml.namespace.QName("", "quotePrefix");
    private static final javax.xml.namespace.QName PIVOTBUTTON$18 = 
        new javax.xml.namespace.QName("", "pivotButton");
    private static final javax.xml.namespace.QName APPLYNUMBERFORMAT$20 = 
        new javax.xml.namespace.QName("", "applyNumberFormat");
    private static final javax.xml.namespace.QName APPLYFONT$22 = 
        new javax.xml.namespace.QName("", "applyFont");
    private static final javax.xml.namespace.QName APPLYFILL$24 = 
        new javax.xml.namespace.QName("", "applyFill");
    private static final javax.xml.namespace.QName APPLYBORDER$26 = 
        new javax.xml.namespace.QName("", "applyBorder");
    private static final javax.xml.namespace.QName APPLYALIGNMENT$28 = 
        new javax.xml.namespace.QName("", "applyAlignment");
    private static final javax.xml.namespace.QName APPLYPROTECTION$30 = 
        new javax.xml.namespace.QName("", "applyProtection");
    
    
    /**
     * Gets the "alignment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().find_element_user(ALIGNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "alignment" element
     */
    public boolean isSetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIGNMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "alignment" element
     */
    public void setAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().find_element_user(ALIGNMENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().add_element_user(ALIGNMENT$0);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Appends and returns a new empty "alignment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment addNewAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().add_element_user(ALIGNMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "alignment" element
     */
    public void unsetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIGNMENT$0, 0);
        }
    }
    
    /**
     * Gets the "protection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection getProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().find_element_user(PROTECTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "protection" element
     */
    public boolean isSetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTECTION$2) != 0;
        }
    }
    
    /**
     * Sets the "protection" element
     */
    public void setProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection protection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().find_element_user(PROTECTION$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().add_element_user(PROTECTION$2);
            }
            target.set(protection);
        }
    }
    
    /**
     * Appends and returns a new empty "protection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection addNewProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().add_element_user(PROTECTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "protection" element
     */
    public void unsetProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTECTION$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "numFmtId" attribute
     */
    public long getNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$6);
            return target;
        }
    }
    
    /**
     * True if has "numFmtId" attribute
     */
    public boolean isSetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMFMTID$6) != null;
        }
    }
    
    /**
     * Sets the "numFmtId" attribute
     */
    public void setNumFmtId(long numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMTID$6);
            }
            target.setLongValue(numFmtId);
        }
    }
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    public void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().add_attribute_user(NUMFMTID$6);
            }
            target.set(numFmtId);
        }
    }
    
    /**
     * Unsets the "numFmtId" attribute
     */
    public void unsetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMFMTID$6);
        }
    }
    
    /**
     * Gets the "fontId" attribute
     */
    public long getFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTID$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId xgetFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().find_attribute_user(FONTID$8);
            return target;
        }
    }
    
    /**
     * True if has "fontId" attribute
     */
    public boolean isSetFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FONTID$8) != null;
        }
    }
    
    /**
     * Sets the "fontId" attribute
     */
    public void setFontId(long fontId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTID$8);
            }
            target.setLongValue(fontId);
        }
    }
    
    /**
     * Sets (as xml) the "fontId" attribute
     */
    public void xsetFontId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId fontId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().find_attribute_user(FONTID$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().add_attribute_user(FONTID$8);
            }
            target.set(fontId);
        }
    }
    
    /**
     * Unsets the "fontId" attribute
     */
    public void unsetFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FONTID$8);
        }
    }
    
    /**
     * Gets the "fillId" attribute
     */
    public long getFillId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLID$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId xgetFillId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId)get_store().find_attribute_user(FILLID$10);
            return target;
        }
    }
    
    /**
     * True if has "fillId" attribute
     */
    public boolean isSetFillId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLID$10) != null;
        }
    }
    
    /**
     * Sets the "fillId" attribute
     */
    public void setFillId(long fillId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLID$10);
            }
            target.setLongValue(fillId);
        }
    }
    
    /**
     * Sets (as xml) the "fillId" attribute
     */
    public void xsetFillId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId fillId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId)get_store().find_attribute_user(FILLID$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFillId)get_store().add_attribute_user(FILLID$10);
            }
            target.set(fillId);
        }
    }
    
    /**
     * Unsets the "fillId" attribute
     */
    public void unsetFillId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLID$10);
        }
    }
    
    /**
     * Gets the "borderId" attribute
     */
    public long getBorderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId xgetBorderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId)get_store().find_attribute_user(BORDERID$12);
            return target;
        }
    }
    
    /**
     * True if has "borderId" attribute
     */
    public boolean isSetBorderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERID$12) != null;
        }
    }
    
    /**
     * Sets the "borderId" attribute
     */
    public void setBorderId(long borderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERID$12);
            }
            target.setLongValue(borderId);
        }
    }
    
    /**
     * Sets (as xml) the "borderId" attribute
     */
    public void xsetBorderId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId borderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId)get_store().find_attribute_user(BORDERID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderId)get_store().add_attribute_user(BORDERID$12);
            }
            target.set(borderId);
        }
    }
    
    /**
     * Unsets the "borderId" attribute
     */
    public void unsetBorderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERID$12);
        }
    }
    
    /**
     * Gets the "xfId" attribute
     */
    public long getXfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFID$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "xfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xgetXfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId)get_store().find_attribute_user(XFID$14);
            return target;
        }
    }
    
    /**
     * True if has "xfId" attribute
     */
    public boolean isSetXfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XFID$14) != null;
        }
    }
    
    /**
     * Sets the "xfId" attribute
     */
    public void setXfId(long xfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XFID$14);
            }
            target.setLongValue(xfId);
        }
    }
    
    /**
     * Sets (as xml) the "xfId" attribute
     */
    public void xsetXfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId xfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId)get_store().find_attribute_user(XFID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellStyleXfId)get_store().add_attribute_user(XFID$14);
            }
            target.set(xfId);
        }
    }
    
    /**
     * Unsets the "xfId" attribute
     */
    public void unsetXfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XFID$14);
        }
    }
    
    /**
     * Gets the "quotePrefix" attribute
     */
    public boolean getQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUOTEPREFIX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(QUOTEPREFIX$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "quotePrefix" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUOTEPREFIX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(QUOTEPREFIX$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "quotePrefix" attribute
     */
    public boolean isSetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUOTEPREFIX$16) != null;
        }
    }
    
    /**
     * Sets the "quotePrefix" attribute
     */
    public void setQuotePrefix(boolean quotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUOTEPREFIX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUOTEPREFIX$16);
            }
            target.setBooleanValue(quotePrefix);
        }
    }
    
    /**
     * Sets (as xml) the "quotePrefix" attribute
     */
    public void xsetQuotePrefix(org.apache.xmlbeans.XmlBoolean quotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUOTEPREFIX$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(QUOTEPREFIX$16);
            }
            target.set(quotePrefix);
        }
    }
    
    /**
     * Unsets the "quotePrefix" attribute
     */
    public void unsetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUOTEPREFIX$16);
        }
    }
    
    /**
     * Gets the "pivotButton" attribute
     */
    public boolean getPivotButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PIVOTBUTTON$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pivotButton" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPivotButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOTBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PIVOTBUTTON$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "pivotButton" attribute
     */
    public boolean isSetPivotButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PIVOTBUTTON$18) != null;
        }
    }
    
    /**
     * Sets the "pivotButton" attribute
     */
    public void setPivotButton(boolean pivotButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOTBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIVOTBUTTON$18);
            }
            target.setBooleanValue(pivotButton);
        }
    }
    
    /**
     * Sets (as xml) the "pivotButton" attribute
     */
    public void xsetPivotButton(org.apache.xmlbeans.XmlBoolean pivotButton)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOTBUTTON$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PIVOTBUTTON$18);
            }
            target.set(pivotButton);
        }
    }
    
    /**
     * Unsets the "pivotButton" attribute
     */
    public void unsetPivotButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PIVOTBUTTON$18);
        }
    }
    
    /**
     * Gets the "applyNumberFormat" attribute
     */
    public boolean getApplyNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyNumberFormat" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
            return target;
        }
    }
    
    /**
     * True if has "applyNumberFormat" attribute
     */
    public boolean isSetApplyNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYNUMBERFORMAT$20) != null;
        }
    }
    
    /**
     * Sets the "applyNumberFormat" attribute
     */
    public void setApplyNumberFormat(boolean applyNumberFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYNUMBERFORMAT$20);
            }
            target.setBooleanValue(applyNumberFormat);
        }
    }
    
    /**
     * Sets (as xml) the "applyNumberFormat" attribute
     */
    public void xsetApplyNumberFormat(org.apache.xmlbeans.XmlBoolean applyNumberFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMAT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYNUMBERFORMAT$20);
            }
            target.set(applyNumberFormat);
        }
    }
    
    /**
     * Unsets the "applyNumberFormat" attribute
     */
    public void unsetApplyNumberFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYNUMBERFORMAT$20);
        }
    }
    
    /**
     * Gets the "applyFont" attribute
     */
    public boolean getApplyFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONT$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyFont" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONT$22);
            return target;
        }
    }
    
    /**
     * True if has "applyFont" attribute
     */
    public boolean isSetApplyFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFONT$22) != null;
        }
    }
    
    /**
     * Sets the "applyFont" attribute
     */
    public void setApplyFont(boolean applyFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFONT$22);
            }
            target.setBooleanValue(applyFont);
        }
    }
    
    /**
     * Sets (as xml) the "applyFont" attribute
     */
    public void xsetApplyFont(org.apache.xmlbeans.XmlBoolean applyFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFONT$22);
            }
            target.set(applyFont);
        }
    }
    
    /**
     * Unsets the "applyFont" attribute
     */
    public void unsetApplyFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFONT$22);
        }
    }
    
    /**
     * Gets the "applyFill" attribute
     */
    public boolean getApplyFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFILL$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyFill" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFILL$24);
            return target;
        }
    }
    
    /**
     * True if has "applyFill" attribute
     */
    public boolean isSetApplyFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFILL$24) != null;
        }
    }
    
    /**
     * Sets the "applyFill" attribute
     */
    public void setApplyFill(boolean applyFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFILL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFILL$24);
            }
            target.setBooleanValue(applyFill);
        }
    }
    
    /**
     * Sets (as xml) the "applyFill" attribute
     */
    public void xsetApplyFill(org.apache.xmlbeans.XmlBoolean applyFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFILL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFILL$24);
            }
            target.set(applyFill);
        }
    }
    
    /**
     * Unsets the "applyFill" attribute
     */
    public void unsetApplyFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFILL$24);
        }
    }
    
    /**
     * Gets the "applyBorder" attribute
     */
    public boolean getApplyBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDER$26);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyBorder" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDER$26);
            return target;
        }
    }
    
    /**
     * True if has "applyBorder" attribute
     */
    public boolean isSetApplyBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYBORDER$26) != null;
        }
    }
    
    /**
     * Sets the "applyBorder" attribute
     */
    public void setApplyBorder(boolean applyBorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYBORDER$26);
            }
            target.setBooleanValue(applyBorder);
        }
    }
    
    /**
     * Sets (as xml) the "applyBorder" attribute
     */
    public void xsetApplyBorder(org.apache.xmlbeans.XmlBoolean applyBorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYBORDER$26);
            }
            target.set(applyBorder);
        }
    }
    
    /**
     * Unsets the "applyBorder" attribute
     */
    public void unsetApplyBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYBORDER$26);
        }
    }
    
    /**
     * Gets the "applyAlignment" attribute
     */
    public boolean getApplyAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENT$28);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyAlignment" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENT$28);
            return target;
        }
    }
    
    /**
     * True if has "applyAlignment" attribute
     */
    public boolean isSetApplyAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYALIGNMENT$28) != null;
        }
    }
    
    /**
     * Sets the "applyAlignment" attribute
     */
    public void setApplyAlignment(boolean applyAlignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYALIGNMENT$28);
            }
            target.setBooleanValue(applyAlignment);
        }
    }
    
    /**
     * Sets (as xml) the "applyAlignment" attribute
     */
    public void xsetApplyAlignment(org.apache.xmlbeans.XmlBoolean applyAlignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYALIGNMENT$28);
            }
            target.set(applyAlignment);
        }
    }
    
    /**
     * Unsets the "applyAlignment" attribute
     */
    public void unsetApplyAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYALIGNMENT$28);
        }
    }
    
    /**
     * Gets the "applyProtection" attribute
     */
    public boolean getApplyProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPROTECTION$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyProtection" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPROTECTION$30);
            return target;
        }
    }
    
    /**
     * True if has "applyProtection" attribute
     */
    public boolean isSetApplyProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYPROTECTION$30) != null;
        }
    }
    
    /**
     * Sets the "applyProtection" attribute
     */
    public void setApplyProtection(boolean applyProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPROTECTION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYPROTECTION$30);
            }
            target.setBooleanValue(applyProtection);
        }
    }
    
    /**
     * Sets (as xml) the "applyProtection" attribute
     */
    public void xsetApplyProtection(org.apache.xmlbeans.XmlBoolean applyProtection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPROTECTION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYPROTECTION$30);
            }
            target.set(applyProtection);
        }
    }
    
    /**
     * Unsets the "applyProtection" attribute
     */
    public void unsetApplyProtection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYPROTECTION$30);
        }
    }
}
