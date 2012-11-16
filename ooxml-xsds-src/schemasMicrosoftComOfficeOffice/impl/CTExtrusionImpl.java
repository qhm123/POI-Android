/*
 * XML Type:  CT_Extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTExtrusion
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Extrusion(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTExtrusionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTExtrusion
{
    
    public CTExtrusionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName ON$2 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName RENDER$6 = 
        new javax.xml.namespace.QName("", "render");
    private static final javax.xml.namespace.QName VIEWPOINTORIGIN$8 = 
        new javax.xml.namespace.QName("", "viewpointorigin");
    private static final javax.xml.namespace.QName VIEWPOINT$10 = 
        new javax.xml.namespace.QName("", "viewpoint");
    private static final javax.xml.namespace.QName PLANE$12 = 
        new javax.xml.namespace.QName("", "plane");
    private static final javax.xml.namespace.QName SKEWANGLE$14 = 
        new javax.xml.namespace.QName("", "skewangle");
    private static final javax.xml.namespace.QName SKEWAMT$16 = 
        new javax.xml.namespace.QName("", "skewamt");
    private static final javax.xml.namespace.QName FOREDEPTH$18 = 
        new javax.xml.namespace.QName("", "foredepth");
    private static final javax.xml.namespace.QName BACKDEPTH$20 = 
        new javax.xml.namespace.QName("", "backdepth");
    private static final javax.xml.namespace.QName ORIENTATION$22 = 
        new javax.xml.namespace.QName("", "orientation");
    private static final javax.xml.namespace.QName ORIENTATIONANGLE$24 = 
        new javax.xml.namespace.QName("", "orientationangle");
    private static final javax.xml.namespace.QName LOCKROTATIONCENTER$26 = 
        new javax.xml.namespace.QName("", "lockrotationcenter");
    private static final javax.xml.namespace.QName AUTOROTATIONCENTER$28 = 
        new javax.xml.namespace.QName("", "autorotationcenter");
    private static final javax.xml.namespace.QName ROTATIONCENTER$30 = 
        new javax.xml.namespace.QName("", "rotationcenter");
    private static final javax.xml.namespace.QName ROTATIONANGLE$32 = 
        new javax.xml.namespace.QName("", "rotationangle");
    private static final javax.xml.namespace.QName COLORMODE$34 = 
        new javax.xml.namespace.QName("", "colormode");
    private static final javax.xml.namespace.QName COLOR$36 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName SHININESS$38 = 
        new javax.xml.namespace.QName("", "shininess");
    private static final javax.xml.namespace.QName SPECULARITY$40 = 
        new javax.xml.namespace.QName("", "specularity");
    private static final javax.xml.namespace.QName DIFFUSITY$42 = 
        new javax.xml.namespace.QName("", "diffusity");
    private static final javax.xml.namespace.QName METAL$44 = 
        new javax.xml.namespace.QName("", "metal");
    private static final javax.xml.namespace.QName EDGE$46 = 
        new javax.xml.namespace.QName("", "edge");
    private static final javax.xml.namespace.QName FACET$48 = 
        new javax.xml.namespace.QName("", "facet");
    private static final javax.xml.namespace.QName LIGHTFACE$50 = 
        new javax.xml.namespace.QName("", "lightface");
    private static final javax.xml.namespace.QName BRIGHTNESS$52 = 
        new javax.xml.namespace.QName("", "brightness");
    private static final javax.xml.namespace.QName LIGHTPOSITION$54 = 
        new javax.xml.namespace.QName("", "lightposition");
    private static final javax.xml.namespace.QName LIGHTLEVEL$56 = 
        new javax.xml.namespace.QName("", "lightlevel");
    private static final javax.xml.namespace.QName LIGHTHARSH$58 = 
        new javax.xml.namespace.QName("", "lightharsh");
    private static final javax.xml.namespace.QName LIGHTPOSITION2$60 = 
        new javax.xml.namespace.QName("", "lightposition2");
    private static final javax.xml.namespace.QName LIGHTLEVEL2$62 = 
        new javax.xml.namespace.QName("", "lightlevel2");
    private static final javax.xml.namespace.QName LIGHTHARSH2$64 = 
        new javax.xml.namespace.QName("", "lightharsh2");
    
    
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
    public schemasMicrosoftComOfficeOffice.STExtrusionType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STExtrusionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComOfficeOffice.STExtrusionType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionType target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionType)get_default_attribute_value(TYPE$4);
            }
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
    public void setType(schemasMicrosoftComOfficeOffice.STExtrusionType.Enum type)
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
    public void xsetType(schemasMicrosoftComOfficeOffice.STExtrusionType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionType target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionType)get_store().add_attribute_user(TYPE$4);
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
     * Gets the "render" attribute
     */
    public schemasMicrosoftComOfficeOffice.STExtrusionRender.Enum getRender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RENDER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RENDER$6);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STExtrusionRender.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "render" attribute
     */
    public schemasMicrosoftComOfficeOffice.STExtrusionRender xgetRender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionRender target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionRender)get_store().find_attribute_user(RENDER$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionRender)get_default_attribute_value(RENDER$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "render" attribute
     */
    public boolean isSetRender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RENDER$6) != null;
        }
    }
    
    /**
     * Sets the "render" attribute
     */
    public void setRender(schemasMicrosoftComOfficeOffice.STExtrusionRender.Enum render)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RENDER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RENDER$6);
            }
            target.setEnumValue(render);
        }
    }
    
    /**
     * Sets (as xml) the "render" attribute
     */
    public void xsetRender(schemasMicrosoftComOfficeOffice.STExtrusionRender render)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionRender target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionRender)get_store().find_attribute_user(RENDER$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionRender)get_store().add_attribute_user(RENDER$6);
            }
            target.set(render);
        }
    }
    
    /**
     * Unsets the "render" attribute
     */
    public void unsetRender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RENDER$6);
        }
    }
    
    /**
     * Gets the "viewpointorigin" attribute
     */
    public java.lang.String getViewpointorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWPOINTORIGIN$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "viewpointorigin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetViewpointorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWPOINTORIGIN$8);
            return target;
        }
    }
    
    /**
     * True if has "viewpointorigin" attribute
     */
    public boolean isSetViewpointorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIEWPOINTORIGIN$8) != null;
        }
    }
    
    /**
     * Sets the "viewpointorigin" attribute
     */
    public void setViewpointorigin(java.lang.String viewpointorigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWPOINTORIGIN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWPOINTORIGIN$8);
            }
            target.setStringValue(viewpointorigin);
        }
    }
    
    /**
     * Sets (as xml) the "viewpointorigin" attribute
     */
    public void xsetViewpointorigin(org.apache.xmlbeans.XmlString viewpointorigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWPOINTORIGIN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWPOINTORIGIN$8);
            }
            target.set(viewpointorigin);
        }
    }
    
    /**
     * Unsets the "viewpointorigin" attribute
     */
    public void unsetViewpointorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIEWPOINTORIGIN$8);
        }
    }
    
    /**
     * Gets the "viewpoint" attribute
     */
    public java.lang.String getViewpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWPOINT$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "viewpoint" attribute
     */
    public org.apache.xmlbeans.XmlString xgetViewpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWPOINT$10);
            return target;
        }
    }
    
    /**
     * True if has "viewpoint" attribute
     */
    public boolean isSetViewpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VIEWPOINT$10) != null;
        }
    }
    
    /**
     * Sets the "viewpoint" attribute
     */
    public void setViewpoint(java.lang.String viewpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWPOINT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWPOINT$10);
            }
            target.setStringValue(viewpoint);
        }
    }
    
    /**
     * Sets (as xml) the "viewpoint" attribute
     */
    public void xsetViewpoint(org.apache.xmlbeans.XmlString viewpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWPOINT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWPOINT$10);
            }
            target.set(viewpoint);
        }
    }
    
    /**
     * Unsets the "viewpoint" attribute
     */
    public void unsetViewpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VIEWPOINT$10);
        }
    }
    
    /**
     * Gets the "plane" attribute
     */
    public schemasMicrosoftComOfficeOffice.STExtrusionPlane.Enum getPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PLANE$12);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STExtrusionPlane.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "plane" attribute
     */
    public schemasMicrosoftComOfficeOffice.STExtrusionPlane xgetPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionPlane target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionPlane)get_store().find_attribute_user(PLANE$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionPlane)get_default_attribute_value(PLANE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "plane" attribute
     */
    public boolean isSetPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PLANE$12) != null;
        }
    }
    
    /**
     * Sets the "plane" attribute
     */
    public void setPlane(schemasMicrosoftComOfficeOffice.STExtrusionPlane.Enum plane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLANE$12);
            }
            target.setEnumValue(plane);
        }
    }
    
    /**
     * Sets (as xml) the "plane" attribute
     */
    public void xsetPlane(schemasMicrosoftComOfficeOffice.STExtrusionPlane plane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STExtrusionPlane target = null;
            target = (schemasMicrosoftComOfficeOffice.STExtrusionPlane)get_store().find_attribute_user(PLANE$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STExtrusionPlane)get_store().add_attribute_user(PLANE$12);
            }
            target.set(plane);
        }
    }
    
    /**
     * Unsets the "plane" attribute
     */
    public void unsetPlane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PLANE$12);
        }
    }
    
    /**
     * Gets the "skewangle" attribute
     */
    public float getSkewangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKEWANGLE$14);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "skewangle" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetSkewangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SKEWANGLE$14);
            return target;
        }
    }
    
    /**
     * True if has "skewangle" attribute
     */
    public boolean isSetSkewangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SKEWANGLE$14) != null;
        }
    }
    
    /**
     * Sets the "skewangle" attribute
     */
    public void setSkewangle(float skewangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKEWANGLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKEWANGLE$14);
            }
            target.setFloatValue(skewangle);
        }
    }
    
    /**
     * Sets (as xml) the "skewangle" attribute
     */
    public void xsetSkewangle(org.apache.xmlbeans.XmlFloat skewangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SKEWANGLE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(SKEWANGLE$14);
            }
            target.set(skewangle);
        }
    }
    
    /**
     * Unsets the "skewangle" attribute
     */
    public void unsetSkewangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SKEWANGLE$14);
        }
    }
    
    /**
     * Gets the "skewamt" attribute
     */
    public java.lang.String getSkewamt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKEWAMT$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "skewamt" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSkewamt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SKEWAMT$16);
            return target;
        }
    }
    
    /**
     * True if has "skewamt" attribute
     */
    public boolean isSetSkewamt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SKEWAMT$16) != null;
        }
    }
    
    /**
     * Sets the "skewamt" attribute
     */
    public void setSkewamt(java.lang.String skewamt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKEWAMT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKEWAMT$16);
            }
            target.setStringValue(skewamt);
        }
    }
    
    /**
     * Sets (as xml) the "skewamt" attribute
     */
    public void xsetSkewamt(org.apache.xmlbeans.XmlString skewamt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SKEWAMT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SKEWAMT$16);
            }
            target.set(skewamt);
        }
    }
    
    /**
     * Unsets the "skewamt" attribute
     */
    public void unsetSkewamt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SKEWAMT$16);
        }
    }
    
    /**
     * Gets the "foredepth" attribute
     */
    public java.lang.String getForedepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOREDEPTH$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "foredepth" attribute
     */
    public org.apache.xmlbeans.XmlString xgetForedepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOREDEPTH$18);
            return target;
        }
    }
    
    /**
     * True if has "foredepth" attribute
     */
    public boolean isSetForedepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOREDEPTH$18) != null;
        }
    }
    
    /**
     * Sets the "foredepth" attribute
     */
    public void setForedepth(java.lang.String foredepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOREDEPTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOREDEPTH$18);
            }
            target.setStringValue(foredepth);
        }
    }
    
    /**
     * Sets (as xml) the "foredepth" attribute
     */
    public void xsetForedepth(org.apache.xmlbeans.XmlString foredepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOREDEPTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FOREDEPTH$18);
            }
            target.set(foredepth);
        }
    }
    
    /**
     * Unsets the "foredepth" attribute
     */
    public void unsetForedepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOREDEPTH$18);
        }
    }
    
    /**
     * Gets the "backdepth" attribute
     */
    public java.lang.String getBackdepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKDEPTH$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "backdepth" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBackdepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BACKDEPTH$20);
            return target;
        }
    }
    
    /**
     * True if has "backdepth" attribute
     */
    public boolean isSetBackdepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BACKDEPTH$20) != null;
        }
    }
    
    /**
     * Sets the "backdepth" attribute
     */
    public void setBackdepth(java.lang.String backdepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BACKDEPTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BACKDEPTH$20);
            }
            target.setStringValue(backdepth);
        }
    }
    
    /**
     * Sets (as xml) the "backdepth" attribute
     */
    public void xsetBackdepth(org.apache.xmlbeans.XmlString backdepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BACKDEPTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BACKDEPTH$20);
            }
            target.set(backdepth);
        }
    }
    
    /**
     * Unsets the "backdepth" attribute
     */
    public void unsetBackdepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BACKDEPTH$20);
        }
    }
    
    /**
     * Gets the "orientation" attribute
     */
    public java.lang.String getOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$22);
            return target;
        }
    }
    
    /**
     * True if has "orientation" attribute
     */
    public boolean isSetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENTATION$22) != null;
        }
    }
    
    /**
     * Sets the "orientation" attribute
     */
    public void setOrientation(java.lang.String orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$22);
            }
            target.setStringValue(orientation);
        }
    }
    
    /**
     * Sets (as xml) the "orientation" attribute
     */
    public void xsetOrientation(org.apache.xmlbeans.XmlString orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIENTATION$22);
            }
            target.set(orientation);
        }
    }
    
    /**
     * Unsets the "orientation" attribute
     */
    public void unsetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENTATION$22);
        }
    }
    
    /**
     * Gets the "orientationangle" attribute
     */
    public float getOrientationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATIONANGLE$24);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientationangle" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetOrientationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(ORIENTATIONANGLE$24);
            return target;
        }
    }
    
    /**
     * True if has "orientationangle" attribute
     */
    public boolean isSetOrientationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENTATIONANGLE$24) != null;
        }
    }
    
    /**
     * Sets the "orientationangle" attribute
     */
    public void setOrientationangle(float orientationangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATIONANGLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATIONANGLE$24);
            }
            target.setFloatValue(orientationangle);
        }
    }
    
    /**
     * Sets (as xml) the "orientationangle" attribute
     */
    public void xsetOrientationangle(org.apache.xmlbeans.XmlFloat orientationangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(ORIENTATIONANGLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(ORIENTATIONANGLE$24);
            }
            target.set(orientationangle);
        }
    }
    
    /**
     * Unsets the "orientationangle" attribute
     */
    public void unsetOrientationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENTATIONANGLE$24);
        }
    }
    
    /**
     * Gets the "lockrotationcenter" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getLockrotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKROTATIONCENTER$26);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lockrotationcenter" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetLockrotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LOCKROTATIONCENTER$26);
            return target;
        }
    }
    
    /**
     * True if has "lockrotationcenter" attribute
     */
    public boolean isSetLockrotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKROTATIONCENTER$26) != null;
        }
    }
    
    /**
     * Sets the "lockrotationcenter" attribute
     */
    public void setLockrotationcenter(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum lockrotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKROTATIONCENTER$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKROTATIONCENTER$26);
            }
            target.setEnumValue(lockrotationcenter);
        }
    }
    
    /**
     * Sets (as xml) the "lockrotationcenter" attribute
     */
    public void xsetLockrotationcenter(schemasMicrosoftComOfficeOffice.STTrueFalse lockrotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LOCKROTATIONCENTER$26);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(LOCKROTATIONCENTER$26);
            }
            target.set(lockrotationcenter);
        }
    }
    
    /**
     * Unsets the "lockrotationcenter" attribute
     */
    public void unsetLockrotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKROTATIONCENTER$26);
        }
    }
    
    /**
     * Gets the "autorotationcenter" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAutorotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOROTATIONCENTER$28);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "autorotationcenter" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAutorotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOROTATIONCENTER$28);
            return target;
        }
    }
    
    /**
     * True if has "autorotationcenter" attribute
     */
    public boolean isSetAutorotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOROTATIONCENTER$28) != null;
        }
    }
    
    /**
     * Sets the "autorotationcenter" attribute
     */
    public void setAutorotationcenter(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum autorotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOROTATIONCENTER$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOROTATIONCENTER$28);
            }
            target.setEnumValue(autorotationcenter);
        }
    }
    
    /**
     * Sets (as xml) the "autorotationcenter" attribute
     */
    public void xsetAutorotationcenter(schemasMicrosoftComOfficeOffice.STTrueFalse autorotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOROTATIONCENTER$28);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(AUTOROTATIONCENTER$28);
            }
            target.set(autorotationcenter);
        }
    }
    
    /**
     * Unsets the "autorotationcenter" attribute
     */
    public void unsetAutorotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOROTATIONCENTER$28);
        }
    }
    
    /**
     * Gets the "rotationcenter" attribute
     */
    public java.lang.String getRotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONCENTER$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rotationcenter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONCENTER$30);
            return target;
        }
    }
    
    /**
     * True if has "rotationcenter" attribute
     */
    public boolean isSetRotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROTATIONCENTER$30) != null;
        }
    }
    
    /**
     * Sets the "rotationcenter" attribute
     */
    public void setRotationcenter(java.lang.String rotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONCENTER$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATIONCENTER$30);
            }
            target.setStringValue(rotationcenter);
        }
    }
    
    /**
     * Sets (as xml) the "rotationcenter" attribute
     */
    public void xsetRotationcenter(org.apache.xmlbeans.XmlString rotationcenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONCENTER$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROTATIONCENTER$30);
            }
            target.set(rotationcenter);
        }
    }
    
    /**
     * Unsets the "rotationcenter" attribute
     */
    public void unsetRotationcenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROTATIONCENTER$30);
        }
    }
    
    /**
     * Gets the "rotationangle" attribute
     */
    public java.lang.String getRotationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONANGLE$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rotationangle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRotationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONANGLE$32);
            return target;
        }
    }
    
    /**
     * True if has "rotationangle" attribute
     */
    public boolean isSetRotationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROTATIONANGLE$32) != null;
        }
    }
    
    /**
     * Sets the "rotationangle" attribute
     */
    public void setRotationangle(java.lang.String rotationangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONANGLE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATIONANGLE$32);
            }
            target.setStringValue(rotationangle);
        }
    }
    
    /**
     * Sets (as xml) the "rotationangle" attribute
     */
    public void xsetRotationangle(org.apache.xmlbeans.XmlString rotationangle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROTATIONANGLE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROTATIONANGLE$32);
            }
            target.set(rotationangle);
        }
    }
    
    /**
     * Unsets the "rotationangle" attribute
     */
    public void unsetRotationangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROTATIONANGLE$32);
        }
    }
    
    /**
     * Gets the "colormode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorMode.Enum getColormode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORMODE$34);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STColorMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "colormode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STColorMode xgetColormode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorMode)get_store().find_attribute_user(COLORMODE$34);
            return target;
        }
    }
    
    /**
     * True if has "colormode" attribute
     */
    public boolean isSetColormode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLORMODE$34) != null;
        }
    }
    
    /**
     * Sets the "colormode" attribute
     */
    public void setColormode(schemasMicrosoftComOfficeOffice.STColorMode.Enum colormode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLORMODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLORMODE$34);
            }
            target.setEnumValue(colormode);
        }
    }
    
    /**
     * Sets (as xml) the "colormode" attribute
     */
    public void xsetColormode(schemasMicrosoftComOfficeOffice.STColorMode colormode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorMode)get_store().find_attribute_user(COLORMODE$34);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorMode)get_store().add_attribute_user(COLORMODE$34);
            }
            target.set(colormode);
        }
    }
    
    /**
     * Unsets the "colormode" attribute
     */
    public void unsetColormode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLORMODE$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$36);
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
    public schemasMicrosoftComOfficeOffice.STColorType xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(COLOR$36);
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
            return get_store().find_attribute_user(COLOR$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$36);
            }
            target.setStringValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "color" attribute
     */
    public void xsetColor(schemasMicrosoftComOfficeOffice.STColorType color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STColorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().find_attribute_user(COLOR$36);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STColorType)get_store().add_attribute_user(COLOR$36);
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
            get_store().remove_attribute(COLOR$36);
        }
    }
    
    /**
     * Gets the "shininess" attribute
     */
    public float getShininess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHININESS$38);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "shininess" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetShininess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SHININESS$38);
            return target;
        }
    }
    
    /**
     * True if has "shininess" attribute
     */
    public boolean isSetShininess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHININESS$38) != null;
        }
    }
    
    /**
     * Sets the "shininess" attribute
     */
    public void setShininess(float shininess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHININESS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHININESS$38);
            }
            target.setFloatValue(shininess);
        }
    }
    
    /**
     * Sets (as xml) the "shininess" attribute
     */
    public void xsetShininess(org.apache.xmlbeans.XmlFloat shininess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SHININESS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(SHININESS$38);
            }
            target.set(shininess);
        }
    }
    
    /**
     * Unsets the "shininess" attribute
     */
    public void unsetShininess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHININESS$38);
        }
    }
    
    /**
     * Gets the "specularity" attribute
     */
    public java.lang.String getSpecularity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPECULARITY$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "specularity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSpecularity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPECULARITY$40);
            return target;
        }
    }
    
    /**
     * True if has "specularity" attribute
     */
    public boolean isSetSpecularity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPECULARITY$40) != null;
        }
    }
    
    /**
     * Sets the "specularity" attribute
     */
    public void setSpecularity(java.lang.String specularity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPECULARITY$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPECULARITY$40);
            }
            target.setStringValue(specularity);
        }
    }
    
    /**
     * Sets (as xml) the "specularity" attribute
     */
    public void xsetSpecularity(org.apache.xmlbeans.XmlString specularity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPECULARITY$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPECULARITY$40);
            }
            target.set(specularity);
        }
    }
    
    /**
     * Unsets the "specularity" attribute
     */
    public void unsetSpecularity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPECULARITY$40);
        }
    }
    
    /**
     * Gets the "diffusity" attribute
     */
    public java.lang.String getDiffusity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFUSITY$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "diffusity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDiffusity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIFFUSITY$42);
            return target;
        }
    }
    
    /**
     * True if has "diffusity" attribute
     */
    public boolean isSetDiffusity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIFFUSITY$42) != null;
        }
    }
    
    /**
     * Sets the "diffusity" attribute
     */
    public void setDiffusity(java.lang.String diffusity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIFFUSITY$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIFFUSITY$42);
            }
            target.setStringValue(diffusity);
        }
    }
    
    /**
     * Sets (as xml) the "diffusity" attribute
     */
    public void xsetDiffusity(org.apache.xmlbeans.XmlString diffusity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIFFUSITY$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIFFUSITY$42);
            }
            target.set(diffusity);
        }
    }
    
    /**
     * Unsets the "diffusity" attribute
     */
    public void unsetDiffusity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIFFUSITY$42);
        }
    }
    
    /**
     * Gets the "metal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getMetal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METAL$44);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "metal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetMetal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(METAL$44);
            return target;
        }
    }
    
    /**
     * True if has "metal" attribute
     */
    public boolean isSetMetal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METAL$44) != null;
        }
    }
    
    /**
     * Sets the "metal" attribute
     */
    public void setMetal(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum metal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METAL$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METAL$44);
            }
            target.setEnumValue(metal);
        }
    }
    
    /**
     * Sets (as xml) the "metal" attribute
     */
    public void xsetMetal(schemasMicrosoftComOfficeOffice.STTrueFalse metal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(METAL$44);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(METAL$44);
            }
            target.set(metal);
        }
    }
    
    /**
     * Unsets the "metal" attribute
     */
    public void unsetMetal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METAL$44);
        }
    }
    
    /**
     * Gets the "edge" attribute
     */
    public java.lang.String getEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGE$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "edge" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDGE$46);
            return target;
        }
    }
    
    /**
     * True if has "edge" attribute
     */
    public boolean isSetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDGE$46) != null;
        }
    }
    
    /**
     * Sets the "edge" attribute
     */
    public void setEdge(java.lang.String edge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGE$46);
            }
            target.setStringValue(edge);
        }
    }
    
    /**
     * Sets (as xml) the "edge" attribute
     */
    public void xsetEdge(org.apache.xmlbeans.XmlString edge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDGE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EDGE$46);
            }
            target.set(edge);
        }
    }
    
    /**
     * Unsets the "edge" attribute
     */
    public void unsetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDGE$46);
        }
    }
    
    /**
     * Gets the "facet" attribute
     */
    public java.lang.String getFacet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACET$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "facet" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFacet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACET$48);
            return target;
        }
    }
    
    /**
     * True if has "facet" attribute
     */
    public boolean isSetFacet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FACET$48) != null;
        }
    }
    
    /**
     * Sets the "facet" attribute
     */
    public void setFacet(java.lang.String facet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACET$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACET$48);
            }
            target.setStringValue(facet);
        }
    }
    
    /**
     * Sets (as xml) the "facet" attribute
     */
    public void xsetFacet(org.apache.xmlbeans.XmlString facet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FACET$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FACET$48);
            }
            target.set(facet);
        }
    }
    
    /**
     * Unsets the "facet" attribute
     */
    public void unsetFacet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FACET$48);
        }
    }
    
    /**
     * Gets the "lightface" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getLightface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTFACE$50);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightface" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetLightface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTFACE$50);
            return target;
        }
    }
    
    /**
     * True if has "lightface" attribute
     */
    public boolean isSetLightface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTFACE$50) != null;
        }
    }
    
    /**
     * Sets the "lightface" attribute
     */
    public void setLightface(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum lightface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTFACE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTFACE$50);
            }
            target.setEnumValue(lightface);
        }
    }
    
    /**
     * Sets (as xml) the "lightface" attribute
     */
    public void xsetLightface(schemasMicrosoftComOfficeOffice.STTrueFalse lightface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTFACE$50);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(LIGHTFACE$50);
            }
            target.set(lightface);
        }
    }
    
    /**
     * Unsets the "lightface" attribute
     */
    public void unsetLightface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTFACE$50);
        }
    }
    
    /**
     * Gets the "brightness" attribute
     */
    public java.lang.String getBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRIGHTNESS$52);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brightness" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRIGHTNESS$52);
            return target;
        }
    }
    
    /**
     * True if has "brightness" attribute
     */
    public boolean isSetBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BRIGHTNESS$52) != null;
        }
    }
    
    /**
     * Sets the "brightness" attribute
     */
    public void setBrightness(java.lang.String brightness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BRIGHTNESS$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BRIGHTNESS$52);
            }
            target.setStringValue(brightness);
        }
    }
    
    /**
     * Sets (as xml) the "brightness" attribute
     */
    public void xsetBrightness(org.apache.xmlbeans.XmlString brightness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BRIGHTNESS$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BRIGHTNESS$52);
            }
            target.set(brightness);
        }
    }
    
    /**
     * Unsets the "brightness" attribute
     */
    public void unsetBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BRIGHTNESS$52);
        }
    }
    
    /**
     * Gets the "lightposition" attribute
     */
    public java.lang.String getLightposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTPOSITION$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightposition" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLightposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTPOSITION$54);
            return target;
        }
    }
    
    /**
     * True if has "lightposition" attribute
     */
    public boolean isSetLightposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTPOSITION$54) != null;
        }
    }
    
    /**
     * Sets the "lightposition" attribute
     */
    public void setLightposition(java.lang.String lightposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTPOSITION$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTPOSITION$54);
            }
            target.setStringValue(lightposition);
        }
    }
    
    /**
     * Sets (as xml) the "lightposition" attribute
     */
    public void xsetLightposition(org.apache.xmlbeans.XmlString lightposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTPOSITION$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIGHTPOSITION$54);
            }
            target.set(lightposition);
        }
    }
    
    /**
     * Unsets the "lightposition" attribute
     */
    public void unsetLightposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTPOSITION$54);
        }
    }
    
    /**
     * Gets the "lightlevel" attribute
     */
    public java.lang.String getLightlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTLEVEL$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightlevel" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLightlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTLEVEL$56);
            return target;
        }
    }
    
    /**
     * True if has "lightlevel" attribute
     */
    public boolean isSetLightlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTLEVEL$56) != null;
        }
    }
    
    /**
     * Sets the "lightlevel" attribute
     */
    public void setLightlevel(java.lang.String lightlevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTLEVEL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTLEVEL$56);
            }
            target.setStringValue(lightlevel);
        }
    }
    
    /**
     * Sets (as xml) the "lightlevel" attribute
     */
    public void xsetLightlevel(org.apache.xmlbeans.XmlString lightlevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTLEVEL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIGHTLEVEL$56);
            }
            target.set(lightlevel);
        }
    }
    
    /**
     * Unsets the "lightlevel" attribute
     */
    public void unsetLightlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTLEVEL$56);
        }
    }
    
    /**
     * Gets the "lightharsh" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getLightharsh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTHARSH$58);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightharsh" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetLightharsh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTHARSH$58);
            return target;
        }
    }
    
    /**
     * True if has "lightharsh" attribute
     */
    public boolean isSetLightharsh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTHARSH$58) != null;
        }
    }
    
    /**
     * Sets the "lightharsh" attribute
     */
    public void setLightharsh(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum lightharsh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTHARSH$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTHARSH$58);
            }
            target.setEnumValue(lightharsh);
        }
    }
    
    /**
     * Sets (as xml) the "lightharsh" attribute
     */
    public void xsetLightharsh(schemasMicrosoftComOfficeOffice.STTrueFalse lightharsh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTHARSH$58);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(LIGHTHARSH$58);
            }
            target.set(lightharsh);
        }
    }
    
    /**
     * Unsets the "lightharsh" attribute
     */
    public void unsetLightharsh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTHARSH$58);
        }
    }
    
    /**
     * Gets the "lightposition2" attribute
     */
    public java.lang.String getLightposition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTPOSITION2$60);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightposition2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLightposition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTPOSITION2$60);
            return target;
        }
    }
    
    /**
     * True if has "lightposition2" attribute
     */
    public boolean isSetLightposition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTPOSITION2$60) != null;
        }
    }
    
    /**
     * Sets the "lightposition2" attribute
     */
    public void setLightposition2(java.lang.String lightposition2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTPOSITION2$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTPOSITION2$60);
            }
            target.setStringValue(lightposition2);
        }
    }
    
    /**
     * Sets (as xml) the "lightposition2" attribute
     */
    public void xsetLightposition2(org.apache.xmlbeans.XmlString lightposition2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTPOSITION2$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIGHTPOSITION2$60);
            }
            target.set(lightposition2);
        }
    }
    
    /**
     * Unsets the "lightposition2" attribute
     */
    public void unsetLightposition2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTPOSITION2$60);
        }
    }
    
    /**
     * Gets the "lightlevel2" attribute
     */
    public java.lang.String getLightlevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTLEVEL2$62);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightlevel2" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLightlevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTLEVEL2$62);
            return target;
        }
    }
    
    /**
     * True if has "lightlevel2" attribute
     */
    public boolean isSetLightlevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTLEVEL2$62) != null;
        }
    }
    
    /**
     * Sets the "lightlevel2" attribute
     */
    public void setLightlevel2(java.lang.String lightlevel2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTLEVEL2$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTLEVEL2$62);
            }
            target.setStringValue(lightlevel2);
        }
    }
    
    /**
     * Sets (as xml) the "lightlevel2" attribute
     */
    public void xsetLightlevel2(org.apache.xmlbeans.XmlString lightlevel2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIGHTLEVEL2$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIGHTLEVEL2$62);
            }
            target.set(lightlevel2);
        }
    }
    
    /**
     * Unsets the "lightlevel2" attribute
     */
    public void unsetLightlevel2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTLEVEL2$62);
        }
    }
    
    /**
     * Gets the "lightharsh2" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getLightharsh2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTHARSH2$64);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightharsh2" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetLightharsh2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTHARSH2$64);
            return target;
        }
    }
    
    /**
     * True if has "lightharsh2" attribute
     */
    public boolean isSetLightharsh2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIGHTHARSH2$64) != null;
        }
    }
    
    /**
     * Sets the "lightharsh2" attribute
     */
    public void setLightharsh2(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum lightharsh2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIGHTHARSH2$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIGHTHARSH2$64);
            }
            target.setEnumValue(lightharsh2);
        }
    }
    
    /**
     * Sets (as xml) the "lightharsh2" attribute
     */
    public void xsetLightharsh2(schemasMicrosoftComOfficeOffice.STTrueFalse lightharsh2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(LIGHTHARSH2$64);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(LIGHTHARSH2$64);
            }
            target.set(lightharsh2);
        }
    }
    
    /**
     * Unsets the "lightharsh2" attribute
     */
    public void unsetLightharsh2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIGHTHARSH2$64);
        }
    }
}
