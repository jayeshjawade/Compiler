/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule5ComparisonOperator extends PComparisonOperator
{
    private TEquals _equals_;

    public ARule5ComparisonOperator()
    {
    }

    public ARule5ComparisonOperator(
        TEquals _equals_)
    {
        setEquals(_equals_);

    }
    public Object clone()
    {
        return new ARule5ComparisonOperator(
            (TEquals) cloneNode(_equals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule5ComparisonOperator(this);
    }

    public TEquals getEquals()
    {
        return _equals_;
    }

    public void setEquals(TEquals node)
    {
        if(_equals_ != null)
        {
            _equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _equals_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_equals_);
    }

    void removeChild(Node child)
    {
        if(_equals_ == child)
        {
            _equals_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

    }
}
