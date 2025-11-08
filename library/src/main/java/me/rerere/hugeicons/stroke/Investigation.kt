package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Investigation: ImageVector
    get() {
        if (_investigation != null) {
            return _investigation!!
        }
        _investigation = ImageVector.Builder(
            name = "Investigation",
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
        moveTo(19f, 9.5f)
        verticalLineTo(8.3f)
        curveTo(18.992f, 5.49713f, 18.9051f, 4.0112f, 17.967f, 3.05442f)
        curveTo(16.9332f, 2f, 15.2694f, 2f, 11.9416f, 2f)
        lineTo(10.0592f, 2f)
        curveTo(6.73147f, 2f, 5.0676f, 2f, 4.0338f, 3.05442f)
        curveTo(3f, 4.10883f, 3f, 5.80589f, 3f, 9.2f)
        lineTo(3f, 13.8f)
        curveTo(3f, 17.1941f, 3f, 18.8912f, 4.0338f, 19.9456f)
        curveTo(4.95155f, 20.8816f, 6.36586f, 20.9867f, 9f, 20.9985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6753f, 19.6886f)
        lineTo(21f, 22f)
        moveTo(20f, 16.5f)
        curveTo(20f, 14.0147f, 17.9853f, 12f, 15.5f, 12f)
        curveTo(13.0147f, 12f, 11f, 14.0147f, 11f, 16.5f)
        curveTo(11f, 18.9853f, 13.0147f, 21f, 15.5f, 21f)
        curveTo(17.9853f, 21f, 20f, 18.9853f, 20f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 11f)
        horizontalLineTo(10f)
        }
        }.build()

        return _investigation!!
    }

private var _investigation: ImageVector? = null
