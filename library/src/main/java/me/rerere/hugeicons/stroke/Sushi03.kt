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

val HugeIcons.Sushi03: ImageVector
    get() {
        if (_sushi03 != null) {
            return _sushi03!!
        }
        _sushi03 = ImageVector.Builder(
            name = "Sushi03",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 9.5f)
            curveTo(5f, 10.8807f, 7.01472f, 12f, 9.5f, 12f)
            curveTo(11.9853f, 12f, 14f, 10.8807f, 14f, 9.5f)
            curveTo(14f, 8.11929f, 11.9853f, 7f, 9.5f, 7f)
            curveTo(7.01472f, 7f, 5f, 8.11929f, 5f, 9.5f)
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
            moveTo(14f, 16.6471f)
            curveTo(14f, 17.9466f, 11.9853f, 19f, 9.5f, 19f)
            curveTo(7.01472f, 19f, 5f, 17.9466f, 5f, 16.6471f)
            verticalLineTo(9.5f)
            moveTo(14f, 9.5f)
            verticalLineTo(13.5f)
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
            moveTo(2f, 18f)
            lineTo(22f, 11f)
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
            moveTo(2f, 14f)
            lineTo(5f, 12.65f)
            moveTo(22f, 5f)
            lineTo(14f, 8.6f)
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
            moveTo(9.625f, 9.5f)
            horizontalLineTo(9.5f)
            moveTo(9.75f, 9.5f)
            curveTo(9.75f, 9.63807f, 9.63807f, 9.75f, 9.5f, 9.75f)
            curveTo(9.36193f, 9.75f, 9.25f, 9.63807f, 9.25f, 9.5f)
            curveTo(9.25f, 9.36193f, 9.36193f, 9.25f, 9.5f, 9.25f)
            curveTo(9.63807f, 9.25f, 9.75f, 9.36193f, 9.75f, 9.5f)
            close()
        }
        }.build()

        return _sushi03!!
    }

private var _sushi03: ImageVector? = null
