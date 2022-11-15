package ro.pentalog.pentabar.movieservice.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long Id;
    private String title;
    private String poster;
	public void setPoster(String string) {
		// TODO Auto-generated method stub
		this.poster=string;
	}
	public void setTitle(String string) {
		// TODO Auto-generated method stub
		this.title=string;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return this.Id;
	}
	public String getPoster() {
		// TODO Auto-generated method stub
		return this.poster;
	}
}
