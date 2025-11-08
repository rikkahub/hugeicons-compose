package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Balloons: ImageVector
    get() {
        if (_balloons != null) {
            return _balloons!!
        }
        _balloons = ImageVector.Builder(
            name = "Balloons",
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
        moveTo(15.5f, 6.5f)
        curveTo(15.5f, 8.98528f, 13.933f, 11f, 12f, 11f)
        curveTo(10.067f, 11f, 8.5f, 8.98528f, 8.5f, 6.5f)
        curveTo(8.5f, 4.01472f, 10.067f, 2f, 12f, 2f)
        curveTo(13.933f, 2f, 15.5f, 4.01472f, 15.5f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 15.5f)
        curveTo(22f, 17.9853f, 20.433f, 20f, 18.5f, 20f)
        curveTo(16.567f, 20f, 15f, 17.9853f, 15f, 15.5f)
        curveTo(15f, 13.0147f, 16.567f, 11f, 18.5f, 11f)
        curveTo(20.433f, 11f, 22f, 13.0147f, 22f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9978f, 11f)
        curveTo(11.9978f, 11f, 12.6526f, 13f, 11.9985f, 15f)
        curveTo(10.4013f, 19.8831f, 12.0001f, 22f, 12.0001f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 20f)
        curveTo(18.5f, 20.5f, 18.4f, 21.6f, 18f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.5f)
        curveTo(2f, 17.9853f, 3.567f, 20f, 5.5f, 20f)
        curveTo(7.433f, 20f, 9f, 17.9853f, 9f, 15.5f)
        curveTo(9f, 13.0147f, 7.433f, 11f, 5.5f, 11f)
        curveTo(3.567f, 11f, 2f, 13.0147f, 2f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 20f)
        curveTo(5.5f, 20.5f, 5.6f, 21.6f, 6f, 22f)
        }
        }.build()

        return _balloons!!
    }

private var _balloons: ImageVector? = null
