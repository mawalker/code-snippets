package vandy.mooc.base.logging;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

@SuppressWarnings("unused")
public abstract class LifeCycleLoggingSupportFragment extends Fragment {

    protected String TAG = this.getClass().getCanonicalName();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v(TAG, "onCreateView(...) called");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onAttach(Activity activity) {
        Log.v(TAG, "onAttach(...) called");
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        Log.v(TAG, "onDetach(...) called");
        super.onDetach();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.v(TAG, "onConfigurationChanged(...) called");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "onCreate(...) called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.v(TAG, "onPause(...) called");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.v(TAG, "onResume(...) called");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.v(TAG, "onDestroy(...) called");
        super.onDestroy();
    }

    @Override
    public void onDestroyOptionsMenu() {
        Log.v(TAG, "onDestroy(...) called");
        super.onDestroyOptionsMenu();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.v(TAG, "onActivityCreated(...) called");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.v(TAG, "onActivityResult(...) called");
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Log.v(TAG, "onContextItemSelected(...) called");
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu,
                                    View v,
                                    ContextMenuInfo menuInfo) {
        Log.v(TAG, "onCreateContextMenu(...) called");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Log.v(TAG, "onCreateOptionsMenu(...) called");
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroyView() {
        Log.v(TAG, "onDestroyView(...) called");
        super.onDestroyView();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.v(TAG, "onHiddenChanged(...) called");
        super.onHiddenChanged(hidden);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        Log.v(TAG, "onInflate(...) called");
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onLowMemory() {
        Log.v(TAG, "onLowMemory(...) called");
        super.onLowMemory();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.v(TAG, "onOptionsItemSelected(...) called");
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Log.v(TAG, "onOptionsMenuClosed(...) called");
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        Log.v(TAG, "onPrepareOptionsMenu(...) called");
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.v(TAG, "onSaveInstanceState(...) called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        Log.v(TAG, "onStart(...) called");
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.v(TAG, "onStop(...) called");
        super.onStop();
    }

    public void onTrimMemory(int level) {
        Log.e(TAG, "onTrimMemory(...) called. This method has been removed from Support Fragment");
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.v(TAG, "onViewCreated(...) called");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        Log.v(TAG, "onViewStateRestored(...) called");
        super.onViewStateRestored(savedInstanceState);
    }
}
