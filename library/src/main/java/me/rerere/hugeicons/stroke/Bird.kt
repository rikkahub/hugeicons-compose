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

val HugeIcons.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = ImageVector.Builder(
            name = "Bird",
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
            moveTo(17f, 3f)
            curveTo(18.6568f, 3f, 20f, 4.34314f, 20f, 6f)
            verticalLineTo(10f)
            curveTo(20f, 14.4183f, 16.4183f, 18f, 12f, 18f)
            horizontalLineTo(3.05869f)
            curveTo(2.47399f, 18f, 2f, 17.526f, 2f, 16.9413f)
            curveTo(2f, 16.6589f, 2.11285f, 16.3882f, 2.31345f, 16.1894f)
            lineTo(14.4966f, 4.11494f)
            curveTo(15.1353f, 3.40525f, 16.0452f, 3f, 17f, 3f)
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
            moveTo(12f, 18f)
            lineTo(14f, 21f)
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
            moveTo(11f, 21f)
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
            moveTo(22f, 8f)
            lineTo(20f, 6f)
            verticalLineTo(8f)
            horizontalLineTo(22f)
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
            moveTo(13f, 6f)
            verticalLineTo(8f)
            curveTo(13f, 13.5228f, 8.52285f, 18f, 3f, 18f)
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
            moveTo(16.875f, 6.5f)
            horizontalLineTo(16.75f)
            moveTo(17f, 6.5f)
            curveTo(17f, 6.63807f, 16.8881f, 6.75f, 16.75f, 6.75f)
            curveTo(16.6119f, 6.75f, 16.5f, 6.63807f, 16.5f, 6.5f)
            curveTo(16.5f, 6.36193f, 16.6119f, 6.25f, 16.75f, 6.25f)
            curveTo(16.8881f, 6.25f, 17f, 6.36193f, 17f, 6.5f)
            close()
        }
        }.build()

        return _bird!!
    }

private var _bird: ImageVector? = null
