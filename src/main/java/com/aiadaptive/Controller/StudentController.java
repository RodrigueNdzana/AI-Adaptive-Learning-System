package com.aiadaptive.controller;

import com.aiadaptive.domain.Student;
import com.aiadaptive.services.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/students")
    @Tag(name = "Students", description = "Endpoints for managing students in the AI Adaptive Learning System")
    public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
                this.service = service;
    }

    @Operation(
                summary = "Get all students",
                description = "Retrieves a list of all registered students in the system"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Successfully retrieved list of students",
                                        content = @Content(mediaType = "application/json",
                                                                           schema = @Schema(implementation = Student.class))
                                    )
            })
            @GetMapping
            public List<Student> getAll() {
                        return service.getAllStudents();
            }

    @Operation(
                summary = "Create a new student",
                description = "Registers a new student in the AI Adaptive Learning System"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Student successfully created",
                                        content = @Content(mediaType = "application/json",
                                                                           schema = @Schema(implementation = Student.class))
                                    ),
                        @ApiResponse(
                                        responseCode = "400",
                                        description = "Invalid student data provided",
                                        content = @Content
                                    )
            })
            @PostMapping
            public Student create(
                        @Parameter(description = "Student object to be created", required = true)
                        @RequestBody Student student) {
                        return service.createStudent(student);
            }
    }
