package javabasic.thread;

public class NumberPrintThread extends Thread {
	
	// 쓰레드의 작업을 기술
	@Override
	public void run() {
		
		for (int i=1; i<6; i++) {
			
			System.out.println(i);
			
			// 현재 = 작동하고 있는
			System.out.println("현재 쓰레드 그룹에서 활동중인 쓰레드 수 : " + Thread.activeCount());
			System.out.println("현재 실행중인 쓰레드 : " + Thread.currentThread());
			System.out.println("현재 쓰레드 아이디 : " + this.getId());
			System.out.println("현재 쓰레드명 : " + this.getName());
			System.out.println("현재 쓰레드 우선순위 : " + this.getPriority());
			System.out.println("현재 쓰레드 상태 : " + this.getState());
			System.out.println("현재 쓰레드 그룹명 : " + this.getThreadGroup().getName());
			System.out.println("현재 쓰레드가 활동중인지 : " + this.isAlive());
			System.out.println("현재 쓰레드가 데몬쓰레드인지 : " + this.isDaemon());
			System.out.println("현재 쓰레드 인터럽트 여부 : " + this.isInterrupted());
			
			try {
				// 1000밀리세컨드(1초)동안 현재 쓰레드를 대기(waiting)상태로
				Thread.sleep(1000);
				// 대기상태로 있기로 했는데 다른 쓰레드가 방해
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
		
	} // run

} // class



























