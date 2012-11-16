/*
 * XML Type:  CT_WebPublishing
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WebPublishing(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWebPublishingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing
{
    
    public CTWebPublishingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSS$0 = 
        new javax.xml.namespace.QName("", "css");
    private static final javax.xml.namespace.QName THICKET$2 = 
        new javax.xml.namespace.QName("", "thicket");
    private static final javax.xml.namespace.QName LONGFILENAMES$4 = 
        new javax.xml.namespace.QName("", "longFileNames");
    private static final javax.xml.namespace.QName VML$6 = 
        new javax.xml.namespace.QName("", "vml");
    private static final javax.xml.namespace.QName ALLOWPNG$8 = 
        new javax.xml.namespace.QName("", "allowPng");
    private static final javax.xml.namespace.QName TARGETSCREENSIZE$10 = 
        new javax.xml.namespace.QName("", "targetScreenSize");
    private static final javax.xml.namespace.QName DPI$12 = 
        new javax.xml.namespace.QName("", "dpi");
    private static final javax.xml.namespace.QName CODEPAGE$14 = 
        new javax.xml.namespace.QName("", "codePage");
    
    
    /**
     * Gets the "css" attribute
     */
    public boolean getCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CSS$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "css" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CSS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CSS$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "css" attribute
     */
    public boolean isSetCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CSS$0) != null;
        }
    }
    
    /**
     * Sets the "css" attribute
     */
    public void setCss(boolean css)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSS$0);
            }
            target.setBooleanValue(css);
        }
    }
    
    /**
     * Sets (as xml) the "css" attribute
     */
    public void xsetCss(org.apache.xmlbeans.XmlBoolean css)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CSS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CSS$0);
            }
            target.set(css);
        }
    }
    
    /**
     * Unsets the "css" attribute
     */
    public void unsetCss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CSS$0);
        }
    }
    
    /**
     * Gets the "thicket" attribute
     */
    public boolean getThicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THICKET$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "thicket" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetThicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(THICKET$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "thicket" attribute
     */
    public boolean isSetThicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(THICKET$2) != null;
        }
    }
    
    /**
     * Sets the "thicket" attribute
     */
    public void setThicket(boolean thicket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THICKET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THICKET$2);
            }
            target.setBooleanValue(thicket);
        }
    }
    
    /**
     * Sets (as xml) the "thicket" attribute
     */
    public void xsetThicket(org.apache.xmlbeans.XmlBoolean thicket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(THICKET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(THICKET$2);
            }
            target.set(thicket);
        }
    }
    
    /**
     * Unsets the "thicket" attribute
     */
    public void unsetThicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(THICKET$2);
        }
    }
    
    /**
     * Gets the "longFileNames" attribute
     */
    public boolean getLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGFILENAMES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LONGFILENAMES$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "longFileNames" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LONGFILENAMES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LONGFILENAMES$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "longFileNames" attribute
     */
    public boolean isSetLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LONGFILENAMES$4) != null;
        }
    }
    
    /**
     * Sets the "longFileNames" attribute
     */
    public void setLongFileNames(boolean longFileNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LONGFILENAMES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LONGFILENAMES$4);
            }
            target.setBooleanValue(longFileNames);
        }
    }
    
    /**
     * Sets (as xml) the "longFileNames" attribute
     */
    public void xsetLongFileNames(org.apache.xmlbeans.XmlBoolean longFileNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LONGFILENAMES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LONGFILENAMES$4);
            }
            target.set(longFileNames);
        }
    }
    
    /**
     * Unsets the "longFileNames" attribute
     */
    public void unsetLongFileNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LONGFILENAMES$4);
        }
    }
    
    /**
     * Gets the "vml" attribute
     */
    public boolean getVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VML$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VML$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "vml" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VML$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VML$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "vml" attribute
     */
    public boolean isSetVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VML$6) != null;
        }
    }
    
    /**
     * Sets the "vml" attribute
     */
    public void setVml(boolean vml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VML$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VML$6);
            }
            target.setBooleanValue(vml);
        }
    }
    
    /**
     * Sets (as xml) the "vml" attribute
     */
    public void xsetVml(org.apache.xmlbeans.XmlBoolean vml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VML$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VML$6);
            }
            target.set(vml);
        }
    }
    
    /**
     * Unsets the "vml" attribute
     */
    public void unsetVml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VML$6);
        }
    }
    
    /**
     * Gets the "allowPng" attribute
     */
    public boolean getAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWPNG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLOWPNG$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowPng" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWPNG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALLOWPNG$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "allowPng" attribute
     */
    public boolean isSetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWPNG$8) != null;
        }
    }
    
    /**
     * Sets the "allowPng" attribute
     */
    public void setAllowPng(boolean allowPng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWPNG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWPNG$8);
            }
            target.setBooleanValue(allowPng);
        }
    }
    
    /**
     * Sets (as xml) the "allowPng" attribute
     */
    public void xsetAllowPng(org.apache.xmlbeans.XmlBoolean allowPng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWPNG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWPNG$8);
            }
            target.set(allowPng);
        }
    }
    
    /**
     * Unsets the "allowPng" attribute
     */
    public void unsetAllowPng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWPNG$8);
        }
    }
    
    /**
     * Gets the "targetScreenSize" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize.Enum getTargetScreenSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TARGETSCREENSIZE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetScreenSize" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize xgetTargetScreenSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize)get_default_attribute_value(TARGETSCREENSIZE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "targetScreenSize" attribute
     */
    public boolean isSetTargetScreenSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETSCREENSIZE$10) != null;
        }
    }
    
    /**
     * Sets the "targetScreenSize" attribute
     */
    public void setTargetScreenSize(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize.Enum targetScreenSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSCREENSIZE$10);
            }
            target.setEnumValue(targetScreenSize);
        }
    }
    
    /**
     * Sets (as xml) the "targetScreenSize" attribute
     */
    public void xsetTargetScreenSize(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize targetScreenSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTargetScreenSize)get_store().add_attribute_user(TARGETSCREENSIZE$10);
            }
            target.set(targetScreenSize);
        }
    }
    
    /**
     * Unsets the "targetScreenSize" attribute
     */
    public void unsetTargetScreenSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETSCREENSIZE$10);
        }
    }
    
    /**
     * Gets the "dpi" attribute
     */
    public long getDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DPI$12);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dpi" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(DPI$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "dpi" attribute
     */
    public boolean isSetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DPI$12) != null;
        }
    }
    
    /**
     * Sets the "dpi" attribute
     */
    public void setDpi(long dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DPI$12);
            }
            target.setLongValue(dpi);
        }
    }
    
    /**
     * Sets (as xml) the "dpi" attribute
     */
    public void xsetDpi(org.apache.xmlbeans.XmlUnsignedInt dpi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DPI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DPI$12);
            }
            target.set(dpi);
        }
    }
    
    /**
     * Unsets the "dpi" attribute
     */
    public void unsetDpi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DPI$12);
        }
    }
    
    /**
     * Gets the "codePage" attribute
     */
    public long getCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEPAGE$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "codePage" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CODEPAGE$14);
            return target;
        }
    }
    
    /**
     * True if has "codePage" attribute
     */
    public boolean isSetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODEPAGE$14) != null;
        }
    }
    
    /**
     * Sets the "codePage" attribute
     */
    public void setCodePage(long codePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEPAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODEPAGE$14);
            }
            target.setLongValue(codePage);
        }
    }
    
    /**
     * Sets (as xml) the "codePage" attribute
     */
    public void xsetCodePage(org.apache.xmlbeans.XmlUnsignedInt codePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CODEPAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CODEPAGE$14);
            }
            target.set(codePage);
        }
    }
    
    /**
     * Unsets the "codePage" attribute
     */
    public void unsetCodePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODEPAGE$14);
        }
    }
}
