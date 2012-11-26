/*
 * XML Type:  CT_ColorMappingOverride
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ColorMappingOverride(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorMappingOverrideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride
{
    
    public CTColorMappingOverrideImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MASTERCLRMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "masterClrMapping");
    private static final javax.xml.namespace.QName OVERRIDECLRMAPPING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "overrideClrMapping");
    
    
    /**
     * Gets the "masterClrMapping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement getMasterClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().find_element_user(MASTERCLRMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "masterClrMapping" element
     */
    public boolean isSetMasterClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MASTERCLRMAPPING$0) != 0;
        }
    }
    
    /**
     * Sets the "masterClrMapping" element
     */
    public void setMasterClrMapping(org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement masterClrMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().find_element_user(MASTERCLRMAPPING$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().add_element_user(MASTERCLRMAPPING$0);
            }
            target.set(masterClrMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "masterClrMapping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement addNewMasterClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement)get_store().add_element_user(MASTERCLRMAPPING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "masterClrMapping" element
     */
    public void unsetMasterClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MASTERCLRMAPPING$0, 0);
        }
    }
    
    /**
     * Gets the "overrideClrMapping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getOverrideClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(OVERRIDECLRMAPPING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "overrideClrMapping" element
     */
    public boolean isSetOverrideClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDECLRMAPPING$2) != 0;
        }
    }
    
    /**
     * Sets the "overrideClrMapping" element
     */
    public void setOverrideClrMapping(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping overrideClrMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(OVERRIDECLRMAPPING$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(OVERRIDECLRMAPPING$2);
            }
            target.set(overrideClrMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "overrideClrMapping" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewOverrideClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(OVERRIDECLRMAPPING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "overrideClrMapping" element
     */
    public void unsetOverrideClrMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDECLRMAPPING$2, 0);
        }
    }
}
