/*
 * XML Type:  CT_OleObject
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OleObject(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOleObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObject
{
    
    public CTOleObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROGID$0 = 
        new javax.xml.namespace.QName("", "progId");
    private static final javax.xml.namespace.QName DVASPECT$2 = 
        new javax.xml.namespace.QName("", "dvAspect");
    private static final javax.xml.namespace.QName LINK$4 = 
        new javax.xml.namespace.QName("", "link");
    private static final javax.xml.namespace.QName OLEUPDATE$6 = 
        new javax.xml.namespace.QName("", "oleUpdate");
    private static final javax.xml.namespace.QName AUTOLOAD$8 = 
        new javax.xml.namespace.QName("", "autoLoad");
    private static final javax.xml.namespace.QName SHAPEID$10 = 
        new javax.xml.namespace.QName("", "shapeId");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    
    
    /**
     * Gets the "progId" attribute
     */
    public java.lang.String getProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "progId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGID$0);
            return target;
        }
    }
    
    /**
     * True if has "progId" attribute
     */
    public boolean isSetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROGID$0) != null;
        }
    }
    
    /**
     * Sets the "progId" attribute
     */
    public void setProgId(java.lang.String progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROGID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROGID$0);
            }
            target.setStringValue(progId);
        }
    }
    
    /**
     * Sets (as xml) the "progId" attribute
     */
    public void xsetProgId(org.apache.xmlbeans.XmlString progId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROGID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROGID$0);
            }
            target.set(progId);
        }
    }
    
    /**
     * Unsets the "progId" attribute
     */
    public void unsetProgId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROGID$0);
        }
    }
    
    /**
     * Gets the "dvAspect" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect.Enum getDvAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DVASPECT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DVASPECT$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dvAspect" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect xgetDvAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect)get_store().find_attribute_user(DVASPECT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect)get_default_attribute_value(DVASPECT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "dvAspect" attribute
     */
    public boolean isSetDvAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DVASPECT$2) != null;
        }
    }
    
    /**
     * Sets the "dvAspect" attribute
     */
    public void setDvAspect(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect.Enum dvAspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DVASPECT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DVASPECT$2);
            }
            target.setEnumValue(dvAspect);
        }
    }
    
    /**
     * Sets (as xml) the "dvAspect" attribute
     */
    public void xsetDvAspect(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect dvAspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect)get_store().find_attribute_user(DVASPECT$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDvAspect)get_store().add_attribute_user(DVASPECT$2);
            }
            target.set(dvAspect);
        }
    }
    
    /**
     * Unsets the "dvAspect" attribute
     */
    public void unsetDvAspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DVASPECT$2);
        }
    }
    
    /**
     * Gets the "link" attribute
     */
    public java.lang.String getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "link" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(LINK$4);
            return target;
        }
    }
    
    /**
     * True if has "link" attribute
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINK$4) != null;
        }
    }
    
    /**
     * Sets the "link" attribute
     */
    public void setLink(java.lang.String link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINK$4);
            }
            target.setStringValue(link);
        }
    }
    
    /**
     * Sets (as xml) the "link" attribute
     */
    public void xsetLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(LINK$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(LINK$4);
            }
            target.set(link);
        }
    }
    
    /**
     * Unsets the "link" attribute
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINK$4);
        }
    }
    
    /**
     * Gets the "oleUpdate" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate.Enum getOleUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEUPDATE$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oleUpdate" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate xgetOleUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate)get_store().find_attribute_user(OLEUPDATE$6);
            return target;
        }
    }
    
    /**
     * True if has "oleUpdate" attribute
     */
    public boolean isSetOleUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLEUPDATE$6) != null;
        }
    }
    
    /**
     * Sets the "oleUpdate" attribute
     */
    public void setOleUpdate(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate.Enum oleUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEUPDATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLEUPDATE$6);
            }
            target.setEnumValue(oleUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "oleUpdate" attribute
     */
    public void xsetOleUpdate(org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate oleUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate)get_store().find_attribute_user(OLEUPDATE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STOleUpdate)get_store().add_attribute_user(OLEUPDATE$6);
            }
            target.set(oleUpdate);
        }
    }
    
    /**
     * Unsets the "oleUpdate" attribute
     */
    public void unsetOleUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLEUPDATE$6);
        }
    }
    
    /**
     * Gets the "autoLoad" attribute
     */
    public boolean getAutoLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOLOAD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOLOAD$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOLOAD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AUTOLOAD$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "autoLoad" attribute
     */
    public boolean isSetAutoLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOLOAD$8) != null;
        }
    }
    
    /**
     * Sets the "autoLoad" attribute
     */
    public void setAutoLoad(boolean autoLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOLOAD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOLOAD$8);
            }
            target.setBooleanValue(autoLoad);
        }
    }
    
    /**
     * Sets (as xml) the "autoLoad" attribute
     */
    public void xsetAutoLoad(org.apache.xmlbeans.XmlBoolean autoLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AUTOLOAD$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AUTOLOAD$8);
            }
            target.set(autoLoad);
        }
    }
    
    /**
     * Unsets the "autoLoad" attribute
     */
    public void unsetAutoLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOLOAD$8);
        }
    }
    
    /**
     * Gets the "shapeId" attribute
     */
    public long getShapeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAPEID$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "shapeId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetShapeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHAPEID$10);
            return target;
        }
    }
    
    /**
     * Sets the "shapeId" attribute
     */
    public void setShapeId(long shapeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAPEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAPEID$10);
            }
            target.setLongValue(shapeId);
        }
    }
    
    /**
     * Sets (as xml) the "shapeId" attribute
     */
    public void xsetShapeId(org.apache.xmlbeans.XmlUnsignedInt shapeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHAPEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHAPEID$10);
            }
            target.set(shapeId);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
}
