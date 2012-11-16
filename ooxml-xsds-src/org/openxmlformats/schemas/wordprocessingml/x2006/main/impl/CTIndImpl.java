/*
 * XML Type:  CT_Ind
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Ind(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTIndImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd
{
    
    public CTIndImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
    private static final javax.xml.namespace.QName LEFTCHARS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leftChars");
    private static final javax.xml.namespace.QName RIGHT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
    private static final javax.xml.namespace.QName RIGHTCHARS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rightChars");
    private static final javax.xml.namespace.QName HANGING$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hanging");
    private static final javax.xml.namespace.QName HANGINGCHARS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hangingChars");
    private static final javax.xml.namespace.QName FIRSTLINE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "firstLine");
    private static final javax.xml.namespace.QName FIRSTLINECHARS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "firstLineChars");
    
    
    /**
     * Gets the "left" attribute
     */
    public java.math.BigInteger getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "left" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LEFT$0);
            return target;
        }
    }
    
    /**
     * True if has "left" attribute
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEFT$0) != null;
        }
    }
    
    /**
     * Sets the "left" attribute
     */
    public void setLeft(java.math.BigInteger left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFT$0);
            }
            target.setBigIntegerValue(left);
        }
    }
    
    /**
     * Sets (as xml) the "left" attribute
     */
    public void xsetLeft(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(LEFT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Unsets the "left" attribute
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEFT$0);
        }
    }
    
    /**
     * Gets the "leftChars" attribute
     */
    public java.math.BigInteger getLeftChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTCHARS$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "leftChars" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetLeftChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LEFTCHARS$2);
            return target;
        }
    }
    
    /**
     * True if has "leftChars" attribute
     */
    public boolean isSetLeftChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEFTCHARS$2) != null;
        }
    }
    
    /**
     * Sets the "leftChars" attribute
     */
    public void setLeftChars(java.math.BigInteger leftChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTCHARS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFTCHARS$2);
            }
            target.setBigIntegerValue(leftChars);
        }
    }
    
    /**
     * Sets (as xml) the "leftChars" attribute
     */
    public void xsetLeftChars(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber leftChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LEFTCHARS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(LEFTCHARS$2);
            }
            target.set(leftChars);
        }
    }
    
    /**
     * Unsets the "leftChars" attribute
     */
    public void unsetLeftChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEFTCHARS$2);
        }
    }
    
    /**
     * Gets the "right" attribute
     */
    public java.math.BigInteger getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "right" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(RIGHT$4);
            return target;
        }
    }
    
    /**
     * True if has "right" attribute
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RIGHT$4) != null;
        }
    }
    
    /**
     * Sets the "right" attribute
     */
    public void setRight(java.math.BigInteger right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHT$4);
            }
            target.setBigIntegerValue(right);
        }
    }
    
    /**
     * Sets (as xml) the "right" attribute
     */
    public void xsetRight(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(RIGHT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(RIGHT$4);
            }
            target.set(right);
        }
    }
    
    /**
     * Unsets the "right" attribute
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RIGHT$4);
        }
    }
    
    /**
     * Gets the "rightChars" attribute
     */
    public java.math.BigInteger getRightChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTCHARS$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rightChars" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetRightChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(RIGHTCHARS$6);
            return target;
        }
    }
    
    /**
     * True if has "rightChars" attribute
     */
    public boolean isSetRightChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RIGHTCHARS$6) != null;
        }
    }
    
    /**
     * Sets the "rightChars" attribute
     */
    public void setRightChars(java.math.BigInteger rightChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTCHARS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHTCHARS$6);
            }
            target.setBigIntegerValue(rightChars);
        }
    }
    
    /**
     * Sets (as xml) the "rightChars" attribute
     */
    public void xsetRightChars(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber rightChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(RIGHTCHARS$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(RIGHTCHARS$6);
            }
            target.set(rightChars);
        }
    }
    
    /**
     * Unsets the "rightChars" attribute
     */
    public void unsetRightChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RIGHTCHARS$6);
        }
    }
    
    /**
     * Gets the "hanging" attribute
     */
    public java.math.BigInteger getHanging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGING$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "hanging" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetHanging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(HANGING$8);
            return target;
        }
    }
    
    /**
     * True if has "hanging" attribute
     */
    public boolean isSetHanging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANGING$8) != null;
        }
    }
    
    /**
     * Sets the "hanging" attribute
     */
    public void setHanging(java.math.BigInteger hanging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGING$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANGING$8);
            }
            target.setBigIntegerValue(hanging);
        }
    }
    
    /**
     * Sets (as xml) the "hanging" attribute
     */
    public void xsetHanging(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure hanging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(HANGING$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(HANGING$8);
            }
            target.set(hanging);
        }
    }
    
    /**
     * Unsets the "hanging" attribute
     */
    public void unsetHanging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANGING$8);
        }
    }
    
    /**
     * Gets the "hangingChars" attribute
     */
    public java.math.BigInteger getHangingChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGINGCHARS$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "hangingChars" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetHangingChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(HANGINGCHARS$10);
            return target;
        }
    }
    
    /**
     * True if has "hangingChars" attribute
     */
    public boolean isSetHangingChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANGINGCHARS$10) != null;
        }
    }
    
    /**
     * Sets the "hangingChars" attribute
     */
    public void setHangingChars(java.math.BigInteger hangingChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANGINGCHARS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANGINGCHARS$10);
            }
            target.setBigIntegerValue(hangingChars);
        }
    }
    
    /**
     * Sets (as xml) the "hangingChars" attribute
     */
    public void xsetHangingChars(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber hangingChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(HANGINGCHARS$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(HANGINGCHARS$10);
            }
            target.set(hangingChars);
        }
    }
    
    /**
     * Unsets the "hangingChars" attribute
     */
    public void unsetHangingChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANGINGCHARS$10);
        }
    }
    
    /**
     * Gets the "firstLine" attribute
     */
    public java.math.BigInteger getFirstLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTLINE$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstLine" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetFirstLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(FIRSTLINE$12);
            return target;
        }
    }
    
    /**
     * True if has "firstLine" attribute
     */
    public boolean isSetFirstLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTLINE$12) != null;
        }
    }
    
    /**
     * Sets the "firstLine" attribute
     */
    public void setFirstLine(java.math.BigInteger firstLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTLINE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTLINE$12);
            }
            target.setBigIntegerValue(firstLine);
        }
    }
    
    /**
     * Sets (as xml) the "firstLine" attribute
     */
    public void xsetFirstLine(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure firstLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(FIRSTLINE$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(FIRSTLINE$12);
            }
            target.set(firstLine);
        }
    }
    
    /**
     * Unsets the "firstLine" attribute
     */
    public void unsetFirstLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTLINE$12);
        }
    }
    
    /**
     * Gets the "firstLineChars" attribute
     */
    public java.math.BigInteger getFirstLineChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTLINECHARS$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstLineChars" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetFirstLineChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FIRSTLINECHARS$14);
            return target;
        }
    }
    
    /**
     * True if has "firstLineChars" attribute
     */
    public boolean isSetFirstLineChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRSTLINECHARS$14) != null;
        }
    }
    
    /**
     * Sets the "firstLineChars" attribute
     */
    public void setFirstLineChars(java.math.BigInteger firstLineChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRSTLINECHARS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRSTLINECHARS$14);
            }
            target.setBigIntegerValue(firstLineChars);
        }
    }
    
    /**
     * Sets (as xml) the "firstLineChars" attribute
     */
    public void xsetFirstLineChars(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber firstLineChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FIRSTLINECHARS$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(FIRSTLINECHARS$14);
            }
            target.set(firstLineChars);
        }
    }
    
    /**
     * Unsets the "firstLineChars" attribute
     */
    public void unsetFirstLineChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRSTLINECHARS$14);
        }
    }
}
