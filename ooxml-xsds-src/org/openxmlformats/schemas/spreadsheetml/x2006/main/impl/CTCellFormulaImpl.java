/*
 * XML Type:  CT_CellFormula
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CellFormula(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula.
 */
public class CTCellFormulaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula
{
    
    public CTCellFormulaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CTCellFormulaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName T$0 = 
        new javax.xml.namespace.QName("", "t");
    private static final javax.xml.namespace.QName ACA$2 = 
        new javax.xml.namespace.QName("", "aca");
    private static final javax.xml.namespace.QName REF$4 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName DT2D$6 = 
        new javax.xml.namespace.QName("", "dt2D");
    private static final javax.xml.namespace.QName DTR$8 = 
        new javax.xml.namespace.QName("", "dtr");
    private static final javax.xml.namespace.QName DEL1$10 = 
        new javax.xml.namespace.QName("", "del1");
    private static final javax.xml.namespace.QName DEL2$12 = 
        new javax.xml.namespace.QName("", "del2");
    private static final javax.xml.namespace.QName R1$14 = 
        new javax.xml.namespace.QName("", "r1");
    private static final javax.xml.namespace.QName R2$16 = 
        new javax.xml.namespace.QName("", "r2");
    private static final javax.xml.namespace.QName CA$18 = 
        new javax.xml.namespace.QName("", "ca");
    private static final javax.xml.namespace.QName SI$20 = 
        new javax.xml.namespace.QName("", "si");
    private static final javax.xml.namespace.QName BX$22 = 
        new javax.xml.namespace.QName("", "bx");
    
    
    /**
     * Gets the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.Enum getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(T$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType)get_store().find_attribute_user(T$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType)get_default_attribute_value(T$0);
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
            return get_store().find_attribute_user(T$0) != null;
        }
    }
    
    /**
     * Sets the "t" attribute
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.Enum t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(T$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(T$0);
            }
            target.setEnumValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" attribute
     */
    public void xsetT(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType)get_store().find_attribute_user(T$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType)get_store().add_attribute_user(T$0);
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
            get_store().remove_attribute(T$0);
        }
    }
    
    /**
     * Gets the "aca" attribute
     */
    public boolean getAca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACA$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "aca" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ACA$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "aca" attribute
     */
    public boolean isSetAca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACA$2) != null;
        }
    }
    
    /**
     * Sets the "aca" attribute
     */
    public void setAca(boolean aca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACA$2);
            }
            target.setBooleanValue(aca);
        }
    }
    
    /**
     * Sets (as xml) the "aca" attribute
     */
    public void xsetAca(org.apache.xmlbeans.XmlBoolean aca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ACA$2);
            }
            target.set(aca);
        }
    }
    
    /**
     * Unsets the "aca" attribute
     */
    public void unsetAca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACA$2);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$4);
            return target;
        }
    }
    
    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REF$4) != null;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$4);
            }
            target.set(ref);
        }
    }
    
    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REF$4);
        }
    }
    
    /**
     * Gets the "dt2D" attribute
     */
    public boolean getDt2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DT2D$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DT2D$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt2D" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDt2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DT2D$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DT2D$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "dt2D" attribute
     */
    public boolean isSetDt2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DT2D$6) != null;
        }
    }
    
    /**
     * Sets the "dt2D" attribute
     */
    public void setDt2D(boolean dt2D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DT2D$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DT2D$6);
            }
            target.setBooleanValue(dt2D);
        }
    }
    
    /**
     * Sets (as xml) the "dt2D" attribute
     */
    public void xsetDt2D(org.apache.xmlbeans.XmlBoolean dt2D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DT2D$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DT2D$6);
            }
            target.set(dt2D);
        }
    }
    
    /**
     * Unsets the "dt2D" attribute
     */
    public void unsetDt2D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DT2D$6);
        }
    }
    
    /**
     * Gets the "dtr" attribute
     */
    public boolean getDtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DTR$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dtr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DTR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DTR$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "dtr" attribute
     */
    public boolean isSetDtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DTR$8) != null;
        }
    }
    
    /**
     * Sets the "dtr" attribute
     */
    public void setDtr(boolean dtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DTR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DTR$8);
            }
            target.setBooleanValue(dtr);
        }
    }
    
    /**
     * Sets (as xml) the "dtr" attribute
     */
    public void xsetDtr(org.apache.xmlbeans.XmlBoolean dtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DTR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DTR$8);
            }
            target.set(dtr);
        }
    }
    
    /**
     * Unsets the "dtr" attribute
     */
    public void unsetDtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DTR$8);
        }
    }
    
    /**
     * Gets the "del1" attribute
     */
    public boolean getDel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEL1$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEL1$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "del1" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEL1$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEL1$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "del1" attribute
     */
    public boolean isSetDel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEL1$10) != null;
        }
    }
    
    /**
     * Sets the "del1" attribute
     */
    public void setDel1(boolean del1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEL1$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEL1$10);
            }
            target.setBooleanValue(del1);
        }
    }
    
    /**
     * Sets (as xml) the "del1" attribute
     */
    public void xsetDel1(org.apache.xmlbeans.XmlBoolean del1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEL1$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEL1$10);
            }
            target.set(del1);
        }
    }
    
    /**
     * Unsets the "del1" attribute
     */
    public void unsetDel1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEL1$10);
        }
    }
    
    /**
     * Gets the "del2" attribute
     */
    public boolean getDel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEL2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEL2$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "del2" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEL2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEL2$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "del2" attribute
     */
    public boolean isSetDel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEL2$12) != null;
        }
    }
    
    /**
     * Sets the "del2" attribute
     */
    public void setDel2(boolean del2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEL2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEL2$12);
            }
            target.setBooleanValue(del2);
        }
    }
    
    /**
     * Sets (as xml) the "del2" attribute
     */
    public void xsetDel2(org.apache.xmlbeans.XmlBoolean del2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEL2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEL2$12);
            }
            target.set(del2);
        }
    }
    
    /**
     * Unsets the "del2" attribute
     */
    public void unsetDel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEL2$12);
        }
    }
    
    /**
     * Gets the "r1" attribute
     */
    public java.lang.String getR1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R1$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "r1" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R1$14);
            return target;
        }
    }
    
    /**
     * True if has "r1" attribute
     */
    public boolean isSetR1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(R1$14) != null;
        }
    }
    
    /**
     * Sets the "r1" attribute
     */
    public void setR1(java.lang.String r1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R1$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R1$14);
            }
            target.setStringValue(r1);
        }
    }
    
    /**
     * Sets (as xml) the "r1" attribute
     */
    public void xsetR1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R1$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R1$14);
            }
            target.set(r1);
        }
    }
    
    /**
     * Unsets the "r1" attribute
     */
    public void unsetR1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(R1$14);
        }
    }
    
    /**
     * Gets the "r2" attribute
     */
    public java.lang.String getR2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R2$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "r2" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R2$16);
            return target;
        }
    }
    
    /**
     * True if has "r2" attribute
     */
    public boolean isSetR2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(R2$16) != null;
        }
    }
    
    /**
     * Sets the "r2" attribute
     */
    public void setR2(java.lang.String r2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R2$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R2$16);
            }
            target.setStringValue(r2);
        }
    }
    
    /**
     * Sets (as xml) the "r2" attribute
     */
    public void xsetR2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R2$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R2$16);
            }
            target.set(r2);
        }
    }
    
    /**
     * Unsets the "r2" attribute
     */
    public void unsetR2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(R2$16);
        }
    }
    
    /**
     * Gets the "ca" attribute
     */
    public boolean getCa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CA$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ca" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CA$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "ca" attribute
     */
    public boolean isSetCa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CA$18) != null;
        }
    }
    
    /**
     * Sets the "ca" attribute
     */
    public void setCa(boolean ca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CA$18);
            }
            target.setBooleanValue(ca);
        }
    }
    
    /**
     * Sets (as xml) the "ca" attribute
     */
    public void xsetCa(org.apache.xmlbeans.XmlBoolean ca)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CA$18);
            }
            target.set(ca);
        }
    }
    
    /**
     * Unsets the "ca" attribute
     */
    public void unsetCa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CA$18);
        }
    }
    
    /**
     * Gets the "si" attribute
     */
    public long getSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI$20);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "si" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SI$20);
            return target;
        }
    }
    
    /**
     * True if has "si" attribute
     */
    public boolean isSetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SI$20) != null;
        }
    }
    
    /**
     * Sets the "si" attribute
     */
    public void setSi(long si)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SI$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SI$20);
            }
            target.setLongValue(si);
        }
    }
    
    /**
     * Sets (as xml) the "si" attribute
     */
    public void xsetSi(org.apache.xmlbeans.XmlUnsignedInt si)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SI$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SI$20);
            }
            target.set(si);
        }
    }
    
    /**
     * Unsets the "si" attribute
     */
    public void unsetSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SI$20);
        }
    }
    
    /**
     * Gets the "bx" attribute
     */
    public boolean getBx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BX$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bx" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BX$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "bx" attribute
     */
    public boolean isSetBx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BX$22) != null;
        }
    }
    
    /**
     * Sets the "bx" attribute
     */
    public void setBx(boolean bx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BX$22);
            }
            target.setBooleanValue(bx);
        }
    }
    
    /**
     * Sets (as xml) the "bx" attribute
     */
    public void xsetBx(org.apache.xmlbeans.XmlBoolean bx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BX$22);
            }
            target.set(bx);
        }
    }
    
    /**
     * Unsets the "bx" attribute
     */
    public void unsetBx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BX$22);
        }
    }
}
