/*
 * XML Type:  CT_StyleMatrix
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_StyleMatrix(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTStyleMatrixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix
{
    
    public CTStyleMatrixImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILLSTYLELST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillStyleLst");
    private static final javax.xml.namespace.QName LNSTYLELST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnStyleLst");
    private static final javax.xml.namespace.QName EFFECTSTYLELST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectStyleLst");
    private static final javax.xml.namespace.QName BGFILLSTYLELST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bgFillStyleLst");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "fillStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList getFillStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList)get_store().find_element_user(FILLSTYLELST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fillStyleLst" element
     */
    public void setFillStyleLst(org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList fillStyleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList)get_store().find_element_user(FILLSTYLELST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList)get_store().add_element_user(FILLSTYLELST$0);
            }
            target.set(fillStyleLst);
        }
    }
    
    /**
     * Appends and returns a new empty "fillStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList addNewFillStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList)get_store().add_element_user(FILLSTYLELST$0);
            return target;
        }
    }
    
    /**
     * Gets the "lnStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList getLnStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList)get_store().find_element_user(LNSTYLELST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lnStyleLst" element
     */
    public void setLnStyleLst(org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList lnStyleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList)get_store().find_element_user(LNSTYLELST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList)get_store().add_element_user(LNSTYLELST$2);
            }
            target.set(lnStyleLst);
        }
    }
    
    /**
     * Appends and returns a new empty "lnStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList addNewLnStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList)get_store().add_element_user(LNSTYLELST$2);
            return target;
        }
    }
    
    /**
     * Gets the "effectStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList getEffectStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList)get_store().find_element_user(EFFECTSTYLELST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "effectStyleLst" element
     */
    public void setEffectStyleLst(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList effectStyleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList)get_store().find_element_user(EFFECTSTYLELST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList)get_store().add_element_user(EFFECTSTYLELST$4);
            }
            target.set(effectStyleLst);
        }
    }
    
    /**
     * Appends and returns a new empty "effectStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList addNewEffectStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList)get_store().add_element_user(EFFECTSTYLELST$4);
            return target;
        }
    }
    
    /**
     * Gets the "bgFillStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList getBgFillStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList)get_store().find_element_user(BGFILLSTYLELST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bgFillStyleLst" element
     */
    public void setBgFillStyleLst(org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList bgFillStyleLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList)get_store().find_element_user(BGFILLSTYLELST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList)get_store().add_element_user(BGFILLSTYLELST$6);
            }
            target.set(bgFillStyleLst);
        }
    }
    
    /**
     * Appends and returns a new empty "bgFillStyleLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList addNewBgFillStyleLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList)get_store().add_element_user(BGFILLSTYLELST$6);
            return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$8);
            }
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
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$8);
            }
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
            return get_store().find_attribute_user(NAME$8) != null;
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
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$8);
        }
    }
}
