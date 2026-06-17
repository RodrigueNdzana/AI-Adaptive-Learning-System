package com.aiadaptive.Controller;

import com.aiadaptive.domain.Content;
import com.aiadaptive.services.ContentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/content")
    @Tag(name = "Content", description = "Endpoints for managing learning content in the AI Adaptive Learning System")
    public class ContentController {

    private final ContentService service;

    public ContentController(ContentService service) {
                this.service = service;
    }

    @Operation(
                summary = "Get all content",
                description = "Retrieves a list of all available learning content items"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Successfully retrieved list of content",
                                        content = @io.swagger.v3.oas.annotations.media.Content(
                                                            mediaType = "application/json",
                                                            array = @ArraySchema(schema = @Schema(implementation = Content.class)))
                                    )
            })
            @GetMapping
            public List<Content> getAll() {
                        return service.getAllContent();
            }

    @Operation(
                summary = "Create new content",
                description = "Adds a new learning content item to the system"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Content successfully created",
                                        content = @io.swagger.v3.oas.annotations.media.Content(
                                                            mediaType = "application/json",
                                                            schema = @Schema(implementation = Content.class))
                                    ),
                        @ApiResponse(
                                        responseCode = "400",
                                        description = "Invalid content data provided",
                                        content = @io.swagger.v3.oas.annotations.media.Content
                                    )
            })
            @PostMapping
            public Content create(
                        @Parameter(description = "Content object to be created", required = true)
                        @RequestBody Content content) {
                        return service.createContent(content);
            }

    @Operation(
                summary = "Update existing content",
                description = "Updates an existing learning content item identified by its ID"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Content successfully updated",
                                        content = @io.swagger.v3.oas.annotations.media.Content(
                                                            mediaType = "application/json",
                                                            schema = @Schema(implementation = Content.class))
                                    ),
                        @ApiResponse(
                                        responseCode = "404",
                                        description = "Content not found with the given ID",
                                        content = @io.swagger.v3.oas.annotations.media.Content
                                    )
            })
            @PutMapping("/{id}")
            public Content update(
                        @Parameter(description = "Unique identifier of the content to update", required = true)
                @PathVariable String id,
                @Parameter(description = "Updated content data", required = true)
                @RequestBody Content content) {
                            return service.updateContent(id, content);
                }

    @Operation(
                summary = "Delete content",
                description = "Removes a learning content item from the system by its ID"
            )
            @ApiResponses(value = {
                        @ApiResponse(
                                        responseCode = "200",
                                        description = "Content successfully deleted"
                                    ),
                        @ApiResponse(
                                        responseCode = "404",
                                        description = "Content not found with the given ID",
                                        content = @io.swagger.v3.oas.annotations.media.Content
                                    )
            })
            @DeleteMapping("/{id}")
            public void delete(
                @Parameter(description = "Unique identifier of the content to delete", required = true)
                @PathVariable String id) {
                service.deleteContent(id);
    }
    }
