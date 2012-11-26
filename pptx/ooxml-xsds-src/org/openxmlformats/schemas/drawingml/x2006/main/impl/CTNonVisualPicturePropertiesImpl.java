/*
 * XML Type:  CT_NonVisualPictureProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualPictureProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualPicturePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties
{
    
    public CTNonVisualPicturePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICLOCKS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "picLocks");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PREFERRELATIVERESIZE$4 = 
        new javax.xml.namespace.QName("", "preferRelativeResize");
    
    
    /**
     * Gets the "picLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking getPicLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking)get_store().find_element_user(PICLOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "picLocks" element
     */
    public boolean isSetPicLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICLOCKS$0) != 0;
        }
    }
    
    /**
     * Sets the "picLocks" element
     */
    public void setPicLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking picLocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking)get_store().find_element_user(PICLOCKS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking)get_store().add_element_user(PICLOCKS$0);
            }
            target.set(picLocks);
        }
    }
    
    /**
     * Appends and returns a new empty "picLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking addNewPicLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking)get_store().add_element_user(PICLOCKS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "picLocks" element
     */
    public void unsetPicLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICLOCKS$0, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
     * Gets the "preferRelativeResize" attribute
     */
    public boolean getPreferRelativeResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREFERRELATIVERESIZE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferRelativeResize" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreferRelativeResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PREFERRELATIVERESIZE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "preferRelativeResize" attribute
     */
    public boolean isSetPreferRelativeResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERRELATIVERESIZE$4) != null;
        }
    }
    
    /**
     * Sets the "preferRelativeResize" attribute
     */
    public void setPreferRelativeResize(boolean preferRelativeResize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERRELATIVERESIZE$4);
            }
            target.setBooleanValue(preferRelativeResize);
        }
    }
    
    /**
     * Sets (as xml) the "preferRelativeResize" attribute
     */
    public void xsetPreferRelativeResize(org.apache.xmlbeans.XmlBoolean preferRelativeResize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PREFERRELATIVERESIZE$4);
            }
            target.set(preferRelativeResize);
        }
    }
    
    /**
     * Unsets the "preferRelativeResize" attribute
     */
    public void unsetPreferRelativeResize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERRELATIVERESIZE$4);
        }
    }
}
