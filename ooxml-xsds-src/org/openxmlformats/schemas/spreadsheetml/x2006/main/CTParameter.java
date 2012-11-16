/*
 * XML Type:  CT_Parameter
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Parameter(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTParameter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctparameterbe08type");
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "sqlType" attribute
     */
    int getSqlType();
    
    /**
     * Gets (as xml) the "sqlType" attribute
     */
    org.apache.xmlbeans.XmlInt xgetSqlType();
    
    /**
     * True if has "sqlType" attribute
     */
    boolean isSetSqlType();
    
    /**
     * Sets the "sqlType" attribute
     */
    void setSqlType(int sqlType);
    
    /**
     * Sets (as xml) the "sqlType" attribute
     */
    void xsetSqlType(org.apache.xmlbeans.XmlInt sqlType);
    
    /**
     * Unsets the "sqlType" attribute
     */
    void unsetSqlType();
    
    /**
     * Gets the "parameterType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType.Enum getParameterType();
    
    /**
     * Gets (as xml) the "parameterType" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType xgetParameterType();
    
    /**
     * True if has "parameterType" attribute
     */
    boolean isSetParameterType();
    
    /**
     * Sets the "parameterType" attribute
     */
    void setParameterType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType.Enum parameterType);
    
    /**
     * Sets (as xml) the "parameterType" attribute
     */
    void xsetParameterType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STParameterType parameterType);
    
    /**
     * Unsets the "parameterType" attribute
     */
    void unsetParameterType();
    
    /**
     * Gets the "refreshOnChange" attribute
     */
    boolean getRefreshOnChange();
    
    /**
     * Gets (as xml) the "refreshOnChange" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRefreshOnChange();
    
    /**
     * True if has "refreshOnChange" attribute
     */
    boolean isSetRefreshOnChange();
    
    /**
     * Sets the "refreshOnChange" attribute
     */
    void setRefreshOnChange(boolean refreshOnChange);
    
    /**
     * Sets (as xml) the "refreshOnChange" attribute
     */
    void xsetRefreshOnChange(org.apache.xmlbeans.XmlBoolean refreshOnChange);
    
    /**
     * Unsets the "refreshOnChange" attribute
     */
    void unsetRefreshOnChange();
    
    /**
     * Gets the "prompt" attribute
     */
    java.lang.String getPrompt();
    
    /**
     * Gets (as xml) the "prompt" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPrompt();
    
    /**
     * True if has "prompt" attribute
     */
    boolean isSetPrompt();
    
    /**
     * Sets the "prompt" attribute
     */
    void setPrompt(java.lang.String prompt);
    
    /**
     * Sets (as xml) the "prompt" attribute
     */
    void xsetPrompt(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring prompt);
    
    /**
     * Unsets the "prompt" attribute
     */
    void unsetPrompt();
    
    /**
     * Gets the "boolean" attribute
     */
    boolean getBoolean();
    
    /**
     * Gets (as xml) the "boolean" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBoolean();
    
    /**
     * True if has "boolean" attribute
     */
    boolean isSetBoolean();
    
    /**
     * Sets the "boolean" attribute
     */
    void setBoolean(boolean xboolean);
    
    /**
     * Sets (as xml) the "boolean" attribute
     */
    void xsetBoolean(org.apache.xmlbeans.XmlBoolean xboolean);
    
    /**
     * Unsets the "boolean" attribute
     */
    void unsetBoolean();
    
    /**
     * Gets the "double" attribute
     */
    double getDouble();
    
    /**
     * Gets (as xml) the "double" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetDouble();
    
    /**
     * True if has "double" attribute
     */
    boolean isSetDouble();
    
    /**
     * Sets the "double" attribute
     */
    void setDouble(double xdouble);
    
    /**
     * Sets (as xml) the "double" attribute
     */
    void xsetDouble(org.apache.xmlbeans.XmlDouble xdouble);
    
    /**
     * Unsets the "double" attribute
     */
    void unsetDouble();
    
    /**
     * Gets the "integer" attribute
     */
    int getInteger();
    
    /**
     * Gets (as xml) the "integer" attribute
     */
    org.apache.xmlbeans.XmlInt xgetInteger();
    
    /**
     * True if has "integer" attribute
     */
    boolean isSetInteger();
    
    /**
     * Sets the "integer" attribute
     */
    void setInteger(int integer);
    
    /**
     * Sets (as xml) the "integer" attribute
     */
    void xsetInteger(org.apache.xmlbeans.XmlInt integer);
    
    /**
     * Unsets the "integer" attribute
     */
    void unsetInteger();
    
    /**
     * Gets the "string" attribute
     */
    java.lang.String getString();
    
    /**
     * Gets (as xml) the "string" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetString();
    
    /**
     * True if has "string" attribute
     */
    boolean isSetString();
    
    /**
     * Sets the "string" attribute
     */
    void setString(java.lang.String string);
    
    /**
     * Sets (as xml) the "string" attribute
     */
    void xsetString(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring string);
    
    /**
     * Unsets the "string" attribute
     */
    void unsetString();
    
    /**
     * Gets the "cell" attribute
     */
    java.lang.String getCell();
    
    /**
     * Gets (as xml) the "cell" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCell();
    
    /**
     * True if has "cell" attribute
     */
    boolean isSetCell();
    
    /**
     * Sets the "cell" attribute
     */
    void setCell(java.lang.String cell);
    
    /**
     * Sets (as xml) the "cell" attribute
     */
    void xsetCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring cell);
    
    /**
     * Unsets the "cell" attribute
     */
    void unsetCell();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
