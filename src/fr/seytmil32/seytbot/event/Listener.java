package fr.seytmil32.seytbot.event;

import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.hooks.EventListener;

public class Listener implements EventListener {

	@Override
	public void onEvent(Event event) {
		System.out.println(event.getClass().getSimpleName());

	}

}
