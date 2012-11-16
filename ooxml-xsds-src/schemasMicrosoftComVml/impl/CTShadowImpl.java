/*
 * XML Type:  CT_Shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTShadow
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Shadow(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTShadowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTShadow
{
    
    public CTShadowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ON$2 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName OBSCURED$6 = 
        new javax.xml.namespace.QName("", "obscured");
    private static final javax.xml.namespace.QName COLOR$8 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName OPACITY$10 = 
        new javax.xml.namespace.QName("", "opacity");
    private static final javax.xml.namespace.QName OFFSET$12 = 
        new javax.xml.namespace.QName("", "offset");
    private static final javax.xml.namespace.QName COLOR2$14 = 
        new javax.xml.namespace.QName("", "color2");
    private static final javax.xml.namespace.QName OFFSET2$16 = 
        new javax.xml.namespace.QName("", "offset2");
    private static final javax.xml.namespace.QName ORIGIN$18 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName MATRIX$20 = 
        new javax.xml.namespace.QName("", "matrix");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
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
    public void setId(java.lang.String id)
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
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
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
     * Gets the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$2);
            return target;
        }
    }
    
    /**
     * True if has "on" attribute
     */
    public boolean isSetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ON$2) != null;
        }
    }
    
    /**
     * Sets the "on" attribute
     */
    public void setOn(schemasMicrosoftComVml.STTrueFalse.Enum on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ON$2);
            }
            target.setEnumValue(on);
        }
    }
    
    /**
     * Sets (as xml) the "on" attribute
     */
    public void xsetOn(schemasMicrosoftComVml.STTrueFalse on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$2);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ON$2);
            }
            target.set(on);
        }
    }
    
    /**
     * Unsets the "on" attribute
     */
    public void unsetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ON$2);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public schemasMicrosoftComVml.STShadowType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STShadowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComVml.STShadowType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STShadowType target = null;
            target = (schemasMicrosoftComVml.STShadowType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(schemasMicrosoftComVml.STShadowType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(schemasMicrosoftComVml.STShadowType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STShadowType target = null;
            target = (schemasMicrosoftComVml.STShadowType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STShadowType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "obscured" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getObscured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSCURED$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "obscured" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetObscured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(OBSCURED$6);
            return target;
        }
    }
    
    /**
     * True if has "obscured" attribute
     */
    public boolean isSetObscured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBSCURED$6) != null;
        }
    }
    
    /**
     * Sets the "obscured" attribute
     */
    public void setObscured(schemasMicrosoftComVml.STTrueFalse.Enum obscured)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSCURED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBSCURED$6);
            }
            target.setEnumValue(obscured);
        }
    }
    
    /**
     * Sets (as xml) the "obscured" attribute
     */
    public void xsetObscured(schemasMicrosoftComVml.STTrueFalse obscured)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(OBSCURED$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(OBSCURED$6);
            }
            target.set(obscured);
        }
    }
    
    /**
     * Unsets the "obscured" attribute
     */
    public void unsetObscured()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBSCURED$6);
        }
    }
    
    /**
     * Gets the "color" attribute
     */
    public java.lang.String getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "color" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR$8);
            return target;
        }
    }
    
    /**
     * True if has "color" attribute
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR$8) != null;
        }
    }
    
    /**
     * Sets the "color" attribute
     */
    public void setColor(java.lang.String color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$8);
            }
            target.setStringValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "color" attribute
     */
    public void xsetColor(schemasMicrosoftComVml.STColorType color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR$8);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(COLOR$8);
            }
            target.set(color);
        }
    }
    
    /**
     * Unsets the "color" attribute
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR$8);
        }
    }
    
    /**
     * Gets the "opacity" attribute
     */
    public java.lang.String getOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opacity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$10);
            return target;
        }
    }
    
    /**
     * True if has "opacity" attribute
     */
    public boolean isSetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPACITY$10) != null;
        }
    }
    
    /**
     * Sets the "opacity" attribute
     */
    public void setOpacity(java.lang.String opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPACITY$10);
            }
            target.setStringValue(opacity);
        }
    }
    
    /**
     * Sets (as xml) the "opacity" attribute
     */
    public void xsetOpacity(org.apache.xmlbeans.XmlString opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPACITY$10);
            }
            target.set(opacity);
        }
    }
    
    /**
     * Unsets the "opacity" attribute
     */
    public void unsetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPACITY$10);
        }
    }
    
    /**
     * Gets the "offset" attribute
     */
    public java.lang.String getOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offset" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFSET$12);
            return target;
        }
    }
    
    /**
     * True if has "offset" attribute
     */
    public boolean isSetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFSET$12) != null;
        }
    }
    
    /**
     * Sets the "offset" attribute
     */
    public void setOffset(java.lang.String offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSET$12);
            }
            target.setStringValue(offset);
        }
    }
    
    /**
     * Sets (as xml) the "offset" attribute
     */
    public void xsetOffset(org.apache.xmlbeans.XmlString offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFSET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OFFSET$12);
            }
            target.set(offset);
        }
    }
    
    /**
     * Unsets the "offset" attribute
     */
    public void unsetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFSET$12);
        }
    }
    
    /**
     * Gets the "color2" attribute
     */
    public java.lang.String getColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "color2" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$14);
            return target;
        }
    }
    
    /**
     * True if has "color2" attribute
     */
    public boolean isSetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR2$14) != null;
        }
    }
    
    /**
     * Sets the "color2" attribute
     */
    public void setColor2(java.lang.String color2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR2$14);
            }
            target.setStringValue(color2);
        }
    }
    
    /**
     * Sets (as xml) the "color2" attribute
     */
    public void xsetColor2(schemasMicrosoftComVml.STColorType color2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$14);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(COLOR2$14);
            }
            target.set(color2);
        }
    }
    
    /**
     * Unsets the "color2" attribute
     */
    public void unsetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR2$14);
        }
    }
    
    /**
     * Gets the "offset2" attribute
     */
    public java.lang.String getOffset2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET2$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offset2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOffset2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFSET2$16);
            return target;
        }
    }
    
    /**
     * True if has "offset2" attribute
     */
    public boolean isSetOffset2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OFFSET2$16) != null;
        }
    }
    
    /**
     * Sets the "offset2" attribute
     */
    public void setOffset2(java.lang.String offset2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OFFSET2$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OFFSET2$16);
            }
            target.setStringValue(offset2);
        }
    }
    
    /**
     * Sets (as xml) the "offset2" attribute
     */
    public void xsetOffset2(org.apache.xmlbeans.XmlString offset2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OFFSET2$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OFFSET2$16);
            }
            target.set(offset2);
        }
    }
    
    /**
     * Unsets the "offset2" attribute
     */
    public void unsetOffset2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OFFSET2$16);
        }
    }
    
    /**
     * Gets the "origin" attribute
     */
    public java.lang.String getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$18);
            return target;
        }
    }
    
    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGIN$18) != null;
        }
    }
    
    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(java.lang.String origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$18);
            }
            target.setStringValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlString origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGIN$18);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGIN$18);
        }
    }
    
    /**
     * Gets the "matrix" attribute
     */
    public java.lang.String getMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATRIX$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matrix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATRIX$20);
            return target;
        }
    }
    
    /**
     * True if has "matrix" attribute
     */
    public boolean isSetMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MATRIX$20) != null;
        }
    }
    
    /**
     * Sets the "matrix" attribute
     */
    public void setMatrix(java.lang.String matrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MATRIX$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MATRIX$20);
            }
            target.setStringValue(matrix);
        }
    }
    
    /**
     * Sets (as xml) the "matrix" attribute
     */
    public void xsetMatrix(org.apache.xmlbeans.XmlString matrix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MATRIX$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MATRIX$20);
            }
            target.set(matrix);
        }
    }
    
    /**
     * Unsets the "matrix" attribute
     */
    public void unsetMatrix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MATRIX$20);
        }
    }
}
