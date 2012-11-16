/*
 * XML Type:  CT_OleObjectEmbed
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_OleObjectEmbed(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleObjectEmbedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTOleObjectEmbed
{
    
    public CTOleObjectEmbedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName FOLLOWCOLORSCHEME$2 = 
        new javax.xml.namespace.QName("", "followColorScheme");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
     * Gets the "followColorScheme" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme.Enum getFollowColorScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLLOWCOLORSCHEME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FOLLOWCOLORSCHEME$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "followColorScheme" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme xgetFollowColorScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme)get_store().find_attribute_user(FOLLOWCOLORSCHEME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme)get_default_attribute_value(FOLLOWCOLORSCHEME$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "followColorScheme" attribute
     */
    public boolean isSetFollowColorScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOLLOWCOLORSCHEME$2) != null;
        }
    }
    
    /**
     * Sets the "followColorScheme" attribute
     */
    public void setFollowColorScheme(org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme.Enum followColorScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOLLOWCOLORSCHEME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOLLOWCOLORSCHEME$2);
            }
            target.setEnumValue(followColorScheme);
        }
    }
    
    /**
     * Sets (as xml) the "followColorScheme" attribute
     */
    public void xsetFollowColorScheme(org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme followColorScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme)get_store().find_attribute_user(FOLLOWCOLORSCHEME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STOleObjectFollowColorScheme)get_store().add_attribute_user(FOLLOWCOLORSCHEME$2);
            }
            target.set(followColorScheme);
        }
    }
    
    /**
     * Unsets the "followColorScheme" attribute
     */
    public void unsetFollowColorScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOLLOWCOLORSCHEME$2);
        }
    }
}
