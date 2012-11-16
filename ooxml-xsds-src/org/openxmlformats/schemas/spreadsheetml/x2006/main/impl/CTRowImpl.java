/*
 * XML Type:  CT_Row
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Row(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow
{
    
    public CTRowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName C$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "c");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName R$4 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName SPANS$6 = 
        new javax.xml.namespace.QName("", "spans");
    private static final javax.xml.namespace.QName S$8 = 
        new javax.xml.namespace.QName("", "s");
    private static final javax.xml.namespace.QName CUSTOMFORMAT$10 = 
        new javax.xml.namespace.QName("", "customFormat");
    private static final javax.xml.namespace.QName HT$12 = 
        new javax.xml.namespace.QName("", "ht");
    private static final javax.xml.namespace.QName HIDDEN$14 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName CUSTOMHEIGHT$16 = 
        new javax.xml.namespace.QName("", "customHeight");
    private static final javax.xml.namespace.QName OUTLINELEVEL$18 = 
        new javax.xml.namespace.QName("", "outlineLevel");
    private static final javax.xml.namespace.QName COLLAPSED$20 = 
        new javax.xml.namespace.QName("", "collapsed");
    private static final javax.xml.namespace.QName THICKTOP$22 = 
        new javax.xml.namespace.QName("", "thickTop");
    private static final javax.xml.namespace.QName THICKBOT$24 = 
        new javax.xml.namespace.QName("", "thickBot");
    private static final javax.xml.namespace.QName PH$26 = 
        new javax.xml.namespace.QName("", "ph");
    
    
    /**
     * Gets a List of "c" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell> getCList()
    {
        final class CList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell get(int i)
                { return CTRowImpl.this.getCArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell old = CTRowImpl.this.getCArray(i);
                CTRowImpl.this.setCArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell o)
                { CTRowImpl.this.insertNewC(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell old = CTRowImpl.this.getCArray(i);
                CTRowImpl.this.removeC(i);
                return old;
            }
            
            public int size()
                { return CTRowImpl.this.sizeOfCArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CList();
        }
    }
    
    /**
     * Gets array of all "c" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[] getCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(C$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell getCArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(C$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "c" element
     */
    public int sizeOfCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(C$0);
        }
    }
    
    /**
     * Sets array of all "c" element
     */
    public void setCArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell[] cArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cArray, C$0);
        }
    }
    
    /**
     * Sets ith "c" element
     */
    public void setCArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(C$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(c);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell insertNewC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().insert_element_user(C$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "c" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell addNewC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().add_element_user(C$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "c" element
     */
    public void removeC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(C$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public long getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$4);
            return target;
        }
    }
    
    /**
     * True if has "r" attribute
     */
    public boolean isSetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(R$4) != null;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(long r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$4);
            }
            target.setLongValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.apache.xmlbeans.XmlUnsignedInt r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(R$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(R$4);
            }
            target.set(r);
        }
    }
    
    /**
     * Unsets the "r" attribute
     */
    public void unsetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(R$4);
        }
    }
    
    /**
     * Gets the "spans" attribute
     */
    public java.util.List getSpans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPANS$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "spans" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans xgetSpans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans)get_store().find_attribute_user(SPANS$6);
            return target;
        }
    }
    
    /**
     * True if has "spans" attribute
     */
    public boolean isSetSpans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPANS$6) != null;
        }
    }
    
    /**
     * Sets the "spans" attribute
     */
    public void setSpans(java.util.List spans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPANS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPANS$6);
            }
            target.setListValue(spans);
        }
    }
    
    /**
     * Sets (as xml) the "spans" attribute
     */
    public void xsetSpans(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans spans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans)get_store().find_attribute_user(SPANS$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans)get_store().add_attribute_user(SPANS$6);
            }
            target.set(spans);
        }
    }
    
    /**
     * Unsets the "spans" attribute
     */
    public void unsetSpans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPANS$6);
        }
    }
    
    /**
     * Gets the "s" attribute
     */
    public long getS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(S$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "s" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(S$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "s" attribute
     */
    public boolean isSetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(S$8) != null;
        }
    }
    
    /**
     * Sets the "s" attribute
     */
    public void setS(long s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(S$8);
            }
            target.setLongValue(s);
        }
    }
    
    /**
     * Sets (as xml) the "s" attribute
     */
    public void xsetS(org.apache.xmlbeans.XmlUnsignedInt s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(S$8);
            }
            target.set(s);
        }
    }
    
    /**
     * Unsets the "s" attribute
     */
    public void unsetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(S$8);
        }
    }
    
    /**
     * Gets the "customFormat" attribute
     */
    public boolean getCustomFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMFORMAT$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customFormat" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMFORMAT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "customFormat" attribute
     */
    public boolean isSetCustomFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMFORMAT$10) != null;
        }
    }
    
    /**
     * Sets the "customFormat" attribute
     */
    public void setCustomFormat(boolean customFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMFORMAT$10);
            }
            target.setBooleanValue(customFormat);
        }
    }
    
    /**
     * Sets (as xml) the "customFormat" attribute
     */
    public void xsetCustomFormat(org.apache.xmlbeans.XmlBoolean customFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMFORMAT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMFORMAT$10);
            }
            target.set(customFormat);
        }
    }
    
    /**
     * Unsets the "customFormat" attribute
     */
    public void unsetCustomFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMFORMAT$10);
        }
    }
    
    /**
     * Gets the "ht" attribute
     */
    public double getHt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HT$12);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "ht" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetHt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HT$12);
            return target;
        }
    }
    
    /**
     * True if has "ht" attribute
     */
    public boolean isSetHt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HT$12) != null;
        }
    }
    
    /**
     * Sets the "ht" attribute
     */
    public void setHt(double ht)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HT$12);
            }
            target.setDoubleValue(ht);
        }
    }
    
    /**
     * Sets (as xml) the "ht" attribute
     */
    public void xsetHt(org.apache.xmlbeans.XmlDouble ht)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HT$12);
            }
            target.set(ht);
        }
    }
    
    /**
     * Unsets the "ht" attribute
     */
    public void unsetHt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HT$12);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$14) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$14);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$14);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$14);
        }
    }
    
    /**
     * Gets the "customHeight" attribute
     */
    public boolean getCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMHEIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMHEIGHT$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customHeight" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMHEIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMHEIGHT$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "customHeight" attribute
     */
    public boolean isSetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMHEIGHT$16) != null;
        }
    }
    
    /**
     * Sets the "customHeight" attribute
     */
    public void setCustomHeight(boolean customHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMHEIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMHEIGHT$16);
            }
            target.setBooleanValue(customHeight);
        }
    }
    
    /**
     * Sets (as xml) the "customHeight" attribute
     */
    public void xsetCustomHeight(org.apache.xmlbeans.XmlBoolean customHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMHEIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMHEIGHT$16);
            }
            target.set(customHeight);
        }
    }
    
    /**
     * Unsets the "customHeight" attribute
     */
    public void unsetCustomHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMHEIGHT$16);
        }
    }
    
    /**
     * Gets the "outlineLevel" attribute
     */
    public short getOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVEL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINELEVEL$18);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlineLevel" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVEL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_default_attribute_value(OUTLINELEVEL$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineLevel" attribute
     */
    public boolean isSetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINELEVEL$18) != null;
        }
    }
    
    /**
     * Sets the "outlineLevel" attribute
     */
    public void setOutlineLevel(short outlineLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINELEVEL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINELEVEL$18);
            }
            target.setShortValue(outlineLevel);
        }
    }
    
    /**
     * Sets (as xml) the "outlineLevel" attribute
     */
    public void xsetOutlineLevel(org.apache.xmlbeans.XmlUnsignedByte outlineLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(OUTLINELEVEL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(OUTLINELEVEL$18);
            }
            target.set(outlineLevel);
        }
    }
    
    /**
     * Unsets the "outlineLevel" attribute
     */
    public void unsetOutlineLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINELEVEL$18);
        }
    }
    
    /**
     * Gets the "collapsed" attribute
     */
    public boolean getCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLLAPSED$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "collapsed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COLLAPSED$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "collapsed" attribute
     */
    public boolean isSetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLLAPSED$20) != null;
        }
    }
    
    /**
     * Sets the "collapsed" attribute
     */
    public void setCollapsed(boolean collapsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAPSED$20);
            }
            target.setBooleanValue(collapsed);
        }
    }
    
    /**
     * Sets (as xml) the "collapsed" attribute
     */
    public void xsetCollapsed(org.apache.xmlbeans.XmlBoolean collapsed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COLLAPSED$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COLLAPSED$20);
            }
            target.set(collapsed);
        }
    }
    
    /**
     * Unsets the "collapsed" attribute
     */
    public void unsetCollapsed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLLAPSED$20);
        }
    }
    
    /**
     * Gets the "thickTop" attribute
     */
    public boolean getThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKTOP$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THICKTOP$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thickTop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKTOP$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THICKTOP$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "thickTop" attribute
     */
    public boolean isSetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THICKTOP$22) != null;
        }
    }
    
    /**
     * Sets the "thickTop" attribute
     */
    public void setThickTop(boolean thickTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKTOP$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKTOP$22);
            }
            target.setBooleanValue(thickTop);
        }
    }
    
    /**
     * Sets (as xml) the "thickTop" attribute
     */
    public void xsetThickTop(org.apache.xmlbeans.XmlBoolean thickTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKTOP$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THICKTOP$22);
            }
            target.set(thickTop);
        }
    }
    
    /**
     * Unsets the "thickTop" attribute
     */
    public void unsetThickTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THICKTOP$22);
        }
    }
    
    /**
     * Gets the "thickBot" attribute
     */
    public boolean getThickBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKBOT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THICKBOT$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thickBot" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThickBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKBOT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THICKBOT$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "thickBot" attribute
     */
    public boolean isSetThickBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THICKBOT$24) != null;
        }
    }
    
    /**
     * Sets the "thickBot" attribute
     */
    public void setThickBot(boolean thickBot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKBOT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKBOT$24);
            }
            target.setBooleanValue(thickBot);
        }
    }
    
    /**
     * Sets (as xml) the "thickBot" attribute
     */
    public void xsetThickBot(org.apache.xmlbeans.XmlBoolean thickBot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKBOT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THICKBOT$24);
            }
            target.set(thickBot);
        }
    }
    
    /**
     * Unsets the "thickBot" attribute
     */
    public void unsetThickBot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THICKBOT$24);
        }
    }
    
    /**
     * Gets the "ph" attribute
     */
    public boolean getPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PH$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ph" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PH$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "ph" attribute
     */
    public boolean isSetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PH$26) != null;
        }
    }
    
    /**
     * Sets the "ph" attribute
     */
    public void setPh(boolean ph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PH$26);
            }
            target.setBooleanValue(ph);
        }
    }
    
    /**
     * Sets (as xml) the "ph" attribute
     */
    public void xsetPh(org.apache.xmlbeans.XmlBoolean ph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PH$26);
            }
            target.set(ph);
        }
    }
    
    /**
     * Unsets the "ph" attribute
     */
    public void unsetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PH$26);
        }
    }
}
