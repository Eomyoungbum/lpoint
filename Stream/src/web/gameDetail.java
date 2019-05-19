package web;

import java.sql.Date;

public class gameDetail {
	
	int index;    //게임번호 (마킹시 변경됨)
	Date gameDAY;    //게임일정
	String events;	//종목
	String league;    //리그
	String homeName;    //홈팀명
	String awayName;    //원정팀명
	String state;    //게임상태
	double oddsWin;    //컬럼1의 배당률(승)
	double oddsDraw;    //컬럼2의 배당률(무)
	double oddsLose;    //컬럼3의 배당률(패)
	boolean blockWin;   //컬럼1 발매차단:true/정상:false
	boolean blockDraw;   //컬럼2 발매차단:true/정상:false
	boolean blockLose;   //컬럼3 발매차단:true/정상:false
	Date endDay;   //마감일시
	double handi1;   //컬럼1의 핸디캡(승)
	double handi2;   //컬럼2의 핸디캡(무)
	double handi3;   //컬럼3의 핸디캡(패)
	int homeScore;   //홈 스코어
	int awayScore;	 //어웨이 스코어
	
}
