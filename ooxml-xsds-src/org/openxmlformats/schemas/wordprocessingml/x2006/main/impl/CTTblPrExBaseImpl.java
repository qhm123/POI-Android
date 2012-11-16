/*
 * XML Type:  CT_TblPrExBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPrExBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrExBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase
{
    
    public CTTblPrExBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLW$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblW");
    private static final javax.xml.namespace.QName JC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
    private static final javax.xml.namespace.QName TBLCELLSPACING$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
    private static final javax.xml.namespace.QName TBLIND$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblInd");
    private static final javax.xml.namespace.QName TBLBORDERS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblBorders");
    private static final javax.xml.namespace.QName SHD$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
    private static final javax.xml.namespace.QName TBLLAYOUT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLayout");
    private static final javax.xml.namespace.QName TBLCELLMAR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellMar");
    private static final javax.xml.namespace.QName TBLLOOK$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLook");
    
    
    /**
     * Gets the "tblW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTblW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblW" element
     */
    public boolean isSetTblW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLW$0) != 0;
        }
    }
    
    /**
     * Sets the "tblW" element
     */
    public void setTblW(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth tblW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLW$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLW$0);
            }
            target.set(tblW);
        }
    }
    
    /**
     * Appends and returns a new empty "tblW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewTblW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblW" element
     */
    public void unsetTblW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLW$0, 0);
        }
    }
    
    /**
     * Gets the "jc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc getJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jc" element
     */
    public boolean isSetJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JC$2) != 0;
        }
    }
    
    /**
     * Sets the "jc" element
     */
    public void setJc(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc jc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(JC$2);
            }
            target.set(jc);
        }
    }
    
    /**
     * Appends and returns a new empty "jc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc addNewJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(JC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "jc" element
     */
    public void unsetJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JC$2, 0);
        }
    }
    
    /**
     * Gets the "tblCellSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTblCellSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblCellSpacing" element
     */
    public boolean isSetTblCellSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLCELLSPACING$4) != 0;
        }
    }
    
    /**
     * Sets the "tblCellSpacing" element
     */
    public void setTblCellSpacing(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth tblCellSpacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLCELLSPACING$4);
            }
            target.set(tblCellSpacing);
        }
    }
    
    /**
     * Appends and returns a new empty "tblCellSpacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewTblCellSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLCELLSPACING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tblCellSpacing" element
     */
    public void unsetTblCellSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLCELLSPACING$4, 0);
        }
    }
    
    /**
     * Gets the "tblInd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTblInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLIND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblInd" element
     */
    public boolean isSetTblInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLIND$6) != 0;
        }
    }
    
    /**
     * Sets the "tblInd" element
     */
    public void setTblInd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth tblInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLIND$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLIND$6);
            }
            target.set(tblInd);
        }
    }
    
    /**
     * Appends and returns a new empty "tblInd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewTblInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLIND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "tblInd" element
     */
    public void unsetTblInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLIND$6, 0);
        }
    }
    
    /**
     * Gets the "tblBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders getTblBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().find_element_user(TBLBORDERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblBorders" element
     */
    public boolean isSetTblBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLBORDERS$8) != 0;
        }
    }
    
    /**
     * Sets the "tblBorders" element
     */
    public void setTblBorders(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders tblBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().find_element_user(TBLBORDERS$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().add_element_user(TBLBORDERS$8);
            }
            target.set(tblBorders);
        }
    }
    
    /**
     * Appends and returns a new empty "tblBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders addNewTblBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().add_element_user(TBLBORDERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "tblBorders" element
     */
    public void unsetTblBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLBORDERS$8, 0);
        }
    }
    
    /**
     * Gets the "shd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd getShd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shd" element
     */
    public boolean isSetShd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHD$10) != 0;
        }
    }
    
    /**
     * Sets the "shd" element
     */
    public void setShd(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd shd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$10);
            }
            target.set(shd);
        }
    }
    
    /**
     * Appends and returns a new empty "shd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd addNewShd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "shd" element
     */
    public void unsetShd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHD$10, 0);
        }
    }
    
    /**
     * Gets the "tblLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType getTblLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().find_element_user(TBLLAYOUT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblLayout" element
     */
    public boolean isSetTblLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLLAYOUT$12) != 0;
        }
    }
    
    /**
     * Sets the "tblLayout" element
     */
    public void setTblLayout(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType tblLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().find_element_user(TBLLAYOUT$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().add_element_user(TBLLAYOUT$12);
            }
            target.set(tblLayout);
        }
    }
    
    /**
     * Appends and returns a new empty "tblLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType addNewTblLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().add_element_user(TBLLAYOUT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "tblLayout" element
     */
    public void unsetTblLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLLAYOUT$12, 0);
        }
    }
    
    /**
     * Gets the "tblCellMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar getTblCellMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().find_element_user(TBLCELLMAR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblCellMar" element
     */
    public boolean isSetTblCellMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLCELLMAR$14) != 0;
        }
    }
    
    /**
     * Sets the "tblCellMar" element
     */
    public void setTblCellMar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar tblCellMar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().find_element_user(TBLCELLMAR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().add_element_user(TBLCELLMAR$14);
            }
            target.set(tblCellMar);
        }
    }
    
    /**
     * Appends and returns a new empty "tblCellMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar addNewTblCellMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().add_element_user(TBLCELLMAR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "tblCellMar" element
     */
    public void unsetTblCellMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLCELLMAR$14, 0);
        }
    }
    
    /**
     * Gets the "tblLook" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber getTblLook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(TBLLOOK$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblLook" element
     */
    public boolean isSetTblLook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLLOOK$16) != 0;
        }
    }
    
    /**
     * Sets the "tblLook" element
     */
    public void setTblLook(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber tblLook)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(TBLLOOK$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(TBLLOOK$16);
            }
            target.set(tblLook);
        }
    }
    
    /**
     * Appends and returns a new empty "tblLook" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber addNewTblLook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(TBLLOOK$16);
            return target;
        }
    }
    
    /**
     * Unsets the "tblLook" element
     */
    public void unsetTblLook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLLOOK$16, 0);
        }
    }
}
