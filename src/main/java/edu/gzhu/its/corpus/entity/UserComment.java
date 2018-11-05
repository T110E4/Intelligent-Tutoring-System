package edu.gzhu.its.corpus.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户评论
 * @author dinggz
 *
 */
@Entity
@Table(name = "user_comment")
public class UserComment {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	// 汉字
	@Column(name = "content",columnDefinition="text")
	private String content;
	
	//课程
	@Column(name = "course")
	private String course;
	
	@Column(name = "createTime")
	private Date createTime;
	
	@Column(name = "against",columnDefinition="int(2) default 0")
	private int against;
	
	@Column(name = "vote",columnDefinition="int(2) default 0")
	private int vote;
	
	@Column(name = "favCount",columnDefinition="int(2) default 0")
	private int favCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getAgainst() {
		return against;
	}

	public void setAgainst(int against) {
		this.against = against;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public int getFavCount() {
		return favCount;
	}

	public void setFavCount(int favCount) {
		this.favCount = favCount;
	}
	
}