/*
 * XML Type:  CT_SampleData
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_SampleData(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTSampleDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTSampleData
{
    
    public CTSampleDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAMODEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "dataModel");
    private static final javax.xml.namespace.QName USEDEF$2 = 
        new javax.xml.namespace.QName("", "useDef");
    
    
    /**
     * Gets the "dataModel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel getDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().find_element_user(DATAMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataModel" element
     */
    public boolean isSetDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAMODEL$0) != 0;
        }
    }
    
    /**
     * Sets the "dataModel" element
     */
    public void setDataModel(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel dataModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().find_element_user(DATAMODEL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().add_element_user(DATAMODEL$0);
            }
            target.set(dataModel);
        }
    }
    
    /**
     * Appends and returns a new empty "dataModel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel addNewDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel)get_store().add_element_user(DATAMODEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dataModel" element
     */
    public void unsetDataModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAMODEL$0, 0);
        }
    }
    
    /**
     * Gets the "useDef" attribute
     */
    public boolean getUseDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDEF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEDEF$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useDef" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEDEF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEDEF$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "useDef" attribute
     */
    public boolean isSetUseDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEDEF$2) != null;
        }
    }
    
    /**
     * Sets the "useDef" attribute
     */
    public void setUseDef(boolean useDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDEF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDEF$2);
            }
            target.setBooleanValue(useDef);
        }
    }
    
    /**
     * Sets (as xml) the "useDef" attribute
     */
    public void xsetUseDef(org.apache.xmlbeans.XmlBoolean useDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEDEF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEDEF$2);
            }
            target.set(useDef);
        }
    }
    
    /**
     * Unsets the "useDef" attribute
     */
    public void unsetUseDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEDEF$2);
        }
    }
}
