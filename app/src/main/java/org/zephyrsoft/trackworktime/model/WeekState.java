package org.zephyrsoft.trackworktime.model;

import androidx.annotation.NonNull;

public class WeekState {

	@NonNull public WeekRowState header, monday, tuesday, wednesday, thursday, friday, saturday, sunday,
			totals;
	{
		header = new WeekRowState();
		monday = new WeekRowState();
		tuesday = new WeekRowState();
		wednesday = new WeekRowState();
		thursday = new WeekRowState();
		friday = new WeekRowState();
		saturday = new WeekRowState();
		sunday = new WeekRowState();
		totals = new WeekRowState();
	}

	@NonNull @Override public String toString() {
		return header + "\n" +
				monday + "\n" +
				tuesday + "\n" +
				wednesday + "\n" +
				thursday + "\n" +
				friday + "\n" +
				saturday + "\n" +
				sunday + "\n" +
				totals;
	}
}
