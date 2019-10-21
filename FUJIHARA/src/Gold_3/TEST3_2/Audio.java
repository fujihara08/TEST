package Gold_3.TEST3_2;

interface Audio {

	void play();
	void stop();
}


abstract class Player implements Audio{
	public abstract void review();
	public void play() {}
	public void forward() {}
}

class CD extends Player {

	public void stop() {}
	public void review() {}


}