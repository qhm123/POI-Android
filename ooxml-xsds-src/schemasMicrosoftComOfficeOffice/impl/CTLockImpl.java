/*
 * XML Type:  CT_Lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTLock
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Lock(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTLockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTLock
{
    
    public CTLockImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName POSITION$2 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName SELECTION$4 = 
        new javax.xml.namespace.QName("", "selection");
    private static final javax.xml.namespace.QName GROUPING$6 = 
        new javax.xml.namespace.QName("", "grouping");
    private static final javax.xml.namespace.QName UNGROUPING$8 = 
        new javax.xml.namespace.QName("", "ungrouping");
    private static final javax.xml.namespace.QName ROTATION$10 = 
        new javax.xml.namespace.QName("", "rotation");
    private static final javax.xml.namespace.QName CROPPING$12 = 
        new javax.xml.namespace.QName("", "cropping");
    private static final javax.xml.namespace.QName VERTICIES$14 = 
        new javax.xml.namespace.QName("", "verticies");
    private static final javax.xml.namespace.QName ADJUSTHANDLES$16 = 
        new javax.xml.namespace.QName("", "adjusthandles");
    private static final javax.xml.namespace.QName TEXT$18 = 
        new javax.xml.namespace.QName("", "text");
    private static final javax.xml.namespace.QName ASPECTRATIO$20 = 
        new javax.xml.namespace.QName("", "aspectratio");
    private static final javax.xml.namespace.QName SHAPETYPE$22 = 
        new javax.xml.namespace.QName("", "shapetype");
    
    
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
     * Gets the "position" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(POSITION$2);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$2) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$2);
            }
            target.setEnumValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(schemasMicrosoftComOfficeOffice.STTrueFalse position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(POSITION$2);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$2);
        }
    }
    
    /**
     * Gets the "selection" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTION$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "selection" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SELECTION$4);
            return target;
        }
    }
    
    /**
     * True if has "selection" attribute
     */
    public boolean isSetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SELECTION$4) != null;
        }
    }
    
    /**
     * Sets the "selection" attribute
     */
    public void setSelection(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum selection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTION$4);
            }
            target.setEnumValue(selection);
        }
    }
    
    /**
     * Sets (as xml) the "selection" attribute
     */
    public void xsetSelection(schemasMicrosoftComOfficeOffice.STTrueFalse selection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SELECTION$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SELECTION$4);
            }
            target.set(selection);
        }
    }
    
    /**
     * Unsets the "selection" attribute
     */
    public void unsetSelection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SELECTION$4);
        }
    }
    
    /**
     * Gets the "grouping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPING$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "grouping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(GROUPING$6);
            return target;
        }
    }
    
    /**
     * True if has "grouping" attribute
     */
    public boolean isSetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUPING$6) != null;
        }
    }
    
    /**
     * Sets the "grouping" attribute
     */
    public void setGrouping(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum grouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPING$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPING$6);
            }
            target.setEnumValue(grouping);
        }
    }
    
    /**
     * Sets (as xml) the "grouping" attribute
     */
    public void xsetGrouping(schemasMicrosoftComOfficeOffice.STTrueFalse grouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(GROUPING$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(GROUPING$6);
            }
            target.set(grouping);
        }
    }
    
    /**
     * Unsets the "grouping" attribute
     */
    public void unsetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUPING$6);
        }
    }
    
    /**
     * Gets the "ungrouping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUngrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNGROUPING$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ungrouping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetUngrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(UNGROUPING$8);
            return target;
        }
    }
    
    /**
     * True if has "ungrouping" attribute
     */
    public boolean isSetUngrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNGROUPING$8) != null;
        }
    }
    
    /**
     * Sets the "ungrouping" attribute
     */
    public void setUngrouping(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum ungrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNGROUPING$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNGROUPING$8);
            }
            target.setEnumValue(ungrouping);
        }
    }
    
    /**
     * Sets (as xml) the "ungrouping" attribute
     */
    public void xsetUngrouping(schemasMicrosoftComOfficeOffice.STTrueFalse ungrouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(UNGROUPING$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(UNGROUPING$8);
            }
            target.set(ungrouping);
        }
    }
    
    /**
     * Unsets the "ungrouping" attribute
     */
    public void unsetUngrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNGROUPING$8);
        }
    }
    
    /**
     * Gets the "rotation" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATION$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rotation" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ROTATION$10);
            return target;
        }
    }
    
    /**
     * True if has "rotation" attribute
     */
    public boolean isSetRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROTATION$10) != null;
        }
    }
    
    /**
     * Sets the "rotation" attribute
     */
    public void setRotation(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum rotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATION$10);
            }
            target.setEnumValue(rotation);
        }
    }
    
    /**
     * Sets (as xml) the "rotation" attribute
     */
    public void xsetRotation(schemasMicrosoftComOfficeOffice.STTrueFalse rotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ROTATION$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ROTATION$10);
            }
            target.set(rotation);
        }
    }
    
    /**
     * Unsets the "rotation" attribute
     */
    public void unsetRotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROTATION$10);
        }
    }
    
    /**
     * Gets the "cropping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getCropping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROPPING$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cropping" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetCropping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CROPPING$12);
            return target;
        }
    }
    
    /**
     * True if has "cropping" attribute
     */
    public boolean isSetCropping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CROPPING$12) != null;
        }
    }
    
    /**
     * Sets the "cropping" attribute
     */
    public void setCropping(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum cropping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROPPING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROPPING$12);
            }
            target.setEnumValue(cropping);
        }
    }
    
    /**
     * Sets (as xml) the "cropping" attribute
     */
    public void xsetCropping(schemasMicrosoftComOfficeOffice.STTrueFalse cropping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CROPPING$12);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(CROPPING$12);
            }
            target.set(cropping);
        }
    }
    
    /**
     * Unsets the "cropping" attribute
     */
    public void unsetCropping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CROPPING$12);
        }
    }
    
    /**
     * Gets the "verticies" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getVerticies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICIES$14);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "verticies" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetVerticies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(VERTICIES$14);
            return target;
        }
    }
    
    /**
     * True if has "verticies" attribute
     */
    public boolean isSetVerticies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTICIES$14) != null;
        }
    }
    
    /**
     * Sets the "verticies" attribute
     */
    public void setVerticies(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum verticies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTICIES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTICIES$14);
            }
            target.setEnumValue(verticies);
        }
    }
    
    /**
     * Sets (as xml) the "verticies" attribute
     */
    public void xsetVerticies(schemasMicrosoftComOfficeOffice.STTrueFalse verticies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(VERTICIES$14);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(VERTICIES$14);
            }
            target.set(verticies);
        }
    }
    
    /**
     * Unsets the "verticies" attribute
     */
    public void unsetVerticies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTICIES$14);
        }
    }
    
    /**
     * Gets the "adjusthandles" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAdjusthandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUSTHANDLES$16);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "adjusthandles" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAdjusthandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ADJUSTHANDLES$16);
            return target;
        }
    }
    
    /**
     * True if has "adjusthandles" attribute
     */
    public boolean isSetAdjusthandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADJUSTHANDLES$16) != null;
        }
    }
    
    /**
     * Sets the "adjusthandles" attribute
     */
    public void setAdjusthandles(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum adjusthandles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADJUSTHANDLES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADJUSTHANDLES$16);
            }
            target.setEnumValue(adjusthandles);
        }
    }
    
    /**
     * Sets (as xml) the "adjusthandles" attribute
     */
    public void xsetAdjusthandles(schemasMicrosoftComOfficeOffice.STTrueFalse adjusthandles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ADJUSTHANDLES$16);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ADJUSTHANDLES$16);
            }
            target.set(adjusthandles);
        }
    }
    
    /**
     * Unsets the "adjusthandles" attribute
     */
    public void unsetAdjusthandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADJUSTHANDLES$16);
        }
    }
    
    /**
     * Gets the "text" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$18);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(TEXT$18);
            return target;
        }
    }
    
    /**
     * True if has "text" attribute
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXT$18) != null;
        }
    }
    
    /**
     * Sets the "text" attribute
     */
    public void setText(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$18);
            }
            target.setEnumValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" attribute
     */
    public void xsetText(schemasMicrosoftComOfficeOffice.STTrueFalse text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(TEXT$18);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(TEXT$18);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "text" attribute
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXT$18);
        }
    }
    
    /**
     * Gets the "aspectratio" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAspectratio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASPECTRATIO$20);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aspectratio" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAspectratio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ASPECTRATIO$20);
            return target;
        }
    }
    
    /**
     * True if has "aspectratio" attribute
     */
    public boolean isSetAspectratio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASPECTRATIO$20) != null;
        }
    }
    
    /**
     * Sets the "aspectratio" attribute
     */
    public void setAspectratio(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum aspectratio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASPECTRATIO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASPECTRATIO$20);
            }
            target.setEnumValue(aspectratio);
        }
    }
    
    /**
     * Sets (as xml) the "aspectratio" attribute
     */
    public void xsetAspectratio(schemasMicrosoftComOfficeOffice.STTrueFalse aspectratio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ASPECTRATIO$20);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ASPECTRATIO$20);
            }
            target.set(aspectratio);
        }
    }
    
    /**
     * Unsets the "aspectratio" attribute
     */
    public void unsetAspectratio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASPECTRATIO$20);
        }
    }
    
    /**
     * Gets the "shapetype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAPETYPE$22);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "shapetype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SHAPETYPE$22);
            return target;
        }
    }
    
    /**
     * True if has "shapetype" attribute
     */
    public boolean isSetShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHAPETYPE$22) != null;
        }
    }
    
    /**
     * Sets the "shapetype" attribute
     */
    public void setShapetype(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum shapetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAPETYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAPETYPE$22);
            }
            target.setEnumValue(shapetype);
        }
    }
    
    /**
     * Sets (as xml) the "shapetype" attribute
     */
    public void xsetShapetype(schemasMicrosoftComOfficeOffice.STTrueFalse shapetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SHAPETYPE$22);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SHAPETYPE$22);
            }
            target.set(shapetype);
        }
    }
    
    /**
     * Unsets the "shapetype" attribute
     */
    public void unsetShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHAPETYPE$22);
        }
    }
}
