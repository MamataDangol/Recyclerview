package com.mamata.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context mcontext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mcontext, List<Contacts> contactsList) {
        this.mcontext = mcontext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact,parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        final Contacts contacts = contactsList.get(position);
        holder.imgid.setImageResource(contacts.getImgid());
        holder.contactname.setText(contacts.getContactname());
        holder.contactphone.setText(contacts.getContactphone());

        holder.imgid.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, DetailsActivity.class);
                intent.putExtra("image",contacts.getImgid());
                intent.putExtra("name",contacts.getContactname());
                intent.putExtra("phone",contacts.getContactphone());
                mcontext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
            CircleImageView imgid;
            TextView contactname, contactphone;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgid = itemView.findViewById(R.id.imgid);
            contactname = itemView.findViewById(R.id.contactname);
            contactphone = itemView.findViewById(R.id.contactphone);

        }
    }
}
