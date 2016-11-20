package com.example.work.caferoyale;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LocationMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationmap);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Salmiya = new LatLng(29.343202, 48.069567);
        mMap.addMarker(new MarkerOptions().position(Salmiya).title("CafeRoyale Salmiya Branch"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Salmiya));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Salmiya,12.0f) );

        LatLng Hawally = new LatLng(29.340817, 48.020405);
        mMap.addMarker(new MarkerOptions().position(Hawally).title("CafeRoyale Hawally Branch"));
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(Hawally));

        LatLng Farwaniya = new LatLng(29.281931, 47.960254);
        mMap.addMarker(new MarkerOptions().position(Farwaniya).title("CafeRoyale Farwaniya Branch"));
      //  mMap.moveCamera(CameraUpdateFactory.newLatLng(Farwaniya));


        LatLng Jleeb = new LatLng(29.255278, 47.937605);
        mMap.addMarker(new MarkerOptions().position(Jleeb).title("CafeRoyale Jleeb Branch"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Jleeb));
    }
}
