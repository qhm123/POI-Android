/*
 * XML Type:  CT_EffectContainer
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_EffectContainer(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEffectContainerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer
{
    
    public CTEffectContainerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cont");
    private static final javax.xml.namespace.QName EFFECT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effect");
    private static final javax.xml.namespace.QName ALPHABILEVEL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaBiLevel");
    private static final javax.xml.namespace.QName ALPHACEILING$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaCeiling");
    private static final javax.xml.namespace.QName ALPHAFLOOR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaFloor");
    private static final javax.xml.namespace.QName ALPHAINV$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaInv");
    private static final javax.xml.namespace.QName ALPHAMOD$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
    private static final javax.xml.namespace.QName ALPHAMODFIX$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaModFix");
    private static final javax.xml.namespace.QName ALPHAOUTSET$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaOutset");
    private static final javax.xml.namespace.QName ALPHAREPL$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaRepl");
    private static final javax.xml.namespace.QName BILEVEL$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "biLevel");
    private static final javax.xml.namespace.QName BLEND$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blend");
    private static final javax.xml.namespace.QName BLUR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blur");
    private static final javax.xml.namespace.QName CLRCHANGE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrChange");
    private static final javax.xml.namespace.QName CLRREPL$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrRepl");
    private static final javax.xml.namespace.QName DUOTONE$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "duotone");
    private static final javax.xml.namespace.QName FILL$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fill");
    private static final javax.xml.namespace.QName FILLOVERLAY$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillOverlay");
    private static final javax.xml.namespace.QName GLOW$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "glow");
    private static final javax.xml.namespace.QName GRAYSCL$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grayscl");
    private static final javax.xml.namespace.QName HSL$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hsl");
    private static final javax.xml.namespace.QName INNERSHDW$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "innerShdw");
    private static final javax.xml.namespace.QName LUM$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
    private static final javax.xml.namespace.QName OUTERSHDW$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "outerShdw");
    private static final javax.xml.namespace.QName PRSTSHDW$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstShdw");
    private static final javax.xml.namespace.QName REFLECTION$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "reflection");
    private static final javax.xml.namespace.QName RELOFF$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "relOff");
    private static final javax.xml.namespace.QName SOFTEDGE$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "softEdge");
    private static final javax.xml.namespace.QName TINT$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
    private static final javax.xml.namespace.QName XFRM$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "xfrm");
    private static final javax.xml.namespace.QName TYPE$60 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName NAME$62 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "cont" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer> getContList()
    {
        final class ContList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer get(int i)
                { return CTEffectContainerImpl.this.getContArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer old = CTEffectContainerImpl.this.getContArray(i);
                CTEffectContainerImpl.this.setContArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer o)
                { CTEffectContainerImpl.this.insertNewCont(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer old = CTEffectContainerImpl.this.getContArray(i);
                CTEffectContainerImpl.this.removeCont(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfContArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContList();
        }
    }
    
    /**
     * Gets array of all "cont" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer[] getContArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer getContArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(CONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cont" element
     */
    public int sizeOfContArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONT$0);
        }
    }
    
    /**
     * Sets array of all "cont" element
     */
    public void setContArray(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer[] contArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contArray, CONT$0);
        }
    }
    
    /**
     * Sets ith "cont" element
     */
    public void setContArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer cont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().find_element_user(CONT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cont);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer insertNewCont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().insert_element_user(CONT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cont" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer addNewCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer)get_store().add_element_user(CONT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cont" element
     */
    public void removeCont(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONT$0, i);
        }
    }
    
    /**
     * Gets a List of "effect" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference> getEffectList()
    {
        final class EffectList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference get(int i)
                { return CTEffectContainerImpl.this.getEffectArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference old = CTEffectContainerImpl.this.getEffectArray(i);
                CTEffectContainerImpl.this.setEffectArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference o)
                { CTEffectContainerImpl.this.insertNewEffect(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference old = CTEffectContainerImpl.this.getEffectArray(i);
                CTEffectContainerImpl.this.removeEffect(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfEffectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EffectList();
        }
    }
    
    /**
     * Gets array of all "effect" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference[] getEffectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EFFECT$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "effect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference getEffectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference)get_store().find_element_user(EFFECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "effect" element
     */
    public int sizeOfEffectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECT$2);
        }
    }
    
    /**
     * Sets array of all "effect" element
     */
    public void setEffectArray(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference[] effectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(effectArray, EFFECT$2);
        }
    }
    
    /**
     * Sets ith "effect" element
     */
    public void setEffectArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference effect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference)get_store().find_element_user(EFFECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(effect);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "effect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference insertNewEffect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference)get_store().insert_element_user(EFFECT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "effect" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference addNewEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectReference)get_store().add_element_user(EFFECT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "effect" element
     */
    public void removeEffect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECT$2, i);
        }
    }
    
    /**
     * Gets a List of "alphaBiLevel" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect> getAlphaBiLevelList()
    {
        final class AlphaBiLevelList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect get(int i)
                { return CTEffectContainerImpl.this.getAlphaBiLevelArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect old = CTEffectContainerImpl.this.getAlphaBiLevelArray(i);
                CTEffectContainerImpl.this.setAlphaBiLevelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaBiLevel(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect old = CTEffectContainerImpl.this.getAlphaBiLevelArray(i);
                CTEffectContainerImpl.this.removeAlphaBiLevel(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaBiLevelArray(); }
            
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
            get_store().find_all_element_users(ALPHABILEVEL$4, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().find_element_user(ALPHABILEVEL$4, i);
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
            return get_store().count_elements(ALPHABILEVEL$4);
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
            arraySetterHelper(alphaBiLevelArray, ALPHABILEVEL$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().find_element_user(ALPHABILEVEL$4, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().insert_element_user(ALPHABILEVEL$4, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect)get_store().add_element_user(ALPHABILEVEL$4);
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
            get_store().remove_element(ALPHABILEVEL$4, i);
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
                { return CTEffectContainerImpl.this.getAlphaCeilingArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect old = CTEffectContainerImpl.this.getAlphaCeilingArray(i);
                CTEffectContainerImpl.this.setAlphaCeilingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaCeiling(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect old = CTEffectContainerImpl.this.getAlphaCeilingArray(i);
                CTEffectContainerImpl.this.removeAlphaCeiling(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaCeilingArray(); }
            
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
            get_store().find_all_element_users(ALPHACEILING$6, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().find_element_user(ALPHACEILING$6, i);
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
            return get_store().count_elements(ALPHACEILING$6);
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
            arraySetterHelper(alphaCeilingArray, ALPHACEILING$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().find_element_user(ALPHACEILING$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().insert_element_user(ALPHACEILING$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect)get_store().add_element_user(ALPHACEILING$6);
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
            get_store().remove_element(ALPHACEILING$6, i);
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
                { return CTEffectContainerImpl.this.getAlphaFloorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect old = CTEffectContainerImpl.this.getAlphaFloorArray(i);
                CTEffectContainerImpl.this.setAlphaFloorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaFloor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect old = CTEffectContainerImpl.this.getAlphaFloorArray(i);
                CTEffectContainerImpl.this.removeAlphaFloor(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaFloorArray(); }
            
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
            get_store().find_all_element_users(ALPHAFLOOR$8, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().find_element_user(ALPHAFLOOR$8, i);
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
            return get_store().count_elements(ALPHAFLOOR$8);
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
            arraySetterHelper(alphaFloorArray, ALPHAFLOOR$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().find_element_user(ALPHAFLOOR$8, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().insert_element_user(ALPHAFLOOR$8, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect)get_store().add_element_user(ALPHAFLOOR$8);
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
            get_store().remove_element(ALPHAFLOOR$8, i);
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
                { return CTEffectContainerImpl.this.getAlphaInvArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect old = CTEffectContainerImpl.this.getAlphaInvArray(i);
                CTEffectContainerImpl.this.setAlphaInvArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaInv(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect old = CTEffectContainerImpl.this.getAlphaInvArray(i);
                CTEffectContainerImpl.this.removeAlphaInv(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaInvArray(); }
            
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
            get_store().find_all_element_users(ALPHAINV$10, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().find_element_user(ALPHAINV$10, i);
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
            return get_store().count_elements(ALPHAINV$10);
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
            arraySetterHelper(alphaInvArray, ALPHAINV$10);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().find_element_user(ALPHAINV$10, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().insert_element_user(ALPHAINV$10, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect)get_store().add_element_user(ALPHAINV$10);
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
            get_store().remove_element(ALPHAINV$10, i);
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
                { return CTEffectContainerImpl.this.getAlphaModArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect old = CTEffectContainerImpl.this.getAlphaModArray(i);
                CTEffectContainerImpl.this.setAlphaModArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaMod(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect old = CTEffectContainerImpl.this.getAlphaModArray(i);
                CTEffectContainerImpl.this.removeAlphaMod(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaModArray(); }
            
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
            get_store().find_all_element_users(ALPHAMOD$12, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().find_element_user(ALPHAMOD$12, i);
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
            return get_store().count_elements(ALPHAMOD$12);
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
            arraySetterHelper(alphaModArray, ALPHAMOD$12);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().find_element_user(ALPHAMOD$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().insert_element_user(ALPHAMOD$12, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect)get_store().add_element_user(ALPHAMOD$12);
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
            get_store().remove_element(ALPHAMOD$12, i);
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
                { return CTEffectContainerImpl.this.getAlphaModFixArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect old = CTEffectContainerImpl.this.getAlphaModFixArray(i);
                CTEffectContainerImpl.this.setAlphaModFixArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaModFix(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect old = CTEffectContainerImpl.this.getAlphaModFixArray(i);
                CTEffectContainerImpl.this.removeAlphaModFix(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaModFixArray(); }
            
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
            get_store().find_all_element_users(ALPHAMODFIX$14, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().find_element_user(ALPHAMODFIX$14, i);
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
            return get_store().count_elements(ALPHAMODFIX$14);
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
            arraySetterHelper(alphaModFixArray, ALPHAMODFIX$14);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().find_element_user(ALPHAMODFIX$14, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().insert_element_user(ALPHAMODFIX$14, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect)get_store().add_element_user(ALPHAMODFIX$14);
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
            get_store().remove_element(ALPHAMODFIX$14, i);
        }
    }
    
    /**
     * Gets a List of "alphaOutset" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect> getAlphaOutsetList()
    {
        final class AlphaOutsetList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect get(int i)
                { return CTEffectContainerImpl.this.getAlphaOutsetArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect old = CTEffectContainerImpl.this.getAlphaOutsetArray(i);
                CTEffectContainerImpl.this.setAlphaOutsetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaOutset(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect old = CTEffectContainerImpl.this.getAlphaOutsetArray(i);
                CTEffectContainerImpl.this.removeAlphaOutset(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaOutsetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlphaOutsetList();
        }
    }
    
    /**
     * Gets array of all "alphaOutset" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect[] getAlphaOutsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALPHAOUTSET$16, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alphaOutset" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect getAlphaOutsetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect)get_store().find_element_user(ALPHAOUTSET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alphaOutset" element
     */
    public int sizeOfAlphaOutsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALPHAOUTSET$16);
        }
    }
    
    /**
     * Sets array of all "alphaOutset" element
     */
    public void setAlphaOutsetArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect[] alphaOutsetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alphaOutsetArray, ALPHAOUTSET$16);
        }
    }
    
    /**
     * Sets ith "alphaOutset" element
     */
    public void setAlphaOutsetArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect alphaOutset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect)get_store().find_element_user(ALPHAOUTSET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alphaOutset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaOutset" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect insertNewAlphaOutset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect)get_store().insert_element_user(ALPHAOUTSET$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaOutset" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect addNewAlphaOutset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaOutsetEffect)get_store().add_element_user(ALPHAOUTSET$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "alphaOutset" element
     */
    public void removeAlphaOutset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALPHAOUTSET$16, i);
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
                { return CTEffectContainerImpl.this.getAlphaReplArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect old = CTEffectContainerImpl.this.getAlphaReplArray(i);
                CTEffectContainerImpl.this.setAlphaReplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect o)
                { CTEffectContainerImpl.this.insertNewAlphaRepl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect old = CTEffectContainerImpl.this.getAlphaReplArray(i);
                CTEffectContainerImpl.this.removeAlphaRepl(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfAlphaReplArray(); }
            
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
            get_store().find_all_element_users(ALPHAREPL$18, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().find_element_user(ALPHAREPL$18, i);
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
            return get_store().count_elements(ALPHAREPL$18);
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
            arraySetterHelper(alphaReplArray, ALPHAREPL$18);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().find_element_user(ALPHAREPL$18, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().insert_element_user(ALPHAREPL$18, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect)get_store().add_element_user(ALPHAREPL$18);
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
            get_store().remove_element(ALPHAREPL$18, i);
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
                { return CTEffectContainerImpl.this.getBiLevelArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect old = CTEffectContainerImpl.this.getBiLevelArray(i);
                CTEffectContainerImpl.this.setBiLevelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect o)
                { CTEffectContainerImpl.this.insertNewBiLevel(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect old = CTEffectContainerImpl.this.getBiLevelArray(i);
                CTEffectContainerImpl.this.removeBiLevel(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfBiLevelArray(); }
            
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
            get_store().find_all_element_users(BILEVEL$20, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().find_element_user(BILEVEL$20, i);
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
            return get_store().count_elements(BILEVEL$20);
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
            arraySetterHelper(biLevelArray, BILEVEL$20);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().find_element_user(BILEVEL$20, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().insert_element_user(BILEVEL$20, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect)get_store().add_element_user(BILEVEL$20);
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
            get_store().remove_element(BILEVEL$20, i);
        }
    }
    
    /**
     * Gets a List of "blend" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect> getBlendList()
    {
        final class BlendList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect get(int i)
                { return CTEffectContainerImpl.this.getBlendArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect old = CTEffectContainerImpl.this.getBlendArray(i);
                CTEffectContainerImpl.this.setBlendArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect o)
                { CTEffectContainerImpl.this.insertNewBlend(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect old = CTEffectContainerImpl.this.getBlendArray(i);
                CTEffectContainerImpl.this.removeBlend(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfBlendArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BlendList();
        }
    }
    
    /**
     * Gets array of all "blend" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect[] getBlendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BLEND$22, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "blend" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect getBlendArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect)get_store().find_element_user(BLEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "blend" element
     */
    public int sizeOfBlendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLEND$22);
        }
    }
    
    /**
     * Sets array of all "blend" element
     */
    public void setBlendArray(org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect[] blendArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(blendArray, BLEND$22);
        }
    }
    
    /**
     * Sets ith "blend" element
     */
    public void setBlendArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect blend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect)get_store().find_element_user(BLEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(blend);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blend" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect insertNewBlend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect)get_store().insert_element_user(BLEND$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blend" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect addNewBlend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlendEffect)get_store().add_element_user(BLEND$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "blend" element
     */
    public void removeBlend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLEND$22, i);
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
                { return CTEffectContainerImpl.this.getBlurArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect old = CTEffectContainerImpl.this.getBlurArray(i);
                CTEffectContainerImpl.this.setBlurArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect o)
                { CTEffectContainerImpl.this.insertNewBlur(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect old = CTEffectContainerImpl.this.getBlurArray(i);
                CTEffectContainerImpl.this.removeBlur(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfBlurArray(); }
            
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
            get_store().find_all_element_users(BLUR$24, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$24, i);
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
            return get_store().count_elements(BLUR$24);
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
            arraySetterHelper(blurArray, BLUR$24);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().find_element_user(BLUR$24, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().insert_element_user(BLUR$24, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect)get_store().add_element_user(BLUR$24);
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
            get_store().remove_element(BLUR$24, i);
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
                { return CTEffectContainerImpl.this.getClrChangeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect old = CTEffectContainerImpl.this.getClrChangeArray(i);
                CTEffectContainerImpl.this.setClrChangeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect o)
                { CTEffectContainerImpl.this.insertNewClrChange(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect old = CTEffectContainerImpl.this.getClrChangeArray(i);
                CTEffectContainerImpl.this.removeClrChange(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfClrChangeArray(); }
            
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
            get_store().find_all_element_users(CLRCHANGE$26, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().find_element_user(CLRCHANGE$26, i);
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
            return get_store().count_elements(CLRCHANGE$26);
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
            arraySetterHelper(clrChangeArray, CLRCHANGE$26);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().find_element_user(CLRCHANGE$26, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().insert_element_user(CLRCHANGE$26, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect)get_store().add_element_user(CLRCHANGE$26);
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
            get_store().remove_element(CLRCHANGE$26, i);
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
                { return CTEffectContainerImpl.this.getClrReplArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect old = CTEffectContainerImpl.this.getClrReplArray(i);
                CTEffectContainerImpl.this.setClrReplArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect o)
                { CTEffectContainerImpl.this.insertNewClrRepl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect old = CTEffectContainerImpl.this.getClrReplArray(i);
                CTEffectContainerImpl.this.removeClrRepl(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfClrReplArray(); }
            
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
            get_store().find_all_element_users(CLRREPL$28, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().find_element_user(CLRREPL$28, i);
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
            return get_store().count_elements(CLRREPL$28);
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
            arraySetterHelper(clrReplArray, CLRREPL$28);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().find_element_user(CLRREPL$28, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().insert_element_user(CLRREPL$28, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect)get_store().add_element_user(CLRREPL$28);
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
            get_store().remove_element(CLRREPL$28, i);
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
                { return CTEffectContainerImpl.this.getDuotoneArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect old = CTEffectContainerImpl.this.getDuotoneArray(i);
                CTEffectContainerImpl.this.setDuotoneArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect o)
                { CTEffectContainerImpl.this.insertNewDuotone(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect old = CTEffectContainerImpl.this.getDuotoneArray(i);
                CTEffectContainerImpl.this.removeDuotone(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfDuotoneArray(); }
            
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
            get_store().find_all_element_users(DUOTONE$30, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().find_element_user(DUOTONE$30, i);
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
            return get_store().count_elements(DUOTONE$30);
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
            arraySetterHelper(duotoneArray, DUOTONE$30);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().find_element_user(DUOTONE$30, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().insert_element_user(DUOTONE$30, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect)get_store().add_element_user(DUOTONE$30);
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
            get_store().remove_element(DUOTONE$30, i);
        }
    }
    
    /**
     * Gets a List of "fill" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect> getFillList()
    {
        final class FillList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect get(int i)
                { return CTEffectContainerImpl.this.getFillArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect old = CTEffectContainerImpl.this.getFillArray(i);
                CTEffectContainerImpl.this.setFillArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect o)
                { CTEffectContainerImpl.this.insertNewFill(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect old = CTEffectContainerImpl.this.getFillArray(i);
                CTEffectContainerImpl.this.removeFill(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FillList();
        }
    }
    
    /**
     * Gets array of all "fill" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect[] getFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILL$32, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect getFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect)get_store().find_element_user(FILL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fill" element
     */
    public int sizeOfFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$32);
        }
    }
    
    /**
     * Sets array of all "fill" element
     */
    public void setFillArray(org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect[] fillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fillArray, FILL$32);
        }
    }
    
    /**
     * Sets ith "fill" element
     */
    public void setFillArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect)get_store().find_element_user(FILL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect insertNewFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect)get_store().insert_element_user(FILL$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillEffect)get_store().add_element_user(FILL$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "fill" element
     */
    public void removeFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$32, i);
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
                { return CTEffectContainerImpl.this.getFillOverlayArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect old = CTEffectContainerImpl.this.getFillOverlayArray(i);
                CTEffectContainerImpl.this.setFillOverlayArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect o)
                { CTEffectContainerImpl.this.insertNewFillOverlay(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect old = CTEffectContainerImpl.this.getFillOverlayArray(i);
                CTEffectContainerImpl.this.removeFillOverlay(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfFillOverlayArray(); }
            
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
            get_store().find_all_element_users(FILLOVERLAY$34, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$34, i);
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
            return get_store().count_elements(FILLOVERLAY$34);
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
            arraySetterHelper(fillOverlayArray, FILLOVERLAY$34);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().find_element_user(FILLOVERLAY$34, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().insert_element_user(FILLOVERLAY$34, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect)get_store().add_element_user(FILLOVERLAY$34);
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
            get_store().remove_element(FILLOVERLAY$34, i);
        }
    }
    
    /**
     * Gets a List of "glow" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect> getGlowList()
    {
        final class GlowList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect get(int i)
                { return CTEffectContainerImpl.this.getGlowArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect old = CTEffectContainerImpl.this.getGlowArray(i);
                CTEffectContainerImpl.this.setGlowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect o)
                { CTEffectContainerImpl.this.insertNewGlow(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect old = CTEffectContainerImpl.this.getGlowArray(i);
                CTEffectContainerImpl.this.removeGlow(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfGlowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GlowList();
        }
    }
    
    /**
     * Gets array of all "glow" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect[] getGlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GLOW$36, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "glow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect getGlowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().find_element_user(GLOW$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "glow" element
     */
    public int sizeOfGlowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOW$36);
        }
    }
    
    /**
     * Sets array of all "glow" element
     */
    public void setGlowArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect[] glowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(glowArray, GLOW$36);
        }
    }
    
    /**
     * Sets ith "glow" element
     */
    public void setGlowArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect glow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().find_element_user(GLOW$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(glow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "glow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect insertNewGlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().insert_element_user(GLOW$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "glow" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect addNewGlow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect)get_store().add_element_user(GLOW$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "glow" element
     */
    public void removeGlow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOW$36, i);
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
                { return CTEffectContainerImpl.this.getGraysclArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect old = CTEffectContainerImpl.this.getGraysclArray(i);
                CTEffectContainerImpl.this.setGraysclArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect o)
                { CTEffectContainerImpl.this.insertNewGrayscl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect old = CTEffectContainerImpl.this.getGraysclArray(i);
                CTEffectContainerImpl.this.removeGrayscl(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfGraysclArray(); }
            
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
            get_store().find_all_element_users(GRAYSCL$38, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().find_element_user(GRAYSCL$38, i);
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
            return get_store().count_elements(GRAYSCL$38);
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
            arraySetterHelper(graysclArray, GRAYSCL$38);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().find_element_user(GRAYSCL$38, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().insert_element_user(GRAYSCL$38, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect)get_store().add_element_user(GRAYSCL$38);
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
            get_store().remove_element(GRAYSCL$38, i);
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
                { return CTEffectContainerImpl.this.getHslArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect old = CTEffectContainerImpl.this.getHslArray(i);
                CTEffectContainerImpl.this.setHslArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect o)
                { CTEffectContainerImpl.this.insertNewHsl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect old = CTEffectContainerImpl.this.getHslArray(i);
                CTEffectContainerImpl.this.removeHsl(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfHslArray(); }
            
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
            get_store().find_all_element_users(HSL$40, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().find_element_user(HSL$40, i);
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
            return get_store().count_elements(HSL$40);
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
            arraySetterHelper(hslArray, HSL$40);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().find_element_user(HSL$40, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().insert_element_user(HSL$40, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect)get_store().add_element_user(HSL$40);
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
            get_store().remove_element(HSL$40, i);
        }
    }
    
    /**
     * Gets a List of "innerShdw" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect> getInnerShdwList()
    {
        final class InnerShdwList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect get(int i)
                { return CTEffectContainerImpl.this.getInnerShdwArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect old = CTEffectContainerImpl.this.getInnerShdwArray(i);
                CTEffectContainerImpl.this.setInnerShdwArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect o)
                { CTEffectContainerImpl.this.insertNewInnerShdw(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect old = CTEffectContainerImpl.this.getInnerShdwArray(i);
                CTEffectContainerImpl.this.removeInnerShdw(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfInnerShdwArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InnerShdwList();
        }
    }
    
    /**
     * Gets array of all "innerShdw" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect[] getInnerShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INNERSHDW$42, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "innerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect getInnerShdwArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().find_element_user(INNERSHDW$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "innerShdw" element
     */
    public int sizeOfInnerShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNERSHDW$42);
        }
    }
    
    /**
     * Sets array of all "innerShdw" element
     */
    public void setInnerShdwArray(org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect[] innerShdwArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(innerShdwArray, INNERSHDW$42);
        }
    }
    
    /**
     * Sets ith "innerShdw" element
     */
    public void setInnerShdwArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect innerShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().find_element_user(INNERSHDW$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(innerShdw);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "innerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect insertNewInnerShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().insert_element_user(INNERSHDW$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "innerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect addNewInnerShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect)get_store().add_element_user(INNERSHDW$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "innerShdw" element
     */
    public void removeInnerShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNERSHDW$42, i);
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
                { return CTEffectContainerImpl.this.getLumArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect old = CTEffectContainerImpl.this.getLumArray(i);
                CTEffectContainerImpl.this.setLumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect o)
                { CTEffectContainerImpl.this.insertNewLum(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect old = CTEffectContainerImpl.this.getLumArray(i);
                CTEffectContainerImpl.this.removeLum(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfLumArray(); }
            
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
            get_store().find_all_element_users(LUM$44, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().find_element_user(LUM$44, i);
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
            return get_store().count_elements(LUM$44);
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
            arraySetterHelper(lumArray, LUM$44);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().find_element_user(LUM$44, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().insert_element_user(LUM$44, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect)get_store().add_element_user(LUM$44);
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
            get_store().remove_element(LUM$44, i);
        }
    }
    
    /**
     * Gets a List of "outerShdw" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect> getOuterShdwList()
    {
        final class OuterShdwList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect get(int i)
                { return CTEffectContainerImpl.this.getOuterShdwArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect old = CTEffectContainerImpl.this.getOuterShdwArray(i);
                CTEffectContainerImpl.this.setOuterShdwArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect o)
                { CTEffectContainerImpl.this.insertNewOuterShdw(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect old = CTEffectContainerImpl.this.getOuterShdwArray(i);
                CTEffectContainerImpl.this.removeOuterShdw(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfOuterShdwArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OuterShdwList();
        }
    }
    
    /**
     * Gets array of all "outerShdw" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect[] getOuterShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTERSHDW$46, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect getOuterShdwArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().find_element_user(OUTERSHDW$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outerShdw" element
     */
    public int sizeOfOuterShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTERSHDW$46);
        }
    }
    
    /**
     * Sets array of all "outerShdw" element
     */
    public void setOuterShdwArray(org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect[] outerShdwArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outerShdwArray, OUTERSHDW$46);
        }
    }
    
    /**
     * Sets ith "outerShdw" element
     */
    public void setOuterShdwArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect outerShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().find_element_user(OUTERSHDW$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outerShdw);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect insertNewOuterShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().insert_element_user(OUTERSHDW$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outerShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect addNewOuterShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect)get_store().add_element_user(OUTERSHDW$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "outerShdw" element
     */
    public void removeOuterShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTERSHDW$46, i);
        }
    }
    
    /**
     * Gets a List of "prstShdw" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect> getPrstShdwList()
    {
        final class PrstShdwList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect get(int i)
                { return CTEffectContainerImpl.this.getPrstShdwArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect old = CTEffectContainerImpl.this.getPrstShdwArray(i);
                CTEffectContainerImpl.this.setPrstShdwArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect o)
                { CTEffectContainerImpl.this.insertNewPrstShdw(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect old = CTEffectContainerImpl.this.getPrstShdwArray(i);
                CTEffectContainerImpl.this.removePrstShdw(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfPrstShdwArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PrstShdwList();
        }
    }
    
    /**
     * Gets array of all "prstShdw" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect[] getPrstShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRSTSHDW$48, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prstShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect getPrstShdwArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().find_element_user(PRSTSHDW$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prstShdw" element
     */
    public int sizeOfPrstShdwArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTSHDW$48);
        }
    }
    
    /**
     * Sets array of all "prstShdw" element
     */
    public void setPrstShdwArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect[] prstShdwArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prstShdwArray, PRSTSHDW$48);
        }
    }
    
    /**
     * Sets ith "prstShdw" element
     */
    public void setPrstShdwArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect prstShdw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().find_element_user(PRSTSHDW$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prstShdw);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prstShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect insertNewPrstShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().insert_element_user(PRSTSHDW$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prstShdw" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect addNewPrstShdw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect)get_store().add_element_user(PRSTSHDW$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "prstShdw" element
     */
    public void removePrstShdw(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTSHDW$48, i);
        }
    }
    
    /**
     * Gets a List of "reflection" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect> getReflectionList()
    {
        final class ReflectionList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect get(int i)
                { return CTEffectContainerImpl.this.getReflectionArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect old = CTEffectContainerImpl.this.getReflectionArray(i);
                CTEffectContainerImpl.this.setReflectionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect o)
                { CTEffectContainerImpl.this.insertNewReflection(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect old = CTEffectContainerImpl.this.getReflectionArray(i);
                CTEffectContainerImpl.this.removeReflection(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfReflectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReflectionList();
        }
    }
    
    /**
     * Gets array of all "reflection" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect[] getReflectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFLECTION$50, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reflection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect getReflectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().find_element_user(REFLECTION$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reflection" element
     */
    public int sizeOfReflectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFLECTION$50);
        }
    }
    
    /**
     * Sets array of all "reflection" element
     */
    public void setReflectionArray(org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect[] reflectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reflectionArray, REFLECTION$50);
        }
    }
    
    /**
     * Sets ith "reflection" element
     */
    public void setReflectionArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect reflection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().find_element_user(REFLECTION$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reflection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reflection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect insertNewReflection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().insert_element_user(REFLECTION$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reflection" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect addNewReflection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect)get_store().add_element_user(REFLECTION$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "reflection" element
     */
    public void removeReflection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFLECTION$50, i);
        }
    }
    
    /**
     * Gets a List of "relOff" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect> getRelOffList()
    {
        final class RelOffList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect get(int i)
                { return CTEffectContainerImpl.this.getRelOffArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect old = CTEffectContainerImpl.this.getRelOffArray(i);
                CTEffectContainerImpl.this.setRelOffArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect o)
                { CTEffectContainerImpl.this.insertNewRelOff(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect old = CTEffectContainerImpl.this.getRelOffArray(i);
                CTEffectContainerImpl.this.removeRelOff(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfRelOffArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelOffList();
        }
    }
    
    /**
     * Gets array of all "relOff" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect[] getRelOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELOFF$52, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect getRelOffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect)get_store().find_element_user(RELOFF$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relOff" element
     */
    public int sizeOfRelOffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELOFF$52);
        }
    }
    
    /**
     * Sets array of all "relOff" element
     */
    public void setRelOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect[] relOffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relOffArray, RELOFF$52);
        }
    }
    
    /**
     * Sets ith "relOff" element
     */
    public void setRelOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect relOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect)get_store().find_element_user(RELOFF$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relOff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect insertNewRelOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect)get_store().insert_element_user(RELOFF$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relOff" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect addNewRelOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeOffsetEffect)get_store().add_element_user(RELOFF$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "relOff" element
     */
    public void removeRelOff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELOFF$52, i);
        }
    }
    
    /**
     * Gets a List of "softEdge" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect> getSoftEdgeList()
    {
        final class SoftEdgeList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect get(int i)
                { return CTEffectContainerImpl.this.getSoftEdgeArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect old = CTEffectContainerImpl.this.getSoftEdgeArray(i);
                CTEffectContainerImpl.this.setSoftEdgeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect o)
                { CTEffectContainerImpl.this.insertNewSoftEdge(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect old = CTEffectContainerImpl.this.getSoftEdgeArray(i);
                CTEffectContainerImpl.this.removeSoftEdge(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfSoftEdgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoftEdgeList();
        }
    }
    
    /**
     * Gets array of all "softEdge" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect[] getSoftEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTEDGE$54, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "softEdge" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect getSoftEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().find_element_user(SOFTEDGE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "softEdge" element
     */
    public int sizeOfSoftEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTEDGE$54);
        }
    }
    
    /**
     * Sets array of all "softEdge" element
     */
    public void setSoftEdgeArray(org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect[] softEdgeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softEdgeArray, SOFTEDGE$54);
        }
    }
    
    /**
     * Sets ith "softEdge" element
     */
    public void setSoftEdgeArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect softEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().find_element_user(SOFTEDGE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softEdge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softEdge" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect insertNewSoftEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().insert_element_user(SOFTEDGE$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softEdge" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect addNewSoftEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect)get_store().add_element_user(SOFTEDGE$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "softEdge" element
     */
    public void removeSoftEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTEDGE$54, i);
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
                { return CTEffectContainerImpl.this.getTintArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect old = CTEffectContainerImpl.this.getTintArray(i);
                CTEffectContainerImpl.this.setTintArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect o)
                { CTEffectContainerImpl.this.insertNewTint(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect old = CTEffectContainerImpl.this.getTintArray(i);
                CTEffectContainerImpl.this.removeTint(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfTintArray(); }
            
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
            get_store().find_all_element_users(TINT$56, targetList);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().find_element_user(TINT$56, i);
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
            return get_store().count_elements(TINT$56);
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
            arraySetterHelper(tintArray, TINT$56);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().find_element_user(TINT$56, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().insert_element_user(TINT$56, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect)get_store().add_element_user(TINT$56);
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
            get_store().remove_element(TINT$56, i);
        }
    }
    
    /**
     * Gets a List of "xfrm" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect> getXfrmList()
    {
        final class XfrmList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect get(int i)
                { return CTEffectContainerImpl.this.getXfrmArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect old = CTEffectContainerImpl.this.getXfrmArray(i);
                CTEffectContainerImpl.this.setXfrmArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect o)
                { CTEffectContainerImpl.this.insertNewXfrm(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect old = CTEffectContainerImpl.this.getXfrmArray(i);
                CTEffectContainerImpl.this.removeXfrm(i);
                return old;
            }
            
            public int size()
                { return CTEffectContainerImpl.this.sizeOfXfrmArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XfrmList();
        }
    }
    
    /**
     * Gets array of all "xfrm" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect[] getXfrmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(XFRM$58, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect getXfrmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect)get_store().find_element_user(XFRM$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "xfrm" element
     */
    public int sizeOfXfrmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XFRM$58);
        }
    }
    
    /**
     * Sets array of all "xfrm" element
     */
    public void setXfrmArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect[] xfrmArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xfrmArray, XFRM$58);
        }
    }
    
    /**
     * Sets ith "xfrm" element
     */
    public void setXfrmArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect xfrm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect)get_store().find_element_user(XFRM$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xfrm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect insertNewXfrm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect)get_store().insert_element_user(XFRM$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "xfrm" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect addNewXfrm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTransformEffect)get_store().add_element_user(XFRM$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "xfrm" element
     */
    public void removeXfrm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XFRM$58, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$60);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType)get_store().find_attribute_user(TYPE$60);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType)get_default_attribute_value(TYPE$60);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$60) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$60);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType)get_store().find_attribute_user(TYPE$60);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STEffectContainerType)get_store().add_attribute_user(TYPE$60);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$60);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$62);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(NAME$62);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$62) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$62);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlToken name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(NAME$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(NAME$62);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$62);
        }
    }
}
