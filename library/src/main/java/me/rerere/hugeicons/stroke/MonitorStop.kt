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

val HugeIcons.MonitorStop: ImageVector
    get() {
        if (_monitorStop != null) {
            return _monitorStop!!
        }
        _monitorStop = ImageVector.Builder(
            name = "MonitorStop",
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
            moveTo(16f, 3f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
            curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
            verticalLineTo(11f)
            curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
            curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 17f, 20.2426f, 17f, 21.1213f, 16.1213f)
            curveTo(22f, 15.2426f, 22f, 13.8284f, 22f, 11f)
            verticalLineTo(9f)
            curveTo(22f, 6.17157f, 22f, 4.75736f, 21.1213f, 3.87868f)
            curveTo(20.2426f, 3f, 18.8284f, 3f, 16f, 3f)
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
            moveTo(14f, 21f)
            horizontalLineTo(16f)
            moveTo(14f, 21f)
            curveTo(13.1716f, 21f, 12.5f, 20.3284f, 12.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(14f, 21f)
            horizontalLineTo(10f)
            moveTo(10f, 21f)
            horizontalLineTo(8f)
            moveTo(10f, 21f)
            curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(12f, 17f)
            verticalLineTo(21f)
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
            moveTo(14.8478f, 11.7654f)
            curveTo(15f, 11.3978f, 15f, 10.9319f, 15f, 10f)
            curveTo(15f, 9.06812f, 15f, 8.60218f, 14.8478f, 8.23463f)
            curveTo(14.6448f, 7.74458f, 14.2554f, 7.35523f, 13.7654f, 7.15224f)
            curveTo(13.3978f, 7f, 12.9319f, 7f, 12f, 7f)
            curveTo(11.0681f, 7f, 10.6022f, 7f, 10.2346f, 7.15224f)
            curveTo(9.74458f, 7.35523f, 9.35523f, 7.74458f, 9.15224f, 8.23463f)
            curveTo(9f, 8.60218f, 9f, 9.06812f, 9f, 10f)
            curveTo(9f, 10.9319f, 9f, 11.3978f, 9.15224f, 11.7654f)
            curveTo(9.35523f, 12.2554f, 9.74458f, 12.6448f, 10.2346f, 12.8478f)
            curveTo(10.6022f, 13f, 11.0681f, 13f, 12f, 13f)
            curveTo(12.9319f, 13f, 13.3978f, 13f, 13.7654f, 12.8478f)
            curveTo(14.2554f, 12.6448f, 14.6448f, 12.2554f, 14.8478f, 11.7654f)
            close()
        }
        }.build()

        return _monitorStop!!
    }

private var _monitorStop: ImageVector? = null
