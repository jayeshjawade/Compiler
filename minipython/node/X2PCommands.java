/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class X2PCommands extends XPCommands
{
    private PCommands _pCommands_;

    public X2PCommands()
    {
    }

    public X2PCommands(
        PCommands _pCommands_)
    {
        setPCommands(_pCommands_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCommands getPCommands()
    {
        return _pCommands_;
    }

    public void setPCommands(PCommands node)
    {
        if(_pCommands_ != null)
        {
            _pCommands_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCommands_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCommands_ == child)
        {
            _pCommands_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCommands_);
    }
}
