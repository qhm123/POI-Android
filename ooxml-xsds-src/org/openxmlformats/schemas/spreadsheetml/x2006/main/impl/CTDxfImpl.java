/*
 * XML Type:  CT_Dxf
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Dxf(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDxfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf
{
    
    public CTDxfImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "font");
    private static final javax.xml.namespace.QName NUMFMT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmt");
    private static final javax.xml.namespace.QName FILL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fill");
    private static final javax.xml.namespace.QName ALIGNMENT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "alignment");
    private static final javax.xml.namespace.QName BORDER$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "border");
    private static final javax.xml.namespace.QName PROTECTION$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protection");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "font" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "font" element
     */
    public boolean isSetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FONT$0) != 0;
        }
    }
    
    /**
     * Sets the "font" element
     */
    public void setFont(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().find_element_user(FONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().add_element_user(FONT$0);
            }
            target.set(font);
        }
    }
    
    /**
     * Appends and returns a new empty "font" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont addNewFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont)get_store().add_element_user(FONT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "font" element
     */
    public void unsetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FONT$0, 0);
        }
    }
    
    /**
     * Gets the "numFmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt getNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numFmt" element
     */
    public boolean isSetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMFMT$2) != 0;
        }
    }
    
    /**
     * Sets the "numFmt" element
     */
    public void setNumFmt(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Appends and returns a new empty "numFmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt addNewNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "numFmt" element
     */
    public void unsetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMFMT$2, 0);
        }
    }
    
    /**
     * Gets the "fill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().find_element_user(FILL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fill" element
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$4) != 0;
        }
    }
    
    /**
     * Sets the "fill" element
     */
    public void setFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().find_element_user(FILL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().add_element_user(FILL$4);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill)get_store().add_element_user(FILL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fill" element
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$4, 0);
        }
    }
    
    /**
     * Gets the "alignment" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().find_element_user(ALIGNMENT$6, 0);
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
            return get_store().count_elements(ALIGNMENT$6) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().find_element_user(ALIGNMENT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().add_element_user(ALIGNMENT$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment)get_store().add_element_user(ALIGNMENT$6);
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
            get_store().remove_element(ALIGNMENT$6, 0);
        }
    }
    
    /**
     * Gets the "border" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder getBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().find_element_user(BORDER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "border" element
     */
    public boolean isSetBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDER$8) != 0;
        }
    }
    
    /**
     * Sets the "border" element
     */
    public void setBorder(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder border)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().find_element_user(BORDER$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().add_element_user(BORDER$8);
            }
            target.set(border);
        }
    }
    
    /**
     * Appends and returns a new empty "border" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder addNewBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder)get_store().add_element_user(BORDER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "border" element
     */
    public void unsetBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDER$8, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().find_element_user(PROTECTION$10, 0);
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
            return get_store().count_elements(PROTECTION$10) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().find_element_user(PROTECTION$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().add_element_user(PROTECTION$10);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection)get_store().add_element_user(PROTECTION$10);
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
            get_store().remove_element(PROTECTION$10, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
        }
    }
}
