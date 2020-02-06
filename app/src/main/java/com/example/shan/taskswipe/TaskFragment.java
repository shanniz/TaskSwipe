package com.example.shan.taskswipe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TaskFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_task,
                container,
                false);

        Bundle bundle = this.getArguments();

        TextView textViewTaskId = view.findViewById(R.id.textViewTaskId);
        TextView textViewTaskDesc = view.findViewById(R.id.textViewTaskDesc);
        TextView textViewTaskDueDate = view.findViewById(R.id.textViewTaskDueDate);

        int taskId = bundle.getInt("taskId");
        String taskDesc = bundle.getString("taskDesc");
        String taskDueDate = bundle.getString("taskDueDate");

        textViewTaskId.setText(String.valueOf( taskId) );
        textViewTaskDesc.setText(taskDesc );
        textViewTaskDueDate.setText(taskDueDate );

        return view;
    }
}
