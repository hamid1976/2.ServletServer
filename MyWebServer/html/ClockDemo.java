class ClockDemo{
	public static void main(String[] args){
		Clock firstClock = new Clock(26753);
		for(int i = 0;i<10;i++)
			firstClock.tick();
		System.out.println("First Clock: "+firstClock.toString());
		Clock secondClock = new Clock(8,44,10);
		for(int i = 0;i<10;i++)
			secondClock.tick();	
		System.out.println("Second Clock: "+secondClock.toString());

		firstClock.addClock(secondClock);
		System.out.println("First Clock: "+firstClock.toString());
		System.out.println("Second Clock: "+secondClock.toString());

		Clock thirdClock = firstClock.subtractClock(secondClock);
		System.out.print("Third Clock: "+thirdClock);
	}
}			
		
class Clock{
	private int hour;
	private int minute;
	private int second;

	Clock(){
		hour = 12;
		minute = 0;
		second = 0;
	}
	Clock(int h,int m,int sec){
		hour = h;
		minute = m;
		second = sec;
	}

	Clock(int sec){	setClock(sec);}

	public void setClock(int s){
		minute = s/60;
		hour = s/3600;
		second = s % 60;
	}

	public int getHours(){ return hour; }
	public int getMinutes(){ return minute; }
	public int getSeconds(){ return second; }

	public void setHour(int h){ hour = h;}
	public void setMinute(int m){ minute = m;}
	public void setSeconds(int s){ second = s;}
	
	public void tick(){
		if(second >= 59){
			if(minute >= 59){
				if(hour == 24){
					hour = 1;
					minute = 0;	
					second = 0;
				}
				else{
					hour++;
					minute = 0;
					second = 0;
				}
			}
			else{
				minute++;
				second = 0;
			}
		}
		else
			second++;
	}
	public void addClock(Clock c){
		this.hour += c.hour;
		this.minute += c.minute;	
		this.second += c.second;
	}
	public String  toString(){ 
		String h,m,s;

		if(hour < 10)
			h = "0"+hour;
		else h = ""+hour;
		if(minute < 10)
			m = "0"+minute;
		else m = ""+minute;
		if(second < 10)
			s = "0"+second;
		else s = ""+second;
		
		return h+":"+m+":"+s;
	}
	public void tickDown(){
		if(second == 0){
			if(minute == 0){ 
				if(hour == 1){
					hour = 24;
					minute = 59;	
					second = 59;
				}else {
					hour--;
					minute = 59;
					second = 59;	
				}
			}else{ 		
				minute--;
				second = 59;
			}
		}else
			second--;
	}
	
	public Clock subtractClock(Clock c){
		Clock td = new Clock(0);
		td.hour = this.hour-c.hour;
		td.minute = this.minute-c.minute;
		td.second = this.second-c.second;
		return td;
	}	
}