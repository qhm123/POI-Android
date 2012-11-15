/*
 * XML Type:  CT_SchemeColor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_SchemeColor(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSchemeColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor
{
    
    public CTSchemeColorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TINT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
    private static final javax.xml.namespace.QName SHADE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "shade");
    private static final javax.xml.namespace.QName COMP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "comp");
    private static final javax.xml.namespace.QName INV$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "inv");
    private static final javax.xml.namespace.QName GRAY$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gray");
    private static final javax.xml.namespace.QName ALPHA$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alpha");
    private static final javax.xml.namespace.QName ALPHAOFF$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaOff");
    private static final javax.xml.namespace.QName ALPHAMOD$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
    private static final javax.xml.namespace.QName HUE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hue");
    private static final javax.xml.namespace.QName HUEOFF$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueOff");
    private static final javax.xml.namespace.QName HUEMOD$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueMod");
    private static final javax.xml.namespace.QName SAT$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sat");
    private static final javax.xml.namespace.QName SATOFF$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satOff");
    private static final javax.xml.namespace.QName SATMOD$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satMod");
    private static final javax.xml.namespace.QName LUM$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
    private static final javax.xml.namespace.QName LUMOFF$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumOff");
    private static final javax.xml.namespace.QName LUMMOD$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumMod");
    private static final javax.xml.namespace.QName RED$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "red");
    private static final javax.xml.namespace.QName REDOFF$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redOff");
    private static final javax.xml.namespace.QName REDMOD$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redMod");
    private static final javax.xml.namespace.QName GREEN$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "green");
    private static final javax.xml.namespace.QName GREENOFF$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenOff");
    private static final javax.xml.namespace.QName GREENMOD$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenMod");
    private static final javax.xml.namespace.QName BLUE$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blue");
    private static final javax.xml.namespace.QName BLUEOFF$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueOff");
    private static final javax.xml.namespace.QName BLUEMOD$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueMod");
    private static final javax.xml.namespace.QName GAMMA$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gamma");
    private static final javax.xml.namespace.QName INVGAMMA$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "invGamma");
    private static final javax.xml.namespace.QName VAL$56 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets a List of "tint" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getTintList()
    {
        final class TintList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage get(int i)
                { return CTSchemeColorImpl.this.getTintArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getTintArray(i);
                CTSchemeColorImpl.this.setTintArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
                { CTSchemeColorImpl.this.insertNewTint(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getTintArray(i);
                CTSchemeColorImpl.this.removeTint(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfTintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TintList();
        }
    }
    
    /**
     * Gets array of all "tint" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getTintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TINT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tint" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getTintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(TINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tint" element
     */
    public int sizeOfTintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TINT$0);
        }
    }
    
    /**
     * Sets array of all "tint" element
     */
    public void setTintArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] tintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tintArray, TINT$0);
        }
    }
    
    /**
     * Sets ith "tint" element
     */
    public void setTintArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage tint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(TINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tint" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewTint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().insert_element_user(TINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tint" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().add_element_user(TINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tint" element
     */
    public void removeTint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TINT$0, i);
        }
    }
    
    /**
     * Gets a List of "shade" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getShadeList()
    {
        final class ShadeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage get(int i)
                { return CTSchemeColorImpl.this.getShadeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getShadeArray(i);
                CTSchemeColorImpl.this.setShadeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
                { CTSchemeColorImpl.this.insertNewShade(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getShadeArray(i);
                CTSchemeColorImpl.this.removeShade(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfShadeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShadeList();
        }
    }
    
    /**
     * Gets array of all "shade" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getShadeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHADE$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shade" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getShadeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(SHADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shade" element
     */
    public int sizeOfShadeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHADE$2);
        }
    }
    
    /**
     * Sets array of all "shade" element
     */
    public void setShadeArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] shadeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shadeArray, SHADE$2);
        }
    }
    
    /**
     * Sets ith "shade" element
     */
    public void setShadeArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage shade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(SHADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shade);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shade" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewShade(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().insert_element_user(SHADE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shade" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewShade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().add_element_user(SHADE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "shade" element
     */
    public void removeShade(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHADE$2, i);
        }
    }
    
    /**
     * Gets a List of "comp" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform> getCompList()
    {
        final class CompList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform get(int i)
                { return CTSchemeColorImpl.this.getCompArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform old = CTSchemeColorImpl.this.getCompArray(i);
                CTSchemeColorImpl.this.setCompArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform o)
                { CTSchemeColorImpl.this.insertNewComp(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform old = CTSchemeColorImpl.this.getCompArray(i);
                CTSchemeColorImpl.this.removeComp(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfCompArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CompList();
        }
    }
    
    /**
     * Gets array of all "comp" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[] getCompArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMP$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform getCompArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform)get_store().find_element_user(COMP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comp" element
     */
    public int sizeOfCompArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMP$4);
        }
    }
    
    /**
     * Sets array of all "comp" element
     */
    public void setCompArray(org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[] compArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(compArray, COMP$4);
        }
    }
    
    /**
     * Sets ith "comp" element
     */
    public void setCompArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform comp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform)get_store().find_element_user(COMP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform insertNewComp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform)get_store().insert_element_user(COMP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform addNewComp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform)get_store().add_element_user(COMP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "comp" element
     */
    public void removeComp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMP$4, i);
        }
    }
    
    /**
     * Gets a List of "inv" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform> getInvList()
    {
        final class InvList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform get(int i)
                { return CTSchemeColorImpl.this.getInvArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform old = CTSchemeColorImpl.this.getInvArray(i);
                CTSchemeColorImpl.this.setInvArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform o)
                { CTSchemeColorImpl.this.insertNewInv(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform old = CTSchemeColorImpl.this.getInvArray(i);
                CTSchemeColorImpl.this.removeInv(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfInvArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InvList();
        }
    }
    
    /**
     * Gets array of all "inv" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[] getInvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INV$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform getInvArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform)get_store().find_element_user(INV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inv" element
     */
    public int sizeOfInvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INV$6);
        }
    }
    
    /**
     * Sets array of all "inv" element
     */
    public void setInvArray(org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[] invArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(invArray, INV$6);
        }
    }
    
    /**
     * Sets ith "inv" element
     */
    public void setInvArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform inv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform)get_store().find_element_user(INV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inv);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform insertNewInv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform)get_store().insert_element_user(INV$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform addNewInv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform)get_store().add_element_user(INV$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "inv" element
     */
    public void removeInv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INV$6, i);
        }
    }
    
    /**
     * Gets a List of "gray" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform> getGrayList()
    {
        final class GrayList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform get(int i)
                { return CTSchemeColorImpl.this.getGrayArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform old = CTSchemeColorImpl.this.getGrayArray(i);
                CTSchemeColorImpl.this.setGrayArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform o)
                { CTSchemeColorImpl.this.insertNewGray(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform old = CTSchemeColorImpl.this.getGrayArray(i);
                CTSchemeColorImpl.this.removeGray(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfGrayArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GrayList();
        }
    }
    
    /**
     * Gets array of all "gray" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[] getGrayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAY$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gray" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform getGrayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform)get_store().find_element_user(GRAY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gray" element
     */
    public int sizeOfGrayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAY$8);
        }
    }
    
    /**
     * Sets array of all "gray" element
     */
    public void setGrayArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[] grayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(grayArray, GRAY$8);
        }
    }
    
    /**
     * Sets ith "gray" element
     */
    public void setGrayArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform gray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform)get_store().find_element_user(GRAY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gray);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gray" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform insertNewGray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform)get_store().insert_element_user(GRAY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gray" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform addNewGray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform)get_store().add_element_user(GRAY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "gray" element
     */
    public void removeGray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAY$8, i);
        }
    }
    
    /**
     * Gets a List of "alpha" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getAlphaList()
    {
        final class AlphaList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage get(int i)
                { return CTSchemeColorImpl.this.getAlphaArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getAlphaArray(i);
                CTSchemeColorImpl.this.setAlphaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage o)
                { CTSchemeColorImpl.this.insertNewAlpha(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage old = CTSchemeColorImpl.this.getAlphaArray(i);
                CTSchemeColorImpl.this.removeAlpha(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfAlphaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaList();
        }
    }
    
    /**
     * Gets array of all "alpha" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getAlphaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHA$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alpha" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getAlphaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(ALPHA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alpha" element
     */
    public int sizeOfAlphaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHA$10);
        }
    }
    
    /**
     * Sets array of all "alpha" element
     */
    public void setAlphaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] alphaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaArray, ALPHA$10);
        }
    }
    
    /**
     * Sets ith "alpha" element
     */
    public void setAlphaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage alpha)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().find_element_user(ALPHA$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alpha);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alpha" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewAlpha(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().insert_element_user(ALPHA$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alpha" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewAlpha()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage)get_store().add_element_user(ALPHA$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "alpha" element
     */
    public void removeAlpha(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHA$10, i);
        }
    }
    
    /**
     * Gets a List of "alphaOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage> getAlphaOffList()
    {
        final class AlphaOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage get(int i)
                { return CTSchemeColorImpl.this.getAlphaOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage old = CTSchemeColorImpl.this.getAlphaOffArray(i);
                CTSchemeColorImpl.this.setAlphaOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage o)
                { CTSchemeColorImpl.this.insertNewAlphaOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage old = CTSchemeColorImpl.this.getAlphaOffArray(i);
                CTSchemeColorImpl.this.removeAlphaOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfAlphaOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaOffList();
        }
    }
    
    /**
     * Gets array of all "alphaOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[] getAlphaOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAOFF$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage getAlphaOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage)get_store().find_element_user(ALPHAOFF$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaOff" element
     */
    public int sizeOfAlphaOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAOFF$12);
        }
    }
    
    /**
     * Sets array of all "alphaOff" element
     */
    public void setAlphaOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[] alphaOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaOffArray, ALPHAOFF$12);
        }
    }
    
    /**
     * Sets ith "alphaOff" element
     */
    public void setAlphaOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage alphaOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage)get_store().find_element_user(ALPHAOFF$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage insertNewAlphaOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage)get_store().insert_element_user(ALPHAOFF$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage addNewAlphaOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage)get_store().add_element_user(ALPHAOFF$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaOff" element
     */
    public void removeAlphaOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAOFF$12, i);
        }
    }
    
    /**
     * Gets a List of "alphaMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage> getAlphaModList()
    {
        final class AlphaModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage get(int i)
                { return CTSchemeColorImpl.this.getAlphaModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage old = CTSchemeColorImpl.this.getAlphaModArray(i);
                CTSchemeColorImpl.this.setAlphaModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage o)
                { CTSchemeColorImpl.this.insertNewAlphaMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage old = CTSchemeColorImpl.this.getAlphaModArray(i);
                CTSchemeColorImpl.this.removeAlphaMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfAlphaModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaModList();
        }
    }
    
    /**
     * Gets array of all "alphaMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] getAlphaModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAMOD$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage getAlphaModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().find_element_user(ALPHAMOD$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaMod" element
     */
    public int sizeOfAlphaModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAMOD$14);
        }
    }
    
    /**
     * Sets array of all "alphaMod" element
     */
    public void setAlphaModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] alphaModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaModArray, ALPHAMOD$14);
        }
    }
    
    /**
     * Sets ith "alphaMod" element
     */
    public void setAlphaModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage alphaMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().find_element_user(ALPHAMOD$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage insertNewAlphaMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().insert_element_user(ALPHAMOD$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage addNewAlphaMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().add_element_user(ALPHAMOD$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaMod" element
     */
    public void removeAlphaMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAMOD$14, i);
        }
    }
    
    /**
     * Gets a List of "hue" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle> getHueList()
    {
        final class HueList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle get(int i)
                { return CTSchemeColorImpl.this.getHueArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle old = CTSchemeColorImpl.this.getHueArray(i);
                CTSchemeColorImpl.this.setHueArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle o)
                { CTSchemeColorImpl.this.insertNewHue(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle old = CTSchemeColorImpl.this.getHueArray(i);
                CTSchemeColorImpl.this.removeHue(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfHueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HueList();
        }
    }
    
    /**
     * Gets array of all "hue" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[] getHueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HUE$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle getHueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle)get_store().find_element_user(HUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hue" element
     */
    public int sizeOfHueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HUE$16);
        }
    }
    
    /**
     * Sets array of all "hue" element
     */
    public void setHueArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[] hueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hueArray, HUE$16);
        }
    }
    
    /**
     * Sets ith "hue" element
     */
    public void setHueArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle hue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle)get_store().find_element_user(HUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle insertNewHue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle)get_store().insert_element_user(HUE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle addNewHue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle)get_store().add_element_user(HUE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "hue" element
     */
    public void removeHue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HUE$16, i);
        }
    }
    
    /**
     * Gets a List of "hueOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAngle> getHueOffList()
    {
        final class HueOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAngle>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle get(int i)
                { return CTSchemeColorImpl.this.getHueOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAngle o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAngle old = CTSchemeColorImpl.this.getHueOffArray(i);
                CTSchemeColorImpl.this.setHueOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAngle o)
                { CTSchemeColorImpl.this.insertNewHueOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAngle old = CTSchemeColorImpl.this.getHueOffArray(i);
                CTSchemeColorImpl.this.removeHueOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfHueOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HueOffList();
        }
    }
    
    /**
     * Gets array of all "hueOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[] getHueOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HUEOFF$18, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle getHueOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAngle)get_store().find_element_user(HUEOFF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hueOff" element
     */
    public int sizeOfHueOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HUEOFF$18);
        }
    }
    
    /**
     * Sets array of all "hueOff" element
     */
    public void setHueOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[] hueOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hueOffArray, HUEOFF$18);
        }
    }
    
    /**
     * Sets ith "hueOff" element
     */
    public void setHueOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAngle hueOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAngle)get_store().find_element_user(HUEOFF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hueOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle insertNewHueOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAngle)get_store().insert_element_user(HUEOFF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAngle addNewHueOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAngle)get_store().add_element_user(HUEOFF$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "hueOff" element
     */
    public void removeHueOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HUEOFF$18, i);
        }
    }
    
    /**
     * Gets a List of "hueMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage> getHueModList()
    {
        final class HueModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage get(int i)
                { return CTSchemeColorImpl.this.getHueModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage old = CTSchemeColorImpl.this.getHueModArray(i);
                CTSchemeColorImpl.this.setHueModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage o)
                { CTSchemeColorImpl.this.insertNewHueMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage old = CTSchemeColorImpl.this.getHueModArray(i);
                CTSchemeColorImpl.this.removeHueMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfHueModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HueModList();
        }
    }
    
    /**
     * Gets array of all "hueMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] getHueModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HUEMOD$20, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage getHueModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().find_element_user(HUEMOD$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hueMod" element
     */
    public int sizeOfHueModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HUEMOD$20);
        }
    }
    
    /**
     * Sets array of all "hueMod" element
     */
    public void setHueModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] hueModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hueModArray, HUEMOD$20);
        }
    }
    
    /**
     * Sets ith "hueMod" element
     */
    public void setHueModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage hueMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().find_element_user(HUEMOD$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hueMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage insertNewHueMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().insert_element_user(HUEMOD$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage addNewHueMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage)get_store().add_element_user(HUEMOD$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "hueMod" element
     */
    public void removeHueMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HUEMOD$20, i);
        }
    }
    
    /**
     * Gets a List of "sat" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatList()
    {
        final class SatList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getSatArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatArray(i);
                CTSchemeColorImpl.this.setSatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewSat(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatArray(i);
                CTSchemeColorImpl.this.removeSat(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfSatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SatList();
        }
    }
    
    /**
     * Gets array of all "sat" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAT$22, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SAT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sat" element
     */
    public int sizeOfSatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAT$22);
        }
    }
    
    /**
     * Sets array of all "sat" element
     */
    public void setSatArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(satArray, SAT$22);
        }
    }
    
    /**
     * Sets ith "sat" element
     */
    public void setSatArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage sat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SAT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(SAT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(SAT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "sat" element
     */
    public void removeSat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAT$22, i);
        }
    }
    
    /**
     * Gets a List of "satOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatOffList()
    {
        final class SatOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getSatOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatOffArray(i);
                CTSchemeColorImpl.this.setSatOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewSatOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatOffArray(i);
                CTSchemeColorImpl.this.removeSatOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfSatOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SatOffList();
        }
    }
    
    /**
     * Gets array of all "satOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SATOFF$24, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "satOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SATOFF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "satOff" element
     */
    public int sizeOfSatOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATOFF$24);
        }
    }
    
    /**
     * Sets array of all "satOff" element
     */
    public void setSatOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(satOffArray, SATOFF$24);
        }
    }
    
    /**
     * Sets ith "satOff" element
     */
    public void setSatOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage satOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SATOFF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(satOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSatOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(SATOFF$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSatOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(SATOFF$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "satOff" element
     */
    public void removeSatOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATOFF$24, i);
        }
    }
    
    /**
     * Gets a List of "satMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatModList()
    {
        final class SatModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getSatModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatModArray(i);
                CTSchemeColorImpl.this.setSatModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewSatMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getSatModArray(i);
                CTSchemeColorImpl.this.removeSatMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfSatModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SatModList();
        }
    }
    
    /**
     * Gets array of all "satMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SATMOD$26, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "satMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SATMOD$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "satMod" element
     */
    public int sizeOfSatModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATMOD$26);
        }
    }
    
    /**
     * Sets array of all "satMod" element
     */
    public void setSatModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(satModArray, SATMOD$26);
        }
    }
    
    /**
     * Sets ith "satMod" element
     */
    public void setSatModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage satMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(SATMOD$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(satMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSatMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(SATMOD$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSatMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(SATMOD$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "satMod" element
     */
    public void removeSatMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATMOD$26, i);
        }
    }
    
    /**
     * Gets a List of "lum" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumList()
    {
        final class LumList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getLumArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumArray(i);
                CTSchemeColorImpl.this.setLumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewLum(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumArray(i);
                CTSchemeColorImpl.this.removeLum(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfLumArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LumList();
        }
    }
    
    /**
     * Gets array of all "lum" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LUM$28, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUM$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lum" element
     */
    public int sizeOfLumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LUM$28);
        }
    }
    
    /**
     * Sets array of all "lum" element
     */
    public void setLumArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lumArray, LUM$28);
        }
    }
    
    /**
     * Sets ith "lum" element
     */
    public void setLumArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUM$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lum);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(LUM$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(LUM$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "lum" element
     */
    public void removeLum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LUM$28, i);
        }
    }
    
    /**
     * Gets a List of "lumOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumOffList()
    {
        final class LumOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getLumOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumOffArray(i);
                CTSchemeColorImpl.this.setLumOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewLumOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumOffArray(i);
                CTSchemeColorImpl.this.removeLumOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfLumOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LumOffList();
        }
    }
    
    /**
     * Gets array of all "lumOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LUMOFF$30, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lumOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUMOFF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lumOff" element
     */
    public int sizeOfLumOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LUMOFF$30);
        }
    }
    
    /**
     * Sets array of all "lumOff" element
     */
    public void setLumOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lumOffArray, LUMOFF$30);
        }
    }
    
    /**
     * Sets ith "lumOff" element
     */
    public void setLumOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lumOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUMOFF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lumOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLumOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(LUMOFF$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lumOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLumOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(LUMOFF$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "lumOff" element
     */
    public void removeLumOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LUMOFF$30, i);
        }
    }
    
    /**
     * Gets a List of "lumMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumModList()
    {
        final class LumModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getLumModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumModArray(i);
                CTSchemeColorImpl.this.setLumModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewLumMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getLumModArray(i);
                CTSchemeColorImpl.this.removeLumMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfLumModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LumModList();
        }
    }
    
    /**
     * Gets array of all "lumMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LUMMOD$32, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lumMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUMMOD$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lumMod" element
     */
    public int sizeOfLumModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LUMMOD$32);
        }
    }
    
    /**
     * Sets array of all "lumMod" element
     */
    public void setLumModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lumModArray, LUMMOD$32);
        }
    }
    
    /**
     * Sets ith "lumMod" element
     */
    public void setLumModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lumMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(LUMMOD$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lumMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLumMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(LUMMOD$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lumMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLumMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(LUMMOD$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "lumMod" element
     */
    public void removeLumMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LUMMOD$32, i);
        }
    }
    
    /**
     * Gets a List of "red" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedList()
    {
        final class RedList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getRedArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedArray(i);
                CTSchemeColorImpl.this.setRedArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewRed(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedArray(i);
                CTSchemeColorImpl.this.removeRed(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfRedArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RedList();
        }
    }
    
    /**
     * Gets array of all "red" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RED$34, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "red" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(RED$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "red" element
     */
    public int sizeOfRedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RED$34);
        }
    }
    
    /**
     * Sets array of all "red" element
     */
    public void setRedArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(redArray, RED$34);
        }
    }
    
    /**
     * Sets ith "red" element
     */
    public void setRedArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage red)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(RED$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(red);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "red" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(RED$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "red" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(RED$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "red" element
     */
    public void removeRed(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RED$34, i);
        }
    }
    
    /**
     * Gets a List of "redOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedOffList()
    {
        final class RedOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getRedOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedOffArray(i);
                CTSchemeColorImpl.this.setRedOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewRedOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedOffArray(i);
                CTSchemeColorImpl.this.removeRedOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfRedOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RedOffList();
        }
    }
    
    /**
     * Gets array of all "redOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REDOFF$36, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "redOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(REDOFF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "redOff" element
     */
    public int sizeOfRedOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REDOFF$36);
        }
    }
    
    /**
     * Sets array of all "redOff" element
     */
    public void setRedOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(redOffArray, REDOFF$36);
        }
    }
    
    /**
     * Sets ith "redOff" element
     */
    public void setRedOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage redOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(REDOFF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(redOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRedOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(REDOFF$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRedOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(REDOFF$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "redOff" element
     */
    public void removeRedOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REDOFF$36, i);
        }
    }
    
    /**
     * Gets a List of "redMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedModList()
    {
        final class RedModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getRedModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedModArray(i);
                CTSchemeColorImpl.this.setRedModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewRedMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getRedModArray(i);
                CTSchemeColorImpl.this.removeRedMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfRedModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RedModList();
        }
    }
    
    /**
     * Gets array of all "redMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REDMOD$38, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "redMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(REDMOD$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "redMod" element
     */
    public int sizeOfRedModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REDMOD$38);
        }
    }
    
    /**
     * Sets array of all "redMod" element
     */
    public void setRedModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(redModArray, REDMOD$38);
        }
    }
    
    /**
     * Sets ith "redMod" element
     */
    public void setRedModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage redMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(REDMOD$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(redMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRedMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(REDMOD$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRedMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(REDMOD$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "redMod" element
     */
    public void removeRedMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REDMOD$38, i);
        }
    }
    
    /**
     * Gets a List of "green" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenList()
    {
        final class GreenList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getGreenArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenArray(i);
                CTSchemeColorImpl.this.setGreenArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewGreen(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenArray(i);
                CTSchemeColorImpl.this.removeGreen(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfGreenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GreenList();
        }
    }
    
    /**
     * Gets array of all "green" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GREEN$40, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "green" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREEN$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "green" element
     */
    public int sizeOfGreenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GREEN$40);
        }
    }
    
    /**
     * Sets array of all "green" element
     */
    public void setGreenArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(greenArray, GREEN$40);
        }
    }
    
    /**
     * Sets ith "green" element
     */
    public void setGreenArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage green)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREEN$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(green);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "green" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(GREEN$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "green" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(GREEN$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "green" element
     */
    public void removeGreen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GREEN$40, i);
        }
    }
    
    /**
     * Gets a List of "greenOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenOffList()
    {
        final class GreenOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getGreenOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenOffArray(i);
                CTSchemeColorImpl.this.setGreenOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewGreenOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenOffArray(i);
                CTSchemeColorImpl.this.removeGreenOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfGreenOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GreenOffList();
        }
    }
    
    /**
     * Gets array of all "greenOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GREENOFF$42, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "greenOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREENOFF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "greenOff" element
     */
    public int sizeOfGreenOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GREENOFF$42);
        }
    }
    
    /**
     * Sets array of all "greenOff" element
     */
    public void setGreenOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(greenOffArray, GREENOFF$42);
        }
    }
    
    /**
     * Sets ith "greenOff" element
     */
    public void setGreenOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage greenOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREENOFF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(greenOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "greenOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreenOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(GREENOFF$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "greenOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreenOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(GREENOFF$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "greenOff" element
     */
    public void removeGreenOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GREENOFF$42, i);
        }
    }
    
    /**
     * Gets a List of "greenMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenModList()
    {
        final class GreenModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getGreenModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenModArray(i);
                CTSchemeColorImpl.this.setGreenModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewGreenMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getGreenModArray(i);
                CTSchemeColorImpl.this.removeGreenMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfGreenModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GreenModList();
        }
    }
    
    /**
     * Gets array of all "greenMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GREENMOD$44, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "greenMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREENMOD$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "greenMod" element
     */
    public int sizeOfGreenModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GREENMOD$44);
        }
    }
    
    /**
     * Sets array of all "greenMod" element
     */
    public void setGreenModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(greenModArray, GREENMOD$44);
        }
    }
    
    /**
     * Sets ith "greenMod" element
     */
    public void setGreenModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage greenMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(GREENMOD$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(greenMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "greenMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreenMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(GREENMOD$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "greenMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreenMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(GREENMOD$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "greenMod" element
     */
    public void removeGreenMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GREENMOD$44, i);
        }
    }
    
    /**
     * Gets a List of "blue" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueList()
    {
        final class BlueList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getBlueArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueArray(i);
                CTSchemeColorImpl.this.setBlueArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewBlue(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueArray(i);
                CTSchemeColorImpl.this.removeBlue(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfBlueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlueList();
        }
    }
    
    /**
     * Gets array of all "blue" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLUE$46, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUE$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blue" element
     */
    public int sizeOfBlueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLUE$46);
        }
    }
    
    /**
     * Sets array of all "blue" element
     */
    public void setBlueArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blueArray, BLUE$46);
        }
    }
    
    /**
     * Sets ith "blue" element
     */
    public void setBlueArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUE$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(BLUE$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blue" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(BLUE$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "blue" element
     */
    public void removeBlue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLUE$46, i);
        }
    }
    
    /**
     * Gets a List of "blueOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueOffList()
    {
        final class BlueOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getBlueOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueOffArray(i);
                CTSchemeColorImpl.this.setBlueOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewBlueOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueOffArray(i);
                CTSchemeColorImpl.this.removeBlueOff(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfBlueOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlueOffList();
        }
    }
    
    /**
     * Gets array of all "blueOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLUEOFF$48, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUEOFF$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blueOff" element
     */
    public int sizeOfBlueOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLUEOFF$48);
        }
    }
    
    /**
     * Sets array of all "blueOff" element
     */
    public void setBlueOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blueOffArray, BLUEOFF$48);
        }
    }
    
    /**
     * Sets ith "blueOff" element
     */
    public void setBlueOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blueOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUEOFF$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blueOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlueOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(BLUEOFF$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blueOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlueOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(BLUEOFF$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "blueOff" element
     */
    public void removeBlueOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLUEOFF$48, i);
        }
    }
    
    /**
     * Gets a List of "blueMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueModList()
    {
        final class BlueModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage get(int i)
                { return CTSchemeColorImpl.this.getBlueModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueModArray(i);
                CTSchemeColorImpl.this.setBlueModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage o)
                { CTSchemeColorImpl.this.insertNewBlueMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage old = CTSchemeColorImpl.this.getBlueModArray(i);
                CTSchemeColorImpl.this.removeBlueMod(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfBlueModArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlueModList();
        }
    }
    
    /**
     * Gets array of all "blueMod" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLUEMOD$50, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUEMOD$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blueMod" element
     */
    public int sizeOfBlueModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLUEMOD$50);
        }
    }
    
    /**
     * Sets array of all "blueMod" element
     */
    public void setBlueModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blueModArray, BLUEMOD$50);
        }
    }
    
    /**
     * Sets ith "blueMod" element
     */
    public void setBlueModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blueMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().find_element_user(BLUEMOD$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blueMod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlueMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().insert_element_user(BLUEMOD$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blueMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlueMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage)get_store().add_element_user(BLUEMOD$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "blueMod" element
     */
    public void removeBlueMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLUEMOD$50, i);
        }
    }
    
    /**
     * Gets a List of "gamma" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform> getGammaList()
    {
        final class GammaList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform get(int i)
                { return CTSchemeColorImpl.this.getGammaArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform old = CTSchemeColorImpl.this.getGammaArray(i);
                CTSchemeColorImpl.this.setGammaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform o)
                { CTSchemeColorImpl.this.insertNewGamma(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform old = CTSchemeColorImpl.this.getGammaArray(i);
                CTSchemeColorImpl.this.removeGamma(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfGammaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GammaList();
        }
    }
    
    /**
     * Gets array of all "gamma" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[] getGammaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GAMMA$52, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform getGammaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform)get_store().find_element_user(GAMMA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gamma" element
     */
    public int sizeOfGammaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GAMMA$52);
        }
    }
    
    /**
     * Sets array of all "gamma" element
     */
    public void setGammaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[] gammaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gammaArray, GAMMA$52);
        }
    }
    
    /**
     * Sets ith "gamma" element
     */
    public void setGammaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform gamma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform)get_store().find_element_user(GAMMA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gamma);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform insertNewGamma(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform)get_store().insert_element_user(GAMMA$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform addNewGamma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform)get_store().add_element_user(GAMMA$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "gamma" element
     */
    public void removeGamma(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GAMMA$52, i);
        }
    }
    
    /**
     * Gets a List of "invGamma" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform> getInvGammaList()
    {
        final class InvGammaList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform get(int i)
                { return CTSchemeColorImpl.this.getInvGammaArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform old = CTSchemeColorImpl.this.getInvGammaArray(i);
                CTSchemeColorImpl.this.setInvGammaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform o)
                { CTSchemeColorImpl.this.insertNewInvGamma(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform old = CTSchemeColorImpl.this.getInvGammaArray(i);
                CTSchemeColorImpl.this.removeInvGamma(i);
                return old;
            }
            
            public int size()
                { return CTSchemeColorImpl.this.sizeOfInvGammaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InvGammaList();
        }
    }
    
    /**
     * Gets array of all "invGamma" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[] getInvGammaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INVGAMMA$54, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "invGamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform getInvGammaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform)get_store().find_element_user(INVGAMMA$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "invGamma" element
     */
    public int sizeOfInvGammaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVGAMMA$54);
        }
    }
    
    /**
     * Sets array of all "invGamma" element
     */
    public void setInvGammaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[] invGammaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(invGammaArray, INVGAMMA$54);
        }
    }
    
    /**
     * Sets ith "invGamma" element
     */
    public void setInvGammaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform invGamma)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform)get_store().find_element_user(INVGAMMA$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(invGamma);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "invGamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform insertNewInvGamma(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform)get_store().insert_element_user(INVGAMMA$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "invGamma" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform addNewInvGamma()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform)get_store().add_element_user(INVGAMMA$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "invGamma" element
     */
    public void removeInvGamma(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVGAMMA$54, i);
        }
    }
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal.Enum getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$56);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal)get_store().find_attribute_user(VAL$56);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal.Enum val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$56);
            }
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal)get_store().find_attribute_user(VAL$56);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STSchemeColorVal)get_store().add_attribute_user(VAL$56);
            }
            target.set(val);
        }
    }
}
