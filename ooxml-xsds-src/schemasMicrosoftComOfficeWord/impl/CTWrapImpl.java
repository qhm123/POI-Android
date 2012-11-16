/*
 * XML Type:  CT_Wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.CTWrap
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * An XML CT_Wrap(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public class CTWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.CTWrap
{
    
    public CTWrapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName SIDE$2 = 
        new javax.xml.namespace.QName("", "side");
    private static final javax.xml.namespace.QName ANCHORX$4 = 
        new javax.xml.namespace.QName("", "anchorx");
    private static final javax.xml.namespace.QName ANCHORY$6 = 
        new javax.xml.namespace.QName("", "anchory");
    
    
    /**
     * Gets the "type" attribute
     */
    public schemasMicrosoftComOfficeWord.STWrapType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STWrapType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComOfficeWord.STWrapType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STWrapType target = null;
            target = (schemasMicrosoftComOfficeWord.STWrapType)get_store().find_attribute_user(TYPE$0);
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
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(schemasMicrosoftComOfficeWord.STWrapType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(schemasMicrosoftComOfficeWord.STWrapType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STWrapType target = null;
            target = (schemasMicrosoftComOfficeWord.STWrapType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STWrapType)get_store().add_attribute_user(TYPE$0);
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
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "side" attribute
     */
    public schemasMicrosoftComOfficeWord.STWrapSide.Enum getSide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STWrapSide.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "side" attribute
     */
    public schemasMicrosoftComOfficeWord.STWrapSide xgetSide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STWrapSide target = null;
            target = (schemasMicrosoftComOfficeWord.STWrapSide)get_store().find_attribute_user(SIDE$2);
            return target;
        }
    }
    
    /**
     * True if has "side" attribute
     */
    public boolean isSetSide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIDE$2) != null;
        }
    }
    
    /**
     * Sets the "side" attribute
     */
    public void setSide(schemasMicrosoftComOfficeWord.STWrapSide.Enum side)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$2);
            }
            target.setEnumValue(side);
        }
    }
    
    /**
     * Sets (as xml) the "side" attribute
     */
    public void xsetSide(schemasMicrosoftComOfficeWord.STWrapSide side)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STWrapSide target = null;
            target = (schemasMicrosoftComOfficeWord.STWrapSide)get_store().find_attribute_user(SIDE$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STWrapSide)get_store().add_attribute_user(SIDE$2);
            }
            target.set(side);
        }
    }
    
    /**
     * Unsets the "side" attribute
     */
    public void unsetSide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIDE$2);
        }
    }
    
    /**
     * Gets the "anchorx" attribute
     */
    public schemasMicrosoftComOfficeWord.STHorizontalAnchor.Enum getAnchorx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORX$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STHorizontalAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchorx" attribute
     */
    public schemasMicrosoftComOfficeWord.STHorizontalAnchor xgetAnchorx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STHorizontalAnchor target = null;
            target = (schemasMicrosoftComOfficeWord.STHorizontalAnchor)get_store().find_attribute_user(ANCHORX$4);
            return target;
        }
    }
    
    /**
     * True if has "anchorx" attribute
     */
    public boolean isSetAnchorx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHORX$4) != null;
        }
    }
    
    /**
     * Sets the "anchorx" attribute
     */
    public void setAnchorx(schemasMicrosoftComOfficeWord.STHorizontalAnchor.Enum anchorx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHORX$4);
            }
            target.setEnumValue(anchorx);
        }
    }
    
    /**
     * Sets (as xml) the "anchorx" attribute
     */
    public void xsetAnchorx(schemasMicrosoftComOfficeWord.STHorizontalAnchor anchorx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STHorizontalAnchor target = null;
            target = (schemasMicrosoftComOfficeWord.STHorizontalAnchor)get_store().find_attribute_user(ANCHORX$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STHorizontalAnchor)get_store().add_attribute_user(ANCHORX$4);
            }
            target.set(anchorx);
        }
    }
    
    /**
     * Unsets the "anchorx" attribute
     */
    public void unsetAnchorx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHORX$4);
        }
    }
    
    /**
     * Gets the "anchory" attribute
     */
    public schemasMicrosoftComOfficeWord.STVerticalAnchor.Enum getAnchory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORY$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeWord.STVerticalAnchor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchory" attribute
     */
    public schemasMicrosoftComOfficeWord.STVerticalAnchor xgetAnchory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STVerticalAnchor target = null;
            target = (schemasMicrosoftComOfficeWord.STVerticalAnchor)get_store().find_attribute_user(ANCHORY$6);
            return target;
        }
    }
    
    /**
     * True if has "anchory" attribute
     */
    public boolean isSetAnchory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHORY$6) != null;
        }
    }
    
    /**
     * Sets the "anchory" attribute
     */
    public void setAnchory(schemasMicrosoftComOfficeWord.STVerticalAnchor.Enum anchory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHORY$6);
            }
            target.setEnumValue(anchory);
        }
    }
    
    /**
     * Sets (as xml) the "anchory" attribute
     */
    public void xsetAnchory(schemasMicrosoftComOfficeWord.STVerticalAnchor anchory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.STVerticalAnchor target = null;
            target = (schemasMicrosoftComOfficeWord.STVerticalAnchor)get_store().find_attribute_user(ANCHORY$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.STVerticalAnchor)get_store().add_attribute_user(ANCHORY$6);
            }
            target.set(anchory);
        }
    }
    
    /**
     * Unsets the "anchory" attribute
     */
    public void unsetAnchory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHORY$6);
        }
    }
}
