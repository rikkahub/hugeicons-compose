package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Labs: ImageVector
    get() {
        if (_labs != null) {
            return _labs!!
        }
        _labs = ImageVector.Builder(
            name = "Labs",
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
        moveTo(17.5f, 21f)
        curveTo(15.567f, 21f, 14f, 19.433f, 14f, 17.5f)
        lineTo(14f, 3f)
        lineTo(21f, 3f)
        lineTo(21f, 17.5f)
        curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 3f)
        lineTo(13f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16.875f)
        curveTo(10f, 19.9126f, 8f, 21f, 6f, 21f)
        curveTo(4f, 21f, 2f, 19.9126f, 2f, 16.875f)
        curveTo(2f, 13.8374f, 6f, 10f, 6f, 10f)
        curveTo(6f, 10f, 10f, 13.8374f, 10f, 16.875f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 12f)
        curveTo(15.083f, 11.1336f, 16.2974f, 9.87843f, 17.771f, 10.7626f)
        curveTo(19.0014f, 11.5009f, 20.0342f, 10.7244f, 21f, 10f)
        }
        }.build()

        return _labs!!
    }

private var _labs: ImageVector? = null
