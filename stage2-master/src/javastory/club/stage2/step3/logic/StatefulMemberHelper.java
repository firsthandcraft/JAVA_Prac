package javastory.club.stage2.step3.logic;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javastory.club.stage2.step1.entity.ClubMember;
import javastory.club.stage2.step1.entity.TravelClub;

public class StatefulMemberHelper {
		//
		private TravelClub club;

		public void setClub(TravelClub club) {
			this.club = club;
		}

		public TravelClub getClub() {
			return club;
		}

		public List<ClubMember> getMembers() {
			return club.getMembers();
		}

		public boolean hasMembers() {
			//
			return club.getMembers().size() != 0;
		}

		public void modify(ClubMember member, Map<String,String> newValueMap) {
			//
			Iterator<String> nameIter = newValueMap.keySet().iterator();
			while(nameIter.hasNext()) {
				String name = nameIter.next();
				String value = newValueMap.get(name);

				switch (name) {
					case "name":
						member.setName(value);
						break;
					case "nickname":
						member.setNickname(value);
						break;
					case "phoneNumber":
						member.setPhoneNumber(value);
						break;
					case "birthDay":
						member.setBirthDay(value);
						break;
				}
			}
		}

		public boolean exist(String email) {
			//
			for (ClubMember member : club.getMembers()) {
				if (member.getEmail().equals(email)) {
					return true;
				}
			}

			return false;
		}

		public String register (ClubMember newMember) {
			//
			if (exist(newMember.getEmail())) {
				return null;
			}

	        club.getMembers().add(newMember);

			return newMember.getEmail();
		}

		public ClubMember find(String email) {
			//
			for (ClubMember member : club.getMembers()) {
				if (member.getEmail().equals(email)) {
					return member;
				}
			}
			return null;
		}

		public void remove(ClubMember clubMember) {
			//
			this.club.getMembers().remove(clubMember);
		}
}
