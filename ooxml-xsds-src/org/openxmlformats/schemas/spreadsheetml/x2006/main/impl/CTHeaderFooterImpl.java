/*
 * XML Type:  CT_HeaderFooter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_HeaderFooter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTHeaderFooterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter
{
    
    public CTHeaderFooterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ODDHEADER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oddHeader");
    private static final javax.xml.namespace.QName ODDFOOTER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oddFooter");
    private static final javax.xml.namespace.QName EVENHEADER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "evenHeader");
    private static final javax.xml.namespace.QName EVENFOOTER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "evenFooter");
    private static final javax.xml.namespace.QName FIRSTHEADER$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "firstHeader");
    private static final javax.xml.namespace.QName FIRSTFOOTER$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "firstFooter");
    private static final javax.xml.namespace.QName DIFFERENTODDEVEN$12 = 
        new javax.xml.namespace.QName("", "differentOddEven");
    private static final javax.xml.namespace.QName DIFFERENTFIRST$14 = 
        new javax.xml.namespace.QName("", "differentFirst");
    private static final javax.xml.namespace.QName SCALEWITHDOC$16 = 
        new javax.xml.namespace.QName("", "scaleWithDoc");
    private static final javax.xml.namespace.QName ALIGNWITHMARGINS$18 = 
        new javax.xml.namespace.QName("", "alignWithMargins");
    
    
    /**
     * Gets the "oddHeader" element
     */
    public java.lang.String getOddHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oddHeader" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOddHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(ODDHEADER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "oddHeader" element
     */
    public boolean isSetOddHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODDHEADER$0) != 0;
        }
    }
    
    /**
     * Sets the "oddHeader" element
     */
    public void setOddHeader(java.lang.String oddHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDHEADER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ODDHEADER$0);
            }
            target.setStringValue(oddHeader);
        }
    }
    
    /**
     * Sets (as xml) the "oddHeader" element
     */
    public void xsetOddHeader(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oddHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(ODDHEADER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(ODDHEADER$0);
            }
            target.set(oddHeader);
        }
    }
    
    /**
     * Unsets the "oddHeader" element
     */
    public void unsetOddHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODDHEADER$0, 0);
        }
    }
    
    /**
     * Gets the "oddFooter" element
     */
    public java.lang.String getOddFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDFOOTER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "oddFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetOddFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(ODDFOOTER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "oddFooter" element
     */
    public boolean isSetOddFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODDFOOTER$2) != 0;
        }
    }
    
    /**
     * Sets the "oddFooter" element
     */
    public void setOddFooter(java.lang.String oddFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ODDFOOTER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ODDFOOTER$2);
            }
            target.setStringValue(oddFooter);
        }
    }
    
    /**
     * Sets (as xml) the "oddFooter" element
     */
    public void xsetOddFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring oddFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(ODDFOOTER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(ODDFOOTER$2);
            }
            target.set(oddFooter);
        }
    }
    
    /**
     * Unsets the "oddFooter" element
     */
    public void unsetOddFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODDFOOTER$2, 0);
        }
    }
    
    /**
     * Gets the "evenHeader" element
     */
    public java.lang.String getEvenHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENHEADER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "evenHeader" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetEvenHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(EVENHEADER$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "evenHeader" element
     */
    public boolean isSetEvenHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENHEADER$4) != 0;
        }
    }
    
    /**
     * Sets the "evenHeader" element
     */
    public void setEvenHeader(java.lang.String evenHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENHEADER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENHEADER$4);
            }
            target.setStringValue(evenHeader);
        }
    }
    
    /**
     * Sets (as xml) the "evenHeader" element
     */
    public void xsetEvenHeader(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring evenHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(EVENHEADER$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(EVENHEADER$4);
            }
            target.set(evenHeader);
        }
    }
    
    /**
     * Unsets the "evenHeader" element
     */
    public void unsetEvenHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENHEADER$4, 0);
        }
    }
    
    /**
     * Gets the "evenFooter" element
     */
    public java.lang.String getEvenFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENFOOTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "evenFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetEvenFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(EVENFOOTER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "evenFooter" element
     */
    public boolean isSetEvenFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENFOOTER$6) != 0;
        }
    }
    
    /**
     * Sets the "evenFooter" element
     */
    public void setEvenFooter(java.lang.String evenFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENFOOTER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENFOOTER$6);
            }
            target.setStringValue(evenFooter);
        }
    }
    
    /**
     * Sets (as xml) the "evenFooter" element
     */
    public void xsetEvenFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring evenFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(EVENFOOTER$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(EVENFOOTER$6);
            }
            target.set(evenFooter);
        }
    }
    
    /**
     * Unsets the "evenFooter" element
     */
    public void unsetEvenFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENFOOTER$6, 0);
        }
    }
    
    /**
     * Gets the "firstHeader" element
     */
    public java.lang.String getFirstHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTHEADER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstHeader" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFirstHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(FIRSTHEADER$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "firstHeader" element
     */
    public boolean isSetFirstHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTHEADER$8) != 0;
        }
    }
    
    /**
     * Sets the "firstHeader" element
     */
    public void setFirstHeader(java.lang.String firstHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTHEADER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTHEADER$8);
            }
            target.setStringValue(firstHeader);
        }
    }
    
    /**
     * Sets (as xml) the "firstHeader" element
     */
    public void xsetFirstHeader(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring firstHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(FIRSTHEADER$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(FIRSTHEADER$8);
            }
            target.set(firstHeader);
        }
    }
    
    /**
     * Unsets the "firstHeader" element
     */
    public void unsetFirstHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTHEADER$8, 0);
        }
    }
    
    /**
     * Gets the "firstFooter" element
     */
    public java.lang.String getFirstFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTFOOTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstFooter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFirstFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(FIRSTFOOTER$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "firstFooter" element
     */
    public boolean isSetFirstFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTFOOTER$10) != 0;
        }
    }
    
    /**
     * Sets the "firstFooter" element
     */
    public void setFirstFooter(java.lang.String firstFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTFOOTER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTFOOTER$10);
            }
            target.setStringValue(firstFooter);
        }
    }
    
    /**
     * Sets (as xml) the "firstFooter" element
     */
    public void xsetFirstFooter(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring firstFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(FIRSTFOOTER$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(FIRSTFOOTER$10);
            }
            target.set(firstFooter);
        }
    }
    
    /**
     * Unsets the "firstFooter" element
     */
    public void unsetFirstFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTFOOTER$10, 0);
        }
    }
    
    /**
     * Gets the "differentOddEven" attribute
     */
    public boolean getDifferentOddEven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENTODDEVEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIFFERENTODDEVEN$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "differentOddEven" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDifferentOddEven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIFFERENTODDEVEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DIFFERENTODDEVEN$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "differentOddEven" attribute
     */
    public boolean isSetDifferentOddEven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIFFERENTODDEVEN$12) != null;
        }
    }
    
    /**
     * Sets the "differentOddEven" attribute
     */
    public void setDifferentOddEven(boolean differentOddEven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENTODDEVEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIFFERENTODDEVEN$12);
            }
            target.setBooleanValue(differentOddEven);
        }
    }
    
    /**
     * Sets (as xml) the "differentOddEven" attribute
     */
    public void xsetDifferentOddEven(org.apache.xmlbeans.XmlBoolean differentOddEven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIFFERENTODDEVEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIFFERENTODDEVEN$12);
            }
            target.set(differentOddEven);
        }
    }
    
    /**
     * Unsets the "differentOddEven" attribute
     */
    public void unsetDifferentOddEven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIFFERENTODDEVEN$12);
        }
    }
    
    /**
     * Gets the "differentFirst" attribute
     */
    public boolean getDifferentFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENTFIRST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIFFERENTFIRST$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "differentFirst" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDifferentFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIFFERENTFIRST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DIFFERENTFIRST$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "differentFirst" attribute
     */
    public boolean isSetDifferentFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIFFERENTFIRST$14) != null;
        }
    }
    
    /**
     * Sets the "differentFirst" attribute
     */
    public void setDifferentFirst(boolean differentFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFERENTFIRST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIFFERENTFIRST$14);
            }
            target.setBooleanValue(differentFirst);
        }
    }
    
    /**
     * Sets (as xml) the "differentFirst" attribute
     */
    public void xsetDifferentFirst(org.apache.xmlbeans.XmlBoolean differentFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DIFFERENTFIRST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DIFFERENTFIRST$14);
            }
            target.set(differentFirst);
        }
    }
    
    /**
     * Unsets the "differentFirst" attribute
     */
    public void unsetDifferentFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIFFERENTFIRST$14);
        }
    }
    
    /**
     * Gets the "scaleWithDoc" attribute
     */
    public boolean getScaleWithDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALEWITHDOC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SCALEWITHDOC$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaleWithDoc" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetScaleWithDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALEWITHDOC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SCALEWITHDOC$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "scaleWithDoc" attribute
     */
    public boolean isSetScaleWithDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALEWITHDOC$16) != null;
        }
    }
    
    /**
     * Sets the "scaleWithDoc" attribute
     */
    public void setScaleWithDoc(boolean scaleWithDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALEWITHDOC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALEWITHDOC$16);
            }
            target.setBooleanValue(scaleWithDoc);
        }
    }
    
    /**
     * Sets (as xml) the "scaleWithDoc" attribute
     */
    public void xsetScaleWithDoc(org.apache.xmlbeans.XmlBoolean scaleWithDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SCALEWITHDOC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SCALEWITHDOC$16);
            }
            target.set(scaleWithDoc);
        }
    }
    
    /**
     * Unsets the "scaleWithDoc" attribute
     */
    public void unsetScaleWithDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALEWITHDOC$16);
        }
    }
    
    /**
     * Gets the "alignWithMargins" attribute
     */
    public boolean getAlignWithMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNWITHMARGINS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALIGNWITHMARGINS$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignWithMargins" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAlignWithMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALIGNWITHMARGINS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALIGNWITHMARGINS$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "alignWithMargins" attribute
     */
    public boolean isSetAlignWithMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGNWITHMARGINS$18) != null;
        }
    }
    
    /**
     * Sets the "alignWithMargins" attribute
     */
    public void setAlignWithMargins(boolean alignWithMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNWITHMARGINS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNWITHMARGINS$18);
            }
            target.setBooleanValue(alignWithMargins);
        }
    }
    
    /**
     * Sets (as xml) the "alignWithMargins" attribute
     */
    public void xsetAlignWithMargins(org.apache.xmlbeans.XmlBoolean alignWithMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALIGNWITHMARGINS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALIGNWITHMARGINS$18);
            }
            target.set(alignWithMargins);
        }
    }
    
    /**
     * Unsets the "alignWithMargins" attribute
     */
    public void unsetAlignWithMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGNWITHMARGINS$18);
        }
    }
}
