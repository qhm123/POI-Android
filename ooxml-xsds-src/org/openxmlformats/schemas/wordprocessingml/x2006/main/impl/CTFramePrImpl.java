/*
 * XML Type:  CT_FramePr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FramePr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFramePrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr
{
    
    public CTFramePrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DROPCAP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dropCap");
    private static final javax.xml.namespace.QName LINES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lines");
    private static final javax.xml.namespace.QName W$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
    private static final javax.xml.namespace.QName H$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "h");
    private static final javax.xml.namespace.QName VSPACE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vSpace");
    private static final javax.xml.namespace.QName HSPACE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hSpace");
    private static final javax.xml.namespace.QName WRAP$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wrap");
    private static final javax.xml.namespace.QName HANCHOR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hAnchor");
    private static final javax.xml.namespace.QName VANCHOR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAnchor");
    private static final javax.xml.namespace.QName X$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "x");
    private static final javax.xml.namespace.QName XALIGN$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "xAlign");
    private static final javax.xml.namespace.QName Y$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "y");
    private static final javax.xml.namespace.QName YALIGN$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "yAlign");
    private static final javax.xml.namespace.QName HRULE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hRule");
    private static final javax.xml.namespace.QName ANCHORLOCK$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "anchorLock");
    
    
    /**
     * Gets the "dropCap" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap.Enum getDropCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROPCAP$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dropCap" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap xgetDropCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap)get_store().find_attribute_user(DROPCAP$0);
            return target;
        }
    }
    
    /**
     * True if has "dropCap" attribute
     */
    public boolean isSetDropCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DROPCAP$0) != null;
        }
    }
    
    /**
     * Sets the "dropCap" attribute
     */
    public void setDropCap(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap.Enum dropCap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROPCAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DROPCAP$0);
            }
            target.setEnumValue(dropCap);
        }
    }
    
    /**
     * Sets (as xml) the "dropCap" attribute
     */
    public void xsetDropCap(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap dropCap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap)get_store().find_attribute_user(DROPCAP$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDropCap)get_store().add_attribute_user(DROPCAP$0);
            }
            target.set(dropCap);
        }
    }
    
    /**
     * Unsets the "dropCap" attribute
     */
    public void unsetDropCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DROPCAP$0);
        }
    }
    
    /**
     * Gets the "lines" attribute
     */
    public java.math.BigInteger getLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINES$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "lines" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LINES$2);
            return target;
        }
    }
    
    /**
     * True if has "lines" attribute
     */
    public boolean isSetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINES$2) != null;
        }
    }
    
    /**
     * Sets the "lines" attribute
     */
    public void setLines(java.math.BigInteger lines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINES$2);
            }
            target.setBigIntegerValue(lines);
        }
    }
    
    /**
     * Sets (as xml) the "lines" attribute
     */
    public void xsetLines(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber lines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LINES$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(LINES$2);
            }
            target.set(lines);
        }
    }
    
    /**
     * Unsets the "lines" attribute
     */
    public void unsetLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINES$2);
        }
    }
    
    /**
     * Gets the "w" attribute
     */
    public java.math.BigInteger getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(W$4);
            return target;
        }
    }
    
    /**
     * True if has "w" attribute
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(W$4) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(java.math.BigInteger w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$4);
            }
            target.setBigIntegerValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(W$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(W$4);
            }
            target.set(w);
        }
    }
    
    /**
     * Unsets the "w" attribute
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(W$4);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public java.math.BigInteger getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(H$6);
            return target;
        }
    }
    
    /**
     * True if has "h" attribute
     */
    public boolean isSetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(H$6) != null;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(java.math.BigInteger h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$6);
            }
            target.setBigIntegerValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(H$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(H$6);
            }
            target.set(h);
        }
    }
    
    /**
     * Unsets the "h" attribute
     */
    public void unsetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(H$6);
        }
    }
    
    /**
     * Gets the "vSpace" attribute
     */
    public java.math.BigInteger getVSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VSPACE$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "vSpace" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetVSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(VSPACE$8);
            return target;
        }
    }
    
    /**
     * True if has "vSpace" attribute
     */
    public boolean isSetVSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VSPACE$8) != null;
        }
    }
    
    /**
     * Sets the "vSpace" attribute
     */
    public void setVSpace(java.math.BigInteger vSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VSPACE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VSPACE$8);
            }
            target.setBigIntegerValue(vSpace);
        }
    }
    
    /**
     * Sets (as xml) the "vSpace" attribute
     */
    public void xsetVSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure vSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(VSPACE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(VSPACE$8);
            }
            target.set(vSpace);
        }
    }
    
    /**
     * Unsets the "vSpace" attribute
     */
    public void unsetVSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VSPACE$8);
        }
    }
    
    /**
     * Gets the "hSpace" attribute
     */
    public java.math.BigInteger getHSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HSPACE$10);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "hSpace" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure xgetHSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(HSPACE$10);
            return target;
        }
    }
    
    /**
     * True if has "hSpace" attribute
     */
    public boolean isSetHSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HSPACE$10) != null;
        }
    }
    
    /**
     * Sets the "hSpace" attribute
     */
    public void setHSpace(java.math.BigInteger hSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HSPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HSPACE$10);
            }
            target.setBigIntegerValue(hSpace);
        }
    }
    
    /**
     * Sets (as xml) the "hSpace" attribute
     */
    public void xsetHSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure hSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().find_attribute_user(HSPACE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure)get_store().add_attribute_user(HSPACE$10);
            }
            target.set(hSpace);
        }
    }
    
    /**
     * Unsets the "hSpace" attribute
     */
    public void unsetHSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HSPACE$10);
        }
    }
    
    /**
     * Gets the "wrap" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap.Enum getWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAP$12);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrap" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap xgetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap)get_store().find_attribute_user(WRAP$12);
            return target;
        }
    }
    
    /**
     * True if has "wrap" attribute
     */
    public boolean isSetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAP$12) != null;
        }
    }
    
    /**
     * Sets the "wrap" attribute
     */
    public void setWrap(org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap.Enum wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAP$12);
            }
            target.setEnumValue(wrap);
        }
    }
    
    /**
     * Sets (as xml) the "wrap" attribute
     */
    public void xsetWrap(org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap)get_store().find_attribute_user(WRAP$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STWrap)get_store().add_attribute_user(WRAP$12);
            }
            target.set(wrap);
        }
    }
    
    /**
     * Unsets the "wrap" attribute
     */
    public void unsetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAP$12);
        }
    }
    
    /**
     * Gets the "hAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum getHAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANCHOR$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor xgetHAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().find_attribute_user(HANCHOR$14);
            return target;
        }
    }
    
    /**
     * True if has "hAnchor" attribute
     */
    public boolean isSetHAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANCHOR$14) != null;
        }
    }
    
    /**
     * Sets the "hAnchor" attribute
     */
    public void setHAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor.Enum hAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANCHOR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANCHOR$14);
            }
            target.setEnumValue(hAnchor);
        }
    }
    
    /**
     * Sets (as xml) the "hAnchor" attribute
     */
    public void xsetHAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor hAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().find_attribute_user(HANCHOR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHAnchor)get_store().add_attribute_user(HANCHOR$14);
            }
            target.set(hAnchor);
        }
    }
    
    /**
     * Unsets the "hAnchor" attribute
     */
    public void unsetHAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANCHOR$14);
        }
    }
    
    /**
     * Gets the "vAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum getVAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VANCHOR$16);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vAnchor" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor xgetVAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().find_attribute_user(VANCHOR$16);
            return target;
        }
    }
    
    /**
     * True if has "vAnchor" attribute
     */
    public boolean isSetVAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VANCHOR$16) != null;
        }
    }
    
    /**
     * Sets the "vAnchor" attribute
     */
    public void setVAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor.Enum vAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VANCHOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VANCHOR$16);
            }
            target.setEnumValue(vAnchor);
        }
    }
    
    /**
     * Sets (as xml) the "vAnchor" attribute
     */
    public void xsetVAnchor(org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor vAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().find_attribute_user(VANCHOR$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STVAnchor)get_store().add_attribute_user(VANCHOR$16);
            }
            target.set(vAnchor);
        }
    }
    
    /**
     * Unsets the "vAnchor" attribute
     */
    public void unsetVAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VANCHOR$16);
        }
    }
    
    /**
     * Gets the "x" attribute
     */
    public java.math.BigInteger getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$18);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(X$18);
            return target;
        }
    }
    
    /**
     * True if has "x" attribute
     */
    public boolean isSetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(X$18) != null;
        }
    }
    
    /**
     * Sets the "x" attribute
     */
    public void setX(java.math.BigInteger x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X$18);
            }
            target.setBigIntegerValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" attribute
     */
    public void xsetX(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(X$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(X$18);
            }
            target.set(x);
        }
    }
    
    /**
     * Unsets the "x" attribute
     */
    public void unsetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(X$18);
        }
    }
    
    /**
     * Gets the "xAlign" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum getXAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XALIGN$20);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "xAlign" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign xgetXAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().find_attribute_user(XALIGN$20);
            return target;
        }
    }
    
    /**
     * True if has "xAlign" attribute
     */
    public boolean isSetXAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XALIGN$20) != null;
        }
    }
    
    /**
     * Sets the "xAlign" attribute
     */
    public void setXAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign.Enum xAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XALIGN$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XALIGN$20);
            }
            target.setEnumValue(xAlign);
        }
    }
    
    /**
     * Sets (as xml) the "xAlign" attribute
     */
    public void xsetXAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign xAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().find_attribute_user(XALIGN$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STXAlign)get_store().add_attribute_user(XALIGN$20);
            }
            target.set(xAlign);
        }
    }
    
    /**
     * Unsets the "xAlign" attribute
     */
    public void unsetXAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XALIGN$20);
        }
    }
    
    /**
     * Gets the "y" attribute
     */
    public java.math.BigInteger getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$22);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "y" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(Y$22);
            return target;
        }
    }
    
    /**
     * True if has "y" attribute
     */
    public boolean isSetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(Y$22) != null;
        }
    }
    
    /**
     * Sets the "y" attribute
     */
    public void setY(java.math.BigInteger y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Y$22);
            }
            target.setBigIntegerValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "y" attribute
     */
    public void xsetY(org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().find_attribute_user(Y$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure)get_store().add_attribute_user(Y$22);
            }
            target.set(y);
        }
    }
    
    /**
     * Unsets the "y" attribute
     */
    public void unsetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(Y$22);
        }
    }
    
    /**
     * Gets the "yAlign" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum getYAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YALIGN$24);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "yAlign" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign xgetYAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().find_attribute_user(YALIGN$24);
            return target;
        }
    }
    
    /**
     * True if has "yAlign" attribute
     */
    public boolean isSetYAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YALIGN$24) != null;
        }
    }
    
    /**
     * Sets the "yAlign" attribute
     */
    public void setYAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign.Enum yAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YALIGN$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YALIGN$24);
            }
            target.setEnumValue(yAlign);
        }
    }
    
    /**
     * Sets (as xml) the "yAlign" attribute
     */
    public void xsetYAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign yAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().find_attribute_user(YALIGN$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STYAlign)get_store().add_attribute_user(YALIGN$24);
            }
            target.set(yAlign);
        }
    }
    
    /**
     * Unsets the "yAlign" attribute
     */
    public void unsetYAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YALIGN$24);
        }
    }
    
    /**
     * Gets the "hRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum getHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRULE$26);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hRule" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule xgetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().find_attribute_user(HRULE$26);
            return target;
        }
    }
    
    /**
     * True if has "hRule" attribute
     */
    public boolean isSetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRULE$26) != null;
        }
    }
    
    /**
     * Sets the "hRule" attribute
     */
    public void setHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule.Enum hRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRULE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRULE$26);
            }
            target.setEnumValue(hRule);
        }
    }
    
    /**
     * Sets (as xml) the "hRule" attribute
     */
    public void xsetHRule(org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule hRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().find_attribute_user(HRULE$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule)get_store().add_attribute_user(HRULE$26);
            }
            target.set(hRule);
        }
    }
    
    /**
     * Unsets the "hRule" attribute
     */
    public void unsetHRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRULE$26);
        }
    }
    
    /**
     * Gets the "anchorLock" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getAnchorLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORLOCK$28);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchorLock" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetAnchorLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ANCHORLOCK$28);
            return target;
        }
    }
    
    /**
     * True if has "anchorLock" attribute
     */
    public boolean isSetAnchorLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHORLOCK$28) != null;
        }
    }
    
    /**
     * Sets the "anchorLock" attribute
     */
    public void setAnchorLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum anchorLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORLOCK$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHORLOCK$28);
            }
            target.setEnumValue(anchorLock);
        }
    }
    
    /**
     * Sets (as xml) the "anchorLock" attribute
     */
    public void xsetAnchorLock(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff anchorLock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ANCHORLOCK$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(ANCHORLOCK$28);
            }
            target.set(anchorLock);
        }
    }
    
    /**
     * Unsets the "anchorLock" attribute
     */
    public void unsetAnchorLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHORLOCK$28);
        }
    }
}
