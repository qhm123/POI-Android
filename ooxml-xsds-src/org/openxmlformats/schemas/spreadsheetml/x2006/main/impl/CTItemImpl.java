/*
 * XML Type:  CT_Item
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Item(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem
{
    
    public CTItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName N$0 = 
        new javax.xml.namespace.QName("", "n");
    private static final javax.xml.namespace.QName T$2 = 
        new javax.xml.namespace.QName("", "t");
    private static final javax.xml.namespace.QName H$4 = 
        new javax.xml.namespace.QName("", "h");
    private static final javax.xml.namespace.QName S$6 = 
        new javax.xml.namespace.QName("", "s");
    private static final javax.xml.namespace.QName SD$8 = 
        new javax.xml.namespace.QName("", "sd");
    private static final javax.xml.namespace.QName F$10 = 
        new javax.xml.namespace.QName("", "f");
    private static final javax.xml.namespace.QName M$12 = 
        new javax.xml.namespace.QName("", "m");
    private static final javax.xml.namespace.QName C$14 = 
        new javax.xml.namespace.QName("", "c");
    private static final javax.xml.namespace.QName X$16 = 
        new javax.xml.namespace.QName("", "x");
    private static final javax.xml.namespace.QName D$18 = 
        new javax.xml.namespace.QName("", "d");
    private static final javax.xml.namespace.QName E$20 = 
        new javax.xml.namespace.QName("", "e");
    
    
    /**
     * Gets the "n" attribute
     */
    public java.lang.String getN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(N$0);
            return target;
        }
    }
    
    /**
     * True if has "n" attribute
     */
    public boolean isSetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(N$0) != null;
        }
    }
    
    /**
     * Sets the "n" attribute
     */
    public void setN(java.lang.String n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(N$0);
            }
            target.setStringValue(n);
        }
    }
    
    /**
     * Sets (as xml) the "n" attribute
     */
    public void xsetN(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(N$0);
            }
            target.set(n);
        }
    }
    
    /**
     * Unsets the "n" attribute
     */
    public void unsetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(N$0);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_default_attribute_value(T$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "t" attribute
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(T$2) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$2);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().find_attribute_user(T$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType)get_store().add_attribute_user(T$2);
            }
            target.set(t);
        }
    }
    
    /**
     * Unsets the "t" attribute
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(T$2);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public boolean getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(H$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(H$4);
            }
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
            return get_store().find_attribute_user(H$4) != null;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(boolean h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$4);
            }
            target.setBooleanValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.apache.xmlbeans.XmlBoolean h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(H$4);
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
            get_store().remove_attribute(H$4);
        }
    }
    
    /**
     * Gets the "s" attribute
     */
    public boolean getS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(S$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "s" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(S$6);
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
            return get_store().find_attribute_user(S$6) != null;
        }
    }
    
    /**
     * Sets the "s" attribute
     */
    public void setS(boolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(S$6);
            }
            target.setBooleanValue(s);
        }
    }
    
    /**
     * Sets (as xml) the "s" attribute
     */
    public void xsetS(org.apache.xmlbeans.XmlBoolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(S$6);
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
            get_store().remove_attribute(S$6);
        }
    }
    
    /**
     * Gets the "sd" attribute
     */
    public boolean getSd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SD$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sd" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SD$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "sd" attribute
     */
    public boolean isSetSd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SD$8) != null;
        }
    }
    
    /**
     * Sets the "sd" attribute
     */
    public void setSd(boolean sd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SD$8);
            }
            target.setBooleanValue(sd);
        }
    }
    
    /**
     * Sets (as xml) the "sd" attribute
     */
    public void xsetSd(org.apache.xmlbeans.XmlBoolean sd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SD$8);
            }
            target.set(sd);
        }
    }
    
    /**
     * Unsets the "sd" attribute
     */
    public void unsetSd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SD$8);
        }
    }
    
    /**
     * Gets the "f" attribute
     */
    public boolean getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(F$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "f" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(F$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "f" attribute
     */
    public boolean isSetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(F$10) != null;
        }
    }
    
    /**
     * Sets the "f" attribute
     */
    public void setF(boolean f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(F$10);
            }
            target.setBooleanValue(f);
        }
    }
    
    /**
     * Sets (as xml) the "f" attribute
     */
    public void xsetF(org.apache.xmlbeans.XmlBoolean f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(F$10);
            }
            target.set(f);
        }
    }
    
    /**
     * Unsets the "f" attribute
     */
    public void unsetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(F$10);
        }
    }
    
    /**
     * Gets the "m" attribute
     */
    public boolean getM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(M$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(M$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "m" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(M$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(M$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "m" attribute
     */
    public boolean isSetM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(M$12) != null;
        }
    }
    
    /**
     * Sets the "m" attribute
     */
    public void setM(boolean m)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(M$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(M$12);
            }
            target.setBooleanValue(m);
        }
    }
    
    /**
     * Sets (as xml) the "m" attribute
     */
    public void xsetM(org.apache.xmlbeans.XmlBoolean m)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(M$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(M$12);
            }
            target.set(m);
        }
    }
    
    /**
     * Unsets the "m" attribute
     */
    public void unsetM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(M$12);
        }
    }
    
    /**
     * Gets the "c" attribute
     */
    public boolean getC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(C$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "c" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(C$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(C$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "c" attribute
     */
    public boolean isSetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(C$14) != null;
        }
    }
    
    /**
     * Sets the "c" attribute
     */
    public void setC(boolean c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(C$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(C$14);
            }
            target.setBooleanValue(c);
        }
    }
    
    /**
     * Sets (as xml) the "c" attribute
     */
    public void xsetC(org.apache.xmlbeans.XmlBoolean c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(C$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(C$14);
            }
            target.set(c);
        }
    }
    
    /**
     * Unsets the "c" attribute
     */
    public void unsetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(C$14);
        }
    }
    
    /**
     * Gets the "x" attribute
     */
    public long getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(X$16);
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
            return get_store().find_attribute_user(X$16) != null;
        }
    }
    
    /**
     * Sets the "x" attribute
     */
    public void setX(long x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X$16);
            }
            target.setLongValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" attribute
     */
    public void xsetX(org.apache.xmlbeans.XmlUnsignedInt x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(X$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(X$16);
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
            get_store().remove_attribute(X$16);
        }
    }
    
    /**
     * Gets the "d" attribute
     */
    public boolean getD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(D$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(D$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "d" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(D$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(D$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "d" attribute
     */
    public boolean isSetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(D$18) != null;
        }
    }
    
    /**
     * Sets the "d" attribute
     */
    public void setD(boolean d)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(D$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(D$18);
            }
            target.setBooleanValue(d);
        }
    }
    
    /**
     * Sets (as xml) the "d" attribute
     */
    public void xsetD(org.apache.xmlbeans.XmlBoolean d)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(D$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(D$18);
            }
            target.set(d);
        }
    }
    
    /**
     * Unsets the "d" attribute
     */
    public void unsetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(D$18);
        }
    }
    
    /**
     * Gets the "e" attribute
     */
    public boolean getE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(E$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(E$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "e" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(E$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(E$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "e" attribute
     */
    public boolean isSetE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(E$20) != null;
        }
    }
    
    /**
     * Sets the "e" attribute
     */
    public void setE(boolean e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(E$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(E$20);
            }
            target.setBooleanValue(e);
        }
    }
    
    /**
     * Sets (as xml) the "e" attribute
     */
    public void xsetE(org.apache.xmlbeans.XmlBoolean e)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(E$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(E$20);
            }
            target.set(e);
        }
    }
    
    /**
     * Unsets the "e" attribute
     */
    public void unsetE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(E$20);
        }
    }
}
