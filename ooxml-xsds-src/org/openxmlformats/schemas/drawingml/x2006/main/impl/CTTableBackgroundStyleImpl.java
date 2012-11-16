/*
 * XML Type:  CT_TableBackgroundStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableBackgroundStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableBackgroundStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle
{
    
    public CTTableBackgroundStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fill");
    private static final javax.xml.namespace.QName FILLREF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRef");
    private static final javax.xml.namespace.QName EFFECT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effect");
    private static final javax.xml.namespace.QName EFFECTREF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectRef");
    
    
    /**
     * Gets the "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fill" element
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$0) != 0;
        }
    }
    
    /**
     * Sets the "fill" element
     */
    public void setFill(org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().add_element_user(FILL$0);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().add_element_user(FILL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fill" element
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$0, 0);
        }
    }
    
    /**
     * Gets the "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillRef" element
     */
    public boolean isSetFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLREF$2) != 0;
        }
    }
    
    /**
     * Sets the "fillRef" element
     */
    public void setFillRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference fillRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$2);
            }
            target.set(fillRef);
        }
    }
    
    /**
     * Appends and returns a new empty "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fillRef" element
     */
    public void unsetFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLREF$2, 0);
        }
    }
    
    /**
     * Gets the "effect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties getEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties)get_store().find_element_user(EFFECT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effect" element
     */
    public boolean isSetEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECT$4) != 0;
        }
    }
    
    /**
     * Sets the "effect" element
     */
    public void setEffect(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties effect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties)get_store().find_element_user(EFFECT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties)get_store().add_element_user(EFFECT$4);
            }
            target.set(effect);
        }
    }
    
    /**
     * Appends and returns a new empty "effect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties addNewEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectProperties)get_store().add_element_user(EFFECT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "effect" element
     */
    public void unsetEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECT$4, 0);
        }
    }
    
    /**
     * Gets the "effectRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(EFFECTREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectRef" element
     */
    public boolean isSetEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTREF$6) != 0;
        }
    }
    
    /**
     * Sets the "effectRef" element
     */
    public void setEffectRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference effectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(EFFECTREF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(EFFECTREF$6);
            }
            target.set(effectRef);
        }
    }
    
    /**
     * Appends and returns a new empty "effectRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(EFFECTREF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "effectRef" element
     */
    public void unsetEffectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTREF$6, 0);
        }
    }
}
