/*
 * XML Type:  CT_Stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTStroke
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Stroke(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTStrokeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTStroke
{
    
    public CTStrokeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "left");
    private static final javax.xml.namespace.QName TOP$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "top");
    private static final javax.xml.namespace.QName RIGHT$4 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "right");
    private static final javax.xml.namespace.QName BOTTOM$6 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bottom");
    private static final javax.xml.namespace.QName COLUMN$8 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "column");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ON$12 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName WEIGHT$14 = 
        new javax.xml.namespace.QName("", "weight");
    private static final javax.xml.namespace.QName COLOR$16 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName OPACITY$18 = 
        new javax.xml.namespace.QName("", "opacity");
    private static final javax.xml.namespace.QName LINESTYLE$20 = 
        new javax.xml.namespace.QName("", "linestyle");
    private static final javax.xml.namespace.QName MITERLIMIT$22 = 
        new javax.xml.namespace.QName("", "miterlimit");
    private static final javax.xml.namespace.QName JOINSTYLE$24 = 
        new javax.xml.namespace.QName("", "joinstyle");
    private static final javax.xml.namespace.QName ENDCAP$26 = 
        new javax.xml.namespace.QName("", "endcap");
    private static final javax.xml.namespace.QName DASHSTYLE$28 = 
        new javax.xml.namespace.QName("", "dashstyle");
    private static final javax.xml.namespace.QName FILLTYPE$30 = 
        new javax.xml.namespace.QName("", "filltype");
    private static final javax.xml.namespace.QName SRC$32 = 
        new javax.xml.namespace.QName("", "src");
    private static final javax.xml.namespace.QName IMAGEASPECT$34 = 
        new javax.xml.namespace.QName("", "imageaspect");
    private static final javax.xml.namespace.QName IMAGESIZE$36 = 
        new javax.xml.namespace.QName("", "imagesize");
    private static final javax.xml.namespace.QName IMAGEALIGNSHAPE$38 = 
        new javax.xml.namespace.QName("", "imagealignshape");
    private static final javax.xml.namespace.QName COLOR2$40 = 
        new javax.xml.namespace.QName("", "color2");
    private static final javax.xml.namespace.QName STARTARROW$42 = 
        new javax.xml.namespace.QName("", "startarrow");
    private static final javax.xml.namespace.QName STARTARROWWIDTH$44 = 
        new javax.xml.namespace.QName("", "startarrowwidth");
    private static final javax.xml.namespace.QName STARTARROWLENGTH$46 = 
        new javax.xml.namespace.QName("", "startarrowlength");
    private static final javax.xml.namespace.QName ENDARROW$48 = 
        new javax.xml.namespace.QName("", "endarrow");
    private static final javax.xml.namespace.QName ENDARROWWIDTH$50 = 
        new javax.xml.namespace.QName("", "endarrowwidth");
    private static final javax.xml.namespace.QName ENDARROWLENGTH$52 = 
        new javax.xml.namespace.QName("", "endarrowlength");
    private static final javax.xml.namespace.QName HREF$54 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "href");
    private static final javax.xml.namespace.QName ALTHREF$56 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "althref");
    private static final javax.xml.namespace.QName TITLE$58 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "title");
    private static final javax.xml.namespace.QName FORCEDASH$60 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "forcedash");
    private static final javax.xml.namespace.QName ID2$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    private static final javax.xml.namespace.QName INSETPEN$64 = 
        new javax.xml.namespace.QName("", "insetpen");
    private static final javax.xml.namespace.QName RELID$66 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "relid");
    
    
    /**
     * Gets the "left" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "left" element
     */
    public boolean isSetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEFT$0) != 0;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(schemasMicrosoftComOfficeOffice.CTStrokeChild left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(LEFT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "left" element
     */
    public void unsetLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEFT$0, 0);
        }
    }
    
    /**
     * Gets the "top" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(TOP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "top" element
     */
    public boolean isSetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOP$2) != 0;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(schemasMicrosoftComOfficeOffice.CTStrokeChild top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(TOP$2, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(TOP$2);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(TOP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "top" element
     */
    public void unsetTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOP$2, 0);
        }
    }
    
    /**
     * Gets the "right" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(RIGHT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "right" element
     */
    public boolean isSetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHT$4) != 0;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(schemasMicrosoftComOfficeOffice.CTStrokeChild right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(RIGHT$4, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(RIGHT$4);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(RIGHT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "right" element
     */
    public void unsetRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHT$4, 0);
        }
    }
    
    /**
     * Gets the "bottom" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(BOTTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bottom" element
     */
    public boolean isSetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOTTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(schemasMicrosoftComOfficeOffice.CTStrokeChild bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(BOTTOM$6, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(BOTTOM$6);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(BOTTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bottom" element
     */
    public void unsetBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOTTOM$6, 0);
        }
    }
    
    /**
     * Gets the "column" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(COLUMN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "column" element
     */
    public boolean isSetColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMN$8) != 0;
        }
    }
    
    /**
     * Sets the "column" element
     */
    public void setColumn(schemasMicrosoftComOfficeOffice.CTStrokeChild column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(COLUMN$8, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(COLUMN$8);
            }
            target.set(column);
        }
    }
    
    /**
     * Appends and returns a new empty "column" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(COLUMN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "column" element
     */
    public void unsetColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMN$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$12);
            return target;
        }
    }
    
    /**
     * True if has "on" attribute
     */
    public boolean isSetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ON$12) != null;
        }
    }
    
    /**
     * Sets the "on" attribute
     */
    public void setOn(schemasMicrosoftComVml.STTrueFalse.Enum on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ON$12);
            }
            target.setEnumValue(on);
        }
    }
    
    /**
     * Sets (as xml) the "on" attribute
     */
    public void xsetOn(schemasMicrosoftComVml.STTrueFalse on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$12);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ON$12);
            }
            target.set(on);
        }
    }
    
    /**
     * Unsets the "on" attribute
     */
    public void unsetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ON$12);
        }
    }
    
    /**
     * Gets the "weight" attribute
     */
    public java.lang.String getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEIGHT$14);
            return target;
        }
    }
    
    /**
     * True if has "weight" attribute
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WEIGHT$14) != null;
        }
    }
    
    /**
     * Sets the "weight" attribute
     */
    public void setWeight(java.lang.String weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$14);
            }
            target.setStringValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" attribute
     */
    public void xsetWeight(org.apache.xmlbeans.XmlString weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEIGHT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WEIGHT$14);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "weight" attribute
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WEIGHT$14);
        }
    }
    
    /**
     * Gets the "color" attribute
     */
    public java.lang.String getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "color" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR$16);
            return target;
        }
    }
    
    /**
     * True if has "color" attribute
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR$16) != null;
        }
    }
    
    /**
     * Sets the "color" attribute
     */
    public void setColor(java.lang.String color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$16);
            }
            target.setStringValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "color" attribute
     */
    public void xsetColor(schemasMicrosoftComVml.STColorType color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR$16);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(COLOR$16);
            }
            target.set(color);
        }
    }
    
    /**
     * Unsets the "color" attribute
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR$16);
        }
    }
    
    /**
     * Gets the "opacity" attribute
     */
    public java.lang.String getOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opacity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$18);
            return target;
        }
    }
    
    /**
     * True if has "opacity" attribute
     */
    public boolean isSetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPACITY$18) != null;
        }
    }
    
    /**
     * Sets the "opacity" attribute
     */
    public void setOpacity(java.lang.String opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPACITY$18);
            }
            target.setStringValue(opacity);
        }
    }
    
    /**
     * Sets (as xml) the "opacity" attribute
     */
    public void xsetOpacity(org.apache.xmlbeans.XmlString opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPACITY$18);
            }
            target.set(opacity);
        }
    }
    
    /**
     * Unsets the "opacity" attribute
     */
    public void unsetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPACITY$18);
        }
    }
    
    /**
     * Gets the "linestyle" attribute
     */
    public schemasMicrosoftComVml.STStrokeLineStyle.Enum getLinestyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINESTYLE$20);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeLineStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "linestyle" attribute
     */
    public schemasMicrosoftComVml.STStrokeLineStyle xgetLinestyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeLineStyle target = null;
            target = (schemasMicrosoftComVml.STStrokeLineStyle)get_store().find_attribute_user(LINESTYLE$20);
            return target;
        }
    }
    
    /**
     * True if has "linestyle" attribute
     */
    public boolean isSetLinestyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINESTYLE$20) != null;
        }
    }
    
    /**
     * Sets the "linestyle" attribute
     */
    public void setLinestyle(schemasMicrosoftComVml.STStrokeLineStyle.Enum linestyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINESTYLE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINESTYLE$20);
            }
            target.setEnumValue(linestyle);
        }
    }
    
    /**
     * Sets (as xml) the "linestyle" attribute
     */
    public void xsetLinestyle(schemasMicrosoftComVml.STStrokeLineStyle linestyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeLineStyle target = null;
            target = (schemasMicrosoftComVml.STStrokeLineStyle)get_store().find_attribute_user(LINESTYLE$20);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeLineStyle)get_store().add_attribute_user(LINESTYLE$20);
            }
            target.set(linestyle);
        }
    }
    
    /**
     * Unsets the "linestyle" attribute
     */
    public void unsetLinestyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINESTYLE$20);
        }
    }
    
    /**
     * Gets the "miterlimit" attribute
     */
    public java.math.BigDecimal getMiterlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MITERLIMIT$22);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "miterlimit" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMiterlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MITERLIMIT$22);
            return target;
        }
    }
    
    /**
     * True if has "miterlimit" attribute
     */
    public boolean isSetMiterlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MITERLIMIT$22) != null;
        }
    }
    
    /**
     * Sets the "miterlimit" attribute
     */
    public void setMiterlimit(java.math.BigDecimal miterlimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MITERLIMIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MITERLIMIT$22);
            }
            target.setBigDecimalValue(miterlimit);
        }
    }
    
    /**
     * Sets (as xml) the "miterlimit" attribute
     */
    public void xsetMiterlimit(org.apache.xmlbeans.XmlDecimal miterlimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MITERLIMIT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MITERLIMIT$22);
            }
            target.set(miterlimit);
        }
    }
    
    /**
     * Unsets the "miterlimit" attribute
     */
    public void unsetMiterlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MITERLIMIT$22);
        }
    }
    
    /**
     * Gets the "joinstyle" attribute
     */
    public schemasMicrosoftComVml.STStrokeJoinStyle.Enum getJoinstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINSTYLE$24);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeJoinStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "joinstyle" attribute
     */
    public schemasMicrosoftComVml.STStrokeJoinStyle xgetJoinstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeJoinStyle target = null;
            target = (schemasMicrosoftComVml.STStrokeJoinStyle)get_store().find_attribute_user(JOINSTYLE$24);
            return target;
        }
    }
    
    /**
     * True if has "joinstyle" attribute
     */
    public boolean isSetJoinstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JOINSTYLE$24) != null;
        }
    }
    
    /**
     * Sets the "joinstyle" attribute
     */
    public void setJoinstyle(schemasMicrosoftComVml.STStrokeJoinStyle.Enum joinstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINSTYLE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOINSTYLE$24);
            }
            target.setEnumValue(joinstyle);
        }
    }
    
    /**
     * Sets (as xml) the "joinstyle" attribute
     */
    public void xsetJoinstyle(schemasMicrosoftComVml.STStrokeJoinStyle joinstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeJoinStyle target = null;
            target = (schemasMicrosoftComVml.STStrokeJoinStyle)get_store().find_attribute_user(JOINSTYLE$24);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeJoinStyle)get_store().add_attribute_user(JOINSTYLE$24);
            }
            target.set(joinstyle);
        }
    }
    
    /**
     * Unsets the "joinstyle" attribute
     */
    public void unsetJoinstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JOINSTYLE$24);
        }
    }
    
    /**
     * Gets the "endcap" attribute
     */
    public schemasMicrosoftComVml.STStrokeEndCap.Enum getEndcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDCAP$26);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeEndCap.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "endcap" attribute
     */
    public schemasMicrosoftComVml.STStrokeEndCap xgetEndcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeEndCap target = null;
            target = (schemasMicrosoftComVml.STStrokeEndCap)get_store().find_attribute_user(ENDCAP$26);
            return target;
        }
    }
    
    /**
     * True if has "endcap" attribute
     */
    public boolean isSetEndcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDCAP$26) != null;
        }
    }
    
    /**
     * Sets the "endcap" attribute
     */
    public void setEndcap(schemasMicrosoftComVml.STStrokeEndCap.Enum endcap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDCAP$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDCAP$26);
            }
            target.setEnumValue(endcap);
        }
    }
    
    /**
     * Sets (as xml) the "endcap" attribute
     */
    public void xsetEndcap(schemasMicrosoftComVml.STStrokeEndCap endcap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeEndCap target = null;
            target = (schemasMicrosoftComVml.STStrokeEndCap)get_store().find_attribute_user(ENDCAP$26);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeEndCap)get_store().add_attribute_user(ENDCAP$26);
            }
            target.set(endcap);
        }
    }
    
    /**
     * Unsets the "endcap" attribute
     */
    public void unsetEndcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDCAP$26);
        }
    }
    
    /**
     * Gets the "dashstyle" attribute
     */
    public java.lang.String getDashstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DASHSTYLE$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dashstyle" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDashstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DASHSTYLE$28);
            return target;
        }
    }
    
    /**
     * True if has "dashstyle" attribute
     */
    public boolean isSetDashstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DASHSTYLE$28) != null;
        }
    }
    
    /**
     * Sets the "dashstyle" attribute
     */
    public void setDashstyle(java.lang.String dashstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DASHSTYLE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DASHSTYLE$28);
            }
            target.setStringValue(dashstyle);
        }
    }
    
    /**
     * Sets (as xml) the "dashstyle" attribute
     */
    public void xsetDashstyle(org.apache.xmlbeans.XmlString dashstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DASHSTYLE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DASHSTYLE$28);
            }
            target.set(dashstyle);
        }
    }
    
    /**
     * Unsets the "dashstyle" attribute
     */
    public void unsetDashstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DASHSTYLE$28);
        }
    }
    
    /**
     * Gets the "filltype" attribute
     */
    public schemasMicrosoftComVml.STFillType.Enum getFilltype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLTYPE$30);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STFillType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "filltype" attribute
     */
    public schemasMicrosoftComVml.STFillType xgetFilltype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillType target = null;
            target = (schemasMicrosoftComVml.STFillType)get_store().find_attribute_user(FILLTYPE$30);
            return target;
        }
    }
    
    /**
     * True if has "filltype" attribute
     */
    public boolean isSetFilltype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLTYPE$30) != null;
        }
    }
    
    /**
     * Sets the "filltype" attribute
     */
    public void setFilltype(schemasMicrosoftComVml.STFillType.Enum filltype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLTYPE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLTYPE$30);
            }
            target.setEnumValue(filltype);
        }
    }
    
    /**
     * Sets (as xml) the "filltype" attribute
     */
    public void xsetFilltype(schemasMicrosoftComVml.STFillType filltype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STFillType target = null;
            target = (schemasMicrosoftComVml.STFillType)get_store().find_attribute_user(FILLTYPE$30);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STFillType)get_store().add_attribute_user(FILLTYPE$30);
            }
            target.set(filltype);
        }
    }
    
    /**
     * Unsets the "filltype" attribute
     */
    public void unsetFilltype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLTYPE$30);
        }
    }
    
    /**
     * Gets the "src" attribute
     */
    public java.lang.String getSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "src" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$32);
            return target;
        }
    }
    
    /**
     * True if has "src" attribute
     */
    public boolean isSetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRC$32) != null;
        }
    }
    
    /**
     * Sets the "src" attribute
     */
    public void setSrc(java.lang.String src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRC$32);
            }
            target.setStringValue(src);
        }
    }
    
    /**
     * Sets (as xml) the "src" attribute
     */
    public void xsetSrc(org.apache.xmlbeans.XmlString src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRC$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRC$32);
            }
            target.set(src);
        }
    }
    
    /**
     * Unsets the "src" attribute
     */
    public void unsetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRC$32);
        }
    }
    
    /**
     * Gets the "imageaspect" attribute
     */
    public schemasMicrosoftComVml.STImageAspect.Enum getImageaspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGEASPECT$34);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STImageAspect.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "imageaspect" attribute
     */
    public schemasMicrosoftComVml.STImageAspect xgetImageaspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STImageAspect target = null;
            target = (schemasMicrosoftComVml.STImageAspect)get_store().find_attribute_user(IMAGEASPECT$34);
            return target;
        }
    }
    
    /**
     * True if has "imageaspect" attribute
     */
    public boolean isSetImageaspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMAGEASPECT$34) != null;
        }
    }
    
    /**
     * Sets the "imageaspect" attribute
     */
    public void setImageaspect(schemasMicrosoftComVml.STImageAspect.Enum imageaspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGEASPECT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGEASPECT$34);
            }
            target.setEnumValue(imageaspect);
        }
    }
    
    /**
     * Sets (as xml) the "imageaspect" attribute
     */
    public void xsetImageaspect(schemasMicrosoftComVml.STImageAspect imageaspect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STImageAspect target = null;
            target = (schemasMicrosoftComVml.STImageAspect)get_store().find_attribute_user(IMAGEASPECT$34);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STImageAspect)get_store().add_attribute_user(IMAGEASPECT$34);
            }
            target.set(imageaspect);
        }
    }
    
    /**
     * Unsets the "imageaspect" attribute
     */
    public void unsetImageaspect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMAGEASPECT$34);
        }
    }
    
    /**
     * Gets the "imagesize" attribute
     */
    public java.lang.String getImagesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGESIZE$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "imagesize" attribute
     */
    public org.apache.xmlbeans.XmlString xgetImagesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGESIZE$36);
            return target;
        }
    }
    
    /**
     * True if has "imagesize" attribute
     */
    public boolean isSetImagesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMAGESIZE$36) != null;
        }
    }
    
    /**
     * Sets the "imagesize" attribute
     */
    public void setImagesize(java.lang.String imagesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGESIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGESIZE$36);
            }
            target.setStringValue(imagesize);
        }
    }
    
    /**
     * Sets (as xml) the "imagesize" attribute
     */
    public void xsetImagesize(org.apache.xmlbeans.XmlString imagesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGESIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IMAGESIZE$36);
            }
            target.set(imagesize);
        }
    }
    
    /**
     * Unsets the "imagesize" attribute
     */
    public void unsetImagesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMAGESIZE$36);
        }
    }
    
    /**
     * Gets the "imagealignshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getImagealignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "imagealignshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetImagealignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
            return target;
        }
    }
    
    /**
     * True if has "imagealignshape" attribute
     */
    public boolean isSetImagealignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMAGEALIGNSHAPE$38) != null;
        }
    }
    
    /**
     * Sets the "imagealignshape" attribute
     */
    public void setImagealignshape(schemasMicrosoftComVml.STTrueFalse.Enum imagealignshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGEALIGNSHAPE$38);
            }
            target.setEnumValue(imagealignshape);
        }
    }
    
    /**
     * Sets (as xml) the "imagealignshape" attribute
     */
    public void xsetImagealignshape(schemasMicrosoftComVml.STTrueFalse imagealignshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(IMAGEALIGNSHAPE$38);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(IMAGEALIGNSHAPE$38);
            }
            target.set(imagealignshape);
        }
    }
    
    /**
     * Unsets the "imagealignshape" attribute
     */
    public void unsetImagealignshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMAGEALIGNSHAPE$38);
        }
    }
    
    /**
     * Gets the "color2" attribute
     */
    public java.lang.String getColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "color2" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$40);
            return target;
        }
    }
    
    /**
     * True if has "color2" attribute
     */
    public boolean isSetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR2$40) != null;
        }
    }
    
    /**
     * Sets the "color2" attribute
     */
    public void setColor2(java.lang.String color2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR2$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR2$40);
            }
            target.setStringValue(color2);
        }
    }
    
    /**
     * Sets (as xml) the "color2" attribute
     */
    public void xsetColor2(schemasMicrosoftComVml.STColorType color2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(COLOR2$40);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(COLOR2$40);
            }
            target.set(color2);
        }
    }
    
    /**
     * Unsets the "color2" attribute
     */
    public void unsetColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR2$40);
        }
    }
    
    /**
     * Gets the "startarrow" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowType.Enum getStartarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROW$42);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "startarrow" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowType xgetStartarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowType target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().find_attribute_user(STARTARROW$42);
            return target;
        }
    }
    
    /**
     * True if has "startarrow" attribute
     */
    public boolean isSetStartarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTARROW$42) != null;
        }
    }
    
    /**
     * Sets the "startarrow" attribute
     */
    public void setStartarrow(schemasMicrosoftComVml.STStrokeArrowType.Enum startarrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTARROW$42);
            }
            target.setEnumValue(startarrow);
        }
    }
    
    /**
     * Sets (as xml) the "startarrow" attribute
     */
    public void xsetStartarrow(schemasMicrosoftComVml.STStrokeArrowType startarrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowType target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().find_attribute_user(STARTARROW$42);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().add_attribute_user(STARTARROW$42);
            }
            target.set(startarrow);
        }
    }
    
    /**
     * Unsets the "startarrow" attribute
     */
    public void unsetStartarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTARROW$42);
        }
    }
    
    /**
     * Gets the "startarrowwidth" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowWidth.Enum getStartarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROWWIDTH$44);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowWidth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "startarrowwidth" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowWidth xgetStartarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowWidth target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().find_attribute_user(STARTARROWWIDTH$44);
            return target;
        }
    }
    
    /**
     * True if has "startarrowwidth" attribute
     */
    public boolean isSetStartarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTARROWWIDTH$44) != null;
        }
    }
    
    /**
     * Sets the "startarrowwidth" attribute
     */
    public void setStartarrowwidth(schemasMicrosoftComVml.STStrokeArrowWidth.Enum startarrowwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROWWIDTH$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTARROWWIDTH$44);
            }
            target.setEnumValue(startarrowwidth);
        }
    }
    
    /**
     * Sets (as xml) the "startarrowwidth" attribute
     */
    public void xsetStartarrowwidth(schemasMicrosoftComVml.STStrokeArrowWidth startarrowwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowWidth target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().find_attribute_user(STARTARROWWIDTH$44);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().add_attribute_user(STARTARROWWIDTH$44);
            }
            target.set(startarrowwidth);
        }
    }
    
    /**
     * Unsets the "startarrowwidth" attribute
     */
    public void unsetStartarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTARROWWIDTH$44);
        }
    }
    
    /**
     * Gets the "startarrowlength" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowLength.Enum getStartarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROWLENGTH$46);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowLength.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "startarrowlength" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowLength xgetStartarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowLength target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().find_attribute_user(STARTARROWLENGTH$46);
            return target;
        }
    }
    
    /**
     * True if has "startarrowlength" attribute
     */
    public boolean isSetStartarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTARROWLENGTH$46) != null;
        }
    }
    
    /**
     * Sets the "startarrowlength" attribute
     */
    public void setStartarrowlength(schemasMicrosoftComVml.STStrokeArrowLength.Enum startarrowlength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTARROWLENGTH$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTARROWLENGTH$46);
            }
            target.setEnumValue(startarrowlength);
        }
    }
    
    /**
     * Sets (as xml) the "startarrowlength" attribute
     */
    public void xsetStartarrowlength(schemasMicrosoftComVml.STStrokeArrowLength startarrowlength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowLength target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().find_attribute_user(STARTARROWLENGTH$46);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().add_attribute_user(STARTARROWLENGTH$46);
            }
            target.set(startarrowlength);
        }
    }
    
    /**
     * Unsets the "startarrowlength" attribute
     */
    public void unsetStartarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTARROWLENGTH$46);
        }
    }
    
    /**
     * Gets the "endarrow" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowType.Enum getEndarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROW$48);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "endarrow" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowType xgetEndarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowType target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().find_attribute_user(ENDARROW$48);
            return target;
        }
    }
    
    /**
     * True if has "endarrow" attribute
     */
    public boolean isSetEndarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDARROW$48) != null;
        }
    }
    
    /**
     * Sets the "endarrow" attribute
     */
    public void setEndarrow(schemasMicrosoftComVml.STStrokeArrowType.Enum endarrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROW$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDARROW$48);
            }
            target.setEnumValue(endarrow);
        }
    }
    
    /**
     * Sets (as xml) the "endarrow" attribute
     */
    public void xsetEndarrow(schemasMicrosoftComVml.STStrokeArrowType endarrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowType target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().find_attribute_user(ENDARROW$48);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowType)get_store().add_attribute_user(ENDARROW$48);
            }
            target.set(endarrow);
        }
    }
    
    /**
     * Unsets the "endarrow" attribute
     */
    public void unsetEndarrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDARROW$48);
        }
    }
    
    /**
     * Gets the "endarrowwidth" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowWidth.Enum getEndarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROWWIDTH$50);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowWidth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "endarrowwidth" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowWidth xgetEndarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowWidth target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().find_attribute_user(ENDARROWWIDTH$50);
            return target;
        }
    }
    
    /**
     * True if has "endarrowwidth" attribute
     */
    public boolean isSetEndarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDARROWWIDTH$50) != null;
        }
    }
    
    /**
     * Sets the "endarrowwidth" attribute
     */
    public void setEndarrowwidth(schemasMicrosoftComVml.STStrokeArrowWidth.Enum endarrowwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROWWIDTH$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDARROWWIDTH$50);
            }
            target.setEnumValue(endarrowwidth);
        }
    }
    
    /**
     * Sets (as xml) the "endarrowwidth" attribute
     */
    public void xsetEndarrowwidth(schemasMicrosoftComVml.STStrokeArrowWidth endarrowwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowWidth target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().find_attribute_user(ENDARROWWIDTH$50);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowWidth)get_store().add_attribute_user(ENDARROWWIDTH$50);
            }
            target.set(endarrowwidth);
        }
    }
    
    /**
     * Unsets the "endarrowwidth" attribute
     */
    public void unsetEndarrowwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDARROWWIDTH$50);
        }
    }
    
    /**
     * Gets the "endarrowlength" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowLength.Enum getEndarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROWLENGTH$52);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STStrokeArrowLength.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "endarrowlength" attribute
     */
    public schemasMicrosoftComVml.STStrokeArrowLength xgetEndarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowLength target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().find_attribute_user(ENDARROWLENGTH$52);
            return target;
        }
    }
    
    /**
     * True if has "endarrowlength" attribute
     */
    public boolean isSetEndarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDARROWLENGTH$52) != null;
        }
    }
    
    /**
     * Sets the "endarrowlength" attribute
     */
    public void setEndarrowlength(schemasMicrosoftComVml.STStrokeArrowLength.Enum endarrowlength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDARROWLENGTH$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDARROWLENGTH$52);
            }
            target.setEnumValue(endarrowlength);
        }
    }
    
    /**
     * Sets (as xml) the "endarrowlength" attribute
     */
    public void xsetEndarrowlength(schemasMicrosoftComVml.STStrokeArrowLength endarrowlength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STStrokeArrowLength target = null;
            target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().find_attribute_user(ENDARROWLENGTH$52);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STStrokeArrowLength)get_store().add_attribute_user(ENDARROWLENGTH$52);
            }
            target.set(endarrowlength);
        }
    }
    
    /**
     * Unsets the "endarrowlength" attribute
     */
    public void unsetEndarrowlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDARROWLENGTH$52);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$54);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$54) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$54);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlString href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HREF$54);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$54);
        }
    }
    
    /**
     * Gets the "althref" attribute
     */
    public java.lang.String getAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "althref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$56);
            return target;
        }
    }
    
    /**
     * True if has "althref" attribute
     */
    public boolean isSetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALTHREF$56) != null;
        }
    }
    
    /**
     * Sets the "althref" attribute
     */
    public void setAlthref(java.lang.String althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTHREF$56);
            }
            target.setStringValue(althref);
        }
    }
    
    /**
     * Sets (as xml) the "althref" attribute
     */
    public void xsetAlthref(org.apache.xmlbeans.XmlString althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALTHREF$56);
            }
            target.set(althref);
        }
    }
    
    /**
     * Unsets the "althref" attribute
     */
    public void unsetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALTHREF$56);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$58);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$58) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$58);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$58);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$58);
        }
    }
    
    /**
     * Gets the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$60);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$60);
            return target;
        }
    }
    
    /**
     * True if has "forcedash" attribute
     */
    public boolean isSetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORCEDASH$60) != null;
        }
    }
    
    /**
     * Sets the "forcedash" attribute
     */
    public void setForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORCEDASH$60);
            }
            target.setEnumValue(forcedash);
        }
    }
    
    /**
     * Sets (as xml) the "forcedash" attribute
     */
    public void xsetForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$60);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(FORCEDASH$60);
            }
            target.set(forcedash);
        }
    }
    
    /**
     * Unsets the "forcedash" attribute
     */
    public void unsetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORCEDASH$60);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID2$62);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID2$62);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID2$62) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId2(java.lang.String id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID2$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID2$62);
            }
            target.setStringValue(id2);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId2(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID2$62);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID2$62);
            }
            target.set(id2);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID2$62);
        }
    }
    
    /**
     * Gets the "insetpen" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPEN$64);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetpen" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPEN$64);
            return target;
        }
    }
    
    /**
     * True if has "insetpen" attribute
     */
    public boolean isSetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETPEN$64) != null;
        }
    }
    
    /**
     * Sets the "insetpen" attribute
     */
    public void setInsetpen(schemasMicrosoftComVml.STTrueFalse.Enum insetpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPEN$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETPEN$64);
            }
            target.setEnumValue(insetpen);
        }
    }
    
    /**
     * Sets (as xml) the "insetpen" attribute
     */
    public void xsetInsetpen(schemasMicrosoftComVml.STTrueFalse insetpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPEN$64);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(INSETPEN$64);
            }
            target.set(insetpen);
        }
    }
    
    /**
     * Unsets the "insetpen" attribute
     */
    public void unsetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETPEN$64);
        }
    }
    
    /**
     * Gets the "relid" attribute
     */
    public java.lang.String getRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$66);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relid" attribute
     */
    public schemasMicrosoftComOfficeOffice.STRelationshipId xgetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$66);
            return target;
        }
    }
    
    /**
     * True if has "relid" attribute
     */
    public boolean isSetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELID$66) != null;
        }
    }
    
    /**
     * Sets the "relid" attribute
     */
    public void setRelid(java.lang.String relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELID$66);
            }
            target.setStringValue(relid);
        }
    }
    
    /**
     * Sets (as xml) the "relid" attribute
     */
    public void xsetRelid(schemasMicrosoftComOfficeOffice.STRelationshipId relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$66);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().add_attribute_user(RELID$66);
            }
            target.set(relid);
        }
    }
    
    /**
     * Unsets the "relid" attribute
     */
    public void unsetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELID$66);
        }
    }
}
