/*
 * XML Type:  CT_TableCellBorderStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableCellBorderStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableCellBorderStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle
{
    
    public CTTableCellBorderStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "left");
    private static final javax.xml.namespace.QName RIGHT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "right");
    private static final javax.xml.namespace.QName TOP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "top");
    private static final javax.xml.namespace.QName BOTTOM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bottom");
    private static final javax.xml.namespace.QName INSIDEH$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "insideH");
    private static final javax.xml.namespace.QName INSIDEV$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "insideV");
    private static final javax.xml.namespace.QName TL2BR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tl2br");
    private static final javax.xml.namespace.QName TR2BL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tr2bl");
    private static final javax.xml.namespace.QName EXTLST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "left" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "left" element
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEFT$0) != 0;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(LEFT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "left" element
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEFT$0, 0);
        }
    }
    
    /**
     * Gets the "right" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(RIGHT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "right" element
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(RIGHT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(RIGHT$2);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(RIGHT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "right" element
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHT$2, 0);
        }
    }
    
    /**
     * Gets the "top" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TOP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "top" element
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOP$4) != 0;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TOP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TOP$4);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TOP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "top" element
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOP$4, 0);
        }
    }
    
    /**
     * Gets the "bottom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(BOTTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" element
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOTTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(BOTTOM$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(BOTTOM$6);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(BOTTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bottom" element
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOTTOM$6, 0);
        }
    }
    
    /**
     * Gets the "insideH" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(INSIDEH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "insideH" element
     */
    public boolean isSetInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSIDEH$8) != 0;
        }
    }
    
    /**
     * Sets the "insideH" element
     */
    public void setInsideH(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle insideH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(INSIDEH$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(INSIDEH$8);
            }
            target.set(insideH);
        }
    }
    
    /**
     * Appends and returns a new empty "insideH" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(INSIDEH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "insideH" element
     */
    public void unsetInsideH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSIDEH$8, 0);
        }
    }
    
    /**
     * Gets the "insideV" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(INSIDEV$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "insideV" element
     */
    public boolean isSetInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSIDEV$10) != 0;
        }
    }
    
    /**
     * Sets the "insideV" element
     */
    public void setInsideV(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle insideV)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(INSIDEV$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(INSIDEV$10);
            }
            target.set(insideV);
        }
    }
    
    /**
     * Appends and returns a new empty "insideV" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(INSIDEV$10);
            return target;
        }
    }
    
    /**
     * Unsets the "insideV" element
     */
    public void unsetInsideV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSIDEV$10, 0);
        }
    }
    
    /**
     * Gets the "tl2br" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TL2BR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tl2br" element
     */
    public boolean isSetTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TL2BR$12) != 0;
        }
    }
    
    /**
     * Sets the "tl2br" element
     */
    public void setTl2Br(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle tl2Br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TL2BR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TL2BR$12);
            }
            target.set(tl2Br);
        }
    }
    
    /**
     * Appends and returns a new empty "tl2br" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TL2BR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "tl2br" element
     */
    public void unsetTl2Br()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TL2BR$12, 0);
        }
    }
    
    /**
     * Gets the "tr2bl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle getTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TR2BL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tr2bl" element
     */
    public boolean isSetTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TR2BL$14) != 0;
        }
    }
    
    /**
     * Sets the "tr2bl" element
     */
    public void setTr2Bl(org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle tr2Bl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().find_element_user(TR2BL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TR2BL$14);
            }
            target.set(tr2Bl);
        }
    }
    
    /**
     * Appends and returns a new empty "tr2bl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle addNewTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTThemeableLineStyle)get_store().add_element_user(TR2BL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "tr2bl" element
     */
    public void unsetTr2Bl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TR2BL$14, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
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
            return get_store().count_elements(EXTLST$16) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$16);
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
            get_store().remove_element(EXTLST$16, 0);
        }
    }
}
