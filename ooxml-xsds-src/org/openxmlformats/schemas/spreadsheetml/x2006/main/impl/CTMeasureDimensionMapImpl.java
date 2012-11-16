/*
 * XML Type:  CT_MeasureDimensionMap
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MeasureDimensionMap(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMeasureDimensionMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMap
{
    
    public CTMeasureDimensionMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREGROUP$0 = 
        new javax.xml.namespace.QName("", "measureGroup");
    private static final javax.xml.namespace.QName DIMENSION$2 = 
        new javax.xml.namespace.QName("", "dimension");
    
    
    /**
     * Gets the "measureGroup" attribute
     */
    public long getMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "measureGroup" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMeasureGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MEASUREGROUP$0);
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
            return get_store().find_attribute_user(MEASUREGROUP$0) != null;
        }
    }
    
    /**
     * Sets the "measureGroup" attribute
     */
    public void setMeasureGroup(long measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUREGROUP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUREGROUP$0);
            }
            target.setLongValue(measureGroup);
        }
    }
    
    /**
     * Sets (as xml) the "measureGroup" attribute
     */
    public void xsetMeasureGroup(org.apache.xmlbeans.XmlUnsignedInt measureGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MEASUREGROUP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MEASUREGROUP$0);
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
            get_store().remove_attribute(MEASUREGROUP$0);
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public long getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DIMENSION$2);
            return target;
        }
    }
    
    /**
     * True if has "dimension" attribute
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSION$2) != null;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    public void setDimension(long dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$2);
            }
            target.setLongValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlUnsignedInt dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(DIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(DIMENSION$2);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Unsets the "dimension" attribute
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSION$2);
        }
    }
}
