/*
 * XML Type:  CT_RevisionAutoFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionAutoFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionAutoFormattingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionAutoFormatting
{
    
    public CTRevisionAutoFormattingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETID$0 = 
        new javax.xml.namespace.QName("", "sheetId");
    private static final javax.xml.namespace.QName AUTOFORMATID$2 = 
        new javax.xml.namespace.QName("", "autoFormatId");
    private static final javax.xml.namespace.QName APPLYNUMBERFORMATS$4 = 
        new javax.xml.namespace.QName("", "applyNumberFormats");
    private static final javax.xml.namespace.QName APPLYBORDERFORMATS$6 = 
        new javax.xml.namespace.QName("", "applyBorderFormats");
    private static final javax.xml.namespace.QName APPLYFONTFORMATS$8 = 
        new javax.xml.namespace.QName("", "applyFontFormats");
    private static final javax.xml.namespace.QName APPLYPATTERNFORMATS$10 = 
        new javax.xml.namespace.QName("", "applyPatternFormats");
    private static final javax.xml.namespace.QName APPLYALIGNMENTFORMATS$12 = 
        new javax.xml.namespace.QName("", "applyAlignmentFormats");
    private static final javax.xml.namespace.QName APPLYWIDTHHEIGHTFORMATS$14 = 
        new javax.xml.namespace.QName("", "applyWidthHeightFormats");
    private static final javax.xml.namespace.QName REF$16 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets the "sheetId" attribute
     */
    public long getSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$0);
            return target;
        }
    }
    
    /**
     * Sets the "sheetId" attribute
     */
    public void setSheetId(long sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETID$0);
            }
            target.setLongValue(sheetId);
        }
    }
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    public void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHEETID$0);
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Gets the "autoFormatId" attribute
     */
    public long getAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoFormatId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$2);
            return target;
        }
    }
    
    /**
     * True if has "autoFormatId" attribute
     */
    public boolean isSetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFORMATID$2) != null;
        }
    }
    
    /**
     * Sets the "autoFormatId" attribute
     */
    public void setAutoFormatId(long autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMATID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFORMATID$2);
            }
            target.setLongValue(autoFormatId);
        }
    }
    
    /**
     * Sets (as xml) the "autoFormatId" attribute
     */
    public void xsetAutoFormatId(org.apache.xmlbeans.XmlUnsignedInt autoFormatId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(AUTOFORMATID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(AUTOFORMATID$2);
            }
            target.set(autoFormatId);
        }
    }
    
    /**
     * Unsets the "autoFormatId" attribute
     */
    public void unsetAutoFormatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFORMATID$2);
        }
    }
    
    /**
     * Gets the "applyNumberFormats" attribute
     */
    public boolean getApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyNumberFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$4);
            return target;
        }
    }
    
    /**
     * True if has "applyNumberFormats" attribute
     */
    public boolean isSetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYNUMBERFORMATS$4) != null;
        }
    }
    
    /**
     * Sets the "applyNumberFormats" attribute
     */
    public void setApplyNumberFormats(boolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYNUMBERFORMATS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYNUMBERFORMATS$4);
            }
            target.setBooleanValue(applyNumberFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyNumberFormats" attribute
     */
    public void xsetApplyNumberFormats(org.apache.xmlbeans.XmlBoolean applyNumberFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYNUMBERFORMATS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYNUMBERFORMATS$4);
            }
            target.set(applyNumberFormats);
        }
    }
    
    /**
     * Unsets the "applyNumberFormats" attribute
     */
    public void unsetApplyNumberFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYNUMBERFORMATS$4);
        }
    }
    
    /**
     * Gets the "applyBorderFormats" attribute
     */
    public boolean getApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyBorderFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$6);
            return target;
        }
    }
    
    /**
     * True if has "applyBorderFormats" attribute
     */
    public boolean isSetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYBORDERFORMATS$6) != null;
        }
    }
    
    /**
     * Sets the "applyBorderFormats" attribute
     */
    public void setApplyBorderFormats(boolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYBORDERFORMATS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYBORDERFORMATS$6);
            }
            target.setBooleanValue(applyBorderFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyBorderFormats" attribute
     */
    public void xsetApplyBorderFormats(org.apache.xmlbeans.XmlBoolean applyBorderFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYBORDERFORMATS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYBORDERFORMATS$6);
            }
            target.set(applyBorderFormats);
        }
    }
    
    /**
     * Unsets the "applyBorderFormats" attribute
     */
    public void unsetApplyBorderFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYBORDERFORMATS$6);
        }
    }
    
    /**
     * Gets the "applyFontFormats" attribute
     */
    public boolean getApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyFontFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$8);
            return target;
        }
    }
    
    /**
     * True if has "applyFontFormats" attribute
     */
    public boolean isSetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYFONTFORMATS$8) != null;
        }
    }
    
    /**
     * Sets the "applyFontFormats" attribute
     */
    public void setApplyFontFormats(boolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYFONTFORMATS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYFONTFORMATS$8);
            }
            target.setBooleanValue(applyFontFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyFontFormats" attribute
     */
    public void xsetApplyFontFormats(org.apache.xmlbeans.XmlBoolean applyFontFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYFONTFORMATS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYFONTFORMATS$8);
            }
            target.set(applyFontFormats);
        }
    }
    
    /**
     * Unsets the "applyFontFormats" attribute
     */
    public void unsetApplyFontFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYFONTFORMATS$8);
        }
    }
    
    /**
     * Gets the "applyPatternFormats" attribute
     */
    public boolean getApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyPatternFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$10);
            return target;
        }
    }
    
    /**
     * True if has "applyPatternFormats" attribute
     */
    public boolean isSetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYPATTERNFORMATS$10) != null;
        }
    }
    
    /**
     * Sets the "applyPatternFormats" attribute
     */
    public void setApplyPatternFormats(boolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYPATTERNFORMATS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYPATTERNFORMATS$10);
            }
            target.setBooleanValue(applyPatternFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyPatternFormats" attribute
     */
    public void xsetApplyPatternFormats(org.apache.xmlbeans.XmlBoolean applyPatternFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYPATTERNFORMATS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYPATTERNFORMATS$10);
            }
            target.set(applyPatternFormats);
        }
    }
    
    /**
     * Unsets the "applyPatternFormats" attribute
     */
    public void unsetApplyPatternFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYPATTERNFORMATS$10);
        }
    }
    
    /**
     * Gets the "applyAlignmentFormats" attribute
     */
    public boolean getApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyAlignmentFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$12);
            return target;
        }
    }
    
    /**
     * True if has "applyAlignmentFormats" attribute
     */
    public boolean isSetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYALIGNMENTFORMATS$12) != null;
        }
    }
    
    /**
     * Sets the "applyAlignmentFormats" attribute
     */
    public void setApplyAlignmentFormats(boolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$12);
            }
            target.setBooleanValue(applyAlignmentFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyAlignmentFormats" attribute
     */
    public void xsetApplyAlignmentFormats(org.apache.xmlbeans.XmlBoolean applyAlignmentFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYALIGNMENTFORMATS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYALIGNMENTFORMATS$12);
            }
            target.set(applyAlignmentFormats);
        }
    }
    
    /**
     * Unsets the "applyAlignmentFormats" attribute
     */
    public void unsetApplyAlignmentFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYALIGNMENTFORMATS$12);
        }
    }
    
    /**
     * Gets the "applyWidthHeightFormats" attribute
     */
    public boolean getApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyWidthHeightFormats" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            return target;
        }
    }
    
    /**
     * True if has "applyWidthHeightFormats" attribute
     */
    public boolean isSetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$14) != null;
        }
    }
    
    /**
     * Sets the "applyWidthHeightFormats" attribute
     */
    public void setApplyWidthHeightFormats(boolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            }
            target.setBooleanValue(applyWidthHeightFormats);
        }
    }
    
    /**
     * Sets (as xml) the "applyWidthHeightFormats" attribute
     */
    public void xsetApplyWidthHeightFormats(org.apache.xmlbeans.XmlBoolean applyWidthHeightFormats)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$14);
            }
            target.set(applyWidthHeightFormats);
        }
    }
    
    /**
     * Unsets the "applyWidthHeightFormats" attribute
     */
    public void unsetApplyWidthHeightFormats()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYWIDTHHEIGHTFORMATS$14);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$16);
            return target;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$16);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$16);
            }
            target.set(ref);
        }
    }
}
