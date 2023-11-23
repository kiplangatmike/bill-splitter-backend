package com.mike.splitwise.model;

import com.mike.splitwise.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinalSplitModel {
    private Long finalPayTo;
    private Long finalPayBy;
    private Float finalAmt;
    private Group finalSplitGrp;
}
