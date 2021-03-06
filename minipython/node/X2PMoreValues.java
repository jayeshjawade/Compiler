/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class X2PMoreValues extends XPMoreValues
{
    private PMoreValues _pMoreValues_;

    public X2PMoreValues()
    {
    }

    public X2PMoreValues(
        PMoreValues _pMoreValues_)
    {
        setPMoreValues(_pMoreValues_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PMoreValues getPMoreValues()
    {
        return _pMoreValues_;
    }

    public void setPMoreValues(PMoreValues node)
    {
        if(_pMoreValues_ != null)
        {
            _pMoreValues_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMoreValues_ = node;
    }

    void removeChild(Node child)
    {
        if(_pMoreValues_ == child)
        {
            _pMoreValues_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pMoreValues_);
    }
}
