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

val HugeIcons.Home13: ImageVector
    get() {
        if (_home13 != null) {
            return _home13!!
        }
        _home13 = ImageVector.Builder(
            name = "Home13",
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
            moveTo(16.5f, 12.9996f)
            horizontalLineTo(15f)
            verticalLineTo(14.4996f)
            horizontalLineTo(16.5f)
            verticalLineTo(12.9996f)
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
            moveTo(4f, 8.99957f)
            verticalLineTo(14.5004f)
            curveTo(4f, 17.8002f, 4f, 19.4501f, 5.02513f, 20.4753f)
            curveTo(6.05025f, 21.5004f, 7.70017f, 21.5004f, 11f, 21.5004f)
            horizontalLineTo(13f)
            curveTo(16.2998f, 21.5004f, 17.9497f, 21.5004f, 18.9749f, 20.4753f)
            curveTo(20f, 19.4501f, 20f, 17.8002f, 20f, 14.5004f)
            verticalLineTo(8.99957f)
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
            moveTo(21.5f, 9.99957f)
            lineTo(15.865f, 4.97135f)
            curveTo(14.0183f, 3.3235f, 13.095f, 2.49957f, 12f, 2.49957f)
            curveTo(10.905f, 2.49957f, 9.98167f, 3.3235f, 8.13497f, 4.97135f)
            lineTo(2.5f, 9.99957f)
        }
        }.build()

        return _home13!!
    }

private var _home13: ImageVector? = null
