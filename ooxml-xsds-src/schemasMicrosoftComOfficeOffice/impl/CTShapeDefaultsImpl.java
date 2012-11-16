/*
 * XML Type:  CT_ShapeDefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTShapeDefaults
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_ShapeDefaults(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTShapeDefaultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTShapeDefaults
{
    
    public CTShapeDefaultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "fill");
    private static final javax.xml.namespace.QName STROKE$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "stroke");
    private static final javax.xml.namespace.QName TEXTBOX$4 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "textbox");
    private static final javax.xml.namespace.QName SHADOW$6 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shadow");
    private static final javax.xml.namespace.QName SKEW$8 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "skew");
    private static final javax.xml.namespace.QName EXTRUSION$10 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "extrusion");
    private static final javax.xml.namespace.QName CALLOUT$12 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "callout");
    private static final javax.xml.namespace.QName LOCK$14 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "lock");
    private static final javax.xml.namespace.QName COLORMRU$16 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "colormru");
    private static final javax.xml.namespace.QName COLORMENU$18 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "colormenu");
    private static final javax.xml.namespace.QName EXT$20 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName SPIDMAX$22 = 
        new javax.xml.namespace.QName("", "spidmax");
    private static final javax.xml.namespace.QName STYLE$24 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName FILL2$26 = 
        new javax.xml.namespace.QName("", "fill");
    private static final javax.xml.namespace.QName FILLCOLOR$28 = 
        new javax.xml.namespace.QName("", "fillcolor");
    private static final javax.xml.namespace.QName STROKE2$30 = 
        new javax.xml.namespace.QName("", "stroke");
    private static final javax.xml.namespace.QName STROKECOLOR$32 = 
        new javax.xml.namespace.QName("", "strokecolor");
    private static final javax.xml.namespace.QName ALLOWINCELL$34 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowincell");
    
    
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
     * Gets the "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke getStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stroke" element
     */
    public boolean isSetStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STROKE$2) != 0;
        }
    }
    
    /**
     * Sets the "stroke" element
     */
    public void setStroke(schemasMicrosoftComVml.CTStroke stroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$2, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTStroke)get_store().add_element_user(STROKE$2);
            }
            target.set(stroke);
        }
    }
    
    /**
     * Appends and returns a new empty "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke addNewStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().add_element_user(STROKE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "stroke" element
     */
    public void unsetStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STROKE$2, 0);
        }
    }
    
    /**
     * Gets the "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox getTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "textbox" element
     */
    public boolean isSetTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTBOX$4) != 0;
        }
    }
    
    /**
     * Sets the "textbox" element
     */
    public void setTextbox(schemasMicrosoftComVml.CTTextbox textbox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$4, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTTextbox)get_store().add_element_user(TEXTBOX$4);
            }
            target.set(textbox);
        }
    }
    
    /**
     * Appends and returns a new empty "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox addNewTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().add_element_user(TEXTBOX$4);
            return target;
        }
    }
    
    /**
     * Unsets the "textbox" element
     */
    public void unsetTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTBOX$4, 0);
        }
    }
    
    /**
     * Gets the "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow getShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shadow" element
     */
    public boolean isSetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHADOW$6) != 0;
        }
    }
    
    /**
     * Sets the "shadow" element
     */
    public void setShadow(schemasMicrosoftComVml.CTShadow shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$6, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTShadow)get_store().add_element_user(SHADOW$6);
            }
            target.set(shadow);
        }
    }
    
    /**
     * Appends and returns a new empty "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow addNewShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().add_element_user(SHADOW$6);
            return target;
        }
    }
    
    /**
     * Unsets the "shadow" element
     */
    public void unsetShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHADOW$6, 0);
        }
    }
    
    /**
     * Gets the "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew getSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "skew" element
     */
    public boolean isSetSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKEW$8) != 0;
        }
    }
    
    /**
     * Sets the "skew" element
     */
    public void setSkew(schemasMicrosoftComOfficeOffice.CTSkew skew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$8, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().add_element_user(SKEW$8);
            }
            target.set(skew);
        }
    }
    
    /**
     * Appends and returns a new empty "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew addNewSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().add_element_user(SKEW$8);
            return target;
        }
    }
    
    /**
     * Unsets the "skew" element
     */
    public void unsetSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKEW$8, 0);
        }
    }
    
    /**
     * Gets the "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion getExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extrusion" element
     */
    public boolean isSetExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRUSION$10) != 0;
        }
    }
    
    /**
     * Sets the "extrusion" element
     */
    public void setExtrusion(schemasMicrosoftComOfficeOffice.CTExtrusion extrusion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$10, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().add_element_user(EXTRUSION$10);
            }
            target.set(extrusion);
        }
    }
    
    /**
     * Appends and returns a new empty "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion addNewExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().add_element_user(EXTRUSION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "extrusion" element
     */
    public void unsetExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRUSION$10, 0);
        }
    }
    
    /**
     * Gets the "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout getCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "callout" element
     */
    public boolean isSetCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLOUT$12) != 0;
        }
    }
    
    /**
     * Sets the "callout" element
     */
    public void setCallout(schemasMicrosoftComOfficeOffice.CTCallout callout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$12, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().add_element_user(CALLOUT$12);
            }
            target.set(callout);
        }
    }
    
    /**
     * Appends and returns a new empty "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout addNewCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().add_element_user(CALLOUT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "callout" element
     */
    public void unsetCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLOUT$12, 0);
        }
    }
    
    /**
     * Gets the "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock getLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lock" element
     */
    public boolean isSetLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCK$14) != 0;
        }
    }
    
    /**
     * Sets the "lock" element
     */
    public void setLock(schemasMicrosoftComOfficeOffice.CTLock lock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$14, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().add_element_user(LOCK$14);
            }
            target.set(lock);
        }
    }
    
    /**
     * Appends and returns a new empty "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock addNewLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().add_element_user(LOCK$14);
            return target;
        }
    }
    
    /**
     * Unsets the "lock" element
     */
    public void unsetLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCK$14, 0);
        }
    }
    
    /**
     * Gets the "colormru" element
     */
    public schemasMicrosoftComOfficeOffice.CTColorMru getColormru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMru target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMru)get_store().find_element_user(COLORMRU$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colormru" element
     */
    public boolean isSetColormru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORMRU$16) != 0;
        }
    }
    
    /**
     * Sets the "colormru" element
     */
    public void setColormru(schemasMicrosoftComOfficeOffice.CTColorMru colormru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMru target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMru)get_store().find_element_user(COLORMRU$16, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTColorMru)get_store().add_element_user(COLORMRU$16);
            }
            target.set(colormru);
        }
    }
    
    /**
     * Appends and returns a new empty "colormru" element
     */
    public schemasMicrosoftComOfficeOffice.CTColorMru addNewColormru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMru target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMru)get_store().add_element_user(COLORMRU$16);
            return target;
        }
    }
    
    /**
     * Unsets the "colormru" element
     */
    public void unsetColormru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORMRU$16, 0);
        }
    }
    
    /**
     * Gets the "colormenu" element
     */
    public schemasMicrosoftComOfficeOffice.CTColorMenu getColormenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMenu target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMenu)get_store().find_element_user(COLORMENU$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colormenu" element
     */
    public boolean isSetColormenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORMENU$18) != 0;
        }
    }
    
    /**
     * Sets the "colormenu" element
     */
    public void setColormenu(schemasMicrosoftComOfficeOffice.CTColorMenu colormenu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMenu target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMenu)get_store().find_element_user(COLORMENU$18, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTColorMenu)get_store().add_element_user(COLORMENU$18);
            }
            target.set(colormenu);
        }
    }
    
    /**
     * Appends and returns a new empty "colormenu" element
     */
    public schemasMicrosoftComOfficeOffice.CTColorMenu addNewColormenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTColorMenu target = null;
            target = (schemasMicrosoftComOfficeOffice.CTColorMenu)get_store().add_element_user(COLORMENU$18);
            return target;
        }
    }
    
    /**
     * Unsets the "colormenu" element
     */
    public void unsetColormenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORMENU$18, 0);
        }
    }
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$20);
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
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$20);
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
            return get_store().find_attribute_user(EXT$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$20);
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
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$20);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$20);
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
            get_store().remove_attribute(EXT$20);
        }
    }
    
    /**
     * Gets the "spidmax" attribute
     */
    public java.math.BigInteger getSpidmax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPIDMAX$22);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "spidmax" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSpidmax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SPIDMAX$22);
            return target;
        }
    }
    
    /**
     * True if has "spidmax" attribute
     */
    public boolean isSetSpidmax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPIDMAX$22) != null;
        }
    }
    
    /**
     * Sets the "spidmax" attribute
     */
    public void setSpidmax(java.math.BigInteger spidmax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPIDMAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPIDMAX$22);
            }
            target.setBigIntegerValue(spidmax);
        }
    }
    
    /**
     * Sets (as xml) the "spidmax" attribute
     */
    public void xsetSpidmax(org.apache.xmlbeans.XmlInteger spidmax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SPIDMAX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SPIDMAX$22);
            }
            target.set(spidmax);
        }
    }
    
    /**
     * Unsets the "spidmax" attribute
     */
    public void unsetSpidmax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPIDMAX$22);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$24);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$24) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$24);
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$24);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$24);
        }
    }
    
    /**
     * Gets the "fill" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getFill2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL2$26);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fill" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetFill2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FILL2$26);
            return target;
        }
    }
    
    /**
     * True if has "fill" attribute
     */
    public boolean isSetFill2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILL2$26) != null;
        }
    }
    
    /**
     * Sets the "fill" attribute
     */
    public void setFill2(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum fill2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL2$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILL2$26);
            }
            target.setEnumValue(fill2);
        }
    }
    
    /**
     * Sets (as xml) the "fill" attribute
     */
    public void xsetFill2(schemasMicrosoftComOfficeOffice.STTrueFalse fill2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FILL2$26);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(FILL2$26);
            }
            target.set(fill2);
        }
    }
    
    /**
     * Unsets the "fill" attribute
     */
    public void unsetFill2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILL2$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$28);
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
    public schemasMicrosoftComOfficeOffice.STColorType xgetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(FILLCOLOR$28);
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
            return get_store().find_attribute_user(FILLCOLOR$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLCOLOR$28);
            }
            target.setStringValue(fillcolor);
        }
    }
    
    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    public void xsetFillcolor(schemasMicrosoftComOfficeOffice.STColorType fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(FILLCOLOR$28);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(FILLCOLOR$28);
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
            get_store().remove_attribute(FILLCOLOR$28);
        }
    }
    
    /**
     * Gets the "stroke" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getStroke2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKE2$30);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "stroke" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetStroke2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(STROKE2$30);
            return target;
        }
    }
    
    /**
     * True if has "stroke" attribute
     */
    public boolean isSetStroke2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKE2$30) != null;
        }
    }
    
    /**
     * Sets the "stroke" attribute
     */
    public void setStroke2(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum stroke2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKE2$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKE2$30);
            }
            target.setEnumValue(stroke2);
        }
    }
    
    /**
     * Sets (as xml) the "stroke" attribute
     */
    public void xsetStroke2(schemasMicrosoftComOfficeOffice.STTrueFalse stroke2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(STROKE2$30);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(STROKE2$30);
            }
            target.set(stroke2);
        }
    }
    
    /**
     * Unsets the "stroke" attribute
     */
    public void unsetStroke2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKE2$30);
        }
    }
    
    /**
     * Gets the "strokecolor" attribute
     */
    public java.lang.String getStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorType xgetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(STROKECOLOR$32);
            return target;
        }
    }
    
    /**
     * True if has "strokecolor" attribute
     */
    public boolean isSetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKECOLOR$32) != null;
        }
    }
    
    /**
     * Sets the "strokecolor" attribute
     */
    public void setStrokecolor(java.lang.String strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKECOLOR$32);
            }
            target.setStringValue(strokecolor);
        }
    }
    
    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    public void xsetStrokecolor(schemasMicrosoftComOfficeOffice.STColorType strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(STROKECOLOR$32);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(STROKECOLOR$32);
            }
            target.set(strokecolor);
        }
    }
    
    /**
     * Unsets the "strokecolor" attribute
     */
    public void unsetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKECOLOR$32);
        }
    }
    
    /**
     * Gets the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$34);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$34);
            return target;
        }
    }
    
    /**
     * True if has "allowincell" attribute
     */
    public boolean isSetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWINCELL$34) != null;
        }
    }
    
    /**
     * Sets the "allowincell" attribute
     */
    public void setAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWINCELL$34);
            }
            target.setEnumValue(allowincell);
        }
    }
    
    /**
     * Sets (as xml) the "allowincell" attribute
     */
    public void xsetAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$34);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWINCELL$34);
            }
            target.set(allowincell);
        }
    }
    
    /**
     * Unsets the "allowincell" attribute
     */
    public void unsetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWINCELL$34);
        }
    }
}
