/*
 * XML Type:  CT_Trendline
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_Trendline(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTTrendlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline
{
    
    public CTTrendlineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "name");
    private static final javax.xml.namespace.QName SPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TRENDLINETYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "trendlineType");
    private static final javax.xml.namespace.QName ORDER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "order");
    private static final javax.xml.namespace.QName PERIOD$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "period");
    private static final javax.xml.namespace.QName FORWARD$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "forward");
    private static final javax.xml.namespace.QName BACKWARD$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "backward");
    private static final javax.xml.namespace.QName INTERCEPT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "intercept");
    private static final javax.xml.namespace.QName DISPRSQR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispRSqr");
    private static final javax.xml.namespace.QName DISPEQ$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispEq");
    private static final javax.xml.namespace.QName TRENDLINELBL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "trendlineLbl");
    private static final javax.xml.namespace.QName EXTLST$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$2) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$2, 0);
        }
    }
    
    /**
     * Gets the "trendlineType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType getTrendlineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType)get_store().find_element_user(TRENDLINETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "trendlineType" element
     */
    public void setTrendlineType(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType trendlineType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType)get_store().find_element_user(TRENDLINETYPE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType)get_store().add_element_user(TRENDLINETYPE$4);
            }
            target.set(trendlineType);
        }
    }
    
    /**
     * Appends and returns a new empty "trendlineType" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType addNewTrendlineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineType)get_store().add_element_user(TRENDLINETYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "order" element
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$6) != 0;
        }
    }
    
    /**
     * Sets the "order" element
     */
    public void setOrder(org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder)get_store().find_element_user(ORDER$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder)get_store().add_element_user(ORDER$6);
            }
            target.set(order);
        }
    }
    
    /**
     * Appends and returns a new empty "order" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTOrder)get_store().add_element_user(ORDER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "order" element
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$6, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod)get_store().find_element_user(PERIOD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$8) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod)get_store().find_element_user(PERIOD$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod)get_store().add_element_user(PERIOD$8);
            }
            target.set(period);
        }
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPeriod)get_store().add_element_user(PERIOD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$8, 0);
        }
    }
    
    /**
     * Gets the "forward" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(FORWARD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "forward" element
     */
    public boolean isSetForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARD$10) != 0;
        }
    }
    
    /**
     * Sets the "forward" element
     */
    public void setForward(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble forward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(FORWARD$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(FORWARD$10);
            }
            target.set(forward);
        }
    }
    
    /**
     * Appends and returns a new empty "forward" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(FORWARD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "forward" element
     */
    public void unsetForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARD$10, 0);
        }
    }
    
    /**
     * Gets the "backward" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getBackward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(BACKWARD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "backward" element
     */
    public boolean isSetBackward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKWARD$12) != 0;
        }
    }
    
    /**
     * Sets the "backward" element
     */
    public void setBackward(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble backward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(BACKWARD$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(BACKWARD$12);
            }
            target.set(backward);
        }
    }
    
    /**
     * Appends and returns a new empty "backward" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewBackward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(BACKWARD$12);
            return target;
        }
    }
    
    /**
     * Unsets the "backward" element
     */
    public void unsetBackward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKWARD$12, 0);
        }
    }
    
    /**
     * Gets the "intercept" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble getIntercept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(INTERCEPT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "intercept" element
     */
    public boolean isSetIntercept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERCEPT$14) != 0;
        }
    }
    
    /**
     * Sets the "intercept" element
     */
    public void setIntercept(org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble intercept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().find_element_user(INTERCEPT$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(INTERCEPT$14);
            }
            target.set(intercept);
        }
    }
    
    /**
     * Appends and returns a new empty "intercept" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble addNewIntercept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble)get_store().add_element_user(INTERCEPT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "intercept" element
     */
    public void unsetIntercept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERCEPT$14, 0);
        }
    }
    
    /**
     * Gets the "dispRSqr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDispRSqr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DISPRSQR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispRSqr" element
     */
    public boolean isSetDispRSqr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPRSQR$16) != 0;
        }
    }
    
    /**
     * Sets the "dispRSqr" element
     */
    public void setDispRSqr(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean dispRSqr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DISPRSQR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DISPRSQR$16);
            }
            target.set(dispRSqr);
        }
    }
    
    /**
     * Appends and returns a new empty "dispRSqr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDispRSqr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DISPRSQR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "dispRSqr" element
     */
    public void unsetDispRSqr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPRSQR$16, 0);
        }
    }
    
    /**
     * Gets the "dispEq" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getDispEq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DISPEQ$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispEq" element
     */
    public boolean isSetDispEq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPEQ$18) != 0;
        }
    }
    
    /**
     * Sets the "dispEq" element
     */
    public void setDispEq(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean dispEq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(DISPEQ$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DISPEQ$18);
            }
            target.set(dispEq);
        }
    }
    
    /**
     * Appends and returns a new empty "dispEq" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewDispEq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(DISPEQ$18);
            return target;
        }
    }
    
    /**
     * Unsets the "dispEq" element
     */
    public void unsetDispEq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPEQ$18, 0);
        }
    }
    
    /**
     * Gets the "trendlineLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl getTrendlineLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl)get_store().find_element_user(TRENDLINELBL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trendlineLbl" element
     */
    public boolean isSetTrendlineLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRENDLINELBL$20) != 0;
        }
    }
    
    /**
     * Sets the "trendlineLbl" element
     */
    public void setTrendlineLbl(org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl trendlineLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl)get_store().find_element_user(TRENDLINELBL$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl)get_store().add_element_user(TRENDLINELBL$20);
            }
            target.set(trendlineLbl);
        }
    }
    
    /**
     * Appends and returns a new empty "trendlineLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl addNewTrendlineLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendlineLbl)get_store().add_element_user(TRENDLINELBL$20);
            return target;
        }
    }
    
    /**
     * Unsets the "trendlineLbl" element
     */
    public void unsetTrendlineLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRENDLINELBL$20, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$22, 0);
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
            return get_store().count_elements(EXTLST$22) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$22, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$22);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$22);
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
            get_store().remove_element(EXTLST$22, 0);
        }
    }
}
