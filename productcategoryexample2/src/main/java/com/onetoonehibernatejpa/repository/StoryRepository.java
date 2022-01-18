package com.onetoonehibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onetoonehibernatejpa.entity.Story;

public interface StoryRepository extends JpaRepository<Story, String>
{

}
