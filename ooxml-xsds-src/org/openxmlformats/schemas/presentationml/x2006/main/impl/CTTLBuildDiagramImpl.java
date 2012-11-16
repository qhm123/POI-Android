/*
 * XML Type:  CT_TLBuildDiagram
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLBuildDiagram(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLBuildDiagramImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLBuildDiagram
{
    
    public CTTLBuildDiagramImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPID$0 = 
        new javax.xml.namespace.QName("", "spid");
    private static final javax.xml.namespace.QName GRPID$2 = 
        new javax.xml.namespace.QName("", "grpId");
    private static final javax.xml.namespace.QName UIEXPAND$4 = 
        new javax.xml.namespace.QName("", "uiExpand");
    private static final javax.xml.namespace.QName BLD$6 = 
        new javax.xml.namespace.QName("", "bld");
    
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STShapeID xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$0);
            return target;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$0);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.openxmlformats.schemas.drawingml.x2006.main.STShapeID spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STShapeID target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$0);
            }
            target.set(spid);
        }
    }
    
    /**
     * Gets the "grpId" attribute
     */
    public long getGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "grpId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetGrpId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$2);
            return target;
        }
    }
    
    /**
     * Sets the "grpId" attribute
     */
    public void setGrpId(long grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRPID$2);
            }
            target.setLongValue(grpId);
        }
    }
    
    /**
     * Sets (as xml) the "grpId" attribute
     */
    public void xsetGrpId(org.apache.xmlbeans.XmlUnsignedInt grpId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(GRPID$2);
            }
            target.set(grpId);
        }
    }
    
    /**
     * Gets the "uiExpand" attribute
     */
    public boolean getUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UIEXPAND$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "uiExpand" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UIEXPAND$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "uiExpand" attribute
     */
    public boolean isSetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UIEXPAND$4) != null;
        }
    }
    
    /**
     * Sets the "uiExpand" attribute
     */
    public void setUiExpand(boolean uiExpand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UIEXPAND$4);
            }
            target.setBooleanValue(uiExpand);
        }
    }
    
    /**
     * Sets (as xml) the "uiExpand" attribute
     */
    public void xsetUiExpand(org.apache.xmlbeans.XmlBoolean uiExpand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UIEXPAND$4);
            }
            target.set(uiExpand);
        }
    }
    
    /**
     * Unsets the "uiExpand" attribute
     */
    public void unsetUiExpand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UIEXPAND$4);
        }
    }
    
    /**
     * Gets the "bld" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.Enum getBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLD$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bld" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType xgetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType)get_store().find_attribute_user(BLD$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType)get_default_attribute_value(BLD$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "bld" attribute
     */
    public boolean isSetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLD$6) != null;
        }
    }
    
    /**
     * Sets the "bld" attribute
     */
    public void setBld(org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType.Enum bld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLD$6);
            }
            target.setEnumValue(bld);
        }
    }
    
    /**
     * Sets (as xml) the "bld" attribute
     */
    public void xsetBld(org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType bld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType)get_store().find_attribute_user(BLD$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLDiagramBuildType)get_store().add_attribute_user(BLD$6);
            }
            target.set(bld);
        }
    }
    
    /**
     * Unsets the "bld" attribute
     */
    public void unsetBld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLD$6);
        }
    }
}
