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

val HugeIcons.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = ImageVector.Builder(
            name = "SatelliteDish",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49229f, 13.5818f)
            curveTo(2.47031f, 17.9768f, 6.01534f, 21.5218f, 10.4103f, 21.4998f)
            curveTo(11.4998f, 21.4944f, 12.5393f, 21.2702f, 13.4869f, 20.8692f)
            curveTo(14.5667f, 20.4122f, 15.1067f, 20.1837f, 15.2594f, 19.4004f)
            curveTo(15.4121f, 18.6171f, 14.8913f, 18.0963f, 13.8499f, 17.0549f)
            lineTo(6.93724f, 10.1422f)
            curveTo(5.89578f, 9.10076f, 5.37506f, 8.58003f, 4.59172f, 8.73274f)
            curveTo(3.80838f, 8.88545f, 3.57988f, 9.42536f, 3.1229f, 10.5052f)
            curveTo(2.72188f, 11.4528f, 2.49774f, 12.4923f, 2.49229f, 13.5818f)
            close()
        }

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
            moveTo(13.4922f, 6f)
            curveTo(15.9775f, 6f, 17.9922f, 8.01472f, 17.9922f, 10.5f)
        }

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
            moveTo(13.4922f, 2.5f)
            curveTo(17.9105f, 2.5f, 21.4922f, 6.08172f, 21.4922f, 10.5f)
        }

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
            moveTo(13.4932f, 10.5f)
            lineTo(10.3945f, 13.5995f)
        }
        }.build()

        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
