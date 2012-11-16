/*
 * XML Type:  CT_NumericRule
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_NumericRule(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTNumericRuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule
{
    
    public CTNumericRuleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName FOR$4 = 
        new javax.xml.namespace.QName("", "for");
    private static final javax.xml.namespace.QName FORNAME$6 = 
        new javax.xml.namespace.QName("", "forName");
    private static final javax.xml.namespace.QName PTTYPE$8 = 
        new javax.xml.namespace.QName("", "ptType");
    private static final javax.xml.namespace.QName VAL$10 = 
        new javax.xml.namespace.QName("", "val");
    private static final javax.xml.namespace.QName FACT$12 = 
        new javax.xml.namespace.QName("", "fact");
    private static final javax.xml.namespace.QName MAX$14 = 
        new javax.xml.namespace.QName("", "max");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "for" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum getFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FOR$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "for" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship xgetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship)get_default_attribute_value(FOR$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "for" attribute
     */
    public boolean isSetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FOR$4) != null;
        }
    }
    
    /**
     * Sets the "for" attribute
     */
    public void setFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship.Enum xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOR$4);
            }
            target.setEnumValue(xfor);
        }
    }
    
    /**
     * Sets (as xml) the "for" attribute
     */
    public void xsetFor(org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship)get_store().find_attribute_user(FOR$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STConstraintRelationship)get_store().add_attribute_user(FOR$4);
            }
            target.set(xfor);
        }
    }
    
    /**
     * Unsets the "for" attribute
     */
    public void unsetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FOR$4);
        }
    }
    
    /**
     * Gets the "forName" attribute
     */
    public java.lang.String getForName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORNAME$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "forName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetForName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FORNAME$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "forName" attribute
     */
    public boolean isSetForName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORNAME$6) != null;
        }
    }
    
    /**
     * Sets the "forName" attribute
     */
    public void setForName(java.lang.String forName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORNAME$6);
            }
            target.setStringValue(forName);
        }
    }
    
    /**
     * Sets (as xml) the "forName" attribute
     */
    public void xsetForName(org.apache.xmlbeans.XmlString forName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORNAME$6);
            }
            target.set(forName);
        }
    }
    
    /**
     * Unsets the "forName" attribute
     */
    public void unsetForName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORNAME$6);
        }
    }
    
    /**
     * Gets the "ptType" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum getPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PTTYPE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptType" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType xgetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType)get_store().find_attribute_user(PTTYPE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType)get_default_attribute_value(PTTYPE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "ptType" attribute
     */
    public boolean isSetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PTTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "ptType" attribute
     */
    public void setPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType.Enum ptType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PTTYPE$8);
            }
            target.setEnumValue(ptType);
        }
    }
    
    /**
     * Sets (as xml) the "ptType" attribute
     */
    public void xsetPtType(org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType ptType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType)get_store().find_attribute_user(PTTYPE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STElementType)get_store().add_attribute_user(PTTYPE$8);
            }
            target.set(ptType);
        }
    }
    
    /**
     * Unsets the "ptType" attribute
     */
    public void unsetPtType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PTTYPE$8);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public double getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VAL$10);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(VAL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "val" attribute
     */
    public boolean isSetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAL$10) != null;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(double val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$10);
            }
            target.setDoubleValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.apache.xmlbeans.XmlDouble val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VAL$10);
            }
            target.set(val);
        }
    }
    
    /**
     * Unsets the "val" attribute
     */
    public void unsetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAL$10);
        }
    }
    
    /**
     * Gets the "fact" attribute
     */
    public double getFact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FACT$12);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "fact" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetFact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FACT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(FACT$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "fact" attribute
     */
    public boolean isSetFact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FACT$12) != null;
        }
    }
    
    /**
     * Sets the "fact" attribute
     */
    public void setFact(double fact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACT$12);
            }
            target.setDoubleValue(fact);
        }
    }
    
    /**
     * Sets (as xml) the "fact" attribute
     */
    public void xsetFact(org.apache.xmlbeans.XmlDouble fact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FACT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FACT$12);
            }
            target.set(fact);
        }
    }
    
    /**
     * Unsets the "fact" attribute
     */
    public void unsetFact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FACT$12);
        }
    }
    
    /**
     * Gets the "max" attribute
     */
    public double getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAX$14);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(MAX$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "max" attribute
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAX$14) != null;
        }
    }
    
    /**
     * Sets the "max" attribute
     */
    public void setMax(double max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$14);
            }
            target.setDoubleValue(max);
        }
    }
    
    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlDouble max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAX$14);
            }
            target.set(max);
        }
    }
    
    /**
     * Unsets the "max" attribute
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAX$14);
        }
    }
}
