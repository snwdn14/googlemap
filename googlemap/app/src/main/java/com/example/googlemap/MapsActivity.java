package com.example.googlemap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
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
        LatLng manaoag = new LatLng(16.06871893449106, 120.52007962952524);
        mMap.addMarker(new MarkerOptions().position(manaoag).title("Marker in Snowden's House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(manaoag));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);

        LatLng ucu = new LatLng(15.980212399272366, 120.56049668120393);
        mMap.addMarker(new MarkerOptions().position(ucu).title("Marker in UCU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ucu));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng( 16.068716574596863, 120.52009776515368),
                        new LatLng(16.068709486702197, 120.52019633632513),
                        new LatLng(16.068691227265347, 120.52032773383438),
                        new LatLng(16.069361355141762, 120.52047468611026),
                        new LatLng(16.069479271517075, 120.52055984624472),
                        new LatLng(16.069700283991374, 120.52047937997428),
                        new LatLng( 16.069644225458298, 120.51993757376925),
                        new LatLng( 16.069602342636255, 120.51959290991947),
                        new LatLng( 16.06728132995657, 120.51894823724962),
                        new LatLng( 16.065407526001366, 120.51814893895705),
                        new LatLng( 16.06140598050439, 120.51600585405649),
                        new LatLng( 16.05977956444954, 120.51549086991061),
                        new LatLng( 16.057547409216834, 120.51461646976907),
                        new LatLng( 16.056454520371524, 120.51418195186746),
                        new LatLng( 16.055485349797763, 120.51358650150469),
                        new LatLng( 16.053825376439768, 120.51038930842367),
                        new LatLng( 16.052928366441048, 120.50915549224366),
                        new LatLng( 16.051984955020565, 120.50726185269252),
                        new LatLng( 16.051789054813497, 120.50705264033587),
                        new LatLng( 16.051252905923885, 120.50665567344124),
                        new LatLng( 16.048226730750226, 120.50455282161481),
                        new LatLng( 16.04814424492423, 120.50433824491499),
                        new LatLng( 16.04817517710054, 120.50276647036861),
                        new LatLng( 16.04674198062144, 120.50146828119148),
                        new LatLng( 16.04573667478174, 120.49996087979628),
                        new LatLng( 16.045071623494792, 120.49803505360534),
                        new LatLng( 16.044664342941605, 120.4959804815026),
                        new LatLng( 16.044530301058693, 120.49362013765777),
                        new LatLng( 16.044620430421862, 120.49039028063245),
                        new LatLng( 16.04454309854868, 120.48739693539751),
                        new LatLng( 16.043367650568413, 120.48749885932992),
                        new LatLng( 16.042676813841926, 120.48819623365345),
                        new LatLng( 16.04137762189698, 120.48908136259625),
                        new LatLng( 16.039774242390788, 120.48983238110492),
                        new LatLng( 16.03894419197382, 120.49014351735438),
                        new LatLng( 16.03772746587539, 120.49129686718905),
                        new LatLng( 16.032545985545763, 120.49897871371299),

                        new LatLng( 16.032512908044563, 120.4990100225195),
                        new LatLng( 16.031024818478713, 120.50137774248346),
                        new LatLng( 16.03075156044539, 120.50181762482826),
                        new LatLng( 16.029875069929226, 120.5027242114673),
                        new LatLng( 16.02631303895987, 120.50547091637885),
                        new LatLng( 16.02492093300972, 120.50611464652637),
                        new LatLng( 16.020548625987967, 120.50780980263126),
                        new LatLng( 16.020208324485345, 120.50811021002704),
                        new LatLng( 16.01645465731714, 120.51727800030348),
                        new LatLng( 16.003834496357687, 120.53429661675422),
                        new LatLng( 16.00340908378514, 120.53475795667376),

                        new LatLng( 16.00352510547329, 120.53462384629603),
                        new LatLng( 15.995178180989212, 120.5402998733521),
                        new LatLng( 15.99241544168287, 120.5422726380431),
                        new LatLng( 15.990720520156039, 120.54369947848527),
                        new LatLng( 15.988968997234272, 120.5464633636337),
                        new LatLng( 15.987380667524684, 120.54856621553512),
                        new LatLng( 15.986669009220181, 120.54991804881708),

                        new LatLng( 15.985276626942309, 120.553603403949),
                        new LatLng( 15.984951736346353, 120.554719202927),
                        new LatLng( 15.984544333104584, 120.55562578958528),
                        new LatLng( 15.982729057962569, 120.55837237156409),
                        new LatLng( 15.981809810782103, 120.56012519525711),
                        new LatLng( 15.98142302950364, 120.56021102594437),
                        new LatLng( 15.980212399272366, 120.56049668120393))


                .width(10)
                .color(Color.BLUE));
//Snowden's location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.06871893449106, 120.52007962952524))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //UCU location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9796885700614, 120.5607071226075))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
    }
}
