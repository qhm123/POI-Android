/*
 * XML Type:  CT_Fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTFill
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Fill(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTFill
{
    
    public CTFillImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "fill");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ON$6 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName COLOR$8 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName OPACITY$10 = 
        new javax.xml.namespace.QName("", "opacity");
    private static final javax.xml.namespace.QName COLOR2$12 = 
        new javax.xml.namespace.QName("", "color2");
    private static final javax.xml.namespace.QName SRC$14 = 
        new javax.xml.namespace.QName("", "src");
    private static final javax.xml.namespace.QName HREF$16 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "href");
    private static final javax.xml.namespace.QName ALTHREF$18 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "althref");
    private static final javax.xml.namespace.QName SIZE$20 = 
        new javax.xml.namespace.QName("", "size");
    private static final javax.xml.namespace.QName ORIGIN$22 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName POSITION$24 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName ASPECT$26 = 
        new javax.xml.namespace.QName("", "aspect");
    private static final javax.xml.namespace.QName COLORS$28 = 
        new javax.xml.namespace.QName("", "colors");
    private static final javax.xml.namespace.QName ANGLE$30 = 
        new javax.xml.namespace.QName("", "angle");
    private static final javax.xml.namespace.QName ALIGNSHAPE$32 = 
        new javax.xml.namespace.QName("", "alignshape");
    private static final javax.xml.namespace.QName FOCUS$34 = 
        new javax.xml.namespace.QName("", "focus");
    private static final javax.xml.namespace.QName FOCUSSIZE$36 = 
        new javax.xml.namespace.QName("", "focussize");
    private static final javax.xml.namespace.QName FOCUSPOSITION$38 = 
        new javax.xml.namespace.QName("", "focusposition");
    private static final javax.xml.namespace.QName METHOD$40 = 
        new javax.xml.namespace.QName("", "method");
    private static final javax.xml.namespace.QName DETECTMOUSECLICK$42 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "detectmouseclick");
    private static final javax.xml.namespace.QName TITLE$44 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "title");
    private static final javax.xml.namespace.QName OPACITY2$46 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "opacity2");
    private static final javax.xml.namespace.QName RECOLOR$48 = 
        new javax.xml.namespace.QName("", "recolor");
    private static final javax.xml.namespace.QName ROTATE$50 = 
        new javax.xml.namespace.QName("", "rotate");
    private static final javax.xml.namespace.QName ID2$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName RELID$54 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "relid");
    
    
    /**
     * Gets the "fill" element
     */
    public schemasMicrosoftComOfficeOffice.CTFill getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fill" element
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$0) != 0;
        }
    }
    
    /**
     * Sets the "fill" element
     */
    public void setFill(schemasMicrosoftComOfficeOffice.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().add_element_user(FILL$0);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public schemasMicrosoftComOfficeOffice.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().add_element_user(FILL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fill" element
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$0, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
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
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
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
            get_store().remove_attribute(ID$2);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public schemasMicrosoftComVml.STFillType.Enum getType()
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
            return (schemasMicrosoftComVml.STFillType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComVml.STFillType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillType target = null;
            target = (schemasMicrosoftComVml.STFillType)get_store().find_attribute_user(TYPE$4);
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
    public void setType(schemasMicrosoftComVml.STFillType.Enum type)
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
    public void xsetType(schemasMicrosoftComVml.STFillType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillType target = null;
            target = (schemasMicrosoftComVml.STFillType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STFillType)get_store().add_attribute_user(TYPE$4);
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
     * Gets the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$6);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$6);
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
            return get_store().find_attribute_user(ON$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ON$6);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ON$6);
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
            get_store().remove_attribute(ON$6);
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
     * Gets the "color2" attribute
     */
    public java.lang.String getColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$12);
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
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$12);
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
            return get_store().find_attribute_user(COLOR2$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR2$12);
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
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$12);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(COLOR2$12);
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
            get_store().remove_attribute(COLOR2$12);
        }
    }
    
    /**
     * Gets the "src" attribute
     */
    public java.lang.String getSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "src" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$14);
            return target;
        }
    }
    
    /**
     * True if has "src" attribute
     */
    public boolean isSetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRC$14) != null;
        }
    }
    
    /**
     * Sets the "src" attribute
     */
    public void setSrc(java.lang.String src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRC$14);
            }
            target.setStringValue(src);
        }
    }
    
    /**
     * Sets (as xml) the "src" attribute
     */
    public void xsetSrc(org.apache.xmlbeans.XmlString src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRC$14);
            }
            target.set(src);
        }
    }
    
    /**
     * Unsets the "src" attribute
     */
    public void unsetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRC$14);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$16);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$16) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$16);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlString href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HREF$16);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$16);
        }
    }
    
    /**
     * Gets the "althref" attribute
     */
    public java.lang.String getAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "althref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$18);
            return target;
        }
    }
    
    /**
     * True if has "althref" attribute
     */
    public boolean isSetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALTHREF$18) != null;
        }
    }
    
    /**
     * Sets the "althref" attribute
     */
    public void setAlthref(java.lang.String althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTHREF$18);
            }
            target.setStringValue(althref);
        }
    }
    
    /**
     * Sets (as xml) the "althref" attribute
     */
    public void xsetAlthref(org.apache.xmlbeans.XmlString althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALTHREF$18);
            }
            target.set(althref);
        }
    }
    
    /**
     * Unsets the "althref" attribute
     */
    public void unsetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALTHREF$18);
        }
    }
    
    /**
     * Gets the "size" attribute
     */
    public java.lang.String getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$20);
            return target;
        }
    }
    
    /**
     * True if has "size" attribute
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIZE$20) != null;
        }
    }
    
    /**
     * Sets the "size" attribute
     */
    public void setSize(java.lang.String size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$20);
            }
            target.setStringValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlString size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIZE$20);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" attribute
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIZE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$22);
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
            return get_store().find_attribute_user(ORIGIN$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGIN$22);
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
            get_store().remove_attribute(ORIGIN$22);
        }
    }
    
    /**
     * Gets the "position" attribute
     */
    public java.lang.String getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$24);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$24) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(java.lang.String position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$24);
            }
            target.setStringValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(org.apache.xmlbeans.XmlString position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSITION$24);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$24);
        }
    }
    
    /**
     * Gets the "aspect" attribute
     */
    public schemasMicrosoftComVml.STImageAspect.Enum getAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASPECT$26);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STImageAspect.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aspect" attribute
     */
    public schemasMicrosoftComVml.STImageAspect xgetAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STImageAspect target = null;
            target = (schemasMicrosoftComVml.STImageAspect)get_store().find_attribute_user(ASPECT$26);
            return target;
        }
    }
    
    /**
     * True if has "aspect" attribute
     */
    public boolean isSetAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASPECT$26) != null;
        }
    }
    
    /**
     * Sets the "aspect" attribute
     */
    public void setAspect(schemasMicrosoftComVml.STImageAspect.Enum aspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASPECT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASPECT$26);
            }
            target.setEnumValue(aspect);
        }
    }
    
    /**
     * Sets (as xml) the "aspect" attribute
     */
    public void xsetAspect(schemasMicrosoftComVml.STImageAspect aspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STImageAspect target = null;
            target = (schemasMicrosoftComVml.STImageAspect)get_store().find_attribute_user(ASPECT$26);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STImageAspect)get_store().add_attribute_user(ASPECT$26);
            }
            target.set(aspect);
        }
    }
    
    /**
     * Unsets the "aspect" attribute
     */
    public void unsetAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASPECT$26);
        }
    }
    
    /**
     * Gets the "colors" attribute
     */
    public java.lang.String getColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORS$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colors" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLORS$28);
            return target;
        }
    }
    
    /**
     * True if has "colors" attribute
     */
    public boolean isSetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLORS$28) != null;
        }
    }
    
    /**
     * Sets the "colors" attribute
     */
    public void setColors(java.lang.String colors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLORS$28);
            }
            target.setStringValue(colors);
        }
    }
    
    /**
     * Sets (as xml) the "colors" attribute
     */
    public void xsetColors(org.apache.xmlbeans.XmlString colors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLORS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLORS$28);
            }
            target.set(colors);
        }
    }
    
    /**
     * Unsets the "colors" attribute
     */
    public void unsetColors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLORS$28);
        }
    }
    
    /**
     * Gets the "angle" attribute
     */
    public java.math.BigDecimal getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLE$30);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "angle" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ANGLE$30);
            return target;
        }
    }
    
    /**
     * True if has "angle" attribute
     */
    public boolean isSetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANGLE$30) != null;
        }
    }
    
    /**
     * Sets the "angle" attribute
     */
    public void setAngle(java.math.BigDecimal angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANGLE$30);
            }
            target.setBigDecimalValue(angle);
        }
    }
    
    /**
     * Sets (as xml) the "angle" attribute
     */
    public void xsetAngle(org.apache.xmlbeans.XmlDecimal angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ANGLE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(ANGLE$30);
            }
            target.set(angle);
        }
    }
    
    /**
     * Unsets the "angle" attribute
     */
    public void unsetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANGLE$30);
        }
    }
    
    /**
     * Gets the "alignshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getAlignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNSHAPE$32);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetAlignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ALIGNSHAPE$32);
            return target;
        }
    }
    
    /**
     * True if has "alignshape" attribute
     */
    public boolean isSetAlignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGNSHAPE$32) != null;
        }
    }
    
    /**
     * Sets the "alignshape" attribute
     */
    public void setAlignshape(schemasMicrosoftComVml.STTrueFalse.Enum alignshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNSHAPE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNSHAPE$32);
            }
            target.setEnumValue(alignshape);
        }
    }
    
    /**
     * Sets (as xml) the "alignshape" attribute
     */
    public void xsetAlignshape(schemasMicrosoftComVml.STTrueFalse alignshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ALIGNSHAPE$32);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ALIGNSHAPE$32);
            }
            target.set(alignshape);
        }
    }
    
    /**
     * Unsets the "alignshape" attribute
     */
    public void unsetAlignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGNSHAPE$32);
        }
    }
    
    /**
     * Gets the "focus" attribute
     */
    public java.lang.String getFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUS$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "focus" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUS$34);
            return target;
        }
    }
    
    /**
     * True if has "focus" attribute
     */
    public boolean isSetFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOCUS$34) != null;
        }
    }
    
    /**
     * Sets the "focus" attribute
     */
    public void setFocus(java.lang.String focus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOCUS$34);
            }
            target.setStringValue(focus);
        }
    }
    
    /**
     * Sets (as xml) the "focus" attribute
     */
    public void xsetFocus(org.apache.xmlbeans.XmlString focus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FOCUS$34);
            }
            target.set(focus);
        }
    }
    
    /**
     * Unsets the "focus" attribute
     */
    public void unsetFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOCUS$34);
        }
    }
    
    /**
     * Gets the "focussize" attribute
     */
    public java.lang.String getFocussize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSSIZE$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "focussize" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFocussize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSSIZE$36);
            return target;
        }
    }
    
    /**
     * True if has "focussize" attribute
     */
    public boolean isSetFocussize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOCUSSIZE$36) != null;
        }
    }
    
    /**
     * Sets the "focussize" attribute
     */
    public void setFocussize(java.lang.String focussize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSSIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOCUSSIZE$36);
            }
            target.setStringValue(focussize);
        }
    }
    
    /**
     * Sets (as xml) the "focussize" attribute
     */
    public void xsetFocussize(org.apache.xmlbeans.XmlString focussize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSSIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FOCUSSIZE$36);
            }
            target.set(focussize);
        }
    }
    
    /**
     * Unsets the "focussize" attribute
     */
    public void unsetFocussize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOCUSSIZE$36);
        }
    }
    
    /**
     * Gets the "focusposition" attribute
     */
    public java.lang.String getFocusposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSPOSITION$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "focusposition" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFocusposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSPOSITION$38);
            return target;
        }
    }
    
    /**
     * True if has "focusposition" attribute
     */
    public boolean isSetFocusposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOCUSPOSITION$38) != null;
        }
    }
    
    /**
     * Sets the "focusposition" attribute
     */
    public void setFocusposition(java.lang.String focusposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSPOSITION$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOCUSPOSITION$38);
            }
            target.setStringValue(focusposition);
        }
    }
    
    /**
     * Sets (as xml) the "focusposition" attribute
     */
    public void xsetFocusposition(org.apache.xmlbeans.XmlString focusposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSPOSITION$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FOCUSPOSITION$38);
            }
            target.set(focusposition);
        }
    }
    
    /**
     * Unsets the "focusposition" attribute
     */
    public void unsetFocusposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOCUSPOSITION$38);
        }
    }
    
    /**
     * Gets the "method" attribute
     */
    public schemasMicrosoftComVml.STFillMethod.Enum getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$40);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STFillMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public schemasMicrosoftComVml.STFillMethod xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillMethod target = null;
            target = (schemasMicrosoftComVml.STFillMethod)get_store().find_attribute_user(METHOD$40);
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$40) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(schemasMicrosoftComVml.STFillMethod.Enum method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$40);
            }
            target.setEnumValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(schemasMicrosoftComVml.STFillMethod method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillMethod target = null;
            target = (schemasMicrosoftComVml.STFillMethod)get_store().find_attribute_user(METHOD$40);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STFillMethod)get_store().add_attribute_user(METHOD$40);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$40);
        }
    }
    
    /**
     * Gets the "detectmouseclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTMOUSECLICK$42);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "detectmouseclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DETECTMOUSECLICK$42);
            return target;
        }
    }
    
    /**
     * True if has "detectmouseclick" attribute
     */
    public boolean isSetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETECTMOUSECLICK$42) != null;
        }
    }
    
    /**
     * Sets the "detectmouseclick" attribute
     */
    public void setDetectmouseclick(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum detectmouseclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTMOUSECLICK$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETECTMOUSECLICK$42);
            }
            target.setEnumValue(detectmouseclick);
        }
    }
    
    /**
     * Sets (as xml) the "detectmouseclick" attribute
     */
    public void xsetDetectmouseclick(schemasMicrosoftComOfficeOffice.STTrueFalse detectmouseclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DETECTMOUSECLICK$42);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DETECTMOUSECLICK$42);
            }
            target.set(detectmouseclick);
        }
    }
    
    /**
     * Unsets the "detectmouseclick" attribute
     */
    public void unsetDetectmouseclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETECTMOUSECLICK$42);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$44);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$44) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$44);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$44);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$44);
        }
    }
    
    /**
     * Gets the "opacity2" attribute
     */
    public java.lang.String getOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY2$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opacity2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY2$46);
            return target;
        }
    }
    
    /**
     * True if has "opacity2" attribute
     */
    public boolean isSetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPACITY2$46) != null;
        }
    }
    
    /**
     * Sets the "opacity2" attribute
     */
    public void setOpacity2(java.lang.String opacity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY2$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPACITY2$46);
            }
            target.setStringValue(opacity2);
        }
    }
    
    /**
     * Sets (as xml) the "opacity2" attribute
     */
    public void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY2$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPACITY2$46);
            }
            target.set(opacity2);
        }
    }
    
    /**
     * Unsets the "opacity2" attribute
     */
    public void unsetOpacity2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPACITY2$46);
        }
    }
    
    /**
     * Gets the "recolor" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getRecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECOLOR$48);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "recolor" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetRecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(RECOLOR$48);
            return target;
        }
    }
    
    /**
     * True if has "recolor" attribute
     */
    public boolean isSetRecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECOLOR$48) != null;
        }
    }
    
    /**
     * Sets the "recolor" attribute
     */
    public void setRecolor(schemasMicrosoftComVml.STTrueFalse.Enum recolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECOLOR$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECOLOR$48);
            }
            target.setEnumValue(recolor);
        }
    }
    
    /**
     * Sets (as xml) the "recolor" attribute
     */
    public void xsetRecolor(schemasMicrosoftComVml.STTrueFalse recolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(RECOLOR$48);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(RECOLOR$48);
            }
            target.set(recolor);
        }
    }
    
    /**
     * Unsets the "recolor" attribute
     */
    public void unsetRecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECOLOR$48);
        }
    }
    
    /**
     * Gets the "rotate" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getRotate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATE$50);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rotate" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetRotate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ROTATE$50);
            return target;
        }
    }
    
    /**
     * True if has "rotate" attribute
     */
    public boolean isSetRotate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROTATE$50) != null;
        }
    }
    
    /**
     * Sets the "rotate" attribute
     */
    public void setRotate(schemasMicrosoftComVml.STTrueFalse.Enum rotate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATE$50);
            }
            target.setEnumValue(rotate);
        }
    }
    
    /**
     * Sets (as xml) the "rotate" attribute
     */
    public void xsetRotate(schemasMicrosoftComVml.STTrueFalse rotate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ROTATE$50);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ROTATE$50);
            }
            target.set(rotate);
        }
    }
    
    /**
     * Unsets the "rotate" attribute
     */
    public void unsetRotate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROTATE$50);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID2$52);
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
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID2$52);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID2$52) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId2(java.lang.String id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID2$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID2$52);
            }
            target.setStringValue(id2);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId2(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID2$52);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID2$52);
            }
            target.set(id2);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID2$52);
        }
    }
    
    /**
     * Gets the "relid" attribute
     */
    public java.lang.String getRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relid" attribute
     */
    public schemasMicrosoftComOfficeOffice.STRelationshipId xgetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$54);
            return target;
        }
    }
    
    /**
     * True if has "relid" attribute
     */
    public boolean isSetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELID$54) != null;
        }
    }
    
    /**
     * Sets the "relid" attribute
     */
    public void setRelid(java.lang.String relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELID$54);
            }
            target.setStringValue(relid);
        }
    }
    
    /**
     * Sets (as xml) the "relid" attribute
     */
    public void xsetRelid(schemasMicrosoftComOfficeOffice.STRelationshipId relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$54);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().add_attribute_user(RELID$54);
            }
            target.set(relid);
        }
    }
    
    /**
     * Unsets the "relid" attribute
     */
    public void unsetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELID$54);
        }
    }
}
