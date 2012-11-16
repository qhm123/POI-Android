/*
 * XML Type:  CT_Shape
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Shape(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTShape
{
    
    public CTShapeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADJLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "adjLst");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName ROT$4 = 
        new javax.xml.namespace.QName("", "rot");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName BLIP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "blip");
    private static final javax.xml.namespace.QName ZORDEROFF$10 = 
        new javax.xml.namespace.QName("", "zOrderOff");
    private static final javax.xml.namespace.QName HIDEGEOM$12 = 
        new javax.xml.namespace.QName("", "hideGeom");
    private static final javax.xml.namespace.QName LKTXENTRY$14 = 
        new javax.xml.namespace.QName("", "lkTxEntry");
    private static final javax.xml.namespace.QName BLIPPHLDR$16 = 
        new javax.xml.namespace.QName("", "blipPhldr");
    
    
    /**
     * Gets the "adjLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst getAdjLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst)get_store().find_element_user(ADJLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "adjLst" element
     */
    public boolean isSetAdjLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADJLST$0) != 0;
        }
    }
    
    /**
     * Sets the "adjLst" element
     */
    public void setAdjLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst adjLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst)get_store().find_element_user(ADJLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst)get_store().add_element_user(ADJLST$0);
            }
            target.set(adjLst);
        }
    }
    
    /**
     * Appends and returns a new empty "adjLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst addNewAdjLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTAdjLst)get_store().add_element_user(ADJLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "adjLst" element
     */
    public void unsetAdjLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADJLST$0, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "rot" attribute
     */
    public double getRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROT$4);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "rot" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(ROT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "rot" attribute
     */
    public boolean isSetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROT$4) != null;
        }
    }
    
    /**
     * Sets the "rot" attribute
     */
    public void setRot(double rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$4);
            }
            target.setDoubleValue(rot);
        }
    }
    
    /**
     * Sets (as xml) the "rot" attribute
     */
    public void xsetRot(org.apache.xmlbeans.XmlDouble rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ROT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ROT$4);
            }
            target.set(rot);
        }
    }
    
    /**
     * Unsets the "rot" attribute
     */
    public void unsetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROT$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType)get_default_attribute_value(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STLayoutShapeType)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
        }
    }
    
    /**
     * Gets the "blip" attribute
     */
    public java.lang.String getBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLIP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLIP$8);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blip" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(BLIP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_default_attribute_value(BLIP$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "blip" attribute
     */
    public boolean isSetBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLIP$8) != null;
        }
    }
    
    /**
     * Sets the "blip" attribute
     */
    public void setBlip(java.lang.String blip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLIP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLIP$8);
            }
            target.setStringValue(blip);
        }
    }
    
    /**
     * Sets (as xml) the "blip" attribute
     */
    public void xsetBlip(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId blip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(BLIP$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(BLIP$8);
            }
            target.set(blip);
        }
    }
    
    /**
     * Unsets the "blip" attribute
     */
    public void unsetBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLIP$8);
        }
    }
    
    /**
     * Gets the "zOrderOff" attribute
     */
    public int getZOrderOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDEROFF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ZORDEROFF$10);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "zOrderOff" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetZOrderOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ZORDEROFF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(ZORDEROFF$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "zOrderOff" attribute
     */
    public boolean isSetZOrderOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ZORDEROFF$10) != null;
        }
    }
    
    /**
     * Sets the "zOrderOff" attribute
     */
    public void setZOrderOff(int zOrderOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ZORDEROFF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ZORDEROFF$10);
            }
            target.setIntValue(zOrderOff);
        }
    }
    
    /**
     * Sets (as xml) the "zOrderOff" attribute
     */
    public void xsetZOrderOff(org.apache.xmlbeans.XmlInt zOrderOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ZORDEROFF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ZORDEROFF$10);
            }
            target.set(zOrderOff);
        }
    }
    
    /**
     * Unsets the "zOrderOff" attribute
     */
    public void unsetZOrderOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ZORDEROFF$10);
        }
    }
    
    /**
     * Gets the "hideGeom" attribute
     */
    public boolean getHideGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEGEOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDEGEOM$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hideGeom" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHideGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEGEOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDEGEOM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "hideGeom" attribute
     */
    public boolean isSetHideGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDEGEOM$12) != null;
        }
    }
    
    /**
     * Sets the "hideGeom" attribute
     */
    public void setHideGeom(boolean hideGeom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEGEOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDEGEOM$12);
            }
            target.setBooleanValue(hideGeom);
        }
    }
    
    /**
     * Sets (as xml) the "hideGeom" attribute
     */
    public void xsetHideGeom(org.apache.xmlbeans.XmlBoolean hideGeom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDEGEOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDEGEOM$12);
            }
            target.set(hideGeom);
        }
    }
    
    /**
     * Unsets the "hideGeom" attribute
     */
    public void unsetHideGeom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDEGEOM$12);
        }
    }
    
    /**
     * Gets the "lkTxEntry" attribute
     */
    public boolean getLkTxEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LKTXENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LKTXENTRY$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lkTxEntry" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLkTxEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LKTXENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LKTXENTRY$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "lkTxEntry" attribute
     */
    public boolean isSetLkTxEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LKTXENTRY$14) != null;
        }
    }
    
    /**
     * Sets the "lkTxEntry" attribute
     */
    public void setLkTxEntry(boolean lkTxEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LKTXENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LKTXENTRY$14);
            }
            target.setBooleanValue(lkTxEntry);
        }
    }
    
    /**
     * Sets (as xml) the "lkTxEntry" attribute
     */
    public void xsetLkTxEntry(org.apache.xmlbeans.XmlBoolean lkTxEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LKTXENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LKTXENTRY$14);
            }
            target.set(lkTxEntry);
        }
    }
    
    /**
     * Unsets the "lkTxEntry" attribute
     */
    public void unsetLkTxEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LKTXENTRY$14);
        }
    }
    
    /**
     * Gets the "blipPhldr" attribute
     */
    public boolean getBlipPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLIPPHLDR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLIPPHLDR$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "blipPhldr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBlipPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLIPPHLDR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BLIPPHLDR$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "blipPhldr" attribute
     */
    public boolean isSetBlipPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLIPPHLDR$16) != null;
        }
    }
    
    /**
     * Sets the "blipPhldr" attribute
     */
    public void setBlipPhldr(boolean blipPhldr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLIPPHLDR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLIPPHLDR$16);
            }
            target.setBooleanValue(blipPhldr);
        }
    }
    
    /**
     * Sets (as xml) the "blipPhldr" attribute
     */
    public void xsetBlipPhldr(org.apache.xmlbeans.XmlBoolean blipPhldr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BLIPPHLDR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BLIPPHLDR$16);
            }
            target.set(blipPhldr);
        }
    }
    
    /**
     * Unsets the "blipPhldr" attribute
     */
    public void unsetBlipPhldr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLIPPHLDR$16);
        }
    }
}
