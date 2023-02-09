package com.jike.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Cyp123
 * @since 2023-02-09
 */
@TableName("tb_student")
public class TbStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer Sno;
    private String Subject;
    private Integer Score;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer Sno) {
        this.Sno = Sno;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }

    @Override
    public String toString() {
        return "TbStudent{" +
        ", id=" + id +
        ", Sno=" + Sno +
        ", Subject=" + Subject +
        ", Score=" + Score +
        "}";
    }
}
