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

val HugeIcons.Pocket: ImageVector
    get() {
        if (_pocket != null) {
            return _pocket!!
        }
        _pocket = ImageVector.Builder(
            name = "Pocket",
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
            moveTo(3f, 11f)
            verticalLineTo(10f)
            curveTo(3f, 7.17157f, 3f, 5.75736f, 3.87868f, 4.87868f)
            curveTo(4.75736f, 4f, 6.17157f, 4f, 9f, 4f)
            horizontalLineTo(15f)
            curveTo(17.8284f, 4f, 19.2426f, 4f, 20.1213f, 4.87868f)
            curveTo(21f, 5.75736f, 21f, 7.17157f, 21f, 10f)
            verticalLineTo(11f)
            curveTo(21f, 15.9706f, 16.9706f, 20f, 12f, 20f)
            curveTo(7.02944f, 20f, 3f, 15.9706f, 3f, 11f)
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
            moveTo(8.5f, 10f)
            lineTo(11.1464f, 12.6464f)
            curveTo(11.3728f, 12.8728f, 11.6799f, 13f, 12f, 13f)
            curveTo(12.3201f, 13f, 12.6272f, 12.8728f, 12.8536f, 12.6464f)
            lineTo(15.5f, 10f)
        }
        }.build()

        return _pocket!!
    }

private var _pocket: ImageVector? = null
