package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CayanTower: ImageVector
    get() {
        if (_cayanTower != null) {
            return _cayanTower!!
        }
        _cayanTower = ImageVector.Builder(
            name = "CayanTower",
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
        moveTo(18f, 22f)
        curveTo(18f, 19.8333f, 16.4136f, 15.3f, 14.9492f, 12.5f)
        curveTo(13.4848f, 9.7f, 12.3765f, 4.33333f, 11.9697f, 2f)
        lineTo(6.47299f, 4f)
        curveTo(4.64237f, 9.5f, 8.48152f, 15.6f, 11.8984f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        horizontalLineTo(11.5f)
        moveTo(8f, 15.0185f)
        lineTo(10.5f, 15f)
        moveTo(7.5f, 12f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        lineTo(17.5719f, 4f)
        curveTo(18.5782f, 7f, 17.7186f, 10.362f, 15.9505f, 14.4155f)
        moveTo(6f, 22f)
        curveTo(6f, 20.2797f, 6.85094f, 17.152f, 8f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        lineTo(20f, 22f)
        }
        }.build()

        return _cayanTower!!
    }

private var _cayanTower: ImageVector? = null
