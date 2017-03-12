package com.jeffpeng.jmod.gardenstuff;

import com.jeffpeng.jmod.JMODRepresentation;
import com.jeffpeng.jmod.gardenstuff.actions.AddCompost;
import com.jeffpeng.jmod.primitives.ModScriptObject;

public class Scripting  extends ModScriptObject {

	public Scripting(JMODRepresentation owner) {
		super(owner);
	}
	
	public void addCompostableItem(String itemName, int decomposeTime){
		if(owner.testForMod("GardenCore")) new AddCompost(owner, itemName, decomposeTime);
	}
}
