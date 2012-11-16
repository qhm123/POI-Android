/*
 * XML Type:  CT_DataValidation
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_DataValidation(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDataValidation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTDataValidation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctdatavalidation9d0ctype");
    
    /**
     * Gets the "formula1" element
     */
    java.lang.String getFormula1();
    
    /**
     * Gets (as xml) the "formula1" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormula1();
    
    /**
     * True if has "formula1" element
     */
    boolean isSetFormula1();
    
    /**
     * Sets the "formula1" element
     */
    void setFormula1(java.lang.String formula1);
    
    /**
     * Sets (as xml) the "formula1" element
     */
    void xsetFormula1(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula1);
    
    /**
     * Unsets the "formula1" element
     */
    void unsetFormula1();
    
    /**
     * Gets the "formula2" element
     */
    java.lang.String getFormula2();
    
    /**
     * Gets (as xml) the "formula2" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula xgetFormula2();
    
    /**
     * True if has "formula2" element
     */
    boolean isSetFormula2();
    
    /**
     * Sets the "formula2" element
     */
    void setFormula2(java.lang.String formula2);
    
    /**
     * Sets (as xml) the "formula2" element
     */
    void xsetFormula2(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula formula2);
    
    /**
     * Unsets the "formula2" element
     */
    void unsetFormula2();
    
    /**
     * Gets the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "errorStyle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.Enum getErrorStyle();
    
    /**
     * Gets (as xml) the "errorStyle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle xgetErrorStyle();
    
    /**
     * True if has "errorStyle" attribute
     */
    boolean isSetErrorStyle();
    
    /**
     * Sets the "errorStyle" attribute
     */
    void setErrorStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.Enum errorStyle);
    
    /**
     * Sets (as xml) the "errorStyle" attribute
     */
    void xsetErrorStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle errorStyle);
    
    /**
     * Unsets the "errorStyle" attribute
     */
    void unsetErrorStyle();
    
    /**
     * Gets the "imeMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode.Enum getImeMode();
    
    /**
     * Gets (as xml) the "imeMode" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode xgetImeMode();
    
    /**
     * True if has "imeMode" attribute
     */
    boolean isSetImeMode();
    
    /**
     * Sets the "imeMode" attribute
     */
    void setImeMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode.Enum imeMode);
    
    /**
     * Sets (as xml) the "imeMode" attribute
     */
    void xsetImeMode(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode imeMode);
    
    /**
     * Unsets the "imeMode" attribute
     */
    void unsetImeMode();
    
    /**
     * Gets the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.Enum getOperator();
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator xgetOperator();
    
    /**
     * True if has "operator" attribute
     */
    boolean isSetOperator();
    
    /**
     * Sets the "operator" attribute
     */
    void setOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator.Enum operator);
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    void xsetOperator(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator operator);
    
    /**
     * Unsets the "operator" attribute
     */
    void unsetOperator();
    
    /**
     * Gets the "allowBlank" attribute
     */
    boolean getAllowBlank();
    
    /**
     * Gets (as xml) the "allowBlank" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowBlank();
    
    /**
     * True if has "allowBlank" attribute
     */
    boolean isSetAllowBlank();
    
    /**
     * Sets the "allowBlank" attribute
     */
    void setAllowBlank(boolean allowBlank);
    
    /**
     * Sets (as xml) the "allowBlank" attribute
     */
    void xsetAllowBlank(org.apache.xmlbeans.XmlBoolean allowBlank);
    
    /**
     * Unsets the "allowBlank" attribute
     */
    void unsetAllowBlank();
    
    /**
     * Gets the "showDropDown" attribute
     */
    boolean getShowDropDown();
    
    /**
     * Gets (as xml) the "showDropDown" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowDropDown();
    
    /**
     * True if has "showDropDown" attribute
     */
    boolean isSetShowDropDown();
    
    /**
     * Sets the "showDropDown" attribute
     */
    void setShowDropDown(boolean showDropDown);
    
    /**
     * Sets (as xml) the "showDropDown" attribute
     */
    void xsetShowDropDown(org.apache.xmlbeans.XmlBoolean showDropDown);
    
    /**
     * Unsets the "showDropDown" attribute
     */
    void unsetShowDropDown();
    
    /**
     * Gets the "showInputMessage" attribute
     */
    boolean getShowInputMessage();
    
    /**
     * Gets (as xml) the "showInputMessage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowInputMessage();
    
    /**
     * True if has "showInputMessage" attribute
     */
    boolean isSetShowInputMessage();
    
    /**
     * Sets the "showInputMessage" attribute
     */
    void setShowInputMessage(boolean showInputMessage);
    
    /**
     * Sets (as xml) the "showInputMessage" attribute
     */
    void xsetShowInputMessage(org.apache.xmlbeans.XmlBoolean showInputMessage);
    
    /**
     * Unsets the "showInputMessage" attribute
     */
    void unsetShowInputMessage();
    
    /**
     * Gets the "showErrorMessage" attribute
     */
    boolean getShowErrorMessage();
    
    /**
     * Gets (as xml) the "showErrorMessage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowErrorMessage();
    
    /**
     * True if has "showErrorMessage" attribute
     */
    boolean isSetShowErrorMessage();
    
    /**
     * Sets the "showErrorMessage" attribute
     */
    void setShowErrorMessage(boolean showErrorMessage);
    
    /**
     * Sets (as xml) the "showErrorMessage" attribute
     */
    void xsetShowErrorMessage(org.apache.xmlbeans.XmlBoolean showErrorMessage);
    
    /**
     * Unsets the "showErrorMessage" attribute
     */
    void unsetShowErrorMessage();
    
    /**
     * Gets the "errorTitle" attribute
     */
    java.lang.String getErrorTitle();
    
    /**
     * Gets (as xml) the "errorTitle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetErrorTitle();
    
    /**
     * True if has "errorTitle" attribute
     */
    boolean isSetErrorTitle();
    
    /**
     * Sets the "errorTitle" attribute
     */
    void setErrorTitle(java.lang.String errorTitle);
    
    /**
     * Sets (as xml) the "errorTitle" attribute
     */
    void xsetErrorTitle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring errorTitle);
    
    /**
     * Unsets the "errorTitle" attribute
     */
    void unsetErrorTitle();
    
    /**
     * Gets the "error" attribute
     */
    java.lang.String getError();
    
    /**
     * Gets (as xml) the "error" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetError();
    
    /**
     * True if has "error" attribute
     */
    boolean isSetError();
    
    /**
     * Sets the "error" attribute
     */
    void setError(java.lang.String error);
    
    /**
     * Sets (as xml) the "error" attribute
     */
    void xsetError(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring error);
    
    /**
     * Unsets the "error" attribute
     */
    void unsetError();
    
    /**
     * Gets the "promptTitle" attribute
     */
    java.lang.String getPromptTitle();
    
    /**
     * Gets (as xml) the "promptTitle" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPromptTitle();
    
    /**
     * True if has "promptTitle" attribute
     */
    boolean isSetPromptTitle();
    
    /**
     * Sets the "promptTitle" attribute
     */
    void setPromptTitle(java.lang.String promptTitle);
    
    /**
     * Sets (as xml) the "promptTitle" attribute
     */
    void xsetPromptTitle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring promptTitle);
    
    /**
     * Unsets the "promptTitle" attribute
     */
    void unsetPromptTitle();
    
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
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref();
    
    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
