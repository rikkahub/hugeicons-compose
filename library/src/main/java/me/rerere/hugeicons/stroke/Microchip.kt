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

val HugeIcons.Microchip: ImageVector
    get() {
        if (_microchip != null) {
            return _microchip!!
        }
        _microchip = ImageVector.Builder(
            name = "Microchip",
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
            moveTo(6f, 15f)
            verticalLineTo(9f)
            curveTo(6f, 6.17157f, 6f, 4.75736f, 6.87868f, 3.87868f)
            curveTo(7.75736f, 3f, 9.17157f, 3f, 12f, 3f)
            curveTo(14.8284f, 3f, 16.2426f, 3f, 17.1213f, 3.87868f)
            curveTo(18f, 4.75736f, 18f, 6.17157f, 18f, 9f)
            verticalLineTo(15f)
            curveTo(18f, 17.8284f, 18f, 19.2426f, 17.1213f, 20.1213f)
            curveTo(16.2426f, 21f, 14.8284f, 21f, 12f, 21f)
            curveTo(9.17157f, 21f, 7.75736f, 21f, 6.87868f, 20.1213f)
            curveTo(6f, 19.2426f, 6f, 17.8284f, 6f, 15f)
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
            moveTo(18f, 12f)
            horizontalLineTo(20f)
            moveTo(18f, 6f)
            horizontalLineTo(20f)
            moveTo(18f, 18f)
            horizontalLineTo(20f)
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
            moveTo(4f, 12f)
            horizontalLineTo(6f)
            moveTo(4f, 6f)
            horizontalLineTo(6f)
            moveTo(4f, 18f)
            horizontalLineTo(6f)
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
            moveTo(10f, 12f)
            horizontalLineTo(14f)
            moveTo(10f, 7f)
            horizontalLineTo(14f)
            moveTo(10f, 17f)
            horizontalLineTo(14f)
        }
        }.build()

        return _microchip!!
    }

private var _microchip: ImageVector? = null
