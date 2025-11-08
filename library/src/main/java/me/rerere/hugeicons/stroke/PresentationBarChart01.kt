package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PresentationBarChart01: ImageVector
    get() {
        if (_presentationBarChart01 != null) {
            return _presentationBarChart01!!
        }
        _presentationBarChart01 = ImageVector.Builder(
            name = "PresentationBarChart01",
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
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        lineTo(5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 18f)
        lineTo(19f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 14.8284f, 2.5f, 16.2426f, 3.37868f, 17.1213f)
        curveTo(4.25736f, 18f, 5.67157f, 18f, 8.5f, 18f)
        horizontalLineTo(15.5f)
        curveTo(18.3284f, 18f, 19.7426f, 18f, 20.6213f, 17.1213f)
        curveTo(21.5f, 16.2426f, 21.5f, 14.8284f, 21.5f, 12f)
        verticalLineTo(8f)
        curveTo(21.5f, 5.17157f, 21.5f, 3.75736f, 20.6213f, 2.87868f)
        curveTo(19.7426f, 2f, 18.3284f, 2f, 15.5f, 2f)
        horizontalLineTo(8.5f)
        curveTo(5.67157f, 2f, 4.25736f, 2f, 3.37868f, 2.87868f)
        curveTo(2.5f, 3.75736f, 2.5f, 5.17157f, 2.5f, 8f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 13f)
        verticalLineTo(10f)
        moveTo(12f, 13f)
        verticalLineTo(7f)
        moveTo(16f, 13f)
        verticalLineTo(11f)
        }
        }.build()

        return _presentationBarChart01!!
    }

private var _presentationBarChart01: ImageVector? = null
