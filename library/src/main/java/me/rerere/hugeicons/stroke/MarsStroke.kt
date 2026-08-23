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

val HugeIcons.MarsStroke: ImageVector
    get() {
        if (_marsStroke != null) {
            return _marsStroke!!
        }
        _marsStroke = ImageVector.Builder(
            name = "MarsStroke",
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
            moveTo(20.4961f, 3.5f)
            lineTo(13.4961f, 10.5f)
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
            moveTo(20.6642f, 9f)
            curveTo(20.6642f, 9f, 21.411f, 4.07875f, 20.6642f, 3.33192f)
            curveTo(19.9173f, 2.58509f, 14.9961f, 3.33194f, 14.9961f, 3.33194f)
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
            moveTo(12.9961f, 5.5f)
            lineTo(18.4961f, 11f)
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
            moveTo(2.99609f, 15f)
            curveTo(2.99609f, 11.6863f, 5.68239f, 9f, 8.99609f, 9f)
            curveTo(12.3098f, 9f, 14.9961f, 11.6863f, 14.9961f, 15f)
            curveTo(14.9961f, 18.3137f, 12.3098f, 21f, 8.99609f, 21f)
            curveTo(5.68239f, 21f, 2.99609f, 18.3137f, 2.99609f, 15f)
            close()
        }
        }.build()

        return _marsStroke!!
    }

private var _marsStroke: ImageVector? = null
