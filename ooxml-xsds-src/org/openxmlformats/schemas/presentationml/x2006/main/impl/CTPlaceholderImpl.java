/*
 * XML Type:  CT_Placeholder
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_Placeholder(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTPlaceholderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder
{
    
    public CTPlaceholderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ORIENT$4 = 
        new javax.xml.namespace.QName("", "orient");
    private static final javax.xml.namespace.QName SZ$6 = 
        new javax.xml.namespace.QName("", "sz");
    private static final javax.xml.namespace.QName IDX$8 = 
        new javax.xml.namespace.QName("", "idx");
    private static final javax.xml.namespace.QName HASCUSTOMPROMPT$10 = 
        new javax.xml.namespace.QName("", "hasCustomPrompt");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType)get_default_attribute_value(TYPE$2);
            }
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
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType)get_store().add_attribute_user(TYPE$2);
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
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "orient" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum getOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENT$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orient" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STDirection xgetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().find_attribute_user(ORIENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_default_attribute_value(ORIENT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "orient" attribute
     */
    public boolean isSetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENT$4) != null;
        }
    }
    
    /**
     * Sets the "orient" attribute
     */
    public void setOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection.Enum orient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENT$4);
            }
            target.setEnumValue(orient);
        }
    }
    
    /**
     * Sets (as xml) the "orient" attribute
     */
    public void xsetOrient(org.openxmlformats.schemas.presentationml.x2006.main.STDirection orient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STDirection target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().find_attribute_user(ORIENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STDirection)get_store().add_attribute_user(ORIENT$4);
            }
            target.set(orient);
        }
    }
    
    /**
     * Unsets the "orient" attribute
     */
    public void unsetOrient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENT$4);
        }
    }
    
    /**
     * Gets the "sz" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize.Enum getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SZ$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sz" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize xgetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize)get_store().find_attribute_user(SZ$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize)get_default_attribute_value(SZ$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "sz" attribute
     */
    public boolean isSetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SZ$6) != null;
        }
    }
    
    /**
     * Sets the "sz" attribute
     */
    public void setSz(org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize.Enum sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SZ$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SZ$6);
            }
            target.setEnumValue(sz);
        }
    }
    
    /**
     * Sets (as xml) the "sz" attribute
     */
    public void xsetSz(org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize)get_store().find_attribute_user(SZ$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize)get_store().add_attribute_user(SZ$6);
            }
            target.set(sz);
        }
    }
    
    /**
     * Unsets the "sz" attribute
     */
    public void unsetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SZ$6);
        }
    }
    
    /**
     * Gets the "idx" attribute
     */
    public long getIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IDX$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "idx" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IDX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(IDX$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "idx" attribute
     */
    public boolean isSetIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDX$8) != null;
        }
    }
    
    /**
     * Sets the "idx" attribute
     */
    public void setIdx(long idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDX$8);
            }
            target.setLongValue(idx);
        }
    }
    
    /**
     * Sets (as xml) the "idx" attribute
     */
    public void xsetIdx(org.apache.xmlbeans.XmlUnsignedInt idx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IDX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(IDX$8);
            }
            target.set(idx);
        }
    }
    
    /**
     * Unsets the "idx" attribute
     */
    public void unsetIdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDX$8);
        }
    }
    
    /**
     * Gets the "hasCustomPrompt" attribute
     */
    public boolean getHasCustomPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASCUSTOMPROMPT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HASCUSTOMPROMPT$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasCustomPrompt" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasCustomPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASCUSTOMPROMPT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HASCUSTOMPROMPT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "hasCustomPrompt" attribute
     */
    public boolean isSetHasCustomPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HASCUSTOMPROMPT$10) != null;
        }
    }
    
    /**
     * Sets the "hasCustomPrompt" attribute
     */
    public void setHasCustomPrompt(boolean hasCustomPrompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HASCUSTOMPROMPT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HASCUSTOMPROMPT$10);
            }
            target.setBooleanValue(hasCustomPrompt);
        }
    }
    
    /**
     * Sets (as xml) the "hasCustomPrompt" attribute
     */
    public void xsetHasCustomPrompt(org.apache.xmlbeans.XmlBoolean hasCustomPrompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HASCUSTOMPROMPT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HASCUSTOMPROMPT$10);
            }
            target.set(hasCustomPrompt);
        }
    }
    
    /**
     * Unsets the "hasCustomPrompt" attribute
     */
    public void unsetHasCustomPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HASCUSTOMPROMPT$10);
        }
    }
}
