/*
 * XML Type:  CT_CacheHierarchy
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CacheHierarchy(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCacheHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchy
{
    
    public CTCacheHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDSUSAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fieldsUsage");
    private static final javax.xml.namespace.QName GROUPLEVELS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "groupLevels");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName UNIQUENAME$6 = 
        new javax.xml.namespace.QName("", "uniqueName");
    private static final javax.xml.namespace.QName CAPTION$8 = 
        new javax.xml.namespace.QName("", "caption");
    private static final javax.xml.namespace.QName MEASURE$10 = 
        new javax.xml.namespace.QName("", "measure");
    private static final javax.xml.namespace.QName SET$12 = 
        new javax.xml.namespace.QName("", "set");
    private static final javax.xml.namespace.QName PARENTSET$14 = 
        new javax.xml.namespace.QName("", "parentSet");
    private static final javax.xml.namespace.QName ICONSET$16 = 
        new javax.xml.namespace.QName("", "iconSet");
    private static final javax.xml.namespace.QName ATTRIBUTE$18 = 
        new javax.xml.namespace.QName("", "attribute");
    private static final javax.xml.namespace.QName TIME$20 = 
        new javax.xml.namespace.QName("", "time");
    private static final javax.xml.namespace.QName KEYATTRIBUTE$22 = 
        new javax.xml.namespace.QName("", "keyAttribute");
    private static final javax.xml.namespace.QName DEFAULTMEMBERUNIQUENAME$24 = 
        new javax.xml.namespace.QName("", "defaultMemberUniqueName");
    private static final javax.xml.namespace.QName ALLUNIQUENAME$26 = 
        new javax.xml.namespace.QName("", "allUniqueName");
    private static final javax.xml.namespace.QName ALLCAPTION$28 = 
        new javax.xml.namespace.QName("", "allCaption");
    private static final javax.xml.namespace.QName DIMENSIONUNIQUENAME$30 = 
        new javax.xml.namespace.QName("", "dimensionUniqueName");
    private static final javax.xml.namespace.QName DISPLAYFOLDER$32 = 
        new javax.xml.namespace.QName("", "displayFolder");
    private static final javax.xml.namespace.QName MEASUREGROUP$34 = 
        new javax.xml.namespace.QName("", "measureGroup");
    private static final javax.xml.namespace.QName MEASURES$36 = 
        new javax.xml.namespace.QName("", "measures");
    private static final javax.xml.namespace.QName COUNT$38 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName ONEFIELD$40 = 
        new javax.xml.namespace.QName("", "oneField");
    private static final javax.xml.namespace.QName MEMBERVALUEDATATYPE$42 = 
        new javax.xml.namespace.QName("", "memberValueDatatype");
    private static final javax.xml.namespace.QName UNBALANCED$44 = 
        new javax.xml.namespace.QName("", "unbalanced");
    private static final javax.xml.namespace.QName UNBALANCEDGROUP$46 = 
        new javax.xml.namespace.QName("", "unbalancedGroup");
    private static final javax.xml.namespace.QName HIDDEN$48 = 
        new javax.xml.namespace.QName("", "hidden");
    
    
    /**
     * Gets the "fieldsUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage getFieldsUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage)get_store().find_element_user(FIELDSUSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fieldsUsage" element
     */
    public boolean isSetFieldsUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDSUSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "fieldsUsage" element
     */
    public void setFieldsUsage(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage fieldsUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage)get_store().find_element_user(FIELDSUSAGE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage)get_store().add_element_user(FIELDSUSAGE$0);
            }
            target.set(fieldsUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "fieldsUsage" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage addNewFieldsUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldsUsage)get_store().add_element_user(FIELDSUSAGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fieldsUsage" element
     */
    public void unsetFieldsUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDSUSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "groupLevels" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels getGroupLevels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels)get_store().find_element_user(GROUPLEVELS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "groupLevels" element
     */
    public boolean isSetGroupLevels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPLEVELS$2) != 0;
        }
    }
    
    /**
     * Sets the "groupLevels" element
     */
    public void setGroupLevels(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels groupLevels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels)get_store().find_element_user(GROUPLEVELS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels)get_store().add_element_user(GROUPLEVELS$2);
            }
            target.set(groupLevels);
        }
    }
    
    /**
     * Appends and returns a new empty "groupLevels" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels addNewGroupLevels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevels)get_store().add_element_user(GROUPLEVELS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "groupLevels" element
     */
    public void unsetGroupLevels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPLEVELS$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "uniqueName" attribute
     */
    public java.lang.String getUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$6);
            return target;
        }
    }
    
    /**
     * Sets the "uniqueName" attribute
     */
    public void setUniqueName(java.lang.String uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUENAME$6);
            }
            target.setStringValue(uniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    public void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(UNIQUENAME$6);
            }
            target.set(uniqueName);
        }
    }
    
    /**
     * Gets the "caption" attribute
     */
    public java.lang.String getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$8);
            return target;
        }
    }
    
    /**
     * True if has "caption" attribute
     */
    public boolean isSetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAPTION$8) != null;
        }
    }
    
    /**
     * Sets the "caption" attribute
     */
    public void setCaption(java.lang.String caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTION$8);
            }
            target.setStringValue(caption);
        }
    }
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    public void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CAPTION$8);
            }
            target.set(caption);
        }
    }
    
    /**
     * Unsets the "caption" attribute
     */
    public void unsetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAPTION$8);
        }
    }
    
    /**
     * Gets the "measure" attribute
     */
    public boolean getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEASURE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "measure" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASURE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MEASURE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "measure" attribute
     */
    public boolean isSetMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASURE$10) != null;
        }
    }
    
    /**
     * Sets the "measure" attribute
     */
    public void setMeasure(boolean measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASURE$10);
            }
            target.setBooleanValue(measure);
        }
    }
    
    /**
     * Sets (as xml) the "measure" attribute
     */
    public void xsetMeasure(org.apache.xmlbeans.XmlBoolean measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASURE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MEASURE$10);
            }
            target.set(measure);
        }
    }
    
    /**
     * Unsets the "measure" attribute
     */
    public void unsetMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASURE$10);
        }
    }
    
    /**
     * Gets the "set" attribute
     */
    public boolean getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SET$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "set" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SET$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "set" attribute
     */
    public boolean isSetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SET$12) != null;
        }
    }
    
    /**
     * Sets the "set" attribute
     */
    public void setSet(boolean set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SET$12);
            }
            target.setBooleanValue(set);
        }
    }
    
    /**
     * Sets (as xml) the "set" attribute
     */
    public void xsetSet(org.apache.xmlbeans.XmlBoolean set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SET$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SET$12);
            }
            target.set(set);
        }
    }
    
    /**
     * Unsets the "set" attribute
     */
    public void unsetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SET$12);
        }
    }
    
    /**
     * Gets the "parentSet" attribute
     */
    public long getParentSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTSET$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentSet" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetParentSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PARENTSET$14);
            return target;
        }
    }
    
    /**
     * True if has "parentSet" attribute
     */
    public boolean isSetParentSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARENTSET$14) != null;
        }
    }
    
    /**
     * Sets the "parentSet" attribute
     */
    public void setParentSet(long parentSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTSET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENTSET$14);
            }
            target.setLongValue(parentSet);
        }
    }
    
    /**
     * Sets (as xml) the "parentSet" attribute
     */
    public void xsetParentSet(org.apache.xmlbeans.XmlUnsignedInt parentSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PARENTSET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PARENTSET$14);
            }
            target.set(parentSet);
        }
    }
    
    /**
     * Unsets the "parentSet" attribute
     */
    public void unsetParentSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARENTSET$14);
        }
    }
    
    /**
     * Gets the "iconSet" attribute
     */
    public int getIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ICONSET$16);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "iconSet" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ICONSET$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(ICONSET$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "iconSet" attribute
     */
    public boolean isSetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICONSET$16) != null;
        }
    }
    
    /**
     * Sets the "iconSet" attribute
     */
    public void setIconSet(int iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONSET$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICONSET$16);
            }
            target.setIntValue(iconSet);
        }
    }
    
    /**
     * Sets (as xml) the "iconSet" attribute
     */
    public void xsetIconSet(org.apache.xmlbeans.XmlInt iconSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ICONSET$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ICONSET$16);
            }
            target.set(iconSet);
        }
    }
    
    /**
     * Unsets the "iconSet" attribute
     */
    public void unsetIconSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICONSET$16);
        }
    }
    
    /**
     * Gets the "attribute" attribute
     */
    public boolean getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ATTRIBUTE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "attribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATTRIBUTE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ATTRIBUTE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "attribute" attribute
     */
    public boolean isSetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTRIBUTE$18) != null;
        }
    }
    
    /**
     * Sets the "attribute" attribute
     */
    public void setAttribute(boolean attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTE$18);
            }
            target.setBooleanValue(attribute);
        }
    }
    
    /**
     * Sets (as xml) the "attribute" attribute
     */
    public void xsetAttribute(org.apache.xmlbeans.XmlBoolean attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATTRIBUTE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ATTRIBUTE$18);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Unsets the "attribute" attribute
     */
    public void unsetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTRIBUTE$18);
        }
    }
    
    /**
     * Gets the "time" attribute
     */
    public boolean getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TIME$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "time" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TIME$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "time" attribute
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIME$20) != null;
        }
    }
    
    /**
     * Sets the "time" attribute
     */
    public void setTime(boolean time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$20);
            }
            target.setBooleanValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "time" attribute
     */
    public void xsetTime(org.apache.xmlbeans.XmlBoolean time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIME$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TIME$20);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "time" attribute
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIME$20);
        }
    }
    
    /**
     * Gets the "keyAttribute" attribute
     */
    public boolean getKeyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYATTRIBUTE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(KEYATTRIBUTE$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "keyAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetKeyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEYATTRIBUTE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(KEYATTRIBUTE$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "keyAttribute" attribute
     */
    public boolean isSetKeyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYATTRIBUTE$22) != null;
        }
    }
    
    /**
     * Sets the "keyAttribute" attribute
     */
    public void setKeyAttribute(boolean keyAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYATTRIBUTE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYATTRIBUTE$22);
            }
            target.setBooleanValue(keyAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "keyAttribute" attribute
     */
    public void xsetKeyAttribute(org.apache.xmlbeans.XmlBoolean keyAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(KEYATTRIBUTE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(KEYATTRIBUTE$22);
            }
            target.set(keyAttribute);
        }
    }
    
    /**
     * Unsets the "keyAttribute" attribute
     */
    public void unsetKeyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYATTRIBUTE$22);
        }
    }
    
    /**
     * Gets the "defaultMemberUniqueName" attribute
     */
    public java.lang.String getDefaultMemberUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultMemberUniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDefaultMemberUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            return target;
        }
    }
    
    /**
     * True if has "defaultMemberUniqueName" attribute
     */
    public boolean isSetDefaultMemberUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTMEMBERUNIQUENAME$24) != null;
        }
    }
    
    /**
     * Sets the "defaultMemberUniqueName" attribute
     */
    public void setDefaultMemberUniqueName(java.lang.String defaultMemberUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            }
            target.setStringValue(defaultMemberUniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "defaultMemberUniqueName" attribute
     */
    public void xsetDefaultMemberUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring defaultMemberUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DEFAULTMEMBERUNIQUENAME$24);
            }
            target.set(defaultMemberUniqueName);
        }
    }
    
    /**
     * Unsets the "defaultMemberUniqueName" attribute
     */
    public void unsetDefaultMemberUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTMEMBERUNIQUENAME$24);
        }
    }
    
    /**
     * Gets the "allUniqueName" attribute
     */
    public java.lang.String getAllUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLUNIQUENAME$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "allUniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetAllUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ALLUNIQUENAME$26);
            return target;
        }
    }
    
    /**
     * True if has "allUniqueName" attribute
     */
    public boolean isSetAllUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLUNIQUENAME$26) != null;
        }
    }
    
    /**
     * Sets the "allUniqueName" attribute
     */
    public void setAllUniqueName(java.lang.String allUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLUNIQUENAME$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLUNIQUENAME$26);
            }
            target.setStringValue(allUniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "allUniqueName" attribute
     */
    public void xsetAllUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring allUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ALLUNIQUENAME$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ALLUNIQUENAME$26);
            }
            target.set(allUniqueName);
        }
    }
    
    /**
     * Unsets the "allUniqueName" attribute
     */
    public void unsetAllUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLUNIQUENAME$26);
        }
    }
    
    /**
     * Gets the "allCaption" attribute
     */
    public java.lang.String getAllCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLCAPTION$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "allCaption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetAllCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ALLCAPTION$28);
            return target;
        }
    }
    
    /**
     * True if has "allCaption" attribute
     */
    public boolean isSetAllCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLCAPTION$28) != null;
        }
    }
    
    /**
     * Sets the "allCaption" attribute
     */
    public void setAllCaption(java.lang.String allCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLCAPTION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLCAPTION$28);
            }
            target.setStringValue(allCaption);
        }
    }
    
    /**
     * Sets (as xml) the "allCaption" attribute
     */
    public void xsetAllCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring allCaption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ALLCAPTION$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ALLCAPTION$28);
            }
            target.set(allCaption);
        }
    }
    
    /**
     * Unsets the "allCaption" attribute
     */
    public void unsetAllCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLCAPTION$28);
        }
    }
    
    /**
     * Gets the "dimensionUniqueName" attribute
     */
    public java.lang.String getDimensionUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONUNIQUENAME$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimensionUniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDimensionUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DIMENSIONUNIQUENAME$30);
            return target;
        }
    }
    
    /**
     * True if has "dimensionUniqueName" attribute
     */
    public boolean isSetDimensionUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSIONUNIQUENAME$30) != null;
        }
    }
    
    /**
     * Sets the "dimensionUniqueName" attribute
     */
    public void setDimensionUniqueName(java.lang.String dimensionUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONUNIQUENAME$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSIONUNIQUENAME$30);
            }
            target.setStringValue(dimensionUniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "dimensionUniqueName" attribute
     */
    public void xsetDimensionUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring dimensionUniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DIMENSIONUNIQUENAME$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DIMENSIONUNIQUENAME$30);
            }
            target.set(dimensionUniqueName);
        }
    }
    
    /**
     * Unsets the "dimensionUniqueName" attribute
     */
    public void unsetDimensionUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSIONUNIQUENAME$30);
        }
    }
    
    /**
     * Gets the "displayFolder" attribute
     */
    public java.lang.String getDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFOLDER$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayFolder" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYFOLDER$32);
            return target;
        }
    }
    
    /**
     * True if has "displayFolder" attribute
     */
    public boolean isSetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYFOLDER$32) != null;
        }
    }
    
    /**
     * Sets the "displayFolder" attribute
     */
    public void setDisplayFolder(java.lang.String displayFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFOLDER$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYFOLDER$32);
            }
            target.setStringValue(displayFolder);
        }
    }
    
    /**
     * Sets (as xml) the "displayFolder" attribute
     */
    public void xsetDisplayFolder(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring displayFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYFOLDER$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DISPLAYFOLDER$32);
            }
            target.set(displayFolder);
        }
    }
    
    /**
     * Unsets the "displayFolder" attribute
     */
    public void unsetDisplayFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYFOLDER$32);
        }
    }
    
    /**
     * Gets the "measureGroup" attribute
     */
    public java.lang.String getMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "measureGroup" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEASUREGROUP$34);
            return target;
        }
    }
    
    /**
     * True if has "measureGroup" attribute
     */
    public boolean isSetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUREGROUP$34) != null;
        }
    }
    
    /**
     * Sets the "measureGroup" attribute
     */
    public void setMeasureGroup(java.lang.String measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUREGROUP$34);
            }
            target.setStringValue(measureGroup);
        }
    }
    
    /**
     * Sets (as xml) the "measureGroup" attribute
     */
    public void xsetMeasureGroup(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEASUREGROUP$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MEASUREGROUP$34);
            }
            target.set(measureGroup);
        }
    }
    
    /**
     * Unsets the "measureGroup" attribute
     */
    public void unsetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUREGROUP$34);
        }
    }
    
    /**
     * Gets the "measures" attribute
     */
    public boolean getMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEASURES$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "measures" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASURES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MEASURES$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "measures" attribute
     */
    public boolean isSetMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASURES$36) != null;
        }
    }
    
    /**
     * Sets the "measures" attribute
     */
    public void setMeasures(boolean measures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASURES$36);
            }
            target.setBooleanValue(measures);
        }
    }
    
    /**
     * Sets (as xml) the "measures" attribute
     */
    public void xsetMeasures(org.apache.xmlbeans.XmlBoolean measures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEASURES$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MEASURES$36);
            }
            target.set(measures);
        }
    }
    
    /**
     * Unsets the "measures" attribute
     */
    public void unsetMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASURES$36);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$38);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$38);
            return target;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$38);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$38);
            }
            target.set(count);
        }
    }
    
    /**
     * Gets the "oneField" attribute
     */
    public boolean getOneField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONEFIELD$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ONEFIELD$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "oneField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOneField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONEFIELD$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ONEFIELD$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "oneField" attribute
     */
    public boolean isSetOneField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONEFIELD$40) != null;
        }
    }
    
    /**
     * Sets the "oneField" attribute
     */
    public void setOneField(boolean oneField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONEFIELD$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONEFIELD$40);
            }
            target.setBooleanValue(oneField);
        }
    }
    
    /**
     * Sets (as xml) the "oneField" attribute
     */
    public void xsetOneField(org.apache.xmlbeans.XmlBoolean oneField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ONEFIELD$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ONEFIELD$40);
            }
            target.set(oneField);
        }
    }
    
    /**
     * Unsets the "oneField" attribute
     */
    public void unsetOneField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONEFIELD$40);
        }
    }
    
    /**
     * Gets the "memberValueDatatype" attribute
     */
    public int getMemberValueDatatype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERVALUEDATATYPE$42);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberValueDatatype" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetMemberValueDatatype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MEMBERVALUEDATATYPE$42);
            return target;
        }
    }
    
    /**
     * True if has "memberValueDatatype" attribute
     */
    public boolean isSetMemberValueDatatype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEMBERVALUEDATATYPE$42) != null;
        }
    }
    
    /**
     * Sets the "memberValueDatatype" attribute
     */
    public void setMemberValueDatatype(int memberValueDatatype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERVALUEDATATYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMBERVALUEDATATYPE$42);
            }
            target.setIntValue(memberValueDatatype);
        }
    }
    
    /**
     * Sets (as xml) the "memberValueDatatype" attribute
     */
    public void xsetMemberValueDatatype(org.apache.xmlbeans.XmlUnsignedShort memberValueDatatype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(MEMBERVALUEDATATYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(MEMBERVALUEDATATYPE$42);
            }
            target.set(memberValueDatatype);
        }
    }
    
    /**
     * Unsets the "memberValueDatatype" attribute
     */
    public void unsetMemberValueDatatype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEMBERVALUEDATATYPE$42);
        }
    }
    
    /**
     * Gets the "unbalanced" attribute
     */
    public boolean getUnbalanced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBALANCED$44);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unbalanced" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUnbalanced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNBALANCED$44);
            return target;
        }
    }
    
    /**
     * True if has "unbalanced" attribute
     */
    public boolean isSetUnbalanced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNBALANCED$44) != null;
        }
    }
    
    /**
     * Sets the "unbalanced" attribute
     */
    public void setUnbalanced(boolean unbalanced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBALANCED$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNBALANCED$44);
            }
            target.setBooleanValue(unbalanced);
        }
    }
    
    /**
     * Sets (as xml) the "unbalanced" attribute
     */
    public void xsetUnbalanced(org.apache.xmlbeans.XmlBoolean unbalanced)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNBALANCED$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNBALANCED$44);
            }
            target.set(unbalanced);
        }
    }
    
    /**
     * Unsets the "unbalanced" attribute
     */
    public void unsetUnbalanced()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNBALANCED$44);
        }
    }
    
    /**
     * Gets the "unbalancedGroup" attribute
     */
    public boolean getUnbalancedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBALANCEDGROUP$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unbalancedGroup" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUnbalancedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNBALANCEDGROUP$46);
            return target;
        }
    }
    
    /**
     * True if has "unbalancedGroup" attribute
     */
    public boolean isSetUnbalancedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNBALANCEDGROUP$46) != null;
        }
    }
    
    /**
     * Sets the "unbalancedGroup" attribute
     */
    public void setUnbalancedGroup(boolean unbalancedGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBALANCEDGROUP$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNBALANCEDGROUP$46);
            }
            target.setBooleanValue(unbalancedGroup);
        }
    }
    
    /**
     * Sets (as xml) the "unbalancedGroup" attribute
     */
    public void xsetUnbalancedGroup(org.apache.xmlbeans.XmlBoolean unbalancedGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNBALANCEDGROUP$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNBALANCEDGROUP$46);
            }
            target.set(unbalancedGroup);
        }
    }
    
    /**
     * Unsets the "unbalancedGroup" attribute
     */
    public void unsetUnbalancedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNBALANCEDGROUP$46);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$48);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$48);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$48) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$48);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$48);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$48);
        }
    }
}
