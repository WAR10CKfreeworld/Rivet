// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// Rivet Copyright (C) 2011 Ian Wraith
// This program comes with ABSOLUTELY NO WARRANTY

package org.e2k;

public class CarrierInfo {
	
	private int binFFT=0;
	private double frequencyHZ=0.0;
	private double energy=0.0;
	
	public int getBinFFT() {
		return binFFT;
	}
	public void setBinFFT(int binFFT) {
		this.binFFT = binFFT;
	}
	
	public double getFrequencyHZ() {
		return frequencyHZ;
	}
	
	public void setFrequencyHZ(double frequencyHZ) {
		this.frequencyHZ = frequencyHZ;
	}
	
	public double getEnergy() {
		return energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}

}
