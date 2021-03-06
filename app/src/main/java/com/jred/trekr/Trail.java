package com.jred.trekr;


import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Trail {

    private long _id;
    private String _trailName;
    private String _locationName;
    private ArrayList<LatLng> _pathValues;
    private ArrayList<POI> _POIList;

    public Trail()
    {
    }

    public Trail(long id, String trailName, String locationName, ArrayList<LatLng> pathValues)
    {
        this._id = id;
        this._trailName = trailName;
        this._locationName = locationName;
        this._pathValues = pathValues;
    }

    public Trail(String trailName, ArrayList<LatLng> pathValues)
    {
        this._trailName = trailName;
        this._pathValues = pathValues;
    }

    public void setID(long id)
    {
        this._id = id;
    }

    public long getID()
    {
        return this._id;
    }

    public void setTrailName(String trailName)
    {
        this._trailName = trailName;
    }

    public String getTrailName()
    {
        return this._trailName;
    }

    public void setLocationName(String locationName)
    {
        this._locationName = locationName;
    }

    public String getLocationName()
    {
        return this._locationName;
    }

    public void setPathValues(ArrayList<LatLng> pathValues)
    {
        this._pathValues = pathValues;
    }

    public ArrayList<LatLng> getPathValues()
    {
        return this._pathValues;
    }

    public void setPOIList(ArrayList<POI> POIList)
    {
        this._POIList = POIList;
    }

    public ArrayList<POI> getPOIList()
    {
        return this._POIList;
    }

}
