/*
 * XML Type:  CT_Rules
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Rules(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTRulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTRules
{
    
    public CTRulesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RULE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "rule");
    
    
    /**
     * Gets a List of "rule" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule> getRuleList()
    {
        final class RuleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule get(int i)
                { return CTRulesImpl.this.getRuleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule old = CTRulesImpl.this.getRuleArray(i);
                CTRulesImpl.this.setRuleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule o)
                { CTRulesImpl.this.insertNewRule(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule old = CTRulesImpl.this.getRuleArray(i);
                CTRulesImpl.this.removeRule(i);
                return old;
            }
            
            public int size()
                { return CTRulesImpl.this.sizeOfRuleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RuleList();
        }
    }
    
    /**
     * Gets array of all "rule" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[] getRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RULE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rule" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule getRuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rule" element
     */
    public int sizeOfRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULE$0);
        }
    }
    
    /**
     * Sets array of all "rule" element
     */
    public void setRuleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule[] ruleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ruleArray, RULE$0);
        }
    }
    
    /**
     * Sets ith "rule" element
     */
    public void setRuleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule rule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule)get_store().find_element_user(RULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rule" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule insertNewRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule)get_store().insert_element_user(RULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rule" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule addNewRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTNumericRule)get_store().add_element_user(RULE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rule" element
     */
    public void removeRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULE$0, i);
        }
    }
}
