package org.droidplanner.mission.waypoints;

import java.util.List;

import org.droidplanner.helpers.units.Altitude;
import org.droidplanner.mission.Mission;
import org.droidplanner.mission.MissionItemD;

import com.MAVLink.Messages.ardupilotmega.msg_mission_item;
import com.google.android.gms.maps.model.LatLng;

public abstract class LoiterD extends SpatialCoordItemD {

	private double orbitalRadius;
	private double yawAngle;
	private boolean orbitCCW;

	public LoiterD(Mission mission, LatLng coord, Altitude altitude) {
		super(mission, coord, altitude);
	}

	public LoiterD(MissionItemD item) {
		super(item);
	}

	public void setOrbitalRadius(double radius) {
		this.orbitalRadius = radius;
	}

	public double getOrbitalRadius() {
		return this.orbitalRadius;
	}

	public boolean isOrbitCCW() {
		return orbitCCW;
	}

	public void setOrbitCCW(boolean orbitCCW) {
		this.orbitCCW = orbitCCW;
	}

	public double getYawAngle() {
		return yawAngle;
	}

	public void setYawAngle(double yawAngle) {
		this.yawAngle = yawAngle;
	}

	@Override
	public List<msg_mission_item> packMissionItem() {
		List<msg_mission_item> list = super.packMissionItem();
		msg_mission_item mavMsg = list.get(0);
		mavMsg.param3 = (float) (isOrbitCCW()?getOrbitalRadius()*-1.0:getOrbitalRadius());
		mavMsg.param4 = (float) getYawAngle();
		return list;
	}

	@Override
	public void unpackMAVMessage(msg_mission_item mavMsg) {
		super.unpackMAVMessage(mavMsg);
		setOrbitCCW(mavMsg.param3<0);
		setOrbitalRadius(Math.abs(mavMsg.param3));
	}

}