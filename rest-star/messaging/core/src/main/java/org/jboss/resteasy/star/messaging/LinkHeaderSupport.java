package org.hornetq.rest;

import org.jboss.resteasy.spi.Link;

import javax.ws.rs.core.Response;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class LinkHeaderSupport
{
   /**
    * @param builder
    * @param title   user friendly name
    * @param rel     could be a link
    * @param href
    * @param type
    */
   public static void setLinkHeader(Response.ResponseBuilder builder, String title, String rel, String href, String type)
   {
      Link link = new Link(title, rel, href, type, null);
      setLinkHeader(builder, link);
   }

   public static void setLinkHeader(Response.ResponseBuilder builder, Link link)
   {
      builder.header("Link", link);
   }

   /* proprietary, keep this around just in case

   public static void setLinkHeader(Response.ResponseBuilder builder, String rel, String href, String type)
   {
      String link = "Link-Href-" + rel;
      builder.header(link, href);
      if (type != null)
      {
         String typeHeader = "Link-Type-" + rel;
         builder.header(typeHeader, type);
      }
   }
    */
}