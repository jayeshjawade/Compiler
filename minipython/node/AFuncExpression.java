/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class AFuncExpression extends PExpression
{
    private PFunctionCall _functionCall_;

    public AFuncExpression()
    {
        // Constructor
    }

    public AFuncExpression(
        @SuppressWarnings("hiding") PFunctionCall _functionCall_)
    {
        // Constructor
        setFunctionCall(_functionCall_);

    }

    @Override
    public Object clone()
    {
        return new AFuncExpression(
            cloneNode(this._functionCall_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncExpression(this);
    }

    public PFunctionCall getFunctionCall()
    {
        return this._functionCall_;
    }

    public void setFunctionCall(PFunctionCall node)
    {
        if(this._functionCall_ != null)
        {
            this._functionCall_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._functionCall_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._functionCall_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._functionCall_ == child)
        {
            this._functionCall_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._functionCall_ == oldChild)
        {
            setFunctionCall((PFunctionCall) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
