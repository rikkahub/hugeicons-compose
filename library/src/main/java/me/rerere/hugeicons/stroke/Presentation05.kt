package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation05: ImageVector
    get() {
        if (_presentation05 != null) {
            return _presentation05!!
        }
        _presentation05 = ImageVector.Builder(
            name = "Presentation05",
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
        moveTo(2.5f, 11f)
        curveTo(2.5f, 13.8284f, 2.5f, 15.2426f, 3.37868f, 16.1213f)
        curveTo(4.25736f, 17f, 5.67157f, 17f, 8.5f, 17f)
        horizontalLineTo(15.5f)
        curveTo(18.3284f, 17f, 19.7426f, 17f, 20.6213f, 16.1213f)
        curveTo(21.5f, 15.2426f, 21.5f, 13.8284f, 21.5f, 11f)
        verticalLineTo(8f)
        curveTo(21.5f, 5.17157f, 21.5f, 3.75736f, 20.6213f, 2.87868f)
        curveTo(19.7426f, 2f, 18.3284f, 2f, 15.5f, 2f)
        horizontalLineTo(8.5f)
        curveTo(5.67157f, 2f, 4.25736f, 2f, 3.37868f, 2.87868f)
        curveTo(2.5f, 3.75736f, 2.5f, 5.17157f, 2.5f, 8f)
        verticalLineTo(11f)
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

        return _presentation05!!
    }

private var _presentation05: ImageVector? = null
