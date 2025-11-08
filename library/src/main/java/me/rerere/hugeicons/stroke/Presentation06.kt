package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation06: ImageVector
    get() {
        if (_presentation06 != null) {
            return _presentation06!!
        }
        _presentation06 = ImageVector.Builder(
            name = "Presentation06",
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
        moveTo(3f, 17f)
        horizontalLineTo(21f)
        verticalLineTo(8f)
        curveTo(21f, 5.17157f, 21f, 3.75736f, 20.1213f, 2.87868f)
        curveTo(19.2426f, 2f, 17.8284f, 2f, 15f, 2f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 2f, 4.75736f, 2f, 3.87868f, 2.87868f)
        curveTo(3f, 3.75736f, 3f, 5.17157f, 3f, 8f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        horizontalLineTo(22f)
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
        moveTo(12f, 17.5f)
        verticalLineTo(22f)
        }
        }.build()

        return _presentation06!!
    }

private var _presentation06: ImageVector? = null
