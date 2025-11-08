package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.React: ImageVector
    get() {
        if (_react != null) {
            return _react!!
        }
        _react = ImageVector.Builder(
            name = "React",
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
        moveTo(8.00001f, 12f)
        curveTo(8.00001f, 6.47715f, 9.79087f, 2f, 12f, 2f)
        curveTo(14.2091f, 2f, 16f, 6.47715f, 16f, 12f)
        curveTo(16f, 17.5228f, 14.2091f, 22f, 12f, 22f)
        curveTo(9.79087f, 22f, 8.00001f, 17.5228f, 8.00001f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.97531f, 8.61921f)
        curveTo(14.8173f, 5.85779f, 19.649f, 5.17014f, 20.7673f, 7.08331f)
        curveTo(21.8855f, 8.99648f, 18.8667f, 12.786f, 14.0247f, 15.5474f)
        curveTo(9.18271f, 18.3088f, 4.35098f, 18.9965f, 3.23277f, 17.0833f)
        curveTo(2.11455f, 15.1701f, 5.13329f, 11.3806f, 9.97531f, 8.61921f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0247f, 8.61921f)
        curveTo(18.8667f, 11.3806f, 21.8855f, 15.1701f, 20.7673f, 17.0833f)
        curveTo(19.649f, 18.9965f, 14.8173f, 18.3088f, 9.97531f, 15.5474f)
        curveTo(5.13329f, 12.786f, 2.11455f, 8.99648f, 3.23277f, 7.08331f)
        curveTo(4.35098f, 5.17014f, 9.18271f, 5.85779f, 14.0247f, 8.61921f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 12f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12f, 13.5f)
        curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
        curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12f, 10.5f)
        curveTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12f)
        }
        }.build()

        return _react!!
    }

private var _react: ImageVector? = null
