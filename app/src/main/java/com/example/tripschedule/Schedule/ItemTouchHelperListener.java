package com.example.tripschedule.Schedule;

public interface ItemTouchHelperListener {
    boolean onItemMove(int from_position, int to_position);

    void onItemSwipe(int position);
}



