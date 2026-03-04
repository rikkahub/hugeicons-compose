package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Timeline: ImageVector
    get() {
        if (_timeline != null) {
            return _timeline!!
        }
        _timeline = ImageVector.Builder(
            name = "Timeline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(13.1046f, 22f, 14f, 21.1046f, 14f, 20f)
        curveTo(14f, 18.8954f, 13.1046f, 18f, 12f, 18f)
        curveTo(10.8954f, 18f, 10f, 18.8954f, 10f, 20f)
        curveTo(10f, 21.1046f, 10.8954f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(8.96243f, 2f, 6.5f, 4.46243f, 6.5f, 7.5f)
        curveTo(6.5f, 10.0176f, 8.1915f, 12.14f, 10.5f, 12.793f)
        lineTo(12f, 15f)
        lineTo(13.5f, 12.793f)
        curveTo(15.8085f, 12.14f, 17.5f, 10.0176f, 17.5f, 7.5f)
        curveTo(17.5f, 4.46243f, 15.0376f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        verticalLineTo(7.5f)
        lineTo(13.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 20f)
        horizontalLineTo(21f)
        moveTo(10f, 20f)
        horizontalLineTo(3f)
        }
        }.build()

        return _timeline!!
    }

private var _timeline: ImageVector? = null
