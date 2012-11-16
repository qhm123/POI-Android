/*
 * XML Type:  CT_Lvl
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Lvl(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLvlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl
{
    
    public CTLvlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "start");
    private static final javax.xml.namespace.QName NUMFMT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numFmt");
    private static final javax.xml.namespace.QName LVLRESTART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlRestart");
    private static final javax.xml.namespace.QName PSTYLE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pStyle");
    private static final javax.xml.namespace.QName ISLGL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "isLgl");
    private static final javax.xml.namespace.QName SUFF$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "suff");
    private static final javax.xml.namespace.QName LVLTEXT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlText");
    private static final javax.xml.namespace.QName LVLPICBULLETID$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlPicBulletId");
    private static final javax.xml.namespace.QName LEGACY$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "legacy");
    private static final javax.xml.namespace.QName LVLJC$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlJc");
    private static final javax.xml.namespace.QName PPR$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    private static final javax.xml.namespace.QName RPR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName ILVL$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");
    private static final javax.xml.namespace.QName TPLC$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tplc");
    private static final javax.xml.namespace.QName TENTATIVE$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tentative");
    
    
    /**
     * Gets the "start" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$0) != 0;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Unsets the "start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$0, 0);
        }
    }
    
    /**
     * Gets the "numFmt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt getNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
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
    public void setNumFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Appends and returns a new empty "numFmt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt addNewNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
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
     * Gets the "lvlRestart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getLvlRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(LVLRESTART$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvlRestart" element
     */
    public boolean isSetLvlRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVLRESTART$4) != 0;
        }
    }
    
    /**
     * Sets the "lvlRestart" element
     */
    public void setLvlRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber lvlRestart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(LVLRESTART$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(LVLRESTART$4);
            }
            target.set(lvlRestart);
        }
    }
    
    /**
     * Appends and returns a new empty "lvlRestart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewLvlRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(LVLRESTART$4);
            return target;
        }
    }
    
    /**
     * Unsets the "lvlRestart" element
     */
    public void unsetLvlRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVLRESTART$4, 0);
        }
    }
    
    /**
     * Gets the "pStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getPStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(PSTYLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pStyle" element
     */
    public boolean isSetPStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PSTYLE$6) != 0;
        }
    }
    
    /**
     * Sets the "pStyle" element
     */
    public void setPStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString pStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(PSTYLE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(PSTYLE$6);
            }
            target.set(pStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "pStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewPStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(PSTYLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "pStyle" element
     */
    public void unsetPStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PSTYLE$6, 0);
        }
    }
    
    /**
     * Gets the "isLgl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getIsLgl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ISLGL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isLgl" element
     */
    public boolean isSetIsLgl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISLGL$8) != 0;
        }
    }
    
    /**
     * Sets the "isLgl" element
     */
    public void setIsLgl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff isLgl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ISLGL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ISLGL$8);
            }
            target.set(isLgl);
        }
    }
    
    /**
     * Appends and returns a new empty "isLgl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewIsLgl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ISLGL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "isLgl" element
     */
    public void unsetIsLgl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISLGL$8, 0);
        }
    }
    
    /**
     * Gets the "suff" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix getSuff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix)get_store().find_element_user(SUFF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "suff" element
     */
    public boolean isSetSuff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFF$10) != 0;
        }
    }
    
    /**
     * Sets the "suff" element
     */
    public void setSuff(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix suff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix)get_store().find_element_user(SUFF$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix)get_store().add_element_user(SUFF$10);
            }
            target.set(suff);
        }
    }
    
    /**
     * Appends and returns a new empty "suff" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix addNewSuff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix)get_store().add_element_user(SUFF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "suff" element
     */
    public void unsetSuff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFF$10, 0);
        }
    }
    
    /**
     * Gets the "lvlText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText getLvlText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText)get_store().find_element_user(LVLTEXT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvlText" element
     */
    public boolean isSetLvlText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVLTEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "lvlText" element
     */
    public void setLvlText(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText lvlText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText)get_store().find_element_user(LVLTEXT$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText)get_store().add_element_user(LVLTEXT$12);
            }
            target.set(lvlText);
        }
    }
    
    /**
     * Appends and returns a new empty "lvlText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText addNewLvlText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText)get_store().add_element_user(LVLTEXT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "lvlText" element
     */
    public void unsetLvlText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVLTEXT$12, 0);
        }
    }
    
    /**
     * Gets the "lvlPicBulletId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getLvlPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(LVLPICBULLETID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvlPicBulletId" element
     */
    public boolean isSetLvlPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVLPICBULLETID$14) != 0;
        }
    }
    
    /**
     * Sets the "lvlPicBulletId" element
     */
    public void setLvlPicBulletId(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber lvlPicBulletId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(LVLPICBULLETID$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(LVLPICBULLETID$14);
            }
            target.set(lvlPicBulletId);
        }
    }
    
    /**
     * Appends and returns a new empty "lvlPicBulletId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewLvlPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(LVLPICBULLETID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "lvlPicBulletId" element
     */
    public void unsetLvlPicBulletId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVLPICBULLETID$14, 0);
        }
    }
    
    /**
     * Gets the "legacy" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy getLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy)get_store().find_element_user(LEGACY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legacy" element
     */
    public boolean isSetLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGACY$16) != 0;
        }
    }
    
    /**
     * Sets the "legacy" element
     */
    public void setLegacy(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy legacy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy)get_store().find_element_user(LEGACY$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy)get_store().add_element_user(LEGACY$16);
            }
            target.set(legacy);
        }
    }
    
    /**
     * Appends and returns a new empty "legacy" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy addNewLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy)get_store().add_element_user(LEGACY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "legacy" element
     */
    public void unsetLegacy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGACY$16, 0);
        }
    }
    
    /**
     * Gets the "lvlJc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc getLvlJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(LVLJC$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvlJc" element
     */
    public boolean isSetLvlJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVLJC$18) != 0;
        }
    }
    
    /**
     * Sets the "lvlJc" element
     */
    public void setLvlJc(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc lvlJc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().find_element_user(LVLJC$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(LVLJC$18);
            }
            target.set(lvlJc);
        }
    }
    
    /**
     * Appends and returns a new empty "lvlJc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc addNewLvlJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc)get_store().add_element_user(LVLJC$18);
            return target;
        }
    }
    
    /**
     * Unsets the "lvlJc" element
     */
    public void unsetLvlJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVLJC$18, 0);
        }
    }
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPr" element
     */
    public boolean isSetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPR$20) != 0;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$20);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$20);
            return target;
        }
    }
    
    /**
     * Unsets the "pPr" element
     */
    public void unsetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPR$20, 0);
        }
    }
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$22) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$22);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$22);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$22, 0);
        }
    }
    
    /**
     * Gets the "ilvl" attribute
     */
    public java.math.BigInteger getIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ILVL$24);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ilvl" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ILVL$24);
            return target;
        }
    }
    
    /**
     * Sets the "ilvl" attribute
     */
    public void setIlvl(java.math.BigInteger ilvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ILVL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ILVL$24);
            }
            target.setBigIntegerValue(ilvl);
        }
    }
    
    /**
     * Sets (as xml) the "ilvl" attribute
     */
    public void xsetIlvl(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber ilvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ILVL$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(ILVL$24);
            }
            target.set(ilvl);
        }
    }
    
    /**
     * Gets the "tplc" attribute
     */
    public byte[] getTplc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TPLC$26);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "tplc" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetTplc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(TPLC$26);
            return target;
        }
    }
    
    /**
     * True if has "tplc" attribute
     */
    public boolean isSetTplc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TPLC$26) != null;
        }
    }
    
    /**
     * Sets the "tplc" attribute
     */
    public void setTplc(byte[] tplc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TPLC$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TPLC$26);
            }
            target.setByteArrayValue(tplc);
        }
    }
    
    /**
     * Sets (as xml) the "tplc" attribute
     */
    public void xsetTplc(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber tplc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(TPLC$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(TPLC$26);
            }
            target.set(tplc);
        }
    }
    
    /**
     * Unsets the "tplc" attribute
     */
    public void unsetTplc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TPLC$26);
        }
    }
    
    /**
     * Gets the "tentative" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getTentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TENTATIVE$28);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tentative" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetTentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(TENTATIVE$28);
            return target;
        }
    }
    
    /**
     * True if has "tentative" attribute
     */
    public boolean isSetTentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TENTATIVE$28) != null;
        }
    }
    
    /**
     * Sets the "tentative" attribute
     */
    public void setTentative(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum tentative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TENTATIVE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TENTATIVE$28);
            }
            target.setEnumValue(tentative);
        }
    }
    
    /**
     * Sets (as xml) the "tentative" attribute
     */
    public void xsetTentative(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff tentative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(TENTATIVE$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(TENTATIVE$28);
            }
            target.set(tentative);
        }
    }
    
    /**
     * Unsets the "tentative" attribute
     */
    public void unsetTentative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TENTATIVE$28);
        }
    }
}
