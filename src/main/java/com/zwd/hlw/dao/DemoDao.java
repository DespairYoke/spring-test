package com.zwd.hlw.dao;

import com.zwd.hlw.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoDao extends JpaRepository <Person,Long>{
}
