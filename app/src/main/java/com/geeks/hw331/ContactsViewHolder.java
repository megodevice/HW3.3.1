package com.geeks.hw331;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContactName;
    private TextView tvContactInitials;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        tvContactName = itemView.findViewById(R.id.text_view_contact_name);
        tvContactInitials = itemView.findViewById(R.id.text_view_contact_initials);
    }

    public void onBind(String contactName, String contactSurname) {
        String fullName = contactName + " " + contactSurname;
        tvContactName.setText(fullName);
        if (contactName.length() > 1 && contactSurname.length() > 1) {
            String initials = contactName.substring(0, 1) + contactSurname.charAt(0);
            tvContactInitials.setText(initials);
        }
    }
}
