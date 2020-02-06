package com.example.shan.taskswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Task> mTaskList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTaskList = new ArrayList<Task>();
        mTaskList.add(
          new Task(1, "Submit Project",
                  "3 Feb 2020")
        );

        mTaskList.add(
                new Task(2, "Submit Project 2",
                        "3 Feb 2020")
        );

        mTaskList.add(
                new Task(3, "Submit Project 3",
                        "3 Feb 2020")
        );

        mTaskList.add(
                new Task(4, "Submit Project 4",
                        "3 Feb 2020")
        );



        mViewPager = (ViewPager) findViewById(R.id.task_view_pager);

        mViewPager.setAdapter(
                new FragmentStatePagerAdapter(
                        getSupportFragmentManager()
                ) {
                    @Override
                    public Fragment getItem(int position) {

                        Task task = mTaskList.get(position);
                        Bundle bundle = new Bundle();
                        bundle.putInt("taskId", task.getTaskId());
                        bundle.putString("taskDesc", task.getTaskDesc());
                        bundle.putString("taskDueDate", task.getDueDate());
                        TaskFragment taskFragment = new TaskFragment();
                        taskFragment.setArguments(bundle);

                        return taskFragment;
                    }

                    @Override
                    public int getCount() {
                        return mTaskList.size();
                    }
                }
        );
    }
}
