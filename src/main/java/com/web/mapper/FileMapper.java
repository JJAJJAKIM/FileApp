package com.web.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

@Mapper
public interface FileMapper {

	@SelectKey(statementType = StatementType.PREPARED, statement = "select last_insert_id() as no", keyProperty = "no", before = false, resultType = int.class)
	@Insert("INSERT INTO images (`nm1`,`nm2`,`extension`,`path`,`type`) VALUE (#{nm1},#{nm2},#{extension},#{path},#{type})")
	public int save(FileDTO dto);
	
	@Select("SELECT path FROM images WHERE no = #{no}")
	public FileDTO findByNo(int no);

	@Select("SELECT path FROM images order by no desc")
	public List<String> findAll();
	
}
