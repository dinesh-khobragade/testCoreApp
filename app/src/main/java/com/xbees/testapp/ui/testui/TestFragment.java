package com.xbees.testapp.ui.testui;

import com.xbees.testapp.R;
import com.xbees.testapp.databinding.TestFragmentBinding;
import com.xbees.testapp.ui.common.BaseFragment;

public class TestFragment extends BaseFragment<TestViewModel, TestFragmentBinding> {
    @Override
    protected Class<TestViewModel> getViewModel() {
        return TestViewModel.class;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.test_fragment;
    }
}
