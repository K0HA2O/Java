//package ch7;
//
//class Tv {
//	boolean power; // 전원상태(on/off)
//	int cannel; // 채널
//	
//	void power() { power = !power; }
//	void channelUp() { ++cannel; }
//	void cannelDown() { --cannel; }
//}
//
//class VCR {
//	boolean power; // 전원상태(on/off)
//	int counter = 0;
//	
//	void power() { power = !power; }
//	void play () {}
//	void stop() {}
//	void rew() {}
//	void ff() {}
//}
//
//class TVCR extends Tv {
//
//	VCR vcr = new VCR();
//	
//	void pay() {
//		vcr.play();
//	}
//	
//	void stop() {
//		vcr.stop();
//	}
//	
//	void rew() {
//		vcr.rew();
//	}
//	
//	void ff() {
//		vcr.ff();
//	}
//}
