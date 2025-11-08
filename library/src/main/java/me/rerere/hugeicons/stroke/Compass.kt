package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = ImageVector.Builder(
            name = "Compass",
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
        moveTo(12f, 3.5f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.7728f, 10.2571f)
        curveTo(15.5061f, 10.9837f, 14.3328f, 16.8933f, 13.1289f, 16.9974f)
        curveTo(12.1189f, 17.0848f, 11.8041f, 15.0928f, 11.5914f, 14.4614f)
        curveTo(11.3815f, 13.8383f, 11.1478f, 13.6139f, 10.5298f, 13.4095f)
        curveTo(8.95989f, 12.8901f, 8.17492f, 12.6304f, 8.0195f, 12.2192f)
        curveTo(7.60796f, 11.1304f, 13.8362f, 9.32902f, 14.7728f, 10.2571f)
        }
        }.build()

        return _compass!!
    }

private var _compass: ImageVector? = null
