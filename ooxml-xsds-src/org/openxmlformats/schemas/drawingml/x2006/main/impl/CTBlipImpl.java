/*
 * XML Type:  CT_Blip
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBlip
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Blip(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBlipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTBlip
{
    
    public CTBlipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALPHABILEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaBiLevel");
    private static final javax.xml.namespace.QName ALPHACEILING$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaCeiling");
    private static final javax.xml.namespace.QName ALPHAFLOOR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaFloor");
    private static final javax.xml.namespace.QName ALPHAINV$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaInv");
    private static final javax.xml.namespace.QName ALPHAMOD$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
    private static final javax.xml.namespace.QName ALPHAMODFIX$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaModFix");
    private static final javax.xml.namespace.QName ALPHAREPL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaRepl");
    private static final javax.xml.namespace.QName BILEVEL$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "biLevel");
    private static final javax.xml.namespace.QName BLUR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blur");
    private static final javax.xml.namespace.QName CLRCHANGE$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrChange");
    private static final javax.xml.namespace.QName CLRREPL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrRepl");
    private static final javax.xml.namespace.QName DUOTONE$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "duotone");
    private static final javax.xml.namespace.QName FILLOVERLAY$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillOverlay");
    private static final javax.xml.namespace.QName GRAYSCL$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grayscl");
    private static final javax.xml.namespace.QName HSL$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hsl");
    private static final javax.xml.namespace.QName LUM$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
    private static final javax.xml.namespace.QName TINT$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
    private static final javax.xml.namespace.QName EXTLST$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName EMBED$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "embed");
    private static final javax.xml.namespace.QName LINK$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "link");
    private static final javax.xml.namespace.QName CSTATE$40 = 
        new javax.xml.namespace.QName("", "cstate");
    
    
    /**
     * Gets a List of "alphaBiLevel" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect> getAlphaBiLevelList()
    {
        final class AlphaBiLevelList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect get(int i)
                { return CTBlipImpl.this.getAlphaBiLevelArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect old = CTBlipImpl.this.getAlphaBiLevelArray(i);
                CTBlipImpl.this.setAlphaBiLevelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect o)
                { CTBlipImpl.this.insertNewAlphaBiLevel(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect old = CTBlipImpl.this.getAlphaBiLevelArray(i);
                CTBlipImpl.this.removeAlphaBiLevel(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaBiLevelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaBiLevelList();
        }
    }
    
    /**
     * Gets array of all "alphaBiLevel" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect[] getAlphaBiLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHABILEVEL$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaBiLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect getAlphaBiLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().find_element_user(ALPHABILEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaBiLevel" element
     */
    public int sizeOfAlphaBiLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHABILEVEL$0);
        }
    }
    
    /**
     * Sets array of all "alphaBiLevel" element
     */
    public void setAlphaBiLevelArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect[] alphaBiLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaBiLevelArray, ALPHABILEVEL$0);
        }
    }
    
    /**
     * Sets ith "alphaBiLevel" element
     */
    public void setAlphaBiLevelArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect alphaBiLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().find_element_user(ALPHABILEVEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaBiLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaBiLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect insertNewAlphaBiLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().insert_element_user(ALPHABILEVEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaBiLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect addNewAlphaBiLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().add_element_user(ALPHABILEVEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaBiLevel" element
     */
    public void removeAlphaBiLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHABILEVEL$0, i);
        }
    }
    
    /**
     * Gets a List of "alphaCeiling" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect> getAlphaCeilingList()
    {
        final class AlphaCeilingList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect get(int i)
                { return CTBlipImpl.this.getAlphaCeilingArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect old = CTBlipImpl.this.getAlphaCeilingArray(i);
                CTBlipImpl.this.setAlphaCeilingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect o)
                { CTBlipImpl.this.insertNewAlphaCeiling(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect old = CTBlipImpl.this.getAlphaCeilingArray(i);
                CTBlipImpl.this.removeAlphaCeiling(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaCeilingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaCeilingList();
        }
    }
    
    /**
     * Gets array of all "alphaCeiling" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect[] getAlphaCeilingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHACEILING$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaCeiling" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect getAlphaCeilingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().find_element_user(ALPHACEILING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaCeiling" element
     */
    public int sizeOfAlphaCeilingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHACEILING$2);
        }
    }
    
    /**
     * Sets array of all "alphaCeiling" element
     */
    public void setAlphaCeilingArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect[] alphaCeilingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaCeilingArray, ALPHACEILING$2);
        }
    }
    
    /**
     * Sets ith "alphaCeiling" element
     */
    public void setAlphaCeilingArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect alphaCeiling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().find_element_user(ALPHACEILING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaCeiling);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaCeiling" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect insertNewAlphaCeiling(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().insert_element_user(ALPHACEILING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaCeiling" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect addNewAlphaCeiling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().add_element_user(ALPHACEILING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaCeiling" element
     */
    public void removeAlphaCeiling(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHACEILING$2, i);
        }
    }
    
    /**
     * Gets a List of "alphaFloor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect> getAlphaFloorList()
    {
        final class AlphaFloorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect get(int i)
                { return CTBlipImpl.this.getAlphaFloorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect old = CTBlipImpl.this.getAlphaFloorArray(i);
                CTBlipImpl.this.setAlphaFloorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect o)
                { CTBlipImpl.this.insertNewAlphaFloor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect old = CTBlipImpl.this.getAlphaFloorArray(i);
                CTBlipImpl.this.removeAlphaFloor(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaFloorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaFloorList();
        }
    }
    
    /**
     * Gets array of all "alphaFloor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect[] getAlphaFloorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAFLOOR$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaFloor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect getAlphaFloorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().find_element_user(ALPHAFLOOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaFloor" element
     */
    public int sizeOfAlphaFloorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAFLOOR$4);
        }
    }
    
    /**
     * Sets array of all "alphaFloor" element
     */
    public void setAlphaFloorArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect[] alphaFloorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaFloorArray, ALPHAFLOOR$4);
        }
    }
    
    /**
     * Sets ith "alphaFloor" element
     */
    public void setAlphaFloorArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect alphaFloor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().find_element_user(ALPHAFLOOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaFloor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaFloor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect insertNewAlphaFloor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().insert_element_user(ALPHAFLOOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaFloor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect addNewAlphaFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().add_element_user(ALPHAFLOOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaFloor" element
     */
    public void removeAlphaFloor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAFLOOR$4, i);
        }
    }
    
    /**
     * Gets a List of "alphaInv" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect> getAlphaInvList()
    {
        final class AlphaInvList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect get(int i)
                { return CTBlipImpl.this.getAlphaInvArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect old = CTBlipImpl.this.getAlphaInvArray(i);
                CTBlipImpl.this.setAlphaInvArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect o)
                { CTBlipImpl.this.insertNewAlphaInv(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect old = CTBlipImpl.this.getAlphaInvArray(i);
                CTBlipImpl.this.removeAlphaInv(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaInvArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaInvList();
        }
    }
    
    /**
     * Gets array of all "alphaInv" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect[] getAlphaInvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAINV$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaInv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect getAlphaInvArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().find_element_user(ALPHAINV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaInv" element
     */
    public int sizeOfAlphaInvArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAINV$6);
        }
    }
    
    /**
     * Sets array of all "alphaInv" element
     */
    public void setAlphaInvArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect[] alphaInvArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaInvArray, ALPHAINV$6);
        }
    }
    
    /**
     * Sets ith "alphaInv" element
     */
    public void setAlphaInvArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect alphaInv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().find_element_user(ALPHAINV$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaInv);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaInv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect insertNewAlphaInv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().insert_element_user(ALPHAINV$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaInv" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect addNewAlphaInv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().add_element_user(ALPHAINV$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaInv" element
     */
    public void removeAlphaInv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAINV$6, i);
        }
    }
    
    /**
     * Gets a List of "alphaMod" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect> getAlphaModList()
    {
        final class AlphaModList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect get(int i)
                { return CTBlipImpl.this.getAlphaModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect old = CTBlipImpl.this.getAlphaModArray(i);
                CTBlipImpl.this.setAlphaModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect o)
                { CTBlipImpl.this.insertNewAlphaMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect old = CTBlipImpl.this.getAlphaModArray(i);
                CTBlipImpl.this.removeAlphaMod(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaModArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect[] getAlphaModArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAMOD$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect getAlphaModArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().find_element_user(ALPHAMOD$8, i);
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
            return get_store().count_elements(ALPHAMOD$8);
        }
    }
    
    /**
     * Sets array of all "alphaMod" element
     */
    public void setAlphaModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect[] alphaModArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaModArray, ALPHAMOD$8);
        }
    }
    
    /**
     * Sets ith "alphaMod" element
     */
    public void setAlphaModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect alphaMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().find_element_user(ALPHAMOD$8, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect insertNewAlphaMod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().insert_element_user(ALPHAMOD$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaMod" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect addNewAlphaMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().add_element_user(ALPHAMOD$8);
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
            get_store().remove_element(ALPHAMOD$8, i);
        }
    }
    
    /**
     * Gets a List of "alphaModFix" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect> getAlphaModFixList()
    {
        final class AlphaModFixList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect get(int i)
                { return CTBlipImpl.this.getAlphaModFixArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect old = CTBlipImpl.this.getAlphaModFixArray(i);
                CTBlipImpl.this.setAlphaModFixArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect o)
                { CTBlipImpl.this.insertNewAlphaModFix(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect old = CTBlipImpl.this.getAlphaModFixArray(i);
                CTBlipImpl.this.removeAlphaModFix(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaModFixArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaModFixList();
        }
    }
    
    /**
     * Gets array of all "alphaModFix" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect[] getAlphaModFixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAMODFIX$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaModFix" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect getAlphaModFixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().find_element_user(ALPHAMODFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaModFix" element
     */
    public int sizeOfAlphaModFixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAMODFIX$10);
        }
    }
    
    /**
     * Sets array of all "alphaModFix" element
     */
    public void setAlphaModFixArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect[] alphaModFixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaModFixArray, ALPHAMODFIX$10);
        }
    }
    
    /**
     * Sets ith "alphaModFix" element
     */
    public void setAlphaModFixArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect alphaModFix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().find_element_user(ALPHAMODFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaModFix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaModFix" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect insertNewAlphaModFix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().insert_element_user(ALPHAMODFIX$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaModFix" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect addNewAlphaModFix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().add_element_user(ALPHAMODFIX$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaModFix" element
     */
    public void removeAlphaModFix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAMODFIX$10, i);
        }
    }
    
    /**
     * Gets a List of "alphaRepl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect> getAlphaReplList()
    {
        final class AlphaReplList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect get(int i)
                { return CTBlipImpl.this.getAlphaReplArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect old = CTBlipImpl.this.getAlphaReplArray(i);
                CTBlipImpl.this.setAlphaReplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect o)
                { CTBlipImpl.this.insertNewAlphaRepl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect old = CTBlipImpl.this.getAlphaReplArray(i);
                CTBlipImpl.this.removeAlphaRepl(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfAlphaReplArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaReplList();
        }
    }
    
    /**
     * Gets array of all "alphaRepl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect[] getAlphaReplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAREPL$12, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect getAlphaReplArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().find_element_user(ALPHAREPL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaRepl" element
     */
    public int sizeOfAlphaReplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAREPL$12);
        }
    }
    
    /**
     * Sets array of all "alphaRepl" element
     */
    public void setAlphaReplArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect[] alphaReplArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaReplArray, ALPHAREPL$12);
        }
    }
    
    /**
     * Sets ith "alphaRepl" element
     */
    public void setAlphaReplArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect alphaRepl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().find_element_user(ALPHAREPL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaRepl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect insertNewAlphaRepl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().insert_element_user(ALPHAREPL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect addNewAlphaRepl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().add_element_user(ALPHAREPL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaRepl" element
     */
    public void removeAlphaRepl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAREPL$12, i);
        }
    }
    
    /**
     * Gets a List of "biLevel" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect> getBiLevelList()
    {
        final class BiLevelList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect get(int i)
                { return CTBlipImpl.this.getBiLevelArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect old = CTBlipImpl.this.getBiLevelArray(i);
                CTBlipImpl.this.setBiLevelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect o)
                { CTBlipImpl.this.insertNewBiLevel(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect old = CTBlipImpl.this.getBiLevelArray(i);
                CTBlipImpl.this.removeBiLevel(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfBiLevelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BiLevelList();
        }
    }
    
    /**
     * Gets array of all "biLevel" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect[] getBiLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BILEVEL$14, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "biLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect getBiLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().find_element_user(BILEVEL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "biLevel" element
     */
    public int sizeOfBiLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILEVEL$14);
        }
    }
    
    /**
     * Sets array of all "biLevel" element
     */
    public void setBiLevelArray(org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect[] biLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(biLevelArray, BILEVEL$14);
        }
    }
    
    /**
     * Sets ith "biLevel" element
     */
    public void setBiLevelArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect biLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().find_element_user(BILEVEL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(biLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "biLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect insertNewBiLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().insert_element_user(BILEVEL$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "biLevel" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect addNewBiLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().add_element_user(BILEVEL$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "biLevel" element
     */
    public void removeBiLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILEVEL$14, i);
        }
    }
    
    /**
     * Gets a List of "blur" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect> getBlurList()
    {
        final class BlurList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect get(int i)
                { return CTBlipImpl.this.getBlurArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect old = CTBlipImpl.this.getBlurArray(i);
                CTBlipImpl.this.setBlurArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect o)
                { CTBlipImpl.this.insertNewBlur(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect old = CTBlipImpl.this.getBlurArray(i);
                CTBlipImpl.this.removeBlur(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfBlurArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlurList();
        }
    }
    
    /**
     * Gets array of all "blur" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect[] getBlurArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLUR$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blur" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect getBlurArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blur" element
     */
    public int sizeOfBlurArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLUR$16);
        }
    }
    
    /**
     * Sets array of all "blur" element
     */
    public void setBlurArray(org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect[] blurArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blurArray, BLUR$16);
        }
    }
    
    /**
     * Sets ith "blur" element
     */
    public void setBlurArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect blur)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blur);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blur" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect insertNewBlur(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().insert_element_user(BLUR$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blur" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect addNewBlur()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().add_element_user(BLUR$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "blur" element
     */
    public void removeBlur(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLUR$16, i);
        }
    }
    
    /**
     * Gets a List of "clrChange" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect> getClrChangeList()
    {
        final class ClrChangeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect get(int i)
                { return CTBlipImpl.this.getClrChangeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect old = CTBlipImpl.this.getClrChangeArray(i);
                CTBlipImpl.this.setClrChangeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect o)
                { CTBlipImpl.this.insertNewClrChange(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect old = CTBlipImpl.this.getClrChangeArray(i);
                CTBlipImpl.this.removeClrChange(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfClrChangeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClrChangeList();
        }
    }
    
    /**
     * Gets array of all "clrChange" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect[] getClrChangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLRCHANGE$18, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clrChange" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect getClrChangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().find_element_user(CLRCHANGE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "clrChange" element
     */
    public int sizeOfClrChangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRCHANGE$18);
        }
    }
    
    /**
     * Sets array of all "clrChange" element
     */
    public void setClrChangeArray(org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect[] clrChangeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clrChangeArray, CLRCHANGE$18);
        }
    }
    
    /**
     * Sets ith "clrChange" element
     */
    public void setClrChangeArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect clrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().find_element_user(CLRCHANGE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clrChange);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clrChange" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect insertNewClrChange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().insert_element_user(CLRCHANGE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clrChange" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect addNewClrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().add_element_user(CLRCHANGE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "clrChange" element
     */
    public void removeClrChange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRCHANGE$18, i);
        }
    }
    
    /**
     * Gets a List of "clrRepl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect> getClrReplList()
    {
        final class ClrReplList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect get(int i)
                { return CTBlipImpl.this.getClrReplArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect old = CTBlipImpl.this.getClrReplArray(i);
                CTBlipImpl.this.setClrReplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect o)
                { CTBlipImpl.this.insertNewClrRepl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect old = CTBlipImpl.this.getClrReplArray(i);
                CTBlipImpl.this.removeClrRepl(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfClrReplArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClrReplList();
        }
    }
    
    /**
     * Gets array of all "clrRepl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect[] getClrReplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLRREPL$20, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clrRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect getClrReplArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().find_element_user(CLRREPL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "clrRepl" element
     */
    public int sizeOfClrReplArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRREPL$20);
        }
    }
    
    /**
     * Sets array of all "clrRepl" element
     */
    public void setClrReplArray(org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect[] clrReplArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clrReplArray, CLRREPL$20);
        }
    }
    
    /**
     * Sets ith "clrRepl" element
     */
    public void setClrReplArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect clrRepl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().find_element_user(CLRREPL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clrRepl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clrRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect insertNewClrRepl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().insert_element_user(CLRREPL$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clrRepl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect addNewClrRepl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().add_element_user(CLRREPL$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "clrRepl" element
     */
    public void removeClrRepl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRREPL$20, i);
        }
    }
    
    /**
     * Gets a List of "duotone" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect> getDuotoneList()
    {
        final class DuotoneList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect get(int i)
                { return CTBlipImpl.this.getDuotoneArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect old = CTBlipImpl.this.getDuotoneArray(i);
                CTBlipImpl.this.setDuotoneArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect o)
                { CTBlipImpl.this.insertNewDuotone(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect old = CTBlipImpl.this.getDuotoneArray(i);
                CTBlipImpl.this.removeDuotone(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfDuotoneArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DuotoneList();
        }
    }
    
    /**
     * Gets array of all "duotone" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect[] getDuotoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DUOTONE$22, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "duotone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect getDuotoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().find_element_user(DUOTONE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "duotone" element
     */
    public int sizeOfDuotoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DUOTONE$22);
        }
    }
    
    /**
     * Sets array of all "duotone" element
     */
    public void setDuotoneArray(org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect[] duotoneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(duotoneArray, DUOTONE$22);
        }
    }
    
    /**
     * Sets ith "duotone" element
     */
    public void setDuotoneArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect duotone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().find_element_user(DUOTONE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(duotone);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "duotone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect insertNewDuotone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().insert_element_user(DUOTONE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "duotone" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect addNewDuotone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().add_element_user(DUOTONE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "duotone" element
     */
    public void removeDuotone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DUOTONE$22, i);
        }
    }
    
    /**
     * Gets a List of "fillOverlay" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect> getFillOverlayList()
    {
        final class FillOverlayList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect get(int i)
                { return CTBlipImpl.this.getFillOverlayArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect old = CTBlipImpl.this.getFillOverlayArray(i);
                CTBlipImpl.this.setFillOverlayArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect o)
                { CTBlipImpl.this.insertNewFillOverlay(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect old = CTBlipImpl.this.getFillOverlayArray(i);
                CTBlipImpl.this.removeFillOverlay(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfFillOverlayArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FillOverlayList();
        }
    }
    
    /**
     * Gets array of all "fillOverlay" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect[] getFillOverlayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILLOVERLAY$24, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fillOverlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect getFillOverlayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fillOverlay" element
     */
    public int sizeOfFillOverlayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLOVERLAY$24);
        }
    }
    
    /**
     * Sets array of all "fillOverlay" element
     */
    public void setFillOverlayArray(org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect[] fillOverlayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fillOverlayArray, FILLOVERLAY$24);
        }
    }
    
    /**
     * Sets ith "fillOverlay" element
     */
    public void setFillOverlayArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect fillOverlay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fillOverlay);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fillOverlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect insertNewFillOverlay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().insert_element_user(FILLOVERLAY$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fillOverlay" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect addNewFillOverlay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().add_element_user(FILLOVERLAY$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "fillOverlay" element
     */
    public void removeFillOverlay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLOVERLAY$24, i);
        }
    }
    
    /**
     * Gets a List of "grayscl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect> getGraysclList()
    {
        final class GraysclList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect get(int i)
                { return CTBlipImpl.this.getGraysclArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect old = CTBlipImpl.this.getGraysclArray(i);
                CTBlipImpl.this.setGraysclArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect o)
                { CTBlipImpl.this.insertNewGrayscl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect old = CTBlipImpl.this.getGraysclArray(i);
                CTBlipImpl.this.removeGrayscl(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfGraysclArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GraysclList();
        }
    }
    
    /**
     * Gets array of all "grayscl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect[] getGraysclArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAYSCL$26, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grayscl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect getGraysclArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().find_element_user(GRAYSCL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "grayscl" element
     */
    public int sizeOfGraysclArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAYSCL$26);
        }
    }
    
    /**
     * Sets array of all "grayscl" element
     */
    public void setGraysclArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect[] graysclArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(graysclArray, GRAYSCL$26);
        }
    }
    
    /**
     * Sets ith "grayscl" element
     */
    public void setGraysclArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect grayscl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().find_element_user(GRAYSCL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(grayscl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grayscl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect insertNewGrayscl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().insert_element_user(GRAYSCL$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grayscl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect addNewGrayscl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().add_element_user(GRAYSCL$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "grayscl" element
     */
    public void removeGrayscl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAYSCL$26, i);
        }
    }
    
    /**
     * Gets a List of "hsl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect> getHslList()
    {
        final class HslList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect get(int i)
                { return CTBlipImpl.this.getHslArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect old = CTBlipImpl.this.getHslArray(i);
                CTBlipImpl.this.setHslArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect o)
                { CTBlipImpl.this.insertNewHsl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect old = CTBlipImpl.this.getHslArray(i);
                CTBlipImpl.this.removeHsl(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfHslArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HslList();
        }
    }
    
    /**
     * Gets array of all "hsl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect[] getHslArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HSL$28, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hsl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect getHslArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().find_element_user(HSL$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hsl" element
     */
    public int sizeOfHslArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HSL$28);
        }
    }
    
    /**
     * Sets array of all "hsl" element
     */
    public void setHslArray(org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect[] hslArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hslArray, HSL$28);
        }
    }
    
    /**
     * Sets ith "hsl" element
     */
    public void setHslArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect hsl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().find_element_user(HSL$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hsl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hsl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect insertNewHsl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().insert_element_user(HSL$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hsl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect addNewHsl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().add_element_user(HSL$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "hsl" element
     */
    public void removeHsl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HSL$28, i);
        }
    }
    
    /**
     * Gets a List of "lum" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect> getLumList()
    {
        final class LumList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect get(int i)
                { return CTBlipImpl.this.getLumArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect old = CTBlipImpl.this.getLumArray(i);
                CTBlipImpl.this.setLumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect o)
                { CTBlipImpl.this.insertNewLum(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect old = CTBlipImpl.this.getLumArray(i);
                CTBlipImpl.this.removeLum(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfLumArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect[] getLumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LUM$30, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect getLumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().find_element_user(LUM$30, i);
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
            return get_store().count_elements(LUM$30);
        }
    }
    
    /**
     * Sets array of all "lum" element
     */
    public void setLumArray(org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect[] lumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lumArray, LUM$30);
        }
    }
    
    /**
     * Sets ith "lum" element
     */
    public void setLumArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect lum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().find_element_user(LUM$30, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect insertNewLum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().insert_element_user(LUM$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lum" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect addNewLum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().add_element_user(LUM$30);
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
            get_store().remove_element(LUM$30, i);
        }
    }
    
    /**
     * Gets a List of "tint" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect> getTintList()
    {
        final class TintList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect get(int i)
                { return CTBlipImpl.this.getTintArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect old = CTBlipImpl.this.getTintArray(i);
                CTBlipImpl.this.setTintArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect o)
                { CTBlipImpl.this.insertNewTint(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect old = CTBlipImpl.this.getTintArray(i);
                CTBlipImpl.this.removeTint(i);
                return old;
            }
            
            public int size()
                { return CTBlipImpl.this.sizeOfTintArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect[] getTintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TINT$32, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tint" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect getTintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().find_element_user(TINT$32, i);
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
            return get_store().count_elements(TINT$32);
        }
    }
    
    /**
     * Sets array of all "tint" element
     */
    public void setTintArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect[] tintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tintArray, TINT$32);
        }
    }
    
    /**
     * Sets ith "tint" element
     */
    public void setTintArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect tint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().find_element_user(TINT$32, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect insertNewTint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().insert_element_user(TINT$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tint" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect addNewTint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().add_element_user(TINT$32);
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
            get_store().remove_element(TINT$32, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$34) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$34);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$34);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$34, 0);
        }
    }
    
    /**
     * Gets the "embed" attribute
     */
    public java.lang.String getEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBED$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EMBED$36);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "embed" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(EMBED$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_default_attribute_value(EMBED$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "embed" attribute
     */
    public boolean isSetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EMBED$36) != null;
        }
    }
    
    /**
     * Sets the "embed" attribute
     */
    public void setEmbed(java.lang.String embed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EMBED$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EMBED$36);
            }
            target.setStringValue(embed);
        }
    }
    
    /**
     * Sets (as xml) the "embed" attribute
     */
    public void xsetEmbed(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId embed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(EMBED$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(EMBED$36);
            }
            target.set(embed);
        }
    }
    
    /**
     * Unsets the "embed" attribute
     */
    public void unsetEmbed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EMBED$36);
        }
    }
    
    /**
     * Gets the "link" attribute
     */
    public java.lang.String getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LINK$38);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "link" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LINK$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_default_attribute_value(LINK$38);
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
            return get_store().find_attribute_user(LINK$38) != null;
        }
    }
    
    /**
     * Sets the "link" attribute
     */
    public void setLink(java.lang.String link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINK$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINK$38);
            }
            target.setStringValue(link);
        }
    }
    
    /**
     * Sets (as xml) the "link" attribute
     */
    public void xsetLink(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(LINK$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(LINK$38);
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
            get_store().remove_attribute(LINK$38);
        }
    }
    
    /**
     * Gets the "cstate" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression.Enum getCstate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTATE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CSTATE$40);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cstate" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression xgetCstate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression)get_store().find_attribute_user(CSTATE$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression)get_default_attribute_value(CSTATE$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "cstate" attribute
     */
    public boolean isSetCstate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CSTATE$40) != null;
        }
    }
    
    /**
     * Sets the "cstate" attribute
     */
    public void setCstate(org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression.Enum cstate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSTATE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSTATE$40);
            }
            target.setEnumValue(cstate);
        }
    }
    
    /**
     * Sets (as xml) the "cstate" attribute
     */
    public void xsetCstate(org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression cstate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression)get_store().find_attribute_user(CSTATE$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression)get_store().add_attribute_user(CSTATE$40);
            }
            target.set(cstate);
        }
    }
    
    /**
     * Unsets the "cstate" attribute
     */
    public void unsetCstate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CSTATE$40);
        }
    }
}
