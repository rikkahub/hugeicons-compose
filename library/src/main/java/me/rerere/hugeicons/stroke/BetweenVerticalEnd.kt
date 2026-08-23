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

val HugeIcons.BetweenVerticalEnd: ImageVector
    get() {
        if (_betweenVerticalEnd != null) {
            return _betweenVerticalEnd!!
        }
        _betweenVerticalEnd = ImageVector.Builder(
            name = "BetweenVerticalEnd",
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
            moveTo(3f, 5.99998f)
            curveTo(3f, 5.99998f, 5.20947f, 3.00001f, 6.00002f, 3f)
            curveTo(6.79058f, 2.99999f, 9f, 6f, 9f, 6f)
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
            moveTo(18f, 15f)
            curveTo(18f, 15f, 21f, 17.2095f, 21f, 18f)
            curveTo(21f, 18.7906f, 18f, 21f, 18f, 21f)
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
            moveTo(20f, 18f)
            horizontalLineTo(14f)
            curveTo(10.2288f, 18f, 8.34315f, 18f, 7.17157f, 16.8284f)
            curveTo(6f, 15.6569f, 6f, 13.7712f, 6f, 10f)
            verticalLineTo(4f)
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
            moveTo(7.5f, 16.5f)
            lineTo(12.5f, 11.5f)
        }
        }.build()

        return _betweenVerticalEnd!!
    }

private var _betweenVerticalEnd: ImageVector? = null
