package com.siping.Identify.dao;

import java.util.List;
import java.util.Map;

import com.siping.Identify.bean.Identify;

public interface IdentifyDao {
    public Identify getIdentifyByUserId(int userId);

    public void updateIdentify(Identify identify);

    public void addIdentify(Identify identify);

    public void deleteIdentify(int id);

    public List<Identify> getAllIdentify();

    public List<Identify> getIdentifyByPage(Map<String, Object> map);

    public List<Identify> getIdentifyByIn(List<Integer> list);

    public List<Identify> getIdentifyByComplex(Map<String, Object> map);

    public List<Identify> getIdentifyChoose(Map<String, Object> map);

}
