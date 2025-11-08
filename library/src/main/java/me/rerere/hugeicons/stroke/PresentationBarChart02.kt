package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PresentationBarChart02: ImageVector
    get() {
        if (_presentationBarChart02 != null) {
            return _presentationBarChart02!!
        }
        _presentationBarChart02 = ImageVector.Builder(
            name = "PresentationBarChart02",
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
        moveTo(8.5f, 22f)
        lineTo(8.82821f, 21.6717f)
        curveTo(9.40628f, 21.0936f, 9.69532f, 20.8045f, 10.0629f, 20.6523f)
        curveTo(10.4305f, 20.5f, 10.8392f, 20.5f, 11.6568f, 20.5f)
        horizontalLineTo(12.343f)
        curveTo(13.1605f, 20.5f, 13.5692f, 20.5f, 13.9368f, 20.6522f)
        curveTo(14.3043f, 20.8045f, 14.5933f, 21.0935f, 15.1714f, 21.6716f)
        lineTo(15.4998f, 22f)
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

        return _presentationBarChart02!!
    }

private var _presentationBarChart02: ImageVector? = null
