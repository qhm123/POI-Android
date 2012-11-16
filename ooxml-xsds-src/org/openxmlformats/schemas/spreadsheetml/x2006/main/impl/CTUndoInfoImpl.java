/*
 * XML Type:  CT_UndoInfo
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_UndoInfo(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTUndoInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo
{
    
    public CTUndoInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEX$0 = 
        new javax.xml.namespace.QName("", "index");
    private static final javax.xml.namespace.QName EXP$2 = 
        new javax.xml.namespace.QName("", "exp");
    private static final javax.xml.namespace.QName REF3D$4 = 
        new javax.xml.namespace.QName("", "ref3D");
    private static final javax.xml.namespace.QName ARRAY$6 = 
        new javax.xml.namespace.QName("", "array");
    private static final javax.xml.namespace.QName V$8 = 
        new javax.xml.namespace.QName("", "v");
    private static final javax.xml.namespace.QName NF$10 = 
        new javax.xml.namespace.QName("", "nf");
    private static final javax.xml.namespace.QName CS$12 = 
        new javax.xml.namespace.QName("", "cs");
    private static final javax.xml.namespace.QName DR$14 = 
        new javax.xml.namespace.QName("", "dr");
    private static final javax.xml.namespace.QName DN$16 = 
        new javax.xml.namespace.QName("", "dn");
    private static final javax.xml.namespace.QName R$18 = 
        new javax.xml.namespace.QName("", "r");
    private static final javax.xml.namespace.QName SID$20 = 
        new javax.xml.namespace.QName("", "sId");
    
    
    /**
     * Gets the "index" attribute
     */
    public long getIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "index" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDEX$0);
            return target;
        }
    }
    
    /**
     * Sets the "index" attribute
     */
    public void setIndex(long index)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEX$0);
            }
            target.setLongValue(index);
        }
    }
    
    /**
     * Sets (as xml) the "index" attribute
     */
    public void xsetIndex(org.apache.xmlbeans.XmlUnsignedInt index)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(INDEX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(INDEX$0);
            }
            target.set(index);
        }
    }
    
    /**
     * Gets the "exp" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression.Enum getExp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXP$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "exp" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression xgetExp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression)get_store().find_attribute_user(EXP$2);
            return target;
        }
    }
    
    /**
     * Sets the "exp" attribute
     */
    public void setExp(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression.Enum exp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXP$2);
            }
            target.setEnumValue(exp);
        }
    }
    
    /**
     * Sets (as xml) the "exp" attribute
     */
    public void xsetExp(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression exp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression)get_store().find_attribute_user(EXP$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormulaExpression)get_store().add_attribute_user(EXP$2);
            }
            target.set(exp);
        }
    }
    
    /**
     * Gets the "ref3D" attribute
     */
    public boolean getRef3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF3D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REF3D$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref3D" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRef3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REF3D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REF3D$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "ref3D" attribute
     */
    public boolean isSetRef3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REF3D$4) != null;
        }
    }
    
    /**
     * Sets the "ref3D" attribute
     */
    public void setRef3D(boolean ref3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF3D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF3D$4);
            }
            target.setBooleanValue(ref3D);
        }
    }
    
    /**
     * Sets (as xml) the "ref3D" attribute
     */
    public void xsetRef3D(org.apache.xmlbeans.XmlBoolean ref3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REF3D$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REF3D$4);
            }
            target.set(ref3D);
        }
    }
    
    /**
     * Unsets the "ref3D" attribute
     */
    public void unsetRef3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REF3D$4);
        }
    }
    
    /**
     * Gets the "array" attribute
     */
    public boolean getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ARRAY$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "array" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ARRAY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ARRAY$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "array" attribute
     */
    public boolean isSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARRAY$6) != null;
        }
    }
    
    /**
     * Sets the "array" attribute
     */
    public void setArray(boolean array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARRAY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARRAY$6);
            }
            target.setBooleanValue(array);
        }
    }
    
    /**
     * Sets (as xml) the "array" attribute
     */
    public void xsetArray(org.apache.xmlbeans.XmlBoolean array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ARRAY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ARRAY$6);
            }
            target.set(array);
        }
    }
    
    /**
     * Unsets the "array" attribute
     */
    public void unsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARRAY$6);
        }
    }
    
    /**
     * Gets the "v" attribute
     */
    public boolean getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(V$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(V$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "v" attribute
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(V$8) != null;
        }
    }
    
    /**
     * Sets the "v" attribute
     */
    public void setV(boolean v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(V$8);
            }
            target.setBooleanValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" attribute
     */
    public void xsetV(org.apache.xmlbeans.XmlBoolean v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(V$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(V$8);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" attribute
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(V$8);
        }
    }
    
    /**
     * Gets the "nf" attribute
     */
    public boolean getNf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NF$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nf" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NF$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "nf" attribute
     */
    public boolean isSetNf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NF$10) != null;
        }
    }
    
    /**
     * Sets the "nf" attribute
     */
    public void setNf(boolean nf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NF$10);
            }
            target.setBooleanValue(nf);
        }
    }
    
    /**
     * Sets (as xml) the "nf" attribute
     */
    public void xsetNf(org.apache.xmlbeans.XmlBoolean nf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NF$10);
            }
            target.set(nf);
        }
    }
    
    /**
     * Unsets the "nf" attribute
     */
    public void unsetNf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NF$10);
        }
    }
    
    /**
     * Gets the "cs" attribute
     */
    public boolean getCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CS$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cs" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CS$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "cs" attribute
     */
    public boolean isSetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CS$12) != null;
        }
    }
    
    /**
     * Sets the "cs" attribute
     */
    public void setCs(boolean cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CS$12);
            }
            target.setBooleanValue(cs);
        }
    }
    
    /**
     * Sets (as xml) the "cs" attribute
     */
    public void xsetCs(org.apache.xmlbeans.XmlBoolean cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CS$12);
            }
            target.set(cs);
        }
    }
    
    /**
     * Unsets the "cs" attribute
     */
    public void unsetCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CS$12);
        }
    }
    
    /**
     * Gets the "dr" attribute
     */
    public java.lang.String getDr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DR$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dr" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA xgetDr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA)get_store().find_attribute_user(DR$14);
            return target;
        }
    }
    
    /**
     * Sets the "dr" attribute
     */
    public void setDr(java.lang.String dr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DR$14);
            }
            target.setStringValue(dr);
        }
    }
    
    /**
     * Sets (as xml) the "dr" attribute
     */
    public void xsetDr(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA dr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA)get_store().find_attribute_user(DR$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefA)get_store().add_attribute_user(DR$14);
            }
            target.set(dr);
        }
    }
    
    /**
     * Gets the "dn" attribute
     */
    public java.lang.String getDn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DN$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dn" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DN$16);
            return target;
        }
    }
    
    /**
     * True if has "dn" attribute
     */
    public boolean isSetDn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DN$16) != null;
        }
    }
    
    /**
     * Sets the "dn" attribute
     */
    public void setDn(java.lang.String dn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DN$16);
            }
            target.setStringValue(dn);
        }
    }
    
    /**
     * Sets (as xml) the "dn" attribute
     */
    public void xsetDn(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring dn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DN$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DN$16);
            }
            target.set(dn);
        }
    }
    
    /**
     * Unsets the "dn" attribute
     */
    public void unsetDn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DN$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$18);
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
            return get_store().find_attribute_user(R$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(R$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(R$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().find_attribute_user(R$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef)get_store().add_attribute_user(R$18);
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
            get_store().remove_attribute(R$18);
        }
    }
    
    /**
     * Gets the "sId" attribute
     */
    public long getSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$20);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$20);
            return target;
        }
    }
    
    /**
     * True if has "sId" attribute
     */
    public boolean isSetSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SID$20) != null;
        }
    }
    
    /**
     * Sets the "sId" attribute
     */
    public void setSId(long sId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SID$20);
            }
            target.setLongValue(sId);
        }
    }
    
    /**
     * Sets (as xml) the "sId" attribute
     */
    public void xsetSId(org.apache.xmlbeans.XmlUnsignedInt sId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SID$20);
            }
            target.set(sId);
        }
    }
    
    /**
     * Unsets the "sId" attribute
     */
    public void unsetSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SID$20);
        }
    }
}
