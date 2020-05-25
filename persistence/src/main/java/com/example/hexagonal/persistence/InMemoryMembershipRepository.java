package com.example.hexagonal.persistence;

import com.example.hexagonal.common.MembershipRepository;

import java.util.AbstractMap;
import java.util.HashMap;

public class InMemoryMembershipRepository implements MembershipRepository {

    private AbstractMap<Integer, String> members;

    public InMemoryMembershipRepository() {
        members = new HashMap<Integer, String>();
    }

    public boolean isRegistered(int membershipId) {
        return members.containsKey(membershipId);
    }

    public void registerMember(int membershipId, String name) {
        members.put(membershipId, name);
    }
}
