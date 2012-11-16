/*
 * XML Type:  CT_WholeE2oFormatting
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_WholeE2oFormatting(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTWholeE2OFormattingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting
{
    
    public CTWholeE2OFormattingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
    private static final javax.xml.namespace.QName EFFECTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
    private static final javax.xml.namespace.QName EFFECTDAG$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
    
    
    /**
     * Gets the "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ln" element
     */
    public boolean isSetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LN$0) != 0;
        }
    }
    
    /**
     * Sets the "ln" element
     */
    public void setLn(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            }
            target.set(ln);
        }
    }
    
    /**
     * Appends and returns a new empty "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ln" element
     */
    public void unsetLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LN$0, 0);
        }
    }
    
    /**
     * Gets the "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList getEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectLst" element
     */
    public boolean isSetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "effectLst" element
     */
    public void setEffectLst(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList effectLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().find_element_user(EFFECTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$2);
            }
            target.set(effectLst);
        }
    }
    
    /**
     * Appends and returns a new empty "effectLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList addNewEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList)get_store().add_element_user(EFFECTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "effectLst" element
     */
    public void unsetEffectLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTLST$2, 0);
        }
    }
    
    /**
     * Gets the "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectDag" element
     */
    public boolean isSetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTDAG$4) != 0;
        }
    }
    
    /**
     * Sets the "effectDag" element
     */
    public void setEffectDag(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer effectDag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(EFFECTDAG$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$4);
            }
            target.set(effectDag);
        }
    }
    
    /**
     * Appends and returns a new empty "effectDag" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(EFFECTDAG$4);
            return target;
        }
    }
    
    /**
     * Unsets the "effectDag" element
     */
    public void unsetEffectDag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTDAG$4, 0);
        }
    }
}
