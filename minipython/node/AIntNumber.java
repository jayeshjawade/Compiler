/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class AIntNumber extends PNumber
{
    private TInteger _integer_;

    public AIntNumber()
    {
        // Constructor
    }

    public AIntNumber(
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new AIntNumber(
            cloneNode(this._integer_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntNumber(this);
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
