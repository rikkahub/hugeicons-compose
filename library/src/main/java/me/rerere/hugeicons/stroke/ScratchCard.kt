package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScratchCard: ImageVector
    get() {
        if (_scratchCard != null) {
            return _scratchCard!!
        }
        _scratchCard = ImageVector.Builder(
            name = "ScratchCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
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
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 8f)
        horizontalLineTo(11.5f)
        lineTo(12.5f, 9.5f)
        horizontalLineTo(21.5f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11.5f)
        curveTo(10f, 12.8807f, 8.88072f, 14f, 7.5f, 14f)
        curveTo(6.11928f, 14f, 5f, 12.8807f, 5f, 11.5f)
        curveTo(5f, 10.1193f, 6.11928f, 9f, 7.5f, 9f)
        curveTo(8.88072f, 9f, 10f, 10.1193f, 10f, 11.5f)
        }
        }.build()

        return _scratchCard!!
    }

private var _scratchCard: ImageVector? = null
