package ch20.practice;

import java.sql.Date;

import lombok.*;

@Data
public class Board {
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	
}
