/*
 * XML Type:  CT_TransformEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TransformEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTransformEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect
{
    
    public CTTransformEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SX$0 = 
        new javax.xml.namespace.QName("", "sx");
    private static final javax.xml.namespace.QName SY$2 = 
        new javax.xml.namespace.QName("", "sy");
    private static final javax.xml.namespace.QName KX$4 = 
        new javax.xml.namespace.QName("", "kx");
    private static final javax.xml.namespace.QName KY$6 = 
        new javax.xml.namespace.QName("", "ky");
    private static final javax.xml.namespace.QName TX$8 = 
        new javax.xml.namespace.QName("", "tx");
    private static final javax.xml.namespace.QName TY$10 = 
        new javax.xml.namespace.QName("", "ty");
    
    
    /**
     * Gets the "sx" attribute
     */
    public int getSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SX$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SX$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "sx" attribute
     */
    public boolean isSetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SX$0) != null;
        }
    }
    
    /**
     * Sets the "sx" attribute
     */
    public void setSx(int sx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SX$0);
            }
            target.setIntValue(sx);
        }
    }
    
    /**
     * Sets (as xml) the "sx" attribute
     */
    public void xsetSx(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SX$0);
            }
            target.set(sx);
        }
    }
    
    /**
     * Unsets the "sx" attribute
     */
    public void unsetSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SX$0);
        }
    }
    
    /**
     * Gets the "sy" attribute
     */
    public int getSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SY$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sy" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPercentage xgetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_default_attribute_value(SY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sy" attribute
     */
    public boolean isSetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SY$2) != null;
        }
    }
    
    /**
     * Sets the "sy" attribute
     */
    public void setSy(int sy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SY$2);
            }
            target.setIntValue(sy);
        }
    }
    
    /**
     * Sets (as xml) the "sy" attribute
     */
    public void xsetSy(org.openxmlformats.schemas.drawingml.x2006.main.STPercentage sy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SY$2);
            }
            target.set(sy);
        }
    }
    
    /**
     * Unsets the "sy" attribute
     */
    public void unsetSy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SY$2);
        }
    }
    
    /**
     * Gets the "kx" attribute
     */
    public int getKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KX$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "kx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KX$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "kx" attribute
     */
    public boolean isSetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KX$4) != null;
        }
    }
    
    /**
     * Sets the "kx" attribute
     */
    public void setKx(int kx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KX$4);
            }
            target.setIntValue(kx);
        }
    }
    
    /**
     * Sets (as xml) the "kx" attribute
     */
    public void xsetKx(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle kx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KX$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KX$4);
            }
            target.set(kx);
        }
    }
    
    /**
     * Unsets the "kx" attribute
     */
    public void unsetKx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KX$4);
        }
    }
    
    /**
     * Gets the "ky" attribute
     */
    public int getKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KY$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ky" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle xgetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_default_attribute_value(KY$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "ky" attribute
     */
    public boolean isSetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KY$6) != null;
        }
    }
    
    /**
     * Sets the "ky" attribute
     */
    public void setKy(int ky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KY$6);
            }
            target.setIntValue(ky);
        }
    }
    
    /**
     * Sets (as xml) the "ky" attribute
     */
    public void xsetKy(org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle ky)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().find_attribute_user(KY$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle)get_store().add_attribute_user(KY$6);
            }
            target.set(ky);
        }
    }
    
    /**
     * Unsets the "ky" attribute
     */
    public void unsetKy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KY$6);
        }
    }
    
    /**
     * Gets the "tx" attribute
     */
    public long getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TX$8);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "tx" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TX$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_default_attribute_value(TX$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "tx" attribute
     */
    public boolean isSetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TX$8) != null;
        }
    }
    
    /**
     * Sets the "tx" attribute
     */
    public void setTx(long tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TX$8);
            }
            target.setLongValue(tx);
        }
    }
    
    /**
     * Sets (as xml) the "tx" attribute
     */
    public void xsetTx(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate tx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TX$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(TX$8);
            }
            target.set(tx);
        }
    }
    
    /**
     * Unsets the "tx" attribute
     */
    public void unsetTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TX$8);
        }
    }
    
    /**
     * Gets the "ty" attribute
     */
    public long getTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TY$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ty" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate xgetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TY$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_default_attribute_value(TY$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "ty" attribute
     */
    public boolean isSetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TY$10) != null;
        }
    }
    
    /**
     * Sets the "ty" attribute
     */
    public void setTy(long ty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TY$10);
            }
            target.setLongValue(ty);
        }
    }
    
    /**
     * Sets (as xml) the "ty" attribute
     */
    public void xsetTy(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate ty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TY$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(TY$10);
            }
            target.set(ty);
        }
    }
    
    /**
     * Unsets the "ty" attribute
     */
    public void unsetTy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TY$10);
        }
    }
}
