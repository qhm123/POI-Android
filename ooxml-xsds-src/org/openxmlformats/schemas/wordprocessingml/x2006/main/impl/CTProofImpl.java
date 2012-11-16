/*
 * XML Type:  CT_Proof
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Proof(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTProofImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof
{
    
    public CTProofImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPELLING$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "spelling");
    private static final javax.xml.namespace.QName GRAMMAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "grammar");
    
    
    /**
     * Gets the "spelling" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum getSpelling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPELLING$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "spelling" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof xgetSpelling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().find_attribute_user(SPELLING$0);
            return target;
        }
    }
    
    /**
     * True if has "spelling" attribute
     */
    public boolean isSetSpelling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPELLING$0) != null;
        }
    }
    
    /**
     * Sets the "spelling" attribute
     */
    public void setSpelling(org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum spelling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPELLING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPELLING$0);
            }
            target.setEnumValue(spelling);
        }
    }
    
    /**
     * Sets (as xml) the "spelling" attribute
     */
    public void xsetSpelling(org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof spelling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().find_attribute_user(SPELLING$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().add_attribute_user(SPELLING$0);
            }
            target.set(spelling);
        }
    }
    
    /**
     * Unsets the "spelling" attribute
     */
    public void unsetSpelling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPELLING$0);
        }
    }
    
    /**
     * Gets the "grammar" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum getGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRAMMAR$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "grammar" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof xgetGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().find_attribute_user(GRAMMAR$2);
            return target;
        }
    }
    
    /**
     * True if has "grammar" attribute
     */
    public boolean isSetGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRAMMAR$2) != null;
        }
    }
    
    /**
     * Sets the "grammar" attribute
     */
    public void setGrammar(org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof.Enum grammar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRAMMAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRAMMAR$2);
            }
            target.setEnumValue(grammar);
        }
    }
    
    /**
     * Sets (as xml) the "grammar" attribute
     */
    public void xsetGrammar(org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof grammar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().find_attribute_user(GRAMMAR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STProof)get_store().add_attribute_user(GRAMMAR$2);
            }
            target.set(grammar);
        }
    }
    
    /**
     * Unsets the "grammar" attribute
     */
    public void unsetGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRAMMAR$2);
        }
    }
}
