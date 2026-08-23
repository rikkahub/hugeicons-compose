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

val HugeIcons.RunningShoes: ImageVector
    get() {
        if (_runningShoes != null) {
            return _runningShoes!!
        }
        _runningShoes = ImageVector.Builder(
            name = "RunningShoes",
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
            moveTo(12.4059f, 18.9923f)
            curveTo(13.4443f, 19.7399f, 13.9635f, 20.1137f, 14.5623f, 20.3069f)
            curveTo(15.1611f, 20.5f, 15.8008f, 20.5f, 17.0804f, 20.5f)
            horizontalLineTo(19f)
            curveTo(20.4142f, 20.5f, 21.1213f, 20.5f, 21.5607f, 20.0607f)
            curveTo(22f, 19.6213f, 22f, 18.9142f, 22f, 17.5f)
            horizontalLineTo(16.7902f)
            curveTo(16.1504f, 17.5f, 15.8305f, 17.5f, 15.5311f, 17.4034f)
            curveTo(15.2318f, 17.3069f, 14.9722f, 17.12f, 14.453f, 16.7461f)
            lineTo(3f, 8.5f)
            lineTo(2.30911f, 9.53634f)
            curveTo(2.10755f, 9.83867f, 2f, 10.1939f, 2f, 10.5572f)
            curveTo(2f, 11.1492f, 2.2847f, 11.705f, 2.76507f, 12.0509f)
            lineTo(12.4059f, 18.9923f)
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
            moveTo(3f, 8.5f)
            lineTo(6f, 3.5f)
            lineTo(6.30704f, 5.34226f)
            curveTo(6.42827f, 6.06965f, 6.89023f, 6.69511f, 7.5498f, 7.0249f)
            curveTo(8.64393f, 7.57197f, 9.97486f, 7.16899f, 10.5818f, 6.10689f)
            lineTo(11.1396f, 5.13069f)
            curveTo(11.3625f, 4.74069f, 11.7772f, 4.5f, 12.2264f, 4.5f)
            curveTo(12.7005f, 4.5f, 13.1339f, 4.76787f, 13.346f, 5.19193f)
            lineTo(17.2764f, 13.0528f)
            curveTo(17.4134f, 13.3269f, 17.6936f, 13.5f, 18f, 13.5f)
            curveTo(20.2091f, 13.5f, 22f, 15.2909f, 22f, 17.5f)
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
            moveTo(12.5f, 9.5f)
            lineTo(14.5f, 8.5f)
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
            moveTo(14f, 12f)
            lineTo(16f, 11f)
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
            moveTo(6f, 20.5f)
            horizontalLineTo(18f)
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
            moveTo(2f, 17.5f)
            horizontalLineTo(5f)
        }
        }.build()

        return _runningShoes!!
    }

private var _runningShoes: ImageVector? = null
