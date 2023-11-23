package com.mike.splitwise.service;

import com.mike.splitwise.entity.FinalSplit;
import com.mike.splitwise.model.FinalSplitModel;

import java.util.List;

public interface FinalSplitService {
    List<FinalSplitModel> getFinalSplit(Long groupId);
}
