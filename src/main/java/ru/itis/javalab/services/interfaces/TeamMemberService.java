package ru.itis.javalab.services.interfaces;

import ru.itis.javalab.dto.TeamMemberDto;

import java.util.List;

public interface TeamMemberService {
    List<TeamMemberDto> getAllMembers();
    List<TeamMemberDto> getAllMembers(int page, int size);
    void addUser(TeamMemberDto memberDto);

    TeamMemberDto getMember(Integer memberId);
}
