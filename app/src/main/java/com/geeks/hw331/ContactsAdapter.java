package com.geeks.hw331;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private final ArrayList<Contact> contactData;

    public ContactsAdapter(ArrayList<Contact> contactData) {
        this.contactData = contactData;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_contacts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.onBind(contactData.get(position).getName(), contactData.get(position).getSurname());
    }

    @Override
    public int getItemCount() {
        return contactData.size();
    }
}
