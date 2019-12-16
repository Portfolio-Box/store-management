package softmobile.storemanagement.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public abstract class FilterableActivity extends BaseActivity
{
    protected Spinner spinner;
    protected ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setLayout();
        setViews();
        setViewsAdapters();
    }

    public abstract void setViewsAdapters();

    protected void setAdapterFromResource(Context context, int textArrayResId)
    {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context, textArrayResId, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }
}