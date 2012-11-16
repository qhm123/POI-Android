/*
 * XML Type:  CT_IgnoredError
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_IgnoredError(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIgnoredErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError
{
    
    public CTIgnoredErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQREF$0 = 
        new javax.xml.namespace.QName("", "sqref");
    private static final javax.xml.namespace.QName EVALERROR$2 = 
        new javax.xml.namespace.QName("", "evalError");
    private static final javax.xml.namespace.QName TWODIGITTEXTYEAR$4 = 
        new javax.xml.namespace.QName("", "twoDigitTextYear");
    private static final javax.xml.namespace.QName NUMBERSTOREDASTEXT$6 = 
        new javax.xml.namespace.QName("", "numberStoredAsText");
    private static final javax.xml.namespace.QName FORMULA$8 = 
        new javax.xml.namespace.QName("", "formula");
    private static final javax.xml.namespace.QName FORMULARANGE$10 = 
        new javax.xml.namespace.QName("", "formulaRange");
    private static final javax.xml.namespace.QName UNLOCKEDFORMULA$12 = 
        new javax.xml.namespace.QName("", "unlockedFormula");
    private static final javax.xml.namespace.QName EMPTYCELLREFERENCE$14 = 
        new javax.xml.namespace.QName("", "emptyCellReference");
    private static final javax.xml.namespace.QName LISTDATAVALIDATION$16 = 
        new javax.xml.namespace.QName("", "listDataValidation");
    private static final javax.xml.namespace.QName CALCULATEDCOLUMN$18 = 
        new javax.xml.namespace.QName("", "calculatedColumn");
    
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$0);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Gets the "evalError" attribute
     */
    public boolean getEvalError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALERROR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EVALERROR$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "evalError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEvalError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EVALERROR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EVALERROR$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "evalError" attribute
     */
    public boolean isSetEvalError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EVALERROR$2) != null;
        }
    }
    
    /**
     * Sets the "evalError" attribute
     */
    public void setEvalError(boolean evalError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALERROR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVALERROR$2);
            }
            target.setBooleanValue(evalError);
        }
    }
    
    /**
     * Sets (as xml) the "evalError" attribute
     */
    public void xsetEvalError(org.apache.xmlbeans.XmlBoolean evalError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EVALERROR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EVALERROR$2);
            }
            target.set(evalError);
        }
    }
    
    /**
     * Unsets the "evalError" attribute
     */
    public void unsetEvalError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EVALERROR$2);
        }
    }
    
    /**
     * Gets the "twoDigitTextYear" attribute
     */
    public boolean getTwoDigitTextYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TWODIGITTEXTYEAR$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "twoDigitTextYear" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTwoDigitTextYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TWODIGITTEXTYEAR$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "twoDigitTextYear" attribute
     */
    public boolean isSetTwoDigitTextYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TWODIGITTEXTYEAR$4) != null;
        }
    }
    
    /**
     * Sets the "twoDigitTextYear" attribute
     */
    public void setTwoDigitTextYear(boolean twoDigitTextYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TWODIGITTEXTYEAR$4);
            }
            target.setBooleanValue(twoDigitTextYear);
        }
    }
    
    /**
     * Sets (as xml) the "twoDigitTextYear" attribute
     */
    public void xsetTwoDigitTextYear(org.apache.xmlbeans.XmlBoolean twoDigitTextYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TWODIGITTEXTYEAR$4);
            }
            target.set(twoDigitTextYear);
        }
    }
    
    /**
     * Unsets the "twoDigitTextYear" attribute
     */
    public void unsetTwoDigitTextYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TWODIGITTEXTYEAR$4);
        }
    }
    
    /**
     * Gets the "numberStoredAsText" attribute
     */
    public boolean getNumberStoredAsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMBERSTOREDASTEXT$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberStoredAsText" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNumberStoredAsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(NUMBERSTOREDASTEXT$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "numberStoredAsText" attribute
     */
    public boolean isSetNumberStoredAsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMBERSTOREDASTEXT$6) != null;
        }
    }
    
    /**
     * Sets the "numberStoredAsText" attribute
     */
    public void setNumberStoredAsText(boolean numberStoredAsText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBERSTOREDASTEXT$6);
            }
            target.setBooleanValue(numberStoredAsText);
        }
    }
    
    /**
     * Sets (as xml) the "numberStoredAsText" attribute
     */
    public void xsetNumberStoredAsText(org.apache.xmlbeans.XmlBoolean numberStoredAsText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NUMBERSTOREDASTEXT$6);
            }
            target.set(numberStoredAsText);
        }
    }
    
    /**
     * Unsets the "numberStoredAsText" attribute
     */
    public void unsetNumberStoredAsText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMBERSTOREDASTEXT$6);
        }
    }
    
    /**
     * Gets the "formula" attribute
     */
    public boolean getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMULA$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formula" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMULA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMULA$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "formula" attribute
     */
    public boolean isSetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMULA$8) != null;
        }
    }
    
    /**
     * Sets the "formula" attribute
     */
    public void setFormula(boolean formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMULA$8);
            }
            target.setBooleanValue(formula);
        }
    }
    
    /**
     * Sets (as xml) the "formula" attribute
     */
    public void xsetFormula(org.apache.xmlbeans.XmlBoolean formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMULA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMULA$8);
            }
            target.set(formula);
        }
    }
    
    /**
     * Unsets the "formula" attribute
     */
    public void unsetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMULA$8);
        }
    }
    
    /**
     * Gets the "formulaRange" attribute
     */
    public boolean getFormulaRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULARANGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMULARANGE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "formulaRange" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFormulaRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMULARANGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FORMULARANGE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "formulaRange" attribute
     */
    public boolean isSetFormulaRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMULARANGE$10) != null;
        }
    }
    
    /**
     * Sets the "formulaRange" attribute
     */
    public void setFormulaRange(boolean formulaRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULARANGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMULARANGE$10);
            }
            target.setBooleanValue(formulaRange);
        }
    }
    
    /**
     * Sets (as xml) the "formulaRange" attribute
     */
    public void xsetFormulaRange(org.apache.xmlbeans.XmlBoolean formulaRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORMULARANGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORMULARANGE$10);
            }
            target.set(formulaRange);
        }
    }
    
    /**
     * Unsets the "formulaRange" attribute
     */
    public void unsetFormulaRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMULARANGE$10);
        }
    }
    
    /**
     * Gets the "unlockedFormula" attribute
     */
    public boolean getUnlockedFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNLOCKEDFORMULA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNLOCKEDFORMULA$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unlockedFormula" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUnlockedFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNLOCKEDFORMULA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNLOCKEDFORMULA$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "unlockedFormula" attribute
     */
    public boolean isSetUnlockedFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNLOCKEDFORMULA$12) != null;
        }
    }
    
    /**
     * Sets the "unlockedFormula" attribute
     */
    public void setUnlockedFormula(boolean unlockedFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNLOCKEDFORMULA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNLOCKEDFORMULA$12);
            }
            target.setBooleanValue(unlockedFormula);
        }
    }
    
    /**
     * Sets (as xml) the "unlockedFormula" attribute
     */
    public void xsetUnlockedFormula(org.apache.xmlbeans.XmlBoolean unlockedFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNLOCKEDFORMULA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNLOCKEDFORMULA$12);
            }
            target.set(unlockedFormula);
        }
    }
    
    /**
     * Unsets the "unlockedFormula" attribute
     */
    public void unsetUnlockedFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNLOCKEDFORMULA$12);
        }
    }
    
    /**
     * Gets the "emptyCellReference" attribute
     */
    public boolean getEmptyCellReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EMPTYCELLREFERENCE$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "emptyCellReference" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEmptyCellReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EMPTYCELLREFERENCE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "emptyCellReference" attribute
     */
    public boolean isSetEmptyCellReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EMPTYCELLREFERENCE$14) != null;
        }
    }
    
    /**
     * Sets the "emptyCellReference" attribute
     */
    public void setEmptyCellReference(boolean emptyCellReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMPTYCELLREFERENCE$14);
            }
            target.setBooleanValue(emptyCellReference);
        }
    }
    
    /**
     * Sets (as xml) the "emptyCellReference" attribute
     */
    public void xsetEmptyCellReference(org.apache.xmlbeans.XmlBoolean emptyCellReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EMPTYCELLREFERENCE$14);
            }
            target.set(emptyCellReference);
        }
    }
    
    /**
     * Unsets the "emptyCellReference" attribute
     */
    public void unsetEmptyCellReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EMPTYCELLREFERENCE$14);
        }
    }
    
    /**
     * Gets the "listDataValidation" attribute
     */
    public boolean getListDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTDATAVALIDATION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LISTDATAVALIDATION$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "listDataValidation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetListDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LISTDATAVALIDATION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LISTDATAVALIDATION$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "listDataValidation" attribute
     */
    public boolean isSetListDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTDATAVALIDATION$16) != null;
        }
    }
    
    /**
     * Sets the "listDataValidation" attribute
     */
    public void setListDataValidation(boolean listDataValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTDATAVALIDATION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTDATAVALIDATION$16);
            }
            target.setBooleanValue(listDataValidation);
        }
    }
    
    /**
     * Sets (as xml) the "listDataValidation" attribute
     */
    public void xsetListDataValidation(org.apache.xmlbeans.XmlBoolean listDataValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LISTDATAVALIDATION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LISTDATAVALIDATION$16);
            }
            target.set(listDataValidation);
        }
    }
    
    /**
     * Unsets the "listDataValidation" attribute
     */
    public void unsetListDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTDATAVALIDATION$16);
        }
    }
    
    /**
     * Gets the "calculatedColumn" attribute
     */
    public boolean getCalculatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCULATEDCOLUMN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CALCULATEDCOLUMN$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "calculatedColumn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCalculatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCULATEDCOLUMN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CALCULATEDCOLUMN$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "calculatedColumn" attribute
     */
    public boolean isSetCalculatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALCULATEDCOLUMN$18) != null;
        }
    }
    
    /**
     * Sets the "calculatedColumn" attribute
     */
    public void setCalculatedColumn(boolean calculatedColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALCULATEDCOLUMN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALCULATEDCOLUMN$18);
            }
            target.setBooleanValue(calculatedColumn);
        }
    }
    
    /**
     * Sets (as xml) the "calculatedColumn" attribute
     */
    public void xsetCalculatedColumn(org.apache.xmlbeans.XmlBoolean calculatedColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CALCULATEDCOLUMN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CALCULATEDCOLUMN$18);
            }
            target.set(calculatedColumn);
        }
    }
    
    /**
     * Unsets the "calculatedColumn" attribute
     */
    public void unsetCalculatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALCULATEDCOLUMN$18);
        }
    }
}
