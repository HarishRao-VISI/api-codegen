# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.discount_request import DiscountRequest  # noqa: F401
from openapi_server.models.dynamic_pricing_response import DynamicPricingResponse  # noqa: F401


def test_dynamic_pricing_post(client: TestClient):
    """Test case for dynamic_pricing_post

    Gets the price details
    """
    discount_request = {"discount":{"selling_price":0.8008281904610115,"product":"Product","margin":6.027456183070403}}

    headers = {
        "ApiKeyAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/dynamicPricing",
    #    headers=headers,
    #    json=discount_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

