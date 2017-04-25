package com.teamtreehouse.friendlyforecast.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.teamtreehouse.friendlyforecast.services.Forecast;

/**
 * Created by shane on 05/04/2017.
 */

public class ForecastDataSource {

    private SQLiteDatabase mDatabase;
    private ForecastHelper mForecastHelper;

    private Context mContext;

    public ForecastDataSource(Context context) {

        mContext = context;
        mForecastHelper = new ForecastHelper(mContext);

    }
    //open DB

    public void open() throws SQLException {
        mDatabase = mForecastHelper.getWritableDatabase();
    }

    // Close DB

    public void close() {

        mDatabase.close();
    }

    //insert

    public void insertForecast(Forecast forecast) {

        ContentValues values = new ContentValues();
        values.put(ForecastHelper.COLUMN_TEMPERATURE, 75.0);

        mDatabase.insert(ForecastHelper.TABLE_TEMPERATURE, null, values);

    }
    // select

    // update

    //delete

}

