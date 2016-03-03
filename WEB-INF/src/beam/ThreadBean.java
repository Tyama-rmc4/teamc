package beam;

public class ThreadBean implements Beam {
	private int thread_id;
	private String thread_name;
	private String create_day;
	//set
	public void setThread_id(int thread_id){
		this.thread_id = thread_id;
	}
	public void setThread_name(String thread_name){
		this.thread_name = thread_name;
	}
	public void setCreate_day(String create_day){
		this.create_day = create_day;
	}
	//get
	public int getThread_id(){
		return thread_id;
	}
	public String getThread_name(){
		return thread_name;
	}
	public String getCreate_day(){
		return create_day;
	}
}
