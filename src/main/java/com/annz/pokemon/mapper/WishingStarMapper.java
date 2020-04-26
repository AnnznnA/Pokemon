package com.annz.pokemon.mapper;

import com.annz.pokemon.Domain.WishingStar;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WishingStarMapper {
    @Select("select account from wishingstar where  id= #{aaaa} and password = #{bbbb}")
    public String selectac(@Param("aaaa") int id,@Param("bbbb")String password);
    WishingStar selectstar(int id);
    List<WishingStar> selectAllstar();
    int CreatWs(WishingStar ws);
    int updateWs( String password,  int id);
    @Delete("delete from wishingstar where id = #{parmid}")
    public int deletews(@Param("parmid") int id);

}