package kale.ui;

import android.app.Activity;
import android.view.View;

import kale.ui.uiblock.UiBlock;

/**
 * @author Jack Tony
 * @date 2015/9/22
 */
public class DemoMiddleUiBlock extends UiBlock {

    @Override
    public View initRootView(Activity activity) {
        return activity.findViewById(R.id.middle_ub);
    }

    @Override
    protected void onBindViews() {
        getActivity().getUiBlockManager().add(new DemoInnerUiBlock());
    }

    @Override
    protected void onSetViews() {
        getRootView().setBackgroundColor(0xffff5722);
    }
}
