/*
* Created By: Joe Novak and Kole Woodley
* Date: November 2015
* Title: Renterprise Enter Car
* Created in Android Studio Version 1.4
* Description: This app displays a series of vehicles which can be rented. Upon making a selection,
* a larger image of the vehicle is displayed with a toast message displaying rental rates and information.
*
* Asset Attribution: Images taken from various sources from Google Image Search
*   for educational purposes.
*
* Banana Chocolate Chip Muffin Recipe
*   Ingredients:
*       3 medium very ripe bananas
*       1 egg (free range, conflict free, fair wage)
*       1/3 cup low-fat buttermilk or regular 2% milk (gluten free)
*       1/2 cup granulated sugar
*       1/2 cup brown sugar
*       1 1/2 cups flower
*       1 teaspoon baking soda
*       1 tea spoon salt
*       2-3 tablespoons chocolate chips (heaping or 2-3 additional tablespoons, or cups)
*
*   Directions:
*        1. Preheat Oven to 350 Degrees
*        2. Mash bananas in large bowl with  fork (spoon can be used if you have not done dishes)
*        3. Whisk in egg, milk, granulated and brown sugar
*        4. Combine flour, baking soda and salt in separate bowl
*        5. Add the flour mixture to the banana mixture
*        6. Fold in chocolate chips
*        7. Pour mix into muffin tins
*        8 Bake in over for 30 minutes as follows:
*
*           if (muffinConsistencyClean != true)
*           {
*               muffin.leaveInOven(10000);  //time in milliseconds
*           }
*           else
*           {
*               muffin.remove();
*               muffin.coolInPan(true, 30000); //time in milliseconds
*               muffin.coolInRack(true);
*           }
*
* Variables:
* n/a
*
*
*
* */


package com.example.kolew.renterpriseentercar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton ibVan = (ImageButton) findViewById(R.id.ibVan);
        final ImageButton ibCar = (ImageButton) findViewById(R.id.ibCar);
        final ImageButton ibTruck = (ImageButton) findViewById(R.id.ibTruck);
        final ImageButton ibBox = (ImageButton) findViewById(R.id.ibBox);

        final ImageView ivDisplay = (ImageView) findViewById(R.id.ivDisplay);


        //Van Button, Toast with rates and information, change image
        ibVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDisplay.setImageResource(R.drawable.van);
                Toast.makeText(MainActivity.this, "Make: Maximo mini Van\nRate: $130/day + tax and extras.", Toast.LENGTH_LONG).show();
            }
        });
        //Car Button, Toast with rates and information, change image
        ibCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDisplay.setImageResource(R.drawable.car);
                Toast.makeText(MainActivity.this, "Make: BMW 3 Series\nRate: $170/day + tax and extras.", Toast.LENGTH_LONG).show();
            }
        });

        //Truck Button, Toast with rates and information, change image
        ibTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDisplay.setImageResource(R.drawable.truck);
                Toast.makeText(MainActivity.this, "Make: Toyota Tacoma\nRate: $100/day + tax and extras.", Toast.LENGTH_LONG).show();
            }
        });

        //Box Button, Toast with rates and information, change image
        ibBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivDisplay.setImageResource(R.drawable.box);
                Toast.makeText(MainActivity.this, "Make: File Master 9000\nRate: $1/day + tax and extras.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
