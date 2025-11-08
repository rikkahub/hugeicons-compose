package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Orbit01: ImageVector
    get() {
        if (_orbit01 != null) {
            return _orbit01!!
        }
        _orbit01 = ImageVector.Builder(
            name = "Orbit01",
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
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6461f, 4.52795f)
        curveTo(18.2489f, 4.89346f, 18f, 5.41766f, 18f, 6f)
        curveTo(18f, 7.10457f, 18.8954f, 8f, 20f, 8f)
        curveTo(20.3793f, 8f, 20.7339f, 7.89441f, 21.0361f, 7.71103f)
        curveTo(21.6139f, 7.36038f, 22f, 6.72527f, 22f, 6f)
        curveTo(22f, 4.89543f, 21.1046f, 4f, 20f, 4f)
        curveTo(19.4778f, 4f, 19.0023f, 4.20016f, 18.6461f, 4.52795f)
        moveTo(18.6461f, 4.52795f)
        curveTo(16.8794f, 2.95541f, 14.5513f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.6625f, 21.9833f, 11.3289f, 21.9506f, 11f)
        }
        }.build()

        return _orbit01!!
    }

private var _orbit01: ImageVector? = null
