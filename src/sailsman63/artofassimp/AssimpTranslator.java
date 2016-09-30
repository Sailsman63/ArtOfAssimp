/* Copyright (C) 2016 by Lucas Stanek
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package sailsman63.artofassimp;

import artofillusion.*;
import buoy.widget.*;

public class AssimpTranslator implements Translator
{
  @Override
  public String getName()
  {
    return "Assimp supported files (Multiple types)";
  }

  @Override
  public boolean canImport()
  {
    return true;
  }

  @Override
  public boolean canExport()
  {
    return false;
  }

  @Override
  public void importFile(BFrame parent)
  {
    throw new UnsupportedOperationException("Doesn't actually do anything yet");
  }

  @Override
  public void exportFile(BFrame parent, Scene theScene)
  {
    throw new UnsupportedOperationException("Can't export. This should never be called");
  }
}
