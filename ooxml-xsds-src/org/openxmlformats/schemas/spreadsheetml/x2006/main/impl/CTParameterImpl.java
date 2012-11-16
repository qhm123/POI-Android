/*
 * XML Type:  CT_Parameter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Parameter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter
{
    
    public CTParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SQLTYPE$2 = 
        new javax.xml.namespace.QName("", "sqlType");
    private static final javax.xml.namespace.QName PARAMETERTYPE$4 = 
        new javax.xml.namespace.QName("", "parameterType");
    private static final javax.xml.namespace.QName REFRESHONCHANGE$6 = 
        new javax.xml.namespace.QName("", "refreshOnChange");
    private static final javax.xml.namespace.QName PROMPT$8 = 
        new javax.xml.namespace.QName("", "prompt");
    private static final javax.xml.namespace.QName BOOLEAN$10 = 
        new javax.xml.namespace.QName("", "boolean");
    private static final javax.xml.namespace.QName DOUBLE$12 = 
        new javax.xml.namespace.QName("", "double");
    private static final javax.xml.namespace.QName INTEGER$14 = 
        new javax.xml.namespace.QName("", "integer");
    private static final javax.xml.namespace.QName STRING$16 = 
        new javax.xml.namespace.QName("", "string");
    private static final javax.xml.namespace.QName CELL$18 = 
        new javax.xml.namespace.QName("", "cell");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
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
            return get_store().find_attribute_user(NAME$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
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
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "sqlType" attribute
     */
    public int getSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SQLTYPE$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqlType" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SQLTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(SQLTYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sqlType" attribute
     */
    public boolean isSetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SQLTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "sqlType" attribute
     */
    public void setSqlType(int sqlType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQLTYPE$2);
            }
            target.setIntValue(sqlType);
        }
    }
    
    /**
     * Sets (as xml) the "sqlType" attribute
     */
    public void xsetSqlType(org.apache.xmlbeans.XmlInt sqlType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SQLTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SQLTYPE$2);
            }
            target.set(sqlType);
        }
    }
    
    /**
     * Unsets the "sqlType" attribute
     */
    public void unsetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SQLTYPE$2);
        }
    }
    
    /**
     * Gets the "parameterType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType.Enum getParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARAMETERTYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType xgetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType)get_store().find_attribute_user(PARAMETERTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType)get_default_attribute_value(PARAMETERTYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "parameterType" attribute
     */
    public boolean isSetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARAMETERTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "parameterType" attribute
     */
    public void setParameterType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType.Enum parameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERTYPE$4);
            }
            target.setEnumValue(parameterType);
        }
    }
    
    /**
     * Sets (as xml) the "parameterType" attribute
     */
    public void xsetParameterType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType parameterType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType)get_store().find_attribute_user(PARAMETERTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType)get_store().add_attribute_user(PARAMETERTYPE$4);
            }
            target.set(parameterType);
        }
    }
    
    /**
     * Unsets the "parameterType" attribute
     */
    public void unsetParameterType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARAMETERTYPE$4);
        }
    }
    
    /**
     * Gets the "refreshOnChange" attribute
     */
    public boolean getRefreshOnChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONCHANGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REFRESHONCHANGE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshOnChange" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRefreshOnChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONCHANGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REFRESHONCHANGE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "refreshOnChange" attribute
     */
    public boolean isSetRefreshOnChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REFRESHONCHANGE$6) != null;
        }
    }
    
    /**
     * Sets the "refreshOnChange" attribute
     */
    public void setRefreshOnChange(boolean refreshOnChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFRESHONCHANGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFRESHONCHANGE$6);
            }
            target.setBooleanValue(refreshOnChange);
        }
    }
    
    /**
     * Sets (as xml) the "refreshOnChange" attribute
     */
    public void xsetRefreshOnChange(org.apache.xmlbeans.XmlBoolean refreshOnChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REFRESHONCHANGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REFRESHONCHANGE$6);
            }
            target.set(refreshOnChange);
        }
    }
    
    /**
     * Unsets the "refreshOnChange" attribute
     */
    public void unsetRefreshOnChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REFRESHONCHANGE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPT$8);
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
            return get_store().find_attribute_user(PROMPT$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROMPT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROMPT$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROMPT$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PROMPT$8);
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
            get_store().remove_attribute(PROMPT$8);
        }
    }
    
    /**
     * Gets the "boolean" attribute
     */
    public boolean getBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOLEAN$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "boolean" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOOLEAN$10);
            return target;
        }
    }
    
    /**
     * True if has "boolean" attribute
     */
    public boolean isSetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOOLEAN$10) != null;
        }
    }
    
    /**
     * Sets the "boolean" attribute
     */
    public void setBoolean(boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOLEAN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOLEAN$10);
            }
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Sets (as xml) the "boolean" attribute
     */
    public void xsetBoolean(org.apache.xmlbeans.XmlBoolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOOLEAN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BOOLEAN$10);
            }
            target.set(xboolean);
        }
    }
    
    /**
     * Unsets the "boolean" attribute
     */
    public void unsetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOOLEAN$10);
        }
    }
    
    /**
     * Gets the "double" attribute
     */
    public double getDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLE$12);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "double" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOUBLE$12);
            return target;
        }
    }
    
    /**
     * True if has "double" attribute
     */
    public boolean isSetDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOUBLE$12) != null;
        }
    }
    
    /**
     * Sets the "double" attribute
     */
    public void setDouble(double xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOUBLE$12);
            }
            target.setDoubleValue(xdouble);
        }
    }
    
    /**
     * Sets (as xml) the "double" attribute
     */
    public void xsetDouble(org.apache.xmlbeans.XmlDouble xdouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOUBLE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DOUBLE$12);
            }
            target.set(xdouble);
        }
    }
    
    /**
     * Unsets the "double" attribute
     */
    public void unsetDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOUBLE$12);
        }
    }
    
    /**
     * Gets the "integer" attribute
     */
    public int getInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGER$14);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "integer" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INTEGER$14);
            return target;
        }
    }
    
    /**
     * True if has "integer" attribute
     */
    public boolean isSetInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGER$14) != null;
        }
    }
    
    /**
     * Sets the "integer" attribute
     */
    public void setInteger(int integer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGER$14);
            }
            target.setIntValue(integer);
        }
    }
    
    /**
     * Sets (as xml) the "integer" attribute
     */
    public void xsetInteger(org.apache.xmlbeans.XmlInt integer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INTEGER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(INTEGER$14);
            }
            target.set(integer);
        }
    }
    
    /**
     * Unsets the "integer" attribute
     */
    public void unsetInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGER$14);
        }
    }
    
    /**
     * Gets the "string" attribute
     */
    public java.lang.String getString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "string" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRING$16);
            return target;
        }
    }
    
    /**
     * True if has "string" attribute
     */
    public boolean isSetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRING$16) != null;
        }
    }
    
    /**
     * Sets the "string" attribute
     */
    public void setString(java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRING$16);
            }
            target.setStringValue(string);
        }
    }
    
    /**
     * Sets (as xml) the "string" attribute
     */
    public void xsetString(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(STRING$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(STRING$16);
            }
            target.set(string);
        }
    }
    
    /**
     * Unsets the "string" attribute
     */
    public void unsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRING$16);
        }
    }
    
    /**
     * Gets the "cell" attribute
     */
    public java.lang.String getCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELL$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cell" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CELL$18);
            return target;
        }
    }
    
    /**
     * True if has "cell" attribute
     */
    public boolean isSetCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELL$18) != null;
        }
    }
    
    /**
     * Sets the "cell" attribute
     */
    public void setCell(java.lang.String cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELL$18);
            }
            target.setStringValue(cell);
        }
    }
    
    /**
     * Sets (as xml) the "cell" attribute
     */
    public void xsetCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CELL$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CELL$18);
            }
            target.set(cell);
        }
    }
    
    /**
     * Unsets the "cell" attribute
     */
    public void unsetCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELL$18);
        }
    }
}
