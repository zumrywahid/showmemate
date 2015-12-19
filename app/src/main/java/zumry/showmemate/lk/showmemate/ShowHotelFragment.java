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

public class ShowHotelFragment extends Fragment implements OnMapReadyCallback{

    GoogleMap gMap;

    SupportMapFragment mSupportMapFragment;

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_show_hotels, null, false);

        mSupportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.hotelsMapFragment);

        mSupportMapFragment.getMapAsync(this);

        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        System.out.println("ShowHotelFragment onMapReady called,, ");

        gMap = googleMap;

        gMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));


        LatLng sydney = new LatLng(34, 151);
        googleMap.addMarker(new MarkerOptions().position(sydney).title("Marker text"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}