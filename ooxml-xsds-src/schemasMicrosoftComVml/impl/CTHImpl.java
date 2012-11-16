/*
 * XML Type:  CT_H
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTH
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_H(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTHImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTH
{
    
    public CTHImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName POLAR$2 = 
        new javax.xml.namespace.QName("", "polar");
    private static final javax.xml.namespace.QName MAP$4 = 
        new javax.xml.namespace.QName("", "map");
    private static final javax.xml.namespace.QName INVX$6 = 
        new javax.xml.namespace.QName("", "invx");
    private static final javax.xml.namespace.QName INVY$8 = 
        new javax.xml.namespace.QName("", "invy");
    private static final javax.xml.namespace.QName SWITCH$10 = 
        new javax.xml.namespace.QName("", "switch");
    private static final javax.xml.namespace.QName XRANGE$12 = 
        new javax.xml.namespace.QName("", "xrange");
    private static final javax.xml.namespace.QName YRANGE$14 = 
        new javax.xml.namespace.QName("", "yrange");
    private static final javax.xml.namespace.QName RADIUSRANGE$16 = 
        new javax.xml.namespace.QName("", "radiusrange");
    
    
    /**
     * Gets the "position" attribute
     */
    public java.lang.String getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$0);
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
            return get_store().find_attribute_user(POSITION$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSITION$0);
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
            get_store().remove_attribute(POSITION$0);
        }
    }
    
    /**
     * Gets the "polar" attribute
     */
    public java.lang.String getPolar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLAR$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "polar" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPolar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLAR$2);
            return target;
        }
    }
    
    /**
     * True if has "polar" attribute
     */
    public boolean isSetPolar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POLAR$2) != null;
        }
    }
    
    /**
     * Sets the "polar" attribute
     */
    public void setPolar(java.lang.String polar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLAR$2);
            }
            target.setStringValue(polar);
        }
    }
    
    /**
     * Sets (as xml) the "polar" attribute
     */
    public void xsetPolar(org.apache.xmlbeans.XmlString polar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLAR$2);
            }
            target.set(polar);
        }
    }
    
    /**
     * Unsets the "polar" attribute
     */
    public void unsetPolar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POLAR$2);
        }
    }
    
    /**
     * Gets the "map" attribute
     */
    public java.lang.String getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "map" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$4);
            return target;
        }
    }
    
    /**
     * True if has "map" attribute
     */
    public boolean isSetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAP$4) != null;
        }
    }
    
    /**
     * Sets the "map" attribute
     */
    public void setMap(java.lang.String map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAP$4);
            }
            target.setStringValue(map);
        }
    }
    
    /**
     * Sets (as xml) the "map" attribute
     */
    public void xsetMap(org.apache.xmlbeans.XmlString map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAP$4);
            }
            target.set(map);
        }
    }
    
    /**
     * Unsets the "map" attribute
     */
    public void unsetMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAP$4);
        }
    }
    
    /**
     * Gets the "invx" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getInvx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVX$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "invx" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetInvx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INVX$6);
            return target;
        }
    }
    
    /**
     * True if has "invx" attribute
     */
    public boolean isSetInvx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVX$6) != null;
        }
    }
    
    /**
     * Sets the "invx" attribute
     */
    public void setInvx(schemasMicrosoftComVml.STTrueFalse.Enum invx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVX$6);
            }
            target.setEnumValue(invx);
        }
    }
    
    /**
     * Sets (as xml) the "invx" attribute
     */
    public void xsetInvx(schemasMicrosoftComVml.STTrueFalse invx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INVX$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(INVX$6);
            }
            target.set(invx);
        }
    }
    
    /**
     * Unsets the "invx" attribute
     */
    public void unsetInvx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVX$6);
        }
    }
    
    /**
     * Gets the "invy" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getInvy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVY$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "invy" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetInvy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INVY$8);
            return target;
        }
    }
    
    /**
     * True if has "invy" attribute
     */
    public boolean isSetInvy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVY$8) != null;
        }
    }
    
    /**
     * Sets the "invy" attribute
     */
    public void setInvy(schemasMicrosoftComVml.STTrueFalse.Enum invy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVY$8);
            }
            target.setEnumValue(invy);
        }
    }
    
    /**
     * Sets (as xml) the "invy" attribute
     */
    public void xsetInvy(schemasMicrosoftComVml.STTrueFalse invy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INVY$8);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(INVY$8);
            }
            target.set(invy);
        }
    }
    
    /**
     * Unsets the "invy" attribute
     */
    public void unsetInvy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVY$8);
        }
    }
    
    /**
     * Gets the "switch" attribute
     */
    public schemasMicrosoftComVml.STTrueFalseBlank.Enum getSwitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SWITCH$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "switch" attribute
     */
    public schemasMicrosoftComVml.STTrueFalseBlank xgetSwitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComVml.STTrueFalseBlank)get_store().find_attribute_user(SWITCH$10);
            return target;
        }
    }
    
    /**
     * True if has "switch" attribute
     */
    public boolean isSetSwitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SWITCH$10) != null;
        }
    }
    
    /**
     * Sets the "switch" attribute
     */
    public void setSwitch(schemasMicrosoftComVml.STTrueFalseBlank.Enum xswitch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SWITCH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SWITCH$10);
            }
            target.setEnumValue(xswitch);
        }
    }
    
    /**
     * Sets (as xml) the "switch" attribute
     */
    public void xsetSwitch(schemasMicrosoftComVml.STTrueFalseBlank xswitch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComVml.STTrueFalseBlank)get_store().find_attribute_user(SWITCH$10);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalseBlank)get_store().add_attribute_user(SWITCH$10);
            }
            target.set(xswitch);
        }
    }
    
    /**
     * Unsets the "switch" attribute
     */
    public void unsetSwitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SWITCH$10);
        }
    }
    
    /**
     * Gets the "xrange" attribute
     */
    public java.lang.String getXrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XRANGE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xrange" attribute
     */
    public org.apache.xmlbeans.XmlString xgetXrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XRANGE$12);
            return target;
        }
    }
    
    /**
     * True if has "xrange" attribute
     */
    public boolean isSetXrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XRANGE$12) != null;
        }
    }
    
    /**
     * Sets the "xrange" attribute
     */
    public void setXrange(java.lang.String xrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XRANGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XRANGE$12);
            }
            target.setStringValue(xrange);
        }
    }
    
    /**
     * Sets (as xml) the "xrange" attribute
     */
    public void xsetXrange(org.apache.xmlbeans.XmlString xrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(XRANGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(XRANGE$12);
            }
            target.set(xrange);
        }
    }
    
    /**
     * Unsets the "xrange" attribute
     */
    public void unsetXrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XRANGE$12);
        }
    }
    
    /**
     * Gets the "yrange" attribute
     */
    public java.lang.String getYrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YRANGE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yrange" attribute
     */
    public org.apache.xmlbeans.XmlString xgetYrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YRANGE$14);
            return target;
        }
    }
    
    /**
     * True if has "yrange" attribute
     */
    public boolean isSetYrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YRANGE$14) != null;
        }
    }
    
    /**
     * Sets the "yrange" attribute
     */
    public void setYrange(java.lang.String yrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YRANGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YRANGE$14);
            }
            target.setStringValue(yrange);
        }
    }
    
    /**
     * Sets (as xml) the "yrange" attribute
     */
    public void xsetYrange(org.apache.xmlbeans.XmlString yrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(YRANGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(YRANGE$14);
            }
            target.set(yrange);
        }
    }
    
    /**
     * Unsets the "yrange" attribute
     */
    public void unsetYrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YRANGE$14);
        }
    }
    
    /**
     * Gets the "radiusrange" attribute
     */
    public java.lang.String getRadiusrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSRANGE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "radiusrange" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRadiusrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RADIUSRANGE$16);
            return target;
        }
    }
    
    /**
     * True if has "radiusrange" attribute
     */
    public boolean isSetRadiusrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RADIUSRANGE$16) != null;
        }
    }
    
    /**
     * Sets the "radiusrange" attribute
     */
    public void setRadiusrange(java.lang.String radiusrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUSRANGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUSRANGE$16);
            }
            target.setStringValue(radiusrange);
        }
    }
    
    /**
     * Sets (as xml) the "radiusrange" attribute
     */
    public void xsetRadiusrange(org.apache.xmlbeans.XmlString radiusrange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RADIUSRANGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RADIUSRANGE$16);
            }
            target.set(radiusrange);
        }
    }
    
    /**
     * Unsets the "radiusrange" attribute
     */
    public void unsetRadiusrange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RADIUSRANGE$16);
        }
    }
}
