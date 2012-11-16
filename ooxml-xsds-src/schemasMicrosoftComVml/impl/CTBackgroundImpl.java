/*
 * XML Type:  CT_Background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTBackground
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Background(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTBackgroundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTBackground
{
    
    public CTBackgroundImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "fill");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName FILLED$4 = 
        new javax.xml.namespace.QName("", "filled");
    private static final javax.xml.namespace.QName FILLCOLOR$6 = 
        new javax.xml.namespace.QName("", "fillcolor");
    private static final javax.xml.namespace.QName BWMODE$8 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwmode");
    private static final javax.xml.namespace.QName BWPURE$10 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwpure");
    private static final javax.xml.namespace.QName BWNORMAL$12 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwnormal");
    private static final javax.xml.namespace.QName TARGETSCREENSIZE$14 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "targetscreensize");
    
    
    /**
     * Gets the "fill" element
     */
    public schemasMicrosoftComVml.CTFill getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$0, 0);
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
    public void setFill(schemasMicrosoftComVml.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTFill)get_store().add_element_user(FILL$0);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public schemasMicrosoftComVml.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().add_element_user(FILL$0);
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
     * Gets the "filled" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "filled" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$4);
            return target;
        }
    }
    
    /**
     * True if has "filled" attribute
     */
    public boolean isSetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLED$4) != null;
        }
    }
    
    /**
     * Sets the "filled" attribute
     */
    public void setFilled(schemasMicrosoftComVml.STTrueFalse.Enum filled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLED$4);
            }
            target.setEnumValue(filled);
        }
    }
    
    /**
     * Sets (as xml) the "filled" attribute
     */
    public void xsetFilled(schemasMicrosoftComVml.STTrueFalse filled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$4);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FILLED$4);
            }
            target.set(filled);
        }
    }
    
    /**
     * Unsets the "filled" attribute
     */
    public void unsetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLED$4);
        }
    }
    
    /**
     * Gets the "fillcolor" attribute
     */
    public java.lang.String getFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$6);
            return target;
        }
    }
    
    /**
     * True if has "fillcolor" attribute
     */
    public boolean isSetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLCOLOR$6) != null;
        }
    }
    
    /**
     * Sets the "fillcolor" attribute
     */
    public void setFillcolor(java.lang.String fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLCOLOR$6);
            }
            target.setStringValue(fillcolor);
        }
    }
    
    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    public void xsetFillcolor(schemasMicrosoftComVml.STColorType fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(FILLCOLOR$6);
            }
            target.set(fillcolor);
        }
    }
    
    /**
     * Unsets the "fillcolor" attribute
     */
    public void unsetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLCOLOR$6);
        }
    }
    
    /**
     * Gets the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$8);
            return target;
        }
    }
    
    /**
     * True if has "bwmode" attribute
     */
    public boolean isSetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWMODE$8) != null;
        }
    }
    
    /**
     * Sets the "bwmode" attribute
     */
    public void setBwmode(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWMODE$8);
            }
            target.setEnumValue(bwmode);
        }
    }
    
    /**
     * Sets (as xml) the "bwmode" attribute
     */
    public void xsetBwmode(schemasMicrosoftComOfficeOffice.STBWMode bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWMODE$8);
            }
            target.set(bwmode);
        }
    }
    
    /**
     * Unsets the "bwmode" attribute
     */
    public void unsetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWMODE$8);
        }
    }
    
    /**
     * Gets the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$10);
            return target;
        }
    }
    
    /**
     * True if has "bwpure" attribute
     */
    public boolean isSetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWPURE$10) != null;
        }
    }
    
    /**
     * Sets the "bwpure" attribute
     */
    public void setBwpure(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWPURE$10);
            }
            target.setEnumValue(bwpure);
        }
    }
    
    /**
     * Sets (as xml) the "bwpure" attribute
     */
    public void xsetBwpure(schemasMicrosoftComOfficeOffice.STBWMode bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWPURE$10);
            }
            target.set(bwpure);
        }
    }
    
    /**
     * Unsets the "bwpure" attribute
     */
    public void unsetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWPURE$10);
        }
    }
    
    /**
     * Gets the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$12);
            return target;
        }
    }
    
    /**
     * True if has "bwnormal" attribute
     */
    public boolean isSetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWNORMAL$12) != null;
        }
    }
    
    /**
     * Sets the "bwnormal" attribute
     */
    public void setBwnormal(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWNORMAL$12);
            }
            target.setEnumValue(bwnormal);
        }
    }
    
    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    public void xsetBwnormal(schemasMicrosoftComOfficeOffice.STBWMode bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWNORMAL$12);
            }
            target.set(bwnormal);
        }
    }
    
    /**
     * Unsets the "bwnormal" attribute
     */
    public void unsetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWNORMAL$12);
        }
    }
    
    /**
     * Gets the "targetscreensize" attribute
     */
    public schemasMicrosoftComOfficeOffice.STScreenSize.Enum getTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$14);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STScreenSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    public schemasMicrosoftComOfficeOffice.STScreenSize xgetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STScreenSize target = null;
            target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$14);
            return target;
        }
    }
    
    /**
     * True if has "targetscreensize" attribute
     */
    public boolean isSetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETSCREENSIZE$14) != null;
        }
    }
    
    /**
     * Sets the "targetscreensize" attribute
     */
    public void setTargetscreensize(schemasMicrosoftComOfficeOffice.STScreenSize.Enum targetscreensize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSCREENSIZE$14);
            }
            target.setEnumValue(targetscreensize);
        }
    }
    
    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    public void xsetTargetscreensize(schemasMicrosoftComOfficeOffice.STScreenSize targetscreensize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STScreenSize target = null;
            target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$14);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().add_attribute_user(TARGETSCREENSIZE$14);
            }
            target.set(targetscreensize);
        }
    }
    
    /**
     * Unsets the "targetscreensize" attribute
     */
    public void unsetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETSCREENSIZE$14);
        }
    }
}
