package zumry.showmemate.lk.showmemate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MyMapFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap gMap;

    SupportMapFragment mSupportMapFragment;

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_show_my_location, null, false);

        mSupportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.Mymap);

        mSupportMapFragment.getMapAsync(this);

        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        gMap = googleMap;
        gMap.animateCamera(CameraUpdateFactory.zoomTo(14), 2000, null);

        LatLng sydney = new LatLng(-34, 151);

        gMap.addMarker(new MarkerOptions().position(sydney)).setVisible(true);
        // Move the camera instantly to location with a zoom of 15.
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15));
        // Zoom in, animating the camera.
        gMap.animateCamera(CameraUpdateFactory.zoomTo(14), 2000, null);

    }
}