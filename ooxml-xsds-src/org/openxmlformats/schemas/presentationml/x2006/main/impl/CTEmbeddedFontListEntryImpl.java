/*
 * XML Type:  CT_EmbeddedFontListEntry
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_EmbeddedFontListEntry(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTEmbeddedFontListEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontListEntry
{
    
    public CTEmbeddedFontListEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "font");
    private static final javax.xml.namespace.QName REGULAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "regular");
    private static final javax.xml.namespace.QName BOLD$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bold");
    private static final javax.xml.namespace.QName ITALIC$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "italic");
    private static final javax.xml.namespace.QName BOLDITALIC$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "boldItalic");
    
    
    /**
     * Gets the "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "font" element
     */
    public void setFont(org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(FONT$0);
            }
            target.set(font);
        }
    }
    
    /**
     * Appends and returns a new empty "font" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont)get_store().add_element_user(FONT$0);
            return target;
        }
    }
    
    /**
     * Gets the "regular" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId getRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(REGULAR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regular" element
     */
    public boolean isSetRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGULAR$2) != 0;
        }
    }
    
    /**
     * Sets the "regular" element
     */
    public void setRegular(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId regular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(REGULAR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(REGULAR$2);
            }
            target.set(regular);
        }
    }
    
    /**
     * Appends and returns a new empty "regular" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId addNewRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(REGULAR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "regular" element
     */
    public void unsetRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGULAR$2, 0);
        }
    }
    
    /**
     * Gets the "bold" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId getBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(BOLD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bold" element
     */
    public boolean isSetBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOLD$4) != 0;
        }
    }
    
    /**
     * Sets the "bold" element
     */
    public void setBold(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId bold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(BOLD$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(BOLD$4);
            }
            target.set(bold);
        }
    }
    
    /**
     * Appends and returns a new empty "bold" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId addNewBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(BOLD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bold" element
     */
    public void unsetBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOLD$4, 0);
        }
    }
    
    /**
     * Gets the "italic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId getItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(ITALIC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "italic" element
     */
    public boolean isSetItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITALIC$6) != 0;
        }
    }
    
    /**
     * Sets the "italic" element
     */
    public void setItalic(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId italic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(ITALIC$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(ITALIC$6);
            }
            target.set(italic);
        }
    }
    
    /**
     * Appends and returns a new empty "italic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId addNewItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(ITALIC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "italic" element
     */
    public void unsetItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITALIC$6, 0);
        }
    }
    
    /**
     * Gets the "boldItalic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId getBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(BOLDITALIC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "boldItalic" element
     */
    public boolean isSetBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOLDITALIC$8) != 0;
        }
    }
    
    /**
     * Sets the "boldItalic" element
     */
    public void setBoldItalic(org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId boldItalic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().find_element_user(BOLDITALIC$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(BOLDITALIC$8);
            }
            target.set(boldItalic);
        }
    }
    
    /**
     * Appends and returns a new empty "boldItalic" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId addNewBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontDataId)get_store().add_element_user(BOLDITALIC$8);
            return target;
        }
    }
    
    /**
     * Unsets the "boldItalic" element
     */
    public void unsetBoldItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOLDITALIC$8, 0);
        }
    }
}
