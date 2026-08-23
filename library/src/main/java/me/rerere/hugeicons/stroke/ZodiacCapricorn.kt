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

val HugeIcons.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) {
            return _zodiacCapricorn!!
        }
        _zodiacCapricorn = ImageVector.Builder(
            name = "ZodiacCapricorn",
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
            moveTo(2.99979f, 4f)
            curveTo(4.62074f, 4f, 5.93478f, 5.31404f, 5.93478f, 6.935f)
            verticalLineTo(17.4783f)
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
            moveTo(5.93359f, 17.4783f)
            verticalLineTo(8.03271f)
            curveTo(5.93359f, 5.8055f, 7.7391f, 4f, 9.96631f, 4f)
            curveTo(12.1935f, 4f, 13.999f, 5.80551f, 13.999f, 8.03271f)
            verticalLineTo(17f)
            curveTo(13.999f, 18.6569f, 12.6559f, 20f, 10.999f, 20f)
        }

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
            moveTo(21f, 15.5f)
            curveTo(21f, 17.433f, 19.433f, 19f, 17.5f, 19f)
            curveTo(15.567f, 19f, 14f, 17.433f, 14f, 15.5f)
            curveTo(14f, 13.567f, 15.567f, 12f, 17.5f, 12f)
            curveTo(19.433f, 12f, 21f, 13.567f, 21f, 15.5f)
            close()
        }
        }.build()

        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
