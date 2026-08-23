package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShieldCog: ImageVector
    get() {
        if (_shieldCog != null) {
            return _shieldCog!!
        }
        _shieldCog = ImageVector.Builder(
            name = "ShieldCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.9922f, 11.1833f)
            verticalLineTo(8.28029f)
            curveTo(20.9922f, 6.64029f, 20.9922f, 5.82028f, 20.5881f, 5.28529f)
            curveTo(20.184f, 4.75029f, 19.2703f, 4.49056f, 17.4429f, 3.9711f)
            curveTo(16.1944f, 3.6162f, 15.0938f, 3.18863f, 14.2145f, 2.79829f)
            curveTo(13.0156f, 2.2661f, 12.4161f, 2f, 11.9922f, 2f)
            curveTo(11.5682f, 2f, 10.9688f, 2.2661f, 9.7699f, 2.79829f)
            curveTo(8.89057f, 3.18863f, 7.79002f, 3.61619f, 6.54152f, 3.9711f)
            curveTo(4.71411f, 4.49056f, 3.80041f, 4.75029f, 3.3963f, 5.28529f)
            curveTo(2.99219f, 5.82028f, 2.99219f, 6.64029f, 2.99219f, 8.28029f)
            verticalLineTo(11.1833f)
            curveTo(2.99219f, 16.8085f, 8.05496f, 20.1835f, 10.5861f, 21.5194f)
            curveTo(11.1932f, 21.8398f, 11.4968f, 22f, 11.9922f, 22f)
            curveTo(12.4876f, 22f, 12.7911f, 21.8398f, 13.3982f, 21.5194f)
            curveTo(15.9294f, 20.1835f, 20.9922f, 16.8085f, 20.9922f, 11.1833f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.9922f, 13.5f)
            lineTo(11.9922f, 15f)
            moveTo(11.9922f, 13.5f)
            curveTo(12.7292f, 13.5f, 13.3731f, 13.1013f, 13.72f, 12.5079f)
            moveTo(11.9922f, 13.5f)
            curveTo(11.2552f, 13.5f, 10.6113f, 13.1013f, 10.2643f, 12.5079f)
            moveTo(11.9922f, 9.5f)
            lineTo(11.9922f, 8f)
            moveTo(11.9922f, 9.5f)
            curveTo(12.7292f, 9.5f, 13.3731f, 9.89866f, 13.72f, 10.4921f)
            moveTo(10.2643f, 12.5079f)
            curveTo(10.0913f, 12.212f, 9.99219f, 11.8676f, 9.99219f, 11.5f)
            curveTo(9.99219f, 11.1324f, 10.0913f, 10.788f, 10.2644f, 10.4921f)
            curveTo(10.6113f, 9.89865f, 11.2552f, 9.5f, 11.9922f, 9.5f)
            moveTo(14.9922f, 9.75f)
            lineTo(13.72f, 10.4921f)
            moveTo(8.99219f, 13.25f)
            lineTo(10.2643f, 12.5079f)
            moveTo(14.9922f, 13.25f)
            lineTo(13.72f, 12.5079f)
            moveTo(8.99219f, 9.75f)
            lineTo(10.2644f, 10.4921f)
            moveTo(13.72f, 12.5079f)
            curveTo(13.893f, 12.2119f, 13.9922f, 11.8676f, 13.9922f, 11.5f)
            curveTo(13.9922f, 11.1324f, 13.893f, 10.788f, 13.72f, 10.4921f)
        }
        }.build()

        return _shieldCog!!
    }

private var _shieldCog: ImageVector? = null
