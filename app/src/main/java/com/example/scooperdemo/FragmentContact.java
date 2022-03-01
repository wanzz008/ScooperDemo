package com.example.scooperdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import com.example.scooperdemo.adapter.ContactAdapter;
import com.example.scooperdemo.adapter.DeptAdapter;
import com.example.scooperdemo.bean.ContactResponse;
import com.example.scooperdemo.http.RequestUtils;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 应急通讯录
 */
public class FragmentContact extends Fragment {

    private View inflate;
    private DeptAdapter deptAdapter;
    private ArrayList<String> depts;
    private ContactAdapter contactAdapter;
    private ArrayList<ContactResponse.ContentBean> contacts;
    private HashMap<String, ArrayList<ContactResponse.ContentBean>> hashMap = new HashMap<>();
    private int lastClickDept = -1;
    private ArrayList<ContactResponse.ContentBean> searchResult;
    private ContactAdapter searchAdapter;
    private List<ContactResponse.ContentBean> allContact;
    private RecyclerView rvSearch;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.fragment_emergency_contact, null);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initSearch();
        initList();
        initData();
    }

    private void initSearch() {
        EditText etSearch = inflate.findViewById(R.id.etSearch);
        etSearch.setOnEditorActionListener((textView, i, keyEvent) -> {
            if (i == EditorInfo.IME_ACTION_SEARCH) {
                String key = textView.getText().toString().trim();
                searchResult.clear();
                if (!key.isEmpty() && allContact != null) {
                    for (int j = 0; j < allContact.size(); j++) {
                        ContactResponse.ContentBean bean = allContact.get(j);
                        String phone = bean.getPhone();
                        String userName = bean.getUserName();
                        if (phone.contains(key) || userName.contains(key)) {
                            searchResult.add(bean);
                        }
                    }
                    if (searchResult.size() > 0) {
                        rvSearch.setVisibility(View.VISIBLE);
                        searchAdapter.notifyDataSetChanged();
                    }
                }
            }
            return false;
        });
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etSearch.getText().toString().trim().isEmpty()) {
                    rvSearch.setVisibility(View.GONE);
                }
            }
        });
    }

    private void initList() {
        RecyclerView rvDept = inflate.findViewById(R.id.rv_dept);
        RecyclerView rvUser = inflate.findViewById(R.id.rv_user);
        rvSearch = inflate.findViewById(R.id.rv_search);
        depts = new ArrayList<>();
        deptAdapter = new DeptAdapter(getContext(), R.layout.item_text, depts);
        rvDept.setAdapter(deptAdapter);
        deptAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                if (position == lastClickDept) return;
                contacts.clear();
                contacts.addAll(hashMap.get(depts.get(position)));
                contactAdapter.notifyDataSetChanged();
                deptAdapter.setSelectIndex(position);
                lastClickDept = position;
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });

        contacts = new ArrayList<>();
        contactAdapter = new ContactAdapter(getContext(), R.layout.item_contact, contacts);
        rvUser.setAdapter(contactAdapter);

        searchResult = new ArrayList<>();
        searchAdapter = new ContactAdapter(getContext(), R.layout.item_contact, searchResult);
        rvSearch.setAdapter(searchAdapter);
    }

    private void initData() {
        RequestUtils.getBook(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                ContactResponse body = response.body();
                allContact = body.getContent();
                if (allContact != null) {
                    for (int i = 0; i < allContact.size(); i++) {
                        ContactResponse.ContentBean contentBean = allContact.get(i);
                        String departmentName = contentBean.getDepartmentName();
                        if (!depts.contains(departmentName)) {
                            depts.add(departmentName);
                            ArrayList<ContactResponse.ContentBean> contentBeans = new ArrayList<>();
                            contentBeans.add(contentBean);
                            hashMap.put(departmentName, contentBeans);
                        } else {
                            hashMap.get(departmentName).add(contentBean);
                        }
                    }
                    deptAdapter.notifyDataSetChanged();
                    if (depts.size() > 0) {
                        lastClickDept = 0;
                        contacts.addAll(hashMap.get(depts.get(0)));
                        contactAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {

            }
        });
    }
}
