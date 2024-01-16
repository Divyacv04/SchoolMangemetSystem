package com.School.Management.System.Entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Schedule {
	@Id
	private int ScheduleId;
	public int getScheduleId() {
		return ScheduleId;
	}
	public void setScheduleId(int scheduleId) {
		ScheduleId = scheduleId;
	}
	public LocalTime getOpensAt() {
		return OpensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		OpensAt = opensAt;
	}
	public LocalTime getClosesAt() {
		return ClosesAt;
	}
	public void setClosesAt(LocalTime closesAt) {
		ClosesAt = closesAt;
	}
	public LocalTime getClassHourPerDay() {
		return ClassHourPerDay;
	}
	public void setClassHourPerDay(LocalTime classHourPerDay) {
		ClassHourPerDay = classHourPerDay;
	}
	public LocalTime getClassHourLength() {
		return ClassHourLength;
	}
	public void setClassHourLength(LocalTime classHourLength) {
		ClassHourLength = classHourLength;
	}
	public LocalTime getBreakTime() {
		return BreakTime;
	}
	public void setBreakTime(LocalTime breakTime) {
		BreakTime = breakTime;
	}
	public LocalTime getBreakLength() {
		return BreakLength;
	}
	public void setBreakLength(LocalTime breakLength) {
		BreakLength = breakLength;
	}
	public LocalTime getLunchTime() {
		return LunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		LunchTime = lunchTime;
	}
	public LocalTime getLunchLength() {
		return LunchLength;
	}
	public void setLunchLength(LocalTime lunchLength) {
		LunchLength = lunchLength;
	}
	private LocalTime OpensAt;
	private LocalTime ClosesAt;
	private LocalTime ClassHourPerDay;
	private LocalTime ClassHourLength;
	private LocalTime BreakTime;
	private LocalTime BreakLength;
	private LocalTime LunchTime;
	private LocalTime LunchLength;
	
  
    
	
	

}
