/*
 * XML Type:  CT_Pt
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Pt(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTPtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTPt
{
    
    public CTPtImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRSET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "prSet");
    private static final javax.xml.namespace.QName SPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "spPr");
    private static final javax.xml.namespace.QName T$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "t");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName MODELID$8 = 
        new javax.xml.namespace.QName("", "modelId");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName CXNID$12 = 
        new javax.xml.namespace.QName("", "cxnId");
    
    
    /**
     * Gets the "prSet" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet getPrSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet)get_store().find_element_user(PRSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prSet" element
     */
    public boolean isSetPrSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSET$0) != 0;
        }
    }
    
    /**
     * Sets the "prSet" element
     */
    public void setPrSet(org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet prSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet)get_store().find_element_user(PRSET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet)get_store().add_element_user(PRSET$0);
            }
            target.set(prSet);
        }
    }
    
    /**
     * Appends and returns a new empty "prSet" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet addNewPrSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTElemPropSet)get_store().add_element_user(PRSET$0);
            return target;
        }
    }
    
    /**
     * Unsets the "prSet" element
     */
    public void unsetPrSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSET$0, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$2) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$2, 0);
        }
    }
    
    /**
     * Gets the "t" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(T$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "t" element
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(T$4) != 0;
        }
    }
    
    /**
     * Sets the "t" element
     */
    public void setT(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(T$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(T$4);
            }
            target.set(t);
        }
    }
    
    /**
     * Appends and returns a new empty "t" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(T$4);
            return target;
        }
    }
    
    /**
     * Unsets the "t" element
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(T$4, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "modelId" attribute
     */
    public java.lang.Object getModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$8);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "modelId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(MODELID$8);
            return target;
        }
    }
    
    /**
     * Sets the "modelId" attribute
     */
    public void setModelId(java.lang.Object modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$8);
            }
            target.setObjectValue(modelId);
        }
    }
    
    /**
     * Sets (as xml) the "modelId" attribute
     */
    public void xsetModelId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(MODELID$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(MODELID$8);
            }
            target.set(modelId);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType)get_default_attribute_value(TYPE$10);
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
            return get_store().find_attribute_user(TYPE$10) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STPtType)get_store().add_attribute_user(TYPE$10);
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
            get_store().remove_attribute(TYPE$10);
        }
    }
    
    /**
     * Gets the "cxnId" attribute
     */
    public java.lang.Object getCxnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CXNID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CXNID$12);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "cxnId" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId xgetCxnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(CXNID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_default_attribute_value(CXNID$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "cxnId" attribute
     */
    public boolean isSetCxnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CXNID$12) != null;
        }
    }
    
    /**
     * Sets the "cxnId" attribute
     */
    public void setCxnId(java.lang.Object cxnId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CXNID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CXNID$12);
            }
            target.setObjectValue(cxnId);
        }
    }
    
    /**
     * Sets (as xml) the "cxnId" attribute
     */
    public void xsetCxnId(org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId cxnId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().find_attribute_user(CXNID$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STModelId)get_store().add_attribute_user(CXNID$12);
            }
            target.set(cxnId);
        }
    }
    
    /**
     * Unsets the "cxnId" attribute
     */
    public void unsetCxnId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CXNID$12);
        }
    }
}
