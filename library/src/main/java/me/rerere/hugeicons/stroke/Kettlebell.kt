package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kettlebell: ImageVector
    get() {
        if (_kettlebell != null) {
            return _kettlebell!!
        }
        _kettlebell = ImageVector.Builder(
            name = "Kettlebell",
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
        moveTo(17.0003f, 9f)
        curveTo(18.2118f, 6.13886f, 18.8204f, 5.15138f, 18.3298f, 4.0713f)
        curveTo(18.1796f, 3.74048f, 17.964f, 3.43972f, 17.6947f, 3.18507f)
        curveTo(16.0234f, 1.60498f, 7.97656f, 1.60498f, 6.30528f, 3.18507f)
        curveTo(6.03594f, 3.43972f, 5.82038f, 3.74048f, 5.67013f, 4.0713f)
        curveTo(5.17956f, 5.15138f, 5.78859f, 6.13886f, 7.00009f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        curveTo(7.58172f, 8f, 4f, 11.5817f, 4f, 16f)
        curveTo(4f, 17.8455f, 4.62489f, 19.545f, 5.67463f, 20.8985f)
        curveTo(6.39442f, 21.8266f, 7.06365f, 22f, 8.22111f, 22f)
        horizontalLineTo(15.7789f)
        curveTo(16.9363f, 22f, 17.6056f, 21.8266f, 18.3254f, 20.8985f)
        curveTo(19.3751f, 19.545f, 20f, 17.8455f, 20f, 16f)
        curveTo(20f, 11.5817f, 16.4183f, 8f, 12f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        horizontalLineTo(16.5f)
        moveTo(7.5f, 16f)
        horizontalLineTo(9f)
        }
        }.build()

        return _kettlebell!!
    }

private var _kettlebell: ImageVector? = null
