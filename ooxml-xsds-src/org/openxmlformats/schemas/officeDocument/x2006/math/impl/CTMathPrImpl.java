/*
 * XML Type:  CT_MathPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_MathPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTMathPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr
{
    
    public CTMathPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATHFONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mathFont");
    private static final javax.xml.namespace.QName BRKBIN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "brkBin");
    private static final javax.xml.namespace.QName BRKBINSUB$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "brkBinSub");
    private static final javax.xml.namespace.QName SMALLFRAC$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "smallFrac");
    private static final javax.xml.namespace.QName DISPDEF$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "dispDef");
    private static final javax.xml.namespace.QName LMARGIN$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "lMargin");
    private static final javax.xml.namespace.QName RMARGIN$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "rMargin");
    private static final javax.xml.namespace.QName DEFJC$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "defJc");
    private static final javax.xml.namespace.QName PRESP$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "preSp");
    private static final javax.xml.namespace.QName POSTSP$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "postSp");
    private static final javax.xml.namespace.QName INTERSP$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "interSp");
    private static final javax.xml.namespace.QName INTRASP$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "intraSp");
    private static final javax.xml.namespace.QName WRAPINDENT$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "wrapIndent");
    private static final javax.xml.namespace.QName WRAPRIGHT$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "wrapRight");
    private static final javax.xml.namespace.QName INTLIM$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "intLim");
    private static final javax.xml.namespace.QName NARYLIM$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "naryLim");
    
    
    /**
     * Gets the "mathFont" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTString getMathFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTString)get_store().find_element_user(MATHFONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mathFont" element
     */
    public boolean isSetMathFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATHFONT$0) != 0;
        }
    }
    
    /**
     * Sets the "mathFont" element
     */
    public void setMathFont(org.openxmlformats.schemas.officeDocument.x2006.math.CTString mathFont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTString)get_store().find_element_user(MATHFONT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTString)get_store().add_element_user(MATHFONT$0);
            }
            target.set(mathFont);
        }
    }
    
    /**
     * Appends and returns a new empty "mathFont" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTString addNewMathFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTString target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTString)get_store().add_element_user(MATHFONT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mathFont" element
     */
    public void unsetMathFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATHFONT$0, 0);
        }
    }
    
    /**
     * Gets the "brkBin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin getBrkBin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin)get_store().find_element_user(BRKBIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "brkBin" element
     */
    public boolean isSetBrkBin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRKBIN$2) != 0;
        }
    }
    
    /**
     * Sets the "brkBin" element
     */
    public void setBrkBin(org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin brkBin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin)get_store().find_element_user(BRKBIN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin)get_store().add_element_user(BRKBIN$2);
            }
            target.set(brkBin);
        }
    }
    
    /**
     * Appends and returns a new empty "brkBin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin addNewBrkBin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBin)get_store().add_element_user(BRKBIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "brkBin" element
     */
    public void unsetBrkBin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRKBIN$2, 0);
        }
    }
    
    /**
     * Gets the "brkBinSub" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub getBrkBinSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub)get_store().find_element_user(BRKBINSUB$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "brkBinSub" element
     */
    public boolean isSetBrkBinSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRKBINSUB$4) != 0;
        }
    }
    
    /**
     * Sets the "brkBinSub" element
     */
    public void setBrkBinSub(org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub brkBinSub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub)get_store().find_element_user(BRKBINSUB$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub)get_store().add_element_user(BRKBINSUB$4);
            }
            target.set(brkBinSub);
        }
    }
    
    /**
     * Appends and returns a new empty "brkBinSub" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub addNewBrkBinSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTBreakBinSub)get_store().add_element_user(BRKBINSUB$4);
            return target;
        }
    }
    
    /**
     * Unsets the "brkBinSub" element
     */
    public void unsetBrkBinSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRKBINSUB$4, 0);
        }
    }
    
    /**
     * Gets the "smallFrac" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getSmallFrac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SMALLFRAC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "smallFrac" element
     */
    public boolean isSetSmallFrac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMALLFRAC$6) != 0;
        }
    }
    
    /**
     * Sets the "smallFrac" element
     */
    public void setSmallFrac(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff smallFrac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(SMALLFRAC$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SMALLFRAC$6);
            }
            target.set(smallFrac);
        }
    }
    
    /**
     * Appends and returns a new empty "smallFrac" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewSmallFrac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(SMALLFRAC$6);
            return target;
        }
    }
    
    /**
     * Unsets the "smallFrac" element
     */
    public void unsetSmallFrac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMALLFRAC$6, 0);
        }
    }
    
    /**
     * Gets the "dispDef" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getDispDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DISPDEF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispDef" element
     */
    public boolean isSetDispDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPDEF$8) != 0;
        }
    }
    
    /**
     * Sets the "dispDef" element
     */
    public void setDispDef(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff dispDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(DISPDEF$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DISPDEF$8);
            }
            target.set(dispDef);
        }
    }
    
    /**
     * Appends and returns a new empty "dispDef" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewDispDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(DISPDEF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "dispDef" element
     */
    public void unsetDispDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPDEF$8, 0);
        }
    }
    
    /**
     * Gets the "lMargin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getLMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(LMARGIN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lMargin" element
     */
    public boolean isSetLMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LMARGIN$10) != 0;
        }
    }
    
    /**
     * Sets the "lMargin" element
     */
    public void setLMargin(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure lMargin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(LMARGIN$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(LMARGIN$10);
            }
            target.set(lMargin);
        }
    }
    
    /**
     * Appends and returns a new empty "lMargin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewLMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(LMARGIN$10);
            return target;
        }
    }
    
    /**
     * Unsets the "lMargin" element
     */
    public void unsetLMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LMARGIN$10, 0);
        }
    }
    
    /**
     * Gets the "rMargin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getRMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(RMARGIN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rMargin" element
     */
    public boolean isSetRMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RMARGIN$12) != 0;
        }
    }
    
    /**
     * Sets the "rMargin" element
     */
    public void setRMargin(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure rMargin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(RMARGIN$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(RMARGIN$12);
            }
            target.set(rMargin);
        }
    }
    
    /**
     * Appends and returns a new empty "rMargin" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewRMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(RMARGIN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "rMargin" element
     */
    public void unsetRMargin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RMARGIN$12, 0);
        }
    }
    
    /**
     * Gets the "defJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc getDefJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().find_element_user(DEFJC$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defJc" element
     */
    public boolean isSetDefJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFJC$14) != 0;
        }
    }
    
    /**
     * Sets the "defJc" element
     */
    public void setDefJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc defJc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().find_element_user(DEFJC$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().add_element_user(DEFJC$14);
            }
            target.set(defJc);
        }
    }
    
    /**
     * Appends and returns a new empty "defJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc addNewDefJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathJc)get_store().add_element_user(DEFJC$14);
            return target;
        }
    }
    
    /**
     * Unsets the "defJc" element
     */
    public void unsetDefJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFJC$14, 0);
        }
    }
    
    /**
     * Gets the "preSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getPreSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(PRESP$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preSp" element
     */
    public boolean isSetPreSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESP$16) != 0;
        }
    }
    
    /**
     * Sets the "preSp" element
     */
    public void setPreSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure preSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(PRESP$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(PRESP$16);
            }
            target.set(preSp);
        }
    }
    
    /**
     * Appends and returns a new empty "preSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewPreSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(PRESP$16);
            return target;
        }
    }
    
    /**
     * Unsets the "preSp" element
     */
    public void unsetPreSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESP$16, 0);
        }
    }
    
    /**
     * Gets the "postSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getPostSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(POSTSP$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "postSp" element
     */
    public boolean isSetPostSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTSP$18) != 0;
        }
    }
    
    /**
     * Sets the "postSp" element
     */
    public void setPostSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure postSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(POSTSP$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(POSTSP$18);
            }
            target.set(postSp);
        }
    }
    
    /**
     * Appends and returns a new empty "postSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewPostSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(POSTSP$18);
            return target;
        }
    }
    
    /**
     * Unsets the "postSp" element
     */
    public void unsetPostSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTSP$18, 0);
        }
    }
    
    /**
     * Gets the "interSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getInterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(INTERSP$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "interSp" element
     */
    public boolean isSetInterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERSP$20) != 0;
        }
    }
    
    /**
     * Sets the "interSp" element
     */
    public void setInterSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure interSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(INTERSP$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(INTERSP$20);
            }
            target.set(interSp);
        }
    }
    
    /**
     * Appends and returns a new empty "interSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewInterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(INTERSP$20);
            return target;
        }
    }
    
    /**
     * Unsets the "interSp" element
     */
    public void unsetInterSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERSP$20, 0);
        }
    }
    
    /**
     * Gets the "intraSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getIntraSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(INTRASP$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "intraSp" element
     */
    public boolean isSetIntraSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTRASP$22) != 0;
        }
    }
    
    /**
     * Sets the "intraSp" element
     */
    public void setIntraSp(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure intraSp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(INTRASP$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(INTRASP$22);
            }
            target.set(intraSp);
        }
    }
    
    /**
     * Appends and returns a new empty "intraSp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewIntraSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(INTRASP$22);
            return target;
        }
    }
    
    /**
     * Unsets the "intraSp" element
     */
    public void unsetIntraSp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTRASP$22, 0);
        }
    }
    
    /**
     * Gets the "wrapIndent" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure getWrapIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(WRAPINDENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapIndent" element
     */
    public boolean isSetWrapIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPINDENT$24) != 0;
        }
    }
    
    /**
     * Sets the "wrapIndent" element
     */
    public void setWrapIndent(org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure wrapIndent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().find_element_user(WRAPINDENT$24, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(WRAPINDENT$24);
            }
            target.set(wrapIndent);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapIndent" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure addNewWrapIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTwipsMeasure)get_store().add_element_user(WRAPINDENT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapIndent" element
     */
    public void unsetWrapIndent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPINDENT$24, 0);
        }
    }
    
    /**
     * Gets the "wrapRight" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getWrapRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(WRAPRIGHT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wrapRight" element
     */
    public boolean isSetWrapRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAPRIGHT$26) != 0;
        }
    }
    
    /**
     * Sets the "wrapRight" element
     */
    public void setWrapRight(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff wrapRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(WRAPRIGHT$26, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(WRAPRIGHT$26);
            }
            target.set(wrapRight);
        }
    }
    
    /**
     * Appends and returns a new empty "wrapRight" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewWrapRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(WRAPRIGHT$26);
            return target;
        }
    }
    
    /**
     * Unsets the "wrapRight" element
     */
    public void unsetWrapRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAPRIGHT$26, 0);
        }
    }
    
    /**
     * Gets the "intLim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc getIntLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(INTLIM$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "intLim" element
     */
    public boolean isSetIntLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTLIM$28) != 0;
        }
    }
    
    /**
     * Sets the "intLim" element
     */
    public void setIntLim(org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc intLim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(INTLIM$28, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(INTLIM$28);
            }
            target.set(intLim);
        }
    }
    
    /**
     * Appends and returns a new empty "intLim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc addNewIntLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(INTLIM$28);
            return target;
        }
    }
    
    /**
     * Unsets the "intLim" element
     */
    public void unsetIntLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTLIM$28, 0);
        }
    }
    
    /**
     * Gets the "naryLim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc getNaryLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(NARYLIM$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "naryLim" element
     */
    public boolean isSetNaryLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NARYLIM$30) != 0;
        }
    }
    
    /**
     * Sets the "naryLim" element
     */
    public void setNaryLim(org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc naryLim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().find_element_user(NARYLIM$30, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(NARYLIM$30);
            }
            target.set(naryLim);
        }
    }
    
    /**
     * Appends and returns a new empty "naryLim" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc addNewNaryLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTLimLoc)get_store().add_element_user(NARYLIM$30);
            return target;
        }
    }
    
    /**
     * Unsets the "naryLim" element
     */
    public void unsetNaryLim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NARYLIM$30, 0);
        }
    }
}
