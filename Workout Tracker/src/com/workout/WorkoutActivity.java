package com.workout;

import com.workout.activity.CreateNewWorkoutActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkoutActivity extends Activity 
{

	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_page_layout);
        
        
    }
	
	public void newWorkoutButtonClicked(View view)
	{
		this.startActivity(new Intent(this, CreateNewWorkoutActivity.class));
	}
}