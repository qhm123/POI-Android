/*
 * XML Type:  CT_Callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTCallout
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Callout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTCalloutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTCallout
{
    
    public CTCalloutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName ON$2 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName GAP$6 = 
        new javax.xml.namespace.QName("", "gap");
    private static final javax.xml.namespace.QName ANGLE$8 = 
        new javax.xml.namespace.QName("", "angle");
    private static final javax.xml.namespace.QName DROPAUTO$10 = 
        new javax.xml.namespace.QName("", "dropauto");
    private static final javax.xml.namespace.QName DROP$12 = 
        new javax.xml.namespace.QName("", "drop");
    private static final javax.xml.namespace.QName DISTANCE$14 = 
        new javax.xml.namespace.QName("", "distance");
    private static final javax.xml.namespace.QName LENGTHSPECIFIED$16 = 
        new javax.xml.namespace.QName("", "lengthspecified");
    private static final javax.xml.namespace.QName LENGTH$18 = 
        new javax.xml.namespace.QName("", "length");
    private static final javax.xml.namespace.QName ACCENTBAR$20 = 
        new javax.xml.namespace.QName("", "accentbar");
    private static final javax.xml.namespace.QName TEXTBORDER$22 = 
        new javax.xml.namespace.QName("", "textborder");
    private static final javax.xml.namespace.QName MINUSX$24 = 
        new javax.xml.namespace.QName("", "minusx");
    private static final javax.xml.namespace.QName MINUSY$26 = 
        new javax.xml.namespace.QName("", "minusy");
    
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$0) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$0);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$0);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$0);
        }
    }
    
    /**
     * Gets the "on" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOn()
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
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "on" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ON$2);
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
    public void setOn(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum on)
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
    public void xsetOn(schemasMicrosoftComOfficeOffice.STTrueFalse on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ON$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ON$2);
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
    public java.lang.String getType()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
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
    public void setType(java.lang.String type)
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
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
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
     * Gets the "gap" attribute
     */
    public java.lang.String getGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAP$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gap" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GAP$6);
            return target;
        }
    }
    
    /**
     * True if has "gap" attribute
     */
    public boolean isSetGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GAP$6) != null;
        }
    }
    
    /**
     * Sets the "gap" attribute
     */
    public void setGap(java.lang.String gap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GAP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GAP$6);
            }
            target.setStringValue(gap);
        }
    }
    
    /**
     * Sets (as xml) the "gap" attribute
     */
    public void xsetGap(org.apache.xmlbeans.XmlString gap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GAP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GAP$6);
            }
            target.set(gap);
        }
    }
    
    /**
     * Unsets the "gap" attribute
     */
    public void unsetGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GAP$6);
        }
    }
    
    /**
     * Gets the "angle" attribute
     */
    public schemasMicrosoftComOfficeOffice.STAngle.Enum getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLE$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STAngle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "angle" attribute
     */
    public schemasMicrosoftComOfficeOffice.STAngle xgetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STAngle target = null;
            target = (schemasMicrosoftComOfficeOffice.STAngle)get_store().find_attribute_user(ANGLE$8);
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
            return get_store().find_attribute_user(ANGLE$8) != null;
        }
    }
    
    /**
     * Sets the "angle" attribute
     */
    public void setAngle(schemasMicrosoftComOfficeOffice.STAngle.Enum angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANGLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANGLE$8);
            }
            target.setEnumValue(angle);
        }
    }
    
    /**
     * Sets (as xml) the "angle" attribute
     */
    public void xsetAngle(schemasMicrosoftComOfficeOffice.STAngle angle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STAngle target = null;
            target = (schemasMicrosoftComOfficeOffice.STAngle)get_store().find_attribute_user(ANGLE$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STAngle)get_store().add_attribute_user(ANGLE$8);
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
            get_store().remove_attribute(ANGLE$8);
        }
    }
    
    /**
     * Gets the "dropauto" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getDropauto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROPAUTO$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dropauto" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetDropauto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DROPAUTO$10);
            return target;
        }
    }
    
    /**
     * True if has "dropauto" attribute
     */
    public boolean isSetDropauto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DROPAUTO$10) != null;
        }
    }
    
    /**
     * Sets the "dropauto" attribute
     */
    public void setDropauto(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum dropauto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROPAUTO$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DROPAUTO$10);
            }
            target.setEnumValue(dropauto);
        }
    }
    
    /**
     * Sets (as xml) the "dropauto" attribute
     */
    public void xsetDropauto(schemasMicrosoftComOfficeOffice.STTrueFalse dropauto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DROPAUTO$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DROPAUTO$10);
            }
            target.set(dropauto);
        }
    }
    
    /**
     * Unsets the "dropauto" attribute
     */
    public void unsetDropauto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DROPAUTO$10);
        }
    }
    
    /**
     * Gets the "drop" attribute
     */
    public java.lang.String getDrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROP$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "drop" attribute
     */
    public schemasMicrosoftComOfficeOffice.STCalloutDrop xgetDrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STCalloutDrop target = null;
            target = (schemasMicrosoftComOfficeOffice.STCalloutDrop)get_store().find_attribute_user(DROP$12);
            return target;
        }
    }
    
    /**
     * True if has "drop" attribute
     */
    public boolean isSetDrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DROP$12) != null;
        }
    }
    
    /**
     * Sets the "drop" attribute
     */
    public void setDrop(java.lang.String drop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DROP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DROP$12);
            }
            target.setStringValue(drop);
        }
    }
    
    /**
     * Sets (as xml) the "drop" attribute
     */
    public void xsetDrop(schemasMicrosoftComOfficeOffice.STCalloutDrop drop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STCalloutDrop target = null;
            target = (schemasMicrosoftComOfficeOffice.STCalloutDrop)get_store().find_attribute_user(DROP$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STCalloutDrop)get_store().add_attribute_user(DROP$12);
            }
            target.set(drop);
        }
    }
    
    /**
     * Unsets the "drop" attribute
     */
    public void unsetDrop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DROP$12);
        }
    }
    
    /**
     * Gets the "distance" attribute
     */
    public java.lang.String getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "distance" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTANCE$14);
            return target;
        }
    }
    
    /**
     * True if has "distance" attribute
     */
    public boolean isSetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTANCE$14) != null;
        }
    }
    
    /**
     * Sets the "distance" attribute
     */
    public void setDistance(java.lang.String distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTANCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTANCE$14);
            }
            target.setStringValue(distance);
        }
    }
    
    /**
     * Sets (as xml) the "distance" attribute
     */
    public void xsetDistance(org.apache.xmlbeans.XmlString distance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISTANCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISTANCE$14);
            }
            target.set(distance);
        }
    }
    
    /**
     * Unsets the "distance" attribute
     */
    public void unsetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTANCE$14);
        }
    }
    
    /**
     * Gets the "lengthspecified" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getLengthspecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHSPECIFIED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LENGTHSPECIFIED$16);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lengthspecified" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetLengthspecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LENGTHSPECIFIED$16);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_default_attribute_value(LENGTHSPECIFIED$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "lengthspecified" attribute
     */
    public boolean isSetLengthspecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LENGTHSPECIFIED$16) != null;
        }
    }
    
    /**
     * Sets the "lengthspecified" attribute
     */
    public void setLengthspecified(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum lengthspecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTHSPECIFIED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTHSPECIFIED$16);
            }
            target.setEnumValue(lengthspecified);
        }
    }
    
    /**
     * Sets (as xml) the "lengthspecified" attribute
     */
    public void xsetLengthspecified(schemasMicrosoftComOfficeOffice.STTrueFalse lengthspecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LENGTHSPECIFIED$16);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(LENGTHSPECIFIED$16);
            }
            target.set(lengthspecified);
        }
    }
    
    /**
     * Unsets the "lengthspecified" attribute
     */
    public void unsetLengthspecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LENGTHSPECIFIED$16);
        }
    }
    
    /**
     * Gets the "length" attribute
     */
    public java.lang.String getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "length" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LENGTH$18);
            return target;
        }
    }
    
    /**
     * True if has "length" attribute
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LENGTH$18) != null;
        }
    }
    
    /**
     * Sets the "length" attribute
     */
    public void setLength(java.lang.String length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$18);
            }
            target.setStringValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "length" attribute
     */
    public void xsetLength(org.apache.xmlbeans.XmlString length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LENGTH$18);
            }
            target.set(length);
        }
    }
    
    /**
     * Unsets the "length" attribute
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LENGTH$18);
        }
    }
    
    /**
     * Gets the "accentbar" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAccentbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENTBAR$20);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accentbar" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAccentbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ACCENTBAR$20);
            return target;
        }
    }
    
    /**
     * True if has "accentbar" attribute
     */
    public boolean isSetAccentbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCENTBAR$20) != null;
        }
    }
    
    /**
     * Sets the "accentbar" attribute
     */
    public void setAccentbar(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum accentbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCENTBAR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCENTBAR$20);
            }
            target.setEnumValue(accentbar);
        }
    }
    
    /**
     * Sets (as xml) the "accentbar" attribute
     */
    public void xsetAccentbar(schemasMicrosoftComOfficeOffice.STTrueFalse accentbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ACCENTBAR$20);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ACCENTBAR$20);
            }
            target.set(accentbar);
        }
    }
    
    /**
     * Unsets the "accentbar" attribute
     */
    public void unsetAccentbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCENTBAR$20);
        }
    }
    
    /**
     * Gets the "textborder" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getTextborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBORDER$22);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "textborder" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetTextborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(TEXTBORDER$22);
            return target;
        }
    }
    
    /**
     * True if has "textborder" attribute
     */
    public boolean isSetTextborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTBORDER$22) != null;
        }
    }
    
    /**
     * Sets the "textborder" attribute
     */
    public void setTextborder(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum textborder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBORDER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTBORDER$22);
            }
            target.setEnumValue(textborder);
        }
    }
    
    /**
     * Sets (as xml) the "textborder" attribute
     */
    public void xsetTextborder(schemasMicrosoftComOfficeOffice.STTrueFalse textborder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(TEXTBORDER$22);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(TEXTBORDER$22);
            }
            target.set(textborder);
        }
    }
    
    /**
     * Unsets the "textborder" attribute
     */
    public void unsetTextborder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTBORDER$22);
        }
    }
    
    /**
     * Gets the "minusx" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getMinusx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUSX$24);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "minusx" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetMinusx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(MINUSX$24);
            return target;
        }
    }
    
    /**
     * True if has "minusx" attribute
     */
    public boolean isSetMinusx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINUSX$24) != null;
        }
    }
    
    /**
     * Sets the "minusx" attribute
     */
    public void setMinusx(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum minusx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUSX$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINUSX$24);
            }
            target.setEnumValue(minusx);
        }
    }
    
    /**
     * Sets (as xml) the "minusx" attribute
     */
    public void xsetMinusx(schemasMicrosoftComOfficeOffice.STTrueFalse minusx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(MINUSX$24);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(MINUSX$24);
            }
            target.set(minusx);
        }
    }
    
    /**
     * Unsets the "minusx" attribute
     */
    public void unsetMinusx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINUSX$24);
        }
    }
    
    /**
     * Gets the "minusy" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getMinusy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUSY$26);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "minusy" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetMinusy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(MINUSY$26);
            return target;
        }
    }
    
    /**
     * True if has "minusy" attribute
     */
    public boolean isSetMinusy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINUSY$26) != null;
        }
    }
    
    /**
     * Sets the "minusy" attribute
     */
    public void setMinusy(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum minusy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINUSY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINUSY$26);
            }
            target.setEnumValue(minusy);
        }
    }
    
    /**
     * Sets (as xml) the "minusy" attribute
     */
    public void xsetMinusy(schemasMicrosoftComOfficeOffice.STTrueFalse minusy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(MINUSY$26);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(MINUSY$26);
            }
            target.set(minusy);
        }
    }
    
    /**
     * Unsets the "minusy" attribute
     */
    public void unsetMinusy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINUSY$26);
        }
    }
}
