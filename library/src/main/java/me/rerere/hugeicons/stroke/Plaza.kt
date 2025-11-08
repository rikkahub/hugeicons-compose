package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plaza: ImageVector
    get() {
        if (_plaza != null) {
            return _plaza!!
        }
        _plaza = ImageVector.Builder(
            name = "Plaza",
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
        moveTo(2f, 22f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        verticalLineTo(6.75122f)
        curveTo(4f, 6.12696f, 4f, 5.81484f, 4.16802f, 5.56401f)
        curveTo(4.33604f, 5.31317f, 4.63861f, 5.17359f, 5.24377f, 4.89441f)
        lineTo(9.74377f, 2.81844f)
        curveTo(11.2032f, 2.14517f, 11.9329f, 1.80854f, 12.4664f, 2.11279f)
        curveTo(13f, 2.41703f, 13f, 3.16977f, 13f, 4.67525f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 22f)
        verticalLineTo(11.2361f)
        curveTo(20f, 10.6347f, 20f, 10.334f, 19.8258f, 10.0923f)
        curveTo(19.6515f, 9.85065f, 19.3377f, 9.71617f, 18.7102f, 9.44721f)
        lineTo(13f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 9f)
        lineTo(9.5f, 9f)
        moveTo(7.5f, 13f)
        horizontalLineTo(9.5f)
        moveTo(7.5f, 17f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _plaza!!
    }

private var _plaza: ImageVector? = null
