package br.com.phddigital.riphe78.util;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleUtil {
    public static RecyclerView preparedRecycleView(View view, int Rid, Context context) {
        return  preparedRecycleView( view,  Rid,  context, LayoutType.LINEAR_LAYOUT) ;
    }
    public static RecyclerView preparedRecycleView(View view, int Rid, Context context, LayoutType layoutType) {
        RecyclerView.LayoutManager layoutManager;
        switch (layoutType) {
            case LINEAR_LAYOUT:
                layoutManager = new LinearLayoutManager(context);
                break;

            default:
                layoutManager = new LinearLayoutManager(context);
        }

        RecyclerView rv = view.findViewById(Rid);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(layoutManager);

        return rv;
    }
}


