/*
 * XML Type:  CT_GradientFill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_GradientFill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGradientFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill
{
    
    public CTGradientFillImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "stop");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DEGREE$4 = 
        new javax.xml.namespace.QName("", "degree");
    private static final javax.xml.namespace.QName LEFT$6 = 
        new javax.xml.namespace.QName("", "left");
    private static final javax.xml.namespace.QName RIGHT$8 = 
        new javax.xml.namespace.QName("", "right");
    private static final javax.xml.namespace.QName TOP$10 = 
        new javax.xml.namespace.QName("", "top");
    private static final javax.xml.namespace.QName BOTTOM$12 = 
        new javax.xml.namespace.QName("", "bottom");
    
    
    /**
     * Gets a List of "stop" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop> getStopList()
    {
        final class StopList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop get(int i)
                { return CTGradientFillImpl.this.getStopArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop old = CTGradientFillImpl.this.getStopArray(i);
                CTGradientFillImpl.this.setStopArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop o)
                { CTGradientFillImpl.this.insertNewStop(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop old = CTGradientFillImpl.this.getStopArray(i);
                CTGradientFillImpl.this.removeStop(i);
                return old;
            }
            
            public int size()
                { return CTGradientFillImpl.this.sizeOfStopArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StopList();
        }
    }
    
    /**
     * Gets array of all "stop" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop[] getStopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STOP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stop" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop getStopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop)get_store().find_element_user(STOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stop" element
     */
    public int sizeOfStopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOP$0);
        }
    }
    
    /**
     * Sets array of all "stop" element
     */
    public void setStopArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop[] stopArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stopArray, STOP$0);
        }
    }
    
    /**
     * Sets ith "stop" element
     */
    public void setStopArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop stop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop)get_store().find_element_user(STOP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stop);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stop" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop insertNewStop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop)get_store().insert_element_user(STOP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stop" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop addNewStop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientStop)get_store().add_element_user(STOP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "stop" element
     */
    public void removeStop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOP$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType)get_default_attribute_value(TYPE$2);
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
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STGradientType)get_store().add_attribute_user(TYPE$2);
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
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "degree" attribute
     */
    public double getDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEGREE$4);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "degree" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEGREE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(DEGREE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "degree" attribute
     */
    public boolean isSetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEGREE$4) != null;
        }
    }
    
    /**
     * Sets the "degree" attribute
     */
    public void setDegree(double degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEGREE$4);
            }
            target.setDoubleValue(degree);
        }
    }
    
    /**
     * Sets (as xml) the "degree" attribute
     */
    public void xsetDegree(org.apache.xmlbeans.XmlDouble degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DEGREE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DEGREE$4);
            }
            target.set(degree);
        }
    }
    
    /**
     * Unsets the "degree" attribute
     */
    public void unsetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEGREE$4);
        }
    }
    
    /**
     * Gets the "left" attribute
     */
    public double getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LEFT$6);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "left" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LEFT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(LEFT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "left" attribute
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEFT$6) != null;
        }
    }
    
    /**
     * Sets the "left" attribute
     */
    public void setLeft(double left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFT$6);
            }
            target.setDoubleValue(left);
        }
    }
    
    /**
     * Sets (as xml) the "left" attribute
     */
    public void xsetLeft(org.apache.xmlbeans.XmlDouble left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LEFT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LEFT$6);
            }
            target.set(left);
        }
    }
    
    /**
     * Unsets the "left" attribute
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEFT$6);
        }
    }
    
    /**
     * Gets the "right" attribute
     */
    public double getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RIGHT$8);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "right" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(RIGHT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "right" attribute
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RIGHT$8) != null;
        }
    }
    
    /**
     * Sets the "right" attribute
     */
    public void setRight(double right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHT$8);
            }
            target.setDoubleValue(right);
        }
    }
    
    /**
     * Sets (as xml) the "right" attribute
     */
    public void xsetRight(org.apache.xmlbeans.XmlDouble right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RIGHT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RIGHT$8);
            }
            target.set(right);
        }
    }
    
    /**
     * Unsets the "right" attribute
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RIGHT$8);
        }
    }
    
    /**
     * Gets the "top" attribute
     */
    public double getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOP$10);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "top" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(TOP$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "top" attribute
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOP$10) != null;
        }
    }
    
    /**
     * Sets the "top" attribute
     */
    public void setTop(double top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOP$10);
            }
            target.setDoubleValue(top);
        }
    }
    
    /**
     * Sets (as xml) the "top" attribute
     */
    public void xsetTop(org.apache.xmlbeans.XmlDouble top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOP$10);
            }
            target.set(top);
        }
    }
    
    /**
     * Unsets the "top" attribute
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOP$10);
        }
    }
    
    /**
     * Gets the "bottom" attribute
     */
    public double getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BOTTOM$12);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "bottom" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(BOTTOM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" attribute
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOTTOM$12) != null;
        }
    }
    
    /**
     * Sets the "bottom" attribute
     */
    public void setBottom(double bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOTTOM$12);
            }
            target.setDoubleValue(bottom);
        }
    }
    
    /**
     * Sets (as xml) the "bottom" attribute
     */
    public void xsetBottom(org.apache.xmlbeans.XmlDouble bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BOTTOM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(BOTTOM$12);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Unsets the "bottom" attribute
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOTTOM$12);
        }
    }
}
