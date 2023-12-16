package com.geeks.hw331;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private RecyclerView rvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ContactsAdapter contactsAdapter = new ContactsAdapter(loadData(contacts));
        rvContacts.setAdapter(contactsAdapter);
    }

    private void initView() {
        rvContacts = findViewById(R.id.rv_contacts);
    }

    private ArrayList<Contact> loadData(ArrayList<Contact> contacts) {
        contacts.add(new Contact("Юлия","Авдеева"));
        contacts.add(new Contact("Кирилл","Александров"));
        contacts.add(new Contact("Вероника","Алексеева"));
        contacts.add(new Contact("Мария","Андреева"));
        contacts.add(new Contact("Лев","Артемов"));
        contacts.add(new Contact("Святослав","Белов"));
        contacts.add(new Contact("Сергей","Бондарев"));
        contacts.add(new Contact("Анна","Борисова"));
        contacts.add(new Contact("Дмитрий","Васильев"));
        contacts.add(new Contact("Вероника","Верещагина"));
        contacts.add(new Contact("Вероника","Волкова"));
        contacts.add(new Contact("Александр","Воронин"));
        contacts.add(new Contact("Фёдор","Воронин"));
        contacts.add(new Contact("Мария","Воронова"));
        contacts.add(new Contact("Иван","Гаврилов"));
        contacts.add(new Contact("Мария","Галкина"));
        contacts.add(new Contact("Матвей","Герасимов"));
        contacts.add(new Contact("Матвей","Голубев"));
        contacts.add(new Contact("София","Гончарова"));
        contacts.add(new Contact("Николай","Грачев"));
        contacts.add(new Contact("Дарья","Гурова"));
        return contacts;
    }
}