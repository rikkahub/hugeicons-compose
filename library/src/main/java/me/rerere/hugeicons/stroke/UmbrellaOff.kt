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

val HugeIcons.UmbrellaOff: ImageVector
    get() {
        if (_umbrellaOff != null) {
            return _umbrellaOff!!
        }
        _umbrellaOff = ImageVector.Builder(
            name = "UmbrellaOff",
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
            moveTo(12f, 3.5f)
            verticalLineTo(2f)
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
            moveTo(12f, 3.5f)
            curveTo(12.9392f, 3.5f, 16.4721f, 7.29322f, 17.0282f, 12.2037f)
            curveTo(18.1073f, 12.4691f, 20.6123f, 12.7f, 22f, 11.5f)
            curveTo(21.0545f, 6.93552f, 16.9367f, 3.5f, 12f, 3.5f)
            close()
            moveTo(12f, 3.5f)
            curveTo(10.9388f, 3.5f, 9.91547f, 3.65875f, 8.95333f, 3.95333f)
            moveTo(12f, 3.5f)
            curveTo(11.6353f, 3.5f, 10.8796f, 4.07187f, 10.059f, 5.05896f)
            moveTo(6.97182f, 12.2037f)
            curveTo(8.4559f, 13.0288f, 10.1718f, 13.5f, 12f, 13.5f)
            curveTo(12.477f, 13.5f, 12.9463f, 13.4679f, 13.4059f, 13.4059f)
            moveTo(6.97182f, 12.2037f)
            curveTo(5.89285f, 12.4691f, 3.38792f, 12.7f, 2f, 11.5f)
            curveTo(2.4868f, 9.14983f, 3.81462f, 7.09895f, 5.6622f, 5.6622f)
            moveTo(6.97182f, 12.2037f)
            curveTo(7.13968f, 10.7214f, 7.57878f, 9.34095f, 8.1359f, 8.1359f)
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
            moveTo(12f, 13.5f)
            verticalLineTo(20.5f)
            curveTo(12f, 21.3284f, 11.3284f, 22f, 10.5f, 22f)
            curveTo(9.67157f, 22f, 9f, 21.3284f, 9f, 20.5f)
            verticalLineTo(20f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _umbrellaOff!!
    }

private var _umbrellaOff: ImageVector? = null
