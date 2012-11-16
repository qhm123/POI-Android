/*
 * XML Type:  CT_PivotFilter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotFilter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilter
{
    
    public CTPivotFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOFILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName FLD$4 = 
        new javax.xml.namespace.QName("", "fld");
    private static final javax.xml.namespace.QName MPFLD$6 = 
        new javax.xml.namespace.QName("", "mpFld");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName EVALORDER$10 = 
        new javax.xml.namespace.QName("", "evalOrder");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName IMEASUREHIER$14 = 
        new javax.xml.namespace.QName("", "iMeasureHier");
    private static final javax.xml.namespace.QName IMEASUREFLD$16 = 
        new javax.xml.namespace.QName("", "iMeasureFld");
    private static final javax.xml.namespace.QName NAME$18 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$20 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName STRINGVALUE1$22 = 
        new javax.xml.namespace.QName("", "stringValue1");
    private static final javax.xml.namespace.QName STRINGVALUE2$24 = 
        new javax.xml.namespace.QName("", "stringValue2");
    
    
    /**
     * Gets the "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "autoFilter" element
     */
    public void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$0);
            }
            target.set(autoFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$0);
            return target;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
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
     * Gets the "fld" attribute
     */
    public long getFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$4);
            return target;
        }
    }
    
    /**
     * Sets the "fld" attribute
     */
    public void setFld(long fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLD$4);
            }
            target.setLongValue(fld);
        }
    }
    
    /**
     * Sets (as xml) the "fld" attribute
     */
    public void xsetFld(org.apache.xmlbeans.XmlUnsignedInt fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FLD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FLD$4);
            }
            target.set(fld);
        }
    }
    
    /**
     * Gets the "mpFld" attribute
     */
    public long getMpFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MPFLD$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "mpFld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMpFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MPFLD$6);
            return target;
        }
    }
    
    /**
     * True if has "mpFld" attribute
     */
    public boolean isSetMpFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MPFLD$6) != null;
        }
    }
    
    /**
     * Sets the "mpFld" attribute
     */
    public void setMpFld(long mpFld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MPFLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MPFLD$6);
            }
            target.setLongValue(mpFld);
        }
    }
    
    /**
     * Sets (as xml) the "mpFld" attribute
     */
    public void xsetMpFld(org.apache.xmlbeans.XmlUnsignedInt mpFld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MPFLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MPFLD$6);
            }
            target.set(mpFld);
        }
    }
    
    /**
     * Unsets the "mpFld" attribute
     */
    public void unsetMpFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MPFLD$6);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType)get_store().find_attribute_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPivotFilterType)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "evalOrder" attribute
     */
    public int getEvalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EVALORDER$10);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "evalOrder" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetEvalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(EVALORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(EVALORDER$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "evalOrder" attribute
     */
    public boolean isSetEvalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVALORDER$10) != null;
        }
    }
    
    /**
     * Sets the "evalOrder" attribute
     */
    public void setEvalOrder(int evalOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVALORDER$10);
            }
            target.setIntValue(evalOrder);
        }
    }
    
    /**
     * Sets (as xml) the "evalOrder" attribute
     */
    public void xsetEvalOrder(org.apache.xmlbeans.XmlInt evalOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(EVALORDER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(EVALORDER$10);
            }
            target.set(evalOrder);
        }
    }
    
    /**
     * Unsets the "evalOrder" attribute
     */
    public void unsetEvalOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVALORDER$10);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$12);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
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
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$12);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "iMeasureHier" attribute
     */
    public long getIMeasureHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEASUREHIER$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iMeasureHier" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIMeasureHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IMEASUREHIER$14);
            return target;
        }
    }
    
    /**
     * True if has "iMeasureHier" attribute
     */
    public boolean isSetIMeasureHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMEASUREHIER$14) != null;
        }
    }
    
    /**
     * Sets the "iMeasureHier" attribute
     */
    public void setIMeasureHier(long iMeasureHier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEASUREHIER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMEASUREHIER$14);
            }
            target.setLongValue(iMeasureHier);
        }
    }
    
    /**
     * Sets (as xml) the "iMeasureHier" attribute
     */
    public void xsetIMeasureHier(org.apache.xmlbeans.XmlUnsignedInt iMeasureHier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IMEASUREHIER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(IMEASUREHIER$14);
            }
            target.set(iMeasureHier);
        }
    }
    
    /**
     * Unsets the "iMeasureHier" attribute
     */
    public void unsetIMeasureHier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMEASUREHIER$14);
        }
    }
    
    /**
     * Gets the "iMeasureFld" attribute
     */
    public long getIMeasureFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEASUREFLD$16);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iMeasureFld" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIMeasureFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IMEASUREFLD$16);
            return target;
        }
    }
    
    /**
     * True if has "iMeasureFld" attribute
     */
    public boolean isSetIMeasureFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMEASUREFLD$16) != null;
        }
    }
    
    /**
     * Sets the "iMeasureFld" attribute
     */
    public void setIMeasureFld(long iMeasureFld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEASUREFLD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMEASUREFLD$16);
            }
            target.setLongValue(iMeasureFld);
        }
    }
    
    /**
     * Sets (as xml) the "iMeasureFld" attribute
     */
    public void xsetIMeasureFld(org.apache.xmlbeans.XmlUnsignedInt iMeasureFld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(IMEASUREFLD$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(IMEASUREFLD$16);
            }
            target.set(iMeasureFld);
        }
    }
    
    /**
     * Unsets the "iMeasureFld" attribute
     */
    public void unsetIMeasureFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMEASUREFLD$16);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$18);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$18) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$18);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$18);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$20);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$20) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$20);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DESCRIPTION$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DESCRIPTION$20);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$20);
        }
    }
    
    /**
     * Gets the "stringValue1" attribute
     */
    public java.lang.String getStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRINGVALUE1$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue1" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRINGVALUE1$22);
            return target;
        }
    }
    
    /**
     * True if has "stringValue1" attribute
     */
    public boolean isSetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRINGVALUE1$22) != null;
        }
    }
    
    /**
     * Sets the "stringValue1" attribute
     */
    public void setStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRINGVALUE1$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRINGVALUE1$22);
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue1" attribute
     */
    public void xsetStringValue1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRINGVALUE1$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STRINGVALUE1$22);
            }
            target.set(stringValue1);
        }
    }
    
    /**
     * Unsets the "stringValue1" attribute
     */
    public void unsetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRINGVALUE1$22);
        }
    }
    
    /**
     * Gets the "stringValue2" attribute
     */
    public java.lang.String getStringValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRINGVALUE2$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue2" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetStringValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRINGVALUE2$24);
            return target;
        }
    }
    
    /**
     * True if has "stringValue2" attribute
     */
    public boolean isSetStringValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRINGVALUE2$24) != null;
        }
    }
    
    /**
     * Sets the "stringValue2" attribute
     */
    public void setStringValue2(java.lang.String stringValue2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRINGVALUE2$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRINGVALUE2$24);
            }
            target.setStringValue(stringValue2);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue2" attribute
     */
    public void xsetStringValue2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring stringValue2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRINGVALUE2$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STRINGVALUE2$24);
            }
            target.set(stringValue2);
        }
    }
    
    /**
     * Unsets the "stringValue2" attribute
     */
    public void unsetStringValue2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRINGVALUE2$24);
        }
    }
}
