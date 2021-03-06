/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule1ComparisonOperator extends PComparisonOperator
{
    private TGrt _grt_;

    public ARule1ComparisonOperator()
    {
    }

    public ARule1ComparisonOperator(
        TGrt _grt_)
    {
        setGrt(_grt_);

    }
    public Object clone()
    {
        return new ARule1ComparisonOperator(
            (TGrt) cloneNode(_grt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule1ComparisonOperator(this);
    }

    public TGrt getGrt()
    {
        return _grt_;
    }

    public void setGrt(TGrt node)
    {
        if(_grt_ != null)
        {
            _grt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _grt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_grt_);
    }

    void removeChild(Node child)
    {
        if(_grt_ == child)
        {
            _grt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_grt_ == oldChild)
        {
            setGrt((TGrt) newChild);
            return;
        }

    }
}
