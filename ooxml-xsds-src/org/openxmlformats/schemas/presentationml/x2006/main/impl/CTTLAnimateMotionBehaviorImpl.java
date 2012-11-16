/*
 * XML Type:  CT_TLAnimateMotionBehavior
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimateMotionBehavior(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimateMotionBehaviorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior
{
    
    public CTTLAnimateMotionBehaviorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CBHVR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cBhvr");
    private static final javax.xml.namespace.QName BY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "by");
    private static final javax.xml.namespace.QName FROM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "from");
    private static final javax.xml.namespace.QName TO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "to");
    private static final javax.xml.namespace.QName RCTR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "rCtr");
    private static final javax.xml.namespace.QName ORIGIN$10 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName PATH$12 = 
        new javax.xml.namespace.QName("", "path");
    private static final javax.xml.namespace.QName PATHEDITMODE$14 = 
        new javax.xml.namespace.QName("", "pathEditMode");
    private static final javax.xml.namespace.QName RANG$16 = 
        new javax.xml.namespace.QName("", "rAng");
    private static final javax.xml.namespace.QName PTSTYPES$18 = 
        new javax.xml.namespace.QName("", "ptsTypes");
    
    
    /**
     * Gets the "cBhvr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData getCBhvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().find_element_user(CBHVR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cBhvr" element
     */
    public void setCBhvr(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData cBhvr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().find_element_user(CBHVR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().add_element_user(CBHVR$0);
            }
            target.set(cBhvr);
        }
    }
    
    /**
     * Appends and returns a new empty "cBhvr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData addNewCBhvr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonBehaviorData)get_store().add_element_user(CBHVR$0);
            return target;
        }
    }
    
    /**
     * Gets the "by" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(BY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "by" element
     */
    public boolean isSetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BY$2) != 0;
        }
    }
    
    /**
     * Sets the "by" element
     */
    public void setBy(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(BY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(BY$2);
            }
            target.set(by);
        }
    }
    
    /**
     * Appends and returns a new empty "by" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(BY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "by" element
     */
    public void unsetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BY$2, 0);
        }
    }
    
    /**
     * Gets the "from" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(FROM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "from" element
     */
    public boolean isSetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROM$4) != 0;
        }
    }
    
    /**
     * Sets the "from" element
     */
    public void setFrom(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(FROM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(FROM$4);
            }
            target.set(from);
        }
    }
    
    /**
     * Appends and returns a new empty "from" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(FROM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "from" element
     */
    public void unsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROM$4, 0);
        }
    }
    
    /**
     * Gets the "to" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(TO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "to" element
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TO$6) != 0;
        }
    }
    
    /**
     * Sets the "to" element
     */
    public void setTo(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(TO$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(TO$6);
            }
            target.set(to);
        }
    }
    
    /**
     * Appends and returns a new empty "to" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(TO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "to" element
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TO$6, 0);
        }
    }
    
    /**
     * Gets the "rCtr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint getRCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(RCTR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rCtr" element
     */
    public boolean isSetRCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCTR$8) != 0;
        }
    }
    
    /**
     * Sets the "rCtr" element
     */
    public void setRCtr(org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint rCtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().find_element_user(RCTR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(RCTR$8);
            }
            target.set(rCtr);
        }
    }
    
    /**
     * Appends and returns a new empty "rCtr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint addNewRCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLPoint)get_store().add_element_user(RCTR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "rCtr" element
     */
    public void unsetRCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCTR$8, 0);
        }
    }
    
    /**
     * Gets the "origin" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin.Enum getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin)get_store().find_attribute_user(ORIGIN$10);
            return target;
        }
    }
    
    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGIN$10) != null;
        }
    }
    
    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin.Enum origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$10);
            }
            target.setEnumValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin)get_store().find_attribute_user(ORIGIN$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionBehaviorOrigin)get_store().add_attribute_user(ORIGIN$10);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGIN$10);
        }
    }
    
    /**
     * Gets the "path" attribute
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$12);
            return target;
        }
    }
    
    /**
     * True if has "path" attribute
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATH$12) != null;
        }
    }
    
    /**
     * Sets the "path" attribute
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$12);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" attribute
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$12);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "path" attribute
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATH$12);
        }
    }
    
    /**
     * Gets the "pathEditMode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode.Enum getPathEditMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATHEDITMODE$14);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pathEditMode" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode xgetPathEditMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode)get_store().find_attribute_user(PATHEDITMODE$14);
            return target;
        }
    }
    
    /**
     * True if has "pathEditMode" attribute
     */
    public boolean isSetPathEditMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATHEDITMODE$14) != null;
        }
    }
    
    /**
     * Sets the "pathEditMode" attribute
     */
    public void setPathEditMode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode.Enum pathEditMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATHEDITMODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATHEDITMODE$14);
            }
            target.setEnumValue(pathEditMode);
        }
    }
    
    /**
     * Sets (as xml) the "pathEditMode" attribute
     */
    public void xsetPathEditMode(org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode pathEditMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode)get_store().find_attribute_user(PATHEDITMODE$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STTLAnimateMotionPathEditMode)get_store().add_attribute_user(PATHEDITMODE$14);
            }
            target.set(pathEditMode);
        }
    }
    
    /**
     * Unsets the "pathEditMode" attribute
     */
    public void unsetPathEditMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATHEDITMODE$14);
        }
    }
    
    /**
     * Gets the "rAng" attribute
     */
    public int getRAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANG$16);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rAng" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAngle xgetRAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(RANG$16);
            return target;
        }
    }
    
    /**
     * True if has "rAng" attribute
     */
    public boolean isSetRAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RANG$16) != null;
        }
    }
    
    /**
     * Sets the "rAng" attribute
     */
    public void setRAng(int rAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RANG$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RANG$16);
            }
            target.setIntValue(rAng);
        }
    }
    
    /**
     * Sets (as xml) the "rAng" attribute
     */
    public void xsetRAng(org.openxmlformats.schemas.drawingml.x2006.main.STAngle rAng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(RANG$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().add_attribute_user(RANG$16);
            }
            target.set(rAng);
        }
    }
    
    /**
     * Unsets the "rAng" attribute
     */
    public void unsetRAng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RANG$16);
        }
    }
    
    /**
     * Gets the "ptsTypes" attribute
     */
    public java.lang.String getPtsTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTSTYPES$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ptsTypes" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPtsTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PTSTYPES$18);
            return target;
        }
    }
    
    /**
     * True if has "ptsTypes" attribute
     */
    public boolean isSetPtsTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PTSTYPES$18) != null;
        }
    }
    
    /**
     * Sets the "ptsTypes" attribute
     */
    public void setPtsTypes(java.lang.String ptsTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PTSTYPES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PTSTYPES$18);
            }
            target.setStringValue(ptsTypes);
        }
    }
    
    /**
     * Sets (as xml) the "ptsTypes" attribute
     */
    public void xsetPtsTypes(org.apache.xmlbeans.XmlString ptsTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PTSTYPES$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PTSTYPES$18);
            }
            target.set(ptsTypes);
        }
    }
    
    /**
     * Unsets the "ptsTypes" attribute
     */
    public void unsetPtsTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PTSTYPES$18);
        }
    }
}
