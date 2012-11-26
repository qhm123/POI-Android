/*
 * XML Type:  CT_NonVisualDrawingProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualDrawingProps(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualDrawingPropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps
{
    
    public CTNonVisualDrawingPropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HLINKCLICK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkClick");
    private static final javax.xml.namespace.QName HLINKHOVER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkHover");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DESCR$10 = 
        new javax.xml.namespace.QName("", "descr");
    private static final javax.xml.namespace.QName HIDDEN$12 = 
        new javax.xml.namespace.QName("", "hidden");
    
    
    /**
     * Gets the "hlinkClick" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKCLICK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hlinkClick" element
     */
    public boolean isSetHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HLINKCLICK$0) != 0;
        }
    }
    
    /**
     * Sets the "hlinkClick" element
     */
    public void setHlinkClick(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkClick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKCLICK$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKCLICK$0);
            }
            target.set(hlinkClick);
        }
    }
    
    /**
     * Appends and returns a new empty "hlinkClick" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKCLICK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "hlinkClick" element
     */
    public void unsetHlinkClick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HLINKCLICK$0, 0);
        }
    }
    
    /**
     * Gets the "hlinkHover" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink getHlinkHover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKHOVER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hlinkHover" element
     */
    public boolean isSetHlinkHover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HLINKHOVER$2) != 0;
        }
    }
    
    /**
     * Sets the "hlinkHover" element
     */
    public void setHlinkHover(org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink hlinkHover)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().find_element_user(HLINKHOVER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKHOVER$2);
            }
            target.set(hlinkHover);
        }
    }
    
    /**
     * Appends and returns a new empty "hlinkHover" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink addNewHlinkHover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink)get_store().add_element_user(HLINKHOVER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "hlinkHover" element
     */
    public void unsetHlinkHover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HLINKHOVER$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STDrawingElementId)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "descr" attribute
     */
    public java.lang.String getDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DESCR$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descr" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(DESCR$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "descr" attribute
     */
    public boolean isSetDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCR$10) != null;
        }
    }
    
    /**
     * Sets the "descr" attribute
     */
    public void setDescr(java.lang.String descr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCR$10);
            }
            target.setStringValue(descr);
        }
    }
    
    /**
     * Sets (as xml) the "descr" attribute
     */
    public void xsetDescr(org.apache.xmlbeans.XmlString descr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCR$10);
            }
            target.set(descr);
        }
    }
    
    /**
     * Unsets the "descr" attribute
     */
    public void unsetDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCR$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$12);
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
            return get_store().find_attribute_user(HIDDEN$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$12);
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
            get_store().remove_attribute(HIDDEN$12);
        }
    }
}
