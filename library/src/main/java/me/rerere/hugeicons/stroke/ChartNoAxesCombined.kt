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

val HugeIcons.ChartNoAxesCombined: ImageVector
    get() {
        if (_chartNoAxesCombined != null) {
            return _chartNoAxesCombined!!
        }
        _chartNoAxesCombined = ImageVector.Builder(
            name = "ChartNoAxesCombined",
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
            moveTo(21f, 21f)
            verticalLineTo(9f)
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
            moveTo(15f, 21f)
            verticalLineTo(15f)
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
            moveTo(3f, 15f)
            lineTo(8.5f, 9.5f)
            curveTo(8.90894f, 9.09106f, 9.11341f, 8.88659f, 9.33398f, 8.77729f)
            curveTo(9.75364f, 8.56933f, 10.2464f, 8.56933f, 10.666f, 8.77729f)
            curveTo(10.8866f, 8.88659f, 11.0911f, 9.09106f, 11.5f, 9.5f)
            curveTo(11.9089f, 9.90894f, 12.1134f, 10.1134f, 12.334f, 10.2227f)
            curveTo(12.7536f, 10.4307f, 13.2464f, 10.4307f, 13.666f, 10.2227f)
            curveTo(13.8866f, 10.1134f, 14.0911f, 9.90894f, 14.5f, 9.5f)
            lineTo(21f, 3f)
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
            moveTo(9f, 21f)
            verticalLineTo(14f)
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
            moveTo(3f, 21f)
            verticalLineTo(19f)
        }
        }.build()

        return _chartNoAxesCombined!!
    }

private var _chartNoAxesCombined: ImageVector? = null
