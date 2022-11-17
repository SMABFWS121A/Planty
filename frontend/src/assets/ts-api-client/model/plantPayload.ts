/**
 * Planty API
 * API for communication between frontend, microcontroller and backend.
 *
 * The version of the OpenAPI document: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface PlantPayload { 
    /**
     * A name of an entity
     */
    name?: string;
    /**
     * A description of an entity
     */
    description?: string;
    /**
     * The ID schema used for most database entities.
     */
    plantTypeId?: number;
    /**
     * The ID schema used for most database entities.
     */
    sensorId?: number;
    /**
     * The ID schema used for most database entities.
     */
    roomId?: number;
}

