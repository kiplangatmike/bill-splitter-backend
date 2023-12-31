package com.mike.splitwise.model;

import com.mike.splitwise.entity.Group;
import com.mike.splitwise.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseModel {
    private String expName;
    private Long expAmt;
    private Long expPaidBy;
    private List<User> usrSplitBtw;
    private Group expGrp;
}
