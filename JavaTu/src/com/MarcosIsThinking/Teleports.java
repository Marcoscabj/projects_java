package com.MarcosIsThinking;

public interface Teleports {
	String teleport();
}

class CanTeleport implements Teleports{
	public String teleport() {
		return "teleports away";
	}
}
class CantTeleport implements Teleports{
	public String teleport() {
		return "fails at teleporting";
	}
}
// usamos esto en la clase warrior