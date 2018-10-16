/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class ARule2Statement extends PStatement
{
    private PIdentifier _id0_;
    private PIdentifier _id1_;
    private PStatement _statement_;

    public ARule2Statement()
    {
        // Constructor
    }

    public ARule2Statement(
        @SuppressWarnings("hiding") PIdentifier _id0_,
        @SuppressWarnings("hiding") PIdentifier _id1_,
        @SuppressWarnings("hiding") PStatement _statement_)
    {
        // Constructor
        setId0(_id0_);

        setId1(_id1_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new ARule2Statement(
            cloneNode(this._id0_),
            cloneNode(this._id1_),
            cloneNode(this._statement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule2Statement(this);
    }

    public PIdentifier getId0()
    {
        return this._id0_;
    }

    public void setId0(PIdentifier node)
    {
        if(this._id0_ != null)
        {
            this._id0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id0_ = node;
    }

    public PIdentifier getId1()
    {
        return this._id1_;
    }

    public void setId1(PIdentifier node)
    {
        if(this._id1_ != null)
        {
            this._id1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id1_ = node;
    }

    public PStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(PStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id0_)
            + toString(this._id1_)
            + toString(this._statement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id0_ == child)
        {
            this._id0_ = null;
            return;
        }

        if(this._id1_ == child)
        {
            this._id1_ = null;
            return;
        }

        if(this._statement_ == child)
        {
            this._statement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id0_ == oldChild)
        {
            setId0((PIdentifier) newChild);
            return;
        }

        if(this._id1_ == oldChild)
        {
            setId1((PIdentifier) newChild);
            return;
        }

        if(this._statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}