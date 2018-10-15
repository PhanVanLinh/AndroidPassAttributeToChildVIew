package vn.linh.androidpassattributetochildview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class CustomRelativeLayout extends RelativeLayout {

    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return super.generateLayoutParams(lp);
    }

    @Override
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
        Log.i("TAG", "title = " + layoutParams.title);
    }

    class LayoutParams extends RelativeLayout.LayoutParams {
        String title;

        LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray ta =
                    c.obtainStyledAttributes(attrs, R.styleable.CustomRelativeLayout_Layout);
            title = ta.getString(R.styleable.CustomRelativeLayout_Layout_layout_title);
            ta.recycle();
        }
    }
}
