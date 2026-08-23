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

val HugeIcons.ComputerTerminal02: ImageVector
    get() {
        if (_computerTerminal02 != null) {
            return _computerTerminal02!!
        }
        _computerTerminal02 = ImageVector.Builder(
            name = "ComputerTerminal02",
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
            moveTo(15f, 4f)
            horizontalLineTo(9f)
            curveTo(5.70017f, 4f, 4.05025f, 4f, 3.02513f, 5.02513f)
            curveTo(2f, 6.05025f, 2f, 7.70017f, 2f, 11f)
            verticalLineTo(13f)
            curveTo(2f, 16.2998f, 2f, 17.9497f, 3.02513f, 18.9749f)
            curveTo(4.05025f, 20f, 5.70017f, 20f, 9f, 20f)
            horizontalLineTo(15f)
            curveTo(18.2998f, 20f, 19.9497f, 20f, 20.9749f, 18.9749f)
            curveTo(22f, 17.9497f, 22f, 16.2998f, 22f, 13f)
            verticalLineTo(11f)
            curveTo(22f, 7.70017f, 22f, 6.05025f, 20.9749f, 5.02513f)
            curveTo(19.9497f, 4f, 18.2998f, 4f, 15f, 4f)
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
            moveTo(2.5f, 8f)
            horizontalLineTo(21.5f)
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
            moveTo(12f, 16f)
            horizontalLineTo(16f)
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
            moveTo(7f, 12f)
            lineTo(8.22654f, 13.0572f)
            curveTo(8.74218f, 13.5016f, 9f, 13.7239f, 9f, 14f)
            curveTo(9f, 14.2761f, 8.74218f, 14.4984f, 8.22654f, 14.9428f)
            lineTo(7f, 16f)
        }
        }.build()

        return _computerTerminal02!!
    }

private var _computerTerminal02: ImageVector? = null
