/*
 * XML Type:  CT_TblPrBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPrBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPrBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase
{
    
    public CTTblPrBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyle");
    private static final javax.xml.namespace.QName TBLPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpPr");
    private static final javax.xml.namespace.QName TBLOVERLAP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblOverlap");
    private static final javax.xml.namespace.QName BIDIVISUAL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidiVisual");
    private static final javax.xml.namespace.QName TBLSTYLEROWBANDSIZE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyleRowBandSize");
    private static final javax.xml.namespace.QName TBLSTYLECOLBANDSIZE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyleColBandSize");
    private static final javax.xml.namespace.QName TBLW$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblW");
    private static final javax.xml.namespace.QName JC$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
    private static final javax.xml.namespace.QName TBLCELLSPACING$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
    private static final javax.xml.namespace.QName TBLIND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblInd");
    private static final javax.xml.namespace.QName TBLBORDERS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblBorders");
    private static final javax.xml.namespace.QName SHD$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
    private static final javax.xml.namespace.QName TBLLAYOUT$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLayout");
    private static final javax.xml.namespace.QName TBLCELLMAR$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellMar");
    private static final javax.xml.namespace.QName TBLLOOK$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLook");
    
    
    /**
     * Gets the "tblStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getTblStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TBLSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblStyle" element
     */
    public boolean isSetTblStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLSTYLE$0) != 0;
        }
    }
    
    /**
     * Sets the "tblStyle" element
     */
    public void setTblStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString tblStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TBLSTYLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(TBLSTYLE$0);
            }
            target.set(tblStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "tblStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewTblStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(TBLSTYLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblStyle" element
     */
    public void unsetTblStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLSTYLE$0, 0);
        }
    }
    
    /**
     * Gets the "tblpPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr getTblpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr)get_store().find_element_user(TBLPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblpPr" element
     */
    public boolean isSetTblpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPPR$2) != 0;
        }
    }
    
    /**
     * Sets the "tblpPr" element
     */
    public void setTblpPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr tblpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr)get_store().find_element_user(TBLPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr)get_store().add_element_user(TBLPPR$2);
            }
            target.set(tblpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblpPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr addNewTblpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr)get_store().add_element_user(TBLPPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tblpPr" element
     */
    public void unsetTblpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPPR$2, 0);
        }
    }
    
    /**
     * Gets the "tblOverlap" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap getTblOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap)get_store().find_element_user(TBLOVERLAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblOverlap" element
     */
    public boolean isSetTblOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLOVERLAP$4) != 0;
        }
    }
    
    /**
     * Sets the "tblOverlap" element
     */
    public void setTblOverlap(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap tblOverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap)get_store().find_element_user(TBLOVERLAP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap)get_store().add_element_user(TBLOVERLAP$4);
            }
            target.set(tblOverlap);
        }
    }
    
    /**
     * Appends and returns a new empty "tblOverlap" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap addNewTblOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap)get_store().add_element_user(TBLOVERLAP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tblOverlap" element
     */
    public void unsetTblOverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLOVERLAP$4, 0);
        }
    }
    
    /**
     * Gets the "bidiVisual" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBidiVisual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDIVISUAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bidiVisual" element
     */
    public boolean isSetBidiVisual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIDIVISUAL$6) != 0;
        }
    }
    
    /**
     * Sets the "bidiVisual" element
     */
    public void setBidiVisual(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bidiVisual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BIDIVISUAL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDIVISUAL$6);
            }
            target.set(bidiVisual);
        }
    }
    
    /**
     * Appends and returns a new empty "bidiVisual" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBidiVisual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BIDIVISUAL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bidiVisual" element
     */
    public void unsetBidiVisual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIDIVISUAL$6, 0);
        }
    }
    
    /**
     * Gets the "tblStyleRowBandSize" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getTblStyleRowBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(TBLSTYLEROWBANDSIZE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblStyleRowBandSize" element
     */
    public boolean isSetTblStyleRowBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLSTYLEROWBANDSIZE$8) != 0;
        }
    }
    
    /**
     * Sets the "tblStyleRowBandSize" element
     */
    public void setTblStyleRowBandSize(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber tblStyleRowBandSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(TBLSTYLEROWBANDSIZE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(TBLSTYLEROWBANDSIZE$8);
            }
            target.set(tblStyleRowBandSize);
        }
    }
    
    /**
     * Appends and returns a new empty "tblStyleRowBandSize" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewTblStyleRowBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(TBLSTYLEROWBANDSIZE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "tblStyleRowBandSize" element
     */
    public void unsetTblStyleRowBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLSTYLEROWBANDSIZE$8, 0);
        }
    }
    
    /**
     * Gets the "tblStyleColBandSize" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getTblStyleColBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(TBLSTYLECOLBANDSIZE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblStyleColBandSize" element
     */
    public boolean isSetTblStyleColBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLSTYLECOLBANDSIZE$10) != 0;
        }
    }
    
    /**
     * Sets the "tblStyleColBandSize" element
     */
    public void setTblStyleColBandSize(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber tblStyleColBandSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(TBLSTYLECOLBANDSIZE$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(TBLSTYLECOLBANDSIZE$10);
            }
            target.set(tblStyleColBandSize);
        }
    }
    
    /**
     * Appends and returns a new empty "tblStyleColBandSize" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewTblStyleColBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(TBLSTYLECOLBANDSIZE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "tblStyleColBandSize" element
     */
    public void unsetTblStyleColBandSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLSTYLECOLBANDSIZE$10, 0);
        }
    }
    
    /**
     * Gets the "tblW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTblW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLW$12, 0);
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
            return get_store().count_elements(TBLW$12) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLW$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLW$12);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLW$12);
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
            get_store().remove_element(TBLW$12, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$14, 0);
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
            return get_store().count_elements(JC$14) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(JC$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(JC$14);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(JC$14);
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
            get_store().remove_element(JC$14, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$16, 0);
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
            return get_store().count_elements(TBLCELLSPACING$16) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLCELLSPACING$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLCELLSPACING$16);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLCELLSPACING$16);
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
            get_store().remove_element(TBLCELLSPACING$16, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLIND$18, 0);
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
            return get_store().count_elements(TBLIND$18) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TBLIND$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLIND$18);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TBLIND$18);
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
            get_store().remove_element(TBLIND$18, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().find_element_user(TBLBORDERS$20, 0);
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
            return get_store().count_elements(TBLBORDERS$20) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().find_element_user(TBLBORDERS$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().add_element_user(TBLBORDERS$20);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders)get_store().add_element_user(TBLBORDERS$20);
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
            get_store().remove_element(TBLBORDERS$20, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$22, 0);
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
            return get_store().count_elements(SHD$22) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$22);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$22);
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
            get_store().remove_element(SHD$22, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().find_element_user(TBLLAYOUT$24, 0);
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
            return get_store().count_elements(TBLLAYOUT$24) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().find_element_user(TBLLAYOUT$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().add_element_user(TBLLAYOUT$24);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType)get_store().add_element_user(TBLLAYOUT$24);
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
            get_store().remove_element(TBLLAYOUT$24, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().find_element_user(TBLCELLMAR$26, 0);
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
            return get_store().count_elements(TBLCELLMAR$26) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().find_element_user(TBLCELLMAR$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().add_element_user(TBLCELLMAR$26);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar)get_store().add_element_user(TBLCELLMAR$26);
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
            get_store().remove_element(TBLCELLMAR$26, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(TBLLOOK$28, 0);
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
            return get_store().count_elements(TBLLOOK$28) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().find_element_user(TBLLOOK$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(TBLLOOK$28);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber)get_store().add_element_user(TBLLOOK$28);
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
            get_store().remove_element(TBLLOOK$28, 0);
        }
    }
}
