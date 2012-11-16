/*
 * XML Type:  CT_TLGraphicalObjectBuild
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLGraphicalObjectBuild(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLGraphicalObjectBuildImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLGraphicalObjectBuild
{
    
    public CTTLGraphicalObjectBuildImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLDASONE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldAsOne");
    private static final javax.xml.namespace.QName BLDSUB$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldSub");
    private static final javax.xml.namespace.QName SPID$4 = 
        new javax.xml.namespace.QName("", "spid");
    private static final javax.xml.namespace.QName GRPID$6 = 
        new javax.xml.namespace.QName("", "grpId");
    private static final javax.xml.namespace.QName UIEXPAND$8 = 
        new javax.xml.namespace.QName("", "uiExpand");
    
    
    /**
     * Gets the "bldAsOne" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty getBldAsOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(BLDASONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bldAsOne" element
     */
    public boolean isSetBldAsOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDASONE$0) != 0;
        }
    }
    
    /**
     * Sets the "bldAsOne" element
     */
    public void setBldAsOne(org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty bldAsOne)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().find_element_user(BLDASONE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(BLDASONE$0);
            }
            target.set(bldAsOne);
        }
    }
    
    /**
     * Appends and returns a new empty "bldAsOne" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty addNewBldAsOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTEmpty)get_store().add_element_user(BLDASONE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bldAsOne" element
     */
    public void unsetBldAsOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDASONE$0, 0);
        }
    }
    
    /**
     * Gets the "bldSub" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties getBldSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties)get_store().find_element_user(BLDSUB$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bldSub" element
     */
    public boolean isSetBldSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDSUB$2) != 0;
        }
    }
    
    /**
     * Sets the "bldSub" element
     */
    public void setBldSub(org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties bldSub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties)get_store().find_element_user(BLDSUB$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties)get_store().add_element_user(BLDSUB$2);
            }
            target.set(bldSub);
        }
    }
    
    /**
     * Appends and returns a new empty "bldSub" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties addNewBldSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationGraphicalObjectBuildProperties)get_store().add_element_user(BLDSUB$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bldSub" element
     */
    public void unsetBldSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDSUB$2, 0);
        }
    }
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().find_attribute_user(SPID$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STShapeID)get_store().add_attribute_user(SPID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRPID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRPID$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(GRPID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(GRPID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UIEXPAND$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UIEXPAND$8);
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
            return get_store().find_attribute_user(UIEXPAND$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UIEXPAND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UIEXPAND$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UIEXPAND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UIEXPAND$8);
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
            get_store().remove_attribute(UIEXPAND$8);
        }
    }
}
