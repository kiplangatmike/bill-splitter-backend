package com.mike.splitwise.service;


import com.mike.splitwise.entity.Expense;
import com.mike.splitwise.entity.FinalSplit;
import com.mike.splitwise.entity.Group;
import com.mike.splitwise.entity.User;
import com.mike.splitwise.model.GroupModel;

import java.util.List;

public interface GroupService {
    Group createGroup(GroupModel groupModel);

    Group getGroupById(Long groupId);

    List<User> addUser(Long grpId, List<User> user);

    List<User> getGroupUsers(Long groupId);

    List<Expense> getGroupExpenses(Long groupId);

    List<FinalSplit> getGroupFinal(Long groupId);

    String deleteGroup(Long groupId);
}
