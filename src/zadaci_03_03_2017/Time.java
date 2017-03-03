package zadaci_03_03_2017;

public class Time {

	private long hour;
	private long minute;
	private long second;

	public Time() {
		long millies = System.currentTimeMillis();
		long secondsTotal = millies / 1000;
		long minutesTotal = secondsTotal / 60;
		second = secondsTotal % 60;
		hour = (minutesTotal / 60) % 24 + 1;
		minute = minutesTotal % 60;
	}

	public Time(long elapseTime) {
		long secondsTotal = elapseTime / 1000;
		long minutesTotal = secondsTotal / 60;
		second = secondsTotal % 60;
		hour = (minutesTotal / 60) % 24;
		minute = minutesTotal % 60;

	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long secondsTotal = elapseTime / 1000;
		long minutesTotal = secondsTotal / 60;
		second = secondsTotal % 60;
		hour = (minutesTotal / 60) % 24;
		minute = minutesTotal % 60;

	}

}
