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

val HugeIcons.CricketHelmet: ImageVector
    get() {
        if (_cricketHelmet != null) {
            return _cricketHelmet!!
        }
        _cricketHelmet = ImageVector.Builder(
            name = "CricketHelmet",
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
            moveTo(21f, 9.43911f)
            curveTo(19.6952f, 5.66379f, 16.0498f, 3f, 11.7568f, 3f)
            curveTo(6.36825f, 3f, 2f, 7.281f, 2f, 12.5619f)
            curveTo(2f, 15.503f, 3.35496f, 18.134f, 5.4865f, 19.888f)
            curveTo(6.83589f, 20.9984f, 8.24101f, 20.9851f, 9.93379f, 20.9851f)
            curveTo(11.1114f, 20.9851f, 12.7258f, 21.1962f, 13.4402f, 20.03f)
            curveTo(14.695f, 17.9818f, 12.2704f, 15.1302f, 13.8559f, 13.025f)
            curveTo(14.3237f, 12.4039f, 15.0997f, 12.0593f, 16.6516f, 11.3701f)
            lineTo(21f, 9.43911f)
            close()
            moveTo(21f, 9.43911f)
            lineTo(22f, 8.99503f)
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
            moveTo(22f, 15.9114f)
            lineTo(17.6345f, 16.4677f)
            curveTo(15.8154f, 16.6995f, 14.0804f, 15.6639f, 13.5f, 14f)
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
            moveTo(16f, 12f)
            lineTo(16.6046f, 17.4417f)
            curveTo(16.7927f, 19.1343f, 16.8867f, 19.9805f, 17.4562f, 20.4903f)
            curveTo(18.0258f, 21f, 18.8772f, 21f, 20.5802f, 21f)
            horizontalLineTo(22f)
        }

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
            moveTo(20.5f, 16f)
            lineTo(20.5f, 21f)
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
            moveTo(10.125f, 17f)
            horizontalLineTo(10f)
            moveTo(10.25f, 17f)
            curveTo(10.25f, 17.1381f, 10.1381f, 17.25f, 10f, 17.25f)
            curveTo(9.86193f, 17.25f, 9.75f, 17.1381f, 9.75f, 17f)
            curveTo(9.75f, 16.8619f, 9.86193f, 16.75f, 10f, 16.75f)
            curveTo(10.1381f, 16.75f, 10.25f, 16.8619f, 10.25f, 17f)
            close()
        }
        }.build()

        return _cricketHelmet!!
    }

private var _cricketHelmet: ImageVector? = null
