/*
 * XML Type:  CT_TcPrBase
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TcPrBase(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTcPrBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrBase
{
    
    public CTTcPrBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNFSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cnfStyle");
    private static final javax.xml.namespace.QName TCW$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcW");
    private static final javax.xml.namespace.QName GRIDSPAN$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridSpan");
    private static final javax.xml.namespace.QName HMERGE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hMerge");
    private static final javax.xml.namespace.QName VMERGE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vMerge");
    private static final javax.xml.namespace.QName TCBORDERS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcBorders");
    private static final javax.xml.namespace.QName SHD$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
    private static final javax.xml.namespace.QName NOWRAP$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noWrap");
    private static final javax.xml.namespace.QName TCMAR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcMar");
    private static final javax.xml.namespace.QName TEXTDIRECTION$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
    private static final javax.xml.namespace.QName TCFITTEXT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcFitText");
    private static final javax.xml.namespace.QName VALIGN$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAlign");
    private static final javax.xml.namespace.QName HIDEMARK$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideMark");
    
    
    /**
     * Gets the "cnfStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf getCnfStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().find_element_user(CNFSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cnfStyle" element
     */
    public boolean isSetCnfStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CNFSTYLE$0) != 0;
        }
    }
    
    /**
     * Sets the "cnfStyle" element
     */
    public void setCnfStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf cnfStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().find_element_user(CNFSTYLE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().add_element_user(CNFSTYLE$0);
            }
            target.set(cnfStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "cnfStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf addNewCnfStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf)get_store().add_element_user(CNFSTYLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cnfStyle" element
     */
    public void unsetCnfStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CNFSTYLE$0, 0);
        }
    }
    
    /**
     * Gets the "tcW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth getTcW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TCW$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcW" element
     */
    public boolean isSetTcW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCW$2) != 0;
        }
    }
    
    /**
     * Sets the "tcW" element
     */
    public void setTcW(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth tcW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().find_element_user(TCW$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TCW$2);
            }
            target.set(tcW);
        }
    }
    
    /**
     * Appends and returns a new empty "tcW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth addNewTcW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth)get_store().add_element_user(TCW$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tcW" element
     */
    public void unsetTcW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCW$2, 0);
        }
    }
    
    /**
     * Gets the "gridSpan" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDSPAN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gridSpan" element
     */
    public boolean isSetGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDSPAN$4) != 0;
        }
    }
    
    /**
     * Sets the "gridSpan" element
     */
    public void setGridSpan(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber gridSpan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(GRIDSPAN$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(GRIDSPAN$4);
            }
            target.set(gridSpan);
        }
    }
    
    /**
     * Appends and returns a new empty "gridSpan" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(GRIDSPAN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "gridSpan" element
     */
    public void unsetGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDSPAN$4, 0);
        }
    }
    
    /**
     * Gets the "hMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge getHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge)get_store().find_element_user(HMERGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hMerge" element
     */
    public boolean isSetHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HMERGE$6) != 0;
        }
    }
    
    /**
     * Sets the "hMerge" element
     */
    public void setHMerge(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge hMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge)get_store().find_element_user(HMERGE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge)get_store().add_element_user(HMERGE$6);
            }
            target.set(hMerge);
        }
    }
    
    /**
     * Appends and returns a new empty "hMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge addNewHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge)get_store().add_element_user(HMERGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "hMerge" element
     */
    public void unsetHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HMERGE$6, 0);
        }
    }
    
    /**
     * Gets the "vMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge getVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge)get_store().find_element_user(VMERGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vMerge" element
     */
    public boolean isSetVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VMERGE$8) != 0;
        }
    }
    
    /**
     * Sets the "vMerge" element
     */
    public void setVMerge(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge vMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge)get_store().find_element_user(VMERGE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge)get_store().add_element_user(VMERGE$8);
            }
            target.set(vMerge);
        }
    }
    
    /**
     * Appends and returns a new empty "vMerge" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge addNewVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge)get_store().add_element_user(VMERGE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "vMerge" element
     */
    public void unsetVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VMERGE$8, 0);
        }
    }
    
    /**
     * Gets the "tcBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders getTcBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders)get_store().find_element_user(TCBORDERS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcBorders" element
     */
    public boolean isSetTcBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCBORDERS$10) != 0;
        }
    }
    
    /**
     * Sets the "tcBorders" element
     */
    public void setTcBorders(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders tcBorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders)get_store().find_element_user(TCBORDERS$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders)get_store().add_element_user(TCBORDERS$10);
            }
            target.set(tcBorders);
        }
    }
    
    /**
     * Appends and returns a new empty "tcBorders" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders addNewTcBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders)get_store().add_element_user(TCBORDERS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "tcBorders" element
     */
    public void unsetTcBorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCBORDERS$10, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$12, 0);
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
            return get_store().count_elements(SHD$12) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$12);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$12);
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
            get_store().remove_element(SHD$12, 0);
        }
    }
    
    /**
     * Gets the "noWrap" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOWRAP$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noWrap" element
     */
    public boolean isSetNoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOWRAP$14) != 0;
        }
    }
    
    /**
     * Sets the "noWrap" element
     */
    public void setNoWrap(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noWrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOWRAP$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOWRAP$14);
            }
            target.set(noWrap);
        }
    }
    
    /**
     * Appends and returns a new empty "noWrap" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOWRAP$14);
            return target;
        }
    }
    
    /**
     * Unsets the "noWrap" element
     */
    public void unsetNoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOWRAP$14, 0);
        }
    }
    
    /**
     * Gets the "tcMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar getTcMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar)get_store().find_element_user(TCMAR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcMar" element
     */
    public boolean isSetTcMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCMAR$16) != 0;
        }
    }
    
    /**
     * Sets the "tcMar" element
     */
    public void setTcMar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar tcMar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar)get_store().find_element_user(TCMAR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar)get_store().add_element_user(TCMAR$16);
            }
            target.set(tcMar);
        }
    }
    
    /**
     * Appends and returns a new empty "tcMar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar addNewTcMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar)get_store().add_element_user(TCMAR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "tcMar" element
     */
    public void unsetTcMar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCMAR$16, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$18, 0);
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
            return get_store().count_elements(TEXTDIRECTION$18) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().find_element_user(TEXTDIRECTION$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$18);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection)get_store().add_element_user(TEXTDIRECTION$18);
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
            get_store().remove_element(TEXTDIRECTION$18, 0);
        }
    }
    
    /**
     * Gets the "tcFitText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getTcFitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TCFITTEXT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcFitText" element
     */
    public boolean isSetTcFitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCFITTEXT$20) != 0;
        }
    }
    
    /**
     * Sets the "tcFitText" element
     */
    public void setTcFitText(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff tcFitText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TCFITTEXT$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TCFITTEXT$20);
            }
            target.set(tcFitText);
        }
    }
    
    /**
     * Appends and returns a new empty "tcFitText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewTcFitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TCFITTEXT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "tcFitText" element
     */
    public void unsetTcFitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCFITTEXT$20, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$22, 0);
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
            return get_store().count_elements(VALIGN$22) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().find_element_user(VALIGN$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$22);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc)get_store().add_element_user(VALIGN$22);
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
            get_store().remove_element(VALIGN$22, 0);
        }
    }
    
    /**
     * Gets the "hideMark" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getHideMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDEMARK$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hideMark" element
     */
    public boolean isSetHideMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIDEMARK$24) != 0;
        }
    }
    
    /**
     * Sets the "hideMark" element
     */
    public void setHideMark(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff hideMark)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(HIDEMARK$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDEMARK$24);
            }
            target.set(hideMark);
        }
    }
    
    /**
     * Appends and returns a new empty "hideMark" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewHideMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(HIDEMARK$24);
            return target;
        }
    }
    
    /**
     * Unsets the "hideMark" element
     */
    public void unsetHideMark()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIDEMARK$24, 0);
        }
    }
}
