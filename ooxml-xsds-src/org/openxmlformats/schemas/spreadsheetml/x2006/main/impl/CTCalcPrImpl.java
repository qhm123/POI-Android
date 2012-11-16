/*
 * XML Type:  CT_CalcPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CalcPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalcPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr
{
    
    public CTCalcPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCID$0 = 
        new javax.xml.namespace.QName("", "calcId");
    private static final javax.xml.namespace.QName CALCMODE$2 = 
        new javax.xml.namespace.QName("", "calcMode");
    private static final javax.xml.namespace.QName FULLCALCONLOAD$4 = 
        new javax.xml.namespace.QName("", "fullCalcOnLoad");
    private static final javax.xml.namespace.QName REFMODE$6 = 
        new javax.xml.namespace.QName("", "refMode");
    private static final javax.xml.namespace.QName ITERATE$8 = 
        new javax.xml.namespace.QName("", "iterate");
    private static final javax.xml.namespace.QName ITERATECOUNT$10 = 
        new javax.xml.namespace.QName("", "iterateCount");
    private static final javax.xml.namespace.QName ITERATEDELTA$12 = 
        new javax.xml.namespace.QName("", "iterateDelta");
    private static final javax.xml.namespace.QName FULLPRECISION$14 = 
        new javax.xml.namespace.QName("", "fullPrecision");
    private static final javax.xml.namespace.QName CALCCOMPLETED$16 = 
        new javax.xml.namespace.QName("", "calcCompleted");
    private static final javax.xml.namespace.QName CALCONSAVE$18 = 
        new javax.xml.namespace.QName("", "calcOnSave");
    private static final javax.xml.namespace.QName CONCURRENTCALC$20 = 
        new javax.xml.namespace.QName("", "concurrentCalc");
    private static final javax.xml.namespace.QName CONCURRENTMANUALCOUNT$22 = 
        new javax.xml.namespace.QName("", "concurrentManualCount");
    private static final javax.xml.namespace.QName FORCEFULLCALC$24 = 
        new javax.xml.namespace.QName("", "forceFullCalc");
    
    
    /**
     * Gets the "calcId" attribute
     */
    public long getCalcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "calcId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCalcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CALCID$0);
            return target;
        }
    }
    
    /**
     * True if has "calcId" attribute
     */
    public boolean isSetCalcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCID$0) != null;
        }
    }
    
    /**
     * Sets the "calcId" attribute
     */
    public void setCalcId(long calcId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCID$0);
            }
            target.setLongValue(calcId);
        }
    }
    
    /**
     * Sets (as xml) the "calcId" attribute
     */
    public void xsetCalcId(org.apache.xmlbeans.XmlUnsignedInt calcId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CALCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CALCID$0);
            }
            target.set(calcId);
        }
    }
    
    /**
     * Unsets the "calcId" attribute
     */
    public void unsetCalcId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCID$0);
        }
    }
    
    /**
     * Gets the "calcMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode.Enum getCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALCMODE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "calcMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode xgetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode)get_store().find_attribute_user(CALCMODE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode)get_default_attribute_value(CALCMODE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "calcMode" attribute
     */
    public boolean isSetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCMODE$2) != null;
        }
    }
    
    /**
     * Sets the "calcMode" attribute
     */
    public void setCalcMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode.Enum calcMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCMODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCMODE$2);
            }
            target.setEnumValue(calcMode);
        }
    }
    
    /**
     * Sets (as xml) the "calcMode" attribute
     */
    public void xsetCalcMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode calcMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode)get_store().find_attribute_user(CALCMODE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode)get_store().add_attribute_user(CALCMODE$2);
            }
            target.set(calcMode);
        }
    }
    
    /**
     * Unsets the "calcMode" attribute
     */
    public void unsetCalcMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCMODE$2);
        }
    }
    
    /**
     * Gets the "fullCalcOnLoad" attribute
     */
    public boolean getFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLCALCONLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLCALCONLOAD$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullCalcOnLoad" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLCALCONLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FULLCALCONLOAD$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "fullCalcOnLoad" attribute
     */
    public boolean isSetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLCALCONLOAD$4) != null;
        }
    }
    
    /**
     * Sets the "fullCalcOnLoad" attribute
     */
    public void setFullCalcOnLoad(boolean fullCalcOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLCALCONLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLCALCONLOAD$4);
            }
            target.setBooleanValue(fullCalcOnLoad);
        }
    }
    
    /**
     * Sets (as xml) the "fullCalcOnLoad" attribute
     */
    public void xsetFullCalcOnLoad(org.apache.xmlbeans.XmlBoolean fullCalcOnLoad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLCALCONLOAD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLCALCONLOAD$4);
            }
            target.set(fullCalcOnLoad);
        }
    }
    
    /**
     * Unsets the "fullCalcOnLoad" attribute
     */
    public void unsetFullCalcOnLoad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLCALCONLOAD$4);
        }
    }
    
    /**
     * Gets the "refMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.Enum getRefMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFMODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFMODE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "refMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode xgetRefMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode)get_store().find_attribute_user(REFMODE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode)get_default_attribute_value(REFMODE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "refMode" attribute
     */
    public boolean isSetRefMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFMODE$6) != null;
        }
    }
    
    /**
     * Sets the "refMode" attribute
     */
    public void setRefMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.Enum refMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFMODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFMODE$6);
            }
            target.setEnumValue(refMode);
        }
    }
    
    /**
     * Sets (as xml) the "refMode" attribute
     */
    public void xsetRefMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode refMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode)get_store().find_attribute_user(REFMODE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode)get_store().add_attribute_user(REFMODE$6);
            }
            target.set(refMode);
        }
    }
    
    /**
     * Unsets the "refMode" attribute
     */
    public void unsetRefMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFMODE$6);
        }
    }
    
    /**
     * Gets the "iterate" attribute
     */
    public boolean getIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITERATE$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "iterate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITERATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ITERATE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "iterate" attribute
     */
    public boolean isSetIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITERATE$8) != null;
        }
    }
    
    /**
     * Sets the "iterate" attribute
     */
    public void setIterate(boolean iterate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITERATE$8);
            }
            target.setBooleanValue(iterate);
        }
    }
    
    /**
     * Sets (as xml) the "iterate" attribute
     */
    public void xsetIterate(org.apache.xmlbeans.XmlBoolean iterate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITERATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ITERATE$8);
            }
            target.set(iterate);
        }
    }
    
    /**
     * Unsets the "iterate" attribute
     */
    public void unsetIterate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITERATE$8);
        }
    }
    
    /**
     * Gets the "iterateCount" attribute
     */
    public long getIterateCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITERATECOUNT$10);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "iterateCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetIterateCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITERATECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(ITERATECOUNT$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "iterateCount" attribute
     */
    public boolean isSetIterateCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITERATECOUNT$10) != null;
        }
    }
    
    /**
     * Sets the "iterateCount" attribute
     */
    public void setIterateCount(long iterateCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITERATECOUNT$10);
            }
            target.setLongValue(iterateCount);
        }
    }
    
    /**
     * Sets (as xml) the "iterateCount" attribute
     */
    public void xsetIterateCount(org.apache.xmlbeans.XmlUnsignedInt iterateCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ITERATECOUNT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ITERATECOUNT$10);
            }
            target.set(iterateCount);
        }
    }
    
    /**
     * Unsets the "iterateCount" attribute
     */
    public void unsetIterateCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITERATECOUNT$10);
        }
    }
    
    /**
     * Gets the "iterateDelta" attribute
     */
    public double getIterateDelta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATEDELTA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITERATEDELTA$12);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "iterateDelta" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetIterateDelta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ITERATEDELTA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(ITERATEDELTA$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "iterateDelta" attribute
     */
    public boolean isSetIterateDelta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITERATEDELTA$12) != null;
        }
    }
    
    /**
     * Sets the "iterateDelta" attribute
     */
    public void setIterateDelta(double iterateDelta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITERATEDELTA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITERATEDELTA$12);
            }
            target.setDoubleValue(iterateDelta);
        }
    }
    
    /**
     * Sets (as xml) the "iterateDelta" attribute
     */
    public void xsetIterateDelta(org.apache.xmlbeans.XmlDouble iterateDelta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ITERATEDELTA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ITERATEDELTA$12);
            }
            target.set(iterateDelta);
        }
    }
    
    /**
     * Unsets the "iterateDelta" attribute
     */
    public void unsetIterateDelta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITERATEDELTA$12);
        }
    }
    
    /**
     * Gets the "fullPrecision" attribute
     */
    public boolean getFullPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPRECISION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLPRECISION$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullPrecision" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLPRECISION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FULLPRECISION$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "fullPrecision" attribute
     */
    public boolean isSetFullPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLPRECISION$14) != null;
        }
    }
    
    /**
     * Sets the "fullPrecision" attribute
     */
    public void setFullPrecision(boolean fullPrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPRECISION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLPRECISION$14);
            }
            target.setBooleanValue(fullPrecision);
        }
    }
    
    /**
     * Sets (as xml) the "fullPrecision" attribute
     */
    public void xsetFullPrecision(org.apache.xmlbeans.XmlBoolean fullPrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLPRECISION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLPRECISION$14);
            }
            target.set(fullPrecision);
        }
    }
    
    /**
     * Unsets the "fullPrecision" attribute
     */
    public void unsetFullPrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLPRECISION$14);
        }
    }
    
    /**
     * Gets the "calcCompleted" attribute
     */
    public boolean getCalcCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCCOMPLETED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALCCOMPLETED$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "calcCompleted" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCalcCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCCOMPLETED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CALCCOMPLETED$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "calcCompleted" attribute
     */
    public boolean isSetCalcCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCCOMPLETED$16) != null;
        }
    }
    
    /**
     * Sets the "calcCompleted" attribute
     */
    public void setCalcCompleted(boolean calcCompleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCCOMPLETED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCCOMPLETED$16);
            }
            target.setBooleanValue(calcCompleted);
        }
    }
    
    /**
     * Sets (as xml) the "calcCompleted" attribute
     */
    public void xsetCalcCompleted(org.apache.xmlbeans.XmlBoolean calcCompleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCCOMPLETED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CALCCOMPLETED$16);
            }
            target.set(calcCompleted);
        }
    }
    
    /**
     * Unsets the "calcCompleted" attribute
     */
    public void unsetCalcCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCCOMPLETED$16);
        }
    }
    
    /**
     * Gets the "calcOnSave" attribute
     */
    public boolean getCalcOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCONSAVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALCONSAVE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "calcOnSave" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCalcOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCONSAVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CALCONSAVE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "calcOnSave" attribute
     */
    public boolean isSetCalcOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCONSAVE$18) != null;
        }
    }
    
    /**
     * Sets the "calcOnSave" attribute
     */
    public void setCalcOnSave(boolean calcOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCONSAVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCONSAVE$18);
            }
            target.setBooleanValue(calcOnSave);
        }
    }
    
    /**
     * Sets (as xml) the "calcOnSave" attribute
     */
    public void xsetCalcOnSave(org.apache.xmlbeans.XmlBoolean calcOnSave)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCONSAVE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CALCONSAVE$18);
            }
            target.set(calcOnSave);
        }
    }
    
    /**
     * Unsets the "calcOnSave" attribute
     */
    public void unsetCalcOnSave()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCONSAVE$18);
        }
    }
    
    /**
     * Gets the "concurrentCalc" attribute
     */
    public boolean getConcurrentCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTCALC$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONCURRENTCALC$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "concurrentCalc" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetConcurrentCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONCURRENTCALC$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CONCURRENTCALC$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "concurrentCalc" attribute
     */
    public boolean isSetConcurrentCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCURRENTCALC$20) != null;
        }
    }
    
    /**
     * Sets the "concurrentCalc" attribute
     */
    public void setConcurrentCalc(boolean concurrentCalc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTCALC$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCURRENTCALC$20);
            }
            target.setBooleanValue(concurrentCalc);
        }
    }
    
    /**
     * Sets (as xml) the "concurrentCalc" attribute
     */
    public void xsetConcurrentCalc(org.apache.xmlbeans.XmlBoolean concurrentCalc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CONCURRENTCALC$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CONCURRENTCALC$20);
            }
            target.set(concurrentCalc);
        }
    }
    
    /**
     * Unsets the "concurrentCalc" attribute
     */
    public void unsetConcurrentCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCURRENTCALC$20);
        }
    }
    
    /**
     * Gets the "concurrentManualCount" attribute
     */
    public long getConcurrentManualCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "concurrentManualCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetConcurrentManualCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
            return target;
        }
    }
    
    /**
     * True if has "concurrentManualCount" attribute
     */
    public boolean isSetConcurrentManualCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22) != null;
        }
    }
    
    /**
     * Sets the "concurrentManualCount" attribute
     */
    public void setConcurrentManualCount(long concurrentManualCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCURRENTMANUALCOUNT$22);
            }
            target.setLongValue(concurrentManualCount);
        }
    }
    
    /**
     * Sets (as xml) the "concurrentManualCount" attribute
     */
    public void xsetConcurrentManualCount(org.apache.xmlbeans.XmlUnsignedInt concurrentManualCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONCURRENTMANUALCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CONCURRENTMANUALCOUNT$22);
            }
            target.set(concurrentManualCount);
        }
    }
    
    /**
     * Unsets the "concurrentManualCount" attribute
     */
    public void unsetConcurrentManualCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCURRENTMANUALCOUNT$22);
        }
    }
    
    /**
     * Gets the "forceFullCalc" attribute
     */
    public boolean getForceFullCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEFULLCALC$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "forceFullCalc" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetForceFullCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORCEFULLCALC$24);
            return target;
        }
    }
    
    /**
     * True if has "forceFullCalc" attribute
     */
    public boolean isSetForceFullCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORCEFULLCALC$24) != null;
        }
    }
    
    /**
     * Sets the "forceFullCalc" attribute
     */
    public void setForceFullCalc(boolean forceFullCalc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEFULLCALC$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORCEFULLCALC$24);
            }
            target.setBooleanValue(forceFullCalc);
        }
    }
    
    /**
     * Sets (as xml) the "forceFullCalc" attribute
     */
    public void xsetForceFullCalc(org.apache.xmlbeans.XmlBoolean forceFullCalc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORCEFULLCALC$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORCEFULLCALC$24);
            }
            target.set(forceFullCalc);
        }
    }
    
    /**
     * Unsets the "forceFullCalc" attribute
     */
    public void unsetForceFullCalc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORCEFULLCALC$24);
        }
    }
}
