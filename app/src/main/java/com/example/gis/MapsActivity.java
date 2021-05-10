package com.example.gis;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng alfamidi = new LatLng(-0.8536320676632304, 119.88371151378654);
        mMap.addMarker(new MarkerOptions().position(alfamidi).title("Saya berada Di AlfaMidi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alfamidi));

        LatLng undata = new LatLng(-0.8578732373151504, 119.88407508314812);
        mMap.addMarker(new MarkerOptions().position(undata).title("RSUD UNDATA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(undata));


        mMap.addPolyline(new PolylineOptions().add(
                alfamidi,
                new LatLng(-0.8536320676632304, 119.88371151378654),
                new LatLng(-0.8554227843103825, 119.88408854868004),
                new LatLng(-0.8572000360963641, 119.88361725506316),
                new LatLng(-0.8574558525734426, 119.88395389336092),
                new LatLng(-0.857805917198596, 119.88384616910564),
                new LatLng(-0.857805917198596, 119.88387310016947),
                new LatLng(-0.8578732373151504, 119.88407508314812),
                undata
                ).width(10)
                        .color(Color.BLUE)

        );
    }
}