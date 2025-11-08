package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InLove: ImageVector
    get() {
        if (_inLove != null) {
            return _inLove!!
        }
        _inLove = ImageVector.Builder(
            name = "InLove",
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
        moveTo(12.5f, 2.01228f)
        curveTo(12.3344f, 2.00413f, 12.1677f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.1368f, 21.8906f, 10.299f, 21.685f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
        curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9.5f)
        horizontalLineTo(8.70711f)
        curveTo(8.25435f, 9.5f, 7.82014f, 9.67986f, 7.5f, 10f)
        moveTo(14f, 9.5f)
        horizontalLineTo(15.2929f)
        curveTo(15.7456f, 9.5f, 16.1799f, 9.67986f, 16.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.8881f, 2.33117f)
        curveTo(16.8267f, 1.78287f, 17.6459f, 2.00383f, 18.138f, 2.35579f)
        curveTo(18.3398f, 2.50011f, 18.4406f, 2.57227f, 18.5f, 2.57227f)
        curveTo(18.5594f, 2.57227f, 18.6602f, 2.50011f, 18.862f, 2.35579f)
        curveTo(19.3541f, 2.00383f, 20.1733f, 1.78287f, 21.1119f, 2.33117f)
        curveTo(22.3437f, 3.05077f, 22.6224f, 5.42474f, 19.7812f, 7.42757f)
        curveTo(19.24f, 7.80905f, 18.9694f, 7.99979f, 18.5f, 7.99979f)
        curveTo(18.0306f, 7.99979f, 17.76f, 7.80905f, 17.2188f, 7.42757f)
        curveTo(14.3776f, 5.42474f, 14.6563f, 3.05077f, 15.8881f, 2.33117f)
        }
        }.build()

        return _inLove!!
    }

private var _inLove: ImageVector? = null
