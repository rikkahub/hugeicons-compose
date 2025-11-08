package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BloodType: ImageVector
    get() {
        if (_bloodType != null) {
            return _bloodType!!
        }
        _bloodType = ImageVector.Builder(
            name = "BloodType",
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
        moveTo(3.5f, 13.678f)
        curveTo(3.5f, 9.49387f, 7.08079f, 5.35907f, 9.59413f, 2.97222f)
        curveTo(10.9591f, 1.67593f, 13.0409f, 1.67593f, 14.4059f, 2.97222f)
        curveTo(16.9192f, 5.35907f, 20.5f, 9.49387f, 20.5f, 13.678f)
        curveTo(20.5f, 17.7804f, 17.2812f, 22f, 12f, 22f)
        curveTo(6.71878f, 22f, 3.5f, 17.7804f, 3.5f, 13.678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15f)
        curveTo(9f, 15f, 9.3648f, 14.2616f, 9.84f, 13.3029f)
        moveTo(15f, 15f)
        curveTo(15f, 15f, 14.6352f, 14.2616f, 14.16f, 13.3029f)
        moveTo(9.84f, 13.3029f)
        curveTo(10.7194f, 11.5287f, 11.9768f, 9f, 12f, 9f)
        curveTo(12.0232f, 9f, 13.2806f, 11.5287f, 14.16f, 13.3029f)
        moveTo(9.84f, 13.3029f)
        horizontalLineTo(14.16f)
        }
        }.build()

        return _bloodType!!
    }

private var _bloodType: ImageVector? = null
