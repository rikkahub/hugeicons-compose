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

val HugeIcons.CircleEllipsis: ImageVector
    get() {
        if (_circleEllipsis != null) {
            return _circleEllipsis!!
        }
        _circleEllipsis = ImageVector.Builder(
            name = "CircleEllipsis",
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
            moveTo(12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
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
            moveTo(12f, 11.875f)
            verticalLineTo(12f)
            moveTo(12.25f, 12f)
            curveTo(12.25f, 12.1381f, 12.1381f, 12.25f, 12f, 12.25f)
            curveTo(11.8619f, 12.25f, 11.75f, 12.1381f, 11.75f, 12f)
            curveTo(11.75f, 11.8619f, 11.8619f, 11.75f, 12f, 11.75f)
            curveTo(12.1381f, 11.75f, 12.25f, 11.8619f, 12.25f, 12f)
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
            moveTo(17f, 11.875f)
            verticalLineTo(12f)
            moveTo(17.25f, 12f)
            curveTo(17.25f, 12.1381f, 17.1381f, 12.25f, 17f, 12.25f)
            curveTo(16.8619f, 12.25f, 16.75f, 12.1381f, 16.75f, 12f)
            curveTo(16.75f, 11.8619f, 16.8619f, 11.75f, 17f, 11.75f)
            curveTo(17.1381f, 11.75f, 17.25f, 11.8619f, 17.25f, 12f)
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
            moveTo(7f, 11.875f)
            verticalLineTo(12f)
            moveTo(7.25f, 12f)
            curveTo(7.25f, 12.1381f, 7.13807f, 12.25f, 7f, 12.25f)
            curveTo(6.86193f, 12.25f, 6.75f, 12.1381f, 6.75f, 12f)
            curveTo(6.75f, 11.8619f, 6.86193f, 11.75f, 7f, 11.75f)
            curveTo(7.13807f, 11.75f, 7.25f, 11.8619f, 7.25f, 12f)
            close()
        }
        }.build()

        return _circleEllipsis!!
    }

private var _circleEllipsis: ImageVector? = null
