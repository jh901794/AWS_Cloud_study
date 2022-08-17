	package j20220812;

public class NewsBean {
	//홈 사회 정치 경제 국제 문화 IT 연재 포토 팩트체크
	private int news_num;
	private String news_home, news_society, news_politics, news_economy, news_international, news_culture, news_it, news_publish, news_photo, news_factcheck;
	
	public NewsBean(int news_num, String news_home, String news_society, String news_politics, String news_economy,
			String news_international, String news_culture, String news_it, String news_publish, String news_photo,
			String news_factcheck) {
		this.news_num = news_num;
		this.news_home = news_home;
		this.news_society = news_society;
		this.news_politics = news_politics;
		this.news_economy = news_economy;
		this.news_international = news_international;
		this.news_culture = news_culture;
		this.news_it = news_it;
		this.news_publish = news_publish;
		this.news_photo = news_photo;
		this.news_factcheck = news_factcheck;
	}

	public int getNews_num() {
		return news_num;
	}

	public void setNews_num(int news_num) {
		this.news_num = news_num;
	}

	public String getNews_home() {
		return news_home;
	}

	public void setNews_home(String news_home) {
		this.news_home = news_home;
	}

	public String getNews_society() {
		return news_society;
	}

	public void setNews_society(String news_society) {
		this.news_society = news_society;
	}

	public String getNews_politics() {
		return news_politics;
	}

	public void setNews_politics(String news_politics) {
		this.news_politics = news_politics;
	}

	public String getNews_economy() {
		return news_economy;
	}

	public void setNews_economy(String news_economy) {
		this.news_economy = news_economy;
	}

	public String getNews_international() {
		return news_international;
	}

	public void setNews_international(String news_international) {
		this.news_international = news_international;
	}

	public String getNews_culture() {
		return news_culture;
	}

	public void setNews_culture(String news_culture) {
		this.news_culture = news_culture;
	}

	public String getNews_it() {
		return news_it;
	}

	public void setNews_it(String news_it) {
		this.news_it = news_it;
	}

	public String getNews_publish() {
		return news_publish;
	}

	public void setNews_publish(String news_publish) {
		this.news_publish = news_publish;
	}

	public String getNews_photo() {
		return news_photo;
	}

	public void setNews_photo(String news_photo) {
		this.news_photo = news_photo;
	}

	public String getNews_factcheck() {
		return news_factcheck;
	}

	public void setNews_factcheck(String news_factcheck) {
		this.news_factcheck = news_factcheck;
	}


}
