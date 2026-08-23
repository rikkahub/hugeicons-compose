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

val HugeIcons.WifiCog: ImageVector
    get() {
        if (_wifiCog != null) {
            return _wifiCog!!
        }
        _wifiCog = ImageVector.Builder(
            name = "WifiCog",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 6.81966f)
            curveTo(4.75011f, 4.35989f, 8.31034f, 3f, 12f, 3f)
            curveTo(15.6897f, 3f, 19.2499f, 4.35989f, 22f, 6.81966f)
            moveTo(12.1256f, 17.75f)
            horizontalLineTo(12.0006f)
            moveTo(12.2506f, 17.75f)
            curveTo(12.2506f, 17.8881f, 12.1387f, 18f, 12.0006f, 18f)
            curveTo(11.8625f, 18f, 11.7506f, 17.8881f, 11.7506f, 17.75f)
            curveTo(11.7506f, 17.6119f, 11.8625f, 17.5f, 12.0006f, 17.5f)
            curveTo(12.1387f, 17.5f, 12.2506f, 17.6119f, 12.2506f, 17.75f)
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
            moveTo(17f, 9.33984f)
            curveTo(15.4923f, 8.4694f, 13.77f, 8.00012f, 12f, 8.00012f)
            curveTo(9.38247f, 8.00012f, 6.86929f, 9.02642f, 5f, 10.8587f)
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
            moveTo(13f, 12.101f)
            curveTo(12.6733f, 12.0343f, 12.3384f, 12f, 12f, 12f)
            curveTo(10.6912f, 12f, 9.43464f, 12.5132f, 8.5f, 13.4293f)
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
            moveTo(20.6709f, 15.7593f)
            curveTo(20.8803f, 16.1249f, 21f, 16.5485f, 21f, 17f)
            curveTo(21f, 17.4514f, 20.8804f, 17.8749f, 20.671f, 18.2404f)
            curveTo(20.2402f, 18.993f, 19.4293f, 19.5f, 18.5f, 19.5f)
            moveTo(16.3291f, 15.7593f)
            curveTo(16.1197f, 16.1249f, 16f, 16.5485f, 16f, 17f)
            curveTo(16f, 17.4514f, 16.1196f, 17.8749f, 16.329f, 18.2404f)
            curveTo(16.7598f, 18.993f, 17.5707f, 19.5f, 18.5f, 19.5f)
            moveTo(18.5f, 19.5f)
            lineTo(18.5f, 21f)
            moveTo(18.5f, 14.5f)
            curveTo(19.4292f, 14.5f, 20.24f, 15.0069f, 20.6709f, 15.7593f)
            moveTo(18.5f, 14.5f)
            curveTo(17.5708f, 14.5f, 16.76f, 15.0069f, 16.3291f, 15.7593f)
            moveTo(18.5f, 14.5f)
            lineTo(18.5f, 13f)
            moveTo(22f, 14.9998f)
            lineTo(20.6709f, 15.7593f)
            moveTo(15f, 18.9998f)
            lineTo(16.329f, 18.2404f)
            moveTo(22f, 18.9998f)
            lineTo(20.671f, 18.2404f)
            moveTo(15f, 14.9998f)
            lineTo(16.3291f, 15.7593f)
        }
        }.build()

        return _wifiCog!!
    }

private var _wifiCog: ImageVector? = null
