/*
 * XML Type:  CT_TableStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle
{
    
    public CTTableStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLBG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblBg");
    private static final javax.xml.namespace.QName WHOLETBL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "wholeTbl");
    private static final javax.xml.namespace.QName BAND1H$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band1H");
    private static final javax.xml.namespace.QName BAND2H$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band2H");
    private static final javax.xml.namespace.QName BAND1V$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band1V");
    private static final javax.xml.namespace.QName BAND2V$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band2V");
    private static final javax.xml.namespace.QName LASTCOL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lastCol");
    private static final javax.xml.namespace.QName FIRSTCOL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "firstCol");
    private static final javax.xml.namespace.QName LASTROW$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lastRow");
    private static final javax.xml.namespace.QName SECELL$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "seCell");
    private static final javax.xml.namespace.QName SWCELL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "swCell");
    private static final javax.xml.namespace.QName FIRSTROW$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "firstRow");
    private static final javax.xml.namespace.QName NECELL$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "neCell");
    private static final javax.xml.namespace.QName NWCELL$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "nwCell");
    private static final javax.xml.namespace.QName EXTLST$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName STYLEID$30 = 
        new javax.xml.namespace.QName("", "styleId");
    private static final javax.xml.namespace.QName STYLENAME$32 = 
        new javax.xml.namespace.QName("", "styleName");
    
    
    /**
     * Gets the "tblBg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle getTblBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle)get_store().find_element_user(TBLBG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblBg" element
     */
    public boolean isSetTblBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLBG$0) != 0;
        }
    }
    
    /**
     * Sets the "tblBg" element
     */
    public void setTblBg(org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle tblBg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle)get_store().find_element_user(TBLBG$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle)get_store().add_element_user(TBLBG$0);
            }
            target.set(tblBg);
        }
    }
    
    /**
     * Appends and returns a new empty "tblBg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle addNewTblBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle)get_store().add_element_user(TBLBG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tblBg" element
     */
    public void unsetTblBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLBG$0, 0);
        }
    }
    
    /**
     * Gets the "wholeTbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getWholeTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(WHOLETBL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wholeTbl" element
     */
    public boolean isSetWholeTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHOLETBL$2) != 0;
        }
    }
    
    /**
     * Sets the "wholeTbl" element
     */
    public void setWholeTbl(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle wholeTbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(WHOLETBL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(WHOLETBL$2);
            }
            target.set(wholeTbl);
        }
    }
    
    /**
     * Appends and returns a new empty "wholeTbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewWholeTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(WHOLETBL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "wholeTbl" element
     */
    public void unsetWholeTbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHOLETBL$2, 0);
        }
    }
    
    /**
     * Gets the "band1H" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getBand1H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND1H$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "band1H" element
     */
    public boolean isSetBand1H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAND1H$4) != 0;
        }
    }
    
    /**
     * Sets the "band1H" element
     */
    public void setBand1H(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle band1H)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND1H$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND1H$4);
            }
            target.set(band1H);
        }
    }
    
    /**
     * Appends and returns a new empty "band1H" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewBand1H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND1H$4);
            return target;
        }
    }
    
    /**
     * Unsets the "band1H" element
     */
    public void unsetBand1H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAND1H$4, 0);
        }
    }
    
    /**
     * Gets the "band2H" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getBand2H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND2H$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "band2H" element
     */
    public boolean isSetBand2H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAND2H$6) != 0;
        }
    }
    
    /**
     * Sets the "band2H" element
     */
    public void setBand2H(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle band2H)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND2H$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND2H$6);
            }
            target.set(band2H);
        }
    }
    
    /**
     * Appends and returns a new empty "band2H" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewBand2H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND2H$6);
            return target;
        }
    }
    
    /**
     * Unsets the "band2H" element
     */
    public void unsetBand2H()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAND2H$6, 0);
        }
    }
    
    /**
     * Gets the "band1V" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getBand1V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND1V$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "band1V" element
     */
    public boolean isSetBand1V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAND1V$8) != 0;
        }
    }
    
    /**
     * Sets the "band1V" element
     */
    public void setBand1V(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle band1V)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND1V$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND1V$8);
            }
            target.set(band1V);
        }
    }
    
    /**
     * Appends and returns a new empty "band1V" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewBand1V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND1V$8);
            return target;
        }
    }
    
    /**
     * Unsets the "band1V" element
     */
    public void unsetBand1V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAND1V$8, 0);
        }
    }
    
    /**
     * Gets the "band2V" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getBand2V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND2V$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "band2V" element
     */
    public boolean isSetBand2V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BAND2V$10) != 0;
        }
    }
    
    /**
     * Sets the "band2V" element
     */
    public void setBand2V(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle band2V)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(BAND2V$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND2V$10);
            }
            target.set(band2V);
        }
    }
    
    /**
     * Appends and returns a new empty "band2V" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewBand2V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(BAND2V$10);
            return target;
        }
    }
    
    /**
     * Unsets the "band2V" element
     */
    public void unsetBand2V()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BAND2V$10, 0);
        }
    }
    
    /**
     * Gets the "lastCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(LASTCOL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastCol" element
     */
    public boolean isSetLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCOL$12) != 0;
        }
    }
    
    /**
     * Sets the "lastCol" element
     */
    public void setLastCol(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle lastCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(LASTCOL$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(LASTCOL$12);
            }
            target.set(lastCol);
        }
    }
    
    /**
     * Appends and returns a new empty "lastCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(LASTCOL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "lastCol" element
     */
    public void unsetLastCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCOL$12, 0);
        }
    }
    
    /**
     * Gets the "firstCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(FIRSTCOL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "firstCol" element
     */
    public boolean isSetFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTCOL$14) != 0;
        }
    }
    
    /**
     * Sets the "firstCol" element
     */
    public void setFirstCol(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle firstCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(FIRSTCOL$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(FIRSTCOL$14);
            }
            target.set(firstCol);
        }
    }
    
    /**
     * Appends and returns a new empty "firstCol" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(FIRSTCOL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "firstCol" element
     */
    public void unsetFirstCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTCOL$14, 0);
        }
    }
    
    /**
     * Gets the "lastRow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(LASTROW$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastRow" element
     */
    public boolean isSetLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTROW$16) != 0;
        }
    }
    
    /**
     * Sets the "lastRow" element
     */
    public void setLastRow(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle lastRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(LASTROW$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(LASTROW$16);
            }
            target.set(lastRow);
        }
    }
    
    /**
     * Appends and returns a new empty "lastRow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(LASTROW$16);
            return target;
        }
    }
    
    /**
     * Unsets the "lastRow" element
     */
    public void unsetLastRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTROW$16, 0);
        }
    }
    
    /**
     * Gets the "seCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getSeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(SECELL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "seCell" element
     */
    public boolean isSetSeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECELL$18) != 0;
        }
    }
    
    /**
     * Sets the "seCell" element
     */
    public void setSeCell(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle seCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(SECELL$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(SECELL$18);
            }
            target.set(seCell);
        }
    }
    
    /**
     * Appends and returns a new empty "seCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewSeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(SECELL$18);
            return target;
        }
    }
    
    /**
     * Unsets the "seCell" element
     */
    public void unsetSeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECELL$18, 0);
        }
    }
    
    /**
     * Gets the "swCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getSwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(SWCELL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "swCell" element
     */
    public boolean isSetSwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SWCELL$20) != 0;
        }
    }
    
    /**
     * Sets the "swCell" element
     */
    public void setSwCell(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle swCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(SWCELL$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(SWCELL$20);
            }
            target.set(swCell);
        }
    }
    
    /**
     * Appends and returns a new empty "swCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewSwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(SWCELL$20);
            return target;
        }
    }
    
    /**
     * Unsets the "swCell" element
     */
    public void unsetSwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SWCELL$20, 0);
        }
    }
    
    /**
     * Gets the "firstRow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(FIRSTROW$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "firstRow" element
     */
    public boolean isSetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTROW$22) != 0;
        }
    }
    
    /**
     * Sets the "firstRow" element
     */
    public void setFirstRow(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle firstRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(FIRSTROW$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(FIRSTROW$22);
            }
            target.set(firstRow);
        }
    }
    
    /**
     * Appends and returns a new empty "firstRow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(FIRSTROW$22);
            return target;
        }
    }
    
    /**
     * Unsets the "firstRow" element
     */
    public void unsetFirstRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTROW$22, 0);
        }
    }
    
    /**
     * Gets the "neCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getNeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(NECELL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "neCell" element
     */
    public boolean isSetNeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NECELL$24) != 0;
        }
    }
    
    /**
     * Sets the "neCell" element
     */
    public void setNeCell(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle neCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(NECELL$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(NECELL$24);
            }
            target.set(neCell);
        }
    }
    
    /**
     * Appends and returns a new empty "neCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewNeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(NECELL$24);
            return target;
        }
    }
    
    /**
     * Unsets the "neCell" element
     */
    public void unsetNeCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NECELL$24, 0);
        }
    }
    
    /**
     * Gets the "nwCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle getNwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(NWCELL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nwCell" element
     */
    public boolean isSetNwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NWCELL$26) != 0;
        }
    }
    
    /**
     * Sets the "nwCell" element
     */
    public void setNwCell(org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle nwCell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().find_element_user(NWCELL$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(NWCELL$26);
            }
            target.set(nwCell);
        }
    }
    
    /**
     * Appends and returns a new empty "nwCell" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle addNewNwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle)get_store().add_element_user(NWCELL$26);
            return target;
        }
    }
    
    /**
     * Unsets the "nwCell" element
     */
    public void unsetNwCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NWCELL$26, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$28, 0);
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
            return get_store().count_elements(EXTLST$28) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$28);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$28);
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
            get_store().remove_element(EXTLST$28, 0);
        }
    }
    
    /**
     * Gets the "styleId" attribute
     */
    public java.lang.String getStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEID$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetStyleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(STYLEID$30);
            return target;
        }
    }
    
    /**
     * Sets the "styleId" attribute
     */
    public void setStyleId(java.lang.String styleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEID$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLEID$30);
            }
            target.setStringValue(styleId);
        }
    }
    
    /**
     * Sets (as xml) the "styleId" attribute
     */
    public void xsetStyleId(org.openxmlformats.schemas.drawingml.x2006.main.STGuid styleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(STYLEID$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().add_attribute_user(STYLEID$30);
            }
            target.set(styleId);
        }
    }
    
    /**
     * Gets the "styleName" attribute
     */
    public java.lang.String getStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLENAME$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLENAME$32);
            return target;
        }
    }
    
    /**
     * Sets the "styleName" attribute
     */
    public void setStyleName(java.lang.String styleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLENAME$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLENAME$32);
            }
            target.setStringValue(styleName);
        }
    }
    
    /**
     * Sets (as xml) the "styleName" attribute
     */
    public void xsetStyleName(org.apache.xmlbeans.XmlString styleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLENAME$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLENAME$32);
            }
            target.set(styleName);
        }
    }
}
