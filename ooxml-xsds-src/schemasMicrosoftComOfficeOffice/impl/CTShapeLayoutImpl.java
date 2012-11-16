/*
 * XML Type:  CT_ShapeLayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTShapeLayout
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_ShapeLayout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTShapeLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTShapeLayout
{
    
    public CTShapeLayoutImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDMAP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "idmap");
    private static final javax.xml.namespace.QName REGROUPTABLE$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "regrouptable");
    private static final javax.xml.namespace.QName RULES$4 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "rules");
    private static final javax.xml.namespace.QName EXT$6 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    
    
    /**
     * Gets the "idmap" element
     */
    public schemasMicrosoftComOfficeOffice.CTIdMap getIdmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTIdMap target = null;
            target = (schemasMicrosoftComOfficeOffice.CTIdMap)get_store().find_element_user(IDMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "idmap" element
     */
    public boolean isSetIdmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDMAP$0) != 0;
        }
    }
    
    /**
     * Sets the "idmap" element
     */
    public void setIdmap(schemasMicrosoftComOfficeOffice.CTIdMap idmap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTIdMap target = null;
            target = (schemasMicrosoftComOfficeOffice.CTIdMap)get_store().find_element_user(IDMAP$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTIdMap)get_store().add_element_user(IDMAP$0);
            }
            target.set(idmap);
        }
    }
    
    /**
     * Appends and returns a new empty "idmap" element
     */
    public schemasMicrosoftComOfficeOffice.CTIdMap addNewIdmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTIdMap target = null;
            target = (schemasMicrosoftComOfficeOffice.CTIdMap)get_store().add_element_user(IDMAP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "idmap" element
     */
    public void unsetIdmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDMAP$0, 0);
        }
    }
    
    /**
     * Gets the "regrouptable" element
     */
    public schemasMicrosoftComOfficeOffice.CTRegroupTable getRegrouptable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRegroupTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRegroupTable)get_store().find_element_user(REGROUPTABLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regrouptable" element
     */
    public boolean isSetRegrouptable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGROUPTABLE$2) != 0;
        }
    }
    
    /**
     * Sets the "regrouptable" element
     */
    public void setRegrouptable(schemasMicrosoftComOfficeOffice.CTRegroupTable regrouptable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRegroupTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRegroupTable)get_store().find_element_user(REGROUPTABLE$2, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTRegroupTable)get_store().add_element_user(REGROUPTABLE$2);
            }
            target.set(regrouptable);
        }
    }
    
    /**
     * Appends and returns a new empty "regrouptable" element
     */
    public schemasMicrosoftComOfficeOffice.CTRegroupTable addNewRegrouptable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRegroupTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRegroupTable)get_store().add_element_user(REGROUPTABLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "regrouptable" element
     */
    public void unsetRegrouptable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGROUPTABLE$2, 0);
        }
    }
    
    /**
     * Gets the "rules" element
     */
    public schemasMicrosoftComOfficeOffice.CTRules getRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRules target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRules)get_store().find_element_user(RULES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rules" element
     */
    public boolean isSetRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RULES$4) != 0;
        }
    }
    
    /**
     * Sets the "rules" element
     */
    public void setRules(schemasMicrosoftComOfficeOffice.CTRules rules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRules target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRules)get_store().find_element_user(RULES$4, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTRules)get_store().add_element_user(RULES$4);
            }
            target.set(rules);
        }
    }
    
    /**
     * Appends and returns a new empty "rules" element
     */
    public schemasMicrosoftComOfficeOffice.CTRules addNewRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRules target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRules)get_store().add_element_user(RULES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "rules" element
     */
    public void unsetRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RULES$4, 0);
        }
    }
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$6);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$6) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$6);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$6);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$6);
        }
    }
}
