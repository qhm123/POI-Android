/*
 * XML Type:  CT_TblPPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblPPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblPPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr
{
    
    public CTTblPPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFTFROMTEXT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leftFromText");
    private static final javax.xml.namespace.QName RIGHTFROMTEXT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rightFromText");
    private static final javax.xml.namespace.QName TOPFROMTEXT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "topFromText");
    private static final javax.xml.namespace.QName BOTTOMFROMTEXT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottomFromText");
    private static final javax.xml.namespace.QName VERTANCHOR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vertAnchor");
    private static final javax.xml.namespace.QName HORZANCHOR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "horzAnchor");
    private static final javax.xml.namespace.QName TBLPXSPEC$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpXSpec");
    private static final javax.xml.namespace.QName TBLPX$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpX");
    private static final javax.xml.namespace.QName TBLPYSPEC$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpYSpec");
    private static final javax.xml.namespace.QName TBLPY$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpY");
    
    
    /**
     * Gets the "leftFromText" attribute
     */
    public java.math.BigInteger getLeftFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTFROMTEXT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "leftFromText" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetLeftFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(LEFTFROMTEXT$0);
            return target;
        }
    }
    
    /**
     * True if has "leftFromText" attribute
     */
    public boolean isSetLeftFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEFTFROMTEXT$0) != null;
        }
    }
    
    /**
     * Sets the "leftFromText" attribute
     */
    public void setLeftFromText(java.math.BigInteger leftFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTFROMTEXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFTFROMTEXT$0);
            }
            target.setBigIntegerValue(leftFromText);
        }
    }
    
    /**
     * Sets (as xml) the "leftFromText" attribute
     */
    public void xsetLeftFromText(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure leftFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(LEFTFROMTEXT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(LEFTFROMTEXT$0);
            }
            target.set(leftFromText);
        }
    }
    
    /**
     * Unsets the "leftFromText" attribute
     */
    public void unsetLeftFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEFTFROMTEXT$0);
        }
    }
    
    /**
     * Gets the "rightFromText" attribute
     */
    public java.math.BigInteger getRightFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTFROMTEXT$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rightFromText" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetRightFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(RIGHTFROMTEXT$2);
            return target;
        }
    }
    
    /**
     * True if has "rightFromText" attribute
     */
    public boolean isSetRightFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RIGHTFROMTEXT$2) != null;
        }
    }
    
    /**
     * Sets the "rightFromText" attribute
     */
    public void setRightFromText(java.math.BigInteger rightFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTFROMTEXT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHTFROMTEXT$2);
            }
            target.setBigIntegerValue(rightFromText);
        }
    }
    
    /**
     * Sets (as xml) the "rightFromText" attribute
     */
    public void xsetRightFromText(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure rightFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(RIGHTFROMTEXT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(RIGHTFROMTEXT$2);
            }
            target.set(rightFromText);
        }
    }
    
    /**
     * Unsets the "rightFromText" attribute
     */
    public void unsetRightFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RIGHTFROMTEXT$2);
        }
    }
    
    /**
     * Gets the "topFromText" attribute
     */
    public java.math.BigInteger getTopFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPFROMTEXT$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "topFromText" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetTopFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(TOPFROMTEXT$4);
            return target;
        }
    }
    
    /**
     * True if has "topFromText" attribute
     */
    public boolean isSetTopFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPFROMTEXT$4) != null;
        }
    }
    
    /**
     * Sets the "topFromText" attribute
     */
    public void setTopFromText(java.math.BigInteger topFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPFROMTEXT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPFROMTEXT$4);
            }
            target.setBigIntegerValue(topFromText);
        }
    }
    
    /**
     * Sets (as xml) the "topFromText" attribute
     */
    public void xsetTopFromText(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure topFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(TOPFROMTEXT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(TOPFROMTEXT$4);
            }
            target.set(topFromText);
        }
    }
    
    /**
     * Unsets the "topFromText" attribute
     */
    public void unsetTopFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPFROMTEXT$4);
        }
    }
    
    /**
     * Gets the "bottomFromText" attribute
     */
    public java.math.BigInteger getBottomFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMFROMTEXT$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "bottomFromText" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetBottomFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(BOTTOMFROMTEXT$6);
            return target;
        }
    }
    
    /**
     * True if has "bottomFromText" attribute
     */
    public boolean isSetBottomFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOTTOMFROMTEXT$6) != null;
        }
    }
    
    /**
     * Sets the "bottomFromText" attribute
     */
    public void setBottomFromText(java.math.BigInteger bottomFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOMFROMTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOMFROMTEXT$6);
            }
            target.setBigIntegerValue(bottomFromText);
        }
    }
    
    /**
     * Sets (as xml) the "bottomFromText" attribute
     */
    public void xsetBottomFromText(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure bottomFromText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(BOTTOMFROMTEXT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(BOTTOMFROMTEXT$6);
            }
            target.set(bottomFromText);
        }
    }
    
    /**
     * Unsets the "bottomFromText" attribute
     */
    public void unsetBottomFromText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOTTOMFROMTEXT$6);
        }
    }
    
    /**
     * Gets the "vertAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum getVertAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTANCHOR$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vertAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor xgetVertAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().find_attribute_user(VERTANCHOR$8);
            return target;
        }
    }
    
    /**
     * True if has "vertAnchor" attribute
     */
    public boolean isSetVertAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTANCHOR$8) != null;
        }
    }
    
    /**
     * Sets the "vertAnchor" attribute
     */
    public void setVertAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum vertAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTANCHOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTANCHOR$8);
            }
            target.setEnumValue(vertAnchor);
        }
    }
    
    /**
     * Sets (as xml) the "vertAnchor" attribute
     */
    public void xsetVertAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor vertAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().find_attribute_user(VERTANCHOR$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().add_attribute_user(VERTANCHOR$8);
            }
            target.set(vertAnchor);
        }
    }
    
    /**
     * Unsets the "vertAnchor" attribute
     */
    public void unsetVertAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTANCHOR$8);
        }
    }
    
    /**
     * Gets the "horzAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum getHorzAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZANCHOR$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horzAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor xgetHorzAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().find_attribute_user(HORZANCHOR$10);
            return target;
        }
    }
    
    /**
     * True if has "horzAnchor" attribute
     */
    public boolean isSetHorzAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORZANCHOR$10) != null;
        }
    }
    
    /**
     * Sets the "horzAnchor" attribute
     */
    public void setHorzAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum horzAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZANCHOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORZANCHOR$10);
            }
            target.setEnumValue(horzAnchor);
        }
    }
    
    /**
     * Sets (as xml) the "horzAnchor" attribute
     */
    public void xsetHorzAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor horzAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().find_attribute_user(HORZANCHOR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().add_attribute_user(HORZANCHOR$10);
            }
            target.set(horzAnchor);
        }
    }
    
    /**
     * Unsets the "horzAnchor" attribute
     */
    public void unsetHorzAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORZANCHOR$10);
        }
    }
    
    /**
     * Gets the "tblpXSpec" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum getTblpXSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPXSPEC$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tblpXSpec" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign xgetTblpXSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().find_attribute_user(TBLPXSPEC$12);
            return target;
        }
    }
    
    /**
     * True if has "tblpXSpec" attribute
     */
    public boolean isSetTblpXSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TBLPXSPEC$12) != null;
        }
    }
    
    /**
     * Sets the "tblpXSpec" attribute
     */
    public void setTblpXSpec(org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum tblpXSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPXSPEC$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TBLPXSPEC$12);
            }
            target.setEnumValue(tblpXSpec);
        }
    }
    
    /**
     * Sets (as xml) the "tblpXSpec" attribute
     */
    public void xsetTblpXSpec(org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign tblpXSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().find_attribute_user(TBLPXSPEC$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().add_attribute_user(TBLPXSPEC$12);
            }
            target.set(tblpXSpec);
        }
    }
    
    /**
     * Unsets the "tblpXSpec" attribute
     */
    public void unsetTblpXSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TBLPXSPEC$12);
        }
    }
    
    /**
     * Gets the "tblpX" attribute
     */
    public java.math.BigInteger getTblpX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPX$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "tblpX" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetTblpX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(TBLPX$14);
            return target;
        }
    }
    
    /**
     * True if has "tblpX" attribute
     */
    public boolean isSetTblpX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TBLPX$14) != null;
        }
    }
    
    /**
     * Sets the "tblpX" attribute
     */
    public void setTblpX(java.math.BigInteger tblpX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TBLPX$14);
            }
            target.setBigIntegerValue(tblpX);
        }
    }
    
    /**
     * Sets (as xml) the "tblpX" attribute
     */
    public void xsetTblpX(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure tblpX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(TBLPX$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(TBLPX$14);
            }
            target.set(tblpX);
        }
    }
    
    /**
     * Unsets the "tblpX" attribute
     */
    public void unsetTblpX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TBLPX$14);
        }
    }
    
    /**
     * Gets the "tblpYSpec" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum getTblpYSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPYSPEC$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tblpYSpec" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign xgetTblpYSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().find_attribute_user(TBLPYSPEC$16);
            return target;
        }
    }
    
    /**
     * True if has "tblpYSpec" attribute
     */
    public boolean isSetTblpYSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TBLPYSPEC$16) != null;
        }
    }
    
    /**
     * Sets the "tblpYSpec" attribute
     */
    public void setTblpYSpec(org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum tblpYSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPYSPEC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TBLPYSPEC$16);
            }
            target.setEnumValue(tblpYSpec);
        }
    }
    
    /**
     * Sets (as xml) the "tblpYSpec" attribute
     */
    public void xsetTblpYSpec(org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign tblpYSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().find_attribute_user(TBLPYSPEC$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().add_attribute_user(TBLPYSPEC$16);
            }
            target.set(tblpYSpec);
        }
    }
    
    /**
     * Unsets the "tblpYSpec" attribute
     */
    public void unsetTblpYSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TBLPYSPEC$16);
        }
    }
    
    /**
     * Gets the "tblpY" attribute
     */
    public java.math.BigInteger getTblpY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPY$18);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "tblpY" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetTblpY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(TBLPY$18);
            return target;
        }
    }
    
    /**
     * True if has "tblpY" attribute
     */
    public boolean isSetTblpY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TBLPY$18) != null;
        }
    }
    
    /**
     * Sets the "tblpY" attribute
     */
    public void setTblpY(java.math.BigInteger tblpY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TBLPY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TBLPY$18);
            }
            target.setBigIntegerValue(tblpY);
        }
    }
    
    /**
     * Sets (as xml) the "tblpY" attribute
     */
    public void xsetTblpY(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure tblpY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(TBLPY$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(TBLPY$18);
            }
            target.set(tblpY);
        }
    }
    
    /**
     * Unsets the "tblpY" attribute
     */
    public void unsetTblpY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TBLPY$18);
        }
    }
}
