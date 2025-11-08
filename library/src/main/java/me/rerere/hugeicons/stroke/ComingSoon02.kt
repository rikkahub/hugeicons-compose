package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComingSoon02: ImageVector
    get() {
        if (_comingSoon02 != null) {
            return _comingSoon02!!
        }
        _comingSoon02 = ImageVector.Builder(
            name = "ComingSoon02",
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
        moveTo(18.0104f, 7.48959f)
        lineTo(19.5f, 6f)
        moveTo(20.5f, 13.5f)
        curveTo(20.5f, 18.1944f, 16.6944f, 22f, 12f, 22f)
        curveTo(7.30558f, 22f, 3.5f, 18.1944f, 3.5f, 13.5f)
        curveTo(3.5f, 8.80558f, 7.30558f, 5f, 12f, 5f)
        curveTo(16.6944f, 5f, 20.5f, 8.80558f, 20.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        curveTo(8.96243f, 19f, 6.5f, 16.5376f, 6.5f, 13.5f)
        curveTo(6.5f, 10.4624f, 8.96243f, 8f, 12f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 2f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        lineTo(15.5f, 10f)
        }
        }.build()

        return _comingSoon02!!
    }

private var _comingSoon02: ImageVector? = null
