/*
 * XML Type:  CT_EastAsianLayout
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_EastAsianLayout(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEastAsianLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout
{
    
    public CTEastAsianLayoutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");
    private static final javax.xml.namespace.QName COMBINE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "combine");
    private static final javax.xml.namespace.QName COMBINEBRACKETS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "combineBrackets");
    private static final javax.xml.namespace.QName VERT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vert");
    private static final javax.xml.namespace.QName VERTCOMPRESS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vertCompress");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.math.BigInteger getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.math.BigInteger id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setBigIntegerValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "combine" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getCombine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINE$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "combine" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetCombine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(COMBINE$2);
            return target;
        }
    }
    
    /**
     * True if has "combine" attribute
     */
    public boolean isSetCombine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMBINE$2) != null;
        }
    }
    
    /**
     * Sets the "combine" attribute
     */
    public void setCombine(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum combine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMBINE$2);
            }
            target.setEnumValue(combine);
        }
    }
    
    /**
     * Sets (as xml) the "combine" attribute
     */
    public void xsetCombine(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff combine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(COMBINE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(COMBINE$2);
            }
            target.set(combine);
        }
    }
    
    /**
     * Unsets the "combine" attribute
     */
    public void unsetCombine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMBINE$2);
        }
    }
    
    /**
     * Gets the "combineBrackets" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets.Enum getCombineBrackets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINEBRACKETS$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "combineBrackets" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets xgetCombineBrackets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets)get_store().find_attribute_user(COMBINEBRACKETS$4);
            return target;
        }
    }
    
    /**
     * True if has "combineBrackets" attribute
     */
    public boolean isSetCombineBrackets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMBINEBRACKETS$4) != null;
        }
    }
    
    /**
     * Sets the "combineBrackets" attribute
     */
    public void setCombineBrackets(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets.Enum combineBrackets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINEBRACKETS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMBINEBRACKETS$4);
            }
            target.setEnumValue(combineBrackets);
        }
    }
    
    /**
     * Sets (as xml) the "combineBrackets" attribute
     */
    public void xsetCombineBrackets(org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets combineBrackets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets)get_store().find_attribute_user(COMBINEBRACKETS$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STCombineBrackets)get_store().add_attribute_user(COMBINEBRACKETS$4);
            }
            target.set(combineBrackets);
        }
    }
    
    /**
     * Unsets the "combineBrackets" attribute
     */
    public void unsetCombineBrackets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMBINEBRACKETS$4);
        }
    }
    
    /**
     * Gets the "vert" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vert" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(VERT$6);
            return target;
        }
    }
    
    /**
     * True if has "vert" attribute
     */
    public boolean isSetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERT$6) != null;
        }
    }
    
    /**
     * Sets the "vert" attribute
     */
    public void setVert(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERT$6);
            }
            target.setEnumValue(vert);
        }
    }
    
    /**
     * Sets (as xml) the "vert" attribute
     */
    public void xsetVert(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(VERT$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(VERT$6);
            }
            target.set(vert);
        }
    }
    
    /**
     * Unsets the "vert" attribute
     */
    public void unsetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERT$6);
        }
    }
    
    /**
     * Gets the "vertCompress" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getVertCompress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTCOMPRESS$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vertCompress" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetVertCompress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(VERTCOMPRESS$8);
            return target;
        }
    }
    
    /**
     * True if has "vertCompress" attribute
     */
    public boolean isSetVertCompress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTCOMPRESS$8) != null;
        }
    }
    
    /**
     * Sets the "vertCompress" attribute
     */
    public void setVertCompress(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum vertCompress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTCOMPRESS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTCOMPRESS$8);
            }
            target.setEnumValue(vertCompress);
        }
    }
    
    /**
     * Sets (as xml) the "vertCompress" attribute
     */
    public void xsetVertCompress(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff vertCompress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(VERTCOMPRESS$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(VERTCOMPRESS$8);
            }
            target.set(vertCompress);
        }
    }
    
    /**
     * Unsets the "vertCompress" attribute
     */
    public void unsetVertCompress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTCOMPRESS$8);
        }
    }
}
