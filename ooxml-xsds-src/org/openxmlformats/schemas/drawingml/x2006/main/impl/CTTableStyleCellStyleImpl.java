/*
 * XML Type:  CT_TableStyleCellStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableStyleCellStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleCellStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle
{
    
    public CTTableStyleCellStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCBDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcBdr");
    private static final javax.xml.namespace.QName FILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fill");
    private static final javax.xml.namespace.QName FILLREF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRef");
    private static final javax.xml.namespace.QName CELL3D$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cell3D");
    
    
    /**
     * Gets the "tcBdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle getTcBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle)get_store().find_element_user(TCBDR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcBdr" element
     */
    public boolean isSetTcBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCBDR$0) != 0;
        }
    }
    
    /**
     * Sets the "tcBdr" element
     */
    public void setTcBdr(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle tcBdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle)get_store().find_element_user(TCBDR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle)get_store().add_element_user(TCBDR$0);
            }
            target.set(tcBdr);
        }
    }
    
    /**
     * Appends and returns a new empty "tcBdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle addNewTcBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle)get_store().add_element_user(TCBDR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tcBdr" element
     */
    public void unsetTcBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCBDR$0, 0);
        }
    }
    
    /**
     * Gets the "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().find_element_user(FILL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fill" element
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$2) != 0;
        }
    }
    
    /**
     * Sets the "fill" element
     */
    public void setFill(org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().find_element_user(FILL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().add_element_user(FILL$2);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties)get_store().add_element_user(FILL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fill" element
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$2, 0);
        }
    }
    
    /**
     * Gets the "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference getFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fillRef" element
     */
    public boolean isSetFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILLREF$4) != 0;
        }
    }
    
    /**
     * Sets the "fillRef" element
     */
    public void setFillRef(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference fillRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().find_element_user(FILLREF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$4);
            }
            target.set(fillRef);
        }
    }
    
    /**
     * Appends and returns a new empty "fillRef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference addNewFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference)get_store().add_element_user(FILLREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fillRef" element
     */
    public void unsetFillRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILLREF$4, 0);
        }
    }
    
    /**
     * Gets the "cell3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D getCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().find_element_user(CELL3D$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cell3D" element
     */
    public boolean isSetCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELL3D$6) != 0;
        }
    }
    
    /**
     * Sets the "cell3D" element
     */
    public void setCell3D(org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D cell3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().find_element_user(CELL3D$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().add_element_user(CELL3D$6);
            }
            target.set(cell3D);
        }
    }
    
    /**
     * Appends and returns a new empty "cell3D" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D addNewCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D)get_store().add_element_user(CELL3D$6);
            return target;
        }
    }
    
    /**
     * Unsets the "cell3D" element
     */
    public void unsetCell3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELL3D$6, 0);
        }
    }
}
