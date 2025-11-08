package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = ImageVector.Builder(
            name = "Octagon",
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
        moveTo(13.5145f, 2f)
        curveTo(14.7408f, 2f, 15.3539f, 2f, 15.9052f, 2.22836f)
        curveTo(16.4565f, 2.45672f, 16.8901f, 2.89027f, 17.7572f, 3.75736f)
        lineTo(20.2424f, 6.24264f)
        curveTo(21.1095f, 7.10973f, 21.5431f, 7.54328f, 21.7714f, 8.09459f)
        curveTo(21.9998f, 8.6459f, 21.9998f, 9.25903f, 21.9998f, 10.4853f)
        verticalLineTo(13.5147f)
        curveTo(21.9998f, 14.741f, 21.9998f, 15.3541f, 21.7714f, 15.9054f)
        curveTo(21.5431f, 16.4567f, 21.1095f, 16.8903f, 20.2425f, 17.7574f)
        lineTo(17.7572f, 20.2426f)
        curveTo(16.8901f, 21.1097f, 16.4565f, 21.5433f, 15.9052f, 21.7716f)
        curveTo(15.3539f, 22f, 14.7408f, 22f, 13.5145f, 22f)
        horizontalLineTo(10.4851f)
        curveTo(9.25887f, 22f, 8.64573f, 22f, 8.0944f, 21.7716f)
        curveTo(7.54308f, 21.5433f, 7.10953f, 21.1097f, 6.24244f, 20.2426f)
        lineTo(3.75729f, 17.7573f)
        curveTo(2.89023f, 16.8903f, 2.4567f, 16.4567f, 2.22835f, 15.9054f)
        curveTo(2f, 15.3541f, 2f, 14.741f, 2f, 13.5148f)
        verticalLineTo(10.4852f)
        curveTo(2f, 9.259f, 2f, 8.64589f, 2.22835f, 8.09458f)
        curveTo(2.4567f, 7.54328f, 2.89023f, 7.10974f, 3.75729f, 6.24265f)
        lineTo(6.24244f, 3.75743f)
        curveTo(7.10953f, 2.8903f, 7.54308f, 2.45674f, 8.0944f, 2.22837f)
        curveTo(8.64573f, 2f, 9.25887f, 2f, 10.4851f, 2f)
        horizontalLineTo(13.5145f)
        }
        }.build()

        return _octagon!!
    }

private var _octagon: ImageVector? = null
