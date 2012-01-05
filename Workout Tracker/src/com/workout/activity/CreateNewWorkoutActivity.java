package com.workout.activity;

import android.app.Activity;
import android.os.Bundle;

public class CreateNewWorkoutActivity extends Activity
{
	public void onCreate(Bundle savedState)
	{
		super.onCreate(savedState);
		this.setContentView(com.workout.R.layout.create_new_workout_layout);
	}
}
