/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPGoal().apply(this);
        outStart(node);
    }

    public void inACmdsGoal(ACmdsGoal node)
    {
        defaultIn(node);
    }

    public void outACmdsGoal(ACmdsGoal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACmdsGoal(ACmdsGoal node)
    {
        inACmdsGoal(node);
        {
            List<PCommands> copy = new ArrayList<PCommands>(node.getCommands());
            Collections.reverse(copy);
            for(PCommands e : copy)
            {
                e.apply(this);
            }
        }
        outACmdsGoal(node);
    }

    public void inAFuncCommands(AFuncCommands node)
    {
        defaultIn(node);
    }

    public void outAFuncCommands(AFuncCommands node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncCommands(AFuncCommands node)
    {
        inAFuncCommands(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFuncCommands(node);
    }

    public void inAStmtCommands(AStmtCommands node)
    {
        defaultIn(node);
    }

    public void outAStmtCommands(AStmtCommands node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtCommands(AStmtCommands node)
    {
        inAStmtCommands(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStmtCommands(node);
    }

    public void inAFuncFunction(AFuncFunction node)
    {
        defaultIn(node);
    }

    public void outAFuncFunction(AFuncFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncFunction(AFuncFunction node)
    {
        inAFuncFunction(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        {
            List<PArgument> copy = new ArrayList<PArgument>(node.getArgument());
            Collections.reverse(copy);
            for(PArgument e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFuncFunction(node);
    }

    public void inAArgArgument(AArgArgument node)
    {
        defaultIn(node);
    }

    public void outAArgArgument(AArgArgument node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArgArgument(AArgArgument node)
    {
        inAArgArgument(node);
        {
            List<PMoreArguments> copy = new ArrayList<PMoreArguments>(node.getMoreArguments());
            Collections.reverse(copy);
            for(PMoreArguments e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PAssignValue> copy = new ArrayList<PAssignValue>(node.getAssignValue());
            Collections.reverse(copy);
            for(PAssignValue e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAArgArgument(node);
    }

    public void inAAssignValue(AAssignValue node)
    {
        defaultIn(node);
    }

    public void outAAssignValue(AAssignValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignValue(AAssignValue node)
    {
        inAAssignValue(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAAssignValue(node);
    }

    public void inAMoreArguments(AMoreArguments node)
    {
        defaultIn(node);
    }

    public void outAMoreArguments(AMoreArguments node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreArguments(AMoreArguments node)
    {
        inAMoreArguments(node);
        {
            List<PAssignValue> copy = new ArrayList<PAssignValue>(node.getAssignValue());
            Collections.reverse(copy);
            for(PAssignValue e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAMoreArguments(node);
    }

    public void inARule1Statement(ARule1Statement node)
    {
        defaultIn(node);
    }

    public void outARule1Statement(ARule1Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule1Statement(ARule1Statement node)
    {
        inARule1Statement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        outARule1Statement(node);
    }

    public void inARule2Statement(ARule2Statement node)
    {
        defaultIn(node);
    }

    public void outARule2Statement(ARule2Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule2Statement(ARule2Statement node)
    {
        inARule2Statement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getId1() != null)
        {
            node.getId1().apply(this);
        }
        if(node.getId0() != null)
        {
            node.getId0().apply(this);
        }
        outARule2Statement(node);
    }

    public void inARule3Statement(ARule3Statement node)
    {
        defaultIn(node);
    }

    public void outARule3Statement(ARule3Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule3Statement(ARule3Statement node)
    {
        inARule3Statement(node);
        {
            List<PMoreExpressions> copy = new ArrayList<PMoreExpressions>(node.getMoreExpressions());
            Collections.reverse(copy);
            for(PMoreExpressions e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outARule3Statement(node);
    }

    public void inARule4Statement(ARule4Statement node)
    {
        defaultIn(node);
    }

    public void outARule4Statement(ARule4Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule4Statement(ARule4Statement node)
    {
        inARule4Statement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outARule4Statement(node);
    }

    public void inARule5Statement(ARule5Statement node)
    {
        defaultIn(node);
    }

    public void outARule5Statement(ARule5Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule5Statement(ARule5Statement node)
    {
        inARule5Statement(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outARule5Statement(node);
    }

    public void inARule6Statement(ARule6Statement node)
    {
        defaultIn(node);
    }

    public void outARule6Statement(ARule6Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule6Statement(ARule6Statement node)
    {
        inARule6Statement(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outARule6Statement(node);
    }

    public void inARule7Statement(ARule7Statement node)
    {
        defaultIn(node);
    }

    public void outARule7Statement(ARule7Statement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule7Statement(ARule7Statement node)
    {
        inARule7Statement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outARule7Statement(node);
    }

    public void inAMoreExpressions(AMoreExpressions node)
    {
        defaultIn(node);
    }

    public void outAMoreExpressions(AMoreExpressions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreExpressions(AMoreExpressions node)
    {
        inAMoreExpressions(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAMoreExpressions(node);
    }

    public void inARule2Expression(ARule2Expression node)
    {
        defaultIn(node);
    }

    public void outARule2Expression(ARule2Expression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule2Expression(ARule2Expression node)
    {
        inARule2Expression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outARule2Expression(node);
    }

    public void inARule3Expression(ARule3Expression node)
    {
        defaultIn(node);
    }

    public void outARule3Expression(ARule3Expression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule3Expression(ARule3Expression node)
    {
        inARule3Expression(node);
        {
            List<PMoreValues> copy = new ArrayList<PMoreValues>(node.getMoreValues());
            Collections.reverse(copy);
            for(PMoreValues e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outARule3Expression(node);
    }

    public void inAMultExpression(AMultExpression node)
    {
        defaultIn(node);
    }

    public void outAMultExpression(AMultExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpression(AMultExpression node)
    {
        inAMultExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAMultExpression(node);
    }

    public void inAAddExpression(AAddExpression node)
    {
        defaultIn(node);
    }

    public void outAAddExpression(AAddExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddExpression(AAddExpression node)
    {
        inAAddExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAAddExpression(node);
    }

    public void inAMinusExpression(AMinusExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusExpression(AMinusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpression(AMinusExpression node)
    {
        inAMinusExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAMinusExpression(node);
    }

    public void inAValueExpression(AValueExpression node)
    {
        defaultIn(node);
    }

    public void outAValueExpression(AValueExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValueExpression(AValueExpression node)
    {
        inAValueExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAValueExpression(node);
    }

    public void inAIdExpression(AIdExpression node)
    {
        defaultIn(node);
    }

    public void outAIdExpression(AIdExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdExpression(AIdExpression node)
    {
        inAIdExpression(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdExpression(node);
    }

    public void inAFuncExpression(AFuncExpression node)
    {
        defaultIn(node);
    }

    public void outAFuncExpression(AFuncExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncExpression(AFuncExpression node)
    {
        inAFuncExpression(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFuncExpression(node);
    }

    public void inAExpExpression(AExpExpression node)
    {
        defaultIn(node);
    }

    public void outAExpExpression(AExpExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExpression(AExpExpression node)
    {
        inAExpExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAExpExpression(node);
    }

    public void inAMoreValues(AMoreValues node)
    {
        defaultIn(node);
    }

    public void outAMoreValues(AMoreValues node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreValues(AMoreValues node)
    {
        inAMoreValues(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAMoreValues(node);
    }

    public void inAValueMultiplication(AValueMultiplication node)
    {
        defaultIn(node);
    }

    public void outAValueMultiplication(AValueMultiplication node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValueMultiplication(AValueMultiplication node)
    {
        inAValueMultiplication(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAValueMultiplication(node);
    }

    public void inAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        inAMultiplicationMultiplication(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        outAMultiplicationMultiplication(node);
    }

    public void inARule1Comparison(ARule1Comparison node)
    {
        defaultIn(node);
    }

    public void outARule1Comparison(ARule1Comparison node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule1Comparison(ARule1Comparison node)
    {
        inARule1Comparison(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outARule1Comparison(node);
    }

    public void inARule2Comparison(ARule2Comparison node)
    {
        defaultIn(node);
    }

    public void outARule2Comparison(ARule2Comparison node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule2Comparison(ARule2Comparison node)
    {
        inARule2Comparison(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outARule2Comparison(node);
    }

    public void inARule3Comparison(ARule3Comparison node)
    {
        defaultIn(node);
    }

    public void outARule3Comparison(ARule3Comparison node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARule3Comparison(ARule3Comparison node)
    {
        inARule3Comparison(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outARule3Comparison(node);
    }

    public void inAFunctionCall(AFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAFunctionCall(AFunctionCall node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionCall(AFunctionCall node)
    {
        inAFunctionCall(node);
        {
            List<PArgList> copy = new ArrayList<PArgList>(node.getArgList());
            Collections.reverse(copy);
            for(PArgList e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAFunctionCall(node);
    }

    public void inAArgList(AArgList node)
    {
        defaultIn(node);
    }

    public void outAArgList(AArgList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArgList(AArgList node)
    {
        inAArgList(node);
        {
            List<PMoreListArguments> copy = new ArrayList<PMoreListArguments>(node.getMoreListArguments());
            Collections.reverse(copy);
            for(PMoreListArguments e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAArgList(node);
    }

    public void inAMoreListArguments(AMoreListArguments node)
    {
        defaultIn(node);
    }

    public void outAMoreListArguments(AMoreListArguments node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMoreListArguments(AMoreListArguments node)
    {
        inAMoreListArguments(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAMoreListArguments(node);
    }

    public void inANumberValue(ANumberValue node)
    {
        defaultIn(node);
    }

    public void outANumberValue(ANumberValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberValue(ANumberValue node)
    {
        inANumberValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberValue(node);
    }

    public void inAStringValue(AStringValue node)
    {
        defaultIn(node);
    }

    public void outAStringValue(AStringValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValue(AStringValue node)
    {
        inAStringValue(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValue(node);
    }

    public void inAIntNumber(AIntNumber node)
    {
        defaultIn(node);
    }

    public void outAIntNumber(AIntNumber node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntNumber(AIntNumber node)
    {
        inAIntNumber(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntNumber(node);
    }

    public void inAIdentifier(AIdentifier node)
    {
        defaultIn(node);
    }

    public void outAIdentifier(AIdentifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifier(AIdentifier node)
    {
        inAIdentifier(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdentifier(node);
    }
}
