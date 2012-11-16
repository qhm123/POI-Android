/*
 * XML Type:  CT_Cell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Cell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCellImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell
{
    
    public CTCellImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName F$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "f");
    private static final javax.xml.namespace.QName V$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "v");
    private static final javax.xml.namespace.QName IS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "is");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName R$8 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName S$10 = 
        new javax.xml.namespace.QName("", "s");
    private static final javax.xml.namespace.QName T$12 = 
        new javax.xml.namespace.QName("", "t");
    private static final javax.xml.namespace.QName CM$14 = 
        new javax.xml.namespace.QName("", "cm");
    private static final javax.xml.namespace.QName VM$16 = 
        new javax.xml.namespace.QName("", "vm");
    private static final javax.xml.namespace.QName PH$18 = 
        new javax.xml.namespace.QName("", "ph");
    
    
    /**
     * Gets the "f" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "f" element
     */
    public boolean isSetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(F$0) != 0;
        }
    }
    
    /**
     * Sets the "f" element
     */
    public void setF(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().find_element_user(F$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().add_element_user(F$0);
            }
            target.set(f);
        }
    }
    
    /**
     * Appends and returns a new empty "f" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula addNewF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula)get_store().add_element_user(F$0);
            return target;
        }
    }
    
    /**
     * Unsets the "f" element
     */
    public void unsetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(F$0, 0);
        }
    }
    
    /**
     * Gets the "v" element
     */
    public java.lang.String getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(V$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "v" element
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V$2) != 0;
        }
    }
    
    /**
     * Sets the "v" element
     */
    public void setV(java.lang.String v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(V$2);
            }
            target.setStringValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" element
     */
    public void xsetV(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_element_user(V$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_element_user(V$2);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" element
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V$2, 0);
        }
    }
    
    /**
     * Gets the "is" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst getIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(IS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "is" element
     */
    public boolean isSetIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IS$4) != 0;
        }
    }
    
    /**
     * Sets the "is" element
     */
    public void setIs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst is)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(IS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().add_element_user(IS$4);
            }
            target.set(is);
        }
    }
    
    /**
     * Appends and returns a new empty "is" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst addNewIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().add_element_user(IS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "is" element
     */
    public void unsetIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IS$4, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "r" attribute
     */
    public java.lang.String getR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "r" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$8);
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
            return get_store().find_attribute_user(R$8) != null;
        }
    }
    
    /**
     * Sets the "r" attribute
     */
    public void setR(java.lang.String r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$8);
            }
            target.setStringValue(r);
        }
    }
    
    /**
     * Sets (as xml) the "r" attribute
     */
    public void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R$8);
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
            get_store().remove_attribute(R$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(S$10);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(S$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(S$10);
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
            return get_store().find_attribute_user(S$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(S$10);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(S$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(S$10);
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
            get_store().remove_attribute(S$10);
        }
    }
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$12);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(T$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_default_attribute_value(T$12);
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
            return get_store().find_attribute_user(T$12) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$12);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().find_attribute_user(T$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType)get_store().add_attribute_user(T$12);
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
            get_store().remove_attribute(T$12);
        }
    }
    
    /**
     * Gets the "cm" attribute
     */
    public long getCm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CM$14);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "cm" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(CM$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "cm" attribute
     */
    public boolean isSetCm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CM$14) != null;
        }
    }
    
    /**
     * Sets the "cm" attribute
     */
    public void setCm(long cm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CM$14);
            }
            target.setLongValue(cm);
        }
    }
    
    /**
     * Sets (as xml) the "cm" attribute
     */
    public void xsetCm(org.apache.xmlbeans.XmlUnsignedInt cm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CM$14);
            }
            target.set(cm);
        }
    }
    
    /**
     * Unsets the "cm" attribute
     */
    public void unsetCm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CM$14);
        }
    }
    
    /**
     * Gets the "vm" attribute
     */
    public long getVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VM$16);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "vm" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(VM$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "vm" attribute
     */
    public boolean isSetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VM$16) != null;
        }
    }
    
    /**
     * Sets the "vm" attribute
     */
    public void setVm(long vm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VM$16);
            }
            target.setLongValue(vm);
        }
    }
    
    /**
     * Sets (as xml) the "vm" attribute
     */
    public void xsetVm(org.apache.xmlbeans.XmlUnsignedInt vm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(VM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(VM$16);
            }
            target.set(vm);
        }
    }
    
    /**
     * Unsets the "vm" attribute
     */
    public void unsetVm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VM$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PH$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PH$18);
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
            return get_store().find_attribute_user(PH$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PH$18);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PH$18);
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
            get_store().remove_attribute(PH$18);
        }
    }
}
