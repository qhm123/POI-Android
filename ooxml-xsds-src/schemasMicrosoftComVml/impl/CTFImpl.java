/*
 * XML Type:  CT_F
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTF
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_F(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTFImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTF
{
    
    public CTFImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQN$0 = 
        new javax.xml.namespace.QName("", "eqn");
    
    
    /**
     * Gets the "eqn" attribute
     */
    public java.lang.String getEqn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQN$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eqn" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEqn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EQN$0);
            return target;
        }
    }
    
    /**
     * True if has "eqn" attribute
     */
    public boolean isSetEqn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EQN$0) != null;
        }
    }
    
    /**
     * Sets the "eqn" attribute
     */
    public void setEqn(java.lang.String eqn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EQN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EQN$0);
            }
            target.setStringValue(eqn);
        }
    }
    
    /**
     * Sets (as xml) the "eqn" attribute
     */
    public void xsetEqn(org.apache.xmlbeans.XmlString eqn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EQN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EQN$0);
            }
            target.set(eqn);
        }
    }
    
    /**
     * Unsets the "eqn" attribute
     */
    public void unsetEqn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EQN$0);
        }
    }
}
