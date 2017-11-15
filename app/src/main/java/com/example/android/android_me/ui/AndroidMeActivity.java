/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // Create a new head BodyPartFragment
        BodyPartFragment headFragment = new BodyPartFragment();

        // TODO DONE (4) Set the list of image id's for the head fragment and set the position to the second image in the list

        // Set the list of image id's for the head fragment and set the position to the second image in the list
        headFragment.setImageIds(AndroidImageAssets.getHeads());
        headFragment.setListInedx(1);

        // Add the fragment to its container using a FragmentManager and a Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();

        // TODO (5) Create and display the body and leg BodyPartFragments
        // Create a body of BodyPartFragment
        BodyPartFragment bodyFragment = new BodyPartFragment();

        // Set the list of image id's for the body fragment and set the position to the second image in the list
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setListInedx(1);

        //Add the fragment to it's container using a FragmentManager and a Transaction
        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        // Create a leg of BodyPartFragment
        BodyPartFragment legFragment = new BodyPartFragment();

        // Set the list of image id's for the body fragment and set the position to the second image in the list
        legFragment.setImageIds(AndroidImageAssets.getLegs());
        legFragment.setListInedx(1);

        //Add the fragment to it's container using a FragmentManager and a Transaction
        fragmentManager.beginTransaction()
                .add(R.id.leg_container, legFragment)
                .commit();

    }
}
