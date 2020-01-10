package com.xbees.testapp.ui;

import com.xbees.testapp.R;
import com.xbees.testapp.databinding.TestFragmentBinding;

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
