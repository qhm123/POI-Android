/*
 * XML Type:  CT_DataValidation
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataValidation(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataValidationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation
{
    
    public CTDataValidationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULA1$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula1");
    private static final javax.xml.namespace.QName FORMULA2$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula2");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ERRORSTYLE$6 = 
        new javax.xml.namespace.QName("", "errorStyle");
    private static final javax.xml.namespace.QName IMEMODE$8 = 
        new javax.xml.namespace.QName("", "imeMode");
    private static final javax.xml.namespace.QName OPERATOR$10 = 
        new javax.xml.namespace.QName("", "operator");
    private static final javax.xml.namespace.QName ALLOWBLANK$12 = 
        new javax.xml.namespace.QName("", "allowBlank");
    private static final javax.xml.namespace.QName SHOWDROPDOWN$14 = 
        new javax.xml.namespace.QName("", "showDropDown");
    private static final javax.xml.namespace.QName SHOWINPUTMESSAGE$16 = 
        new javax.xml.namespace.QName("", "showInputMessage");
    private static final javax.xml.namespace.QName SHOWERRORMESSAGE$18 = 
        new javax.xml.namespace.QName("", "showErrorMessage");
    private static final javax.xml.namespace.QName ERRORTITLE$20 = 
        new javax.xml.namespace.QName("", "errorTitle");
    private static final javax.xml.namespace.QName ERROR$22 = 
        new javax.xml.namespace.QName("", "error");
    private static final javax.xml.namespace.QName PROMPTTITLE$24 = 
        new javax.xml.namespace.QName("", "promptTitle");
    private static final javax.xml.namespace.QName PROMPT$26 = 
        new javax.xml.namespace.QName("", "prompt");
    private static final javax.xml.namespace.QName SQREF$28 = 
        new javax.xml.namespace.QName("", "sqref");
    
    
    /**
     * Gets the "formula1" element
     */
    public java.lang.String getFormula1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formula1" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormula1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA1$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "formula1" element
     */
    public boolean isSetFormula1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA1$0) != 0;
        }
    }
    
    /**
     * Sets the "formula1" element
     */
    public void setFormula1(java.lang.String formula1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULA1$0);
            }
            target.setStringValue(formula1);
        }
    }
    
    /**
     * Sets (as xml) the "formula1" element
     */
    public void xsetFormula1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA1$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(FORMULA1$0);
            }
            target.set(formula1);
        }
    }
    
    /**
     * Unsets the "formula1" element
     */
    public void unsetFormula1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA1$0, 0);
        }
    }
    
    /**
     * Gets the "formula2" element
     */
    public java.lang.String getFormula2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formula2" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormula2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "formula2" element
     */
    public boolean isSetFormula2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA2$2) != 0;
        }
    }
    
    /**
     * Sets the "formula2" element
     */
    public void setFormula2(java.lang.String formula2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMULA2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMULA2$2);
            }
            target.setStringValue(formula2);
        }
    }
    
    /**
     * Sets (as xml) the "formula2" element
     */
    public void xsetFormula2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().find_element_user(FORMULA2$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula)get_store().add_element_user(FORMULA2$2);
            }
            target.set(formula2);
        }
    }
    
    /**
     * Unsets the "formula2" element
     */
    public void unsetFormula2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA2$2, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType)get_default_attribute_value(TYPE$4);
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
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType)get_store().add_attribute_user(TYPE$4);
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
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "errorStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.Enum getErrorStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERRORSTYLE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle xgetErrorStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle)get_store().find_attribute_user(ERRORSTYLE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle)get_default_attribute_value(ERRORSTYLE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "errorStyle" attribute
     */
    public boolean isSetErrorStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORSTYLE$6) != null;
        }
    }
    
    /**
     * Sets the "errorStyle" attribute
     */
    public void setErrorStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.Enum errorStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTYLE$6);
            }
            target.setEnumValue(errorStyle);
        }
    }
    
    /**
     * Sets (as xml) the "errorStyle" attribute
     */
    public void xsetErrorStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle errorStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle)get_store().find_attribute_user(ERRORSTYLE$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle)get_store().add_attribute_user(ERRORSTYLE$6);
            }
            target.set(errorStyle);
        }
    }
    
    /**
     * Unsets the "errorStyle" attribute
     */
    public void unsetErrorStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORSTYLE$6);
        }
    }
    
    /**
     * Gets the "imeMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode.Enum getImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMEMODE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "imeMode" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode xgetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode)get_store().find_attribute_user(IMEMODE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode)get_default_attribute_value(IMEMODE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "imeMode" attribute
     */
    public boolean isSetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMEMODE$8) != null;
        }
    }
    
    /**
     * Sets the "imeMode" attribute
     */
    public void setImeMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode.Enum imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMEMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMEMODE$8);
            }
            target.setEnumValue(imeMode);
        }
    }
    
    /**
     * Sets (as xml) the "imeMode" attribute
     */
    public void xsetImeMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode imeMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode)get_store().find_attribute_user(IMEMODE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode)get_store().add_attribute_user(IMEMODE$8);
            }
            target.set(imeMode);
        }
    }
    
    /**
     * Unsets the "imeMode" attribute
     */
    public void unsetImeMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMEMODE$8);
        }
    }
    
    /**
     * Gets the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$10);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator)get_store().find_attribute_user(OPERATOR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator)get_default_attribute_value(OPERATOR$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$10) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$10);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator)get_store().find_attribute_user(OPERATOR$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator)get_store().add_attribute_user(OPERATOR$10);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$10);
        }
    }
    
    /**
     * Gets the "allowBlank" attribute
     */
    public boolean getAllowBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWBLANK$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLOWBLANK$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowBlank" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWBLANK$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ALLOWBLANK$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "allowBlank" attribute
     */
    public boolean isSetAllowBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWBLANK$12) != null;
        }
    }
    
    /**
     * Sets the "allowBlank" attribute
     */
    public void setAllowBlank(boolean allowBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWBLANK$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWBLANK$12);
            }
            target.setBooleanValue(allowBlank);
        }
    }
    
    /**
     * Sets (as xml) the "allowBlank" attribute
     */
    public void xsetAllowBlank(org.apache.xmlbeans.XmlBoolean allowBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWBLANK$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWBLANK$12);
            }
            target.set(allowBlank);
        }
    }
    
    /**
     * Unsets the "allowBlank" attribute
     */
    public void unsetAllowBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWBLANK$12);
        }
    }
    
    /**
     * Gets the "showDropDown" attribute
     */
    public boolean getShowDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPDOWN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWDROPDOWN$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showDropDown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPDOWN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWDROPDOWN$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "showDropDown" attribute
     */
    public boolean isSetShowDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWDROPDOWN$14) != null;
        }
    }
    
    /**
     * Sets the "showDropDown" attribute
     */
    public void setShowDropDown(boolean showDropDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWDROPDOWN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWDROPDOWN$14);
            }
            target.setBooleanValue(showDropDown);
        }
    }
    
    /**
     * Sets (as xml) the "showDropDown" attribute
     */
    public void xsetShowDropDown(org.apache.xmlbeans.XmlBoolean showDropDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWDROPDOWN$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWDROPDOWN$14);
            }
            target.set(showDropDown);
        }
    }
    
    /**
     * Unsets the "showDropDown" attribute
     */
    public void unsetShowDropDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWDROPDOWN$14);
        }
    }
    
    /**
     * Gets the "showInputMessage" attribute
     */
    public boolean getShowInputMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWINPUTMESSAGE$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showInputMessage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowInputMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWINPUTMESSAGE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "showInputMessage" attribute
     */
    public boolean isSetShowInputMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWINPUTMESSAGE$16) != null;
        }
    }
    
    /**
     * Sets the "showInputMessage" attribute
     */
    public void setShowInputMessage(boolean showInputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWINPUTMESSAGE$16);
            }
            target.setBooleanValue(showInputMessage);
        }
    }
    
    /**
     * Sets (as xml) the "showInputMessage" attribute
     */
    public void xsetShowInputMessage(org.apache.xmlbeans.XmlBoolean showInputMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWINPUTMESSAGE$16);
            }
            target.set(showInputMessage);
        }
    }
    
    /**
     * Unsets the "showInputMessage" attribute
     */
    public void unsetShowInputMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWINPUTMESSAGE$16);
        }
    }
    
    /**
     * Gets the "showErrorMessage" attribute
     */
    public boolean getShowErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWERRORMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWERRORMESSAGE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showErrorMessage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWERRORMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWERRORMESSAGE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "showErrorMessage" attribute
     */
    public boolean isSetShowErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWERRORMESSAGE$18) != null;
        }
    }
    
    /**
     * Sets the "showErrorMessage" attribute
     */
    public void setShowErrorMessage(boolean showErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWERRORMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWERRORMESSAGE$18);
            }
            target.setBooleanValue(showErrorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "showErrorMessage" attribute
     */
    public void xsetShowErrorMessage(org.apache.xmlbeans.XmlBoolean showErrorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWERRORMESSAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWERRORMESSAGE$18);
            }
            target.set(showErrorMessage);
        }
    }
    
    /**
     * Unsets the "showErrorMessage" attribute
     */
    public void unsetShowErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWERRORMESSAGE$18);
        }
    }
    
    /**
     * Gets the "errorTitle" attribute
     */
    public java.lang.String getErrorTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTITLE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorTitle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetErrorTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERRORTITLE$20);
            return target;
        }
    }
    
    /**
     * True if has "errorTitle" attribute
     */
    public boolean isSetErrorTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORTITLE$20) != null;
        }
    }
    
    /**
     * Sets the "errorTitle" attribute
     */
    public void setErrorTitle(java.lang.String errorTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTITLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORTITLE$20);
            }
            target.setStringValue(errorTitle);
        }
    }
    
    /**
     * Sets (as xml) the "errorTitle" attribute
     */
    public void xsetErrorTitle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring errorTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERRORTITLE$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ERRORTITLE$20);
            }
            target.set(errorTitle);
        }
    }
    
    /**
     * Unsets the "errorTitle" attribute
     */
    public void unsetErrorTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORTITLE$20);
        }
    }
    
    /**
     * Gets the "error" attribute
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERROR$22);
            return target;
        }
    }
    
    /**
     * True if has "error" attribute
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERROR$22) != null;
        }
    }
    
    /**
     * Sets the "error" attribute
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERROR$22);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" attribute
     */
    public void xsetError(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(ERROR$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(ERROR$22);
            }
            target.set(error);
        }
    }
    
    /**
     * Unsets the "error" attribute
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERROR$22);
        }
    }
    
    /**
     * Gets the "promptTitle" attribute
     */
    public java.lang.String getPromptTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPTTITLE$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promptTitle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPromptTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPTTITLE$24);
            return target;
        }
    }
    
    /**
     * True if has "promptTitle" attribute
     */
    public boolean isSetPromptTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROMPTTITLE$24) != null;
        }
    }
    
    /**
     * Sets the "promptTitle" attribute
     */
    public void setPromptTitle(java.lang.String promptTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPTTITLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMPTTITLE$24);
            }
            target.setStringValue(promptTitle);
        }
    }
    
    /**
     * Sets (as xml) the "promptTitle" attribute
     */
    public void xsetPromptTitle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring promptTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPTTITLE$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PROMPTTITLE$24);
            }
            target.set(promptTitle);
        }
    }
    
    /**
     * Unsets the "promptTitle" attribute
     */
    public void unsetPromptTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROMPTTITLE$24);
        }
    }
    
    /**
     * Gets the "prompt" attribute
     */
    public java.lang.String getPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "prompt" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPT$26);
            return target;
        }
    }
    
    /**
     * True if has "prompt" attribute
     */
    public boolean isSetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROMPT$26) != null;
        }
    }
    
    /**
     * Sets the "prompt" attribute
     */
    public void setPrompt(java.lang.String prompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMPT$26);
            }
            target.setStringValue(prompt);
        }
    }
    
    /**
     * Sets (as xml) the "prompt" attribute
     */
    public void xsetPrompt(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring prompt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPT$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PROMPT$26);
            }
            target.set(prompt);
        }
    }
    
    /**
     * Unsets the "prompt" attribute
     */
    public void unsetPrompt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROMPT$26);
        }
    }
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$28);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$28);
            return target;
        }
    }
    
    /**
     * Sets the "sqref" attribute
     */
    public void setSqref(java.util.List sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$28);
            }
            target.setListValue(sqref);
        }
    }
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    public void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$28);
            }
            target.set(sqref);
        }
    }
}
