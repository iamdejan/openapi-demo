package id.my.openapi.controllers;

import id.my.openapi.requests.CreateUserRequest;
import id.my.openapi.responses.CreateUserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Operation(summary = "Register a user in system.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Success in registration process."),
        @ApiResponse(responseCode = "400", description = "Name is not provided.", content = @Content),
        @ApiResponse(responseCode = "500", description = "We have oopsies.", content = @Content),
    })
    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<CreateUserResponse> create(@RequestBody CreateUserRequest request) {
        var response = new CreateUserResponse(UUID.randomUUID().toString(), true);
        return ResponseEntity.ok(response);
    }
}
