package com.dj.pattern.mediator;

public class TestClient {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA();
		ConcreteColleagueB colleagueB = new ConcreteColleagueB();
		mediator.register(colleagueA);
		mediator.register(colleagueB);
		colleagueA.send();
		colleagueB.send();

	}
}
