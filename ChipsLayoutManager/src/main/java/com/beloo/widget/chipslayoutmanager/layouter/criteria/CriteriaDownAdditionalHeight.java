package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import com.beloo.widget.chipslayoutmanager.layouter.AbstractLayouter;

public class CriteriaDownAdditionalHeight extends FinishingCriteriaDecorator {

    private int additionalHeight;

    public CriteriaDownAdditionalHeight(IFinishingCriteria finishingCriteria, int additionalHeight) {
        super(finishingCriteria);
        this.additionalHeight = additionalHeight;
    }

    @Override
    public boolean isFinishedLayouting(AbstractLayouter abstractLayouter) {
        int bottomBorder = abstractLayouter.getCanvasBottomBorder();
        return super.isFinishedLayouting(abstractLayouter) &&
                //if additional height filled
                abstractLayouter.getRowTop() > bottomBorder + additionalHeight;
    }

}
