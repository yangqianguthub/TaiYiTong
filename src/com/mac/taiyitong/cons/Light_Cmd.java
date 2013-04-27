package com.mac.taiyitong.cons;

public enum Light_Cmd {
	light_open((byte) 0x2d), light_close((byte) 0x3c);

	private byte val;

	public byte getVal() {
		return val;
	}

	private Light_Cmd(byte val) {
		this.val = val;
	}
}
