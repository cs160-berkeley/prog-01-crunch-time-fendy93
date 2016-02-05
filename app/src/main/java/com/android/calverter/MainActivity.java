package com.android.calverter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText cal;
    EditText pushup_id;
    EditText situp_id;
    EditText squats_id;
    EditText leglift_id;
    EditText plank_id;
    EditText jumpingjacks_id;
    EditText pullup_id;
    EditText cycling_id;
    EditText walking_id;
    EditText jogging_id;
    EditText swimming_id;
    EditText stairclimbing_id;
    EditText weight_id;

    int total_cal;
    int total_pushup;
    int total_situp;
    int total_squats;
    int total_leglift;
    int total_plank;
    int total_jumpingjacks;
    int total_pullup;
    int total_cycling;
    int total_walking;
    int total_jogging;
    int total_swimming;
    int total_stairclimbing;
    int weight;


    ImageButton cal_img_button;
    ImageButton pushup_img_button;
    ImageButton situp_img_button;
    ImageButton squats_img_button;
    ImageButton leglift_img_button;
    ImageButton plank_img_button;
    ImageButton jumpingjacks_img_button;
    ImageButton pullup_img_button;
    ImageButton cycling_img_button;
    ImageButton walking_img_button;
    ImageButton jogging_img_button;
    ImageButton swimming_img_button;
    ImageButton stairclimbing_img_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);


        cal = (EditText) findViewById(R.id.n_calories);
        pushup_id = (EditText) findViewById(R.id.n_pushup);
        situp_id = (EditText) findViewById(R.id.n_situp);
        squats_id = (EditText) findViewById(R.id.n_squats);
        leglift_id = (EditText) findViewById(R.id.n_leglift);
        plank_id = (EditText) findViewById(R.id.n_plank);
        jumpingjacks_id = (EditText) findViewById(R.id.n_jumpingjacks);
        pullup_id = (EditText) findViewById(R.id.n_pullup);
        cycling_id = (EditText) findViewById(R.id.n_cycling);
        walking_id = (EditText) findViewById(R.id.n_walking);
        jogging_id = (EditText) findViewById(R.id.n_jogging);
        swimming_id = (EditText) findViewById(R.id.n_swimming);
        stairclimbing_id = (EditText) findViewById(R.id.n_stairclimbing);
        weight_id = (EditText) findViewById(R.id.n_weight);


        cal_img_button = (ImageButton) findViewById(R.id.calories);
        pushup_img_button = (ImageButton) findViewById(R.id.pushup_icon);
        situp_img_button = (ImageButton) findViewById(R.id.situp_icon);
        squats_img_button = (ImageButton) findViewById(R.id.squats_icon);
        leglift_img_button = (ImageButton) findViewById(R.id.leglift_icon);
        plank_img_button = (ImageButton) findViewById(R.id.plank_icon);
        jumpingjacks_img_button = (ImageButton) findViewById(R.id.jumpingjacks_icon);
        pullup_img_button = (ImageButton) findViewById(R.id.pullup_icon);
        cycling_img_button = (ImageButton) findViewById(R.id.cycling_icon);
        walking_img_button = (ImageButton) findViewById(R.id.walking_icon);
        jogging_img_button = (ImageButton) findViewById(R.id.jogging_icon);
        swimming_img_button = (ImageButton) findViewById(R.id.swimming_icon);
        stairclimbing_img_button = (ImageButton) findViewById(R.id.stairclimbing_icon);

        cal_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_cal = Integer.parseInt(cal.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_cal * 7 / 2;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_cal * 2;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_cal * 9 / 4;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_cal / 4;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_cal / 4;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_cal / 10;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_cal;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_cal * 3 / 25;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_cal / 5;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_cal * 3 / 25;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_cal * 13 / 100;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_cal * 3 / 20;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_cal = 0;
                }
            }
        });

        pushup_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_pushup = Integer.parseInt(pushup_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_pushup * 2 / 7;
                    cal.setText(Integer.toString(total_cal));

                    // sit up
                    total_situp = total_pushup * 4 / 7;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_pushup * 9 / 14;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_pushup / 14;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_pushup / 14;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_pushup / 35;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_pushup * 2 / 7;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_pushup * 6 / 175;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_pushup / 17;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_pushup * 6 / 175;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_pushup * 13 / 350;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_pushup * 3 / 70;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_pushup = 0;
                }
            }
        });

        situp_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_situp = Integer.parseInt(situp_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_situp / 2;
                    cal.setText(Integer.toString(total_cal));

                    // push up
                    total_pushup = total_situp * 7 / 4;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // squats
                    total_squats = total_situp * 9 / 8;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_situp / 8;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_situp / 8;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_situp / 20;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_situp / 2;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_situp * 3 / 50;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_situp / 10;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_situp * 3 / 50;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_situp * 13 / 200;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_situp * 3 / 40;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_situp = 0;
                }
            }
        });

        squats_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_squats = Integer.parseInt(squats_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_squats * 4 / 9;
                    cal.setText(Integer.toString(total_cal));

                    // push up
                    total_pushup = total_squats * 14 / 9;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // situp
                    total_situp = total_squats * 8 / 9;
                    situp_id.setText(Integer.toString(total_situp));

                    // leg-lift
                    total_leglift = total_squats / 9;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_squats / 9;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_squats * 2 / 45;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_squats * 4 / 9;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_squats * 12 / 225;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_squats * 4 / 45;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_squats * 12 / 225;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_squats * 13 / 225;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_squats / 15;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_squats = 0;
                }
            }
        });

        leglift_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_leglift = Integer.parseInt(leglift_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_leglift * 4;
                    cal.setText(Integer.toString(total_cal));

                    // push up
                    total_pushup = total_leglift * 14;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // situp
                    total_situp = total_leglift * 8;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_leglift * 9;
                    squats_id.setText(Integer.toString(total_squats));

                    // plank
                    total_plank = total_leglift;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_leglift * 2 / 5;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_leglift * 4;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_leglift * 12 / 25;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_leglift * 4 / 5;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_leglift * 12 / 25;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_leglift * 13 / 25;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_leglift * 3 / 5;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_leglift = 0;
                }
            }
        });

        plank_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_plank = Integer.parseInt(plank_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_plank * 4;
                    cal.setText(Integer.toString(total_cal));

                    // push up
                    total_pushup = total_plank * 14;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // situp
                    total_situp = total_plank * 8;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_plank * 9;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg lift
                    total_leglift = total_plank;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // jumping jacks
                    total_jumpingjacks = total_plank * 2 / 5;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // pull up
                    total_pullup = total_plank * 4;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_plank * 12 / 25;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_plank * 4 / 5;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_plank * 12 / 25;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_plank * 13 / 25;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_plank * 3 / 5;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_leglift = 0;
                }
            }
        });

        jumpingjacks_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_jumpingjacks = Integer.parseInt(jumpingjacks_id.getText().toString()) * weight / 150;

                    // calories
                    total_cal = total_jumpingjacks * 35;
                    cal.setText(Integer.toString(total_cal));

                    // push up
                    total_pushup = total_jumpingjacks * 35;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // situp
                    total_situp = total_jumpingjacks * 20;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_jumpingjacks * 45 / 2;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg lift
                    total_leglift = total_jumpingjacks * 5 / 2;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_jumpingjacks * 5 / 2;
                    plank_id.setText(Integer.toString(total_plank));

                    // pull up
                    total_pullup = total_jumpingjacks * 10;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_jumpingjacks * 6 / 5;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_jumpingjacks * 2;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_jumpingjacks * 6 / 5;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_jumpingjacks * 13 / 10;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_jumpingjacks * 3 / 2;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_jumpingjacks = 0;
                }
            }
        });

        pullup_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_pullup = Integer.parseInt(pullup_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_pullup * 7 / 2;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_pullup * 2;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_pullup * 9 / 4;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_pullup / 4;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_pullup / 4;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_pullup / 10;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_pullup;
                    cal.setText(Integer.toString(total_cal));

                    // cycling
                    total_cycling = total_pullup * 3 / 25;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // walking
                    total_walking = total_pullup / 5;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_pullup * 3 / 25;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_pullup * 13 / 100;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_pullup * 3 / 20;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_pullup = 0;
                }
            }
        });

        cycling_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_cycling = Integer.parseInt(cycling_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_cycling * 175 / 6;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_cycling * 50 / 3;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_cycling * 75 / 4;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_cycling * 25 / 12;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_cycling * 25 / 12;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_cycling * 5 / 6;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_cycling * 25 / 3;
                    cal.setText(Integer.toString(total_cal));

                    // pull up
                    total_pullup = total_cycling * 25 / 3;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // walking
                    total_walking = total_cycling * 5 / 3;
                    walking_id.setText(Integer.toString(total_walking));

                    // jogging
                    total_jogging = total_cycling;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_cycling * 13 / 12;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_cycling * 5 / 4;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_cycling = 0;
                }
            }
        });

        walking_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_walking = Integer.parseInt(walking_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_walking * 35 / 2;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_walking * 10;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_walking * 45 / 4;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_walking * 5 / 4;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_walking * 5 / 4;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_walking / 2;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_walking * 5;
                    cal.setText(Integer.toString(total_cal));

                    // pull up
                    total_pullup = total_walking * 5;
                    cycling_id.setText(Integer.toString(total_pullup));

                    // cycling
                    total_cycling = total_walking * 3 / 5;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // jogging
                    total_jogging = total_walking * 3 / 5;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_walking * 13 / 20;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_walking * 3 / 4;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_cycling = 0;
                }
            }
        });

        jogging_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_jogging = Integer.parseInt(jogging_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_jogging * 175 / 6;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_jogging * 50 / 3;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_jogging * 75 / 4;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_jogging * 25 / 12;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_jogging * 25 / 12;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_jogging * 5 / 6;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_jogging * 25 / 3;
                    cal.setText(Integer.toString(total_cal));

                    // pull up
                    total_pullup = total_jogging * 25 / 3;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // walking
                    total_walking = total_jogging * 5 / 3;
                    walking_id.setText(Integer.toString(total_walking));

                    // cycling
                    total_cycling = total_jogging;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // swimming
                    total_swimming = total_jogging * 13 / 12;
                    swimming_id.setText(Integer.toString(total_swimming));

                    // stair climbing
                    total_stairclimbing = total_jogging * 5 / 4;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_jogging = 0;
                }
            }
        });

        swimming_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_swimming = Integer.parseInt(swimming_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_swimming * 350 / 13;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_swimming * 200 / 13;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_swimming * 225 / 13;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_swimming * 25 / 13;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_swimming * 25 / 13;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_swimming * 10 / 13;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_swimming * 100 / 13;
                    cal.setText(Integer.toString(total_cal));

                    // pull up
                    total_pullup = total_swimming * 100 / 13;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // walking
                    total_walking = total_swimming * 20 / 13;
                    walking_id.setText(Integer.toString(total_walking));

                    // cycling
                    total_cycling = total_swimming * 12 / 13;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // jogging
                    total_jogging = total_swimming;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // stair climbing
                    total_stairclimbing = total_swimming * 15 / 13;
                    stairclimbing_id.setText(Integer.toString(total_stairclimbing));

                } catch (NumberFormatException e) {
                    total_swimming = 0;
                }
            }
        });

        stairclimbing_img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    weight = Integer.parseInt(weight_id.getText().toString());
                    total_stairclimbing = Integer.parseInt(stairclimbing_id.getText().toString()) * weight / 150;

                    // push up
                    total_pushup = total_stairclimbing * 70 / 3;
                    pushup_id.setText(Integer.toString(total_pushup));

                    // sit up
                    total_situp = total_stairclimbing * 40 / 3;
                    situp_id.setText(Integer.toString(total_situp));

                    // squats
                    total_squats = total_stairclimbing * 15;
                    squats_id.setText(Integer.toString(total_squats));

                    // leg-lift
                    total_leglift = total_stairclimbing * 5 / 3;
                    leglift_id.setText(Integer.toString(total_leglift));

                    // plank
                    total_plank = total_stairclimbing * 5 / 3;
                    plank_id.setText(Integer.toString(total_plank));

                    // jumping jacks
                    total_jumpingjacks = total_stairclimbing * 2 / 3;
                    jumpingjacks_id.setText(Integer.toString(total_jumpingjacks));

                    // calories
                    total_cal = total_stairclimbing * 20 / 3;
                    cal.setText(Integer.toString(total_cal));

                    // pull up
                    total_pullup = total_stairclimbing * 20 / 3;
                    pullup_id.setText(Integer.toString(total_pullup));

                    // walking
                    total_walking = total_stairclimbing * 4 / 3;
                    walking_id.setText(Integer.toString(total_walking));

                    // cycling
                    total_cycling = total_stairclimbing * 12 / 15;
                    cycling_id.setText(Integer.toString(total_cycling));

                    // jogging
                    total_jogging = total_stairclimbing * 12 / 15;
                    jogging_id.setText(Integer.toString(total_jogging));

                    // swimming
                    total_swimming = total_stairclimbing * 13 / 15;
                    swimming_id.setText(Integer.toString(total_swimming));

                } catch (NumberFormatException e) {
                    total_stairclimbing = 0;
                }
            }
        });
    }

    protected void onRestart() {
        super.onRestart();
    }
}