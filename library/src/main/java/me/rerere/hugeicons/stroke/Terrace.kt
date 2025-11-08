package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Terrace: ImageVector
    get() {
        if (_terrace != null) {
            return _terrace!!
        }
        _terrace = ImageVector.Builder(
            name = "Terrace",
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
        moveTo(3f, 14f)
        lineTo(4f, 19f)
        moveTo(4f, 19f)
        lineTo(3f, 22f)
        moveTo(4f, 19f)
        horizontalLineTo(6.65287f)
        curveTo(7.35734f, 19f, 7.52345f, 19.1407f, 7.63927f, 19.8356f)
        lineTo(8f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14f)
        lineTo(20f, 19f)
        moveTo(20f, 19f)
        lineTo(21f, 22f)
        moveTo(20f, 19f)
        horizontalLineTo(17.3471f)
        curveTo(16.6427f, 19f, 16.4765f, 19.1407f, 16.3607f, 19.8356f)
        lineTo(16f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.60045f, 7.40727f)
        curveTo(6.67011f, 6.43818f, 8.75263f, 4.89851f, 10.2888f, 3.36403f)
        curveTo(11.1992f, 2.45468f, 11.6543f, 2f, 12f, 2f)
        curveTo(12.3457f, 2f, 12.8008f, 2.45468f, 13.7112f, 3.36403f)
        curveTo(15.2474f, 4.89851f, 17.3299f, 6.43818f, 19.3995f, 7.40727f)
        curveTo(20.1034f, 7.73682f, 20.5328f, 8.14335f, 20.873f, 8.9348f)
        curveTo(21.1333f, 9.54022f, 21.0165f, 10f, 20.3071f, 10f)
        horizontalLineTo(3.69295f)
        curveTo(2.98348f, 10f, 2.86672f, 9.54022f, 3.12697f, 8.9348f)
        curveTo(3.46718f, 8.14335f, 3.89663f, 7.73683f, 4.60045f, 7.40727f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15f)
        horizontalLineTo(15f)
        }
        }.build()

        return _terrace!!
    }

private var _terrace: ImageVector? = null
