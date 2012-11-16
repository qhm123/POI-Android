/*
 * XML Type:  CT_AnimationDgmElement
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AnimationDgmElement(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAnimationDgmElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAnimationDgmElement
{
    
    public CTAnimationDgmElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName BLDSTEP$2 = 
        new javax.xml.namespace.QName("", "bldStep");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ID$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_default_attribute_value(ID$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.drawingml.x2006.main.STGuid id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "bldStep" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep.Enum getBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDSTEP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLDSTEP$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bldStep" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep xgetBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep)get_store().find_attribute_user(BLDSTEP$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep)get_default_attribute_value(BLDSTEP$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "bldStep" attribute
     */
    public boolean isSetBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLDSTEP$2) != null;
        }
    }
    
    /**
     * Sets the "bldStep" attribute
     */
    public void setBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep.Enum bldStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLDSTEP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLDSTEP$2);
            }
            target.setEnumValue(bldStep);
        }
    }
    
    /**
     * Sets (as xml) the "bldStep" attribute
     */
    public void xsetBldStep(org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep bldStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep)get_store().find_attribute_user(BLDSTEP$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STDgmBuildStep)get_store().add_attribute_user(BLDSTEP$2);
            }
            target.set(bldStep);
        }
    }
    
    /**
     * Unsets the "bldStep" attribute
     */
    public void unsetBldStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLDSTEP$2);
        }
    }
}
