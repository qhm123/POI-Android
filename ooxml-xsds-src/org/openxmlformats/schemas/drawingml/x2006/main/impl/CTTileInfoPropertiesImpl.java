/*
 * XML Type:  CT_TileInfoProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TileInfoProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTileInfoPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties
{
    
    public CTTileInfoPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TX$0 = 
        new javax.xml.namespace.QName("", "tx");
    private static final javax.xml.namespace.QName TY$2 = 
        new javax.xml.namespace.QName("", "ty");
    private static final javax.xml.namespace.QName SX$4 = 
        new javax.xml.namespace.QName("", "sx");
    private static final javax.xml.namespace.QName SY$6 = 
        new javax.xml.namespace.QName("", "sy");
    private static final javax.xml.namespace.QName FLIP$8 = 
        new javax.xml.namespace.QName("", "flip");
    private static final javax.xml.namespace.QName ALGN$10 = 
        new javax.xml.namespace.QName("", "algn");
    
    
    /**
     * Gets the "tx" attribute
     */
    public long getTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TX$0);
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
            return get_store().find_attribute_user(TX$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TX$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TX$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(TX$0);
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
            get_store().remove_attribute(TX$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TY$2);
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
            return get_store().find_attribute_user(TY$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TY$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().find_attribute_user(TY$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate)get_store().add_attribute_user(TY$2);
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
            get_store().remove_attribute(TY$2);
        }
    }
    
    /**
     * Gets the "sx" attribute
     */
    public int getSx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$4);
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
            return get_store().find_attribute_user(SX$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SX$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SX$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SX$4);
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
            get_store().remove_attribute(SX$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$6);
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
            return get_store().find_attribute_user(SY$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SY$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().find_attribute_user(SY$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPercentage)get_store().add_attribute_user(SY$6);
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
            get_store().remove_attribute(SY$6);
        }
    }
    
    /**
     * Gets the "flip" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum getFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "flip" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode xgetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().find_attribute_user(FLIP$8);
            return target;
        }
    }
    
    /**
     * True if has "flip" attribute
     */
    public boolean isSetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLIP$8) != null;
        }
    }
    
    /**
     * Sets the "flip" attribute
     */
    public void setFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode.Enum flip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLIP$8);
            }
            target.setEnumValue(flip);
        }
    }
    
    /**
     * Sets (as xml) the "flip" attribute
     */
    public void xsetFlip(org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode flip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().find_attribute_user(FLIP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode)get_store().add_attribute_user(FLIP$8);
            }
            target.set(flip);
        }
    }
    
    /**
     * Unsets the "flip" attribute
     */
    public void unsetFlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLIP$8);
        }
    }
    
    /**
     * Gets the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum getAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "algn" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment xgetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$10);
            return target;
        }
    }
    
    /**
     * True if has "algn" attribute
     */
    public boolean isSetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALGN$10) != null;
        }
    }
    
    /**
     * Sets the "algn" attribute
     */
    public void setAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment.Enum algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGN$10);
            }
            target.setEnumValue(algn);
        }
    }
    
    /**
     * Sets (as xml) the "algn" attribute
     */
    public void xsetAlgn(org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment algn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().find_attribute_user(ALGN$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment)get_store().add_attribute_user(ALGN$10);
            }
            target.set(algn);
        }
    }
    
    /**
     * Unsets the "algn" attribute
     */
    public void unsetAlgn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALGN$10);
        }
    }
}
