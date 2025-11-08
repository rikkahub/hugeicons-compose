package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Activity04: ImageVector
    get() {
        if (_activity04 != null) {
            return _activity04!!
        }
        _activity04 = ImageVector.Builder(
            name = "Activity04",
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
        moveTo(21.5f, 4.5f)
        curveTo(21.5f, 5.60457f, 20.6046f, 6.5f, 19.5f, 6.5f)
        curveTo(18.3954f, 6.5f, 17.5f, 5.60457f, 17.5f, 4.5f)
        curveTo(17.5f, 3.39543f, 18.3954f, 2.5f, 19.5f, 2.5f)
        curveTo(20.6046f, 2.5f, 21.5f, 3.39543f, 21.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.4711f, 9.40577f)
        curveTo(20.5f, 10.2901f, 20.5f, 11.3119f, 20.5f, 12.5f)
        curveTo(20.5f, 16.7426f, 20.5f, 18.864f, 19.182f, 20.182f)
        curveTo(17.864f, 21.5f, 15.7426f, 21.5f, 11.5f, 21.5f)
        curveTo(7.25736f, 21.5f, 5.13604f, 21.5f, 3.81802f, 20.182f)
        curveTo(2.5f, 18.864f, 2.5f, 16.7426f, 2.5f, 12.5f)
        curveTo(2.5f, 8.25736f, 2.5f, 6.13604f, 3.81802f, 4.81802f)
        curveTo(5.13604f, 3.5f, 7.25736f, 3.5f, 11.5f, 3.5f)
        curveTo(12.6881f, 3.5f, 13.7099f, 3.5f, 14.5942f, 3.52895f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 12.5f)
        horizontalLineTo(8f)
        lineTo(10f, 8.5f)
        lineTo(13f, 16.5f)
        lineTo(15f, 12.5f)
        horizontalLineTo(17.5f)
        }
        }.build()

        return _activity04!!
    }

private var _activity04: ImageVector? = null
