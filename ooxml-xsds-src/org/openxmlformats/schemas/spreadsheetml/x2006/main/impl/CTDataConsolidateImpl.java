/*
 * XML Type:  CT_DataConsolidate
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataConsolidate(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataConsolidateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate
{
    
    public CTDataConsolidateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAREFS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataRefs");
    private static final javax.xml.namespace.QName FUNCTION$2 = 
        new javax.xml.namespace.QName("", "function");
    private static final javax.xml.namespace.QName LEFTLABELS$4 = 
        new javax.xml.namespace.QName("", "leftLabels");
    private static final javax.xml.namespace.QName TOPLABELS$6 = 
        new javax.xml.namespace.QName("", "topLabels");
    private static final javax.xml.namespace.QName LINK$8 = 
        new javax.xml.namespace.QName("", "link");
    
    
    /**
     * Gets the "dataRefs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs getDataRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs)get_store().find_element_user(DATAREFS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataRefs" element
     */
    public boolean isSetDataRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAREFS$0) != 0;
        }
    }
    
    /**
     * Sets the "dataRefs" element
     */
    public void setDataRefs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs dataRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs)get_store().find_element_user(DATAREFS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs)get_store().add_element_user(DATAREFS$0);
            }
            target.set(dataRefs);
        }
    }
    
    /**
     * Appends and returns a new empty "dataRefs" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs addNewDataRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataRefs)get_store().add_element_user(DATAREFS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dataRefs" element
     */
    public void unsetDataRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAREFS$0, 0);
        }
    }
    
    /**
     * Gets the "function" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum getFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FUNCTION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "function" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction xgetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().find_attribute_user(FUNCTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_default_attribute_value(FUNCTION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "function" attribute
     */
    public boolean isSetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FUNCTION$2) != null;
        }
    }
    
    /**
     * Sets the "function" attribute
     */
    public void setFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction.Enum function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTION$2);
            }
            target.setEnumValue(function);
        }
    }
    
    /**
     * Sets (as xml) the "function" attribute
     */
    public void xsetFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().find_attribute_user(FUNCTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction)get_store().add_attribute_user(FUNCTION$2);
            }
            target.set(function);
        }
    }
    
    /**
     * Unsets the "function" attribute
     */
    public void unsetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FUNCTION$2);
        }
    }
    
    /**
     * Gets the "leftLabels" attribute
     */
    public boolean getLeftLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTLABELS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LEFTLABELS$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "leftLabels" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLeftLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LEFTLABELS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LEFTLABELS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "leftLabels" attribute
     */
    public boolean isSetLeftLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEFTLABELS$4) != null;
        }
    }
    
    /**
     * Sets the "leftLabels" attribute
     */
    public void setLeftLabels(boolean leftLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTLABELS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFTLABELS$4);
            }
            target.setBooleanValue(leftLabels);
        }
    }
    
    /**
     * Sets (as xml) the "leftLabels" attribute
     */
    public void xsetLeftLabels(org.apache.xmlbeans.XmlBoolean leftLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LEFTLABELS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LEFTLABELS$4);
            }
            target.set(leftLabels);
        }
    }
    
    /**
     * Unsets the "leftLabels" attribute
     */
    public void unsetLeftLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEFTLABELS$4);
        }
    }
    
    /**
     * Gets the "topLabels" attribute
     */
    public boolean getTopLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLABELS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOPLABELS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "topLabels" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTopLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPLABELS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TOPLABELS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "topLabels" attribute
     */
    public boolean isSetTopLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPLABELS$6) != null;
        }
    }
    
    /**
     * Sets the "topLabels" attribute
     */
    public void setTopLabels(boolean topLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPLABELS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPLABELS$6);
            }
            target.setBooleanValue(topLabels);
        }
    }
    
    /**
     * Sets (as xml) the "topLabels" attribute
     */
    public void xsetTopLabels(org.apache.xmlbeans.XmlBoolean topLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPLABELS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TOPLABELS$6);
            }
            target.set(topLabels);
        }
    }
    
    /**
     * Unsets the "topLabels" attribute
     */
    public void unsetTopLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPLABELS$6);
        }
    }
    
    /**
     * Gets the "link" attribute
     */
    public boolean getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LINK$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "link" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LINK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LINK$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "link" attribute
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINK$8) != null;
        }
    }
    
    /**
     * Sets the "link" attribute
     */
    public void setLink(boolean link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINK$8);
            }
            target.setBooleanValue(link);
        }
    }
    
    /**
     * Sets (as xml) the "link" attribute
     */
    public void xsetLink(org.apache.xmlbeans.XmlBoolean link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LINK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LINK$8);
            }
            target.set(link);
        }
    }
    
    /**
     * Unsets the "link" attribute
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINK$8);
        }
    }
}
