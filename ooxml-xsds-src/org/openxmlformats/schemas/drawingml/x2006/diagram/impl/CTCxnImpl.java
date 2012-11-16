/*
 * XML Type:  CT_Cxn
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Cxn(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTCxnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxn
{
    
    public CTCxnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName MODELID$2 = 
        new javax.xml.namespace.QName("", "modelId");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName SRCID$6 = 
        new javax.xml.namespace.QName("", "srcId");
    private static final javax.xml.namespace.QName DESTID$8 = 
        new javax.xml.namespace.QName("", "destId");
    private static final javax.xml.namespace.QName SRCORD$10 = 
        new javax.xml.namespace.QName("", "srcOrd");
    private static final javax.xml.namespace.QName DESTORD$12 = 
        new javax.xml.namespace.QName("", "destOrd");
    private static final javax.xml.namespace.QName PARTRANSID$14 = 
        new javax.xml.namespace.QName("", "parTransId");
    private static final javax.xml.namespace.QName SIBTRANSID$16 = 
        new javax.xml.namespace.QName("", "sibTransId");
    private static final javax.xml.namespace.QName PRESID$18 = 
        new javax.xml.namespace.QName("", "presId");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$0) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "modelId" attribute
     */
    public java.lang.Object getModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "modelId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(MODELID$2);
            return target;
        }
    }
    
    /**
     * Sets the "modelId" attribute
     */
    public void setModelId(java.lang.Object modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$2);
            }
            target.setObjectValue(modelId);
        }
    }
    
    /**
     * Sets (as xml) the "modelId" attribute
     */
    public void xsetModelId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(MODELID$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(MODELID$2);
            }
            target.set(modelId);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.Enum getType()
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
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType)get_default_attribute_value(TYPE$4);
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
    public void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.Enum type)
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
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType)get_store().add_attribute_user(TYPE$4);
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
     * Gets the "srcId" attribute
     */
    public java.lang.Object getSrcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRCID$6);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "srcId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetSrcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(SRCID$6);
            return target;
        }
    }
    
    /**
     * Sets the "srcId" attribute
     */
    public void setSrcId(java.lang.Object srcId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRCID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRCID$6);
            }
            target.setObjectValue(srcId);
        }
    }
    
    /**
     * Sets (as xml) the "srcId" attribute
     */
    public void xsetSrcId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId srcId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(SRCID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(SRCID$6);
            }
            target.set(srcId);
        }
    }
    
    /**
     * Gets the "destId" attribute
     */
    public java.lang.Object getDestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTID$8);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "destId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetDestId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(DESTID$8);
            return target;
        }
    }
    
    /**
     * Sets the "destId" attribute
     */
    public void setDestId(java.lang.Object destId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTID$8);
            }
            target.setObjectValue(destId);
        }
    }
    
    /**
     * Sets (as xml) the "destId" attribute
     */
    public void xsetDestId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId destId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(DESTID$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(DESTID$8);
            }
            target.set(destId);
        }
    }
    
    /**
     * Gets the "srcOrd" attribute
     */
    public long getSrcOrd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRCORD$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "srcOrd" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSrcOrd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SRCORD$10);
            return target;
        }
    }
    
    /**
     * Sets the "srcOrd" attribute
     */
    public void setSrcOrd(long srcOrd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRCORD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRCORD$10);
            }
            target.setLongValue(srcOrd);
        }
    }
    
    /**
     * Sets (as xml) the "srcOrd" attribute
     */
    public void xsetSrcOrd(org.apache.xmlbeans.XmlUnsignedInt srcOrd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SRCORD$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SRCORD$10);
            }
            target.set(srcOrd);
        }
    }
    
    /**
     * Gets the "destOrd" attribute
     */
    public long getDestOrd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTORD$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "destOrd" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDestOrd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DESTORD$12);
            return target;
        }
    }
    
    /**
     * Sets the "destOrd" attribute
     */
    public void setDestOrd(long destOrd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTORD$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTORD$12);
            }
            target.setLongValue(destOrd);
        }
    }
    
    /**
     * Sets (as xml) the "destOrd" attribute
     */
    public void xsetDestOrd(org.apache.xmlbeans.XmlUnsignedInt destOrd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DESTORD$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DESTORD$12);
            }
            target.set(destOrd);
        }
    }
    
    /**
     * Gets the "parTransId" attribute
     */
    public java.lang.Object getParTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTRANSID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTRANSID$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "parTransId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetParTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PARTRANSID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_default_attribute_value(PARTRANSID$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "parTransId" attribute
     */
    public boolean isSetParTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTRANSID$14) != null;
        }
    }
    
    /**
     * Sets the "parTransId" attribute
     */
    public void setParTransId(java.lang.Object parTransId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTRANSID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTRANSID$14);
            }
            target.setObjectValue(parTransId);
        }
    }
    
    /**
     * Sets (as xml) the "parTransId" attribute
     */
    public void xsetParTransId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId parTransId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(PARTRANSID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(PARTRANSID$14);
            }
            target.set(parTransId);
        }
    }
    
    /**
     * Unsets the "parTransId" attribute
     */
    public void unsetParTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTRANSID$14);
        }
    }
    
    /**
     * Gets the "sibTransId" attribute
     */
    public java.lang.Object getSibTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIBTRANSID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SIBTRANSID$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "sibTransId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetSibTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(SIBTRANSID$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_default_attribute_value(SIBTRANSID$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "sibTransId" attribute
     */
    public boolean isSetSibTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIBTRANSID$16) != null;
        }
    }
    
    /**
     * Sets the "sibTransId" attribute
     */
    public void setSibTransId(java.lang.Object sibTransId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIBTRANSID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIBTRANSID$16);
            }
            target.setObjectValue(sibTransId);
        }
    }
    
    /**
     * Sets (as xml) the "sibTransId" attribute
     */
    public void xsetSibTransId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId sibTransId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(SIBTRANSID$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(SIBTRANSID$16);
            }
            target.set(sibTransId);
        }
    }
    
    /**
     * Unsets the "sibTransId" attribute
     */
    public void unsetSibTransId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIBTRANSID$16);
        }
    }
    
    /**
     * Gets the "presId" attribute
     */
    public java.lang.String getPresId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRESID$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "presId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPresId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(PRESID$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "presId" attribute
     */
    public boolean isSetPresId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRESID$18) != null;
        }
    }
    
    /**
     * Sets the "presId" attribute
     */
    public void setPresId(java.lang.String presId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRESID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRESID$18);
            }
            target.setStringValue(presId);
        }
    }
    
    /**
     * Sets (as xml) the "presId" attribute
     */
    public void xsetPresId(org.apache.xmlbeans.XmlString presId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRESID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRESID$18);
            }
            target.set(presId);
        }
    }
    
    /**
     * Unsets the "presId" attribute
     */
    public void unsetPresId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRESID$18);
        }
    }
}
