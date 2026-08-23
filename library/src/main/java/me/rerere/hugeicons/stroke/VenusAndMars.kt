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

val HugeIcons.VenusAndMars: ImageVector
    get() {
        if (_venusAndMars != null) {
            return _venusAndMars!!
        }
        _venusAndMars = ImageVector.Builder(
            name = "VenusAndMars",
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
            moveTo(13.5f, 11f)
            curveTo(13.5f, 13.2091f, 11.7091f, 15f, 9.5f, 15f)
            curveTo(7.29086f, 15f, 5.5f, 13.2091f, 5.5f, 11f)
            curveTo(5.5f, 8.79086f, 7.29086f, 7f, 9.5f, 7f)
            curveTo(11.7091f, 7f, 13.5f, 8.79086f, 13.5f, 11f)
            close()
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
            moveTo(12.5f, 8f)
            lineTo(18f, 2.5f)
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
            moveTo(9.5f, 15f)
            verticalLineTo(22f)
            moveTo(7f, 19.5f)
            horizontalLineTo(12f)
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
            moveTo(14f, 2.24891f)
            curveTo(14f, 2.24891f, 17.6909f, 1.68883f, 18.2511f, 2.24895f)
            curveTo(18.8112f, 2.80906f, 18.2511f, 6.5f, 18.2511f, 6.5f)
        }
        }.build()

        return _venusAndMars!!
    }

private var _venusAndMars: ImageVector? = null
