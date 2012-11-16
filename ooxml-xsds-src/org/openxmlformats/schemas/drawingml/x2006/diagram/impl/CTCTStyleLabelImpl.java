/*
 * XML Type:  CT_CTStyleLabel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_CTStyleLabel(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTCTStyleLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel
{
    
    public CTCTStyleLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILLCLRLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "fillClrLst");
    private static final javax.xml.namespace.QName LINCLRLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "linClrLst");
    private static final javax.xml.namespace.QName EFFECTCLRLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "effectClrLst");
    private static final javax.xml.namespace.QName TXLINCLRLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "txLinClrLst");
    private static final javax.xml.namespace.QName TXFILLCLRLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "txFillClrLst");
    private static final javax.xml.namespace.QName TXEFFECTCLRLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "txEffectClrLst");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName NAME$14 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "fillClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(FILLCLRLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillClrLst" element
     */
    public boolean isSetFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLCLRLST$0) != 0;
        }
    }
    
    /**
     * Sets the "fillClrLst" element
     */
    public void setFillClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors fillClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(FILLCLRLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(FILLCLRLST$0);
            }
            target.set(fillClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "fillClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(FILLCLRLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fillClrLst" element
     */
    public void unsetFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLCLRLST$0, 0);
        }
    }
    
    /**
     * Gets the "linClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(LINCLRLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linClrLst" element
     */
    public boolean isSetLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINCLRLST$2) != 0;
        }
    }
    
    /**
     * Sets the "linClrLst" element
     */
    public void setLinClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors linClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(LINCLRLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(LINCLRLST$2);
            }
            target.set(linClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "linClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(LINCLRLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "linClrLst" element
     */
    public void unsetLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINCLRLST$2, 0);
        }
    }
    
    /**
     * Gets the "effectClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(EFFECTCLRLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectClrLst" element
     */
    public boolean isSetEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTCLRLST$4) != 0;
        }
    }
    
    /**
     * Sets the "effectClrLst" element
     */
    public void setEffectClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors effectClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(EFFECTCLRLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(EFFECTCLRLST$4);
            }
            target.set(effectClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "effectClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(EFFECTCLRLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "effectClrLst" element
     */
    public void unsetEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTCLRLST$4, 0);
        }
    }
    
    /**
     * Gets the "txLinClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getTxLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXLINCLRLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txLinClrLst" element
     */
    public boolean isSetTxLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXLINCLRLST$6) != 0;
        }
    }
    
    /**
     * Sets the "txLinClrLst" element
     */
    public void setTxLinClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors txLinClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXLINCLRLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXLINCLRLST$6);
            }
            target.set(txLinClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "txLinClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewTxLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXLINCLRLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "txLinClrLst" element
     */
    public void unsetTxLinClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXLINCLRLST$6, 0);
        }
    }
    
    /**
     * Gets the "txFillClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getTxFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXFILLCLRLST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txFillClrLst" element
     */
    public boolean isSetTxFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXFILLCLRLST$8) != 0;
        }
    }
    
    /**
     * Sets the "txFillClrLst" element
     */
    public void setTxFillClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors txFillClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXFILLCLRLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXFILLCLRLST$8);
            }
            target.set(txFillClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "txFillClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewTxFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXFILLCLRLST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "txFillClrLst" element
     */
    public void unsetTxFillClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXFILLCLRLST$8, 0);
        }
    }
    
    /**
     * Gets the "txEffectClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors getTxEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXEFFECTCLRLST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txEffectClrLst" element
     */
    public boolean isSetTxEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXEFFECTCLRLST$10) != 0;
        }
    }
    
    /**
     * Sets the "txEffectClrLst" element
     */
    public void setTxEffectClrLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors txEffectClrLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().find_element_user(TXEFFECTCLRLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXEFFECTCLRLST$10);
            }
            target.set(txEffectClrLst);
        }
    }
    
    /**
     * Appends and returns a new empty "txEffectClrLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors addNewTxEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColors)get_store().add_element_user(TXEFFECTCLRLST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "txEffectClrLst" element
     */
    public void unsetTxEffectClrLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXEFFECTCLRLST$10, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$14);
            }
            target.set(name);
        }
    }
}
