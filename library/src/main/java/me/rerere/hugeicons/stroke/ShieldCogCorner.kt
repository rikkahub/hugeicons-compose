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

val HugeIcons.ShieldCogCorner: ImageVector
    get() {
        if (_shieldCogCorner != null) {
            return _shieldCogCorner!!
        }
        _shieldCogCorner = ImageVector.Builder(
            name = "ShieldCogCorner",
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
            moveTo(20.9561f, 12f)
            curveTo(20.9799f, 11.7332f, 20.9922f, 11.461f, 20.9922f, 11.1833f)
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
            moveTo(17.9922f, 20.5f)
            lineTo(17.9922f, 22f)
            moveTo(17.9922f, 20.5f)
            curveTo(18.7292f, 20.5f, 19.3731f, 20.1013f, 19.72f, 19.5079f)
            moveTo(17.9922f, 20.5f)
            curveTo(17.2552f, 20.5f, 16.6113f, 20.1013f, 16.2643f, 19.5079f)
            moveTo(17.9922f, 16.5f)
            lineTo(17.9922f, 15f)
            moveTo(17.9922f, 16.5f)
            curveTo(18.7292f, 16.5f, 19.3731f, 16.8987f, 19.72f, 17.4921f)
            moveTo(16.2643f, 19.5079f)
            curveTo(16.0913f, 19.212f, 15.9922f, 18.8676f, 15.9922f, 18.5f)
            curveTo(15.9922f, 18.1324f, 16.0913f, 17.788f, 16.2644f, 17.4921f)
            curveTo(16.6113f, 16.8987f, 17.2552f, 16.5f, 17.9922f, 16.5f)
            moveTo(20.9922f, 16.75f)
            lineTo(19.72f, 17.4921f)
            moveTo(14.9922f, 20.25f)
            lineTo(16.2643f, 19.5079f)
            moveTo(20.9922f, 20.25f)
            lineTo(19.72f, 19.5079f)
            moveTo(14.9922f, 16.75f)
            lineTo(16.2644f, 17.4921f)
            moveTo(19.72f, 19.5079f)
            curveTo(19.893f, 19.2119f, 19.9922f, 18.8676f, 19.9922f, 18.5f)
            curveTo(19.9922f, 18.1324f, 19.893f, 17.788f, 19.72f, 17.4921f)
        }
        }.build()

        return _shieldCogCorner!!
    }

private var _shieldCogCorner: ImageVector? = null
