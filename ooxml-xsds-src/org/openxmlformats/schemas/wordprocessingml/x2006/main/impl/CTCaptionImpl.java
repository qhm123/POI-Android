/*
 * XML Type:  CT_Caption
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Caption(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCaptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaption
{
    
    public CTCaptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName POS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pos");
    private static final javax.xml.namespace.QName CHAPNUM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "chapNum");
    private static final javax.xml.namespace.QName HEADING$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "heading");
    private static final javax.xml.namespace.QName NOLABEL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noLabel");
    private static final javax.xml.namespace.QName NUMFMT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numFmt");
    private static final javax.xml.namespace.QName SEP$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sep");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "pos" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos.Enum getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pos" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos xgetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos)get_store().find_attribute_user(POS$2);
            return target;
        }
    }
    
    /**
     * True if has "pos" attribute
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POS$2) != null;
        }
    }
    
    /**
     * Sets the "pos" attribute
     */
    public void setPos(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos.Enum pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POS$2);
            }
            target.setEnumValue(pos);
        }
    }
    
    /**
     * Sets (as xml) the "pos" attribute
     */
    public void xsetPos(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos)get_store().find_attribute_user(POS$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCaptionPos)get_store().add_attribute_user(POS$2);
            }
            target.set(pos);
        }
    }
    
    /**
     * Unsets the "pos" attribute
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POS$2);
        }
    }
    
    /**
     * Gets the "chapNum" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getChapNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPNUM$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "chapNum" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetChapNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CHAPNUM$4);
            return target;
        }
    }
    
    /**
     * True if has "chapNum" attribute
     */
    public boolean isSetChapNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAPNUM$4) != null;
        }
    }
    
    /**
     * Sets the "chapNum" attribute
     */
    public void setChapNum(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum chapNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPNUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAPNUM$4);
            }
            target.setEnumValue(chapNum);
        }
    }
    
    /**
     * Sets (as xml) the "chapNum" attribute
     */
    public void xsetChapNum(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff chapNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(CHAPNUM$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(CHAPNUM$4);
            }
            target.set(chapNum);
        }
    }
    
    /**
     * Unsets the "chapNum" attribute
     */
    public void unsetChapNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAPNUM$4);
        }
    }
    
    /**
     * Gets the "heading" attribute
     */
    public java.math.BigInteger getHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "heading" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(HEADING$6);
            return target;
        }
    }
    
    /**
     * True if has "heading" attribute
     */
    public boolean isSetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADING$6) != null;
        }
    }
    
    /**
     * Sets the "heading" attribute
     */
    public void setHeading(java.math.BigInteger heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADING$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADING$6);
            }
            target.setBigIntegerValue(heading);
        }
    }
    
    /**
     * Sets (as xml) the "heading" attribute
     */
    public void xsetHeading(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(HEADING$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(HEADING$6);
            }
            target.set(heading);
        }
    }
    
    /**
     * Unsets the "heading" attribute
     */
    public void unsetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADING$6);
        }
    }
    
    /**
     * Gets the "noLabel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getNoLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOLABEL$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "noLabel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetNoLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(NOLABEL$8);
            return target;
        }
    }
    
    /**
     * True if has "noLabel" attribute
     */
    public boolean isSetNoLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NOLABEL$8) != null;
        }
    }
    
    /**
     * Sets the "noLabel" attribute
     */
    public void setNoLabel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum noLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOLABEL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOLABEL$8);
            }
            target.setEnumValue(noLabel);
        }
    }
    
    /**
     * Sets (as xml) the "noLabel" attribute
     */
    public void xsetNoLabel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff noLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(NOLABEL$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(NOLABEL$8);
            }
            target.set(noLabel);
        }
    }
    
    /**
     * Unsets the "noLabel" attribute
     */
    public void unsetNoLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NOLABEL$8);
        }
    }
    
    /**
     * Gets the "numFmt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum getNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMT$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "numFmt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat xgetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().find_attribute_user(NUMFMT$10);
            return target;
        }
    }
    
    /**
     * True if has "numFmt" attribute
     */
    public boolean isSetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMFMT$10) != null;
        }
    }
    
    /**
     * Sets the "numFmt" attribute
     */
    public void setNumFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMT$10);
            }
            target.setEnumValue(numFmt);
        }
    }
    
    /**
     * Sets (as xml) the "numFmt" attribute
     */
    public void xsetNumFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().find_attribute_user(NUMFMT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().add_attribute_user(NUMFMT$10);
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Unsets the "numFmt" attribute
     */
    public void unsetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMFMT$10);
        }
    }
    
    /**
     * Gets the "sep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum getSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEP$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep xgetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().find_attribute_user(SEP$12);
            return target;
        }
    }
    
    /**
     * True if has "sep" attribute
     */
    public boolean isSetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEP$12) != null;
        }
    }
    
    /**
     * Sets the "sep" attribute
     */
    public void setSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum sep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEP$12);
            }
            target.setEnumValue(sep);
        }
    }
    
    /**
     * Sets (as xml) the "sep" attribute
     */
    public void xsetSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep sep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().find_attribute_user(SEP$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().add_attribute_user(SEP$12);
            }
            target.set(sep);
        }
    }
    
    /**
     * Unsets the "sep" attribute
     */
    public void unsetSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEP$12);
        }
    }
}
