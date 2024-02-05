package com.rag.syzygy.design_patterns.mediator;

import java.util.LinkedList;
import java.util.List;

public class ActorStorage {

	private static List<Actor> actorList = new LinkedList<>();

	public static List<Actor> getActorList() {
		return actorList;
	}

	public static void setActor(Actor actor) {
		actorList.add(actor);
	}

	public static void setActorList(List<Actor> list) {
		actorList = list;
	}

	public static Actor getChatCustomer(String name) {
		Actor retrievedActor = null;
		boolean isActorFound = false;
		for (Actor actor : actorList) {
			if (actor instanceof ChatCustomer) {
				ChatCustomer customer = (ChatCustomer) actor;

				if (customer.getName().equals(name)) {
					retrievedActor = actor;
					isActorFound = true;
					break;
				}
			}
		}

		return retrievedActor;
	}

}
