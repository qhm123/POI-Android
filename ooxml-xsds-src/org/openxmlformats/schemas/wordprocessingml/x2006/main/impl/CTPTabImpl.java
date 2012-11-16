/*
 * XML Type:  CT_PTab
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PTab(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPTabImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab
{
    
    public CTPTabImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alignment");
    private static final javax.xml.namespace.QName RELATIVETO$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "relativeTo");
    private static final javax.xml.namespace.QName LEADER$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leader");
    
    
    /**
     * Gets the "alignment" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment.Enum getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignment" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment xgetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment)get_store().find_attribute_user(ALIGNMENT$0);
            return target;
        }
    }
    
    /**
     * Sets the "alignment" attribute
     */
    public void setAlignment(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment.Enum alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENT$0);
            }
            target.setEnumValue(alignment);
        }
    }
    
    /**
     * Sets (as xml) the "alignment" attribute
     */
    public void xsetAlignment(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment)get_store().find_attribute_user(ALIGNMENT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabAlignment)get_store().add_attribute_user(ALIGNMENT$0);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Gets the "relativeTo" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo.Enum getRelativeTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVETO$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativeTo" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo xgetRelativeTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo)get_store().find_attribute_user(RELATIVETO$2);
            return target;
        }
    }
    
    /**
     * Sets the "relativeTo" attribute
     */
    public void setRelativeTo(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo.Enum relativeTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVETO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVETO$2);
            }
            target.setEnumValue(relativeTo);
        }
    }
    
    /**
     * Sets (as xml) the "relativeTo" attribute
     */
    public void xsetRelativeTo(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo relativeTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo)get_store().find_attribute_user(RELATIVETO$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabRelativeTo)get_store().add_attribute_user(RELATIVETO$2);
            }
            target.set(relativeTo);
        }
    }
    
    /**
     * Gets the "leader" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader.Enum getLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEADER$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "leader" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader xgetLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader)get_store().find_attribute_user(LEADER$4);
            return target;
        }
    }
    
    /**
     * Sets the "leader" attribute
     */
    public void setLeader(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader.Enum leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEADER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEADER$4);
            }
            target.setEnumValue(leader);
        }
    }
    
    /**
     * Sets (as xml) the "leader" attribute
     */
    public void xsetLeader(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader)get_store().find_attribute_user(LEADER$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPTabLeader)get_store().add_attribute_user(LEADER$4);
            }
            target.set(leader);
        }
    }
}
